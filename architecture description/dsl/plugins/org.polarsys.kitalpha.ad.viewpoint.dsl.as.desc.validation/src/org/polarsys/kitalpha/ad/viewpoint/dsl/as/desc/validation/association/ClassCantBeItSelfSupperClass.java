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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.association;

import org.eclipse.emf.ecore.EObject;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.LocalSuperClass;

/**
 * @author Boubekeur Zendagui
 *
 */
public class ClassCantBeItSelfSupperClass extends AbstractAssociationConstraint{

	/**
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.association.AbstractAssociationConstraint#setEStructuralFeatureName(org.eclipse.emf.ecore.EObject)
	 */
	@Override
	protected void setEStructuralFeatureName(EObject eObject) {
		eStructuralFeatureName = "Inheritences";
	}

	/**
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.association.AbstractAssociationConstraint#isObjectInScope(java.lang.Object)
	 */
	@Override
	protected boolean isObjectInScope(Object object) {
		return object instanceof Class;
	}

	/**
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.association.AbstractAssociationConstraint#acceptAssociationBetween(org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 */
	@Override
	protected boolean acceptAssociationBetween(EObject source, EObject target) {
		if (target instanceof LocalSuperClass)
		{
			final Class superClass = ((LocalSuperClass) target).getSuperClass();
			final Class currentClass = (Class) source;
			return ! currentClass.equals(superClass);
		}
		return true;
	}

	/**
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.association.AbstractAssociationConstraint#getMessageToDisplay(org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 */
	@Override
	protected String getMessageToDisplay(EObject source, EObject target) {
		final Class clazz = (Class)source;
		final String className = clazz.getName();
		return "Class " + className + " can't inherits from it self";
	}

}
