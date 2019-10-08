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

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.af.reporter;

import java.io.ByteArrayInputStream;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.egf.model.pattern.PatternContext;
import org.eclipse.egf.model.pattern.PatternExecutionReporter;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.af.utils.AfConstants;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.common.java.JDTUtility;

/**
 * @author Boubekeur Zendagui
 */

public class RuleJavaClassReporter implements PatternExecutionReporter {

	@Override
	public void executionFinished(String output, PatternContext context) {
	}

	@Override
	public void loopFinished(String output, String outputWithCallBack,
			PatternContext context, Map<String, Object> parameterValues) {
		
		String ruleName = (String) context.getValue("ruleName");
		String projectName = (String) context.getValue(AfConstants.CONTRACT_PROJECT_NAME);
		
		if (ruleName == null || ruleName.length() == 0 || 
				projectName == null || projectName.length() == 0) {
			return;
		}
		
		String javaFile = JDTUtility.getValidClassName(ruleName) + ".java";
		String[] folders = (projectName+".businessrules").split("\\.");
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		
		if (! project.exists()) {
			return;
		}
		
		IFolder srcFolder = project.getFolder("src");
		if (! srcFolder.exists()) {
			return;
		}
		
		IFolder theFolder = srcFolder;
		for (String folder : folders) {
			theFolder = theFolder.getFolder(folder);
			if ( ! theFolder.exists()){
				try {
					theFolder.create(true, true, null);
				} catch (CoreException e) {
					e.printStackTrace();
				}
			}
		}
		
		IFile theFile = theFolder.getFile(javaFile);
		
		if (! theFile.exists()) {
			try {
				ByteArrayInputStream outputContent = new ByteArrayInputStream(output.getBytes());
				theFile.create(outputContent, true, null);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
	}

}
