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


package org.polarsys.kitalpha.ad.viewpoint.dsl.services.reverse.wizard.pages;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.project.wizards.NewDSLVpProjectPage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.reverse.ecore.ConflictingNameResloveStrategy;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.reverse.wizard.ReverseDSLVPProjectWizard;

/**
 * @author Boubekeur Zendagui
 */
public class ReverseFirstPage extends NewDSLVpProjectPage {

	private Group option_G;
	private Group flatten_G;

	private Button flatten_CB;
	private Button prefix_ePackageName_RB;
	private Button sufix_ePackageName_RB;
	
	private Button separator_CB;

	@Override
	protected Composite createMainComposite(Composite parent) {

		final Composite mainComposite = super.createMainComposite(parent);
		
		boolean createOptionwidgets = false;
		final EPackage ePackage = ((ReverseDSLVPProjectWizard)getWizard()).getEPackage();
		if (ePackage != null)
		{
			final EList<EPackage> eSubpackages = ePackage.getESubpackages();
			if (eSubpackages != null && ! eSubpackages.isEmpty())
			{
				createOptionwidgets = true;
			}
		}

		if (createOptionwidgets)
		{
			// Option group
			option_G = new Group(mainComposite, SWT.NONE);
			option_G.setText("Options");

			GridData twoColumnsGD = new GridData(GridData.FILL_HORIZONTAL);
			twoColumnsGD.horizontalSpan = 2;
			option_G.setLayoutData(twoColumnsGD);
			option_G.setLayout(new GridLayout());

			// Flatten check box
			flatten_CB = new Button(option_G, SWT.CHECK);
			flatten_CB.setSelection(false);
			flatten_CB.setText("Flatten and integrate EPackages and Sub-EPackages");
			flatten_CB.addSelectionListener(new ReverseOptionsSelectionListener());


			flatten_G = new Group(option_G, SWT.NONE);
			flatten_G.setEnabled(false);
			flatten_G.setText("Conflicting names");
			flatten_G.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			flatten_G.setLayout(new GridLayout(2, true));

			// Prefix/Sufix buttons
			prefix_ePackageName_RB = new Button(flatten_G, SWT.RADIO);
			prefix_ePackageName_RB.setText("Prefix by EPackage name");
			prefix_ePackageName_RB.setSelection(true);
			prefix_ePackageName_RB.addSelectionListener(new ReverseOptionsSelectionListener());

			sufix_ePackageName_RB = new Button(flatten_G, SWT.RADIO);
			sufix_ePackageName_RB.setText("Sufix by EPackage name");
			sufix_ePackageName_RB.addSelectionListener(new ReverseOptionsSelectionListener());

			// Custon separator widgets
			separator_CB = new Button(flatten_G, SWT.CHECK);
			separator_CB.setSelection(false);
			separator_CB.setText("Separate by \"_\"");
			separator_CB.addSelectionListener(new ReverseOptionsSelectionListener());

			initialzeWidgetsEnablement();
		}

		return mainComposite;
	}

	private void initialzeWidgetsEnablement(){
		flatten_G.setEnabled(flatten_CB.getSelection());
		prefix_ePackageName_RB.setEnabled(flatten_CB.getSelection());
		sufix_ePackageName_RB.setEnabled(flatten_CB.getSelection());
		separator_CB.setEnabled(flatten_CB.getSelection());
	}

	/**
	 * @author Listener
	 */
	
	class ReverseOptionsSelectionListener extends SelectionAdapter {
		/** Reverse wizard **/
		private final ReverseDSLVPProjectWizard _WIZARD = (ReverseDSLVPProjectWizard) getWizard();
		
		public void widgetSelected(SelectionEvent event) {
			final Button button = (Button) event.widget;

			// Check the high level button
			if (button.equals(flatten_CB))
			{
				flatten_CB_Selected_WIDGETS();
				flatten_CB_Selected_DATA();
				return;
			}
			
			// Check separator CheckBox button
			if (button.equals(separator_CB))
			{
				_WIZARD.setAddSeparator(separator_CB.getSelection());
				return;
			}
			
			// Check RadioButton buttons
			if ((button.getStyle() & SWT.RADIO) != 1)
			{
				setConflictingNameResolvingStrategy(button);
			}
		}
		
		private void flatten_CB_Selected_WIDGETS(){
			flatten_G.setEnabled(flatten_CB.getSelection());
			prefix_ePackageName_RB.setEnabled(flatten_CB.getSelection());
			sufix_ePackageName_RB.setEnabled(flatten_CB.getSelection());
			separator_CB.setEnabled(flatten_CB.getSelection());

			if (! flatten_CB.getSelection())
			{
				prefix_ePackageName_RB.setSelection(false);
				sufix_ePackageName_RB.setSelection(false);
				separator_CB.setSelection(false);
			}
			else
			{
				prefix_ePackageName_RB.setSelection(true);
				separator_CB.setSelection(true);
				setConflictingNameResolvingStrategy(prefix_ePackageName_RB);
			}
		}
		
		private void flatten_CB_Selected_DATA(){
			final boolean flattenIsOn = flatten_CB.getSelection();
			_WIZARD.setFlattenEPackages(flattenIsOn);
			_WIZARD.setAddSeparator(separator_CB.getSelection());
			if (! flattenIsOn)
			{
				_WIZARD.setConflictingNameResloveStrategy(ConflictingNameResloveStrategy.None);
			}
		}
		
		private void setConflictingNameResolvingStrategy(Button button){
			ConflictingNameResloveStrategy stategy = ConflictingNameResloveStrategy.None;
			
			if (button.equals(prefix_ePackageName_RB) && prefix_ePackageName_RB.getSelection())
			{
				stategy = ConflictingNameResloveStrategy.PrefixByEPackageName;
			} 
			if (button.equals(sufix_ePackageName_RB)&& sufix_ePackageName_RB.getSelection())
			{
				stategy = ConflictingNameResloveStrategy.SufixByEPackageName;
			}
			_WIZARD.setConflictingNameResloveStrategy(stategy);
		}
	}
}
