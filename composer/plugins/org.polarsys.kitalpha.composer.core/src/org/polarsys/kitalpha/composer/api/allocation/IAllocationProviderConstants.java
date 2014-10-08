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


package org.polarsys.kitalpha.composer.api.allocation;

/**
 * @author Yann Mortier
 * 
 */
public interface IAllocationProviderConstants {

	public static final String POINT_ID = "org.polarsys.kitalpha.composer.allocation.provider";

	public static final String CONFIGURATION_ELEMENT_NAME = "allocationProvider";

	public static final String PROVIDER_CLASS_ATTRIBUTE = "providerClass";

	public static final String PRIORITY_ATTRIBUTE = "priority";
	
	public static final String LOWEST_PRIORITY = "lowest";
	
	public static final String LOW_PRIORITY = "low";
	
	public static final String MEDIUM_PRIORITY = "medium";
	
	public static final String HIGH_PRIORITY = "high";
	
	public static final String HIGHEST_PRIORITY = "highest";
	
}
