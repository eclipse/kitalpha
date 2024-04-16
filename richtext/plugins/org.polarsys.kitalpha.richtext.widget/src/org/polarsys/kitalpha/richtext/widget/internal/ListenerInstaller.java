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
import org.polarsys.kitalpha.richtext.common.impl.AbstractMDERichTextWidget;
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
    installFocusOutListener(widget);
		installChangeNotificationHandlerListener(widget);
		installChangeContentListener(widget);
    installFocusInListener(widget);
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

  /**
   * Inject java script that calls dedicated functions when the editor receives a focus out event.
   * 
   * Note that, as defined in org\eclipse\nebula\widgets\richtext\resources\template.html, focusOut() is called on
   * 'blur' event but only the last BrowserFunction is called(not all registered). So it is preferable to have a
   * specific method.
   */
  protected void installFocusOutListener(final MDENebulaBasedRichTextWidget widget) {
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
   * Listener that is called when the content of the editor changes.<br/>
   * It temporarily saves the editor content when receiving the 'change' event the first time.
   */
	protected void createChangeContentListener(final MDENebulaBasedRichTextWidget widget) {
    final boolean[] widgetSaveTriggeredByContentChangeDetection = { false };

    // if supp (resp. backspace) key is used at the end (resp. beginning) of the text, the 'change' event is emitted
    // and the widget is saved. But in this case isDirtyStateUpdated should be still be false because there has been non
    // change<br/>
    // That's why we call setDirtyStateUpdated only if a model change has been effectively be done.
    widget.addPropertyChangeListener(evt -> {
      if (evt.getSource() == widget && AbstractMDERichTextWidget.WIDGET_SAVED_PROP.equals(evt.getPropertyName())) {
        widget.setDirtyStateUpdated(widgetSaveTriggeredByContentChangeDetection[0]);
      }
    });

    new BrowserFunction(widget.getBrowser(), "onChangeEvent") { //$NON-NLS-1$
      @Override
      public Object function(Object[] arguments) {
        if (!widget.isDirtyStateUpdated()) {
          // In some case, saveContent is called in a context where the model is persisted. In this context,
          // setDirtyStateUpdated(false) need to be called so that saveContent is called at the next editor change.
          // But, by design we can not ensure that.
          // So we ensure that we prevent further saveContent only if the saveContent is triggered by the edition.
          widgetSaveTriggeredByContentChangeDetection[0] = true;
          widget.saveContent();
          widgetSaveTriggeredByContentChangeDetection[0] = false;
        }
        return null;
      }
    };
	}

  /**
   * Inject java script that calls dedicated functions when the editor receives a 'change' in event.
   * 
   * Note that, as defined in org\eclipse\nebula\widgets\richtext\resources\template.html, textModified() is called on
   * 'change' event but only the last BrowserFunction is called(not all registered). So it is preferable to have a
   * specific method.
   */
	 protected void installChangeContentListener(final MDENebulaBasedRichTextWidget widget) {
	    StringBuilder script = new StringBuilder();

	    script.append("CKEDITOR.instances.editor.on('change', function () {");
	    script.append("onChangeEvent();");
	    script.append("});");

	    if (!widget.executeScript(script.toString())) {
	      Activator.getDefault().getLog().log(new Status(IStatus.WARNING, Activator.PLUGIN_ID,
	          "Rich text widget cannot install onChangeEvent handler")); //$NON-NLS-1$
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

  /**
   * Inject java script that calls dedicated functions when the editor receives a 'focus' in event.
   * 
   * Note that, as defined in org\eclipse\nebula\widgets\richtext\resources\template.html, focusIn() is called on
   * 'focus' event but only the last BrowserFunction is called(not all registered). So it is preferable to have a
   * specific method.
   */
  protected void installFocusInListener(final MDENebulaBasedRichTextWidget widget) {
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
