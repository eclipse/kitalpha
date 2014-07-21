/*******************************************************************************
 * Copyright (c) 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation
 *******************************************************************************/

/**
 * 
 */
package org.polarsys.kitalpha.composer.ui.launch.tabs.widgets.composer;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;
import org.eclipse.ui.help.IWorkbenchHelpSystem;

import org.polarsys.kitalpha.cadence.ui.api.dialog.ParametersDialog;
import org.polarsys.kitalpha.composer.api.Parameter;
import org.polarsys.kitalpha.composer.extension.points.CodeManagerExtensions;
import org.polarsys.kitalpha.composer.extension.points.IGenerator;
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
public class GeneratorWidget  extends AbstractComposerWidget {

	private ComposerTab tab;
	private AtomicWidget cw;
	private IConfigurationElement selectedGeneratorElement = null;
	private Collection<Parameter> parameters;
	private ParametersDialog dialog;
	
	public GeneratorWidget(ComposerTab tab_p){
		tab = tab_p;
	}

// generator selection
private Viewer viewer;
private Button edit ;

//generator path
private Text text;
private Button wkp_b;	
private Button fs_b;

	/* (non-Javadoc)
	 * @see org.polarsys.kitalpha.composer.ui.launch.tabs.IComposerComponent#createContents(org.eclipse.swt.widgets.Composite)
	 */
	public void createContents(Composite parent) {
		createWidget(parent, "Generator","Select the generator", true);
		createGenerationPathWidget(parent, "Generation path");
		attachListeners();
		 initialize();
	}

	/* (non-Javadoc)
	 * @see org.polarsys.kitalpha.composer.ui.launch.tabs.IComposerComponent#initialize()
	 */
	public void initialize() {
		IConfigurationElement[] generators = CodeManagerExtensions
		.getAllGeneratorExtensions();
		viewer.setInput(generators);

	}

	/* (non-Javadoc)
	 * @see org.polarsys.kitalpha.composer.ui.launch.tabs.IComposerComponent#updateSelection(org.eclipse.core.runtime.IConfigurationElement)
	 */
	public void updateSelection(IConfigurationElement selectedElement) {
		if (this.selectedGeneratorElement != selectedElement) {
			this.selectedGeneratorElement = selectedElement;
			if (this.selectedGeneratorElement != null) {
				parameters = safeGetParameters(selectedGeneratorElement);
			}
			tab.updateLaunchConfigurationDialog();
		}

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
		//should display the description of the object
		//selected in the checkbox
		description = cw.createEmptyLabel(true, SWT.WRAP);
		
		
		
		return viewer;
	}

public void createGenerationPathWidget(Composite parent_p, String name_p){

	Group group = new Group(parent_p, SWT.NONE);
	group.setText(name_p);
	group.setLayout(new GridLayout(3, false));
	GridData gd = new GridData();
	gd.horizontalAlignment = GridData.FILL;
	gd.grabExcessHorizontalSpace = true;
	group.setLayoutData(gd);

	AtomicWidget cw = new AtomicWidget(group);
	text = cw.createText(group);
	gd = new GridData();
	gd.horizontalAlignment = GridData.FILL;
	gd.grabExcessHorizontalSpace = true;
	text.setLayoutData(gd);

	wkp_b = cw.createButton(group, "Browse workspace...", null);
	fs_b = cw.createButton(group, "Browse file system...", null);
	//cw.createEmptyLabel();
	
	gd = new GridData();
	gd.horizontalAlignment = SWT.RIGHT;
	gd.horizontalSpan = 3;
	gd.grabExcessHorizontalSpace = true;
	Label label = cw.createLabel("Help with path variables");
	
	label.setLayoutData(gd);
	
	
	createHelpControl(group);
	
	//listeners
	attachBrowseWorkspaceListener(wkp_b,text);
	attachBrowseFileSystem(fs_b,text);
	attachModifyListener(text);
}

private void attachListeners() {
	viewer.addSelectionChangedListener(new ComposerElementListener(
			this));
	edit.addSelectionListener(new SelectionAdapter() {
		 
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
			
			TableEditingSupport edit = new TableEditingSupport(dialog.getViewer(), listener);
			dialog.setEditingSupport(edit);
			
			if(parameters!= null){
			dialog.setContainer(selectedGeneratorElement);
			dialog.setInput(parameters);
			}
			
			dialog.open();
		}
	});
}


private void attachModifyListener(final Text text_p){
	text.addModifyListener(new ModifyListener() {
		public void modifyText(ModifyEvent e) {
			tab.update();
		}
	});
}

private void attachBrowseWorkspaceListener(Button button_p, final Text text_p) {
	button_p.addSelectionListener(new SelectionAdapter() {
		public void widgetSelected(SelectionEvent e) {
			handleBrowseWorkspace(text_p);
			 tab.updateLaunchConfigurationDialog();
		}
	});
}

private void attachBrowseFileSystem(Button button_p,final Text text_p) {
	button_p.addSelectionListener(new SelectionAdapter() {
		public void widgetSelected(SelectionEvent e) {
			handleBrowseFileSystem(text_p);
			 tab.updateLaunchConfigurationDialog();
		}
	});
}


private void handleBrowseWorkspace(Text text_p) {
	ContainerSelectionDialog dialog = new ContainerSelectionDialog(
			tab.getShell(), ResourcesPlugin.getWorkspace().getRoot(), false,
	"Select new file container");
	if (dialog.open() == ContainerSelectionDialog.OK) {
		Object[] result = dialog.getResult();
		if (result.length == 1) {
			text_p.setText(((Path) result[0]).toString());
		}
	}
}

private void handleBrowseFileSystem(Text text_p) {
	DirectoryDialog dialog = new DirectoryDialog(tab.getShell());
	String absolutePath;
	if ((absolutePath = dialog.open()) != null) {
		text_p.setText(absolutePath);
	}
}

public void setNsUri(String nsUri_p){
	cw.setNsUri(nsUri_p);
}
/**Allows to get the elements*/

public final Viewer getViewer() {
	return viewer;
}

public final Button getEdit() {
	return edit;
}

public final Text getText() {
	return text;
}

public final Button getWkp_b() {
	return wkp_b;
}

public final Button getFs_b() {
	return fs_b;
}

public void performApply(ILaunchConfigurationWorkingCopy configuration) {
	if (selectedGeneratorElement != null && tab.isDirty()) {
		configuration
				.setAttribute(
						ICodeManagerLaunchConfigurationConstants.CODEGEN_PARAMETERS,
						ComposerHelper.getMapFromTable(parameters));
		configuration.setAttribute(
				ICodeManagerLaunchConfigurationConstants.CODEGEN_NAME,
				this.selectedGeneratorElement
						.getAttribute(CodeManagerExtensions.ATT_NAME));
		configuration.setAttribute(
				ICodeManagerLaunchConfigurationConstants.CODEGEN_ID,
				this.selectedGeneratorElement
						.getAttribute(CodeManagerExtensions.ATT_ID));
		configuration.setAttribute(
				ICodeManagerLaunchConfigurationConstants.CODEGEN_FOLDER,
				text.getText());
	}
}

@SuppressWarnings("unchecked")
public void initializeFrom(ILaunchConfiguration configuration) {
	try {
		String generatorId = configuration.getAttribute(
				ICodeManagerLaunchConfigurationConstants.CODEGEN_ID, "");
		if (generatorId != null && generatorId.length() > 0) {
			this.selectedGeneratorElement = CodeManagerExtensions
					.getGeneratorConfigElementFromId(generatorId);
		}

		cw
				.setNsUri(configuration
						.getAttribute(
								ICodeManagerLaunchConfigurationConstants.GENERATION_ALLOCATION_URI,
								""));

		int index = cw.initializeComboViewer(configuration.getAttribute(
				ICodeManagerLaunchConfigurationConstants.CODEGEN_NAME, ""));
		Map<String, String> map = configuration
				.getAttribute(
						ICodeManagerLaunchConfigurationConstants.CODEGEN_PARAMETERS,
						new HashMap<String, String>());
		if (selectedGeneratorElement != null) {
			IGenerator generator = (IGenerator) selectedGeneratorElement
					.createExecutableExtension(CodeManagerExtensions.ATT_CLASS);
			Map<String, Parameter> parametersMap = ComposerHelper.buildMapFromString(map, generator);
			if (parametersMap != null){
				parameters  = parametersMap.values();
			}
		}

		text
				.setText(configuration
						.getAttribute(
								ICodeManagerLaunchConfigurationConstants.CODEGEN_FOLDER,
								""));
		
		cw.intializeDescription(description,index);	
	} catch (CoreException e) {
		Activator.getDefault().getLog().log(e.getStatus());
	}

}

protected Control createHelpControl(Composite parent) {
	Image helpImage = JFaceResources.getImage(Dialog.DLG_IMG_HELP);
	return createHelpImageButton(parent, helpImage);

	
}

private ToolBar createHelpImageButton(Composite parent, Image image) {
    ToolBar toolBar = new ToolBar(parent, SWT.FLAT | SWT.NO_FOCUS);
    ((GridLayout) parent.getLayout()).numColumns++;
	toolBar.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_CENTER));
	final Cursor cursor = new Cursor(parent.getDisplay(), SWT.CURSOR_HAND);
	toolBar.setCursor(cursor);
	toolBar.addDisposeListener(new DisposeListener() {
		public void widgetDisposed(DisposeEvent e) {
			cursor.dispose();
		}
	});		
    ToolItem item = new ToolItem(toolBar, SWT.NONE);
	item.setImage(image);
	item.setToolTipText(JFaceResources.getString("helpToolTip")); //$NON-NLS-1$
	item.addSelectionListener(new SelectionAdapter() {
        public void widgetSelected(SelectionEvent e) {
			helpPressed();
        }
    });
	return toolBar;
}

/**
 * Called when the help control is invoked. 
 */
private void helpPressed() {
	IWorkbenchHelpSystem helpSystem = PlatformUI.getWorkbench().getHelpSystem();
	helpSystem.displayHelp("org.polarsys.kitalpha.composer.ui.help.run_configuration_path_variables");
}

}
