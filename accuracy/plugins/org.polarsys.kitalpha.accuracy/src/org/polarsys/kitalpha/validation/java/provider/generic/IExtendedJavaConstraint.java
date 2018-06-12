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
package org.polarsys.kitalpha.validation.java.provider.generic;

import org.eclipse.emf.ecore.EObject;

/**
 * This interface allows the user to use additional message arguments.
 * 
 * @since Accuracy 1.2.3
 * @author THALESGROUP
 */
public interface IExtendedJavaConstraint<T extends EObject> extends IJavaConstraint<T> {

	/**
	 * Returns the additional arguments.
	 * 
	 * @return the additional arguments.
	 */
	Object[] getAdditionalArguments();

}
