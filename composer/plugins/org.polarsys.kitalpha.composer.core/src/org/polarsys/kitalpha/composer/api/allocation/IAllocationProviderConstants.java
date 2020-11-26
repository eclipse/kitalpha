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


package org.polarsys.kitalpha.composer.api.allocation;

/**
 * @author Yann Mortier
 * 
 */
public interface IAllocationProviderConstants {

	String POINT_ID = "org.polarsys.kitalpha.composer.allocation.provider";

	String CONFIGURATION_ELEMENT_NAME = "allocationProvider";

	String PROVIDER_CLASS_ATTRIBUTE = "providerClass";

	String PRIORITY_ATTRIBUTE = "priority";
	
	String LOWEST_PRIORITY = "lowest";
	
	String LOW_PRIORITY = "low";
	
	String MEDIUM_PRIORITY = "medium";
	
	String HIGH_PRIORITY = "high";
	
	String HIGHEST_PRIORITY = "highest";
	
}
