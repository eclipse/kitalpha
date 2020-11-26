/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
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
	@Override
	public IAllocationProvider getAllocationProvider() {
		if (provider == null && valid) {
			provider = createAllocationProvider();
		}
		return provider;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.polarsys.kitalpha.composer.internal.IAllocationProviderDescriptor#getAllocationProviderClassName()
	 */
	@Override
	public String getAllocationProviderClassName() {
		return configurationElement
				.getAttribute(IAllocationProviderConstants.PROVIDER_CLASS_ATTRIBUTE);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.polarsys.kitalpha.composer.internal.IAllocationProviderDescriptor#getPriority()
	 */
	@Override
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

	@Override
	public boolean provides(Root rootAllocation, EObject unknownElement) {
		return this.getAllocationProvider() != null
				&& this.getAllocationProvider().provides(rootAllocation,
						unknownElement);
	}

}
