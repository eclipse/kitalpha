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

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.af.project;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.polarsys.kitalpha.ad.services.manager.ViewpointActivationException;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ViewpointFactory;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.helper.configuration.VpDslConfigurationHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.af.integration.AFIntegrationManager;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.provider.resourceimpl.ViewpointResourceProviderRegistry;
import org.polarsys.kitalpha.ad.viewpoint.ui.wizard.ProjectHelper;
import org.polarsys.kitalpha.resourcereuse.model.Location;

/**
 * @author Boubekeur Zendagui
 */

public class AfProjectManager {
	
	public static AfProjectManager INSTANCE = new AfProjectManager();
	
	private Viewpoint _vp = null;
	private String _vpURI = "";
	private IProject _project = null;
	
	protected String _vpName = "";  
	protected String _viewpointShortName = ""; 
	protected String _viewpointId = "";
	protected String _vpuuid = "";
	
	private Map<String, String> _javaRulesClasses = new HashMap<String, String>();
	
	public void unloadResource(){
		_vp = null;
		_project = null;
		_vpURI = "";
	}
	
	public Viewpoint getViewpoint() {
		return _vp;
	}

	public void setViewpoint(Viewpoint viewpoint) {
		this._vp = viewpoint;
		AFIntegrationManager.getInstance().setViewpoint(_vp);
	}
	
	public IProject getProject() {
		return _project;
	}

	public void setProject(IProject _project) {
		this._project = _project;
	}
	
	public void registerJavaRule(String id, String clazz){
		_javaRulesClasses.put(id, clazz);
	}
	
	public IProject createProject(String projectName, 
									String vpName, 
									String viewpointShortName, 
									String viewpointId, 
									IProgressMonitor monitor) throws CoreException, IOException{
		/* Tempo */
		this._vpName = vpName;
		this._viewpointShortName = viewpointShortName;
		this._viewpointId = viewpointId;
		/* Tempo */
		
		String afProjectName = projectName + ".af";
		
		if (monitor != null)
			monitor.beginTask("Creating artifacts for extension " + afProjectName, 4);
		
		// Creation of the AF model 
		_vpURI = '/' + afProjectName + "/model/" + viewpointShortName + ".vp";
		Viewpoint viewpoint = createOrGetAFViewpoint(viewpointId, vpName, viewpointShortName);
		IProject afProject = ResourcesPlugin.getWorkspace().getRoot().getProject(afProjectName);
		if (! afProject.exists())
			afProject = ProjectHelper.createProject(afProjectName, vpName, viewpointId, _vpuuid, _vpURI, monitor);
		
		if (monitor != null)
			monitor.done();
		
		// Set values for local properties
		setViewpoint(viewpoint);
		setProject(afProject);
		return afProject;
	}
	
	private Viewpoint createOrGetAFViewpoint(String viewpointID, String vpName, String viewpointShortName) throws CoreException{
		Viewpoint viewpoint = null;
		
		viewpoint = getExistingViewpoint(viewpointID);
		
		if (viewpoint == null)
			viewpoint = createAFModel(vpName, viewpointID);
		
		return viewpoint;
	}
	
	private Viewpoint getExistingViewpoint(String viewpointID){
		org.polarsys.kitalpha.resourcereuse.model.Resource[] viewpoints = ViewpointManager.getAvailableViewpoints();
		for (org.polarsys.kitalpha.resourcereuse.model.Resource resource : viewpoints) 
		{
			if (resource.getId().equals(viewpointID) && 
					resource.getProviderLocation().equals(Location.WORSPACE))
			{
				String Plugin_ID = resource.getPath().substring(0, resource.getPath().indexOf("#"));
				String resourcePath = "platform:/resource" + Plugin_ID;
				
				ResourceSet set = new ResourceSetImpl();
				URI uri = URI.createURI(resourcePath, false);
				Resource vpResource = set.getResource(uri ,true);
				if (vpResource.getContents() != null && vpResource.getContents().size() > 0)
				{
					EObject root = vpResource.getContents().get(0);
					if (root instanceof Viewpoint)
					{
						Viewpoint viewpoint = (Viewpoint) root;
						_vpuuid = viewpoint.getVpid();
						return viewpoint;
					}
				}
				else
				{
					// FIXME: We have to throw an exception --> OK 
					//		  || 
					//		  to create a new Viewpoint EObject --> KO ??
				}
			}
		}
		return null;
	}
	
	private Viewpoint createAFModel(String vpName, String viewpointID) throws CoreException {
		Viewpoint vp = ViewpointFactory.eINSTANCE.createViewpoint();
		vp.setId(viewpointID);
		vp.setName(vpName);
		_vpuuid = EcoreUtil.generateUUID();
		vp.setVpid(_vpuuid);
		return vp;
	}
	
	public void saveModel() throws CoreException, ViewpointActivationException {
		WorkspaceModifyOperation saveOperation = new WorkspaceModifyOperation() {
			@Override
			protected void execute(IProgressMonitor monitor) throws CoreException,
					InvocationTargetException, InterruptedException {
				Resource vpResource = _vp.eResource();
				if (vpResource == null)
				{
					ResourceSet set = new ResourceSetImpl();
					URI uri = URI.createPlatformResourceURI(_vpURI, false);
					vpResource = set.createResource(uri);
					vpResource.getContents().add(_vp);
				}
				
				if (vpResource != null)
				{
					try {
						vpResource.save(Collections.EMPTY_MAP);
					} catch (IOException e) {
						throw new RuntimeException("Can not save resource", e);
					}
				}
			}
		};
		
		try {
			saveOperation.run(null);
			ResourcesPlugin.getWorkspace().getRoot().refreshLocal(IResource.DEPTH_INFINITE, null);
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void regenerateBuildProperties(String projectName){
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		IFile xml = project.getFile("build.properties");
		StringBuffer contents = new StringBuffer();
		contents.append("source.. = src/"+"\n");
		contents.append("output.. = bin/"+"\n");
		contents.append("bin.includes = META-INF/,\\"+"\n");
		contents.append("               .,\\"+"\n");
		contents.append("               model/,\\"+"\n");
		contents.append("               icons/,\\"+"\n");
		contents.append("               plugin.xml"+"\n");
		try {
			xml.setContents(new ByteArrayInputStream(contents.toString().getBytes()), 0, null);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void regeneratePluginXML(String projectName){
		_vpURI = '/' + projectName + "/model/" + _viewpointShortName + ".vp";
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		IFile xml = project.getFile("plugin.xml");
		StringBuffer contents = new StringBuffer();
		boolean isVisible = isVisibleViewpoint();
		boolean isActivable = isActivableViewpoint();

		contents.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
		contents.append("<?eclipse version=\"3.4\"?>\n");
		contents.append("<plugin>\n");
		contents.append("	<extension\n");
		contents.append("	     point=\"org.eclipse.ui.views\">\n");
		contents.append("	  <view\n");
		contents.append("	        name=\"").append(_vpName).append("\"\n");
		contents.append("	        icon=\"icons/view.gif\"\n");
		contents.append("	        category=\"org.polarsys.kitalpha.view.category\"\n");
		contents.append("	        class=\"org.polarsys.kitalpha.ad.viewpoint.ui.views.ViewpointView\"\n");
		contents.append("	        id=\"").append(_viewpointId).append(".view\"\n");
		contents.append("	        resourceId=\"").append(_viewpointId).append("\"/>\n");
		contents.append("	</extension>\n");

		contents.append("	<extension\n");
		contents.append("	     point=\"org.polarsys.kitalpha.resourcereuse.resources\">\n");
		contents.append("	  <resource\n");
		
		contents.append("	        domain=\"AF\"\n");
		contents.append("	        id=\"").append(_viewpointId).append("\"\n");
		contents.append("	        tags=\"vp");
		if (!isVisible){
			//Add tag to resourcereuse to avoid the visiblity of viewpoint
			//in viewpoint manager: tags="vp,stateHidden"
			contents.append(",")
					.append(VpDslConfigurationHelper.VIEWPOINT_VISIBLITY_TAG);
		}
		if (isActivable){
			//Add tag to resourcereuse to add the ability to activate/deactivate the viewpoint
			//in viewpoint manager: tags="vp,stateMutableActivation"
			contents.append(",")
			.append(VpDslConfigurationHelper.VIEWPOINT_ACTIVABLE_TAG);
		}
		contents.append("\"\n");
		contents.append("	        name=\"").append(_vpName).append("\"\n");
		contents.append("	        path=\"").append(_vpURI).append('#').append(_vpuuid).append("\"/>\n");
		contents.append("	</extension>\n");
		
		contents.append("	<extension \n");
		contents.append("	     point=\"org.eclipse.ui.propertiesView\">\n");
		contents.append("	 	<excludeSources\n");
		contents.append("	    	id=\"").append(_viewpointId).append(".view\">\n");
		contents.append("	 	</excludeSources>\n");
     	contents.append("	</extension>\n");

		for (String iJavaRuleClass : _javaRulesClasses.keySet()) {
			contents.append("	<extension\n");
			contents.append("		point=\"org.polarsys.kitalpha.ad.viewpoint.javarules\">\n");
			contents.append("		<JavaRule\n");
			contents.append("			name=\""+iJavaRuleClass+"\"\n");
			contents.append("			class=\""+_javaRulesClasses.get(iJavaRuleClass).toString()+"\">\n");
			contents.append("		</JavaRule>\n");
			contents.append("	</extension>\n");
		}
		
		contents.append("</plugin>\n");
		contents.append("\n");
		try {
			if (! xml.exists())
				xml.create(new ByteArrayInputStream(contents.toString().getBytes()), 0, null);
			else
				xml.setContents(new ByteArrayInputStream(contents.toString().getBytes()), 0, null);
			
			xml.refreshLocal(IFile.DEPTH_ZERO, null);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private boolean isVisibleViewpoint(){
		org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint viewpoint = ViewpointResourceProviderRegistry.getInstance().getViewpoint();
		return VpDslConfigurationHelper.getViewpointVisibility(viewpoint);
	}
	
	private boolean isActivableViewpoint(){
		org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint viewpoint = ViewpointResourceProviderRegistry.getInstance().getViewpoint();
		return VpDslConfigurationHelper.isActivableViewpoint(viewpoint);
	}

}
