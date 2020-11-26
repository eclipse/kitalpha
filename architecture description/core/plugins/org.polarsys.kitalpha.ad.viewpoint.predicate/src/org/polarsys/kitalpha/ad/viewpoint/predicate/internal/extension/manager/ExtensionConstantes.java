/*******************************************************************************
 * Copyright (c) 2017, 2018 Thales Global Services.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.predicate.internal.extension.manager;

import org.polarsys.kitalpha.ad.viewpoint.predicate.interfaces.Action;

/**
 * 
 * @author Faycal Abka
 *
 */
public final class ExtensionConstantes {
	
	/**
	 * Common Constantes
	 */
	public static final String ID_ATTRIBUTE = "ID";
	public static final String CLASS_ATTRIBUTE = "class";
	public static final String DESCRIPTION_ELEMENT = "Description";
	public static final String NAME_ATTRIBUTE = "name";
	
	/**
	 * Predicate Constantes
	 */
	public static final String PREDICAT_EXTENSION_POINT = "org.polarsys.kitalpha.ad.viewpoint.predicate.declaration";
	public static final String PREDICATE_ELEMENT = "Predicate";
	public static final String PREDICATE_DIAG_MESSAGE = "Message";
	
	/**
	 * Action Constantes
	 */
	public static final String ACTION_EXTENSION_POINT = "org.polarsys.kitalpha.ad.viewpoint.action.declaration";
	public static final String ACTION_ELEMENT = "Action";
	
	/**
	 * Transition Constantes
	 */
	public static final String TRANSITION_EXTENSION_POINT = "org.polarsys.kitalpha.ad.viewpoint.transition";
	public static final String TRANSITION_ELEMENT = "Transition";
	public static final String PREDICATE_ID_ATTRIBUTE = "predicateID";
	public static final String VIEWPOINT_ID_ATTRIBUTE = "viewpointID";
	public static final String ACTION_ID_ATTRIBUTE = "actionID";
	
	/**
	 * Functions
	 */
	public static final Action NOP = c -> {}; //No operations to execute

	private ExtensionConstantes() {
		super();
		
	}
}
