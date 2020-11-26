/*******************************************************************************
 * Copyright (c) 2016, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.doc.gen.business.core.preference.ui;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.RadioGroupFieldEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.polarsys.kitalpha.doc.gen.business.core.preference.helper.DocgenDiagramPreferencesHelper;
import org.polarsys.kitalpha.doc.gen.business.core.preference.helper.DocgenPreferenceConstant;
import org.polarsys.kitalpha.doc.gen.business.core.preference.internal.Messages;

/**
 * @author Boubekeur Zendagui
 */
public class DocgenDiagramsPreferencesPage extends AbstractDocgenPreferencePage {
	
	private BooleanFieldEditor useExportDiagrams;
//	private ComboFieldEditor useImageFormat;
	private RadioGroupFieldEditor useImageFormat;
	
	@Override
	protected void createFieldEditors() {
		
		Composite composite = createParent(getFieldEditorParent(), "Diagrams");
		
		useExportDiagrams = new BooleanFieldEditor(DocgenPreferenceConstant.DOCGEN_DIAGRAMS_EXPORT, 
				 Messages.DOCGEN_DIAGRAM_EXPORT_FIELD_LABEL, composite);
		
		useImageFormat = new RadioGroupFieldEditor(DocgenPreferenceConstant.DOCGEN_DIAGRAMS_IMAGE_FORMAT, 
				Messages.DOCGEN_DIAGRAMS_IMAGE_FORMAT_FIELD_LABEL, 7, getImageFormatValues(), composite); //$NON-NLS-1$
		
		addField(useExportDiagrams);
		addField(useImageFormat);
	}
		
	private String[][] getImageFormatValues(){
		String[][] values = new String[DocgenDiagramPreferencesHelper.IMAGE_FORMAT_SAFE_VALUES.length][2];
		for (int i = 0; i < DocgenDiagramPreferencesHelper.IMAGE_FORMAT_SAFE_VALUES.length; i++) {
			values[i][0] = values[i][1] = DocgenDiagramPreferencesHelper.IMAGE_FORMAT_SAFE_VALUES[i].getName();
		}
		return values;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.preference.FieldEditorPreferencePage#performDefaults()
	 */
	@Override
	protected void performDefaults() {
		super.performDefaults();
		store.setDefault(DocgenPreferenceConstant.DOCGEN_DIAGRAMS_EXPORT, 
				DocgenPreferenceConstant.DOCGEN_DIAGRAMS_EXPORT_DEFAULT_VALUE);
	}
	
	/**
	 * Create a parent widget that will contain preferences fields
	 * @param parent parent {@link Composite}
	 * @param text to display on the top of a {@link Group}. Note that the value of this parameter will 
	 * determine if the result of this method will be a {@link Composite} or a {@link Group}
	 * @return A {@link Group} if <code>text</code> has a value or is not null, a {@link Composite} otherwise 
	 */
	private Composite createParent(Composite parent, String text) {
		Composite result = null;
		if (text!= null && text.trim().length() > 0)
		{
			result = new Group(parent, SWT.NONE);
			((Group)result).setText(text);
		}
		else
                {
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
}
