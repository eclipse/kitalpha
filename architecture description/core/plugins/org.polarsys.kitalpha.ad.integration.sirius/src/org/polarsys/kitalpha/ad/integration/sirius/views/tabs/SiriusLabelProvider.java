/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.integration.sirius.views.tabs;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.sirius.viewpoint.description.Group;
import org.eclipse.swt.graphics.Image;
import org.polarsys.kitalpha.ad.integration.sirius.model.SiriusRepresentation;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.tools.model.ViewpointElement;
import org.polarsys.kitalpha.ad.viewpoint.ui.AFImages;
import org.polarsys.kitalpha.ad.viewpoint.ui.Activator;
import org.polarsys.kitalpha.ad.viewpoint.ui.views.tabs.AFLabelProvider;

/**
 * @author Thomas Guiu
 * 
 */
public class SiriusLabelProvider extends AFLabelProvider {

	@Override
	public String getColumnText(Object element, int columnIndex) {
		if (!(element instanceof SiriusRepresentation)){
			return "";
		}
		SiriusRepresentation prop = (SiriusRepresentation) element;
		Group odesign = prop.getOdesign();
		if (odesign == null){
			return "";
		}
		if (odesign.eIsProxy()){
			return "File cannot be loaded: " + ((InternalEObject) odesign).eProxyURI();
		}
		return "[" + odesign.getName() + "] " + (odesign.eResource() == null ? "" : odesign.eResource().getURI().toString());
	}

	@Override
	public Image getColumnImage(Object element, int columnIndex) {
		if (element instanceof SiriusRepresentation) {
			SiriusRepresentation prop = (SiriusRepresentation) element;
			Group odesign = prop.getOdesign();
			if (odesign != null && odesign.eIsProxy()) {
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
