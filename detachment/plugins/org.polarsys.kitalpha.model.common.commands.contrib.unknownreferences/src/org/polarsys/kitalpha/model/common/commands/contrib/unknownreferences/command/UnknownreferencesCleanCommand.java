/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.model.common.commands.contrib.unknownreferences.command;

import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DiagramPackage;
import org.eclipse.sirius.diagram.description.Layer;
import org.eclipse.sirius.diagram.description.filter.FilterDescription;
import org.eclipse.sirius.table.metamodel.table.DTable;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.eclipse.sirius.viewpoint.DView;
import org.polarsys.kitalpha.model.common.commands.action.ModelCommand;
import org.polarsys.kitalpha.model.common.commands.contrib.unknownreferences.Messages;
import org.polarsys.kitalpha.model.common.commands.exception.ModelCommandException;
import org.polarsys.kitalpha.model.common.scrutiny.analyzer.ModelScrutinyException;
import org.polarsys.kitalpha.model.common.scrutiny.contrib.unknownreferences.scrutinizes.InvalidDMapping;
import org.polarsys.kitalpha.model.common.scrutiny.contrib.unknownreferences.scrutinizes.InvalidDTable;
import org.polarsys.kitalpha.model.common.scrutiny.contrib.unknownreferences.scrutinizes.InvalidDView;
import org.polarsys.kitalpha.model.common.scrutiny.contrib.unknownreferences.scrutinizes.InvalidEReferences;
import org.polarsys.kitalpha.model.common.scrutiny.contrib.unknownreferences.scrutinizes.InvalidFilterDescription;
import org.polarsys.kitalpha.model.common.scrutiny.contrib.unknownreferences.scrutinizes.InvalidLayer;
import org.polarsys.kitalpha.model.common.scrutiny.contrib.unknownreferences.scrutinizes.MissingEPackage;
import org.polarsys.kitalpha.model.common.scrutiny.interfaces.IScrutinize;
import org.polarsys.kitalpha.model.common.scrutiny.registry.ModelScrutinyRegistry;
import org.polarsys.kitalpha.model.common.scrutiny.registry.ModelScrutinyRegistry.RegistryElement;

/**
 * @author Faycal Abka
 */
public class UnknownreferencesCleanCommand extends ModelCommand {
	
	Logger LOGGER = Logger.getLogger(UnknownreferencesCleanCommand.class);

	
	public UnknownreferencesCleanCommand() {
		//Do nothing
	}
	
	private ECrossReferenceAdapter installCrossReferencer(Resource resource){
		EList<Adapter> eAdapters = resource.getResourceSet().eAdapters();
		boolean containsECrossReferenceAdapter = false;
		
		for (Adapter adapter : eAdapters) {
			if (adapter instanceof ECrossReferenceAdapter){
				containsECrossReferenceAdapter = true;
				return (ECrossReferenceAdapter)adapter;
			}
		}
		
		if (!containsECrossReferenceAdapter){
			ECrossReferenceAdapter crossReferenceAdapter = new ECrossReferenceAdapter();
			resource.getResourceSet().eAdapters().add(crossReferenceAdapter);
			return crossReferenceAdapter;
		}
		//Should never occur
		return null;
	}
	

	@Override
	public void exec(ModelScrutinyRegistry analysis, Resource resource, IProgressMonitor monitor) 
			throws ModelCommandException {
		
		ECrossReferenceAdapter crossReferenceAdapter = installCrossReferencer(resource);
		TransactionalEditingDomain ed = TransactionUtil.getEditingDomain(resource.getResourceSet());
		
		try {
			
			//TODO check if the getAnalysisID() return null.
			RegistryElement regElt = analysis.getRegistryElement(getModelAnalysisID());

			
			monitor.beginTask(Messages.CLEAN_UNKNOWNREFERENCE_TASK, 1);
			for (IScrutinize finder : regElt.getFinders()) {
				
				//DRepresentationElement
				if (finder instanceof InvalidDMapping){
					monitor.subTask(Messages.CLEAN_INVALID_MAPPINGS);
					
					InvalidDMapping invalidDMappings = (InvalidDMapping) finder;
					for (DRepresentationElement dRepresentationElement : invalidDMappings.getAnalysisResult()) {
						if (ed != null){
							Command remove = RemoveCommand.create(ed, dRepresentationElement);
							if (remove.canExecute()){
								ed.getCommandStack().execute(remove);
							}
						} else {
							EcoreUtil.remove(dRepresentationElement);
						}
					}
				}
				
				//DView
				if (finder instanceof InvalidDView){
					monitor.subTask(Messages.CLEAN_INVALID_REPRESENTATION_CONTAINER);
					
					InvalidDView invalidDRepresentationContainer = (InvalidDView) finder;
					
					for (DView dRepresentationContainer : invalidDRepresentationContainer.getAnalysisResult()) {
						if (ed != null){
							Command remove = RemoveCommand.create(ed, dRepresentationContainer);
							if (remove.canExecute()){
								ed.getCommandStack().execute(remove);
							}
						} else {
							EcoreUtil.remove(dRepresentationContainer);
						}
					}
				}
				
				//FilterDescription
				if(finder instanceof InvalidFilterDescription){
					monitor.subTask(Messages.CLEAN_INVALID_FILTER_DESCRIPTION);
					InvalidFilterDescription invalidFilterDescription = (InvalidFilterDescription) finder;
					
					for (final FilterDescription filterDescription : invalidFilterDescription.getAnalysisResult()) {
						for (Setting setting : crossReferenceAdapter.getInverseReferences(filterDescription)) {
							if (setting.getEStructuralFeature().equals(DiagramPackage.eINSTANCE.getDDiagram_ActivatedFilters())) {
								final DDiagram dDiagram = (DDiagram) setting.getEObject();
								if (ed != null){
									Command remove = new RecordingCommand(ed) {
										@Override
										protected void doExecute() {
											dDiagram.getActivatedFilters().remove(filterDescription);
										}
									};
									if (remove.canExecute()){
										ed.getCommandStack().execute(remove);
									}
								} else {
									dDiagram.getActivatedFilters().remove(filterDescription);
								}
							}
						}
					}
				}
				
				//Layer
				if (finder instanceof InvalidLayer){
					monitor.subTask(Messages.CLEAN_INVALID_LAYER);
					InvalidLayer invalidLayer = (InvalidLayer) finder;
					
					for (final Layer layer : invalidLayer.getAnalysisResult()) {
						for (Setting setting : crossReferenceAdapter.getInverseReferences(layer)) {
							if (setting.getEStructuralFeature().equals(DiagramPackage.eINSTANCE.getDDiagram_ActivatedLayers())) {
								final DDiagram dDiagram = (DDiagram) setting.getEObject();
								if (ed != null){
									Command remove = new RecordingCommand(ed) {
										@Override
										protected void doExecute() {
											dDiagram.getActivatedLayers().remove(layer);
										}
									};
									if (remove.canExecute()){
										ed.getCommandStack().execute(remove);
									}
								} else {
									dDiagram.getActivatedLayers().remove(layer);
								}
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
						if (ed != null){
							final AnyType t = anyType;
							RecordingCommand cmd = new RecordingCommand(ed) {
								@Override
								protected void doExecute() {
									EcoreUtil.remove(t);									
								}
							};
							
							if (cmd.canExecute()){
								ed.getCommandStack().execute(cmd);
							}
						} else {
							EcoreUtil.delete(anyType, true);
						}
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
							clean(ed, key, r);
						}
					}
				}
				
				//Invalid DTables
				if (finder instanceof InvalidDTable) {
					monitor.subTask("Clean DTables");
					InvalidDTable invalidDTable = (InvalidDTable)finder;
					
					final Set<DTable> tables = invalidDTable.getAnalysisResult();
					
					if (ed != null) {
						RecordingCommand command = new RecordingCommand(ed) {
							@Override
							protected void doExecute() {
								deleteTables(tables);
							}
						};
						
						if (command.canExecute()) {
							ed.getCommandStack().execute(command);
						}
					} else {
						deleteTables(tables);
					}
					
				}
			}
			
		} catch (ModelScrutinyException e) {
			LOGGER.error(e.getMessage(), e);
		}
	
		monitor.worked(1);
		monitor.done();
	}


	private void deleteTables(final Set<DTable> tables) {
		for (DTable table : tables) {
			EcoreUtil.remove(table);
		}
	}
	
	private void clean(TransactionalEditingDomain ed, final EObject key, final EReference r) {
		final Object value = key.eGet(r);

		try {
			if (ed != null){

				RecordingCommand cmd = new RecordingCommand(ed) {

					@Override
					protected void doExecute() {
						if (r.isUnsettable()) {
							key.eUnset(r);
							EcoreUtil.delete((EObject) value);
						}
					}
				};

				if (cmd.canExecute()) {
					ed.getCommandStack().execute(cmd);
				}

			} else {
				key.eUnset(r);
				EcoreUtil.remove(key, r, value);
			}
		} catch (Exception e2){
			EReference eContainmentFeature = key.eContainmentFeature();
			if (eContainmentFeature != null && key.eContainer() != null && !key.equals(EcoreUtil.getRootContainer(key))){
				EcoreUtil.remove(key.eContainer(), eContainmentFeature, key);
			}
		}
	}
}
