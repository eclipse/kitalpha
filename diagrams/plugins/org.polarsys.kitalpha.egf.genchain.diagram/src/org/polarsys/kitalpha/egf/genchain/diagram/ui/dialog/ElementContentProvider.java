/**
 * 
 */
package org.polarsys.kitalpha.egf.genchain.diagram.ui.dialog;

import org.eclipse.egf.portfolio.genchain.generationChain.GenerationChain;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

/**
 * @author Thomas Guiu
 * 
 */
public class ElementContentProvider implements IStructuredContentProvider {

	public Object[] getElements(Object element) {
		return ((GenerationChain) element).getElements().toArray();
	}

	public void dispose() {

	}

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	}

}
