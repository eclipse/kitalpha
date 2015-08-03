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

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.core.util.task;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.egf.ftask.producer.invocation.ITaskProduction;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.helper.pde.PDEUtility;

/**
 * @author Boubekeur Zendagui
 */
public class GenerationPluginActivatorTask  implements ITaskProduction{

	@Override
	public void doExecute(ITaskProductionContext productionContext, IProgressMonitor monitor) throws InvocationException {
		String pluginID = productionContext.getInputValue("plugin.id", String.class);
		// First: check if the plug-in exists. If no, throw an exception.
		final IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(pluginID);
		if (project.exists())
		{
			IFolder folder = project.getFolder("src");
			if (false == folder.exists())
			{
				try {
					folder.create(true, true, null);
				} catch (CoreException e) {
					throw new InvocationException("Can't create source folder", e);
				}
			}
			
			// Second: check if a package having as name the plug-in ID exists. If no, create it.
			IJavaProject javaProject = JavaCore.create(project);
			IPackageFragmentRoot srcFolder = javaProject.getPackageFragmentRoot(folder);
			final IPackageFragment packageFragment = srcFolder.getPackageFragment(pluginID);
			if ( false == packageFragment.exists())
			{
				try {
					srcFolder.createPackageFragment(pluginID, true, monitor);
				} catch (JavaModelException e) {
					throw new InvocationException("Can't create package " + pluginID, e);
				}
			}
			// Third: check if a Java class named Activator.java exists in this package. if no, create it.
			ICompilationUnit activatorClass = packageFragment.getCompilationUnit("Activator.java");
			if (false == activatorClass.exists())
			{
				try {
					activatorClass = packageFragment.createCompilationUnit("Activator.java", activatorClassContent(pluginID), true, monitor);
					PDEUtility.setActivator(project, pluginID +".Activator", monitor);
					List<String> dependecies = new ArrayList<String>();
					dependecies.add("org.eclipse.ui.workbench");
//					dependecies.add("org.eclipse.osgi");
					dependecies.add("org.eclipse.core.runtime");
					PDEUtility.updateManifestModel(project, dependecies, null, false, monitor);
				} catch (JavaModelException e) {
					throw new InvocationException("Can't create Activator in package " + pluginID, e);
				}
			}
		}
		else
		{
			throw new RuntimeException("The plugin " + pluginID + " doesn't exixts");
		}
		
	}
	
	/**
	 * Produce the Java content of an Java class activator
	 * @param pluginID the id of the plug-in
	 * @return Activator Java class content
	 */
	private static String activatorClassContent(String pluginID){
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy 'at' hh:mm:ss z");
		String genTime = sdf.format(cal.getTime());
		
		return "// Generated on " + genTime +" by Viewpoint DSL Generator V 0.5.1 \n" +
				"package " + pluginID +";\n" +
				"\n" +
				"import org.eclipse.ui.plugin.AbstractUIPlugin;\n" +
				"import org.osgi.framework.BundleContext;\n" +
				"\n" +
				"/**\n" +
				" * The activator class controls the plug-in life cycle\n" +
				" */\n" +
				"public class Activator extends AbstractUIPlugin {\n" +
				"\n" +
				"	// The plug-in ID\n" +
				"	public static final String PLUGIN_ID = \"" + pluginID +"\"; //$NON-NLS-1$\n" +
				"\n" +
				"	// The shared instance\n" +
				"	private static Activator plugin;\n" +
				"	\n" +
				"	/**\n" +
				"	 * The constructor\n" +
				"	 */\n" +
				"	public Activator() {\n" +
				"	}\n" +
				"\n" +
				"	/*\n" +
				"	 * (non-Javadoc)\n" +
				"	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)\n" +
				"	 */\n" +
				"	public void start(BundleContext context) throws Exception {\n" +
				"		super.start(context);\n" +
				"		plugin = this;\n" +
				"	}\n" +
				"\n" +
				"	/*\n" +
				"	 * (non-Javadoc)\n" +
				"	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)\n" +
				"	 */\n" +
				"	public void stop(BundleContext context) throws Exception {\n" +
				"		plugin = null;\n" +
				"		super.stop(context);\n" +
				"	}\n" +
				"\n" +
				"	/**\n" +
				"	 * Returns the shared instance\n" +
				"	 *\n" +
				"	 * @return the shared instance\n" +
				"	 */\n" +
				"	public static Activator getDefault() {\n" +
				"		return plugin;\n" +
				"	}\n" +
				"\n" +
				"}";
	}

	@Override
	public void postExecute(ITaskProductionContext productionContext, IProgressMonitor monitor) throws InvocationException {
	}
	@Override
	public void preExecute(ITaskProductionContext productionContext,IProgressMonitor monitor) throws InvocationException {
	}
}
