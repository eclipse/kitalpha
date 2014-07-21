/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.emde.xmi;

/**
 * @author Xavier Maysonnave
 * 
 */
public class SAXLocator {

	private final int lineNumber;

	private final int columnNumber;

	public SAXLocator(int lineNumber, int columnNumber) {
		this.lineNumber = lineNumber;
		this.columnNumber = columnNumber;
	}

	public int getColumnNumber() {
		return columnNumber;
	}

	public int getLineNumber() {
		return lineNumber;
	}

}
