/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
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
	
	public AFIntegrationException(int componentid, String mainMsg, StackTraceElement[] orginalStack) {
		super(mainMsg != null && getComponentName(componentid).trim().length() > 0 
				? mainMsg + getComponentName(componentid) 
				: getComponentName(componentid));

		_component_id = componentid;
		if (orginalStack != null && orginalStack.length > 0) {
			this.setStackTrace(orginalStack);
		}
	}
	
	public AFIntegrationException(int componentid, String main_msg) {
		new AFIntegrationException(componentid, main_msg, EmptyStack);
	}
	
	public AFIntegrationException(int componentId, StackTraceElement[] orginalStack) {
		new AFIntegrationException(componentId, null, orginalStack);
	}

	public AFIntegrationException(int componentid) {
		new AFIntegrationException(componentid, null, EmptyStack);
	}
	
	public int getComponentID(){
		return _component_id;
	}
	
	private static String getComponentName(int componentid){
		switch (componentid) {
		case EPackage:
			return "EPackage";
		case Representation:
			return "Representation";

		default:
			return "";
		}
	}
}
