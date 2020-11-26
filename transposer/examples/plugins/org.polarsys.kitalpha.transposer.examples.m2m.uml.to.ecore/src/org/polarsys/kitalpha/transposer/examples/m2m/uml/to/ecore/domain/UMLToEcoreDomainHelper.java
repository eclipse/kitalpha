/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.transposer.examples.m2m.uml.to.ecore.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.UMLPackage;

import org.polarsys.kitalpha.transposer.transformation.emf.TransposerEMFPlugin;
import org.polarsys.kitalpha.transposer.transformation.emf.util.EmfDomainHelper;

/**
 * @author Guillaume Gebhart
 * 
 */
public class UMLToEcoreDomainHelper extends EmfDomainHelper {

	/**
	 * 
	 */
	public UMLToEcoreDomainHelper() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see org.polarsys.kitalpha.transposer.transformation.emf.util.EmfDomainHelper#getDomainMetaclass(java.lang.String)
	 */
	public boolean isDomainFor(Object object_p) {
		boolean isDomain = false ; 
		if (object_p instanceof IFile) {
			IFile file = (IFile) object_p;
			isDomain = file.getFileExtension().equals("uml");	//$NON-NLS-1$
		}
		
		if(object_p instanceof Element){
			isDomain = true;
		}
		return isDomain;
	}

	/**
	 * @see org.polarsys.kitalpha.transposer.transformation.emf.util.EmfDomainHelper#getDomainMetaclass(java.lang.String)
	 */
	protected Set<EPackage> getEPackages() {
		Set<EPackage> eAllPackages = new LinkedHashSet<EPackage>();
		eAllPackages.add(UMLPackage.eINSTANCE);
		return eAllPackages;
	}

	/**
	 * @see org.polarsys.kitalpha.transposer.transformation.emf.util.EmfDomainHelper#getDomainMetaclass(java.lang.String)
	 */
	public boolean isHotSpot(Object object_p) {
		return object_p instanceof Element;
	}

	/**
	 * @see org.polarsys.kitalpha.transposer.transformation.emf.util.EmfDomainHelper#getDomainMetaclass(java.lang.String)
	 */
	public Collection<Object> getAnalysisSources(Collection<?> selection_p) {
		Collection<Object> sources = new ArrayList<Object>();
		for (Object sel : selection_p) {
			if (sel instanceof Element) {
				Iterator<EObject> it = ((Element) sel).eAllContents();
				while (it.hasNext())
					sources.add(it.next());
			}

		}
		return sources;
	}

	/**
	 * @see org.polarsys.kitalpha.transposer.transformation.emf.util.EmfDomainHelper#getDomainMetaclass(java.lang.String)
	 */
	@Override
	public java.lang.Class<?> getDomainMetaclass(String name_p) {
		try {
			return java.lang.Class.forName(name_p);
		} catch (ClassNotFoundException e) {
			TransposerEMFPlugin.getDefault().getLog().log(
					new Status(IStatus.ERROR, TransposerEMFPlugin.PLUGIN_ID,
							"No Domain Class called : " + name_p, e)); //$NON-NLS-1$
		}
		return null;
	}
}