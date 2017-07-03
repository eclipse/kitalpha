/*******************************************************************************
 * Copyright (c) 2017 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.eclipse.kitalpha.richtext.common.intf;

import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.LocationListener;

/**
 * 
 * @author Faycal Abka
 *
 */
public interface BrowserBasedMDERichTextWidget {
	
	/**
	 * @return
	 */
	Browser getBrowser();
	
	/**
	 * TODO
	 * @param listener
	 */
	void addLocationListener(LocationListener listener);
	
	/**
	 * TODO
	 * @param listener
	 */
	void removeLocationListener(LocationListener listener);
	
	/**
	 * Execute script  
	 * @param script
	 * @return
	 */
	boolean executeScript(String script);
	
	/**
	 * Evaluate script commands
	 * @param script
	 * @return
	 */
	Object evaluateScript(String script);
	

}
