/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.af.dsl.generation.desc.internal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.ArchitectureFramework;
import org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.Viewpoints;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.event.AbstractGenerationEvent;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.event.listener.GenerationAdapter;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.event.type.ViewpointGenerationEndEvent;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.helper.pde.PDEUtility;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.helper.viewpoint.PlatformViewpointHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.helper.viewpoint.ViewpointGenerationHelper;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.helper.configuration.VpDslConfigurationHelper;

import org.polarsys.kitalpha.ad.af.coredomain.af.model.AF;

/**
 * This listener allows to manage Viewpoint generation 
 * @author Boubekeur Zendagui
 */
class VpGenerationListenerForOrchestration extends GenerationAdapter{
	
	private Stack<Viewpoint> _viewpointToGenerate = null;
	private List<Viewpoint> _viewpointToLink = null;
	private ArchitectureFramework _afSpecification = null;
	private String _afModelStringURI = null;
	
	private boolean _listenerIsActive = false;
	
	protected static final ViewpointGenerationHelper _generationHelper = new ViewpointGenerationHelper();
	
	private IProgressMonitor _monitor = new NullProgressMonitor();
	
	/**
	 * 
	 * @param viewpointToGenerate
	 * @param afSpecification
	 * @param afModelStringURI
	 * @param monitor
	 */
	public VpGenerationListenerForOrchestration(Stack<Viewpoint> viewpointToGenerate, 
												ArchitectureFramework afSpecification,
												String afModelStringURI,
												IProgressMonitor monitor) {
		_viewpointToGenerate = viewpointToGenerate;
		_viewpointToLink = new ArrayList<Viewpoint>();
		_viewpointToLink.addAll(viewpointToGenerate);
		_afSpecification = afSpecification;
		_afModelStringURI = afModelStringURI;
		_monitor = monitor;
		_listenerIsActive = true;
		
		Viewpoint vp = viewpointToGenerate.pop();
		_generationHelper.generateViewpoint(vp, monitor);
	}
	
	public void addViewpointToLink(Viewpoint viewpoint){
		if (_viewpointToLink.contains(viewpoint) == false)
			_viewpointToLink.add(viewpoint);
	}
	
	/**
	 * {@inheritDoc}
	 */
	public void generationEnd(AbstractGenerationEvent event) {
		if (_monitor.isCanceled()) 
			throw new OperationCanceledException();
		
		if (event instanceof ViewpointGenerationEndEvent)
		{
			if (_listenerIsActive && _viewpointToGenerate != null && _viewpointToGenerate.isEmpty() == false )
			{
				generateViewpoint();
			}
			else if ( _listenerIsActive )
			{
				updateAFRequiredBundles();
				patchAFModel();
			}
		}
	}
	
	/**
	 * Launch viewpoint generation.
	 */
	private void generateViewpoint(){
		Viewpoint viewpoint = _viewpointToGenerate.pop();
		_generationHelper.generateViewpoint(viewpoint, _monitor);
	}
	
	/**
	 * Update the manifest of the generated AF Plug-in 
	 */
	private void updateAFRequiredBundles(){
		List<String> reuiredBundlesToAdd = new ArrayList<String>();
		Viewpoints vps = _afSpecification.getAf_viewpoints();
		if (vps != null)
		{
			for (Viewpoint viewpoint : vps.getOwned_viewpoints()) 
			{
				String bundleID = EcoreUtil.getURI(getAFViewpoint(viewpoint)).segment(1);
				reuiredBundlesToAdd.add(bundleID);
			}
		}
		
		
		String[] segments = _afModelStringURI.split("/");
		String afBundleID = segments[1]; 
		IProject afProject = ResourcesPlugin.getWorkspace().getRoot().getProject(afBundleID);
		PDEUtility.updateRequiredBundles(afProject, reuiredBundlesToAdd, _monitor);
	}
	
	/**
	 * 
	 */
	private void patchAFModel(){
		// Load the resource in order to get the AF object
		ResourceSet resourceSet = new ResourceSetImpl();
		URI uri = URI.createPlatformResourceURI(_afModelStringURI, false);
		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.getResource(uri, true);

		if (resource.isLoaded() == false)
		{
			try {
				resource.load(Collections.EMPTY_MAP);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		EList<EObject> content = resource.getContents();
		AF af = null;
		if (content != null && content.size() > 0)
			af = (AF) content.get(0);
		
		
		// Link all viewpoint of _viewpointToGenerate
		if (af != null)
		{
			for (Viewpoint viewpoint : _viewpointToLink) 
			{
				org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint af_viewpoint = getAFViewpoint(viewpoint);
				af.getViewpoints().add(af_viewpoint);
			}
		}
		
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Look for the AF Viewpoint.
	 * @param viewpoint
	 * @return
	 */
	private org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint getAFViewpoint(Viewpoint viewpoint){
		String viewpointID = VpDslConfigurationHelper.getRootProjectName(viewpoint);
		return PlatformViewpointHelper.getAFViewpoint(viewpointID, null);
	}
}
