/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

/**
 * 
 */
package org.polarsys.kitalpha.composer.ui.launch.tabs.widgets.composer;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

import org.polarsys.kitalpha.cadence.ui.api.dialog.ParametersDialog;
import org.polarsys.kitalpha.composer.api.Parameter;
import org.polarsys.kitalpha.composer.extension.points.CodeManagerExtensions;
import org.polarsys.kitalpha.composer.extension.points.IRefinery;
import org.polarsys.kitalpha.composer.ui.Activator;
import org.polarsys.kitalpha.composer.ui.launch.ICodeManagerLaunchConfigurationConstants;
import org.polarsys.kitalpha.composer.ui.launch.tabs.ComposerHelper;
import org.polarsys.kitalpha.composer.ui.launch.tabs.ComposerTab;
import org.polarsys.kitalpha.composer.ui.launch.tabs.widgets.AtomicWidget;
import org.polarsys.kitalpha.composer.ui.launch.tabs.widgets.parameters.ParameterManager;
import org.polarsys.kitalpha.composer.ui.providers.ColumnParametersLabelProvider;
import org.polarsys.kitalpha.composer.ui.providers.ColumnValuesLabelProvider;
import org.polarsys.kitalpha.composer.ui.providers.ITableEditingListener;
import org.polarsys.kitalpha.composer.ui.providers.TableContentProvider;
import org.polarsys.kitalpha.composer.ui.providers.TableEditingSupport;

/**
 * @author Guillaume Gebhart
 *
 */
public class RefineryWidget extends AbstractComposerWidget {
	private ComboViewer viewer;
	AtomicWidget cw;
	private Button edit ;
	private ComposerTab tab;
	private IConfigurationElement selectedRefineryElement = null;
	private Collection<Parameter> parameters;
	private ParametersDialog dialog;
	
	public RefineryWidget(ComposerTab tab){
		this.tab = tab;
	}
	
	/* (non-Javadoc)
	 * @see org.polarsys.kitalpha.composer.ui.launch.tabs.IComposerComponent#createContents(org.eclipse.swt.widgets.Composite)
	 */
	public void createContents(Composite parent) {
		createWidget(parent, "Refinery", "Select the refinery",true);
		 attachListeners();
		initialize();
	}

	/* (non-Javadoc)
	 * @see org.polarsys.kitalpha.composer.ui.launch.tabs.IComposerComponent#initialize()
	 */
	public void initialize() {
		IConfigurationElement[] refineryType = CodeManagerExtensions
		.getAllRefineryExtensions();
		viewer.setInput(refineryType);
	}

	/* (non-Javadoc)
	 * @see org.polarsys.kitalpha.composer.ui.launch.tabs.IComposerComponent#updateSelection(org.eclipse.core.runtime.IConfigurationElement)
	 */
	public void updateSelection(IConfigurationElement selectedElement) {
		if (this.selectedRefineryElement != selectedElement) {
			this.selectedRefineryElement = selectedElement;
			if (this.selectedRefineryElement != null) {
				parameters = safeGetParameters(selectedRefineryElement);
			}
			tab.updateLaunchConfigurationDialog();
		}

	}

	
public Viewer createWidget(Composite parentP, String nameP, String comboxTextP, boolean button){
		
		Group group = new Group(parentP, SWT.NONE);
		group.setText(nameP);
		group.setLayout(new GridLayout(2, true));
		GridData gd = new GridData();
		gd.horizontalAlignment = GridData.FILL;
		gd.grabExcessHorizontalSpace = true;
		group.setLayoutData(gd);
		
		cw = new AtomicWidget(group);
		viewer = cw.createComboViewer(true);
		
		
		if(!button){
		cw.createEmptyLabel(false);
		}else{
		   edit = cw.createButton(group, "Edit Details...", "configure the parameters");
			GridData gdButton = new GridData();
			gdButton.horizontalAlignment = SWT.RIGHT;
			edit.setLayoutData(gdButton);
			
		}
		//should display the description of the object
		//selected in the checkbox
		description = cw.createEmptyLabel(true,SWT.WRAP);
		
		
		return viewer;
	}

private void attachListeners() {
	viewer.addSelectionChangedListener(new ComposerElementListener(
			this));
	
	edit.addSelectionListener(new SelectionAdapter() {
		 
		@Override
		public void widgetSelected(SelectionEvent e){

			ITableEditingListener listener = new ITableEditingListener() {
				public void parameterValueChanged() {
					tab.update();
				}
			};
			
			dialog  = new ParametersDialog(tab.getShell(), new TableContentProvider(),
					new ColumnParametersLabelProvider(),
					new ColumnValuesLabelProvider(),
					new ParameterManager());
			
			dialog.create();
			
			TableEditingSupport tableEdit = new TableEditingSupport(dialog.getViewer(), listener);
			dialog.setEditingSupport(tableEdit);
			
			if(parameters!= null){
			dialog.setContainer(selectedRefineryElement);
			dialog.setInput(parameters);
			}
			
			dialog.open();
		}
	});
	
}

public void setNsUri(String nsUri){
	cw.setNsUri(nsUri);
}

public final Viewer getViewer() {
	return viewer;
}

public final Button getEdit() {
	return edit;
}


public void performApply(ILaunchConfigurationWorkingCopy configuration) {
	if (selectedRefineryElement != null && tab.isDirty()) {
		configuration
				.setAttribute(
						ICodeManagerLaunchConfigurationConstants.REFINERY_PARAMETERS,
						ComposerHelper.getMapFromTable(parameters));
		
		configuration.setAttribute(
				ICodeManagerLaunchConfigurationConstants.REFINERY_NAME,
				this.selectedRefineryElement
						.getAttribute(CodeManagerExtensions.ATT_NAME));
		configuration.setAttribute(
				ICodeManagerLaunchConfigurationConstants.REFINERY_ID,
				this.selectedRefineryElement
						.getAttribute(CodeManagerExtensions.ATT_ID));
	}
}

@SuppressWarnings("unchecked")
public void initializeFrom(ILaunchConfiguration configuration) {
	try {
		String refineryId = configuration.getAttribute(
				ICodeManagerLaunchConfigurationConstants.REFINERY_ID, "");
		if (refineryId != null && refineryId.length() > 0) {
			this.selectedRefineryElement = CodeManagerExtensions
					.getRefineryConfigElementFromId(refineryId);
		}

		cw
				.setNsUri(configuration
						.getAttribute(
								ICodeManagerLaunchConfigurationConstants.GENERATION_ALLOCATION_URI,
								""));

		int index = cw
				.initializeComboViewer(configuration
						.getAttribute(
								ICodeManagerLaunchConfigurationConstants.REFINERY_NAME,
								""));
		Map<String, String> map = configuration
				.getAttribute(
						ICodeManagerLaunchConfigurationConstants.REFINERY_PARAMETERS,
						new HashMap<String, String>());
		if (selectedRefineryElement != null) {
			IRefinery refinery = (IRefinery) selectedRefineryElement
					.createExecutableExtension(CodeManagerExtensions.ATT_CLASS);
			Map<String, Parameter> parametersMap = ComposerHelper.buildMapFromString(map, refinery);
			if (parametersMap != null){
				parameters  = parametersMap.values();
			}
		}
	
		cw.intializeDescription(description,index);
	} catch (CoreException e) {
		Activator.getDefault().getLog().log(e.getStatus());
	}
}

}
