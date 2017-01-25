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
package org.polarsys.kitalpha.model.common.scrutiny.contrib.modelresources.scrutinize;

import java.util.Collection;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.polarsys.kitalpha.model.common.scrutiny.interfaces.IScrutinize;
import org.polarsys.kitalpha.model.common.share.modelresources.exceptions.ModelResourceException;
import org.polarsys.kitalpha.model.common.share.modelresources.helpers.DetachmentHelper;
import org.polarsys.kitalpha.model.common.share.modelresources.impl.ModelResource;
import org.polarsys.kitalpha.model.common.share.modelresources.impl.ModelResources;
import org.polarsys.kitalpha.model.common.share.modelresources.interfaces.IModelResource;
import org.polarsys.kitalpha.model.common.share.modelresources.interfaces.IModelResources;
import org.polarsys.kitalpha.model.common.share.modelresources.interfaces.ModelResourceState;

/**
 * 
 * @author Faycal Abka
 *
 */

public class ModelResourcesScrutinizer implements IScrutinize<IModelResources, String> {
	
	
	Logger LOGGER = Logger.getLogger(ModelResourcesScrutinizer.class);
	

	private final IModelResources modelResources = new ModelResources();

	public ModelResourcesScrutinizer() {
	}

	
	public void findIn(EObject eObject) {


		URI eObjectURI = EcoreUtil.getURI(eObject);
		URI resourceURI = eObjectURI.trimFragment();


		try {

			IModelResource _modelResource = null;

			if (resourceURI != null && resourceURI.toString().isEmpty()){
				resourceURI = DetachmentHelper.getPlatformResourceURIFromEObject(eObject);
			}

			if (!resourceURI.toString().startsWith("http://")){
				_modelResource = modelResources.getModelResource(resourceURI);
			}


			if (eObject != null && eObject.eIsProxy()){ //unknown resource


				if (_modelResource == null){
					Map<EObject, Collection<Setting>> c = EcoreUtil.ExternalCrossReferencer.find(eObject);
					_modelResource = ModelResource.newResource(resourceURI, ModelResourceState.UnknownResource);
					getAnalysisResult().addResource(resourceURI, _modelResource);
				}

				_modelResource.addModelObject(eObject);

			} else { //Known resource
				if (_modelResource == null){

					if (resourceURI.toString().startsWith("http://")){
						resourceURI = DetachmentHelper.getPlatformURIFromNSURI(eObject.eResource().getURI().trimFragment());
					}
					//FIXME check resourceURI if it is null
					Map<EObject, Collection<Setting>> c = EcoreUtil.ExternalCrossReferencer.find(eObject);
					_modelResource = ModelResource.newResource(resourceURI, ModelResourceState.KnownResource);
					getAnalysisResult().addResource(resourceURI, _modelResource);
				}

				_modelResource.addModelObject(eObject);
			}

		} catch (ModelResourceException e) {
			LOGGER.warn(e.getMessage());
		}
	}

	
	public void findIn(Resource resource) {
	}

	public IModelResources getAnalysisResult() {
		return modelResources;
	}

	public String getFeedbackAnalysisMessages() {
		return null;
	}

}
