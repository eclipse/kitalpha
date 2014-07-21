/*******************************************************************************
 * Copyright (c) 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation.
 *******************************************************************************/


package org.polarsys.kitalpha.validation.java.provider.generic;

import org.eclipse.emf.ecore.EObject;

/**
 * A java constraint.
 * 
 * @author Yann Mortier
 */
public interface IJavaConstraint<T extends EObject> {

    /**
     * Returns <code>true</code> if the given object is valid, otherwise
     * returns false otherwise.
     * 
     * @param object
     *            the object to validate.
     * @return true if the given object is valid, otherwise returns false.
     */
    public boolean isValid(T object);

    /**
     * Returns the type of object to validate.
     * 
     * @return the type of object to validate.
     */
    public Class<T> getTargetType();

}
