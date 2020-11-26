/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.common.java;

import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.egf.model.pattern.PatternContext;
import org.eclipse.egf.model.pattern.PatternExecutionReporter;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.common.constant.Messages;

/**
 * @author Boubekeur Zendagui
 */

public class JavaClassReporter implements PatternExecutionReporter {

	public static final Integer dontSave	 	  	  = 0; //$NON-NLS-N$
	
	public static final Integer whenExecutionFinished = 1; //$NON-NLS-N$
	public static final Integer whenLoopFinished 	  = 2; //$NON-NLS-N$
	
	protected String collectedOutput = "";  //$NON-NLS-1$
	
	@Override
	public final void executionFinished(String output, PatternContext context) {
		Integer saveTime 	 = (Integer)context.getValue("savetime"); //$NON-NLS-1$
		if (saveTime == null || ! whenExecutionFinished.equals(saveTime)) {
			return;
		}
		
		// Get parameters values
		String  projectName = (String)context.getValue("projectname"); //$NON-NLS-1$
		String  packageName = (String)context.getValue("packagename"); //$NON-NLS-1$
		String  className 	 = (String)context.getValue("classname"); //$NON-NLS-1$
		
		// check if parameters have values
		if (projectName == null || projectName.trim().length() == 0) {
			throw new IllegalArgumentException(Messages.JavaReporter_Parameters_NameNotNull_Project);
		}
		if (packageName == null || packageName.trim().length() == 0) {
			throw new IllegalArgumentException(Messages.JavaReporter_Parameters_NameNotNull_Package);
		}
		if (className == null || className.trim().length() == 0) {
			throw new IllegalArgumentException(Messages.JavaReporter_Parameters_NameNotNull_Class);
		}
		
		// save java class
		if (collectedOutput != null && collectedOutput.trim().length() != 0){
			IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
			IFolder folder = JDTUtility.createOrGetPackageFolders(project, packageName);
			IFile file = folder.getFile(className+".java"); //$NON-NLS-1$
			JDTUtility.writeJavaContent(file, output);
		}
	}

	@Override
	public void loopFinished(String output, String outputWithCallBack,
			PatternContext context, Map<String, Object> parameterValues) {
		Integer saveTime 	 = (Integer)context.getValue("savetime"); //$NON-NLS-1$
		if (saveTime == null || ! whenLoopFinished.equals(saveTime)){
				collectedOutput = collectedOutput + output;
				return;
		}
		
		// Get parameters values
		String  projectName = (String)context.getValue("projectname"); //$NON-NLS-1$
		String  packageName = (String)context.getValue("packagename"); //$NON-NLS-1$
		String  className 	 = (String)context.getValue("classname"); //$NON-NLS-1$
		
		// check if parameters have values
		if (projectName == null || projectName.trim().length() == 0) {
			throw new IllegalArgumentException(Messages.JavaReporter_Parameters_NameNotNull_Project);
		}
		if (packageName == null || packageName.trim().length() == 0) {
			throw new IllegalArgumentException(Messages.JavaReporter_Parameters_NameNotNull_Package);
		}
		if (className == null || className.trim().length() == 0) {
			throw new IllegalArgumentException(Messages.JavaReporter_Parameters_NameNotNull_Class);
		}
		
		// save java class
		if (whenLoopFinished.equals(saveTime)){
			IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
			IFolder folder = JDTUtility.createOrGetPackageFolders(project, packageName);
			IFile file = folder.getFile(className+".java"); //$NON-NLS-1$
			
			String mergedcode = output;
			
			if (file.exists()) {
				mergedcode = JDTUtility.mergeJavaCode(file, output);
			}
			
			String codeWithCleanImportSction = JDTUtility.organizeImport(file, mergedcode);
			JDTUtility.writeJavaContent(file, codeWithCleanImportSction);
		}
	}
}
