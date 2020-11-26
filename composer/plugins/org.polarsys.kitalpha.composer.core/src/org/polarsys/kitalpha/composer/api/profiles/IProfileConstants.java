/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.composer.api.profiles;

/**
 * Constants for profiles management.
 * 
 * @author Yann Mortier
 */
public interface IProfileConstants {

	/**
	 * The extension point id.
	 */
	String POINT_ID = "org.polarsys.kitalpha.composer.profile";

	/**
	 * The name of the configuration element for profiles.
	 */
	String CONFIGURATION_ELEMENT_NAME = "composerProfile";

	/**
	 * The name of the profile.
	 */
	String PROFILE_NAME_ATTRIBUTE = "name";

	/**
	 * The allocation binding of the profile.
	 */
	String ALLOCATION_BINDING_ATTRIBUTE = "allocationNsUri";

	/**
	 * The name of the configuration element for a Strategy.
	 */
	String STRATEGY_CONFIGURATION_ELEMENT_NAME = "strategy";

	/**
	 * The name of the configuration element for a Refinery.
	 */
	String REFINERY_CONFIGURATION_ELEMENT_NAME = "refinery";

	/**
	 * The name of the configuration element for a Generator.
	 */
	String GENERATOR_CONFIGURATION_ELEMENT_NAME = "generator";

	/**
	 * The name of the id attribute (for strategies, refineries, generetors and
	 * worflows).
	 */
	String ID_ATTRIBUTE = "id";

	/**
	 * The name of a configuration element for
	 */
	String PARAMETER_CONFIGURATION_ELEMENT_NAME = "parameter";

	/**
	 * Parameter name attribute
	 */
	String PARAMETER_NAME_ATTRIBUTE = "parameterName";

	/**
	 * Parameter value attribute.
	 */
	String PARAMETER_VALUE_ATTRIBUTE = "parameterValue";
	
	/**
	 * Configuration element for activities to execute before the strategy.
	 */
	String BEFORE_STRATEGY_ACTIVITIES_CONFIGURATION_ELEMENT = "beforeStrategyActivities";
	
	/**
	 * Configuration element for activities to execute before the refinery.
	 */
	String BEFORE_REFINERY_ACTIVITIES_CONFIGURATION_ELEMENT = "beforeRefineryActivities";
	
	/**
	 * Configuration element for activities to execute before the generator.
	 */
	String BEFORE_GENERATOR_ACTIVITIES_CONFIGURATION_ELEMENT = "beforeGeneratorActivities";

	/**
	 * Configuration element for activities to execute after the generator.
	 */
	String AFTER_GENERATOR_ACTIVITIES_CONFIGURATION_ELEMENT = "afterGeneratorActivities";

	/**
	 * Configuration element for a cadence activity (beforeStrategy,
	 * beforeRefinery, etc.).
	 */
	String CADENCE_ACTIVITY_CONFIGURATION_ELEMENT = "activity";
	
	/**
	 * Configuration element for all libraries configuration element 
	 */
	String LIBRARIES_PACKAGE_ELEMENT_NAME ="libraries";
	
	/**
	 * The name of the configuration element for a Library.
	 */
	String LIBRARY_CONFIGURATION_ELEMENT_NAME = "library";

	String ALLOCATION_BINDING_ID_ATTRIBUTE = "bindingId";

}
