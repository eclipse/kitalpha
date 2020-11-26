/*******************************************************************************
 * Copyright (c) 2015, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
// Generated on 19.07.2017 at 03:54:16 CEST by Viewpoint DSL Generator V 0.1

package org.polarsys.kitalpha.vp.componentsample.activity.explorer.predicate;

import org.eclipse.amalgam.explorer.activity.ui.api.editor.predicates.IPredicate;

import java.util.Arrays;
import java.util.List;

import org.eclipse.amalgam.explorer.activity.ui.api.manager.ActivityExplorerManager;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.EObject;

/**
* @generated 
*/
public class PDocumentationPagePredicate implements IPredicate {
	/**
	 * Default constructor
	 * @generated
	 */
	public PDocumentationPagePredicate() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @generated 
	 */
	@Override
	public boolean isOk() {
		return fileExtensionPredicate();
	}

	/**
	 * This method check if the extension of the resource file associated with the 
	 * Sirius session is provided by viewpoint specifier.
	 * 
	 * @return True if the current page can be used with the current resource. 
	 * @generated
	 */
	protected boolean fileExtensionPredicate() {
		final EObject rootSemanticModel = ActivityExplorerManager.INSTANCE.getRootSemanticModel();
		final Resource eResource = rootSemanticModel.eResource();
		if (null == eResource)
			return false;

		final URI resourceURI = eResource.getURI();
		if (null == resourceURI)
			return false;

		final List<String> allowedFileExtensions = Arrays.asList("componentsample");
		final String fileExtension = resourceURI.fileExtension().toLowerCase();

		return allowedFileExtensions.contains(fileExtension);
	}
}