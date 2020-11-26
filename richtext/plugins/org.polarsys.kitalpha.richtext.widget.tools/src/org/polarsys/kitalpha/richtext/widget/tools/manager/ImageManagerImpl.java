/*******************************************************************************
 * Copyright (c) 2017 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.richtext.widget.tools.manager;

import java.util.ArrayList;
import java.util.List;

import org.polarsys.kitalpha.richtext.common.intf.MDERichTextWidget;
import org.polarsys.kitalpha.richtext.widget.tools.utils.Constants;

/**
 * 
 * @author Faycal Abka
 *
 */
public class ImageManagerImpl extends LinkManagerImpl {

	
	public ImageManagerImpl(MDERichTextWidget widget) {
		super(widget);
		label2type.put(Constants.LOCAL_LABEL, Constants.LOCAL_LABEL);
		label2type.put(Constants.DISK_LABEL, Constants.DISK_LABEL);
	}
	
	
	@Override
	public List<String> getAllLinkLabels() {
		List<String> result = new ArrayList<String>();
		
		result.add(Constants.LOCAL_LABEL);
		result.add(Constants.DISK_LABEL);
		return result;
	}
}
