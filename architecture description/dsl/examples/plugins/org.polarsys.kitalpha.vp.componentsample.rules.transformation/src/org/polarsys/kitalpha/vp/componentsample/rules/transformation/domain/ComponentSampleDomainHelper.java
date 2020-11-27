/*******************************************************************************
 * Copyright (c) 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.vp.componentsample.rules.transformation.domain;

import java.util.LinkedHashSet;
import java.util.Set;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EPackage;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IDomainHelper;
import org.polarsys.kitalpha.transposer.transformation.emf.TransposerEMFPlugin;
import org.polarsys.kitalpha.transposer.transformation.emf.util.EmfDomainHelper;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentSamplePackage;

/**
 * 
 * @author Faycal Abka
 *
 */
public class ComponentSampleDomainHelper extends EmfDomainHelper implements IDomainHelper {

	public ComponentSampleDomainHelper() {
		// do nothing
	}

	@Override
	public Class<?> getDomainMetaclass(String name_p) {
		try {
			return Class.forName(name_p);
		} catch (ClassNotFoundException e) {
			TransposerEMFPlugin.getDefault().getLog().log(
					new Status(IStatus.ERROR, TransposerEMFPlugin.PLUGIN_ID, "No Domain Class called : " + name_p, e)); //$NON-NLS-1$
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
