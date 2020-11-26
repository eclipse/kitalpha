/*******************************************************************************
 * Copyright (c) 2017 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.richtext.common.intf;

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
