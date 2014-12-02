/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
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
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.polarsys.kitalpha.model.common.commands.action.ModelCommand;
import org.polarsys.kitalpha.model.common.commands.exception.ModelCommandException;
import org.polarsys.kitalpha.model.common.scrutiny.analyzer.ModelScrutinyException;
import org.polarsys.kitalpha.model.common.scrutiny.analyzer.Scrutineer;
import org.polarsys.kitalpha.model.common.scrutiny.interfaces.IScrutinize;
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
	public void exec(Resource resource, IProgressMonitor monitor)
			throws ModelCommandException {
		
		try {
			RegistryElement regElt = Scrutineer.getRegistryElement(getModelAnalysisID());
			
			Collection<IScrutinize> scrutinzers = regElt.getFinders();
			
			final ResourceSet resourceSet = resource.getResourceSet();
			
			for (IScrutinize iScrutinize : scrutinzers) {
				
				IModelResources _modelResources = (IModelResources) iScrutinize.getAnalysisResult();
				List<IModelResource> candidates = _modelResources.getAllDeletionCandidates();
				
				for (IModelResource iModelResource : candidates) {
					
					Collection<EObject> resourceEObjects = iModelResource.getModelObjects();
					
					if (iModelResource.getResourceState().equals(ModelResourceState.KnownResource)){
						for (EObject eObject : resourceEObjects) {
							ECrossReferenceAdapter adapter = getECrossReferencerAdapterFor(eObject);

							if (adapter != null){
								Collection<Setting> settings = adapter.getInverseReferences(eObject);

								for (Setting setting : settings) {
									handleSetting(setting, eObject);
								}
							}
							EcoreUtil.delete(eObject);
						}
					} else {
						Map<EObject, Collection<Setting>> settings = EcoreUtil.UnresolvedProxyCrossReferencer.find(resource.getResourceSet());
						
						for (EObject eObject : resourceEObjects) {
							Collection<Setting> eObjectSettings = settings.get(eObject);
							
							for (Setting setting : eObjectSettings) {
								handleSetting(setting, eObject);
							}
							EcoreUtil.delete(eObject);
						}
					}
					removeUnloadResourceFromResourceSet(resourceSet, iModelResource.getResourceURI());
				}
			}
			
			
		} catch (ModelScrutinyException e) {
			e.printStackTrace();
		} catch (ModelResourceException e1) {
			e1.printStackTrace();
		}
	}

	private void removeUnloadResourceFromResourceSet(ResourceSet resourceSet, URI uri){
		Resource toDelete = resourceSet.getResource(uri, false);
		if (toDelete != null && toDelete.isLoaded()){
			resourceSet.getResources().remove(toDelete);
			toDelete.unload();
			toDelete = null;
		} else {
			
		}
	}
	
	/**
	 * remove the feature
	 * @param setting
	 */
	private void handleSetting(Setting setting, EObject eObject){
		EObject target = setting.getEObject();
		EStructuralFeature feature = setting.getEStructuralFeature();

		if (feature.isChangeable() || feature.isUnsettable()){
			EcoreUtil.remove(target, feature, eObject);
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
