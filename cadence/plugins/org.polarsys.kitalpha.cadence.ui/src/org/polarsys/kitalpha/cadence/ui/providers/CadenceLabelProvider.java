/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
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
