/*******************************************************************************
 * Copyright (c) 2017, 2018 Thales Global Services S.A.S.
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
	protected void installListenersOnReadyInstance() {
		ListenerInstaller installer = new ListenerInstaller();
		
		super.installListenersOnReadyInstance();
		
		installer.installOnBeforePasteListener(this);
		installer.installOpenLinkListener(this);
		installer.installSaveListener(this);
		installer.installChangeNotificationHandlerListener(this);
	}
}