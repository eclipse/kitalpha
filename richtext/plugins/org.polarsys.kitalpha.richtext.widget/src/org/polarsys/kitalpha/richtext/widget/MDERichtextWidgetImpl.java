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
package org.polarsys.kitalpha.richtext.widget;

import org.eclipse.swt.browser.BrowserFunction;
import org.eclipse.swt.widgets.Composite;
import org.polarsys.kitalpha.richtext.mde.tools.managers.LinksManagerImpl;
import org.polarsys.kitalpha.richtext.nebula.widget.MDENebulaBasedRichTextWidgetImpl;
import org.polarsys.kitalpha.richtext.nebula.widget.MDENebulaRichTextConfiguration;
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

	protected void installListenersOnReadyInstance() {
		super.installListenersOnReadyInstance(); //
		installOpenLinkListener();		
	}



	/**
	 * Install handler to open links by CTRL-CLICK
	 */
	private void installOpenLinkListener() {
		StringBuffer script = new StringBuffer();

		/*
		 * Add ctrl-click listener when the editor is ready
		 * 
		 * CKEDITOR.on('instanceReady', function(event) {
		 * 		$('iframe').contents().click(function(e) {
		 *			if (typeof e.target.href != 'undefined' && e.ctrlKey == true) {
		 *   			openLink(e.target.href); //Callback to java
		 *			}
		 *		});
		 *	});
		 */

		script.append("CKEDITOR.on('instanceReady', function(event) {	")
		.append("$('iframe').contents().click(function(e) {")
		.append("if(typeof e.target.href != 'undefined' && e.ctrlKey == true) {	")
		.append("openLink(e.target.href);")
		.append("}});});");

		executeScript(script.toString());

		//TODO maybe install dispose or location listener to release this function?
		new BrowserFunction(getBrowser(), "openLink"){ //$NON-NLS-1$
			public Object function(Object[] arguments) {
				if (arguments != null && arguments.length > 0){
					for (Object object : arguments) {
						(new LinksManagerImpl()).openLink((String)object);
					}
				}
				return null;
			};
		};
	};
}