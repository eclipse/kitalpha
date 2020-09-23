package org.polarsys.kitalpha.common.sirius.extension.rotativeimage;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.services.editpart.AbstractEditPartProvider;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.diagram.WorkspaceImage;
import org.polarsys.kitalpha.common.sirius.extension.internal.rotativeimage.Activator;

/**
 * Specific Edit Part Provider for rotative image
 * @author ymortier,pdul
 */
public class RotativeImageEditPartProvider  extends AbstractEditPartProvider {

	@Override
	protected Class<?> getNodeEditPartClass(final View view) {
		final EObject resolvedSemanticElement = ViewUtil.resolveSemanticElement(view);
		if (resolvedSemanticElement instanceof WorkspaceImage) {
			final WorkspaceImage customStyle = (WorkspaceImage)resolvedSemanticElement;
			for (RotativeDescription desc : Activator.getDefault().getDescriptions()) {
				if (customStyle.getWorkspacePath()!=null && customStyle.getWorkspacePath().startsWith(desc.id)) 
					return RotativeImageEditPart.class;
			}
		}
		return super.getNodeEditPartClass(view);
	}

}
