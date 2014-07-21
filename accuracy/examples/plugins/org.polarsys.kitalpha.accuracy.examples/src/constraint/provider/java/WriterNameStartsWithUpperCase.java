/*******************************************************************************
 * Copyright (c) 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation
 *******************************************************************************/


/**
 * 
 */
package constraint.provider.java;

import org.eclipse.emf.examples.extlibrary.Writer;

import org.polarsys.kitalpha.validation.java.provider.generic.IJavaConstraint;

/**
 * 
 */
public class WriterNameStartsWithUpperCase implements IJavaConstraint<Writer> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.polarsys.kitalpha.validation.java.provider.generic.IJavaConstraint#getTargetType()
	 */
	public Class<Writer> getTargetType() {
		return Writer.class;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.polarsys.kitalpha.validation.java.provider.generic.IJavaConstraint#isValid(org.eclipse.emf.ecore.EObject)
	 */
	public boolean isValid(Writer object) {
		return object.getName() != null && object.getName().length() > 0
				&& Character.isUpperCase(object.getName().charAt(0));
	}

}
