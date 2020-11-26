/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.ui.views.tabs;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ElementSet;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Workspace;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.tools.model.ViewpointElement;
import org.polarsys.kitalpha.ad.viewpoint.ui.AFImages;
import org.polarsys.kitalpha.ad.viewpoint.ui.Activator;

/**
 * @author Thomas Guiu
 * 
 */
public abstract class AFLabelProvider extends LabelProvider implements ITableLabelProvider {
	private Object reference;
	private Viewpoint vp;

	public void setReference(Viewpoint vp, Object reference) {
		this.vp = vp;
		this.reference = reference;
	}

	@Override
	public Image getColumnImage(Object element, int columnIndex) {
		if (columnIndex == 0 && element instanceof ViewpointElement) {
			ViewpointElement elt = (ViewpointElement) element;
			ElementSet set = (ElementSet) elt.eContainer();
			Viewpoint target = set.getTarget();
			if (target == null) {
				throw new IllegalStateException("target field is null on " + elt);
			}
			EList<Viewpoint> allParents = target.getAllParents();
			if (set.eContainer() instanceof Workspace) {
				allParents.add(target);
			}
			for (Viewpoint parent : allParents) {
				if (getElement(parent, elt) != null) {
					return Activator.getDefault().getImage(AFImages.OVERRIDING);
				}
			}
			if (reference != null && !reference.equals(set.eContainer())) {
				return Activator.getDefault().getImage(AFImages.PARENT);
			}
			if (reference == null && vp != null && !vp.equals(set.eContainer())) {
				return Activator.getDefault().getImage(AFImages.PARENT);
			}
			return Activator.getDefault().getImage(AFImages.EMPTY);
		}
		return null;
	}

	protected abstract ViewpointElement getElement(Viewpoint parent, ViewpointElement elt);

}
