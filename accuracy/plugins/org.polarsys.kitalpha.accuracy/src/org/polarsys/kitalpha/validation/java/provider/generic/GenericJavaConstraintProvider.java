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

import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.emf.validation.service.AbstractConstraintDescriptor;
import org.polarsys.kitalpha.validation.provider.generic.GenericConstraintFactory;
import org.polarsys.kitalpha.validation.provider.generic.GenericConstraintProvider;
import org.polarsys.kitalpha.validation.provider.generic.GenericConstraintProviderService;

/**
 * Provides Java Constraints.
 * 
 * @author Yann Mortier
 */
public abstract class GenericJavaConstraintProvider extends GenericConstraintProvider {

    private void addConstraintToGlobalConstraintCollection(JavaConstraintDescriptor currentConstraintDescriptor) {
        this.getConstraints().add(currentConstraintDescriptor.getJavaConstraint());
    }
    
    /**
     * @see org.eclipse.emf.validation.service.AbstractConstraintProvider#setInitializationData(org.eclipse.core.runtime.IConfigurationElement,
     *      java.lang.String, java.lang.Object)
     */
    @Override
    public void setInitializationData(IConfigurationElement config, String propertyName, Object data) throws CoreException {
        super.setInitializationData(config, propertyName, data);

        config.getContributor().getClass().getClassLoader();

        // create the constraint category
        // getDeclaringExtension().getUniqueIdentifier() is the extension id
        // field
        // in plugin.xml
        
        /*
         * FIXME: To resolve a dead stores issue, we must know why this call is done here and stored
         * in the local variable constraintProviderID without using it further.
         * If it is necessary, the snippet is shared between this class and GenericJavaConstraintProvider.
         * These classes inherite from the same class, then, we can put this snippet in the super class
         */
        String constraintProviderID = config.getDeclaringExtension().getUniqueIdentifier();

        if (constraintProviderID == null) {
            constraintProviderID = "JavaProvider@" + Long.toHexString(System.identityHashCode(this)); //$NON-NLS-1$
        }

        GenericConstraintProviderService.getInstance().registerProvider(this);
        final List<? extends AbstractConstraintDescriptor> descriptors = GenericConstraintProviderService.getInstance().getDescriptors(this);
        for (final AbstractConstraintDescriptor descriptor : descriptors) {
            if (descriptor instanceof JavaConstraintDescriptor)
                addConstraintToGlobalConstraintCollection((JavaConstraintDescriptor) descriptor);
        }
    }

    /**
     * {@inheritDoc}
     * 
     * @see org.polarsys.kitalpha.validation.provider.generic.GenericConstraintProvider#getConstraintFactory()
     */
    @Override
    public GenericConstraintFactory getConstraintFactory() {
        return new GenericJavaConstraintFactory(this);
    }

}
