/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.accuracy.componentsample.validation.constraints.java;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.polarsys.kitalpha.validation.java.provider.generic.IJavaConstraint;

/**
 * 
 * @author Faycal Abka
 *
 */
public class ComponentModelRoot implements IJavaConstraint<EObject> {

	public ComponentModelRoot() {
	}

	@Override
	public boolean isValid(EObject object) {
		EObject root = EcoreUtil.getRootContainer(object);
		if (object == root) {
			return true;
		}
		return root instanceof ComponentModel;
	}

	@Override
	public Class<EObject> getTargetType() {
		return EObject.class;
	}

}
