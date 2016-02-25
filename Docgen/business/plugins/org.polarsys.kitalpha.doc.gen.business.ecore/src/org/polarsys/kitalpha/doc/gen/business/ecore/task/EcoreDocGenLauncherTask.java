/*******************************************************************************
 * Copyright (c) 2014 - 2016 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.doc.gen.business.ecore.task;

import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.egf.core.domain.TargetPlatformResourceSet;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.egf.ftask.producer.invocation.ITaskProduction;
import org.eclipse.egf.model.fcore.Activity;
import org.eclipse.egf.model.pattern.TypePatternSubstitution;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.polarsys.kitalpha.doc.gen.business.core.ui.helper.InvokeActivityHelper;
import org.polarsys.kitalpha.doc.gen.business.ecore.actions.GenDocCommand;
import org.polarsys.kitalpha.doc.gen.business.ecore.helpers.ResourceHelper;


/**
 * @author Boubkekeur Zendagui
 */
public class EcoreDocGenLauncherTask implements ITaskProduction {

	private String ecoreFilePath;
	private String outputDirectoryPath;
	private TypePatternSubstitution patternSub;
	private static final URI DEFAULT_ECORE_LAUNCHER_URI = 
			URI.createURI("platform:/plugin/org.polarsys.kitalpha.doc.gen.business.ecore/egf/EcoreDocGenLauncher.fcore#_oW26AYaqEeCqVPyWxeH-sg");
	
	
	private String copyright;
	private String logoPath;
	private String logoAlt;
	
	public void preExecute(ITaskProductionContext productionContext, IProgressMonitor monitor) throws InvocationException {
		ecoreFilePath = productionContext.getInputValue("ecoreFilePath", String.class);
		outputDirectoryPath = productionContext.getInputValue("outputDirectoryPath", String.class);
		patternSub = productionContext.getInputValue("pattern.substitutions", TypePatternSubstitution.class);
		
		copyright = productionContext.getInputValue(GenDocCommand.COPYRIGHT_CONTRACT_NAME, String.class);
		logoPath = productionContext.getInputValue(GenDocCommand.LOGO_PATH_CONTRACT_NAME, String.class);
		logoAlt = productionContext.getInputValue(GenDocCommand.LOGO_ALT_CONTRACT_NAME, String.class);
	}

	public void doExecute(ITaskProductionContext productionContext,	IProgressMonitor monitor) throws InvocationException {
		final IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		final URI ecoreURI = (root.getFile(new Path(ecoreFilePath)).exists() ? 
				URI.createPlatformResourceURI(ecoreFilePath, false) : URI.createPlatformPluginURI(ecoreFilePath, false));

		ResourceHelper.checkResource(outputDirectoryPath);
		final IPath outputLocation = root.getFolder(new Path(outputDirectoryPath)).getLocation();
		ResourceHelper.makeFolderWritable(root.getFolder(outputLocation));

		ResourceSet resourceSet = new TargetPlatformResourceSet();
		Resource semanticResource = resourceSet.getResource(ecoreURI, true);
		Activity launcher = InvokeActivityHelper.getActivity(DEFAULT_ECORE_LAUNCHER_URI);
		GenDocCommand command = new GenDocCommand(launcher, outputDirectoryPath, semanticResource, patternSub, monitor);
		command.setCopyright(copyright);
		command.setLogoAlt(logoAlt);
		command.setLogoPath(logoPath);
		command.execute(monitor);
	}

	public void postExecute(ITaskProductionContext productionContext, IProgressMonitor monitor) throws InvocationException {
		
	}

}
