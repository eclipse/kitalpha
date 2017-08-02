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
package org.polarsys.kitalpha.richtext.mde.tools.links.protocole.handlers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.polarsys.kitalpha.richtext.mde.tools.dialogs.FilteredElementTreeSelectionDialog;
import org.polarsys.kitalpha.richtext.mde.tools.managers.Tuple;
import org.polarsys.kitalpha.richtext.mde.tools.messages.Messages;
import org.polarsys.kitalpha.richtext.mde.tools.utils.MDERichTextToolsHelper;

public class ModelElementLinkChooserStrategy extends AbstractChooseLinkElement {

	public ModelElementLinkChooserStrategy() {
	}

	@Override
	public Tuple<String, String> getURI(Object object) {
		Tuple<String, String> path = null;
		if (object instanceof EObject){
			EObject modelElement = (EObject)object;
			AdapterFactoryLabelProvider labelProvider = MDERichTextToolsHelper.getLabelProvider(modelElement);
			AdapterFactoryContentProvider contentProvider = MDERichTextToolsHelper.getContentProvider(modelElement);
			if (labelProvider != null && contentProvider != null){ 
				FilteredElementTreeSelectionDialog dialog = new FilteredElementTreeSelectionDialog(
						Display.getCurrent().getActiveShell(), labelProvider, contentProvider);
				dialog.setTitle(Messages.RichTextWidget_Dialog_Title_Model_Element_Selection);
				dialog.setMessage(Messages.RichTextWidget_Dialog_Title_Selection_Model_Element);

				EObject root = EcoreUtil.getRootContainer(modelElement);
				dialog.setInput(root.eResource());
				if (Window.OK == dialog.open()) {
					Object result = dialog.getFirstResult();
					if (result instanceof EObject) {
						String link = EcoreUtil.getURI((EObject)object).toString();
						path = customizeLink(link, result);
					}
				}
			}
		}
		return path;
	}

}
