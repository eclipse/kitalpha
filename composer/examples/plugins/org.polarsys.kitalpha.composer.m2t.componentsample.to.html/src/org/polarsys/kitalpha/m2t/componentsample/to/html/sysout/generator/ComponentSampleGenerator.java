/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.m2t.componentsample.to.html.sysout.generator;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.polarsys.kitalpha.composer.api.Parameter;
import org.polarsys.kitalpha.composer.api.ParameterError;
import org.polarsys.kitalpha.composer.extension.points.IGenerator;
import org.polarsys.kitalpha.composer.metamodel.allocation.base.File;
import org.polarsys.kitalpha.composer.metamodel.allocation.base.Root;

import componentSampleAllocation.ComponentSampleFile;

/**
 * 
 * @author Faycal Abka
 *
 */
public class ComponentSampleGenerator implements IGenerator {

	public ComponentSampleGenerator() {
	}

	@Override
	public Map<String, Parameter> getParameters() {
		return null;
	}

	@Override
	public Map<String, ParameterError> validateParameters(
			Map<String, Parameter> valuedParameters_p) {
		return null;
	}

	@Override
	public void generateCode(Root allocRoot_p,
			Map<String, Parameter> generatorParams_p, IPath target_f) {
		
		HtmlDocGenerator genDoc = new HtmlDocGenerator();
		boolean isSingleFileStrategy = allocRoot_p.getOwnedFiles().size() == 1;
		
		for (File file : allocRoot_p.getOwnedFiles()){
			StringBuffer page = new StringBuffer();
			
			initHtmlHeader(file, page);
			genDoc.generate((ComponentSampleFile)file, target_f, page, isSingleFileStrategy);			
			createResource(file.getName(), target_f, page);
			setHtmlFooter(page);
		}
	}
	

	private void setHtmlFooter(StringBuffer page) {
		page.append("</body></html>");	
	}

	private void initHtmlHeader(File file, StringBuffer page) {
		String title = file.getName().substring(0, file.getName().lastIndexOf("."));
		
		page.append("<html><head><title>").append(title.replaceAll("\\.", " ")).append("</title></head><body>");
	}


	private void createResource(String name, IPath target_f, StringBuffer page) {
		IFolder folder = ResourcesPlugin.getWorkspace().getRoot().getFolder(target_f);
		
		if (folder.exists()){
			IFile file = folder.getFile(new Path(name));
			
			InputStream is = new ByteArrayInputStream(page.toString().getBytes());
			if (!file.exists()){
				try {
					file.create(is, true, new NullProgressMonitor());
					folder.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
				} catch (CoreException e) {
					e.printStackTrace();
				} finally {
					try {
						is.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			} else {
				try {
					file.setContents(is, true, false, new NullProgressMonitor());
					folder.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
				} catch (CoreException e) {
					e.printStackTrace();
				} finally {
					try {
						is.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

}
