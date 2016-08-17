/*******************************************************************************
 * Copyright (c) 2014, 2016 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.af.integration;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.viewpoint.description.Group;

import org.polarsys.kitalpha.ad.integration.sirius.model.SiriusFactory;
import org.polarsys.kitalpha.ad.integration.sirius.model.SiriusRepresentation;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Metamodel;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Representation;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.RepresentationElement;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ViewpointFactory;

import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.af.integration.bundles.AFBundlesIntegration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.af.integration.exception.AFIntegrationException;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.af.integration.model.AFEcoreIntegration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.af.integration.model.AFRepresentationIntegration;

import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.helper.pde.PDEUtility;

/**
 * @author Boubekeur Zendagui
 */

public class AFIntegrationManager {
	
	private static AFIntegrationManager INSTANCE = new AFIntegrationManager();
	
	/**
	 * The use of this property is temporary. It is useful when an AF model is created. The 
	 * cause is the new model resource is not visible in the workspace ....
	 * It is not the case when the AF Model exists in the workspace before the generation 
	 * lunching. 
	 */
	private Viewpoint viewpoint = null;
	
	public static AFIntegrationManager getInstance(){
		if (INSTANCE == null)
			INSTANCE = new AFIntegrationManager();
		return INSTANCE;
	}
	
	/**
	 * 
	 * @return the value of the viewpoint property
	 */
	public Viewpoint getViewpoint() {
		return viewpoint;
	}

	/**
	 * Set the value of the viewpoint property.
	 * @param viewpoint the new value
	 */
	public void setViewpoint(Viewpoint viewpoint) {
		this.viewpoint = viewpoint;
	}
	
	/**
	 * This method allows to patch the Manifest of the AF Plugin. Patch Manifest means 
	 * add all registered bundles in the AFBundlesIntegration as required bundles to 
	 * the AF Plugin.
	 * 
	 * The AF Plugin and its Manifest are identified thanks to @param model_uri
	 * 
	 * Patch Manifest does'nt need to stop the AF Viewpoint. 
	 * 
	 * @param model_uri : The platform URI of the .vp model. URI is like: 
	 * 					  "platforme:/resource/PluginId/folders/model.vp" 
	 * @throws AFIntegrationException
	 */
	public void patchManifest(String model_uri) throws AFIntegrationException{
		URI uri = URI.createURI(model_uri);
		if (uri != null && uri.segments().length > 2)
		{
			String bundle_ID = uri.segment(1);
			doPatchManifest(bundle_ID);
		}
		else
			throw new AFIntegrationException(AFIntegrationException.Patch_Manifest);
	}
	
	/**
	 * This method allows to patch the Manifest of the AF Plugin. Patch Manifest means 
	 * add all registered bundles in the AFBundlesIntegration as required bundles to 
	 * the AF Plugin.
	 * 
	 * The AF Plugin and its Manifest are identified thanks to @param viewpoint
	 * 
	 * Patch Manifest does'nt need to stop the AF Viewpoint. 
	 * 
	 * @param viewpoint : an {@link Viewpoint} object
	 * @throws AFIntegrationException
	 */
	public void patchManifest(Viewpoint viewpoint) throws AFIntegrationException{
		EObject root = EcoreUtil.getRootContainer(viewpoint, true);
		if (root != null)
		{
			String bundle_ID = root.eResource().getURI().segment(1);
			doPatchManifest(bundle_ID);
		}
		else
			throw new AFIntegrationException(AFIntegrationException.Patch_Manifest);
		
	}
	
	/**
	 * Fire the Manifest Patching
	 * @param bundle_ID
	 * @throws AFIntegrationException
	 */
	private void doPatchManifest(String bundle_ID) throws AFIntegrationException{
		IProject af_project = null;
		if (bundle_ID != null && bundle_ID.trim().length() > 0)
		{
			af_project = ResourcesPlugin.getWorkspace().getRoot().getProject(bundle_ID);
			
			if (af_project.exists())
			{
				List<String> list = AFBundlesIntegration.getInstance().getRequiredBundles();
				if (list != null && ! list.isEmpty())
				{
					PDEUtility.updateRequiredBundles(af_project, list, null);
//					PDEUtility.updateExportNoInternalPackage(af_project, null);
				}
			}
		}
		else
			throw new AFIntegrationException(AFIntegrationException.AF_Bundle);

	}
	
	/**
	 * This method allows to patch the AF model. It add the registered EPackage as Meta-models 
	 * and the registered Sirius Group as Representation Elements
	 * 
	 * The AF Plugin and its Manifest are identified thanks to @param model_uri
	 * 
	 * Patch Model need to stop the AF Viewpoint it it is running. In this case, the AF Viewpoint 
	 * is started after the model patching finished  
	 *  
	 * @param model_uri
	 * @throws AFIntegrationException
	 */
	public void patchModel(String model_uri) throws AFIntegrationException {
		URI uri = URI.createURI(model_uri);
		ResourceSet rs = new ResourceSetImpl();
		Resource r = null;
		
		try {
			r = rs.getResource(uri, true);
		} catch (Exception e) {
			return;
		}
		
		Viewpoint vp = null;
		
		if (r.getContents() != null && r.getContents().size() > 0)
		{
			EObject root = r.getContents().get(0);
			if (root instanceof Viewpoint)
				vp = (Viewpoint) root;
			else
				throw new AFIntegrationException(AFIntegrationException.Patch_Model);
		}
		else
			if (this.viewpoint != null)
				vp = this.viewpoint;
		
		// Fire AF Model Patching
		if (vp != null)
			doPatchModel(vp);
		
		// Unload resources
		r = null;
		rs = null;
	}

	private void doPatchModel(Viewpoint viewpoint) throws AFIntegrationException {
		// Patch Meta-Models
		patchMetaModels(viewpoint);
		// Patch Representations
		patchRepresentations(viewpoint);
		// Save model 
		saveAFModel(viewpoint);
	}

	private void patchMetaModels(Viewpoint viewpoint){
		/** Check if there is a meta model element in the Viewpoint. 
		 *  If it is not the case then create one **/
		Metamodel metaModel = viewpoint.getMetamodel();
		if (metaModel == null)
		{
			metaModel = ViewpointFactory.eINSTANCE.createMetamodel();
			viewpoint.setMetamodel(metaModel);
		}
		
		/** Add registered ePackages to the Meta model list **/
		List<EPackage> epackage_list = AFEcoreIntegration.getInstance().getEPackageToRegister();
		for (EPackage ePackage : epackage_list) 
		{
			if (! isEPackageRegistered(metaModel, ePackage))
			{
				metaModel.getModels().add(ePackage);
			}
		}
	}
	
	private boolean isEPackageRegistered(Metamodel metaModel, EPackage ePackage){
		for (EPackage iEPackage : metaModel.getModels()) {
			if (iEPackage.getName().equals(ePackage.getName()) &&
					iEPackage.getNsURI().equals(ePackage.getNsURI()))
			{
				return true;
			}
		}
		return false;
	}
	
	private void patchRepresentations(Viewpoint viewpoint){
		/** Check if there is a representation element in the Viewpoint. 
		 *  If it is not the case then create one **/
		Representation representation = viewpoint.getRepresentation();
		if (representation == null)
		{
			representation = ViewpointFactory.eINSTANCE.createRepresentation();
			viewpoint.setRepresentation(representation);
		}
		
		/** Add registered Sirius Group to the representation list **/
		List<Group> representation_list = AFRepresentationIntegration.getInstance().getRepresentationToRegister();
		for (Group group : representation_list) 
		{
			if (!isRepresentationRegistered(representation, group))
			{
				SiriusRepresentation siriusRepresentation = SiriusFactory.eINSTANCE.createSiriusRepresentation();
				siriusRepresentation.setOdesign(group);
				representation.getRepresentations().add(siriusRepresentation);
			}
		}
	}
	
	private boolean isRepresentationRegistered(Representation representation, Group group){
		for (RepresentationElement iRepresentationElement : representation.getRepresentations()) {
			if (iRepresentationElement instanceof SiriusRepresentation)
			{
				Group iGroup = ((SiriusRepresentation)iRepresentationElement).getOdesign();
				if (iGroup.getName().equals(group.getName()) &&
						iGroup.eResource().getURI().toPlatformString(true).
										equals(group.eResource().getURI().toPlatformString(true)))
				{
					return true;
				}
			}
			
		}
		return false;
	}
	
	private void saveAFModel(Viewpoint viewpoint) throws AFIntegrationException{
		try {
			// Save the Resource containing the AF Model
			Resource resource = viewpoint.eResource();
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			throw new AFIntegrationException(AFIntegrationException.Patch_Model,
												AFIntegrationException.model_save_MSG,
												e.getStackTrace());
		}
	}
	

	/**
	 * Clear all components lists.  
	 */
	public void clearComponentsList(){
		viewpoint = null;
		AFEcoreIntegration.getInstance().getEPackageToRegister().clear();
		AFRepresentationIntegration.getInstance().getRepresentationToRegister().clear();
		AFBundlesIntegration.getInstance().getRequiredBundles().clear();
	}
	
}
