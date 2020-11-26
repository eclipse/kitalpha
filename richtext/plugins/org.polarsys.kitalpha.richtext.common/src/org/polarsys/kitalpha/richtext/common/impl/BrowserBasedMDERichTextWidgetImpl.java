/*******************************************************************************
 * Copyright (c) 2017, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.richtext.common.impl;

import org.eclipse.core.runtime.Assert;
import org.eclipse.swt.browser.LocationListener;
import org.eclipse.swt.widgets.Composite;
import org.polarsys.kitalpha.richtext.common.intf.BrowserBasedMDERichTextWidget;

/**
 * 
 * @author Faycal Abka
 *
 */
public abstract class BrowserBasedMDERichTextWidgetImpl extends AbstractMDERichTextWidget
		implements BrowserBasedMDERichTextWidget {

	public BrowserBasedMDERichTextWidgetImpl(Composite parent) {
		super(parent);
	}
	

	@Override
	public void addLocationListener(LocationListener listener) {
		Assert.isNotNull(listener);
		if (getBrowser() != null){
			getBrowser().addLocationListener(listener);
		}
	}

	@Override
	public void removeLocationListener(LocationListener listener) {
		Assert.isNotNull(listener);
		if (getBrowser() != null){
			getBrowser().removeLocationListener(listener);
		}
	}
	
	@Override
	public boolean executeScript(String script) {
		if (getBrowser() != null){
			return getBrowser().execute(script);
		}
		return false;
	}
	
	@Override
	public Object evaluateScript(String script) {
		if (getBrowser() != null){
			return getBrowser().evaluate(script);
		}
		return null;
	}
}
