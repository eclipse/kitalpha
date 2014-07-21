/*******************************************************************************
 * Copyright (c) 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation.
 *******************************************************************************/


package org.polarsys.kitalpha.composer.ui.launch.tabs.widgets.library.providers;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.swt.graphics.Image;

import org.polarsys.kitalpha.resourcereuse.model.Resource;


/**
 * Provides labels for the values of parameters.
 * 
 * @author THALESGROUP
 */
public class LibraryValidityColumnLabelProvider implements ITableLabelProvider {


	
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.ColumnLabelProvider#getText(java.lang.Object)
	 */
	

	public Image getImage(Object element) {
		String img =  Dialog.DLG_IMG_MESSAGE_INFO;
		
		boolean valid = getValidityForLibrary(element);
		if (!valid){
			img = Dialog.DLG_IMG_MESSAGE_ERROR;
			
		}

		return JFaceResources.getImage(img);
		
		}


	private boolean getValidityForLibrary(Object element) {
		boolean value = true;
		
		if(element instanceof LibraryItem){
		LibraryItem item = (LibraryItem)element;
			value = item.isValid();
		
		}
		return value;
	}


	


	public String getText(Object elt) {
		String text = "";
		LibraryItem item = ((LibraryItem)elt);
		Object element = item.getItem();
		if(element instanceof Resource){
		Resource res = (Resource) element;
		text = res.getName();
		}else{
			text = element.toString();
		}
			return text;

	}

	public String getToolTipText(Object elt) {
	    String description = null;
	    LibraryItem item = ((LibraryItem)elt);
		Object element = item.getItem();
//	    if (element instanceof Map.Entry) {
//	      Map.Entry entry = (Map.Entry) element;

	      if (element instanceof Resource) {
	        Resource res = (Resource) element;
	        description = res.getDescription() == null ? "Library "
					+ res.getName()
					: res.getDescription();
	      } else {
	        description = element.toString();
	      }
	   // }
	    return description;
	  }


	public Image getColumnImage(Object element, int columnIndex) {
		// TODO Auto-generated method stub
		return getImage(element);
	}


	public String getColumnText(Object element, int columnIndex) {
		
		return getText(element);
	}


	public void addListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub
		
	}


	public void dispose() {
		// TODO Auto-generated method stub
		
	}


	public boolean isLabelProperty(Object element, String property) {
		// TODO Auto-generated method stub
		return false;
	}


	public void removeListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub
		
	}
	

}