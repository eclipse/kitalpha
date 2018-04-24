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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.polarsys.kitalpha.richtext.nebula.widget.MDERichTextConstants;
import org.polarsys.kitalpha.richtext.widget.editor.MDERichTextEditor;
import org.polarsys.kitalpha.richtext.widget.editor.MDERichTextEditorInput;
import org.polarsys.kitalpha.richtext.widget.editor.intf.EditorInputFeatureContribution;
import org.polarsys.kitalpha.richtext.widget.internal.Activator;

public class MDERichtextWidgetHelper {

	public static final String INPUT_FEATURE_CONTRIBUTION_EXTENSION_ID = "org.polarsys.kitalpha.richtext.widget.editorInputFeatureContribution";
	public static final String INPUT_FEATURE_CONTRIBUTION_CLASS_ATTR = "class";

	private static MDERichtextWidgetHelper instance;
	private List<EditorInputFeatureContribution> inputFeatureContributions;

	private MDERichtextWidgetHelper() {
		// Do nothing
	}

	public static MDERichtextWidgetHelper getInstance() {
		if (null == instance) {
			instance = new MDERichtextWidgetHelper();
		}
		return instance;
	}

	public static List<MDERichTextEditor> getActiveMDERichTextEditors() {
		IWorkbenchWindow activeWorkbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		if (activeWorkbenchWindow != null) {
			IWorkbenchPage activePage = activeWorkbenchWindow.getActivePage();
			if (activePage != null) {
				return Arrays.stream(activePage.getEditorReferences())
						.filter(ref -> MDERichTextConstants.RICHTEXT_EDITOR_ID.equals(ref.getId()))
						.map(ref -> ref.getEditor(false)).filter(Objects::nonNull).map(MDERichTextEditor.class::cast)
						.collect(Collectors.toList());
			}
		}
		return Collections.emptyList();
	}

	public static List<MDERichTextEditor> getActiveMDERichTextEditors(EObject element) {
		List<MDERichTextEditor> activeEditors = new ArrayList<>();
		for (MDERichTextEditor richtextEditor : MDERichtextWidgetHelper.getActiveMDERichTextEditors()) {
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
								.createExecutableExtension(INPUT_FEATURE_CONTRIBUTION_CLASS_ATTR);
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
}
