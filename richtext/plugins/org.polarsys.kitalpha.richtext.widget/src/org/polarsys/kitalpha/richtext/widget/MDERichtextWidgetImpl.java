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

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.swt.browser.BrowserFunction;
import org.eclipse.swt.widgets.Composite;
import org.polarsys.kitalpha.richtext.mde.tools.managers.LinksManagerImpl;
import org.polarsys.kitalpha.richtext.nebula.widget.MDENebulaBasedRichTextWidgetImpl;
import org.polarsys.kitalpha.richtext.nebula.widget.MDENebulaRichTextConfiguration;
import org.polarsys.kitalpha.richtext.widget.internal.Activator;
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
		super.installListenersOnReadyInstance(); 
		installOpenLinkListener();
		installSaveListener();
	}


	private void installOpenLinkListener() {

		new BrowserFunction(getBrowser(), "openLinks"){ //$NON-NLS-1$
			public Object function(Object[] arguments) {
				if (arguments != null && arguments.length > 0){
					for (Object object : arguments) {
						(new LinksManagerImpl(MDERichtextWidgetImpl.this)).openLink((String)object);
					}
				}
				return null;
			};
		};
		
		StringBuffer scriptAddMenu = new StringBuffer();
		
		/*
		 * Script to be executed
		 * 
		 * CKEDITOR.on('instanceReady', function(e) {
    	 *		CKEDITOR.instances.editor.addCommand("openLink", {
         *			exec: function(editor) {
         *   			if (typeof editor.getSelection().getStartElement().is('a')) {
         *       			openLinks(editor.getSelection().getStartElement().getAttribute('href'));
         *   			}
         *			}
    	 *		});
    	 *		var openLink = {
         *			label: 'Open',
         *			command: 'openLink'
    	 *		};
    	 *		CKEDITOR.instances.editor.contextMenu.addListener(function(element, selection) {
         *			return {
         *   			openLink: CKEDITOR.TRISTATE_ON
         *			};
    	 *		});
    	 *		CKEDITOR.instances.editor.addMenuItems({
         *			openLink: {
         *   			label: 'Open',
         *   			command: 'openLink',
         *    			group: 'link',
         *    			order: 1
         *			}
    	 *		});
		 *	});
		 */

		scriptAddMenu.append("CKEDITOR.on( 'instanceReady', function(e) {");
		scriptAddMenu.append("CKEDITOR.instances.editor.addCommand(\"openLink\", {");
		scriptAddMenu.append("exec : function( editor ) {");
		scriptAddMenu.append("          if (typeof editor.getSelection().getStartElement().is('a')){ openLinks(editor.getSelection().getStartElement().getAttribute('href'));}");
		scriptAddMenu.append("    }});");
		scriptAddMenu.append("	var openLink = {");
		scriptAddMenu.append("   label : 'Open Link',");
		scriptAddMenu.append("   command : 'openLink'");
		scriptAddMenu.append("	};");
		scriptAddMenu.append("	CKEDITOR.instances.editor.contextMenu.addListener( function( element, selection ) {");
		scriptAddMenu.append("	   if (element.is('a')){return { ");
		scriptAddMenu.append("     openLink : CKEDITOR.TRISTATE_ON ");
		scriptAddMenu.append("   };}");
		scriptAddMenu.append("	});");
		scriptAddMenu.append("	CKEDITOR.instances.editor.addMenuItems({");
		scriptAddMenu.append("  openLink : {");
		scriptAddMenu.append(" label : 'Open Link',");
		scriptAddMenu.append("      command : 'openLink',");
		scriptAddMenu.append("	      group : 'link',");
		scriptAddMenu.append("	      order : 1");
		scriptAddMenu.append("	   }});");
		scriptAddMenu.append("});");
		
		if (!executeScript(scriptAddMenu.toString())){
			Activator.getDefault().getLog().log(new Status(IStatus.WARNING, Activator.PLUGIN_ID, "Rich text widget cannot install the open link command")); //$NON-NLS-1$
		};
	}
	
	private void installSaveListener(){
		
		
		new BrowserFunction(getBrowser(), "saveContent"){ //$NON-NLS-1$
			public Object function(Object[] arguments) {
				saveContent();
				return null;
			};
		};
		
		
		/*
		 * Script:
		 * 
		 * CKEDITOR.instances.editor.on('contentDom', function() {
    	 *		var editable = CKEDITOR.instances.editor.editable();
    	 *		editable.attachListener(editable, 'blur', function() {
         * 			saveContent();
    	 * 		});
		 * });
		 */
		
		StringBuffer script = new StringBuffer();
		
		script.append("CKEDITOR.instances.editor.on('contentDom', function () {");
		script.append("var editable = CKEDITOR.instances.editor.editable();");
		script.append("editable.attachListener(editable, 'blur', function () {");
		script.append("saveContent();");
		script.append("});");
		script.append("});");
		
		if (!executeScript(script.toString())){
			Activator.getDefault().getLog().log(new Status(IStatus.WARNING, Activator.PLUGIN_ID, "Rich text widget cannot install the save command")); //$NON-NLS-1$
		}
	}
	
}