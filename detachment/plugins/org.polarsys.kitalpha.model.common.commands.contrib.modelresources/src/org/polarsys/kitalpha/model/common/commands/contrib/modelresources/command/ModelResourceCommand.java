/*******************************************************************************
 * Copyright (c) 2014, 2017 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.model.common.commands.contrib.modelresources.command;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.sirius.business.api.resource.ResourceDescriptor;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.viewpoint.DAnalysis;
import org.polarsys.kitalpha.model.common.commands.action.ModelCommand;
import org.polarsys.kitalpha.model.common.commands.exception.ModelCommandException;
import org.polarsys.kitalpha.model.common.scrutiny.analyzer.ModelScrutinyException;
import org.polarsys.kitalpha.model.common.scrutiny.analyzer.Scrutineer;
import org.polarsys.kitalpha.model.common.scrutiny.interfaces.IScrutinize;
import org.polarsys.kitalpha.model.common.scrutiny.registry.ModelScrutinyRegistry;
import org.polarsys.kitalpha.model.common.scrutiny.registry.ModelScrutinyRegistry.RegistryElement;
import org.polarsys.kitalpha.model.common.share.modelresources.exceptions.ModelResourceException;
import org.polarsys.kitalpha.model.common.share.modelresources.interfaces.IModelResource;
import org.polarsys.kitalpha.model.common.share.modelresources.interfaces.IModelResources;
import org.polarsys.kitalpha.model.common.share.modelresources.interfaces.ModelResourceState;

public class ModelResourceCommand extends ModelCommand {

	public ModelResourceCommand() {
	}

	@SuppressWarnings("rawtypes")
	@Override
	public void exec(ModelScrutinyRegistry analysis, Resource resource, IProgressMonitor monitor)
			throws ModelCommandException {

		try {
			RegistryElement regElt = analysis.getRegistryElement(getModelAnalysisID());

			Collection<IScrutinize> scrutinzers = regElt.getFinders();

			Session session = SessionManager.INSTANCE.getExistingSession(resource.getURI());
			TransactionalEditingDomain ed = null;
			if (session != null){
				resource = session.getSessionResource(); //Replace session
				ed = session.getTransactionalEditingDomain();
			}
			if (ed == null){
				ed = TransactionUtil.getEditingDomain(resource.getResourceSet());
			}
			
			for (IScrutinize iScrutinize : scrutinzers) {

				IModelResources _modelResources = (IModelResources) iScrutinize.getAnalysisResult();
				List<IModelResource> candidates = _modelResources.getAllDeletionCandidates();
				if (ed == null){
					for (IModelResource iModelResource : candidates) {

						Collection<EObject> resourceEObjects = iModelResource.getModelObjects();
						if (iModelResource.getResourceState().equals(ModelResourceState.KnownResource)){
							knownResourcesDeletionEObjectAction(resourceEObjects);
						} else {
							unknownResourcesDeletionEObjectAction(resource, resourceEObjects);
						}
						removeUnloadResourceFromResourceSet(resource, iModelResource.getResourceURI());
					}
				} else {
					IModelResources _modelResources_ed = (IModelResources) iScrutinize.getAnalysisResult();
					List<IModelResource> candidates_ed = _modelResources_ed.getAllDeletionCandidates();

					for (IModelResource iModelResource : candidates_ed) {

						Collection<EObject> resourceEObjects = iModelResource.getModelObjects();
						if (iModelResource.getResourceState().equals(ModelResourceState.KnownResource)){
							knownResourcesDeletionEObjectAction(ed, resourceEObjects);
						} else {
							unknownResourcesDeletionEObjectAction(ed,resource, resourceEObjects);
						}
						removeUnloadResourceFromResourceSet(ed,resource, iModelResource.getResourceURI());
					}
				}
			}
		} catch (ModelScrutinyException e) {
			e.printStackTrace();
		} catch (ModelResourceException e1) {
			e1.printStackTrace();
		}
	}

	private void removeUnloadResourceFromResourceSet(TransactionalEditingDomain ed, Resource resource,
			URI uri) {
		unReferenceResourceFromPrimaryResource(ed, resource, uri);

		final ResourceSet resourceSet = resource.getResourceSet();

		Resource toDelete = resourceSet.getResource(uri, false);
		if (toDelete != null && toDelete.isLoaded()){
			resourceSet.getResources().remove(toDelete);
			toDelete = null;
		}
		
	}

	private void unReferenceResourceFromPrimaryResource(TransactionalEditingDomain ed, Resource resource, URI uri) {
		DAnalysis dAnalysis = findRootDAnalysis(resource);

		if (dAnalysis != null){
			removeSemanticDescriptor(ed, dAnalysis, uri);
		}
	}

	private void removeSemanticDescriptor(TransactionalEditingDomain ed, final DAnalysis analysis, URI uri) {
		EList<ResourceDescriptor> semanticResources = analysis.getSemanticResources();
		ResourceDescriptor target = null;
		
		for (ResourceDescriptor resourceDescriptor : semanticResources) {
			if (resourceDescriptor.getResourceURI().equals(uri)){
				target = resourceDescriptor;
				break;
			}
		}
		final ResourceDescriptor targetTmp = target;
		if (targetTmp != null){
			//FIXME: use Sirius RemoveSemanticResource command.
			//this is a workaround because we doesn't have a Session at this
			//point
			Command removeSemanticResource = new RecordingCommand(ed) {
				@Override
				protected void doExecute() {
					analysis.getSemanticResources().remove(targetTmp);
				}
			};
			if (removeSemanticResource.canExecute()){
				ed.getCommandStack().execute(removeSemanticResource);
			}
		}
		
		EList<DAnalysis> referencedAnalysis = analysis.getReferencedAnalysis();
		
		for (DAnalysis dAnalysis : referencedAnalysis) {
			removeSemanticDescriptor(ed, dAnalysis, uri);
		}
	}

	private void knownResourcesDeletionEObjectAction(TransactionalEditingDomain ed, Collection<EObject> resourceEObjects) {
		for (EObject eObject : resourceEObjects) {
			_knownResourcesDeletionEObjectAction(ed, eObject);
		}
	}

	private void _knownResourcesDeletionEObjectAction(TransactionalEditingDomain ed, EObject eObject) {
		ECrossReferenceAdapter adapter = getECrossReferencerAdapterFor(eObject);

		if (adapter != null){
			Collection<Setting> settings = adapter.getInverseReferences(eObject);

			for (Setting setting : settings) {
				handleSetting(ed, setting, eObject);
			}
		}
		deleteEObject(ed, eObject);
	}

	private void unknownResourcesDeletionEObjectAction(TransactionalEditingDomain ed, Resource resource, Collection<EObject> resourceEObjects) {
		Map<EObject, Collection<Setting>> settings = EcoreUtil.UnresolvedProxyCrossReferencer.find(resource.getResourceSet());

		for (EObject eObject : resourceEObjects) {
			Collection<Setting> eObjectSettings = settings.get(eObject);

			if (eObjectSettings != null){
				for (Setting setting : eObjectSettings) {
					handleSetting(ed, setting, eObject);
				}
			}
			deleteEObject(ed, eObject);
		}
	}

	private void deleteEObject(TransactionalEditingDomain ed, EObject eObject) {
		Command delete = DeleteCommand.create(ed, eObject);
		if (delete.canExecute()){
			ed.getCommandStack().execute(delete);
		}
	}

	private void handleSetting(TransactionalEditingDomain ed, Setting setting, EObject eObject) {
		if (setting.getEStructuralFeature().isChangeable()){
			if (!eObject.equals(EcoreUtil.getRootContainer(eObject))) {
				Command delete = DeleteCommand.create(ed, eObject);
				if (delete.canExecute()){
					ed.getCommandStack().execute(delete);
				}
			} 
		}
	}

	private void knownResourcesDeletionEObjectAction(Collection<EObject> resourceEObjects) {
		for (EObject eObject : resourceEObjects) {
			_knownResourcesDeletionEObjectAction(eObject);
		}
	}

	private void unknownResourcesDeletionEObjectAction(Resource resource, Collection<EObject> resourceEObjects) {
		Map<EObject, Collection<Setting>> settings = EcoreUtil.UnresolvedProxyCrossReferencer.find(resource.getResourceSet());

		for (EObject eObject : resourceEObjects) {
			Collection<Setting> eObjectSettings = settings.get(eObject);

			if (eObjectSettings != null){
				for (Setting setting : eObjectSettings) {
					handleSetting(setting, eObject);
				}
			}
			deleteEObject(eObject);
		}
	}

	private void _knownResourcesDeletionEObjectAction(EObject eObject) {

		ECrossReferenceAdapter adapter = getECrossReferencerAdapterFor(eObject);

		if (adapter != null){
			Collection<Setting> settings = adapter.getInverseReferences(eObject);

			for (Setting setting : settings) {
				handleSetting(setting, eObject);
			}
		}
		deleteEObject(eObject);
	}

	private void deleteEObject(EObject eObject) {
		EObject rootContainer = EcoreUtil.getRootContainer(eObject);
		if (!eObject.equals(rootContainer)){
			EcoreUtil.delete(eObject);
		}
	}

	/**
	 * @param resource is aird (primary resource)
	 * @param uri
	 */
	private void removeUnloadResourceFromResourceSet(Resource resource, URI uri){

		unReferenceResourceFromPrimaryResource(resource, uri);
		
		final ResourceSet resourceSet = resource.getResourceSet();

		Resource toDelete = resourceSet.getResource(uri, false);
		if (toDelete != null && toDelete.isLoaded()){
			resourceSet.getResources().remove(toDelete);
			toDelete.unload();
			toDelete = null;
		}
	}

	private void unReferenceResourceFromPrimaryResource(Resource resource, URI uri) {
		//Process only the representation for now
		DAnalysis dAnalysis = findRootDAnalysis(resource);
		
		if (dAnalysis != null){
			removeSemanticDescriptor(dAnalysis, uri);
		}
		
	}

	private DAnalysis findRootDAnalysis(Resource resource) {
		EList<EObject> contents = resource.getContents();
		
		for (EObject eObject : contents) {
			if (eObject instanceof DAnalysis)
				return (DAnalysis)eObject;
		}
		
		return null;
	}

	
	private void removeSemanticDescriptor(DAnalysis analysis, URI uri){
		EList<ResourceDescriptor> semanticResources = analysis.getSemanticResources();
		ResourceDescriptor target = null;
		
		for (ResourceDescriptor resourceDescriptor : semanticResources) {
			if (resourceDescriptor.getResourceURI().equals(uri)){
				target = resourceDescriptor;
				break;
			}
		}
		analysis.getSemanticResources().remove(target);
		
		EList<DAnalysis> referencedAnalysis = analysis.getReferencedAnalysis();
		
		for (DAnalysis dAnalysis : referencedAnalysis) {
			removeSemanticDescriptor(dAnalysis, uri);
		}
	}

	/**
	 * remove the feature
	 * @param setting
	 */
	private void handleSetting(Setting setting, EObject eObject){
		if (setting.getEStructuralFeature().isChangeable()){
			if (!eObject.equals(EcoreUtil.getRootContainer(eObject))) {
				EcoreUtil.remove(setting, eObject);
			} else {
				Resource eResource = eObject.eResource();
				if (eResource != null){
					eResource.getContents().remove(eObject);
				}
			}
		}
	}


	private ECrossReferenceAdapter getECrossReferencerAdapterFor(EObject eObject){
		EList<Adapter> adapters = eObject.eAdapters();

		for (Adapter adapter : adapters) {
			if (adapter instanceof ECrossReferenceAdapter)
				return (ECrossReferenceAdapter)adapter;
		}

		return installCrossReferencer(eObject);
	}


	private ECrossReferenceAdapter installCrossReferencer(EObject eObject){
		ECrossReferenceAdapter crossReferenceAdapter = new ECrossReferenceAdapter();

		eObject.eAdapters().add(crossReferenceAdapter);

		return crossReferenceAdapter;

	}
}
