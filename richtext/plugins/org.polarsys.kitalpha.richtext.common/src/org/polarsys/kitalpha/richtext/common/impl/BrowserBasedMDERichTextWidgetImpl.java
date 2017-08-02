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
package org.polarsys.kitalpha.richtext.common.impl;

import org.eclipse.core.runtime.Assert;
import org.polarsys.kitalpha.richtext.common.intf.BrowserBasedMDERichTextWidget;
import org.eclipse.swt.browser.LocationListener;
import org.eclipse.swt.widgets.Composite;

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
