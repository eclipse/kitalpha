/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package constraint.provider.java;

import org.eclipse.emf.examples.extlibrary.Writer;

import org.polarsys.kitalpha.validation.java.provider.generic.IExtendedJavaConstraint;

/**
 * @author THALESGROUP
 */
public class WriterNameHasNoSpace implements IExtendedJavaConstraint<Writer> {

	private String[] message = { "Hey there is a space" };

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.polarsys.kitalpha.validation.java.provider.generic.IExtendedJavaConstraint#getAdditionalArguments()
	 */
	public Object[] getAdditionalArguments() {
		return message;
	}

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
		return object.getName() == null || object.getName().indexOf(' ') < 0;
	}

}
