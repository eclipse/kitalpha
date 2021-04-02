/*******************************************************************************
 * Copyright (c) 2020, 2021 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.common.sirius.extension.rotativeimage;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.services.editpart.AbstractEditPartProvider;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.diagram.DNode;
import org.eclipse.sirius.diagram.WorkspaceImage;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DNode4EditPart;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.WorkspaceImageEditPart;
import org.polarsys.kitalpha.common.sirius.extension.internal.rotativeimage.Activator;

/**
 * Specific Edit Part Provider for rotative image
 * 
 * @author ymortier,pdul
 */
public class RotativeImageEditPartProvider extends AbstractEditPartProvider {

	@Override
	protected Class<?> getNodeEditPartClass(final View view) {
		String type = view.getType();
		final EObject resolvedSemanticElement = ViewUtil.resolveSemanticElement(view);

		if (String.valueOf(RotativeImageEditPart.VISUAL_ID).equals(type)) {
			if (resolvedSemanticElement instanceof WorkspaceImage) {
				final WorkspaceImage customStyle = (WorkspaceImage) resolvedSemanticElement;
				for (RotativeDescription desc : Activator.getDefault().getDescriptions()) {
					if (customStyle.getWorkspacePath() != null 
							&& customStyle.getWorkspacePath().startsWith(desc.id))
						return RotativeImageEditPart.class;
				}
			}
		} else {
			if (String.valueOf(RotativeDNode4EditPart.VISUAL_ID).equals(type)) {
				if (resolvedSemanticElement instanceof DNode) {
					DNode spec = (DNode) resolvedSemanticElement;
					if (spec.getOwnedStyle() != null && spec.getOwnedStyle() instanceof WorkspaceImage) {
						WorkspaceImage customStyle = (WorkspaceImage) spec.getOwnedStyle();
						for (RotativeDescription desc : Activator.getDefault().getDescriptions()) {
							if (customStyle.getWorkspacePath() != null
									&& customStyle.getWorkspacePath().startsWith(desc.id))
								return RotativeDNode4EditPart.class;
						}
					}
				}
			}
		}
		return super.getNodeEditPartClass(view);
	}

}
