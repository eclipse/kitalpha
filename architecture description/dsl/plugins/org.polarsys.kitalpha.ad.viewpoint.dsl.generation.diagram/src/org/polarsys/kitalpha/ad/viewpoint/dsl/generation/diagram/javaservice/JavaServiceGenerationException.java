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

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.javaservice;

/**
 * @author Boubekeur Zendagui
 */

public class JavaServiceGenerationException extends Exception {

	public static final int Method_Parameters = 10;
	public static final int Method_ReturnType = 20;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6156599159051405739L;
	
	public JavaServiceGenerationException(int origine) {
		super(getMessage(origine));
	}
	
	private static String getMessage(int origine){
		switch (origine) {
		case Method_Parameters:
			return "Caused by Method Parameter";
			
		case Method_ReturnType:
			return "Caused by Method Return Type";
		}
		return "";
	}
}
