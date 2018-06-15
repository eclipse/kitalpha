/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.desc.operation;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.desc.util.ECoreResourceManager;

/**
 * @author Boubekeur Zendagui
 */

public abstract class AbstractGenerationOperation  extends WorkspaceModifyOperation {

	protected String _projectName; 
	protected String _shortName;
	protected String _modelsFolder;
	protected String _modelExtension;
	protected Resource _ecoreResource = ECoreResourceManager.INSTANCE.getEcoreResource();
	protected IProgressMonitor _monitor = new NullProgressMonitor();
	
	public abstract String setupModelExtension();
	
	public AbstractGenerationOperation(String projectName, String shortName, String modelFolderName) {
		super();
		_projectName = projectName;
		_shortName = shortName;
		_modelsFolder = modelFolderName;
		_modelExtension = setupModelExtension();
	}
	
	protected void setMonitor(IProgressMonitor monitor) {
		if (monitor != null) {
			_monitor = monitor;
		}
	}
	
	public URI getModelUri(boolean resourceUri){
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(_projectName);
		IFile modelFile = (IFile) project.getFile(_modelsFolder + "/" + _shortName + "." + _modelExtension);
		URI modelURI = null;
		if (resourceUri) {
			modelURI = URI.createPlatformResourceURI(modelFile.getFullPath().toString(), false);
		} else {
			modelURI = URI.createPlatformPluginURI(modelFile.getFullPath().toString(), false);
		}
		
		if (modelURI != null) {
			return modelURI;
		} else {
			throw new RuntimeException("Can not create model URI");
		}
	}
}
