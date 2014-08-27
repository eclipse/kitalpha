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
package org.polarsys.kitalpha.model.detachment.ui.page;

import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;

/**
 * @author Faycal Abka
 */

//This calss cannot be instanciated.
public abstract class AbstractDetachmentFormPage extends FormPage {
	
	/**
	 * holds the id of finders group
	 */
	protected String finderID;

	public AbstractDetachmentFormPage(FormEditor editor, String id, String title) {
		super(editor, id, title);
	}
	
	
	public void setFinderID(String id){
		this.finderID = id;
	}
	
	public String getFinderID(){
		return this.finderID;
	}

}
