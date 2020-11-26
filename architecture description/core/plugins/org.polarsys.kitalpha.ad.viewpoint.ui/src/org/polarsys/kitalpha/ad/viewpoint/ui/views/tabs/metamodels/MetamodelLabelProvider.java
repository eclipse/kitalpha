/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.ui.views.tabs.metamodels;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.swt.graphics.Image;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.tools.model.ViewpointElement;
import org.polarsys.kitalpha.ad.viewpoint.ui.AFImages;
import org.polarsys.kitalpha.ad.viewpoint.ui.Activator;
import org.polarsys.kitalpha.ad.viewpoint.ui.views.tabs.AFLabelProvider;

/**
 * @author Thomas Guiu
 * 
 */
public class MetamodelLabelProvider extends AFLabelProvider {

	@Override
	public String getColumnText(Object element, int columnIndex) {
		if (!(element instanceof EPackage)) {
			return "";
		}
		EPackage prop = (EPackage) element;
		if (prop.eIsProxy()) {
			return "File cannot be loaded: " + ((InternalEObject) prop).eProxyURI();
		}

		return "[" + prop.getName() + "] " + prop.eResource().getURI().toString();
	}

	@Override
	public Image getColumnImage(Object element, int columnIndex) {
		if (element instanceof EPackage) {
			EPackage prop = (EPackage) element;
			if (prop.eIsProxy()) {
				return Activator.getDefault().getImage(AFImages.ERROR_STATE);
			}

		}
		return super.getColumnImage(element, columnIndex);
	}

	@Override
	protected ViewpointElement getElement(Viewpoint parent, ViewpointElement elt) {
		return null;
	}

}
