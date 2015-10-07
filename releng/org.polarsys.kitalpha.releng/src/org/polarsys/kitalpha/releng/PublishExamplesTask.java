/**
 * <copyright>
 *
 *  Copyright (c) 2009-2010 Thales Corporate Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  Contributors:
 *      Thales Corporate Services S.A.S - initial API and implementation
 * 
 * </copyright>
 */

package org.polarsys.kitalpha.releng;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.eclipse.core.internal.utils.FileUtil;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.egf.ftask.producer.invocation.ITaskProduction;
import org.eclipse.pde.internal.core.feature.FeatureChild;
import org.eclipse.pde.internal.core.feature.WorkspaceFeatureModel;
import org.eclipse.pde.internal.core.ifeature.IFeature;
import org.eclipse.pde.internal.core.ifeature.IFeatureChild;
import org.eclipse.pde.internal.core.ifeature.IFeaturePlugin;
import org.eclipse.ui.internal.wizards.datatransfer.ZipFileExporter;

/**
 * @author Matthieu Helleboid
 * 
 */
@SuppressWarnings("all")
public class PublishExamplesTask implements ITaskProduction {
    
    private static final String FEATURE_XML = "feature.xml";//$NON-NLS-1$
    
    private static final String OUTPUT_FOLDER = "outputFolder";//$NON-NLS-1$
    private static final String FEATURE_NAME = "featureName";//$NON-NLS-1$
    private static final String IMPORTER_NAME = "importerName";//$NON-NLS-1$

    public void doExecute(ITaskProductionContext productionContext, IProgressMonitor monitor) throws InvocationException {
        String featureName = System.getProperty(FEATURE_NAME);
        String outputFolder = System.getProperty(OUTPUT_FOLDER);
        String importerName = System.getProperty(IMPORTER_NAME);
        System.out.println("Will export plugins of feature " + featureName + " to folder " + outputFolder); //$NON-NLS-1$ //$NON-NLS-2$
        publishFeature(featureName, outputFolder, importerName);
    }

    protected void publishFeature(String featureName, String outputFolder, String importerName) {
        trace("Will create " + outputFolder);
        new File(outputFolder).mkdirs();
        
        trace("Will get project " + featureName);
        IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
        IProject featureProject = workspaceRoot.getProject(featureName);
        trace("project " + featureName + " " + (featureProject.exists() ? " exists" : " doesn't exist"));
        if (!featureProject.exists()) {
        	featureName = featureName.replace('-', '.');

	        trace("Will get project " + featureName);
	        featureProject = workspaceRoot.getProject(featureName);
	        trace("project " + featureName + " " + (featureProject.exists() ? " exists" : " doesn't exist"));
        }
        
        trace("Will get file " + FEATURE_XML);
        IFile featureFile = featureProject.getFile(FEATURE_XML);
        trace("file " + featureFile + " " + (featureFile.exists() ? " exists" : " doesn't exist"));

        trace("Will load featureModel");
        WorkspaceFeatureModel featureModel = new WorkspaceFeatureModel(featureFile);
        featureModel.load();
        trace("featureModel loaded");
        
        ArrayList<IProject> projects = new ArrayList<IProject>();
        collectProjects(workspaceRoot, featureModel.getFeature(), projects);
        
        if (importerName != null) {
        	emptyImporterZipFolder(importerName);
        }
        
        for (IProject project : projects) {
            ArrayList<IProject> oneProjectList = new ArrayList<IProject>();
            oneProjectList.add(project);
            String zipName = project.getName() + ".zip";
            String zipPath = outputFolder + "/" + zipName;
			zipProjects(oneProjectList, featureFile, zipName, zipPath);
			addZipToImporterProject(importerName, zipPath, zipName);
        }
        if (projects.size() > 1)
            zipProjects(projects, featureFile, "complete examples zip", outputFolder + "/all.zip");
    }

	private void collectProjects(IWorkspaceRoot workspaceRoot, IFeature feature, ArrayList<IProject> projects) {
		for (IFeatureChild child : feature.getIncludedFeatures())
		{
			IFeature childFeature = ((FeatureChild)child).getReferencedFeature();
			trace("Contains feature "+childFeature);
			collectProjects(workspaceRoot, childFeature, projects);
		}
		
		for (IFeaturePlugin featurePlugin : feature.getPlugins()) {
        	trace("Will get project " + featurePlugin.getId());
            IProject pluginProject = workspaceRoot.getProject(featurePlugin.getId());
            projects.add(pluginProject);
        }
	}

	private void emptyImporterZipFolder(String importerName) {
		IFolder importerZipsFolder = getImporterZipsFolder(importerName);
        trace("Will empty folder " + importerZipsFolder.getRawLocation().toString());
		try {
            final ArrayList<IFile> resourceList = new ArrayList<IFile>();
			importerZipsFolder.accept(new ProjectVisitor(resourceList));
			for (IFile iFile : resourceList) {
		        trace("Will delete file " + iFile.getRawLocation().toString());
				iFile.delete(true, new NullProgressMonitor());
			}
		} catch (CoreException e) {
            new RuntimeException("Cannot empty folder " + importerZipsFolder.getRawLocation().toString(), e).printStackTrace(); //$NON-NLS-1$
		}
	}

	private void addZipToImporterProject(String importerName, String zipPath, String zipName) {
		if (importerName == null) 
			return;

		IFolder folder = getImporterZipsFolder(importerName);
		
		File sourceFile = new File(zipPath);
		File destinationFile = new File(folder.getRawLocation().toFile(), zipName);

        trace("Will copy " + sourceFile.getAbsolutePath() + " to " + destinationFile.getAbsolutePath());

		BufferedInputStream inputStream = null;
		BufferedOutputStream outputStream = null;
		try {
			inputStream = new BufferedInputStream(new FileInputStream(sourceFile));
			outputStream = new BufferedOutputStream(new FileOutputStream(destinationFile));
			
			byte[] buf = new byte[1024];
			int len;
			while ((len = inputStream.read(buf)) > 0) {
				outputStream.write(buf, 0, len);
			}
			inputStream.close();
			outputStream.close();
			
			folder.refreshLocal(IResource.DEPTH_ONE, new NullProgressMonitor());
		} catch (Exception e) {
            new RuntimeException("Cannot copy " + sourceFile.getAbsolutePath() + " to " + destinationFile.getAbsolutePath(), e).printStackTrace(); //$NON-NLS-1$
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					//ignore me
				}
			}
			if (outputStream != null) {
				try {
					outputStream.close();
				} catch (IOException e) {
					//ignore me
				}
			}
		}
	}

	private IFolder getImporterZipsFolder(String importerName) {
		IProject importerProject = ResourcesPlugin.getWorkspace().getRoot().getProject(importerName);
		return importerProject.getFolder("zips");
	}

    private void zipProjects(ArrayList<IProject> projects, IFile featureFile, String zipName, String zipPath) {
        ZipFileExporter fileExporter = null;
        try {
        	trace("Will publish zip " + zipPath);
            fileExporter = new ZipFileExporter(zipPath, true);
            final ArrayList<IFile> resourceList = new ArrayList<IFile>();

            trace("Will visit project");
            for (IProject project : projects) 
                project.accept(new ProjectVisitor(resourceList));

            trace("Will write resources");
            for (IFile resource : resourceList)
                fileExporter.write(resource, resource.getFullPath().toString().substring(1));

            trace("Will finish");
            fileExporter.finished();
            System.out.println(zipName + " published"); //$NON-NLS-1$
        } catch (Exception e) {
            try {
                // at least one zipentry to close it
                fileExporter.write(featureFile, FEATURE_XML);
                fileExporter.finished();
            } catch (Exception e2) {
            }
            new File(zipPath).delete();
            new RuntimeException("Cannot publish " + zipName, e).printStackTrace(); //$NON-NLS-1$
        }
    }

    private void trace(String string) {
    	System.out.println(string);
	}

    private final class ProjectVisitor implements IResourceVisitor {
    	private final ArrayList<IFile> resourceList;
    	
    	private ProjectVisitor(ArrayList<IFile> resourceList) {
    		this.resourceList = resourceList;
    	}
    	
    	public boolean visit(IResource resource) {
    		if (".svn".equals(resource.getName())) //$NON-NLS-1$
    			return false;
    		
    		if (resource.getType() == IResource.FILE)
    			resourceList.add((IFile) resource);
    		
    		return true;
    	}
    }
    
    public void preExecute(ITaskProductionContext productionContext, IProgressMonitor monitor) throws InvocationException {
    }

	public void postExecute(ITaskProductionContext productionContext, IProgressMonitor monitor) throws InvocationException {
    }

}
