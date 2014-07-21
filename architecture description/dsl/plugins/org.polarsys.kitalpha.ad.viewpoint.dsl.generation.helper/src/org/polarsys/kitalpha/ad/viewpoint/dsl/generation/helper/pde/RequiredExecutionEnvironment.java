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

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.helper.pde;

/**
 * @author Boubekeur Zendagui
 */

public enum RequiredExecutionEnvironment{
	J1_2, J1_3, J1_4, J1_5, J1_6, J1_7;
	
	/**
	 * Return the string value of the execution environment
	 */
	@Override
	public String toString(){
		switch (this) {
		case J1_2:
			return "J2SE-1.2";
		case J1_3:
			return "J2SE-1.3";
		case J1_4:
			return "J2SE-1.4";
		case J1_5:
			return "J2SE-1.5";
		case J1_6:
			return "JavaSE-1.6";
		case J1_7:
			return "JavaSE-1.7";
		}
		return "";
	}
	
	/**
	 * @param ee String identifier of Execution Environment
	 * @return corresponding Execution Environment value 
	 */
	public static RequiredExecutionEnvironment getExecutionEnvironment(String ee){
		if (ee != null && ee.equals("J2SE-1.2")) return J1_2;
		if (ee != null && ee.equals("J2SE-1.3")) return J1_3;
		if (ee != null && ee.equals("J2SE-1.4")) return J1_4;
		if (ee != null && ee.equals("J2SE-1.5")) return J1_5;
		if (ee != null && ee.equals("JavaSE-1.6")) return J1_6;
		if (ee != null && ee.equals("JavaSE-1.7")) return J1_7;
		return null;
	}
}
