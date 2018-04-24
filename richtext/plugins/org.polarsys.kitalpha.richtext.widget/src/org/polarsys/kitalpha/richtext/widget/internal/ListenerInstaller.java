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
package org.polarsys.kitalpha.richtext.widget.internal;

import java.beans.PropertyChangeEvent;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.swt.browser.BrowserFunction;
import org.polarsys.kitalpha.richtext.common.intf.MDERichTextWidget;
import org.polarsys.kitalpha.richtext.nebula.widget.MDENebulaBasedRichTextWidget;
import org.polarsys.kitalpha.richtext.widget.editor.MDERichTextEditor;
import org.polarsys.kitalpha.richtext.widget.editor.intf.MDERichTextEditorCallback;
import org.polarsys.kitalpha.richtext.widget.tools.manager.LinkManagerImpl;

/**
 * 
 * @author Faycal Abka
 * @author Minh Tu Ton That
 *
 */
public class ListenerInstaller {

	// The text you want to paste seems to be copied from Non-XHTML source. Do
	// you want to clean it before pasting?\nIt's not recommended to cancel the
	// clean to avoid Non-XHTML description.\n
	public void installOnBeforePasteListener(final MDENebulaBasedRichTextWidget widget) {

		new BrowserFunction(widget.getBrowser(), "getConfirmCleanupMsg") { //$NON-NLS-1$
			@Override
			public Object function(Object[] arguments) {
				return "Press OK to clean the Non-XHTML before pasting.\n\n"
						+ "Press Cancel to paste text as it is (not recommended) or better use toolbar action \"Paste as plain text\"";
			}
		};

		StringBuilder script = new StringBuilder();
		script.append("editor = CKEDITOR.instances.editor;");
		script.append("editor.on('beforePaste', function (event) {");
		script.append("editor.lang.pastefromword.confirmCleanup = getConfirmCleanupMsg();");
		script.append("});");

		// Set pasteFromWordPromptCleanup to false to prevent the confirm dialog
		// from appearing on paste as plain text
		// command
		script.append("editor.on('beforeCommandExec', function (cmd) {");
		script.append("if(cmd.data.name == 'pastetext'){");
		script.append("editor.config.pasteFromWordPromptCleanup = false;");
		script.append("}});");

		// Set the pasteFromWordPromptCleanup to true
		script.append("editor.on('afterPaste', function (event) {");
		script.append("editor.config.pasteFromWordPromptCleanup = true;");
		script.append("});");

		if (!widget.executeScript(script.toString())) {
			Activator.getDefault().getLog().log(new Status(IStatus.WARNING, Activator.PLUGIN_ID,
					"Rich text widget can not install beforePaste/afterPaste/beforeCommandExec listeners!")); //$NON-NLS-1$
		}
	}

	public void installOpenLinkListener(final MDENebulaBasedRichTextWidget widget) {

		new BrowserFunction(widget.getBrowser(), "openLinks") { //$NON-NLS-1$
			@Override
			public Object function(Object[] arguments) {
				if (arguments != null && arguments.length > 0) {
					for (Object object : arguments) {
						(new LinkManagerImpl(widget)).openLink((String) object);
					}
				}
				return null;
			}
		};

		StringBuilder scriptAddMenu = new StringBuilder();

		/*
		 * Script to be executed
		 * 
		 * CKEDITOR.on( 'currentInstance', function(e) {
		 * CKEDITOR.currentInstance.on('doubleclick', function(ev) { var element
		 * = CKEDITOR.plugins.link.getSelectedLink( CKEDITOR.currentInstance )
		 * || ev.data.element; if (element!=undefined && element.is( 'a' ) ) {
		 * ev.stop(); openLinks(element.getAttribute('href')); } }, null, null,
		 * 1); });
		 * 
		 * CKEDITOR.on('instanceReady', function(e) {
		 * CKEDITOR.instances.editor.addCommand("openLink", { exec:
		 * function(editor) { var linkTag =
		 * editor.getSelection().getStartElement().getAscendant('a', true); if
		 * (linkTag != null && linkTag.is('a')){
		 * openLinks(linkTag.getAttribute('href')); } } }); var openLink = {
		 * label: 'Open', command: 'openLink' };
		 * CKEDITOR.instances.editor.contextMenu.addListener(function(element,
		 * selection) { return { var linkTag = element.getAscendant('a', true);
		 * if (linkTag != null && linkTag.is('a')){return { openLink:
		 * CKEDITOR.TRISTATE_ON; } }; });
		 * CKEDITOR.instances.editor.addMenuItems({ openLink: { label: 'Open',
		 * command: 'openLink', group: 'link', order: 1 } }); });
		 */

		// Override the default double click event of CKEDITOR to open links
		scriptAddMenu.append("  CKEDITOR.instances.editor.on('doubleclick', function(event)");
		scriptAddMenu.append("  {");
		scriptAddMenu.append(
				"    var element = CKEDITOR.plugins.link.getSelectedLink( CKEDITOR.currentInstance ) || event.data.element;");
		scriptAddMenu.append("    if (element!=undefined &&  element.is( 'a' ) ) {");
		scriptAddMenu.append("      event.stop();");
		scriptAddMenu.append("      openLinks(element.getAttribute('href'));");
		scriptAddMenu.append("    }");
		scriptAddMenu.append("  }, null, null, 1);");

		scriptAddMenu.append("CKEDITOR.on( 'instanceReady', function(e) {");

		scriptAddMenu.append("CKEDITOR.instances.editor.addCommand(\"openLink\", {");
		scriptAddMenu.append("exec : function( editor ) {");
		scriptAddMenu
				.append("			var linkTag = editor.getSelection().getStartElement().getAscendant('a', true);");
		scriptAddMenu
				.append("          if (linkTag != null && linkTag.is('a')){ openLinks(linkTag.getAttribute('href'));}");
		scriptAddMenu.append("    }});");
		scriptAddMenu.append("	var openLink = {");
		scriptAddMenu.append("   label : 'Open Link',");
		scriptAddMenu.append("   command : 'openLink'");
		scriptAddMenu.append("	};");
		scriptAddMenu.append("	CKEDITOR.instances.editor.contextMenu.addListener( function( element, selection ) {");
		scriptAddMenu.append("	   var linkTag = element.getAscendant('a', true);");
		scriptAddMenu.append("	   if (linkTag != null && linkTag.is('a')){return { ");
		scriptAddMenu.append("     	openLink : CKEDITOR.TRISTATE_ON ");
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

		if (!widget.executeScript(scriptAddMenu.toString())) {
			Activator.getDefault().getLog().log(new Status(IStatus.WARNING, Activator.PLUGIN_ID,
					"Rich text widget cannot install the open link command")); //$NON-NLS-1$
		}
	}

	public void installSaveListener(final MDENebulaBasedRichTextWidget widget) {

		/**
		 * Callback which save the content at focus out event
		 */
		new BrowserFunction(widget.getBrowser(), "saveContent") { //$NON-NLS-1$
			@Override
			public Object function(Object[] arguments) {
				widget.saveContent();
				return null;
			}
		};

		/*
		 * Script:
		 * 
		 * CKEDITOR.instances.editor.on('blur', function() { saveContent(); });
		 */

		StringBuilder script = new StringBuilder();

		script.append("CKEDITOR.instances.editor.on('blur', function () {");
		script.append("saveContent();");
		script.append("});");

		if (!widget.executeScript(script.toString())) {
			Activator.getDefault().getLog().log(new Status(IStatus.WARNING, Activator.PLUGIN_ID,
					"Rich text widget cannot install the save handler")); //$NON-NLS-1$
		}
	}

	public void installChangeNotificationHandlerListener(final MDENebulaBasedRichTextWidget widget) {

		/**
		 * Fire change content notification to all widgets
		 */
		new BrowserFunction(widget.getBrowser(), "changeHandler") { //$NON-NLS-1$
			@Override
			public Object function(Object[] arguments) {
				if (arguments != null && arguments.length > 0) {
					PropertyChangeEvent event = new PropertyChangeEvent(widget, "widgetContent", null,
							(String) arguments[0]);
					widget.firePropertyChangeEvent(event);
				}
				return null;
			}
		};

		/*
		 * Script:
		 * 
		 * CKEDITOR.instances.editor.on('blur', function() { saveContent();
		 * changeHandler(data); });
		 */
		StringBuilder script = new StringBuilder();

		script.append("CKEDITOR.instances.editor.on('blur', function () {");
		script.append("changeHandler(CKEDITOR.instances.editor.getData());");
		script.append("});");

		if (!widget.executeScript(script.toString())) {
			Activator.getDefault().getLog().log(new Status(IStatus.WARNING, Activator.PLUGIN_ID,
					"Rich text widget cannot install the notification handler")); //$NON-NLS-1$
		}
	}

	public void installChangeContentListener(final MDENebulaBasedRichTextWidget widget) {

		new BrowserFunction(widget.getBrowser(), "firePropertyChangeEvent") { //$NON-NLS-1$
			@Override
			public Object function(Object[] arguments) {
				if (!widget.isDirtyStateUpdated() && widget.isDirty()) {
					// As a performance improvement, the saveContent is only
					// called only if the dirty state of the widget is not
					// updated
					widget.saveContent();
					widget.setDirtyStateUpdated(true);
				}
				return null;
			}
		};

		StringBuilder script = new StringBuilder();

		/**
		 * Notice that firePropertyChangeEvent() javascript function is defined
		 * MDERichTextEditor.
		 */
		script.append("CKEDITOR.instances.editor.on('change', function () {");
		script.append("firePropertyChangeEvent();");
		script.append("});");

		if (!widget.executeScript(script.toString())) {
			Activator.getDefault().getLog().log(new Status(IStatus.WARNING, Activator.PLUGIN_ID,
					"Rich text widget cannot install firePropertyChangeEvent handler")); //$NON-NLS-1$
		}
	}

	/**
	 * 
	 * Reset the dirty state when the widget regains the focus
	 */
	public void installFocusEventListener(final MDENebulaBasedRichTextWidget widget) {

		new BrowserFunction(widget.getBrowser(), "resetDirtyState") { //$NON-NLS-1$
			@Override
			public Object function(Object[] arguments) {
				widget.setDirtyStateUpdated(false);
				return null;
			}

		};

		StringBuilder script = new StringBuilder();

		script.append("CKEDITOR.instances.editor.on('focus', function () {");
		script.append("resetDirtyState();");
		script.append("});");

		if (!widget.executeScript(script.toString())) {
			Activator.getDefault().getLog().log(new Status(IStatus.WARNING, Activator.PLUGIN_ID,
					"Rich text widget cannot install resetDirtyState handler")); //$NON-NLS-1$
		}
	}

	/**
	 * 
	 * Register the widget as a listener for the save of workspace resource.
	 */
	public void installWorkspaceResourceSaveListener(MDERichTextWidget widget) {
		IConfigurationElement[] contributions = Platform.getExtensionRegistry()
				.getConfigurationElementsFor(MDERichTextEditor.SAVE_CALLBACK_EXTENSION_ID);

		if (contributions != null && contributions.length > 0) {
			for (IConfigurationElement c : contributions) {
				try {
					MDERichTextEditorCallback callback = (MDERichTextEditorCallback) c
							.createExecutableExtension(MDERichTextEditor.SAVE_CALLBACK_CLASS_ATTR);
					callback.registerWorkspaceResourceSaveListener(widget);
				} catch (CoreException e) {
					Status status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
					Activator.getDefault().getLog().log(status);
				}
			}
		}
	}
}
