/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.cadence.ui.api;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
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

	@Override
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
			String wkelementId = CadenceRegistry.getIdentifier(elt);
			String wkelementName = CadenceRegistry.getName(elt);
			
			String wkelementDescription = CadenceRegistry.getDescription(elt);
			CadenceItem widget = new CadenceItem(tabFolder, elt, workflow,
					wkelementId, wkelementName, wkelementDescription, this);
			g.put(wkelementId, widget);
			
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
			 {
				order = "1000" + elt.hashCode(); ////$NON-NLS-1$
			}
			l.put(Integer.valueOf(order) + elt.hashCode(),elt);
		}
	
		
		return (IConfigurationElement[]) l.values().toArray(workflowElements);
	}

	protected void initialize() {

	}

	@Override
	public String getName() {
		return "Cadence"; //$NON-NLS-1$
	}

	@Override
	public Image getImage() {
		String img = "icons/cadence.png";//$NON-NLS-1$
		ImageDescriptor descriptor =  Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, img);
		return descriptor.createImage();
		
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public void initializeFrom(ILaunchConfiguration configuration) {
		try {
			Map<String, String> map = configuration.getAttribute(
					ICadenceLaunchConfigurationConstants.PARAMETERS_ACTIVITIES,
					new HashMap<String, String>());
			setParameters(map);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	private void setParameters(Map<String, String> restore) {
		Set<Entry<String, String>> entrySet = restore.entrySet();
		for (Entry<String, String> entry : entrySet) {
			CadenceItem widget = g.get(entry.getKey());
			String activityParams = entry.getValue();
			widget.setParameters(activityParams);
		}
	}

	private Map<String, String> getParameters() {
		Map<String, String> save1 = new HashMap<String, String>();
		
		Set<Entry<String, CadenceItem>> entrySet = g.entrySet();
		for (Entry<String, CadenceItem> entry : entrySet) {
			String key = entry.getKey();
			String parameters = g.get(key).getParameters();
			save1.put(key, parameters);
		}
		
		return save1;
	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(
				ICadenceLaunchConfigurationConstants.PARAMETERS_ACTIVITIES,
				getParameters());
	}

	@Override
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
	
	@Override
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

}
