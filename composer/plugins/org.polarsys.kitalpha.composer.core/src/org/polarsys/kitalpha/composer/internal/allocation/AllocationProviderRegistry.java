/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
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

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;

import org.polarsys.kitalpha.composer.api.allocation.AllocationProviderPriority;
import org.polarsys.kitalpha.composer.api.allocation.IAllocationProvider;
import org.polarsys.kitalpha.composer.api.allocation.IAllocationProviderConstants;
import org.polarsys.kitalpha.composer.api.allocation.IAllocationProviderDescriptor;
import org.polarsys.kitalpha.composer.api.allocation.IAllocationProviderRegistry;
import org.polarsys.kitalpha.composer.metamodel.allocation.base.Root;

/**
 * 
 * @author Yann Mortier
 */
public class AllocationProviderRegistry implements IAllocationProviderRegistry {

	private SortedSet<IAllocationProviderDescriptor> providers;

	public AllocationProviderRegistry() {
		providers = new TreeSet<IAllocationProviderDescriptor>(
				new AllocationProviderDescriptorComparator());
		loadExtensions();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.polarsys.kitalpha.composer.internal.IAllocationProviderRegistry#register(org.polarsys.kitalpha.composer.internal.AllocationProviderDescriptor)
	 */
	@Override
	public void register(IAllocationProviderDescriptor descriptor) {
		this.providers.add(descriptor);
	}

	@Override
	public IAllocationProvider getBestProvider(Root rootAllocation,
			EObject unknownElement) {
		for (IAllocationProviderDescriptor descriptor : this.providers) {
			if (descriptor.provides(rootAllocation, unknownElement)) {
				return descriptor.getAllocationProvider();
			}
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.polarsys.kitalpha.composer.internal.IAllocationProviderRegistry#unregister(org.polarsys.kitalpha.composer.internal.AllocationProviderDescriptor)
	 */
	@Override
	public void unregister(IAllocationProviderDescriptor descriptor) {
		this.providers.remove(descriptor);
	}

	private void loadExtensions() {
		for (IExtension extension : Platform.getExtensionRegistry()
				.getExtensionPoint(IAllocationProviderConstants.POINT_ID)
				.getExtensions()) {
			for (IConfigurationElement configurationElement : extension
					.getConfigurationElements()) {
				if (IAllocationProviderConstants.CONFIGURATION_ELEMENT_NAME
						.equals(configurationElement.getName())) {
					AllocationProviderPriority priority = getPriority(configurationElement
							.getAttribute(IAllocationProviderConstants.PRIORITY_ATTRIBUTE));
					AllocationProviderDescriptor descriptor = new AllocationProviderDescriptor(
							configurationElement, priority);
					register(descriptor);
				}
			}
		}
	}

	private AllocationProviderPriority getPriority(String attribute) {
		AllocationProviderPriority result = null;
		if (IAllocationProviderConstants.LOWEST_PRIORITY.equals(attribute)) {
			result = AllocationProviderPriority.LOWEST;
		} else if (IAllocationProviderConstants.LOW_PRIORITY.equals(attribute)) {
			result = AllocationProviderPriority.LOW;
		} else if (IAllocationProviderConstants.MEDIUM_PRIORITY
				.equals(attribute)) {
			result = AllocationProviderPriority.MEDIUM;
		} else if (IAllocationProviderConstants.HIGH_PRIORITY.equals(attribute)) {
			result = AllocationProviderPriority.HIGH;
		} else if (IAllocationProviderConstants.HIGHEST_PRIORITY
				.equals(attribute)) {
			result = AllocationProviderPriority.HIGHEST;
		}
		return result;
	}

	private static class AllocationProviderDescriptorComparator implements
			Comparator<IAllocationProviderDescriptor> {

		@Override
		public int compare(IAllocationProviderDescriptor o1,
				IAllocationProviderDescriptor o2) {
			if (o1.getPriority() == o2.getPriority()) {
				return o2.getAllocationProviderClassName().compareTo(
						o1.getAllocationProviderClassName());
			}
			return o2.getPriority().ordinal() - o1.getPriority().ordinal();
		}

	}

}
