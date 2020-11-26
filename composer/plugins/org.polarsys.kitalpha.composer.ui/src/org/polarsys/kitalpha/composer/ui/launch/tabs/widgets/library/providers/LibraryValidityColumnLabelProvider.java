/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
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
		LibraryItem item = ((LibraryItem)elt);
		Resource res = item.getItem();
		return res.getName();

	}

	public String getToolTipText(Object elt) {
		LibraryItem item = ((LibraryItem)elt);
		Resource res = item.getItem();
		return res.getDescription() == null ? "Library "
				+ res.getName()
				: res.getDescription();
	}


	@Override
	public Image getColumnImage(Object element, int columnIndex) {
		return getImage(element);
	}


	@Override
	public String getColumnText(Object element, int columnIndex) {
		
		return getText(element);
	}


	@Override
	public void addListener(ILabelProviderListener listener) {
		// Do nothing
		
	}


	@Override
	public void dispose() {
		// Do nothing
		
	}


	@Override
	public boolean isLabelProperty(Object element, String property) {
		return false;
	}


	@Override
	public void removeListener(ILabelProviderListener listener) {
		// Do nothing
		
	}
	

}