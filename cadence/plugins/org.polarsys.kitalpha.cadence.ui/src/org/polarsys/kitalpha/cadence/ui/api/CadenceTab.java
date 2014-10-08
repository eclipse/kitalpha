/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.cadence.ui.api;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import org.polarsys.kitalpha.cadence.core.api.CadenceRegistry;
import org.polarsys.kitalpha.cadence.core.api.parameter.GenericParameter;
import org.polarsys.kitalpha.cadence.ui.Activator;
import org.polarsys.kitalpha.cadence.ui.api.launch.ICadenceLaunchConfigurationConstants;
import org.polarsys.kitalpha.cadence.ui.internal.widgets.CadenceItem;


/**
 * @author Guillaume Gebhart
 */
public class CadenceTab extends AbstractLaunchConfigurationTab {

	Map<String, Map<String, GenericParameter<?>>> _map = new HashMap<String, Map<String, GenericParameter<?>>>();
	Map<String, CadenceItem> g = new HashMap<String, CadenceItem>();
	protected Text description = null;
	IConfigurationElement[] workflowElements = null;
	String workflow = ""; //$NON-NLS-1$
	
	/**
	 * 
	 */
	public CadenceTab(String workflow) {
		super();
		this.workflow = workflow;
		workflowElements = CadenceRegistry.getAllWorkflowElement(workflow);
	}

	public void createControl(Composite parent) {

		Composite comp = new Composite(parent, SWT.NONE);
		GridLayout topLayout = new GridLayout();
		topLayout.marginHeight = 0;
		topLayout.marginWidth = 0;
		topLayout.numColumns = 1;
		topLayout.marginTop = 10;
		topLayout.marginBottom = 10;
		topLayout.marginLeft = 10;
		topLayout.marginRight = 10;
		comp.setLayout(topLayout);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		comp.setLayoutData(gd);
		setControl(comp);
		createContents(comp);
		initialize();

	}

	public void createContents(Composite parent) {
		CTabFolder tabFolder  = new CTabFolder(parent, SWT.BORDER| SWT.VERTICAL);
		tabFolder.setSimple(false);
		
		GridData gd = new GridData(GridData.FILL_BOTH);
		
		tabFolder.setLayoutData(gd);
		
		
		
		workflowElements = sort(workflowElements);
		
		for (int i = workflowElements.length - 1; i > -1; i--) {
			IConfigurationElement elt = workflowElements[i];
			String wk_element_id = CadenceRegistry.getIdentifier(elt);
			String wk_element_name = CadenceRegistry.getName(elt);
			
			String wk_element_description = CadenceRegistry.getDescription(elt);
			CadenceItem widget = new CadenceItem(tabFolder, elt, workflow,
					wk_element_id, wk_element_name, wk_element_description, this);
			g.put(wk_element_id, widget);
			
		}
		
		tabFolder.setSelection(0);
		
		
		
		
		
		
	}

	/**
	 * Allows to sort Cadence Tab
	 * @param workflowElements
	 * @return the workflow element sorted
	 */
	private IConfigurationElement[] sort(IConfigurationElement[] workflowElements) {
		final SortedMap<Integer, IConfigurationElement> l = new TreeMap<Integer, IConfigurationElement>();
		for(IConfigurationElement elt : workflowElements){
			String order = CadenceRegistry.getOrderNumber(elt);
			if(order == null)
				order = "1000" + elt.hashCode(); ////$NON-NLS-1$
			l.put(new Integer(order)+ elt.hashCode(),elt);
		}
	
		
		return (IConfigurationElement[]) l.values().toArray(workflowElements);
	}

	protected void initialize() {
		// TODO Auto-generated method stub

	}

	public String getName() {
		return "Cadence"; //$NON-NLS-1$
	}

	public Image getImage() {
		String img = "icons/cadence.png";//$NON-NLS-1$
		ImageDescriptor descriptor =  Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, img);
		return descriptor.createImage();
		
	}
	
	@SuppressWarnings("unchecked")
	public void initializeFrom(ILaunchConfiguration configuration) {
		try {
			Map<String, String> map = configuration.getAttribute(
					ICadenceLaunchConfigurationConstants.PARAMETERS_ACTIVITIES,
					new HashMap<String, String>());
			setParameters(map);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void setParameters(Map<String, String> restore) {
		for (String wkElt : restore.keySet()) {
			CadenceItem widget = g.get(wkElt);
			String acs = restore.get(wkElt);
			widget.setParameters(acs);
		}
	}

	private Map<String, String> getParameters() {
		Map<String, String> save1 = new HashMap<String, String>();
		for (String wkElt : g.keySet()) {
			String parameters = g.get(wkElt).getParameters();
			save1.put(wkElt, parameters);
		}
		return save1;
	}

	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(
				ICadenceLaunchConfigurationConstants.PARAMETERS_ACTIVITIES,
				getParameters());
	}

	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setContainer(null);
	}

	public void update() {
		updateLaunchConfigurationDialog();
	}

	public void setDescription(String message) {
		description.clearSelection();
		description.setText(message);
	}
	
	public Shell getShell(){
		return super.getShell();
	}

	protected void createDescription(Composite parent) {

		description = new Text(parent, SWT.BORDER | SWT.V_SCROLL
				| SWT.READ_ONLY | SWT.MULTI);
		description.setVisible(false);
		description.setBackground(Display.getDefault().getSystemColor(
				SWT.COLOR_GRAY));
		description.setForeground(Display.getDefault().getSystemColor(
				SWT.COLOR_BLACK));
		description.setToolTipText("Description"); //$NON-NLS-1$

		GridData gd = new GridData();
		gd.heightHint = 40;
		gd.horizontalAlignment = GridData.FILL;
		gd.grabExcessHorizontalSpace = true;
		gd.grabExcessVerticalSpace = false;

		description.setLayoutData(gd);

	}

	/*private class CadenceExpandListener implements ExpandListener {

		*//**
		 * Default Constructor
		 *//*
		public CadenceExpandListener() {
			// default
		}

		public void itemCollapsed(ExpandEvent e) {
			description.clearSelection();
			description.setVisible(false);
		}

		public void itemExpanded(ExpandEvent e) {
			ExpandItem item = (ExpandItem) e.item;
			String message = ((CadenceItem) item.getData()).getDescription();
			description.setText(message);
			description.setVisible(true);
		}

	}*/

}
