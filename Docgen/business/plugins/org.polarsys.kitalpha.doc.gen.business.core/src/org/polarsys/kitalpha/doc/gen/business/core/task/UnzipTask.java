/*******************************************************************************
 * Copyright (c) 2014-2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.doc.gen.business.core.task;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.egf.ftask.producer.invocation.ITaskProduction;
import org.eclipse.emf.common.util.URI;
import org.polarsys.kitalpha.doc.gen.business.core.Activator;

public class UnzipTask implements ITaskProduction {
	private static final String TEMP_ZIP = "temp.zip";

	public void doExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
		URI uri = productionContext.getInputValue("zipFileURI", URI.class);
		String projectName = productionContext.getInputValue("projectName",
				String.class);
		String outputFolder = productionContext.getInputValue("outputFolder",
				String.class);

		try {
			URL url = new URL(uri.toString());
			InputStream input = url.openConnection().getInputStream();
			IPath outputFolderPath = new Path(projectName).append(outputFolder);
			IContainer folder = ResourcesPlugin.getWorkspace().getRoot()
					.getFolder(outputFolderPath).getParent();
			Path tempZipPath = new Path(TEMP_ZIP);
			IFile file = folder.getFile(tempZipPath);
			file.create(input, true, monitor);
			input.close();
			File javaFile = new File(file.getLocation().toOSString());
			final ZipFile zipFile = new ZipFile(javaFile);
			unzipZipResource(zipFile, folder.getLocation().toString());
			file.delete(true, monitor);
			folder.refreshLocal(IResource.DEPTH_INFINITE, monitor);
		} catch (MalformedURLException e) {
			Activator.logError(e.getMessage(), e);
		} catch (IOException e) {
			Activator.logError(e.getMessage(), e);
		} catch (CoreException e) {
			Activator.logError(e.getMessage(), e);
		}

	}

	public void postExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
		// No need for this step
	}

	public void preExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
		// No need for this step
	}

	private static void unzipZipResource(ZipFile zipFile, String destination) {
		Enumeration<? extends ZipEntry> entries;
		try {
			entries = zipFile.entries();

			while (entries.hasMoreElements()) {
				ZipEntry entry = entries.nextElement();
				String fileName = destination + "/" + entry.getName();
				if (entry.isDirectory()) {
					// Assume directories are stored parents first then
					// children.
					// This is not robust, just for demonstration purposes.
					new File(fileName).mkdirs();
					continue;
				}
				String name = entry.getName();
				int index = name.lastIndexOf('/');
				if (index != -1) {
					// make dirs
					String dirPath = name.substring(0, index);
					makeDir(destination + "/" + dirPath);
				}
				File output = new File(fileName);
				copyInputStream(zipFile.getInputStream(entry),
						new BufferedOutputStream(new FileOutputStream(output)));
			}
			zipFile.close();
		} catch (Exception ioe) {
			Activator.logError(ioe.getMessage(), ioe);
		}
	}

	private static boolean makeDir(String fileFullPath) {
		File dir = new File(fileFullPath);
		if (!dir.exists()) {
			return dir.mkdirs();
		}
		return true;
	}

	private static final void copyInputStream(InputStream in, OutputStream out)
			throws IOException {

		int read = in.read();
		while (read != -1) {
			out.write(read);
			read = in.read();
		}
		in.close();
		out.close();
	}

}
