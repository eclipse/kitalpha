/*******************************************************************************
 * Copyright (c) 2020 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
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
import org.polarsys.kitalpha.common.sirius.extension.internal.rotativeimage.Activator;

/**
 * Specific Edit Part Provider for rotative image
 * 
 * @author ymortier,pdul
 */
public class RotativeImageEditPartProvider extends AbstractEditPartProvider {

	@Override
	protected Class<?> getNodeEditPartClass(final View view) {
		final EObject resolvedSemanticElement = ViewUtil.resolveSemanticElement(view);
		if (resolvedSemanticElement instanceof WorkspaceImage) {
			final WorkspaceImage customStyle = (WorkspaceImage) resolvedSemanticElement;
			for (RotativeDescription desc : Activator.getDefault().getDescriptions()) {
				if (customStyle.getWorkspacePath() != null && customStyle.getWorkspacePath().startsWith(desc.id))
					return RotativeImageEditPart.class;
			}
		} else if (resolvedSemanticElement instanceof DNode) {
			DNode spec = (DNode) resolvedSemanticElement;
			if (spec.getOwnedStyle() != null && spec.getOwnedStyle() instanceof WorkspaceImage) {
				WorkspaceImage customStyle = (WorkspaceImage) spec.getOwnedStyle();
				for (RotativeDescription desc : Activator.getDefault().getDescriptions()) {
					if (customStyle.getWorkspacePath() != null && customStyle.getWorkspacePath().startsWith(desc.id))
						return RotativeDNode4EditPart.class;
				}
			}
		}
		return super.getNodeEditPartClass(view);
	}

}
