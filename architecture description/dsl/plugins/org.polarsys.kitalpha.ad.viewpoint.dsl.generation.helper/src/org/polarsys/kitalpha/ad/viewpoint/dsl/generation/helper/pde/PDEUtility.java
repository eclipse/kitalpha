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

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.helper.pde;

import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.pde.core.IBaseModel;
import org.eclipse.pde.core.build.IBuild;
import org.eclipse.pde.core.build.IBuildEntry;
import org.eclipse.pde.core.build.IBuildModel;
import org.eclipse.pde.internal.core.ICoreConstants;
import org.eclipse.pde.internal.core.ibundle.IBundle;
import org.eclipse.pde.internal.core.ibundle.IBundlePluginModelBase;
import org.eclipse.pde.internal.core.text.build.BuildModelFactory;
import org.eclipse.pde.internal.ui.util.ModelModification;
import org.eclipse.pde.internal.ui.util.PDEModelUtility;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.osgi.framework.Constants;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.helper.Activator;

/**
 * @author Boubekeur Zendagui
 */

@SuppressWarnings("restriction")
public class PDEUtility {
	
	private static final Object bundleLock = new Object();
	
	private static final NullProgressMonitor Null_Progress_Monitor = new NullProgressMonitor();  
	
	/***********************************
	 **** Plugin.xml Update Section ****  
	 ***********************************/
	
	public static void updatePluginXml(final IProject project, final String content) throws InvocationTargetException, InterruptedException{

		WorkspaceModifyOperation operation = new WorkspaceModifyOperation() {
			@Override
			protected void execute(IProgressMonitor monitor) throws CoreException,
			InvocationTargetException, InterruptedException {
				ByteArrayInputStream outputContent = new ByteArrayInputStream(content.getBytes());
				try {
					IFile file = project.getFile("plugin.xml");
					if (file.exists())
						file.setContents(outputContent, true, false, null);
					else
						file.create(outputContent, true, null);

				} catch (CoreException e) {
					e.printStackTrace();
				}
			}
		};
		operation.run(Null_Progress_Monitor);
		
		try {
			project.refreshLocal(IProject.DEPTH_INFINITE, Null_Progress_Monitor);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}
	
	/******************************
	 **** Build Update Section ****  
	 *****************************/
	
	public static void updateBuild_BinInclude(final IProject project, 
										final String entry,
										final boolean isFolder,
										final IProgressMonitor monitor){
		List<String> entries = new ArrayList<String>();
		entries.add(entry);
		
		if ( isFolder )
			updateBuild_BinInclude(project, entries, null , monitor); 
		else
			updateBuild_BinInclude(project, null, entries, monitor);
		
	}

	public static void updateBuild_BinInclude(final IProject project, 
											final List<String> folders,
											final List<String> files,
											final IProgressMonitor monitor){
		if (project == null)
		{
			return;
		}

		synchronized (bundleLock) {
			IFile build = project.getFile(ICoreConstants.BUILD_FILENAME_DESCRIPTOR);
			
			if (!build.exists())
			{
				try {
					build.create(new ByteArrayInputStream("".getBytes()), true, monitor);
				} catch (CoreException e) {
					e.printStackTrace();
				}
			}
			
			PDEModelUtility.modifyModel(new ModelModification(build) {
				@Override
				protected void modifyModel(IBaseModel model, IProgressMonitor innerMonitor) throws CoreException {
					if (!(model instanceof IBuildModel)) 
					{
						return;
					}
					
					IBuildModel buildModel = (IBuildModel) model;
					IBuild build = buildModel.getBuild();
					
					IBuildEntry binInclude = build.getEntry(IBuildEntry.BIN_INCLUDES);
					
					if (binInclude == null)
					{
						binInclude = new BuildModelFactory(buildModel).createEntry(IBuildEntry.BIN_INCLUDES);
						build.add(binInclude);
					}
					
					if (folders != null)
					{
						for (String folder : folders) 
						{
							folder += "/";
							if (!binInclude.contains(folder))
							{
								binInclude.addToken(folder);
							}
						}
					}
					
					if (files != null)
					{
						for (String file : files) 
						{
							if (!binInclude.contains(file))
							{
								binInclude.addToken(file);
							}
						}
					}
				}
			}, monitor);
		}
	}
	
	/*******************************
	 ** Manifest Update Section ****  
	 ******************************/
	
	public static void setActivator(IProject project, final String activatorClassFQN, IProgressMonitor monitor){
		if (project == null)
		{
			return;
		}
		
		synchronized (bundleLock) {
			IFile	manifest = project.getFile(ICoreConstants.BUNDLE_FILENAME_DESCRIPTOR);
			PDEModelUtility.modifyModel(new ModelModification(manifest) {
				@Override
				protected void modifyModel(IBaseModel model, IProgressMonitor innerMonitor) throws CoreException {
					if (!(model instanceof IBundlePluginModelBase))
					{
						return;
					}

					IBundlePluginModelBase bundleModel = (IBundlePluginModelBase) model;
					IBundle bundle = bundleModel.getBundleModel().getBundle();

					// update required execution environment
					if (activatorClassFQN != null && activatorClassFQN.trim().length() > 0)
					{
						bundle.setHeader(Constants.BUNDLE_ACTIVATOR, activatorClassFQN);
					}
					else
					{
						throw new RuntimeException("Activator Java Class can't be null or empty");
					}
				}
			}, monitor);
		}
	}
	
	
	/**
	 * 
	 * @param project
	 * @param requiredBundlesToAdd
	 * @param monitor
	 */
	public static void updateRequiredBundles(IProject project, 
											 List<String> requiredBundlesToAdd,
											 IProgressMonitor monitor){
		updateManifestModel(project, requiredBundlesToAdd, null, false, monitor);
	}
	
	public static void updateRequiredBundles(IProject project, 
											 String requiredBundleToAdd,
											 IProgressMonitor monitor){
		List<String> requiredBundlesToAdd = new ArrayList<String>();
		requiredBundlesToAdd.add(requiredBundleToAdd);
		updateManifestModel(project, requiredBundlesToAdd, null, false, monitor);
	}
	
	/**
	 * Remove a list of plug-in dependencies from required bundles
	 * @param project
	 * @param requiredBundlesToRemove
	 * @param monitor
	 */
	public static void removeRequiredBundles(IProject project, 
											List<String> requiredBundlesToRemove,
											IProgressMonitor monitor){
		updateManifestModel2(project, requiredBundlesToRemove, false, monitor);
	}

	/**
	 * Remove one plug-in dependency from required bundles
	 * @param project
	 * @param requiredBundleToRemove
	 * @param monitor
	 */
	public static void removeRequiredBundles(IProject project, 
											 String requiredBundleToRemove,
											 IProgressMonitor monitor){
		List<String> requiredBundlesToRemove = new ArrayList<String>();
		requiredBundlesToRemove.add(requiredBundleToRemove);
		updateManifestModel2(project, requiredBundlesToRemove, false, monitor);
	}

	/**
	 * 
	 * @param project
	 * @param executionEnv
	 * @param monitor
	 */
	public static void updateRequiredExecutionEnv(IProject project, 
												  RequiredExecutionEnvironment executionEnv,
												  IProgressMonitor monitor){
		updateManifestModel(project, null, executionEnv, false, monitor);
	}
	
	/**
	 * 
	 * @param project
	 * @param monitor
	 */
	public static void updateExportNoInternalPackage(IProject project,
												             IProgressMonitor monitor){
		updateManifestModel(project, null, null, true, monitor);
	}

	
	/**
	 * Add bundles in required bundles, package in exported packages and set required execution environment
	 * @param project
	 * @param requiredBundlesToAdd
	 * @param requiredExecutionEnvironment
	 * @param exportNoInternalPackages
	 * @param monitor
	 */
	public static void updateManifestModel(final IProject project, 
								final List<String> requiredBundlesToAdd,
								final RequiredExecutionEnvironment requiredExecutionEnvironment,
								final boolean exportNoInternalPackages,
								final IProgressMonitor monitor){
		if (project == null)
		{
			return;
		}
		
		synchronized (bundleLock) {
			IFile	manifest = project.getFile(ICoreConstants.BUNDLE_FILENAME_DESCRIPTOR);
			PDEModelUtility.modifyModel(new ModelModification(manifest) {
				@Override
				protected void modifyModel(IBaseModel model, IProgressMonitor innerMonitor) throws CoreException {
					if (!(model instanceof IBundlePluginModelBase))
					{
						return;
					}

					IBundlePluginModelBase bundleModel = (IBundlePluginModelBase) model;
					IBundle bundle = bundleModel.getBundleModel().getBundle();

					// update required bundles
					if (requiredBundlesToAdd != null && requiredBundlesToAdd.size() > 0)
					{
						String availableRequiredBundles = bundle.getHeader(Constants.REQUIRE_BUNDLE);
						String newRequiredBundles = mergeRequiredBundles(availableRequiredBundles, requiredBundlesToAdd);
						bundle.setHeader(Constants.REQUIRE_BUNDLE, newRequiredBundles);
					}

					// update required execution environment
					if (requiredExecutionEnvironment != null)
					{
						bundle.setHeader(Constants.BUNDLE_REQUIREDEXECUTIONENVIRONMENT, requiredExecutionEnvironment.toString());
					}

					// Export all non internal Java Packages.
					if (exportNoInternalPackages)
					{
						final List<String> allJavaPackages = getJavaPackages(project, exportNoInternalPackages);
						String exportedPackage = bundle.getHeader(Constants.EXPORT_PACKAGE);
						String newPackageExportListS = mergeExportPackage(exportedPackage, allJavaPackages);
						bundle.setHeader(Constants.EXPORT_PACKAGE,newPackageExportListS);
						bundle.setHeader(Constants.BUNDLE_MANIFESTVERSION, "2");
					}
				}
			}, monitor);
		}
	}
	
	/**
	 * Remove bundles from required bundles or packages from imported packages
	 * @param project
	 * @param requiredBundlesToRemove
	 * @param exportedPackagesToRemove
	 * @param monitor
	 */
	private static void updateManifestModel2(final IProject project, 
											 final List<String> requiredBundlesToRemove,
											 final boolean exportedPackagesToRemove,
											 final IProgressMonitor monitor){
		if (project == null)
		{
			return;
		}

		synchronized (bundleLock) {
			IFile	manifest = project.getFile(ICoreConstants.BUNDLE_FILENAME_DESCRIPTOR);
			PDEModelUtility.modifyModel(new ModelModification(manifest) {
				@Override
				protected void modifyModel(IBaseModel model, IProgressMonitor innerMonitor) throws CoreException {
					if (!(model instanceof IBundlePluginModelBase))
					{
						return;
					}

					IBundlePluginModelBase bundleModel = (IBundlePluginModelBase) model;
					IBundle bundle = bundleModel.getBundleModel().getBundle();

					// update required bundles
					if (requiredBundlesToRemove != null && requiredBundlesToRemove.size() > 0)
					{
						String availablerequiredBundles = bundle.getHeader(Constants.REQUIRE_BUNDLE);
						String newRequiredBundles = mergeRequiredBundles2(availablerequiredBundles, requiredBundlesToRemove);
						if (newRequiredBundles != null)
							bundle.setHeader(Constants.REQUIRE_BUNDLE, newRequiredBundles);
					}


					// Export all non internal Java Packages.
					if (exportedPackagesToRemove)
					{
						//TODO:
					}
				}
			}, monitor);
		}
	}
	
	/**
	 * Remove bundle from required bundles
	 * @param availableRequiredBundles
	 * @param requiredBundlesToRemove
	 * @return
	 */
	private static String mergeRequiredBundles2(String availableRequiredBundles, final List<String> requiredBundlesToRemove) {
		boolean updateBundles = false;
		List<String> availableDependecies = new ArrayList<String>();
		
		// There is some required Bundles
		if (availableRequiredBundles != null && availableRequiredBundles.trim().length() > 0)
		{
			// If there more then one dependency
			if (availableRequiredBundles.indexOf(",") != -1)
			{
				String[] list = availableRequiredBundles.split(",");
				for (String current : list)
				{
					availableDependecies.add(current) ;
				}
			}
			else
			{
				availableDependecies.add(availableRequiredBundles);
			}

			
			// If we are here, this means that there is some required bundle in the manifest
			for (String bundleToAdd : requiredBundlesToRemove) 
			{
				boolean removeBundle = false;
				for (String availableBundle : availableDependecies) 
				{
					String plugName = availableBundle;
					
					if (plugName.indexOf(";") != -1)
						plugName = plugName.subSequence(0,availableBundle.indexOf(";")).toString();

					// May be check if a required version is defined in the bundleToAdd.
					// If it is the case, remove it to do the next test
					if (plugName.equals(bundleToAdd))
					{
						removeBundle = true;
						break;
					}
				}
				
				if (removeBundle)
				{
					availableDependecies.remove(bundleToAdd);
					updateBundles = true;
				}
			}
		}
		else // there no required bundles in the Manifest, so there is nothing to remove
		{
			return null;
		}

		
		// Rewrite string version of required bundles
		if (availableDependecies.size() > 0 && updateBundles)
		{
			StringBuffer newRequiredBundles = new StringBuffer(""); //$NON-NLS-1$
			if (availableDependecies.size() == 1)
			{
				newRequiredBundles.append(availableDependecies.get(0));
			}
			else
			{
				newRequiredBundles.append(availableDependecies.get(0)).append(",");
				for (int i = 1; i < availableDependecies.size()-1; i++) 
				{
					newRequiredBundles.append("\n ").append(availableDependecies.get(i)).append(",");
				}
				newRequiredBundles.append("\n ").append(availableDependecies.get(availableDependecies.size()-1)); 
			}
			return newRequiredBundles.toString();
		}
		return availableRequiredBundles;
	}

	/**
	 * 
	 * @param availableRequiredBundles
	 * @param requiredBundlesToAdd
	 * @return
	 */
	private static String mergeRequiredBundles(String availableRequiredBundles, 
			final List<String> requiredBundlesToAdd) {
		boolean updateBundles = false;
		List<String> availableDependecies = new ArrayList<String>();
		
		// There is some required Bundles
		if (availableRequiredBundles != null && availableRequiredBundles.trim().length() > 0)
		{
			// If there more then one dependency
			if (availableRequiredBundles.indexOf(",") != -1)
			{
				String[] list = availableRequiredBundles.split(",");
				for (String current : list)
				{
					availableDependecies.add(current) ;
				}
			}
			else
			{
				availableDependecies.add(availableRequiredBundles);
			}

			for (String bundleToAdd : requiredBundlesToAdd) 
			{
				boolean addBundle = true;
				for (String availableBundle : availableDependecies) 
				{
					String plugName = availableBundle;
					
					if (plugName.indexOf(";") != -1)
						plugName = plugName.subSequence(0,availableBundle.indexOf(";")).toString();

					// May be check if a required version is defined in the bundleToAdd.
					// If it is the case, remove it to do the next test
					if (plugName.equals(bundleToAdd))
					{
						addBundle = false;
						break;
					}
				}
				
				if (addBundle)
				{
					availableDependecies.add(bundleToAdd);
					updateBundles = true;
				}
			}
		}
		else // there no required bundles in the Manifest, so add all requiredBundlesToAdd
		{
			availableDependecies.addAll(requiredBundlesToAdd);
			updateBundles = true;
		}

		
		if (availableDependecies.size() > 0 && updateBundles)
		{
			StringBuffer newRequiredBundles = new StringBuffer("");
			if (availableDependecies.size() == 1)
			{
				newRequiredBundles.append(availableDependecies.get(0));
			}
			else
			{
				newRequiredBundles.append(availableDependecies.get(0)).append(",");
				for (int i = 1; i < availableDependecies.size()-1; i++) 
				{
					newRequiredBundles.append("\n ").append(availableDependecies.get(i)).append(",");
				}
				newRequiredBundles.append("\n ").append(availableDependecies.get(availableDependecies.size()-1)); 
			}
			return newRequiredBundles.toString();
		}
		return availableRequiredBundles;
	}
	
	/**
	 * 
	 * @param project
	 * @param withInternal
	 * @return
	 * @throws JavaModelException
	 */
	private static List<String> getJavaPackages(IProject project, boolean withInternal) 
	throws JavaModelException{
		IJavaProject javaProject = JavaCore.create(project);
		IPackageFragment[] fragments = javaProject.getPackageFragments();
		
		List<String> packageNameToExport = new ArrayList<String>();
		
		for (IPackageFragment iPackageFragment : fragments) 
		{
			ICompilationUnit[] compilationUnits =  iPackageFragment.getCompilationUnits();
			if (! iPackageFragment.isDefaultPackage() && compilationUnits.length > 0)
			{
				if (! withInternal 
						&& (iPackageFragment.getElementName().endsWith(".internal")
						|| iPackageFragment.getElementName().contains(".internal.")))
					continue;
				
				packageNameToExport.add(iPackageFragment.getElementName());
			}
		}
		
		return packageNameToExport;
	}
	
	/**
	 * 
	 * @param exportedJavaPackage
	 * @param newPackagesToExport
	 * @return
	 * @throws JavaModelException
	 */
	private static String mergeExportPackage(String exportedJavaPackage, 
											 List<String> newPackagesToExport) 
	throws JavaModelException{
		if (newPackagesToExport != null && newPackagesToExport.size() > 0)
		{
			List<String> exportPackagesNewL = new ArrayList<String>();
			if (exportedJavaPackage != null && exportedJavaPackage.trim().length() > 0)
			{
				String[] exportPackagesExistingT = exportedJavaPackage.split(",");

				for (String iExportPackage : exportPackagesExistingT) 
				{
					exportPackagesNewL.add(iExportPackage);
				}
			}
			
			for (String iExportPackage : newPackagesToExport) 
			{
				if (! exportPackagesNewL.contains(iExportPackage))
					exportPackagesNewL.add(iExportPackage);
			}
			
			if (exportPackagesNewL.size() > 0)
			{
				StringBuffer exportPackagesNewS = new StringBuffer(" ");
				exportPackagesNewS.append(exportPackagesNewL.get(0));
				if (exportPackagesNewL.size() > 1)
				{
					for (int i = 1; i < exportPackagesNewL.size(); i++) 
					{
						exportPackagesNewS.append(", \n");
						exportPackagesNewS.append(" ").append(exportPackagesNewL.get(i));
					}
				}
				
				return exportPackagesNewS.toString();
			}
		}
		return exportedJavaPackage;
	}
	
	/**
	 * 
	 * @param project
	 */
	public static void updateClassPath(IProject project){
		try {
			IJavaProject javaProject = JavaCore.create(project);
			javaProject.setRawClasspath(javaProject.readRawClasspath(), javaProject.readOutputLocation(), Null_Progress_Monitor);
			project.refreshLocal(IResource.DEPTH_INFINITE, Null_Progress_Monitor);
		} catch (CoreException e) {
			Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e));
		}
	}
}
