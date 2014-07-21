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



package org.polarsys.kitalpha.validation.provider.generic;

import java.net.URL;
import java.util.ResourceBundle;

import org.eclipse.emf.validation.service.AbstractConstraintProvider;
import org.osgi.framework.Bundle;

/**
 * Generic constraint provider.
 * 
 * @author Yann Mortier
 */
public abstract class GenericConstraintProvider extends AbstractConstraintProvider {

    /**
     * Returns the id of this provider. By default, the ID is the class of the
     * provider. Subclasses can redefine this method.
     * 
     * @return the id of this provider
     */
    public Object getId() {
        return this.getClass();
    }

    /**
     * Returns the constraint factory to use.
     * 
     * @return the constraint factory to use.
     */
    public abstract GenericConstraintFactory getConstraintFactory();

    /**
     * Returns the ResourceBundle for the constraint configuration File.
     * 
     * @return the ResourceBundle for the constraint configuration File.
     */
    public abstract ResourceBundle getConfigurationFileResourceBundle();

    /**
     * Returns the Bundle of the contributor plug-in.
     * 
     * @return the Bundle of the contributor plug-in.
     */
    public abstract Bundle getContributorBundle();

    /**
     * returns the URL object corresponding to the filePath in the
     * Contributor plug-in
     * 
     * @param filePath
     *            the path of the file.
     * @return the URL object corresponding to the filePath in the
     *         Contributor plug-in
     */
    public abstract URL getUrlFromPath(String filePath);

}
