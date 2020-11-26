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
public class MDERichtextWidgetEditorImpl extends MDENebulaBasedRichTextWidgetImpl {

	protected ListenerInstaller installer = new ListenerInstaller();
	
	public MDERichtextWidgetEditorImpl(Composite parent) {
		super(parent);
	}

	public MDERichtextWidgetEditorImpl(Composite parent, int style) {
		super(parent, style);
	}

	public MDERichtextWidgetEditorImpl(Composite parent, MDENebulaRichTextConfiguration configuration, int style) {
		super(parent, configuration, style);
	}

	public MDERichtextWidgetEditorImpl(Composite parent, MDENebulaRichTextConfiguration configuration) {
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
