/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.ad.integration.sirius.providers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.editparts.AbstractEditPart;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.polarsys.kitalpha.ad.viewpoint.ui.provider.DefaultSelectionProvider;

/**
 * @author Thomas Guiu
 * 
 */
public class SiriusSelectionProvider extends DefaultSelectionProvider {
	public List<Object> getSelection() {
		List<Object> result = new ArrayList<Object>();
		for (Object obj : selectedObjects) {
			if (obj instanceof AbstractEditPart) {
				obj = ((AbstractEditPart) obj).getModel();
				if (obj instanceof Node) {
					obj = ((Node) obj).getElement();
					if (obj instanceof DRepresentationElement) {
						obj = ((DRepresentationElement) obj).getTarget();
					}
				}
			}
			if (obj instanceof EObject)
				result.add(obj);
		}
		return result;

	}
}
