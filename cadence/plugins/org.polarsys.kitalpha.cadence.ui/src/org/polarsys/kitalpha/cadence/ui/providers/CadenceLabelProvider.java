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
package org.polarsys.kitalpha.cadence.ui.providers;


import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.jface.viewers.BaseLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.graphics.Image;

import org.polarsys.kitalpha.cadence.core.api.CadenceRegistry;


/**
 * @author Guillaume Gebhart
 */
public class CadenceLabelProvider extends BaseLabelProvider implements ILabelProvider{



private static String IMAGE_FILE = ""; //$NON-NLS-1$
	
	@Override
	public Image getImage(Object element) {
		
		return null;
	}

	@Override
	public String getText(Object element) {
		String string=""; //$NON-NLS-1$
		if(element instanceof IConfigurationElement) {
			string = CadenceRegistry.getName((IConfigurationElement)element);
		}
		if(element instanceof String) {
			string =(String)element;
		}
		return string;  
		}

	

}
