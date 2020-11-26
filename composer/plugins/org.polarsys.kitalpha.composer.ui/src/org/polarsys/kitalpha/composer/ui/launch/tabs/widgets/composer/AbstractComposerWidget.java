/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

/**
 * 
 */
package org.polarsys.kitalpha.composer.ui.launch.tabs.widgets.composer;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import org.polarsys.kitalpha.composer.api.Parameter;
import org.polarsys.kitalpha.composer.extension.points.CodeManagerExtensions;
import org.polarsys.kitalpha.composer.extension.points.ParameterizedComposerElement;
import org.polarsys.kitalpha.composer.ui.Activator;

/**
 * @author Guillaume Gebhart
 *
 */
public abstract class AbstractComposerWidget {
	
	protected Label description;
	
	/**
	 * Creates the content of the tab.
	 * 
	 * @param parent
	 *            the parent composite.
	 */
	public abstract void createContents(Composite parent);

	/**
	 * Initializes the tab.
	 */
	public abstract void initialize();

	/**
	 * This method is invoked when a new element is chosen.
	 * 
	 * @param selectedElement
	 *            the new selected element.
	 */
	public  abstract void updateSelection(
			IConfigurationElement selectedElement);

	
	public abstract Viewer getViewer();

	protected Label getDescription() {
		// TODO Auto-generated method stub
		return description;
	}



	protected void setDescription(String str_p) {
		if (str_p != null){
		description.setText(str_p);
		description.update();
		}
	}
	/**
	 * This listener is able to tell when the selection of
	 * (binding|strategy|refinery|generator) is changed.
	 * 
	 
	 */
	protected static class ComposerElementListener implements
			ISelectionChangedListener {

		private AbstractComposerWidget  widget;

		public ComposerElementListener(AbstractComposerWidget widget) {
			this.widget= widget;
		}

		
		
		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
		 */
		@Override
		public void selectionChanged(SelectionChangedEvent event) {
			ISelection newSelection = widget.getViewer().getSelection();
			if (newSelection instanceof IStructuredSelection) {
				Object object = ((IStructuredSelection) newSelection)
						.getFirstElement();
				if (object instanceof IConfigurationElement) {
					IConfigurationElement configElement = (IConfigurationElement) object;
					widget.updateSelection(configElement);
					widget.setDescription(configElement
									.getAttribute(CodeManagerExtensions.ATT_DESCRIPTION));
				
				}
			}
		}
		
		public void specific(){
			
		}
	}

	
	/**
	 * Returns the parameters of the given configuration element.
	 * 
	 * @param element
	 *            the configuration element.
	 * @return
	 */
	protected final Collection<Parameter> safeGetParameters(
			IConfigurationElement element) {
		if (element != null) {
			try {
				ParameterizedComposerElement parameterizedComposerElement = (ParameterizedComposerElement) element
						.createExecutableExtension(CodeManagerExtensions.ATT_CLASS);

				Map<String, Parameter> params = parameterizedComposerElement
						.getParameters();
				if (params != null) {
					for (Entry<String, Parameter> entry : params.entrySet()) {
						entry.getValue().setName(entry.getKey());
					}
					return params.values();
				}
			} catch (CoreException e) {
				Activator.getDefault().getLog().log(e.getStatus());
			}
		}
		return Collections.<Parameter> emptySet();
	}
	
}
