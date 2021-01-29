/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.common.ui.preference;


import java.util.Map;

import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.dialogs.PreferenceLinkArea;
import org.eclipse.ui.preferences.IWorkbenchPreferenceContainer;

/**
 * @author Boubekeur Zendagui
 */

public class GenericPreferencePage extends PreferencePage implements IWorkbenchPreferencePage{

	/**
	 * A Map containing data about links to add to the current page
	 */
	private Map<String, String> _linksData;
	
	/**
	 * Initialize page description. Derived classes implements this method if 
	 * a description must to be displayed on the page 
	 * @return page description
	 */
	public String initPageDescription(){
		return null;
	}
	
	/**
	 * @param data a Map containing data of nature <preferenceID, Message>
	 */
	protected void setLinksData(Map<String, String> data){
		_linksData = data;
	}
	
	/**
	 * @see IWorkbenchPreferencePage#init(IWorkbench)
	 */
	@Override
	public void init(IWorkbench workbench) {
		final String description = initPageDescription();
		if (description != null) {
			setDescription(description);
		}
	}

	/**
	 * @see PreferencePage#createControl(Composite)
	 */
	@Override
	protected Control createContents(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		composite.setLayout(layout);
		GridData gridData = new GridData(GridData.FILL_BOTH);
		composite.setLayoutData(gridData);
		
		if (_linksData != null && ! _linksData.isEmpty())
		{
			for (String preferenceID : _linksData.keySet()) 
			{
				final String message = _linksData.get(preferenceID);
				createLink(preferenceID, message, composite);
			}
		}
		
		return composite;
	}
	
	/**
	 * Create a link to a preference page
	 * @param preferenceID the id provided in the extension
	 * @param message text to display
	 * @param parent the parent composite wherein the link will be created
	 */
	private void createLink(String preferenceID, String message, Composite parent){
		final IWorkbenchPreferenceContainer preferenceContainer = (IWorkbenchPreferenceContainer) getContainer();
		PreferenceLinkArea pageLink = new PreferenceLinkArea(parent, SWT.NONE, preferenceID, message, preferenceContainer, null);
		pageLink.getControl().setLayoutData(new GridData(GridData.FILL_HORIZONTAL | GridData.GRAB_HORIZONTAL));
	}
}
