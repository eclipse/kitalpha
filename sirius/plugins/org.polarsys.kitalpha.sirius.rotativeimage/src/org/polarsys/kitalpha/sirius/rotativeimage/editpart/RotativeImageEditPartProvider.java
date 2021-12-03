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
package org.polarsys.kitalpha.sirius.rotativeimage.editpart;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.services.editpart.AbstractEditPartProvider;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.diagram.DNode;
import org.eclipse.sirius.diagram.WorkspaceImage;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.DNode4EditPart;
import org.eclipse.sirius.diagram.ui.internal.edit.parts.WorkspaceImageEditPart;
import org.polarsys.kitalpha.sirius.rotativeimage.Activator;
import org.polarsys.kitalpha.sirius.rotativeimage.extension.RotativeDescription;

/**
 * Specific Edit Part Provider for rotative image
 * 
 * @author ymortier,pdul,adieumegard
 */
public class RotativeImageEditPartProvider extends AbstractEditPartProvider {

	@Override
	protected Class<?> getNodeEditPartClass(final View view) {
		String type = view.getType();
		final EObject resolvedSemanticElement = ViewUtil.resolveSemanticElement(view);

		if (String.valueOf(WorkspaceImageEditPart.VISUAL_ID).equals(type) && resolvedSemanticElement instanceof WorkspaceImage && isRotativeImageEditPart((WorkspaceImage) resolvedSemanticElement)) {
			return RotativeImageEditPart.class;
		} else {
			if (String.valueOf(DNode4EditPart.VISUAL_ID).equals(type) && resolvedSemanticElement instanceof DNode && isRotativeDNode4editPart((DNode) resolvedSemanticElement)) {
				return RotativeDNode4EditPart.class;
			}
		}
		return super.getNodeEditPartClass(view);
	}

	private boolean isRotativeDNode4editPart(final DNode spec) {
		if (spec.getOwnedStyle() instanceof WorkspaceImage) {
			WorkspaceImage customStyle = (WorkspaceImage) spec.getOwnedStyle();
			if (customStyle.getWorkspacePath() != null) {
			    RotativeDescription rotativeDescription = Activator.getDefault().getDescriptions().get(customStyle.getWorkspacePath());
			    if (rotativeDescription != null) {
		            return true;
		        }
			}
		}
		return false;
	}

	private boolean isRotativeImageEditPart(final WorkspaceImage customStyle) {
		if (customStyle.getWorkspacePath() != null) {
		    RotativeDescription rotativeDescription = Activator.getDefault().getDescriptions().get(customStyle.getWorkspacePath());
		    if (rotativeDescription != null) {
		        return true;
		    }
		}
		return false;
	}

}
