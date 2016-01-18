/*******************************************************************************
 * Copyright (c) 2016 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.releng.sonar;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.egf.model.pattern.PatternContext;
import org.eclipse.egf.pattern.ftask.tasks.DomainDrivenStrategyTask;

/**
 * @author Thomas Guiu
 * 
 */
public class SonarDomainDrivenStrategyTask extends DomainDrivenStrategyTask {

	public static final String OUTPUT_PROJECT = "Sonar_config";
	@Override
	public void preExecute(ITaskProductionContext context, IProgressMonitor monitor) throws InvocationException {
		super.preExecute(context, monitor);
		IProject project = getProject();
		if (!project.exists())
			try {
				project.create(monitor);
			} catch (CoreException e) {
				throw new InvocationException(e);
			}
		if (!project.isOpen())
			try {
				project.open(monitor);
			} catch (CoreException e) {
				throw new InvocationException(e);
			}
	}
	private IProject getProject() {
		return ResourcesPlugin.getWorkspace().getRoot().getProject(OUTPUT_PROJECT);
	}
	@Override
	protected void readContext(ITaskProductionContext context, PatternContext ctx) throws InvocationException {
		super.readContext(context, ctx);
		StringBuilder prop = null;
		ctx.setValue("properties", prop = new StringBuilder());
		ctx.setValue("modules", new ArrayList<String>());
		prop.append("sonar.projectKey=org.polarsys:org.polarsys.kitalpha").append("\n");
		prop.append("sonar.projectName=???").append("\n");
		prop.append("sonar.projectVersion=master").append("\n");
	}
	@Override
	protected void writeContext(ITaskProductionContext context, PatternContext ctx) throws InvocationException {
		super.writeContext(context, ctx);
		StringBuilder prop = (StringBuilder)ctx.getValue("properties");
		List<String> modules = (List<String>) ctx.getValue("modules");
		
		StringBuilder modulesStr = new StringBuilder();
		for (String module : modules)
		{
			if (modulesStr.length() != 0)
				modulesStr.append(',');
			modulesStr.append(module);
		}
		prop.append("sonar.modules=").append(modulesStr).append("\n");
		
		IFile file = getProject().getFile("sonar-project.properties");
		IPath fullPath = file.getRawLocation();
		try {
			FileWriter writer = new FileWriter(fullPath.toFile());
			writer.write(prop.toString());
			writer.close();
		} catch (IOException e) {
			throw new InvocationException(e);
		}
		
	}

}
