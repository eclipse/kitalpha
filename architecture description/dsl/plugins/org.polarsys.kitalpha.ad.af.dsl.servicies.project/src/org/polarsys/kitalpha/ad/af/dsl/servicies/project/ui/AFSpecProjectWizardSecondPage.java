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

package org.polarsys.kitalpha.ad.af.dsl.servicies.project.ui;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
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
import org.polarsys.kitalpha.ad.af.dsl.services.preference.helper.AFRootProjectNamePreferencesHelper;
import org.polarsys.kitalpha.ad.af.dsl.servicies.project.extension.ConcreteSyntaxResourceCreationManager;

/**
 * @author Boubekeur Zendagui
 */

public class AFSpecProjectWizardSecondPage extends AbstractAFSpecProjectWizardPage{
	
	
	private Text _afSpecificationProjectName;
	private Text _afRootProjectName;
	

	private Map<String, String> availableCreator  = new HashMap<String, String>();
	private Map<String, String> selectedCreator = new HashMap<String, String>();
	
	private List lSelectedCreators;
	private List lAvailableCreators;
	
	private Button bAdd;
	private Button bRemove;
	private Button bAddAll;
	private Button bRemoveAll;
	
	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible);
		if (visible)
		{
			_afRootProjectName.setText(getAFRootProjectName());
			_afSpecificationProjectName.setText(getAFRootProjectName() + ".afdsl");
		}
	}
	
	public AFSpecProjectWizardSecondPage() {
		super("Architecture Framework");
	}
	
	protected AFSpecProjectWizardSecondPage(String pageName) {
		super(pageName);
	}
	
	public void setProjectName(String name){
		_afSpecificationProjectName.setText(name);
	}

	public void setRootProjectName(String name){
		_afRootProjectName.setText(name);
	}

	@Override
	public void createControl(Composite parent) {
		Composite compo = new Composite(parent, SWT.NONE);
		setControl(compo);
		compo.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
	    compo.setLayout(new GridLayout(1, false));
	    
	    createConcretSyntaxWidgets(compo);
	    
	    createProjectNamesWidgets(compo);
	}
	
	private String getPreferencesRootProjectName(){
		return AFRootProjectNamePreferencesHelper.getCustomizedValue();
	}
	
	private String getShortName(){
		return ((NewAFSpecProject)getWizard()).getAfShortName().toLowerCase().replaceAll("\\s+", "");
	}
	
	private String getAFRootProjectName(){
		final String prefRootProjectName = getPreferencesRootProjectName();
		final String shortName = getShortName();
		String rootProjectName = (prefRootProjectName != null && prefRootProjectName.trim().length() > 0 ? prefRootProjectName: "org.polarsys.kitalpha.af");
		rootProjectName = rootProjectName + "." + shortName;
		return rootProjectName;
	}
	
	private Composite createProjectNamesWidgets(Composite parent){
		Composite projectsComposit = new Composite(parent, SWT.NONE);
		projectsComposit.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		projectsComposit.setLayout(new GridLayout(2, false));
		
		Label rootProjectName = new Label(projectsComposit, SWT.NONE);
		rootProjectName.setText("Root project name :");
		_afRootProjectName = new Text(projectsComposit, SWT.BORDER | SWT.SINGLE);
		_afRootProjectName.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		_afRootProjectName.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				boolean valid = vpDataChanged(_afRootProjectName.getText(), "Architecture framework root project name must be valid:", true);
				if (valid)
				{
					((NewAFSpecProject)getWizard()).setAfRootProjectName(_afRootProjectName.getText());
					_afSpecificationProjectName.setText(_afRootProjectName.getText()+".afdsl");
				}
			}
		});
		vpDataChanged(_afRootProjectName.getText(), null, true);

		Label descriptionProjectName = new Label(projectsComposit, SWT.NONE);
		descriptionProjectName.setText("Description project name :");
		_afSpecificationProjectName = new Text(projectsComposit, SWT.BORDER | SWT.SINGLE);
		_afSpecificationProjectName.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		_afSpecificationProjectName.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				boolean valid = vpDataChanged(_afSpecificationProjectName.getText(), "Architecture framework description project name must be valid:", true);
				if (valid) {
					((NewAFSpecProject)getWizard()).setAfSpecificationProjectName(_afSpecificationProjectName.getText());
				}
			}
		});
		vpDataChanged(_afSpecificationProjectName.getText(), null, true);
		((NewAFSpecProject)getWizard()).setAfRootProjectName(_afRootProjectName.getText());
		((NewAFSpecProject)getWizard()).setAfSpecificationProjectName(_afSpecificationProjectName.getText());
		
		return projectsComposit;
	}
	
	private Composite createConcretSyntaxWidgets(Composite parent) {
		// get the available list of concrete Syntax Creators to add them in the list
		try {
			availableCreator = getAvailableConcreteSyntaxesHandlers();
			Map<String, String> availableCreatorTmp  = new HashMap<String, String>();
			availableCreatorTmp.putAll(availableCreator);
			for (Map.Entry<String, String> map : availableCreatorTmp.entrySet()) {
				String creatorID = map.getKey();
				if (DefaultWizardSelection.isDefault(creatorID, DefaultWizardSelection.RepresentationDefaultSelection)){
					availableCreator.remove(map.getKey());
					selectedCreator.put(map.getKey(), map.getValue());
				}
			}
			
		} catch (CoreException e) {
		}
		
		if ((availableCreator == null || availableCreator.size() == 0) &&  
				(selectedCreator == null || selectedCreator.size() == 0)){
			return null;
		}
		
		Composite csComposit = new Composite(parent, SWT.NONE);
		csComposit.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		csComposit.setLayout(new GridLayout(3, false));
		
		// Create Label
		Label label = new Label(csComposit, SWT.NONE);
		label.setText("Select the representation to edit the Architecture Framework");
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
		
		if (availableCreator != null && availableCreator.size() != 0){
			Set<String> idSet = availableCreator.keySet();
			for (String id : idSet){
				lAvailableCreators.add(availableCreator.get(id));
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
		
		if (selectedCreator != null && selectedCreator.size() != 0){
			Set<String> idSet = selectedCreator.keySet();
			for (String id : idSet){
				lSelectedCreators.add(selectedCreator.get(id));
				((NewAFSpecProject)getWizard()).setSelectedConcreteSyntaxCreators(selectedCreator);
			}
		}
		
		return csComposit;
	}
	
	protected Map<String, String> getAvailableConcreteSyntaxesHandlers() throws CoreException{
		return ConcreteSyntaxResourceCreationManager.getAvailableAFConcreteSyntaxResourceCreators();
	}
	
	/*************************************************************************
	 *************** Internals Classes implementing the listeners ************ 
	 *************************************************************************/
	
	private static final int availableCreator_source = 0;
	private static final int selectedCreator_source = 1;
	
	/************************* List listeners utility *************************/	
	
	class ListSelectionListener implements SelectionListener{

		@Override
		public void widgetSelected(SelectionEvent e) {
			bAdd.setEnabled(lAvailableCreators.getSelectionIndex() != -1);
			bRemove.setEnabled(lSelectedCreators.getSelectionIndex() != -1);
		}

		@Override
		public void widgetDefaultSelected(SelectionEvent e) {
		}
	}

	/************************* Mouse listeners utility *************************/
	
	class ListMouseListener implements MouseListener{

		@Override
		public void mouseDoubleClick(MouseEvent e) {
			
			ListenerUtilities lUtil = new ListenerUtilities();
			List list = (List) e.getSource(); 
			if (list.equals(lAvailableCreators) ){
				int index = lAvailableCreators.getSelectionIndex();
				String id = lUtil.getCreatorID(availableCreator_source, index);
				if (id != null){
					selectedCreator.put(id, availableCreator.get(id));
					availableCreator.remove(id);
					lAvailableCreators.setFocus();
				}
			}else{
				int index = lSelectedCreators.getSelectionIndex();
				String id = lUtil.getCreatorID(selectedCreator_source, index);
				if (id != null){
					availableCreator.put(id, selectedCreator.get(id));
					selectedCreator.remove(id);
					lSelectedCreators.setFocus();
				}
			}

			

			((NewAFSpecProject)getWizard()).setSelectedConcreteSyntaxCreators(selectedCreator);

			lUtil.updateUI();
		}

		@Override
		public void mouseDown(MouseEvent e) {
		}

		@Override
		public void mouseUp(MouseEvent e) {
		}
		
	}
	
	/************************* Button listeners *********************************/
	
	class ButtonMouseListener implements MouseListener{
		@Override
		public void mouseUp(MouseEvent e) {
			Button b = (Button)e.getSource();
			
			ListenerUtilities lUtil = new ListenerUtilities();

			if (b.equals(bAdd)){
				int index = lAvailableCreators.getSelectionIndex();
				String id = lUtil.getCreatorID(availableCreator_source, index);
				if (id != null){
					selectedCreator.put(id, availableCreator.get(id));
					availableCreator.remove(id);
					lAvailableCreators.setFocus();
				}
			}

			if (b.equals(bRemove)){
				int index = lSelectedCreators.getSelectionIndex();
				String id = lUtil.getCreatorID(selectedCreator_source, index);
				if (id != null){
					availableCreator.put(id, selectedCreator.get(id));
					selectedCreator.remove(id);
					lSelectedCreators.setFocus();
				}
			}
			if (b.equals(bAddAll)){
				selectedCreator.putAll(availableCreator);
				availableCreator.clear();
				lAvailableCreators.removeAll();
			}

			if (b.equals(bRemoveAll)){
				availableCreator.putAll(selectedCreator);
				selectedCreator.clear();
				lSelectedCreators.removeAll();
			}
			
			((NewAFSpecProject)getWizard()).setSelectedConcreteSyntaxCreators(selectedCreator);
			
			lUtil.updateUI();
		}
		
		
		
		@Override
		public void mouseDoubleClick(MouseEvent e) {
		}

		@Override
		public void mouseDown(MouseEvent e) {
		}
	}

	/************************* Button listeners utility *************************/
	
	class ListenerUtilities{
		public void updateUI(){

			lAvailableCreators.removeAll();
			if (availableCreator != null && availableCreator.size() != 0){
				Set<String> idSet = availableCreator.keySet();
				for (String id : idSet) {
					lAvailableCreators.add(availableCreator.get(id));
				}
			}

			lSelectedCreators.removeAll();
			if (availableCreator != null && selectedCreator.size() != 0){
				Set<String> idSet = selectedCreator.keySet();
				for (String id : idSet) {
					lSelectedCreators.add(selectedCreator.get(id));
				}
			}

			bAdd.setEnabled(lAvailableCreators.getSelectionIndex() != -1 &&  availableCreator.size() != 0);
			bAddAll.setEnabled(availableCreator.size() != 0);
			bRemove.setEnabled(lSelectedCreators.getSelectionIndex() != -1 && selectedCreator.size() != 0);
			bRemoveAll.setEnabled(selectedCreator.size() != 0);
		}

		private String getCreatorID(int source, int index){
			Set<String> key = null;
			switch (source) {
			case availableCreator_source:
				key = availableCreator.keySet();
				break;
			case selectedCreator_source:
				key = selectedCreator.keySet();
				break;
			}
			if (key == null){
				return null;
			}
			Object[] list =  key.toArray();
			return (String)list[index];
		}
	}
}
