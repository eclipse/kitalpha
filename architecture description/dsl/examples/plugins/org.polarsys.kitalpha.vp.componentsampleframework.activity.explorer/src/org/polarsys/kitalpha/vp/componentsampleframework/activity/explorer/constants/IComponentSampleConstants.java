/*******************************************************************************
 * Copyright (c) 2015 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/ 
package org.polarsys.kitalpha.vp.componentsampleframework.activity.explorer.constants;


/**
 * 
 * @author Faycal Abka
 *
 */
public interface IComponentSampleConstants {
	
	public static final String COMPONENTSAMPLE_PREFIX		 		= "org.polarsys.kitalpha.vp.componentsample";
	
	public static final String COMPONENTSAMPLE_FRAMEWORK 			= COMPONENTSAMPLE_PREFIX + "framework";
	
	public static final String COMPONENTSAMPLE 						= COMPONENTSAMPLE_PREFIX;
	
	public static final String COMPONENTSAMPLE_PERFORMANCE 			= COMPONENTSAMPLE_PREFIX + "performance";
	
	public static final String COMPONENTSAMPLE_QUALITY_ASSESSMENT	= COMPONENTSAMPLE_PREFIX + "qualityassessment";
	
	public static final String COMPONENTSAMPLE_SAFETY 				= COMPONENTSAMPLE_PREFIX + "safety";
	
	public static final String COMPONENTSAMPLE_SAFETY_PATTERN		= COMPONENTSAMPLE_PREFIX + "safetypattern";
	
	public static final String VIEWPOINTS_MANAGEMENT_PAGE_ID 		= "org.polarsys.kitalpha.vp.componentsampleframework.viewpoint.management";
	
	public static final String [] ALL_COMPONENTSAMPLE_VIEWPOINTS = {
			COMPONENTSAMPLE_FRAMEWORK,
			COMPONENTSAMPLE,
			COMPONENTSAMPLE_PERFORMANCE,
			COMPONENTSAMPLE_QUALITY_ASSESSMENT,
			COMPONENTSAMPLE_SAFETY,
			COMPONENTSAMPLE_SAFETY_PATTERN
	};
	
	public static final String COMPONENTSAMPLE_FRAMEWORK_ON_IMAGE_STATE = "icons/csf_state_on.png";
	
	public static final String COMPONENTSAMPLE_FRAMEWORK_OFF_IMAGE_STATE = "icons/csf_state_off.png";
	
	public static final String COMPONENTSAMPLE_ON_IMAGE_STATE = "icons/csv_state_on.png";
	
	public static final String COMPONENTSAMPLE_OFF_IMAGE_STATE = "icons/csv_state_off.png";
	
	public static final String COMPONENTSAMPLE_PERFO_ON_IMAGE_STATE = "icons/csp_state_on.png";
	
	public static final String COMPONENTSAMPLE_PERFO_OFF_IMAGE_STATE = "icons/csp_state_off.png";
	
	public static final String COMPONENTSAMPLE_QUALITY_ASSESSMENT_ON_IMAGE_STATE = "icons/csqa_state_on.png";
	
	public static final String COMPONENTSAMPLE_QUALITY_ASSESSMENT_OFF_IMAGE_STATE = "icons/csqa_state_off.png";
	
	public static final String COMPONENTSAMPLE_SAFETY_ON_IMAGE_STATE = "icons/cssafety_state_on.png";
	
	public static final String COMPONENTSAMPLE_SAFETY_OFF_IMAGE_STATE = "icons/cssafety_state_off.png";
	
	public static final String COMPONENTSAMPLE_SAFETY_PATTERN_ON_IMAGE_STATE = "icons/cssafetypattern_state_on.png";
	
	public static final String COMPONENTSAMPLE_SAFETY_PATTERN_OFF_IMAGE_STATE = "icons/cssafetypattern_state_off.png";

	public static final String UNKNOWN_VIEWPOINT_IMAGE_STATE = "icons/unknown_vp.png";

}
