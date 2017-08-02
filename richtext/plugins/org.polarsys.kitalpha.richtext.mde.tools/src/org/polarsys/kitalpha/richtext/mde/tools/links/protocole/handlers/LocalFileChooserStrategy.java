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
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.polarsys.kitalpha.richtext.common.util.MDERichTextHelper;
import org.polarsys.kitalpha.richtext.mde.tools.managers.LinkChooserStrategy;
import org.polarsys.kitalpha.richtext.mde.tools.managers.Tuple;

public class LocalFileChooserStrategy implements LinkChooserStrategy {

	public LocalFileChooserStrategy() {
	}

	@Override
	public Tuple<String, String> getURI(Object object) {
		String location = null;
		if (object instanceof EObject){
			EObject element = (EObject)object;
			ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(
					Display.getCurrent().getActiveShell(),
					new WorkbenchLabelProvider(),
					new BaseWorkbenchContentProvider());
			dialog.setTitle("Select File");
			dialog.setMessage("Select Local File");
			dialog.setInput(MDERichTextHelper.getProject(element));

			if (Window.OK == dialog.open()) {
				Object result = dialog.getFirstResult();
				if (result instanceof IFile) {
					String basePath = MDERichTextHelper.getProjectPath(element);
					location = ((IFile) result).getLocation().toPortableString();
					if (location.startsWith(basePath)) {
						location = location.replaceFirst(basePath, ""); //$NON-NLS-1$
					}
				}
			}
		}
		return new Tuple<String, String>(location, null);
	}
}
