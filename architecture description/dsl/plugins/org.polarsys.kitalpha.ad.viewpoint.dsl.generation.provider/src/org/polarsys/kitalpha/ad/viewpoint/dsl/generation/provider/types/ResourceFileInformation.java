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

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.provider.types;

import org.eclipse.emf.common.util.URI;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.provider.exception.ViewpointResourceException;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.provider.message.Messages;

/**
 * @author Boubekeur Zendagui
 */

public class ResourceFileInformation {
	
	private final String PATH_SEPARATOR = "/"; //$NON-NLS-1$
	
	private String projectName_;
	private String folderName_;
	private String fileName_;
	private String fileExtension_;
	
	/**
	 * Default constructor
	 * @param projectName the project containing the resource
	 * @param folderName the folder containing the resource
	 * @param fileName the resource file name
	 * @param fileExtension the resource file extension
	 * @throws Exception if informations are wrong
	 */
	public ResourceFileInformation(String projectName, 
								   String folderName, 
								   String fileName,
								   String fileExtension) throws ViewpointResourceException {
		if (! checkInforamtions())
		{
			// FIXME: create the well exception
			throw new RuntimeException(Messages.ResourceFileInformation_WrongInformation);
		}
		projectName_ = projectName;
		folderName_ = folderName;
		fileName_ = fileName;
		fileExtension_ = fileExtension;
	}
	
	/**
	 * This compute the file URI of the resource by using the provided informations
	 * @return the file URI ({@link URI}) of the 
	 * current resource  
	 */
	final public URI getFileURI(){
		String strUri = getStringPath();
		return checkInforamtions() ? URI.createFileURI(strUri) : null;
	}
	
	/**
	 * This compute the platform resource URI of the current resource by using 
	 * the provided informations
	 * @return the platform resource URI ({@link URI}) 
	 * of the current resource  
	 */
	final public URI getPlatformResourceURI(){
		String strUri = getStringPath();
		return checkInforamtions() ? URI.createPlatformResourceURI(strUri, false) : null;
	}
	
	final public String getStringPath(){
		return PATH_SEPARATOR+
				projectName_+ 
				PATH_SEPARATOR+ 
				folderName_+
				PATH_SEPARATOR+ 
				getFileNameWithExtension(fileName_);
	}
	
	final public String getFileNameWithExtension(String resourceFileName){
		if (resourceFileName.endsWith(fileExtension_))
			return resourceFileName;
		else
			return resourceFileName + "."+fileExtension_;
	}
	
	/**
	 * This method allows to check if the informations about a file are correct.
	 * In this version, it only check that all informations are not empty. 
	 * SOON, it will check the validity of information (for example, check if 
	 * used characters are not forbidden for a file name). 
	 * @return True if the resource file information are correct, False else
	 */
	public boolean checkInforamtions(){
		return (projectName_ != "" && 
					folderName_ != "" && 
					fileName_ != "" &&
					fileExtension_ != "") 
				? true : false; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
	}

	
	/********************* Properties Getters and Setters *********************/
	
	/**
	 * Provides the name of the project containing the resource
	 * @return the value of the projectName_ property 
	 */
	public String getProjectName() {
		return projectName_;
	}

	/**
	 * Set the name of the project containing the resource file (property folderName_)
	 */
	public void setProjectName(String projectName) {
		this.projectName_ = projectName;
	}

	/**
	 * Provides the name of the folder containing the resource
	 * @return the value of the folderName_ property 
	 */
	public String getFolderName() {
		return folderName_;
	}

	/**
	 * Set the name of the folder containing the resource file (property folderName_)
	 */
	public void setFolderName(String folderName) {
		this.folderName_ = folderName;
	}

	/**
	 * Provides the name of the folder containing the resource
	 * @return the value of the folderName_ property 
	 */
	public String getFileName() {
		return fileName_;
	}

	/**
	 * Set the name the resource file (property fileName_)
	 */
	public void setFileName(String resourceName) {
		this.fileName_ = resourceName;
	}

	/**
	 * Provides the file extension the resource file
	 * @return the value of the fileExtension_ property 
	 */
	public String getFileExtension() {
		return fileExtension_;
	}

	/**
	 * Set the file extension the resource file (property fileExtension_)
	 */
	public void setFileExtension(String fileExtension) {
		this.fileExtension_ = fileExtension;
	}
}
