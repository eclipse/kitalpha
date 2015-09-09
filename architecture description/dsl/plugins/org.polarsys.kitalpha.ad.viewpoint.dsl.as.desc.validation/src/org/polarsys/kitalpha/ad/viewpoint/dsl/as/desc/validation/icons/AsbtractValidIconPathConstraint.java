/*******************************************************************************
 * Copyright (c) 2015 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.icons;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.IAdditionalConstraint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.ValidationStatus;

/**
 * @author Boubekeur Zendagui
 */
public abstract class AsbtractValidIconPathConstraint implements IAdditionalConstraint{

	/**
	 * Default icons folder name
	 */
	private static final String iconsFolderName = "icons";
	
	/**
	 * This method get the name of the EAttribute containing the icon path
	 * @param data the current model element.
	 * @return the name of the attribute containing the Icon file Path or Name
	 */
	public abstract String getIconAttributeName(Object context);
	
	@Override
	public ValidationStatus validationRules(Object data) {
		String iconPath = getIconPath((EObject)data);
		if (iconPath != null && false == iconPath.isEmpty())
		{
			// Check if the icon file exists in the Icons folder
			// First 1. get the icons folder
			final String vpdslProjectName = ((EObject)data).eResource().getURI().segment(1);
			final IProject vpdslProject = ResourcesPlugin.getWorkspace().getRoot().getProject(vpdslProjectName);
			IFolder folder = vpdslProject.getFolder(iconsFolderName);
			if (folder.exists() == false)
				return ValidationStatus.Error;

			final IFile file = folder.getFile(iconPath);
			if (file.exists())
			{
				return ValidationStatus.Ok;
			}
			else
			{
				final IPath folderLocation = folder.getLocation();
				final IPath fileLocation = folderLocation.append(new Path(iconPath));
				return folder.getFile(fileLocation).exists() ? ValidationStatus.Ok : ValidationStatus.Error;
			}
		}
		else
		{   // If there is no provided icon path, so we consider the model element as valid
			return ValidationStatus.Ok;
		}	
	}
	
	/**
	 * Get the icon path provided by viewpoint specifier in the aspect
	 * @param modelElement the model element to validate 
	 * @return the icons Path if it exists, Empty string otherwise.
	 */
	protected final String getIconPath(EObject modelElement){
		String iconsAttributeName = getIconAttributeName((EObject) modelElement);
		final EStructuralFeature iconEStructuralFeature = modelElement.eClass().getEStructuralFeature(iconsAttributeName);
		return modelElement.eIsSet(iconEStructuralFeature) ? (String) modelElement.eGet(iconEStructuralFeature) :  "";
	}
}
