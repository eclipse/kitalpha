/*******************************************************************************
 * Copyright (c) 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.model.actions.contrib.unknownreferences.action;

import java.util.Iterator;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
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
import org.polarsys.kitalpha.model.actions.action.ModelAction;
import org.polarsys.kitalpha.model.actions.contrib.unknownreferences.Messages;
import org.polarsys.kitalpha.model.actions.exception.ModelActionException;
import org.polarsys.kitalpha.model.analysis.analyzer.Analyzer;
import org.polarsys.kitalpha.model.analysis.analyzer.ModelAnalyzerException;
import org.polarsys.kitalpha.model.analysis.contrib.unknownreferences.finders.InvalidDMapping;
import org.polarsys.kitalpha.model.analysis.contrib.unknownreferences.finders.InvalidDRepresentationContainer;
import org.polarsys.kitalpha.model.analysis.contrib.unknownreferences.finders.InvalidFilterDescription;
import org.polarsys.kitalpha.model.analysis.contrib.unknownreferences.finders.InvalidLayer;
import org.polarsys.kitalpha.model.analysis.contrib.unknownreferences.finders.MissingEPackage;
import org.polarsys.kitalpha.model.analysis.interfaces.IFinder;
import org.polarsys.kitalpha.model.analysis.registry.ModelAnalysisRegistry.RegistryElement;

/**
 * @author Faycal Abka
 */
public class UnknownreferencesCleaner extends ModelAction {
	
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
			throws ModelActionException {
		
		ECrossReferenceAdapter crossReferenceAdapter = installCrossReferencer(resource);
		
		try {
			
			//TODO check if the getAnalysisID() return null.
			RegistryElement regElt = Analyzer.getRegistryElement(getModelAnalysisID());

			
			monitor.beginTask(Messages.CLEAN_UNKNOWNREFERENCE_TASK, 1);
			for (IFinder finder : regElt.getFinders()) {
				
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
				
				
			}
			
		} catch (ModelAnalyzerException e) {
			e.printStackTrace();
			LOGGER.error(e.getMessage(), e);
		}
	
		monitor.worked(1);
		monitor.done();
	}

}
