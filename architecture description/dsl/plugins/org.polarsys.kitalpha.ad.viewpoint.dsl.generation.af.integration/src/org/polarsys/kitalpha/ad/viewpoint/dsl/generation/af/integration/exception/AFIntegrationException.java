/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.af.integration.exception;

/**
 * @author Boubekeur Zendagui
 */

public class AFIntegrationException extends Exception {
	
	private static final StackTraceElement[] EmptyStack = null;

	public static final int Unknown = -1;
	public static final int Bundle = 00;
	public static final int EPackage = 10; 
	public static final int Representation = 20;
	public static final int Patch_Model = 30;
	public static final int Patch_Manifest = 40;
	public static final int AF_Bundle = 100;
	
	public static final String component_Existing_MSG = "You try to add a registered component of type "; //$NON-NLS-N$ 
	public static final String model_save_MSG = "An exception occures when trying to save AF model "; //$NON-NLS-N$ 
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -55249468525980940L;
	
	private int _component_id = Unknown;
	
	public AFIntegrationException(int component_id, String main_msg, StackTraceElement[] orginalStack) {
		super(main_msg != null && getComponentName(component_id).trim().length() > 0 
				? main_msg + getComponentName(component_id) 
				: getComponentName(component_id));

		_component_id = component_id;
		if (orginalStack != null && orginalStack.length > 0)
			this.setStackTrace(orginalStack);
	}
	
	public AFIntegrationException(int component_id, String main_msg) {
		new AFIntegrationException(component_id, main_msg, EmptyStack);
	}
	
	public AFIntegrationException(int component_id, StackTraceElement[] orginalStack) {
		new AFIntegrationException(component_id, null, orginalStack);
	}

	public AFIntegrationException(int component_id) {
		new AFIntegrationException(component_id, null, EmptyStack);
	}
	
	public int getComponentID(){
		return _component_id;
	}
	
	private static String getComponentName(int component_id){
		switch (component_id) {
		case EPackage:
			return "EPackage";
		case Representation:
			return "Representation";

		default:
			return "";
		}
	}
}
