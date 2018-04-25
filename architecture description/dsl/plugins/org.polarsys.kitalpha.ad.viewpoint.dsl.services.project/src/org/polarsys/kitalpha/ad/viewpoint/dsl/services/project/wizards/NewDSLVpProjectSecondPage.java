/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.services.project.wizards;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Text;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.project.extensions.ConcreteSyntaxResourceCreationManager;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.project.message.Messages;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.project.utils.NamesValidityChecker;

/**
 * @author Boubekeur Zendagui
 */

public class NewDSLVpProjectSecondPage extends WizardPage {

	/** Model data **/
	private String vpTargetApplication = ""; //$NON-NLS-1$
	private String vpShortName = ""; //$NON-NLS-1$
	protected Map<String, String> availableCreator  = new HashMap<String, String>();
	protected Map<String, String> selectedCreator = new HashMap<String, String>();
	
	/** Widget **/
	private Text vpRootProjectNameText;
	private Text vpDescriptionProjectNameText;
	
	private List lSelectedCreators;
	private List lAvailableCreators;
	
	private Button bAdd;
	private Button bRemove;
	private Button bAddAll;
	private Button bRemoveAll;
	
	@Override
	public void setVisible(boolean visible) 
	{
		
		super.setVisible(visible);
		boolean dataChanged = false;
		
		String newShortName = ((NewDSLVpProjectWizard)getWizard()).getVpShortName().toLowerCase();
		if (! newShortName.equals(vpShortName))
		{
			vpShortName = newShortName;
			dataChanged = true;
		}
		
		String newTargetApp = ((NewDSLVpProjectWizard)getWizard()).getVpTargetApplication();
		if (! newTargetApp.equals(vpTargetApplication))
		{
			vpTargetApplication = newTargetApp;
			dataChanged = true;
		}
		
		
		String vpRootProjectName = ((NewDSLVpProjectWizard)getWizard()).getVpRootProjectName(); 
		String vpDescriptionProjectName = ((NewDSLVpProjectWizard)getWizard()).getVpDescriptionProjectName();
		
		if (vpRootProjectNameText.getText().length()==0 || dataChanged)
			vpRootProjectNameText.setText(vpRootProjectName.toLowerCase());
		
		if (vpDescriptionProjectNameText.getText().length()==0 || dataChanged)
			vpDescriptionProjectNameText.setText(vpDescriptionProjectName.toLowerCase());
	}
	
	public NewDSLVpProjectSecondPage(ISelection selection){
		super(Messages.Wizard_Page2_Title);
	}
	
	public NewDSLVpProjectSecondPage(){
		super(Messages.Wizard_Page2_Title);
	}
	
	public void createControl(Composite parent) {
		Composite cparent = new Composite(parent, SWT.NONE);
		cparent.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		cparent.setLayout(new GridLayout(1, false));
		
		// Compute the list of default concrete Syntax Creators
		computeDefaultSelectedCreator();
		
		// Concrete Syntax Resources Creators Widgets creation
		createConcretSyntaxWidgets(cparent);
		
		// Projects Widgets creation
		createProjectsWidgets(cparent);
		
		// Set wizard controls
		setControl(cparent);
		
		//update error/warning status
	    vpDataChanged();
	}
	
	protected Map<String, String> getAvailableConcreteSyntaxesHandlers() throws CoreException{
		return ConcreteSyntaxResourceCreationManager.getAvailableConcreteSyntaxResourceCreators();
	}
	
	
	private void computeDefaultSelectedCreator(){
		try {
			availableCreator = getAvailableConcreteSyntaxesHandlers();
			Map<String, String> availableCreatorMap = new HashMap<String, String>();
			availableCreatorMap.putAll(availableCreator);
			for (Map.Entry<String, String> map : availableCreatorMap.entrySet()) 
			{
				String creatorID = map.getKey();
				if (isDefaultRepresentation(creatorID))
				{
					availableCreator.remove(map.getKey());
					selectedCreator.put(map.getKey(), map.getValue());
				}
			}

		} catch (CoreException e) {
			e.printStackTrace();
		}
	}
	
	protected boolean isDefaultRepresentation(String represnetationManagerID){
		return (DefaultWizardSelection.isDefault(represnetationManagerID, 
				DefaultWizardSelection.RepresentationDefaultSelection));
	}
	
	private Composite createConcretSyntaxWidgets(Composite parent) {
		if ((availableCreator == null || availableCreator.size() == 0) &&  
				(selectedCreator == null || selectedCreator.size() == 0))
		{
			return null;
		}
		
		Composite csComposit = new Composite(parent, SWT.NONE);
		csComposit.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		csComposit.setLayout(new GridLayout(3, false));
		
		// Create Label
		Label label = new Label(csComposit, SWT.NONE);
		label.setText(Messages.Wizard_Page2_Label_Representation_Select);
		GridData labelGD = new GridData(GridData.FILL_HORIZONTAL);
		labelGD.horizontalSpan = 3;
		label.setLayoutData(labelGD);

		// Create the swt list containing all available concrete syntax creators 
		lAvailableCreators = new List(csComposit, SWT.V_SCROLL | SWT.H_SCROLL | SWT.BORDER);
		GridData lAvailableCreatorsGD = new GridData(GridData.FILL_BOTH);
		lAvailableCreatorsGD.widthHint = (csComposit.getSize().x - 50) /2;
		lAvailableCreators.setLayoutData(lAvailableCreatorsGD);
		lAvailableCreators.addSelectionListener(new ListSelectionListener()); 
		lAvailableCreators.addMouseListener(new ListMouseListener());
		
		if (availableCreator != null && availableCreator.size() != 0)
		{
			Set<Entry<String, String>> entrySet = availableCreator.entrySet();
			for (Entry<String, String> entry : entrySet) {
				lAvailableCreators.add(entry.getValue());
			}
		}
		
		// Create the Button composite
		Composite bCompo = new Composite(csComposit, SWT.NONE);
		GridData bComboGD = new GridData(GridData.CENTER | GridData.VERTICAL_ALIGN_CENTER);
		bComboGD.widthHint = 50;
		bCompo.setLayoutData(bComboGD);
		bCompo.setLayout(new GridLayout(1, false));
		
		GridData bGridData = new GridData(GridData.FILL_BOTH);
		ButtonMouseListener listener = new ButtonMouseListener();
		bAdd = new Button(bCompo, SWT.NONE | SWT.HORIZONTAL);
		bAdd.setText(">"); //$NON-NLS-1$
		bAdd.setLayoutData(bGridData);
		bAdd.addMouseListener(listener);
		bAdd.setEnabled(false);
		
		bRemove = new Button(bCompo, SWT.NONE | SWT.HORIZONTAL);
		bRemove.setText("<"); //$NON-NLS-1$
		bRemove.setLayoutData(bGridData);
		bRemove.addMouseListener(listener);
		bRemove.setEnabled(false);
		
		bAddAll = new Button(bCompo, SWT.NONE | SWT.HORIZONTAL);
		bAddAll.setText(">>"); //$NON-NLS-1$
		bAddAll.setLayoutData(bGridData);
		bAddAll.addMouseListener(listener);
		
		bRemoveAll = new Button(bCompo, SWT.NONE | SWT.HORIZONTAL);
		bRemoveAll.setText("<<"); //$NON-NLS-1$
		bRemoveAll.setLayoutData(bGridData);
		bRemoveAll.addMouseListener(listener);
		bRemoveAll.setEnabled(false);
		
		// Create the user select concrete syntax creators
		lSelectedCreators = new List(csComposit, SWT.V_SCROLL | SWT.H_SCROLL | SWT.BORDER);
		GridData lSelectedCreatorsGD = new GridData(GridData.FILL_BOTH);
		lSelectedCreatorsGD.widthHint = (csComposit.getSize().x - 50) /2;
		lSelectedCreators.setLayoutData(lSelectedCreatorsGD);
		lSelectedCreators.addSelectionListener(new ListSelectionListener()); 
		lSelectedCreators.addMouseListener(new ListMouseListener());
		
		if (selectedCreator != null && selectedCreator.size() != 0)
		{
			Set<Entry<String, String>> entrySet = selectedCreator.entrySet();
			for (Entry<String, String> entry : entrySet) {
				lSelectedCreators.add(entry.getValue());
				((NewDSLVpProjectWizard)getWizard()).setSelectedConcreteSyntaxCreators(selectedCreator);
			}
		}
		
		return csComposit;
	}

	/**
	 * @param parent
	 * @return
	 */
	private Composite createProjectsWidgets(Composite parent) {
		Composite compo = new Composite(parent, SWT.NONE);
		compo.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
	    compo.setLayout(new GridLayout(2, false));
	    Label rootProjectName = new Label(compo, SWT.NONE);
		rootProjectName.setText(Messages.Wizard_Page2_Label_RootProject_Name);
		vpRootProjectNameText = new Text(compo, SWT.BORDER | SWT.SINGLE);
		vpRootProjectNameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		vpRootProjectNameText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				vpDataChanged();
				((NewDSLVpProjectWizard)getWizard()).setVpRootProjectName(vpRootProjectNameText.getText());
			}
		});
		
		Label descriptionProjectName = new Label(compo, SWT.NONE);
		descriptionProjectName.setText(Messages.Wizard_Page2_Label_DescriptionProject_Name);
		vpDescriptionProjectNameText = new Text(compo, SWT.BORDER | SWT.SINGLE);
		vpDescriptionProjectNameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		vpDescriptionProjectNameText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				vpDataChanged();
				((NewDSLVpProjectWizard)getWizard()).
						setVpDescriptionProjectName(vpDescriptionProjectNameText.getText());
			}
		});
		return compo;
	}
	
	private boolean vpDataChanged() {
		String msg = Messages.Wizard_Page2_DataCheck_AlowedCharacters;
		
		String descProjectName = vpDescriptionProjectNameText.getText();
		if (descProjectName != null && descProjectName.trim().length() > 0)
		{
			if (! NamesValidityChecker.isValid(descProjectName, true))
			{
				updateStatus(Messages.Wizard_Page2_DataCheck_DescriptionProject_Invalid + msg);
				return false;
			}

			IProject descProject = ResourcesPlugin.getWorkspace().getRoot().getProject(descProjectName);
			if (descProject.exists()) 
			{
				updateStatus(Messages.bind(Messages.Wizard_Page2_DataCheck_ProjectExists, descProject.getName())); //$NON-NLS-1$
				return false;
			}
		}
		
		
		String rootProjectName = vpRootProjectNameText.getText();
		if (rootProjectName != null && rootProjectName.trim().length() > 0)
		{
			if (! NamesValidityChecker.isValid(rootProjectName, true))
			{
				updateStatus(Messages.Wizard_Page2_DataCheck_RootProjectName_Invalid + msg);
				return false;
			}

			IProject rootProject = ResourcesPlugin.getWorkspace().getRoot().getProject(rootProjectName);
			if (rootProject.exists()) 
			{
				updateStatus(Messages.bind(Messages.Wizard_Page2_DataCheck_ProjectExists, rootProject.getName())); //$NON-NLS-1$
				return false;
			}
		}
		
		
		updateStatus(null);
		return true;
	}

	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}
	
	public String getDslVpProjectName(){
		return vpDescriptionProjectNameText.getText();
	}
	
	/*************************************************************************
	 *************** Internals Classes implementing the listeners ************ 
	 *************************************************************************/
	
	private static final int availableCreator_source = 0;
	private static final int selectedCreator_source = 1;
	
	/************************* List listeners utility *************************/	
	
	class ListSelectionListener implements SelectionListener{

		public void widgetSelected(SelectionEvent e) {
			bAdd.setEnabled(lAvailableCreators.getSelectionIndex() != -1);
			bRemove.setEnabled(lSelectedCreators.getSelectionIndex() != -1);
		}

		public void widgetDefaultSelected(SelectionEvent e) {
		}
	}

	/************************* Mouse listeners utility *************************/
	
	class ListMouseListener implements MouseListener{

		public void mouseDoubleClick(MouseEvent e) {
			
			ListenerUtilities lUtil = new ListenerUtilities();
			List list = (List) e.getSource(); 
			if (list.equals(lAvailableCreators))
			{
				int index = lAvailableCreators.getSelectionIndex();
				String id = lUtil.getCreatorID(availableCreator_source, index);
				if (id != null)
				{
					selectedCreator.put(id, availableCreator.get(id));
					availableCreator.remove(id);
					lAvailableCreators.setFocus();
				}
			}
			else
			{
				int index = lSelectedCreators.getSelectionIndex();
				String id = lUtil.getCreatorID(selectedCreator_source, index);
				if (id != null)
				{
					availableCreator.put(id, selectedCreator.get(id));
					selectedCreator.remove(id);
					lSelectedCreators.setFocus();
				}
			}

			((NewDSLVpProjectWizard)getWizard()).setSelectedConcreteSyntaxCreators(selectedCreator);

			lUtil.updateUI();
		}

		public void mouseDown(MouseEvent e) {
		}

		public void mouseUp(MouseEvent e) {
		}
		
	}
	
	/************************* Button listeners *********************************/
	
	class ButtonMouseListener implements MouseListener{
		public void mouseUp(MouseEvent e) {
			Button b = (Button)e.getSource();
			
			ListenerUtilities lUtil = new ListenerUtilities();

			if (b.equals(bAdd))
			{
				int index = lAvailableCreators.getSelectionIndex();
				String id = lUtil.getCreatorID(availableCreator_source, index);
				if (id != null)
				{
					selectedCreator.put(id, availableCreator.get(id));
					availableCreator.remove(id);
					lAvailableCreators.setFocus();
				}
			}

			if (b.equals(bRemove))
			{
				int index = lSelectedCreators.getSelectionIndex();
				String id = lUtil.getCreatorID(selectedCreator_source, index);
				if (id != null)
				{
					availableCreator.put(id, selectedCreator.get(id));
					selectedCreator.remove(id);
					lSelectedCreators.setFocus();
				}
			}
			if (b.equals(bAddAll))
			{
				selectedCreator.putAll(availableCreator);
				availableCreator.clear();
				lAvailableCreators.removeAll();
			}

			if (b.equals(bRemoveAll))
			{
				availableCreator.putAll(selectedCreator);
				selectedCreator.clear();
				lSelectedCreators.removeAll();
			}
			
			((NewDSLVpProjectWizard)getWizard()).setSelectedConcreteSyntaxCreators(selectedCreator);
			
			lUtil.updateUI();
		}
		
		
		
		public void mouseDoubleClick(MouseEvent e) {
		}

		public void mouseDown(MouseEvent e) {
		}
	}

	/************************* Button listeners utility *************************/
	
	class ListenerUtilities{
		public void updateUI(){

			lAvailableCreators.removeAll();
			if (availableCreator != null && availableCreator.size() != 0)
			{
				Set<String> idSet = availableCreator.keySet();
				for (String id : idSet) 
					lAvailableCreators.add(availableCreator.get(id));
			}

			lSelectedCreators.removeAll();
			if (availableCreator != null && selectedCreator.size() != 0)
			{
				Set<String> idSet = selectedCreator.keySet();
				for (String id : idSet) 
					lSelectedCreators.add(selectedCreator.get(id));
			}

			bAdd.setEnabled(lAvailableCreators.getSelectionIndex() != -1 &&  availableCreator.size() != 0);
			bAddAll.setEnabled(availableCreator.size() != 0);
			bRemove.setEnabled(lSelectedCreators.getSelectionIndex() != -1 && selectedCreator.size() != 0);
			bRemoveAll.setEnabled(selectedCreator.size() != 0);
		}

		private String getCreatorID(int source, int index){
			if (index == -1)
				return null;
			
			Set<String> key = null;
			switch (source) {
			case availableCreator_source:
				key = availableCreator.keySet();
				break;
			case selectedCreator_source:
				key = selectedCreator.keySet();
				break;
			}
			
			if (key == null)
			{
				return null;
			}
			Object[] list =  key.toArray();
			return (String)list[index];
		}
	}
}
