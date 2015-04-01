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

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.build.util;

import java.io.ByteArrayInputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;

/**
 * 
 * @author Amine Lajmi
 *
 */
public class PluginUtil {
	
	private static final NullProgressMonitor Null_Progress_Monitor = new NullProgressMonitor();  
	private static final String lineSeparator = "\n";

	public static void doCreateManifest(final IProject project, String lvpsShortName){
		StringBuilder appendable = new StringBuilder();
		appendable = createManifest(project, lvpsShortName);
		ByteArrayInputStream fileInputStream = new ByteArrayInputStream(appendable.toString().getBytes());
		try {
			IFolder metaFolder = project.getFolder("META-INF");
			IFile manifestFile = metaFolder.getFile("MANIFEST.MF");
			if (manifestFile.exists())
				manifestFile.setContents(fileInputStream, true, false, null);
			else
				manifestFile.create(fileInputStream, true, null);
			project.refreshLocal(IProject.DEPTH_INFINITE, Null_Progress_Monitor);
			} catch (CoreException e) {
			e.printStackTrace();
		}
	}
	
	public static StringBuilder createManifest(IProject project, String lvpsShortName){
		String projectName = project.getName();			
		StringBuilder appendable = new StringBuilder();
		appendable.append("Manifest-Version: 1.0").append(lineSeparator);
		appendable.append("Bundle-ManifestVersion: 2").append(lineSeparator);
		appendable.append("Bundle-Name: " + lvpsShortName + " Releng").append(lineSeparator);
		appendable.append("Bundle-SymbolicName: " + projectName + ";singleton:=true").append(lineSeparator);
		appendable.append("Bundle-Version: 1.0.0.qualifier").append(lineSeparator);
		appendable.append("Bundle-RequiredExecutionEnvironment: J2SE-1.5").append(lineSeparator);
		appendable.append("Bundle-Vendor: Polarsys").append(lineSeparator);
		return appendable;
	}
}
