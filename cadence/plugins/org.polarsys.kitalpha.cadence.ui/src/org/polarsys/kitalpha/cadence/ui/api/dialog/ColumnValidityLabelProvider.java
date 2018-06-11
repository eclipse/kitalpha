/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.cadence.ui.api.dialog;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.swt.graphics.Image;


/**
 * Provides labels for the values of parameters.
 * 
 * @author THALESGROUP
 */
public class ColumnValidityLabelProvider extends ColumnLabelProvider {

	ParametersDialog dialog ; 
	Map<String,String> errorMsg = new HashMap<String, String>();
	IParameterManager manager;
	
	public ColumnValidityLabelProvider(Dialog dialog, IParameterManager manager) {
		super();
		this.dialog = (ParametersDialog)dialog;
		this.manager = manager;
	}
	
	
	@Override
	public String getText(Object element) {
		return  "" ;//$NON-NLS-1$
	}
	
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.ColumnLabelProvider#getText(java.lang.Object)
	 */
	

	@Override
	public Image getImage(Object element) {
		String img =  Dialog.DLG_IMG_MESSAGE_INFO;
		
		String result = getValidityForParamater(element);
		if (!result.equals("")){
			img = Dialog.DLG_IMG_MESSAGE_ERROR;
			
		}
		setValidityLabel(element,result);
		Image i = JFaceResources.getImage(img);
		
		return i;
		
		}


	private String getValidityForParamater(Object element_p) {
		return  manager.validParameter(element_p, dialog.getContainer(),dialog.getMapFromParametersTable());
	}
	
	private void setValidityLabel(Object element, String string){
		String name = manager.getName(element);
		if( !string.equals("")){
			errorMsg.put(name,string);
		}else{
			errorMsg.remove(name);
		}
		String msg = "OK";
		if(!errorMsg.isEmpty()){
			msg ="";
			for(String value : errorMsg.values()){
				msg+= value + "\n";	 // TODO: a refaire afin de supporter \n\t linux
			}
		}
		
		dialog.setValidity(msg);
	}

}