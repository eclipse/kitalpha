/*******************************************************************************
 * Copyright (c) 2017, 2020 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.richtext.widget;

import org.eclipse.swt.widgets.Composite;
import org.polarsys.kitalpha.richtext.nebula.widget.MDENebulaBasedRichTextWidgetImpl;
import org.polarsys.kitalpha.richtext.nebula.widget.MDENebulaRichTextConfiguration;
import org.polarsys.kitalpha.richtext.widget.internal.ListenerInstaller;

/**
 * 
 * @author Faycal Abka
 *
 */
public class MDERichtextWidgetImpl extends MDENebulaBasedRichTextWidgetImpl {
	
	protected ListenerInstaller installer = new ListenerInstaller();

	public MDERichtextWidgetImpl(Composite parent) {
		super(parent);		
	}

	public MDERichtextWidgetImpl(Composite parent, int style) {
		super(parent, style);
	}

	public MDERichtextWidgetImpl(Composite parent, MDENebulaRichTextConfiguration configuration, int style) {
		super(parent, configuration, style);
	}

	public MDERichtextWidgetImpl(Composite parent, MDENebulaRichTextConfiguration configuration) {
		super(parent, configuration);
	}

	@Override
	public void installListenersOnReadyInstance() {
		super.installListenersOnReadyInstance();

		installer.createAllListeners(this);
		installer.installAllListeners(this);
	}

	@Override
	public boolean setBaseHrefPath(String baseHref) {
		boolean change = super.setBaseHrefPath(baseHref);

		if (change) {
			installer.installAllListeners(this);
		}

		return change;
	}
}