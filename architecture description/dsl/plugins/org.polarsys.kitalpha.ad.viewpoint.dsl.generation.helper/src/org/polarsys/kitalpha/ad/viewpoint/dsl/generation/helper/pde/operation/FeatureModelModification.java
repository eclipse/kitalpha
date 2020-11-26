/*******************************************************************************
 * Copyright (c) 2016, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.helper.pde.operation;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.pde.internal.core.feature.WorkspaceFeatureModel;
import org.eclipse.pde.internal.core.ifeature.IFeature;
import org.eclipse.pde.internal.core.ifeature.IFeatureInfo;
import org.eclipse.pde.internal.core.project.PDEProject;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

/**
 * @author Boubekeur Zendagui
 */

@SuppressWarnings("restriction")
public class FeatureModelModification extends WorkspaceModifyOperation{
	
	/** Default Values **/
	private static final String INFO_COPYRIGHT_DEFAULT_URL = "http://www.example.com/copyright";
	private static final String INFO_COPYRIGHT_DEFAULT_DESC = " [Enter Copyright Description here.]";
	
	private static final String INFO_LICENSE_DEFAULT_URL = "http://www.example.com/license";
	private static final String INFO_LICENSE_DEFAULT_DESC = " [Enter License Description here.]";
	
	private static final String INFO_DESCRIPTION_DEFAULT_URL = "http://www.example.com/description";
	private static final String INFO_DESCRIPTION_DEFAULT_DESC  = " [Enter Feature Description here.]";
	
	IProject featureProject;
	
	/** Feature project properties **/
	private String featureLabel;
	private String featureId;
	private String featureVersion;
	private String featureProviderName;
	private String featureLicence;
	private String featureLicenceURL;
	private String featureCopyright;
	private String featureCopyrightURL;
	private String featureDescription;
	private String featureDescriptionURL;
	
	/**
	 * Constructor with the Feature Project Name
	 * @param featureProjectName the Feature Project Name
	 * @throws IllegalArgumentException if the project doesn't exists in the workspace
	 * @throws CoreException 
	 */
	public FeatureModelModification(String featureProjectName)  throws IllegalArgumentException, CoreException {
		this(ResourcesPlugin.getWorkspace().getRoot().getProject(featureProjectName));
	}
	
	/**
	 * Constructor with the Feature {@link IProject}
	 * @param featureProject the Feature {@link IProject}
	 * @throws IllegalArgumentException if the project doesn't exists in the workspace
	 * @throws CoreException 
	 */
	public FeatureModelModification(IProject featureProject) throws IllegalArgumentException, CoreException {
		super();
		if (featureProject.exists())
		{
			this.featureProject = featureProject;
			this.featureProject.refreshLocal(IProject.DEPTH_ONE, new NullProgressMonitor());
			this.featureProject.build(IncrementalProjectBuilder.FULL_BUILD, new NullProgressMonitor());
		}
		else
		{
			throw new IllegalArgumentException("The feature project " + featureProject.getName() + " doesn't exists in the workspace");
		}
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.actions.WorkspaceModifyOperation#execute(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	protected void execute(IProgressMonitor monitor)
			throws CoreException, InvocationTargetException, InterruptedException {
		modifyModel(featureProject);
	}
	
	/**
	 * Apply modifications on the Feature project and save them
	 * @param project the Feature {@link IProject}
	 * @throws CoreException
	 */
	public void modifyModel(IProject project) throws CoreException{
		IFile file = PDEProject.getFeatureXml(project);
		file.refreshLocal(IFile.DEPTH_ONE, new NullProgressMonitor());
		WorkspaceFeatureModel model = new WorkspaceFeatureModel();
		model.setFile(file);
		model.load();
		IFeature feature = model.getFeature();
		
		if (getFeatureLabel() != null)
			feature.setLabel(getFeatureLabel());
		
		if (getFeatureId() != null)
			feature.setId(getFeatureId());
		
		if (getFeatureVersion() != null)
			feature.setVersion(getFeatureVersion());
		
		if (getFeatureProviderName() != null)
			feature.setProviderName(getFeatureProviderName());
		
		updateFeatureInfo(model, IFeature.INFO_COPYRIGHT, getFeatureCopyright(), getFeatureCopyrightURL());

		updateFeatureInfo(model, IFeature.INFO_DESCRIPTION, getFeatureDescription(), getFeatureDescriptionURL());
	
		updateFeatureInfo(model, IFeature.INFO_LICENSE, getFeatureLicence(), getFeatureLicenceURL());
	
		// Save the model
		model.save();
		model.dispose();
	}
	
	protected void updateFeatureInfo(WorkspaceFeatureModel model, int infoType, String url, String description) throws CoreException{
		if (url != null || description != null)
		{
			IFeatureInfo newInfo = model.getFactory().createInfo(infoType);
			IFeatureInfo oldInfo = model.getFeature().getFeatureInfo(infoType);
			model.getFeature().setFeatureInfo(newInfo, infoType);
			
			if (url == null)
			{
				if (oldInfo != null && oldInfo.getURL() != null)
				{
					url = oldInfo.getURL();
				}
				else
				{
					if (IFeature.INFO_COPYRIGHT == infoType)
						url = INFO_COPYRIGHT_DEFAULT_URL;
					
					if (IFeature.INFO_LICENSE == infoType)
						url = INFO_LICENSE_DEFAULT_URL;
					
					if (IFeature.INFO_DESCRIPTION == infoType)
						url = INFO_DESCRIPTION_DEFAULT_URL;
				}
			}
			
			if (description == null)
			{
				if (oldInfo != null && oldInfo.getDescription() != null)
				{
					description = oldInfo.getDescription();
				}
				else
				{
					if (IFeature.INFO_COPYRIGHT == infoType)
						description = INFO_COPYRIGHT_DEFAULT_DESC;
					
					if (IFeature.INFO_LICENSE == infoType)
						description = INFO_LICENSE_DEFAULT_DESC;
					
					if (IFeature.INFO_DESCRIPTION == infoType)
						description = INFO_DESCRIPTION_DEFAULT_DESC;
				}
			}
			
			newInfo.setURL(url);
			newInfo.setDescription(description);
		}
	}
	
	/** Getters, Setters and value existence checker**/
	public String getFeatureLabel() {
		return featureLabel;
	}

	public void setFeatureLabel(String featureLabel) {
		this.featureLabel = featureLabel;
	}
	
	public String getFeatureId() {
		return featureId;
	}

	public void setFeatureId(String featureId) {
		this.featureId = featureId;
	}

	public String getFeatureVersion() {
		return featureVersion;
	}

	public void setFeatureVersion(String featureVersion) {
		this.featureVersion = featureVersion;
	}
	
	public String getFeatureProviderName() {
		return featureProviderName;
	}

	public void setFeatureProviderName(String featureProviderName) {
		this.featureProviderName = featureProviderName;
	}
	
	public String getFeatureLicence() {
		return featureLicence;
	}

	public void setFeatureLicence(String featureLicence) {
		this.featureLicence = featureLicence;
	}

	public String getFeatureLicenceURL() {
		return featureLicenceURL;
	}

	public void setFeatureLicenceURL(String featureLicenceURL) {
		this.featureLicenceURL = featureLicenceURL;
	}

	public String getFeatureCopyright() {
		return featureCopyright;
	}

	public void setFeatureCopyright(String featureCopyright) {
		this.featureCopyright = featureCopyright;
	}

	public String getFeatureCopyrightURL() {
		return featureCopyrightURL;
	}

	public void setFeatureCopyrightURL(String featureCopyrightURL) {
		this.featureCopyrightURL = featureCopyrightURL;
	}

	public String getFeatureDescription() {
		return featureDescription;
	}

	public void setFeatureDescription(String featureDescription) {
		this.featureDescription = featureDescription;
	}

	public String getFeatureDescriptionURL() {
		return featureDescriptionURL;
	}

	public void setFeatureDescriptionURL(String featureDescriptionURL) {
		this.featureDescriptionURL = featureDescriptionURL;
	}
}
