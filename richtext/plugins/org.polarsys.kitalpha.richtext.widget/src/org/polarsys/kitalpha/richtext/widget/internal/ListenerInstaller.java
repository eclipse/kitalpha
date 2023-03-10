/*******************************************************************************
 * Copyright (c) 2017, 2023 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
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

	/**
	 * Creates all the Java listeners for the current widget. In order to bind the
	 * listeners to the rich text widget, the
	 * {@link ListenerInstaller#installAllListeners(MDENebulaBasedRichTextWidget)}
	 * method must be called afterwards.
	 * 
	 * @param widget the rich text widget.
	 */
	public void createAllListeners(final MDENebulaBasedRichTextWidget widget) {
		createBeforePasteConfirmationDialogListener(widget);
		createOpenLinkListener(widget);
		createSaveListener(widget);
		createChangeNotificationHandlerListener(widget);
		createChangeContentListener(widget);
		createFocusEventListener(widget);
		createWorkspaceResourceSaveListener(widget);
		createDataReadyEventListener(widget);
		createSetDataEventListener(widget);
	}

	/**
	 * Installs on the rich text widget the Java listeners created by the
	 * {@link ListenerInstaller#createAllListeners(MDENebulaBasedRichTextWidget)}.
	 * The
	 * {@link ListenerInstaller#createAllListeners(MDENebulaBasedRichTextWidget)}
	 * method must thus be called before.
	 * 
	 * @param widget the rich text widget.
	 */
	public void installAllListeners(final MDENebulaBasedRichTextWidget widget) {
		installBeforePasteConfirmationDialogListener(widget);
		installOpenLinkListener(widget);
		installSaveListener(widget);
		installChangeNotificationHandlerListener(widget);
		installChangeContentListener(widget);
		installFocusEventListener(widget);
		installDataReadyEventListener(widget);
		installSetDataEventListener(widget);
	}

	protected void createBeforePasteConfirmationDialogListener(final MDENebulaBasedRichTextWidget widget) {
		new BrowserFunction(widget.getBrowser(), "getConfirmCleanupMsg") { //$NON-NLS-1$
			@Override
			public Object function(Object[] arguments) {
				return "Press OK to clean the Non-XHTML before pasting.\n\n"
						+ "Press Cancel to paste text as it is (not recommended) or better use toolbar action \"Paste as plain text\"";
			}
		};
	}

	protected void installBeforePasteConfirmationDialogListener(final MDENebulaBasedRichTextWidget widget) {
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

	/**
	 * Listener that overrides the default double click event of CKEDITOR to open
	 * links.
	 * 
	 * @param widget the rich text widget.
	 */
	protected void createOpenLinkListener(final MDENebulaBasedRichTextWidget widget) {
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
	}

	protected void installOpenLinkListener(final MDENebulaBasedRichTextWidget widget) {
		StringBuilder scriptAddMenu = new StringBuilder();

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

	/**
	 * Listener that saves the editor content when receiving a focus out event.
	 * 
	 * @param widget the rich text widget.
	 */
	protected void createSaveListener(final MDENebulaBasedRichTextWidget widget) {
		new BrowserFunction(widget.getBrowser(), "saveContent") { //$NON-NLS-1$
			@Override
			public Object function(Object[] arguments) {
				widget.saveContent();
				return null;
			}
		};
	}

	protected void installSaveListener(final MDENebulaBasedRichTextWidget widget) {
		StringBuilder script = new StringBuilder();

		script.append("CKEDITOR.instances.editor.on('blur', function () {");
		script.append("saveContent();");
		script.append("});");

		if (!widget.executeScript(script.toString())) {
			Activator.getDefault().getLog().log(new Status(IStatus.WARNING, Activator.PLUGIN_ID,
					"Rich text widget cannot install the save handler")); //$NON-NLS-1$
		}
	}

	/**
	 * Listener that sends a PropertyChangeEvent when receiving a blur out event.
	 * 
	 * @param widget the rich text widget.
	 */
	protected void createChangeNotificationHandlerListener(final MDENebulaBasedRichTextWidget widget) {
		new BrowserFunction(widget.getBrowser(), "changeHandler") { //$NON-NLS-1$
			@Override
			public Object function(Object[] arguments) {
				if (arguments != null && arguments.length > 0) {
					PropertyChangeEvent event = new PropertyChangeEvent(widget, "widgetContent", null, arguments[0]);
					widget.firePropertyChangeEvent(event);
				}
				return null;
			}
		};
	}

	protected void installChangeNotificationHandlerListener(final MDENebulaBasedRichTextWidget widget) {
		StringBuilder script = new StringBuilder();

		script.append("CKEDITOR.instances.editor.on('blur', function () {");
		script.append("changeHandler(CKEDITOR.instances.editor.getData());");
		script.append("});");

		if (!widget.executeScript(script.toString())) {
			Activator.getDefault().getLog().log(new Status(IStatus.WARNING, Activator.PLUGIN_ID,
					"Rich text widget cannot install the notification handler")); //$NON-NLS-1$
		}
	}

	/**
	 * Listener that temporary saves the editor content when receiving a 'change'
	 * event.
	 * 
	 * @param widget the rich text widget.
	 */
	protected void createChangeContentListener(final MDENebulaBasedRichTextWidget widget) {
		new BrowserFunction(widget.getBrowser(), "firePropertyChangeEvent") { //$NON-NLS-1$
			@Override
			public Object function(Object[] arguments) {
        // Do nothing
        // Do not save the content of the editor in the model
        // Do not update the sate to dirty
        // the state of the editor is linked to if the model is sync with what is edited in the editor
				return null;
			}
		};
	}

	protected void installChangeContentListener(final MDENebulaBasedRichTextWidget widget) {
		StringBuilder script = new StringBuilder();

		/**
		 * Notice that firePropertyChangeEvent() javascript function is defined
		 * MDERichTextEditor.
		 */
		script.append("CKEDITOR.instances.editor.on('key', function () {");
		script.append("firePropertyChangeEvent();");
		script.append("});");

		if (!widget.executeScript(script.toString())) {
			Activator.getDefault().getLog().log(new Status(IStatus.WARNING, Activator.PLUGIN_ID,
					"Rich text widget cannot install firePropertyChangeEvent handler")); //$NON-NLS-1$
		}
	}

	/**
	 * Listeners that resets the dirty state when receiving a 'focus' event.
	 * 
	 * @param widget the rich text widget.
	 */
	protected void createFocusEventListener(final MDENebulaBasedRichTextWidget widget) {
		new BrowserFunction(widget.getBrowser(), "resetDirtyState") { //$NON-NLS-1$
			@Override
			public Object function(Object[] arguments) {
				widget.setDirtyStateUpdated(false);
				return null;
			}

		};
	}

	protected void installFocusEventListener(final MDENebulaBasedRichTextWidget widget) {
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
	 * @param widget the rich text widget.
	 */
	protected void createDataReadyEventListener(final MDENebulaBasedRichTextWidget widget) {
		new BrowserFunction(widget.getBrowser(), "notifyDataReady") { //$NON-NLS-1$
			@Override
			public Object function(Object[] arguments) {
				widget.setIsLoading(false);
				return null;
			}

		};
	}

	protected void installDataReadyEventListener(final MDENebulaBasedRichTextWidget widget) {
		StringBuilder script = new StringBuilder();

		script.append("CKEDITOR.instances.editor.on('dataReady', function () {");
		script.append("notifyDataReady();");
		script.append("});");

		if (!widget.executeScript(script.toString())) {
			Activator.getDefault().getLog().log(new Status(IStatus.WARNING, Activator.PLUGIN_ID,
					"Rich text widget cannot install dataReady handler")); //$NON-NLS-1$
		}
	}

	protected void createSetDataEventListener(final MDENebulaBasedRichTextWidget widget) {
		new BrowserFunction(widget.getBrowser(), "notifySetData") { //$NON-NLS-1$
			@Override
			public Object function(Object[] arguments) {
				widget.setIsLoading(true);
				return null;
			}

		};
	}

	protected void installSetDataEventListener(final MDENebulaBasedRichTextWidget widget) {
		StringBuilder script = new StringBuilder();

		script.append("CKEDITOR.instances.editor.on('setData', function () {");
		script.append("notifySetData();");
		script.append("});");

		if (!widget.executeScript(script.toString())) {
			Activator.getDefault().getLog().log(new Status(IStatus.WARNING, Activator.PLUGIN_ID,
					"Rich text widget cannot install setData handler")); //$NON-NLS-1$
		}
	}

	/**
	 * Register the widget as a listener for when workspace resources have been
	 * saved.
	 * 
	 * @param widget the rich text widget.
	 */
	protected void createWorkspaceResourceSaveListener(MDERichTextWidget widget) {
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
