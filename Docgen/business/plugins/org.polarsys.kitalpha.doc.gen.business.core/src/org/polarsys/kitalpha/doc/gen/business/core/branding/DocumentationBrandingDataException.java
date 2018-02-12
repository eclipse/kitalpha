/*******************************************************************************
 * Copyright (c) 2014-2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.doc.gen.business.core.branding;

/**
 * @author Boubekeur Zendagui
 */

public class DocumentationBrandingDataException extends Exception {

	public enum ExceptionCause {
		MalformatedURL,
		FileDoesntExist,
		CantLoadContent;
	}
	
	private static final long serialVersionUID = 3027011984860752916L;

	/**
	 * 
	 * @param expCause
	 * @param arg0
	 */
	public DocumentationBrandingDataException(ExceptionCause expCause, String arg0) {
		super(getMessage(expCause, arg0));
	}
	
	/**
	 * 
	 * @param expCause
	 * @param arg0
	 * @param cause
	 */
	public DocumentationBrandingDataException(ExceptionCause expCause, String arg0, Throwable cause) {
		super(getMessage(expCause, arg0), cause);
	}
	
	/**
	 * 
	 * @param expCause
	 * @param arg0
	 * @return
	 */
	private static String getMessage(ExceptionCause expCause, String arg0){
		return expCause.toString();
	}
}
