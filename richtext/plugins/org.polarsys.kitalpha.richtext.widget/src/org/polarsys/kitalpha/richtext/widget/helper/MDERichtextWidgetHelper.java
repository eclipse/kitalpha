/*******************************************************************************
 * Copyright (c) 2018 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.richtext.widget.helper;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.polarsys.kitalpha.richtext.nebula.widget.MDENebulaRichTextConfiguration;
import org.polarsys.kitalpha.richtext.widget.MDERichtextWidgetEditorImpl;
import org.polarsys.kitalpha.richtext.widget.editor.MDERichTextEditor;
import org.polarsys.kitalpha.richtext.widget.editor.MDERichTextEditorInput;
import org.polarsys.kitalpha.richtext.widget.editor.intf.EditorInputFeatureContribution;
import org.polarsys.kitalpha.richtext.widget.internal.Activator;

public class MDERichtextWidgetHelper {

	public static final String INPUT_FEATURE_CONTRIBUTION_EXTENSION_ID = "org.polarsys.kitalpha.richtext.widget.editorInputFeatureContribution";
	public static final String EDITOR_WIDGET_CONTRIBUTION_EXTENSION_ID = "org.polarsys.kitalpha.richtext.widget.editorWidgetContribution";
	public static final String CONTRIBUTION_CLASS_ATTR = "class";

	private static MDERichtextWidgetHelper instance;
	private List<EditorInputFeatureContribution> inputFeatureContributions;
	private MDERichtextWidgetEditorImpl contributedEditorWidget;

	private MDERichtextWidgetHelper() {
		// Do nothing
	}

	public static MDERichtextWidgetHelper getInstance() {
		if (null == instance) {
			instance = new MDERichtextWidgetHelper();
		}
		return instance;
	}

	/**
	 * Returns whether the given editor is a Richtext Editor
	 */
	public static boolean isRichtextEditor(IEditorReference editor) {
		return editor.getEditor(false) instanceof MDERichTextEditor;
	}

	/**
	 * Return all Richtext editors
	 */
	public static List<MDERichTextEditor> getActiveMDERichTextEditors() {
		ArrayList<MDERichTextEditor> references = new ArrayList<MDERichTextEditor>();
		for (IWorkbenchWindow window : PlatformUI.getWorkbench().getWorkbenchWindows()) {
			for (IWorkbenchPage page : window.getPages()) {
				for (IEditorReference editor : page.getEditorReferences()) {
					if (MDERichtextWidgetHelper.isRichtextEditor(editor)) {
						references.add((MDERichTextEditor) editor.getEditor(false));
					}
				}
			}
		}
		return references;
	}

  /**
   * Return all Richtext editors associated to the given editingDomain
   */
	public static List<MDERichTextEditor> getActiveMDERichTextEditors(TransactionalEditingDomain domain) {
		List<MDERichTextEditor> activeEditors = new ArrayList<>();
		for (MDERichTextEditor richtextEditor : getActiveMDERichTextEditors()) {
			MDERichTextEditorInput input = (MDERichTextEditorInput) richtextEditor.getEditorInput();
			if (domain == TransactionUtil.getEditingDomain(input.getElement())) {
				activeEditors.add(richtextEditor);
			}
		}
		return activeEditors;
	}

  /**
   * Return all Richtext editors associated to the given element
   */
	public static List<MDERichTextEditor> getActiveMDERichTextEditors(EObject element) {
		List<MDERichTextEditor> activeEditors = new ArrayList<>();
		for (MDERichTextEditor richtextEditor : getActiveMDERichTextEditors()) {
			MDERichTextEditorInput input = (MDERichTextEditorInput) richtextEditor.getEditorInput();
			if (element == input.getElement()) {
				activeEditors.add(richtextEditor);
			}
		}
		return activeEditors;
	}

	public List<EditorInputFeatureContribution> getEditorInputFeatureContribution() {
		if (inputFeatureContributions == null) {
			inputFeatureContributions = new ArrayList<>();
			IConfigurationElement[] contributions = Platform.getExtensionRegistry()
					.getConfigurationElementsFor(INPUT_FEATURE_CONTRIBUTION_EXTENSION_ID);

			if (contributions != null && contributions.length > 0) {
				for (IConfigurationElement c : contributions) {
					try {
						EditorInputFeatureContribution contribution = (EditorInputFeatureContribution) c
								.createExecutableExtension(CONTRIBUTION_CLASS_ATTR);
						inputFeatureContributions.add(contribution);
					} catch (CoreException e) {
						Status status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
						Activator.getDefault().getLog().log(status);
					}
				}
			}
		}
		return inputFeatureContributions;
	}

	public MDERichtextWidgetEditorImpl getEditorWidgetContribution(Composite parent,
			MDENebulaRichTextConfiguration configuration) {
		if (contributedEditorWidget == null) {
			IConfigurationElement[] contributions = Platform.getExtensionRegistry()
					.getConfigurationElementsFor(EDITOR_WIDGET_CONTRIBUTION_EXTENSION_ID);

			if (contributions != null && contributions.length > 0) {
				for (IConfigurationElement c : contributions) {
					try {
						String contributorAttribute = c.getAttribute(CONTRIBUTION_CLASS_ATTR);
						String contributorName = c.getDeclaringExtension().getContributor().getName();
						Class<?> javaClass = Platform.getBundle(contributorName).loadClass(contributorAttribute);
						Constructor<?> constructor = javaClass.getDeclaredConstructor(Composite.class,
								MDENebulaRichTextConfiguration.class);
						return (MDERichtextWidgetEditorImpl) constructor.newInstance(parent, configuration);
					} catch (Exception e) {
						Status status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
						Activator.getDefault().getLog().log(status);
					}
				}
			}
		}
		return contributedEditorWidget;
	}

	/**
	 * Close all invalid editors of the given editing domain or null one
	 */
	public static void closeInvalidEditors(TransactionalEditingDomain editingDomain) {
		closeEditors(editingDomain, true, false);
	}

	/**
	 * Close all editors of the given editing domain
	 * 
	 */
	public static void closeEditors(TransactionalEditingDomain editingDomain) {
		closeEditors(editingDomain, false, true);
	}

	/**
	 * Close all editors related to the given editingDomain or null one.
	 * 
	 * @param onlyInvalid:        if true, only invalid editors will be closed
	 * 
	 * @param desactivateEditors: if desactivateEditors is true, then editors will
	 *                            be switchDeactivateState before closing. (which is
	 *                            seems to disable save of the editor)
	 */
	private static void closeEditors(TransactionalEditingDomain editingDomain, boolean onlyInvalid,
			boolean desactivateEditors) {
		for (MDERichTextEditor editor : getActiveMDERichTextEditors()) {
			MDERichTextEditorInput editorInput = (MDERichTextEditorInput) editor.getEditorInput();
			EObject element = editorInput.getElement();
			TransactionalEditingDomain eltEditingDomain = TransactionUtil.getEditingDomain(element);

			if (desactivateEditors) {
				editor.switchDeactivateState();
			}

			if (eltEditingDomain == null) {
				close(editor);

			} else if (onlyInvalid && element.eResource() == null) {
				close(editor);

			} else if (!onlyInvalid && eltEditingDomain == editingDomain) {
				close(editor);
			}
		}
	}

	/**
	 * Close the given editor
	 */
	private static void close(IEditorPart editor) {
		if (editor != null) {
			Display.getDefault().asyncExec(new Runnable() {
				@Override
				public void run() {
					IWorkbenchPage page = editor.getEditorSite().getPage();
					if (page != null) {
						page.closeEditor(editor, false);
					}
				}
			});
		}
	}

}
