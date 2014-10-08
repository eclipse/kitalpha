/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.composer.internal.allocation;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.emf.ecore.EObject;

import org.polarsys.kitalpha.composer.Activator;
import org.polarsys.kitalpha.composer.api.allocation.AllocationProviderPriority;
import org.polarsys.kitalpha.composer.api.allocation.IAllocationProvider;
import org.polarsys.kitalpha.composer.api.allocation.IAllocationProviderConstants;
import org.polarsys.kitalpha.composer.api.allocation.IAllocationProviderDescriptor;
import org.polarsys.kitalpha.composer.metamodel.allocation.base.Root;

/**
 * @author Yann Mortier
 */
public class AllocationProviderDescriptor implements
		IAllocationProviderDescriptor {

	private IConfigurationElement configurationElement;

	private AllocationProviderPriority priority;

	private IAllocationProvider provider;

	private boolean valid = true;

	public AllocationProviderDescriptor(
			IConfigurationElement configurationElement,
			AllocationProviderPriority priority) {
		this.configurationElement = configurationElement;
		this.priority = priority;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.polarsys.kitalpha.composer.internal.IAllocationProviderDescriptor#getAllocationProvider()
	 */
	public IAllocationProvider getAllocationProvider() {
		if (provider == null && valid)
			provider = createAllocationProvider();
		return provider;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.polarsys.kitalpha.composer.internal.IAllocationProviderDescriptor#getAllocationProviderClassName()
	 */
	public String getAllocationProviderClassName() {
		return configurationElement
				.getAttribute(IAllocationProviderConstants.PROVIDER_CLASS_ATTRIBUTE);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.polarsys.kitalpha.composer.internal.IAllocationProviderDescriptor#getPriority()
	 */
	public AllocationProviderPriority getPriority() {
		return priority;
	}

	private IAllocationProvider createAllocationProvider() {
		try {
			return (IAllocationProvider) configurationElement
					.createExecutableExtension(IAllocationProviderConstants.PROVIDER_CLASS_ATTRIBUTE);
		} catch (CoreException e) {
			Activator.getDefault().getLog().log(e.getStatus());
			valid = false;
		}
		return null;
	}

	public boolean provides(Root rootAllocation, EObject unknownElement) {
		return this.getAllocationProvider() != null
				&& this.getAllocationProvider().provides(rootAllocation,
						unknownElement);
	}

}
