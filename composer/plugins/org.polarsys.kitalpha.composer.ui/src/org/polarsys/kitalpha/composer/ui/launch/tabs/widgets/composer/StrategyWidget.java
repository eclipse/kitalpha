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

package org.polarsys.kitalpha.composer.ui.launch.tabs.widgets.composer;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
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
import org.polarsys.kitalpha.composer.extension.points.ParameterizedComposerElement;
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

public class StrategyWidget extends AbstractComposerWidget {
	private Viewer viewer;
	private Button edit ;
	private final ComposerTab tab;
	private AtomicWidget cw;
	private IConfigurationElement selectedStrategyElement = null;
	private Collection<Parameter> parameters;
	
	private ParametersDialog dialog;
	public StrategyWidget(ComposerTab tab_p){
		tab = tab_p;
		
	}
	
	
	@Override
	public void createContents(Composite parent) {
		createWidget(parent, "Strategy", "Select the strategy",true);
		attachListeners();
		initialize();
	}

	@Override
	public void initialize() {
		IConfigurationElement[] strategyType = CodeManagerExtensions
		.getAllStrategiesExtensions();
		viewer.setInput(strategyType);

	}

	@Override
	public void updateSelection(IConfigurationElement selectedElement) {
		if (this.selectedStrategyElement != selectedElement) {
			this.selectedStrategyElement = selectedElement;
			parameters = safeGetParameters(selectedElement);
			tab.updateLaunchConfigurationDialog();
		}
	}

		
	@Override
	protected void setDescription(String str_p) {
		super.setDescription(str_p);
		tab.updateLaunchConfigurationDialog();
	}
	
public Viewer createWidget(Composite parent_p, String name_p, String comboxText_p, boolean button){
		
		Group group = new Group(parent_p, SWT.NONE);
		group.setText(name_p);
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
			GridData gd_button = new GridData();
			gd_button.horizontalAlignment = SWT.RIGHT;
			edit.setLayoutData(gd_button);

		}
		
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
				@Override
				public void parameterValueChanged() {
					tab.update();
				}
			};
			
			dialog  = new ParametersDialog(tab.getShell(), new TableContentProvider(),
					new ColumnParametersLabelProvider(),
					new ColumnValuesLabelProvider(),
					new ParameterManager());
			
			dialog.create();
			
			TableEditingSupport edit = new TableEditingSupport(dialog.getViewer(), listener);
			dialog.setEditingSupport(edit);
			
			if(parameters!= null){
			dialog.setContainer(selectedStrategyElement);
			dialog.setInput(parameters);
			}
			
			dialog.open();
		}
	});
}

@Override
public final Viewer getViewer() {
	return viewer;
}

public void setNsUri(String nsUri_p){
		cw.setNsUri(nsUri_p);
}

public final Button getEdit() {
	return edit;
}


public void performApply(ILaunchConfigurationWorkingCopy configuration) {
	if (selectedStrategyElement != null && tab.isDirty()) {
		configuration
				.setAttribute(
						ICodeManagerLaunchConfigurationConstants.STRATEGY_PARAMETERS,
						ComposerHelper.getMapFromTable(parameters));
		configuration.setAttribute(
				ICodeManagerLaunchConfigurationConstants.STRATEGY_NAME,
				this.selectedStrategyElement
						.getAttribute(CodeManagerExtensions.ATT_NAME));
		configuration.setAttribute(
				ICodeManagerLaunchConfigurationConstants.STRATEGY_ID,
				this.selectedStrategyElement
						.getAttribute(CodeManagerExtensions.ATT_ID));
	}
}

@SuppressWarnings("unchecked")
public void initializeFrom(ILaunchConfiguration configuration) {
	try {
		String strategyId = configuration.getAttribute(
				ICodeManagerLaunchConfigurationConstants.STRATEGY_ID, "");
		if (strategyId != null && strategyId.length() > 0) {
			this.selectedStrategyElement = CodeManagerExtensions
					.getStrategyConfigElementFromId(strategyId);
		}

		cw
				.setNsUri(configuration
						.getAttribute(
								ICodeManagerLaunchConfigurationConstants.GENERATION_ALLOCATION_URI,
								""));

		int index = cw
				.initializeComboViewer(configuration
						.getAttribute(
								ICodeManagerLaunchConfigurationConstants.STRATEGY_NAME,
								""));
		
		Map<String, String> map = configuration
				.getAttribute(
						ICodeManagerLaunchConfigurationConstants.STRATEGY_PARAMETERS,
						new HashMap<String, String>());
		
		if (selectedStrategyElement != null) {
			ParameterizedComposerElement strategy = (ParameterizedComposerElement) selectedStrategyElement
					.createExecutableExtension(CodeManagerExtensions.ATT_CLASS);
			Map<String, Parameter> parametersMap = ComposerHelper.buildMapFromString(map, strategy);
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
