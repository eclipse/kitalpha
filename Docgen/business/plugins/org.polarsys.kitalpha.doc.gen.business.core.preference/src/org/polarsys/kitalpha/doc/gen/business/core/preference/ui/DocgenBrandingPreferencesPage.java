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

package org.polarsys.kitalpha.doc.gen.business.core.preference.ui;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.polarsys.kitalpha.doc.gen.business.core.preference.helper.DocgenPreferenceConstant;
import org.polarsys.kitalpha.doc.gen.business.core.preference.internal.Messages;

/**
 * @author Boubekeur Zendagui
 */

public class DocgenBrandingPreferencesPage extends AbstractDocgenPreferencePage {
	protected static final String[] LOGO_EXTENSIONS = { "*.png", "*.gif", "*.jpeg", "*.jpg", "*.bmp", "*.*" };
	
	/**
	 * The String field that allows to set ROOT_PROJECT_NAME__VALUE value
	 */
	private StringFieldEditor copyrightField;
	
	/**
	 * The container of image preferences fields 
	 */
	private Group logoGroup;
	private Composite imgPathGroup;
	private BooleanFieldEditor useDefaultLogoValue;
	private FileFieldEditor logoPathField;
	private StringFieldEditor logoAltField;
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.preference.FieldEditorPreferencePage#createFieldEditors()
	 */
	@Override
	protected void createFieldEditors() {
		// Create Copyright fields
		copyrightField = createCopyrightField(DocgenPreferenceConstant.DOCGEN_BRANDING_COPYRIGHT, 
											  Messages.DOCGEN_BRANDING_COPYRIGHT_FIELD_LABEL, 
											  getFieldEditorParent());
		createLogoWidgets();
		
		addField(copyrightField);
		addField(useDefaultLogoValue);
		addField(logoPathField);
		addField(logoAltField);
	}
	
	/**
	 * <p>
	 * Create instances of the following preferences widgets :
	 * <ul>
	 * 	  <li> {@link #logoGroup} </li>
	 * 	  <ul>
	 * 		<li> a local {@link Composite} </li>
	 * 		<ul>
	 *	  		<li> {@link #useDefaultLogoValue} </li>
	 *		</ul>
	 *		<li> {@link #imgPathGroup} </li>
	 *		<ul>
	 *	  		<li> {@link #logoPathField} </li>
	 *		</ul>
	 *	  	<li> {@link #logoAltField} </li>
	 *	  </ul>
	 * </ul>
	 * </p>
	 */
	private void createLogoWidgets(){
		logoGroup = (Group) createParent(getFieldEditorParent(), Messages.DOCGEN_BRANDING_LOGO_GROUP_TEXT);
		
		// Create Default use of Kitalpha logo checkbox
		GridData gd = new GridData();
		gd.verticalIndent = 5;
		Composite composite = new Composite(logoGroup, SWT.NONE);
		composite.setLayoutData(gd);
		useDefaultLogoValue = new BooleanFieldEditor(DocgenPreferenceConstant.DOCGEN_BRANDING_LOGO_USE_DEFAULT, 
													 Messages.DOCGEN_BRANDING_LOGO_USE_DEFAULT_FIELD_LABEL, 
													 composite);
		
		// Create image path fields
		imgPathGroup = createParent(logoGroup, null);
		logoPathField  = new FileFieldEditor(DocgenPreferenceConstant.DOCGEN_BRANDING_LOGO_PATH, 
				  							 Messages.DOCGEN_BRANDING_LOGO_FIELD_LABEL, 
				  							 true,
				  							 FileFieldEditor.VALIDATE_ON_KEY_STROKE,
				  							 imgPathGroup){
			/*
			 * (non-Javadoc)
			 * Hack: This method return always true because end-user can provide whit scheme = platform:/plugin/xxx or /pluginID/folder/img
			 * @see org.eclipse.jface.preference.StringFieldEditor#isValid()
			 */
			@Override
			public boolean checkState() {
				return true;
			}
		};
		
		logoPathField.setFileExtensions(LOGO_EXTENSIONS);
		
		// Create image alternate text fields
		logoAltField = createCopyrightField(DocgenPreferenceConstant.DOCGEN_BRANDING_LOGO_ALT, 
											 Messages.DOCGEN_BRANDING_LOGO_ALT_FIELD_LABEL, 
											 logoGroup);
		
		handleLogoPreferencesDefaultValues();
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.preference.FieldEditorPreferencePage#performDefaults()
	 */
	@Override
	protected void performDefaults() {
		super.performDefaults();
		getPreferenceStore().setDefault(DocgenPreferenceConstant.DOCGEN_BRANDING_COPYRIGHT, 
				DocgenPreferenceConstant.DOCGEN_BRANDING_COPYRIGHT_DEFAULT_VALUE);
	}
	
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.preference.PreferencePage#setValid(boolean)
	 */
	@Override
	public void setValid(boolean b) {
		Boolean useDefaultLogo = useDefaultLogoValue.getBooleanValue();
		if (useDefaultLogo) {
			super.setValid(true);
		} else {
			super.setValid(b);
		}
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.preference.FieldEditorPreferencePage#propertyChange(org.eclipse.jface.util.PropertyChangeEvent)
	 */
	@Override
	public void propertyChange(PropertyChangeEvent event) {
		super.propertyChange(event);
		if (event.getSource().equals(useDefaultLogoValue))
		{
			logoPathField.setEnabled(! useDefaultLogoValue.getBooleanValue(), imgPathGroup);
			logoAltField.setEnabled(! useDefaultLogoValue.getBooleanValue(), logoGroup);
			if (useDefaultLogoValue.getBooleanValue()) {
				logoPathField.loadDefault();
			}
			
			// logoAltField default value
			if (useDefaultLogoValue.getBooleanValue()) {
				logoAltField.loadDefault();
			}
		
			checkState();
		}
	}
	
	/**
	 * Create a parent widget that will contain preferences fields
	 * @param parent parent {@link Composite}
	 * @param text to display on the top of a {@link Group}. Note that the value of this parameter will 
	 * determine if the result of this method will be a 
	 * {@link Composite} or a {@link Group}
	 * @return A {@link Group} if <code>text</code> has a value or is not null, a {@link Composite} otherwise 
	 */
	private Composite createParent(Composite parent, String text) {
		Composite result = null;
		if (text!= null && text.trim().length() > 0)
		{
			result = new Group(parent, SWT.NONE);
			((Group)result).setText(text);
		} else {
			result = new Composite(parent, SWT.NONE);
		}
			
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = 2;
		gd.verticalIndent = 5;
		GridLayout layout = new GridLayout();
		result.setLayoutData(gd);
		result.setLayout(layout);
        return result;
	}
	
	/**
	 * Create a {@link StringFieldEditor} 
	 * @param name Field name
	 * @param label Field Label
	 * @param parent Field Parent
	 * @return created {@link StringFieldEditor}
	 */
	private StringFieldEditor createCopyrightField(String name, String label, Composite parent){
		return createCopyrightField(name, label, parent, true, null);
	}
	
	private StringFieldEditor createCopyrightField(String name, String label, Composite parent, boolean allowEmpty, String errorMsg){
		StringFieldEditor stringField = new StringFieldEditor(name, label, parent);
		stringField.setEmptyStringAllowed(allowEmpty);
		if (! allowEmpty)
		{
			stringField.setErrorMessage(errorMsg);
		}
		return stringField;
	}
	
	/**
	 * Manage the default values of Logo widgets and preferences
	 */
	private void handleLogoPreferencesDefaultValues(){
		// Handle enable state 
		Boolean useDefaultLogo = store.getBoolean(DocgenPreferenceConstant.DOCGEN_BRANDING_LOGO_USE_DEFAULT);
		// logoPathField default value
		logoPathField.setEmptyStringAllowed(useDefaultLogo);
		logoPathField.setEnabled(! useDefaultLogo, imgPathGroup);
		if (! useDefaultLogo) {
			store.setDefault(DocgenPreferenceConstant.DOCGEN_BRANDING_LOGO_PATH, DocgenPreferenceConstant.DOCGEN_BRANDING_LOGO_PATH_DEFAULT_VALUE);
		}
		// logoAltField default value
		logoAltField.setEnabled(! useDefaultLogo, logoGroup);
		if (! useDefaultLogo) {
			store.setDefault(DocgenPreferenceConstant.DOCGEN_BRANDING_LOGO_ALT, DocgenPreferenceConstant.DOCGEN_BRANDING_LOGO_ALT_DEFAULT_VALUE);
		}
	}
}
