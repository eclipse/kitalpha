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

import java.util.ArrayList;

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
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.helper.desc.ViewpointModelReuseResourceHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;

/**
 * @author Boubekeur Zendagui
 */

public class AFSpecProjectWizardFirstPage extends AbstractAFSpecProjectWizardPage{

	protected Text _afShortNameText;

	private java.util.List<Viewpoint> availableViewpoint  = new ArrayList<Viewpoint>();
	private java.util.List<Viewpoint> selectedViewpoint = new ArrayList<Viewpoint>();
	
	private List lSelectedViewpoints;
	private List lAvailableViewpoints;
	
	private Button bAdd;
	private Button bRemove;
	private Button bAddAll;
	private Button bRemoveAll;
	
	public AFSpecProjectWizardFirstPage() {
		super("Architecture Framework");
	}
	
	public void setShortName(String name){
		_afShortNameText.setText(name);
	}

	public java.util.List<Viewpoint> getAvailableViewpoint(){
		return availableViewpoint;
	}
	
	public java.util.List<Viewpoint> getSelectedViewpoint(){
		return selectedViewpoint;
	}
	
	public void createControl(Composite parent) {
		Composite cparent = new Composite(parent, SWT.NONE);
		cparent.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		cparent.setLayout(new GridLayout(1, false));
		setControl(cparent);
		createTextWidgets(cparent);
		createConcretViewpointsWidgets(cparent);
	}

	/**
	 * @param parent
	 * @return
	 */
	private void createTextWidgets(Composite parent) {
		Composite compo = new Composite(parent, SWT.NONE);
		compo.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		compo.setLayout(new GridLayout(2, false));

		Label afName = new Label(compo, SWT.NONE);
		afName.setText("Short name :");
		_afShortNameText = new Text(compo, SWT.BORDER | SWT.SINGLE);
		_afShortNameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		_afShortNameText.setFocus();
		_afShortNameText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				boolean valid = vpDataChanged(_afShortNameText.getText(), "Architecture framework short name must be valid:", false);
				if (valid) {
					((NewAFSpecProject)getWizard()).setAfShortName(_afShortNameText.getText());
				}
			}
		});
		((NewAFSpecProject)getWizard()).setAfShortName(_afShortNameText.getText());
		vpDataChanged("", "You must set short name value", false);
	}


	private Composite createConcretViewpointsWidgets(Composite parent) {
		availableViewpoint = ViewpointModelReuseResourceHelper.getAvailableVpdslViewpoints(null);
		java.util.List<Viewpoint> availableViewpointTmp  = new ArrayList<Viewpoint>();
		availableViewpointTmp.addAll(availableViewpoint);

		if ((availableViewpoint == null || availableViewpoint.size() == 0) &&  
				(selectedViewpoint == null || selectedViewpoint.size() == 0)){
			return null;
		}
		
		Composite csComposit = new Composite(parent, SWT.NONE);
		csComposit.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		csComposit.setLayout(new GridLayout(3, false));
		
		// Create Label
		Label label = new Label(csComposit, SWT.NONE);
		label.setText("Select the viewpoint to include in the Architecture Framework");
		GridData labelGD = new GridData(GridData.FILL_HORIZONTAL);
		labelGD.horizontalSpan = 3;
		label.setLayoutData(labelGD);

		// Create the swt list containing all available concrete syntax creators 
		lAvailableViewpoints = new List(csComposit, SWT.V_SCROLL | SWT.H_SCROLL | SWT.BORDER | SWT.MULTI);
		GridData lAvailableCreatorsGD = new GridData(GridData.FILL_BOTH);
		lAvailableCreatorsGD.widthHint = (csComposit.getSize().x - 50) /2;
		lAvailableViewpoints.setLayoutData(lAvailableCreatorsGD);
		lAvailableViewpoints.addSelectionListener(new ListSelectionListener()); 
		lAvailableViewpoints.addMouseListener(new ListMouseListener());
		if (availableViewpoint != null && availableViewpoint.size() != 0)
		{
			for (Viewpoint viewpoint : availableViewpoint) {
				lAvailableViewpoints.add(viewpoint.getShortName());
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
		lSelectedViewpoints = new List(csComposit, SWT.V_SCROLL | SWT.H_SCROLL | SWT.BORDER | SWT.MULTI);
		GridData lSelectedCreatorsGD = new GridData(GridData.FILL_BOTH);
		lSelectedCreatorsGD.widthHint = (csComposit.getSize().x - 50) /2;
		lSelectedViewpoints.setLayoutData(lSelectedCreatorsGD);
		lSelectedViewpoints.addSelectionListener(new ListSelectionListener()); 
		lSelectedViewpoints.addMouseListener(new ListMouseListener());
		
		return csComposit;
	}
	
	/*************************************************************************
	 *************** Internals Classes implementing the listeners ************ 
	 *************************************************************************/
	
	/************************* List listeners utility *************************/	
	
	class ListSelectionListener implements SelectionListener{

		public void widgetSelected(SelectionEvent e) {
			bAdd.setEnabled(lAvailableViewpoints.getSelectionIndex() != -1);
			bRemove.setEnabled(lSelectedViewpoints.getSelectionIndex() != -1);
		}

		public void widgetDefaultSelected(SelectionEvent e) {
		}
	}

	/************************* Mouse listeners utility *************************/
	
	class ListMouseListener implements MouseListener{

		public void mouseDoubleClick(MouseEvent e) {
			
			ListenerUtilities lUtil = new ListenerUtilities();
			List list = (List) e.getSource(); 
			if (list.equals(lAvailableViewpoints) ){
				int index = lAvailableViewpoints.getSelectionIndex();
				if (index > -1 ) {
					selectedViewpoint.add(availableViewpoint.get(index));
					availableViewpoint.remove(index);
					lAvailableViewpoints.setFocus();
				}
			}else{
				int index = lSelectedViewpoints.getSelectionIndex();
				if (index > -1 ){
					availableViewpoint.add(selectedViewpoint.get(index));
					selectedViewpoint.remove(index);
					lSelectedViewpoints.setFocus();
				}
			}

			((NewAFSpecProject)getWizard()).setSelectedViewpoint(selectedViewpoint);

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
				int[] indicies = lAvailableViewpoints.getSelectionIndices();
				int r = 0;
				for (int index : indicies) 
				{
					index -= r;
					if (index > -1)
					{
						selectedViewpoint.add(availableViewpoint.get(index));
						availableViewpoint.remove(index);
						lAvailableViewpoints.setFocus();
						r++;
					}
				}
			}

			if (b.equals(bRemove))
			{
				int[] indicies = lSelectedViewpoints.getSelectionIndices();
				int r = 0;
				for (int index : indicies) 
				{
					index -= r;
					if (index > -1)
					{
						availableViewpoint.add(selectedViewpoint.get(index));
						selectedViewpoint.remove(index);
						lSelectedViewpoints.setFocus();
						r++;
					}
				}
			}
			
			if (b.equals(bAddAll)){
				selectedViewpoint.addAll(availableViewpoint);
				availableViewpoint.clear();
				lAvailableViewpoints.removeAll();
			}

			if (b.equals(bRemoveAll)){
				availableViewpoint.addAll(selectedViewpoint);
				selectedViewpoint.clear();
				lSelectedViewpoints.removeAll();
			}
			
			((NewAFSpecProject)getWizard()).setSelectedViewpoint(selectedViewpoint);
			
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
			lAvailableViewpoints.removeAll();
			if (availableViewpoint != null && availableViewpoint.size() != 0)
			{
				for (Viewpoint viewpoint : availableViewpoint) { 
					lAvailableViewpoints.add(viewpoint.getShortName());
				}
			}

			lSelectedViewpoints.removeAll();
			if (availableViewpoint != null && selectedViewpoint.size() != 0){
				for (Viewpoint viewpoint : selectedViewpoint) {
					lSelectedViewpoints.add(viewpoint.getShortName());
				}
			}

			bAdd.setEnabled(lAvailableViewpoints.getSelectionIndex() != -1 &&  availableViewpoint.size() != 0);
			bAddAll.setEnabled(availableViewpoint.size() != 0);
			bRemove.setEnabled(lSelectedViewpoints.getSelectionIndex() != -1 && selectedViewpoint.size() != 0);
			bRemoveAll.setEnabled(selectedViewpoint.size() != 0);
		}
	}
}
