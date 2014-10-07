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
package org.polarsys.kitalpha.validation.ocl.provider.generic;

import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.emf.validation.service.AbstractConstraintDescriptor;
import org.eclipse.ocl.ecore.OCL;

import org.polarsys.kitalpha.validation.ocl.provider.generic.util.OCLConstraint;
import org.polarsys.kitalpha.validation.ocl.provider.generic.util.OCLConstraintDescriptor;
import org.polarsys.kitalpha.validation.provider.generic.GenericConstraintFactory;
import org.polarsys.kitalpha.validation.provider.generic.GenericConstraintProvider;
import org.polarsys.kitalpha.validation.provider.generic.GenericConstraintProviderService;

/**
 * A generic provider that is able to provides constraints parsed from OCL
 * files.
 * 
 */
public abstract class GenericOCLConstraintProvider extends GenericConstraintProvider {

    @SuppressWarnings("unchecked")
    private void addConstraintToGlobalConstraintCollection(OCLConstraintDescriptor currentConstraintDescriptor) {
        OCLConstraint cst = new OCLConstraint(currentConstraintDescriptor, OCL.newInstance());
        this.getConstraints().add(cst);
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
        String constraintProviderID = config.getDeclaringExtension().getUniqueIdentifier();

        if (constraintProviderID == null) {
            constraintProviderID = "OCLProvider@" + Long.toHexString(System.identityHashCode(this)); //$NON-NLS-1$
        }

        GenericConstraintProviderService.getInstance().registerProvider(this);
        final List<? extends AbstractConstraintDescriptor> descriptors = GenericConstraintProviderService.getInstance().getDescriptors(this);
        for (final AbstractConstraintDescriptor descriptor : descriptors) {
            if (descriptor instanceof OCLConstraintDescriptor)
                addConstraintToGlobalConstraintCollection((OCLConstraintDescriptor) descriptor);
        }
    }

    @Override
    public GenericConstraintFactory getConstraintFactory() {
        return new GenericOCLConstraintFactory(this);
    }

}
