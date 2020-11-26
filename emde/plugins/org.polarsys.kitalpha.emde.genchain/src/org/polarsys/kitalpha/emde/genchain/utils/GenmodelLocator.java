/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.emde.genchain.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.egf.core.domain.TargetPlatformResourceSet;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.search.core.text.TextSearchEngine;
import org.eclipse.search.core.text.TextSearchRequestor;
import org.eclipse.search.core.text.TextSearchScope;
import org.eclipse.search.ui.text.FileTextSearchScope;

/**
 * @author Thomas Guiu
 * 
 */
public class GenmodelLocator {
	public static IFile lookup(IPath ecorePath) {
		ResourceSet resourceSet = new TargetPlatformResourceSet();
		try {
			URI ecoreURI = URI.createPlatformResourceURI(ecorePath.toString(), false);
			String fileName = ecorePath.removeFileExtension().addFileExtension("genmodel").lastSegment();
			
			EPackage ePackage = (EPackage)resourceSet.getEObject(ecoreURI.appendFragment("/"), true);
			for (IFile candidat : getRawFiles(fileName))
			{
				URI uri = URI.createPlatformResourceURI(candidat.getFullPath().toString(), false).appendFragment("/");
				GenModel genmodel = (GenModel)resourceSet.getEObject(uri, true);
				for (GenPackage p : genmodel.getGenPackages())
				{
					if (!p.getEcorePackage().equals(ePackage)) {
						continue;
					}
					if (genmodel.getRootExtendsInterface().contains("org.eclipse.emf.cdo")) {
						continue;
					}
					return candidat;
				}
			}
			
			return null;
		} finally {
			for (Resource r : resourceSet.getResources()) {
				r.unload();
			}
		}
	}
	
	private static List<IFile> getRawFiles(String fileName) {
		// look up in the workspace
		TextSearchScope fScope = FileTextSearchScope.newWorkspaceScope(new String[] { fileName }, false);
		final List<IFile> result = new ArrayList<IFile>();
		TextSearchRequestor collector = new TextSearchRequestor() {
			@Override
			public boolean acceptFile(IFile file) throws CoreException {
				result.add(file);
				return super.acceptFile(file);
			}
		};
		Pattern searchPattern = Pattern.compile("");
		TextSearchEngine.create().search(fScope, collector, searchPattern, null);
		return result;
	}
}
