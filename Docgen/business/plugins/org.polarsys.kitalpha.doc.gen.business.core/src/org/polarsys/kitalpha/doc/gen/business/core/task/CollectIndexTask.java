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
package org.polarsys.kitalpha.doc.gen.business.core.task;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.egf.ftask.producer.invocation.ITaskProduction;

public class CollectIndexTask implements ITaskProduction {

	private static final String INDEX_HTML = "index.html";

	public void doExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
		String projectName = productionContext.getInputValue("projectName",
				String.class);
		String outputFolderString = productionContext.getInputValue(
				"outputFolder", String.class);
		IPath outputFolderPath = new Path(projectName)
				.append(outputFolderString);
		IFolder outputFolder = ResourcesPlugin.getWorkspace().getRoot()
				.getFolder(outputFolderPath);
		List<String> domainList = new ArrayList<String>();
		if (outputFolder != null && outputFolder.exists()) {
			try {
				IResource[] members = outputFolder.members();
				for (IResource member : members) {
					if (member instanceof IFolder) {
						IFolder folder = (IFolder) member;
						IFile indexFile = folder.getFile(INDEX_HTML);
						if (indexFile != null && indexFile.exists()) {
							domainList.add(folder.getName());
						}
					}
				}
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		productionContext.setOutputValue("domainList", domainList);
	}

	public void postExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {

	}

	public void preExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {

	}

}
