/*******************************************************************************
 * Copyright (c) 2014, 2016 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.model.common.commands.contrib.unknownreferences.command;

import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DiagramPackage;
import org.eclipse.sirius.diagram.description.Layer;
import org.eclipse.sirius.diagram.description.filter.FilterDescription;
import org.eclipse.sirius.viewpoint.DRepresentationContainer;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.polarsys.kitalpha.model.common.commands.action.ModelCommand;
import org.polarsys.kitalpha.model.common.commands.contrib.unknownreferences.Messages;
import org.polarsys.kitalpha.model.common.commands.exception.ModelCommandException;
import org.polarsys.kitalpha.model.common.scrutiny.analyzer.ModelScrutinyException;
import org.polarsys.kitalpha.model.common.scrutiny.analyzer.Scrutineer;
import org.polarsys.kitalpha.model.common.scrutiny.contrib.unknownreferences.scrutinizes.InvalidDMapping;
import org.polarsys.kitalpha.model.common.scrutiny.contrib.unknownreferences.scrutinizes.InvalidDRepresentationContainer;
import org.polarsys.kitalpha.model.common.scrutiny.contrib.unknownreferences.scrutinizes.InvalidEReferences;
import org.polarsys.kitalpha.model.common.scrutiny.contrib.unknownreferences.scrutinizes.InvalidFilterDescription;
import org.polarsys.kitalpha.model.common.scrutiny.contrib.unknownreferences.scrutinizes.InvalidLayer;
import org.polarsys.kitalpha.model.common.scrutiny.contrib.unknownreferences.scrutinizes.MissingEPackage;
import org.polarsys.kitalpha.model.common.scrutiny.interfaces.IScrutinize;
import org.polarsys.kitalpha.model.common.scrutiny.registry.ModelScrutinyRegistry.RegistryElement;

/**
 * @author Faycal Abka
 */
public class UnknownreferencesCleaner extends ModelCommand {
	
	Logger LOGGER = Logger.getLogger(UnknownreferencesCleaner.class);

	
	public UnknownreferencesCleaner() {
	}
	
	
	private ECrossReferenceAdapter installCrossReferencer(Resource resource){
		ECrossReferenceAdapter crossReferenceAdapter = new ECrossReferenceAdapter();
		EList<Resource> resources = resource.getResourceSet().getResources();

		Iterator<Resource> it = resources.iterator();

		while(it.hasNext()){
			Resource resource2 = it.next();
			resource2.eAdapters().add(crossReferenceAdapter);
		}

		return crossReferenceAdapter;
		
	}
	

	@Override
	public void exec(Resource resource, IProgressMonitor monitor) 
			throws ModelCommandException {
		
		ECrossReferenceAdapter crossReferenceAdapter = installCrossReferencer(resource);
		
		try {
			
			//TODO check if the getAnalysisID() return null.
			RegistryElement regElt = Scrutineer.getRegistryElement(getModelAnalysisID());

			
			monitor.beginTask(Messages.CLEAN_UNKNOWNREFERENCE_TASK, 1);
			for (IScrutinize finder : regElt.getFinders()) {
				
				//DRepresentationElement
				if (finder instanceof InvalidDMapping){
					monitor.subTask(Messages.CLEAN_INVALID_MAPPINGS);
					
					InvalidDMapping invalidDMappings = (InvalidDMapping) finder;
					for (DRepresentationElement dRepresentationElement : invalidDMappings.getAnalysisResult()) {
						EcoreUtil.remove(dRepresentationElement);
					}
				}
				
				//DRepresentationContainer
				if (finder instanceof InvalidDRepresentationContainer){
					monitor.subTask(Messages.CLEAN_INVALID_REPRESENTATION_CONTAINER);
					
					InvalidDRepresentationContainer invalidDRepresentationContainer = (InvalidDRepresentationContainer) finder;
					
					for (DRepresentationContainer dRepresentationContainer : invalidDRepresentationContainer.getAnalysisResult()) {
						EcoreUtil.remove(dRepresentationContainer);
					}
				}
				
				//FilterDescription
				if(finder instanceof InvalidFilterDescription){
					monitor.subTask(Messages.CLEAN_INVALID_FILTER_DESCRIPTION);
					InvalidFilterDescription invalidFilterDescription = (InvalidFilterDescription) finder;
					
					for (FilterDescription filterDescription : invalidFilterDescription.getAnalysisResult()) {
						for (Setting setting : crossReferenceAdapter.getInverseReferences(filterDescription)) {
							if (setting.getEStructuralFeature().equals(DiagramPackage.eINSTANCE.getDDiagram_ActivatedFilters())) {
								DDiagram dDiagram = (DDiagram) setting.getEObject();
								dDiagram.getActivatedFilters().remove(filterDescription);
							}
						}
					}
				}
				
				//Layer
				if (finder instanceof InvalidLayer){
					monitor.subTask(Messages.CLEAN_INVALID_LAYER);
					InvalidLayer invalidLayer = (InvalidLayer) finder;
					
					for (Layer layer : invalidLayer.getAnalysisResult()) {
						for (Setting setting : crossReferenceAdapter.getInverseReferences(layer)) {
							if (setting.getEStructuralFeature().equals(DiagramPackage.eINSTANCE.getDDiagram_ActivatedLayers())) {
								DDiagram dDiagram = (DDiagram) setting.getEObject();
								dDiagram.getActivatedLayers().remove(layer);
							}
						}
					}
				}
				
				//EPackages
				if (finder instanceof MissingEPackage){
					monitor.subTask(Messages.CLEAN_MISSING_EPACKAGE);
					
					MissingEPackage missingEPackage = (MissingEPackage) finder;
					
					for (AnyType anyType : missingEPackage.getAnalysisResult().getAnyTypes()) {
						//TODO should use our own crossReferenceAdapter
						EcoreUtil.delete(anyType, true);
					}
					for (XMLResource xmlResource : missingEPackage.getAnalysisResult().getXmlResources()) {
						xmlResource.getEObjectToExtensionMap().clear();
					}
				}
				
				//Invalid EReferences
				if (finder instanceof InvalidEReferences){
					monitor.subTask("Clean Invalid EReferences");

					InvalidEReferences invalidEReferences = (InvalidEReferences)finder;

					for (Entry<EObject, List<EReference>> entry : invalidEReferences.getAnalysisResult().entrySet()) {
						EObject key = entry.getKey();
						List<EReference> eReferences = entry.getValue();

						for (EReference r : eReferences) {
							clean(key, r);
						}
					}
				}
				
				
			}
			
		} catch (ModelScrutinyException e) {
			e.printStackTrace();
			LOGGER.error(e.getMessage(), e);
		}
	
		monitor.worked(1);
		monitor.done();
	}
	
	private void clean(EObject key, EReference r) {
		Object value = key.eGet(r);
		try {
			EcoreUtil.remove(key, r, value);
		} catch (Exception e){
			//If we can't unset the reference, delete the holding
			//object.
			//XXX May be do it recursively until the success of clean operation
			try {
				EcoreUtil.delete(key);
			} catch (Exception e2){
				EReference eContainmentFeature = key.eContainmentFeature();
				if (eContainmentFeature != null && key.eContainer() != null && !key.equals(EcoreUtil.getRootContainer(key))){
					EcoreUtil.remove(key.eContainer(), eContainmentFeature, key);
				}
			}
		}
	}

}
