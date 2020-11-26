/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.transposer.m2m.componentsample.to.uml.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.polarsys.kitalpha.transposer.m2m.componentsample.to.uml.Activator;
import org.polarsys.kitalpha.transposer.m2m.componentsample.to.uml.constants.IConstants;
import org.polarsys.kitalpha.transposer.transformation.emf.util.EmfDomainHelper;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentElement;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentSamplePackage;

/**
 * 
 * @author Faycal Abka
 *
 */
public class DomainHelper extends EmfDomainHelper {
	
	@Override
	public boolean isHotSpot(Object obj){
		return obj instanceof ComponentElement;
	}
	
	@Override
	public boolean isDomainFor(Object object_p){
		
		boolean isDomain = false;
		
		if (object_p instanceof IFile){
			IFile file = (IFile)object_p;
			isDomain = file.getFileExtension().equals(IConstants.COMPONENTSAMPLE_EXTENSION);
		}
		
		isDomain |= (object_p instanceof ComponentElement);
		
		return isDomain;
	}
	
	@Override
	public Collection<Object> getAnalysisSources(Collection<?> eObjects) {
		Collection<Object> eObjectToAnalyse = new ArrayList<Object>();

		for (Object obj : eObjects) {
			if (obj instanceof EObject) {

				eObjectToAnalyse.add(obj);
				if (obj instanceof ComponentElement) {
					TreeIterator<EObject> contents = ((ComponentElement) obj)
							.eAllContents();
					while (contents.hasNext()) {
						eObjectToAnalyse.add(contents.next());
					}
				}
			}
		}
		return eObjectToAnalyse;
	}
	
	
	/**
	 * This Method is Mandatory for each DomainHelper
	 * Resolve ClassLoader problem
	 * (non-Javadoc)
	 * @see org.polarsys.kitalpha.transposer.transformation.emf.util.EmfDomainHelper#getDomainMetaclass(java.lang.String)
	 */
	@Override
	public Class<?> getDomainMetaclass(String className) {
		try {
			return Class.forName(className);
		} catch (ClassNotFoundException e) {
			Activator
					.getDefault()
					.getLog()
					.log(new Status(IStatus.ERROR, Activator.PLUGIN_ID,
							"No Domain Class called : " + className, e));
		}
		return null;
	}

	@Override
	protected Set<EPackage> getEPackages() {
		Set<EPackage> eAllPackages = new LinkedHashSet<EPackage>();
		eAllPackages.add(ComponentSamplePackage.eINSTANCE);
		return eAllPackages;
	}
}
