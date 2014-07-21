/**
 * 
 */
package org.polarsys.kitalpha.egf.genchain.diagram.ui.dialog;

import org.eclipse.egf.portfolio.genchain.generationChain.GenerationElement;
import org.eclipse.jface.viewers.BaseLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.graphics.Image;

/**
 * @author Thomas Guiu
 * 
 */
public class ElementLabelProvider extends BaseLabelProvider implements ILabelProvider {

	public Image getImage(Object element) {
		return null;
	}

	public String getText(Object element) {
		return ((GenerationElement) element).getName();
	}

}
