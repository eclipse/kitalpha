/**
 * Copyright (c) 2018, 2020 Thales Corporate Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 * Thales Corporate Services S.A.S - initial API and implementation
 */
package org.polarsys.kitalpha.ad.viewpoint.emfvalidation.rules.dialogs;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.edit.provider.ViewpointEditPlugin;
import org.polarsys.kitalpha.ad.viewpoint.ui.AFImages;
import org.polarsys.kitalpha.ad.viewpoint.ui.Activator;

public class EcoreLabelProvider extends LabelProvider {
	@Override
	public String getText(Object element) {
		if (element instanceof EPackage) {
			EPackage element2 = (EPackage) element;
			return element2.getName() + "  -  " + element2.getNsURI();
		}
		if (element instanceof EClassifier) {
			EClassifier element2 = (EClassifier) element;
			return element2.getName();
		}
		return super.getText(element);
	}

	@Override
	public Image getImage(Object element) {
		if (element instanceof EPackage) {
			Object url = ViewpointEditPlugin.INSTANCE.getImage("full/obj16/Metamodel");
			return ExtendedImageRegistry.getInstance().getImage(url);
		}
		if (element instanceof EClassifier) {
			return Activator.getDefault().getImage(AFImages.ECLASS);
		}
		return null;
	}
}