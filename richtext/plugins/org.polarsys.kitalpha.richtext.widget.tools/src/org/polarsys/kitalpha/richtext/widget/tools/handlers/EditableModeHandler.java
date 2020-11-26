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
package org.polarsys.kitalpha.richtext.widget.tools.handlers;

import org.polarsys.kitalpha.richtext.common.intf.MDERichTextWidget;
import org.polarsys.kitalpha.richtext.nebula.widget.MDERichTextConstants;
import org.polarsys.kitalpha.richtext.nebula.widget.toolbar.MDERichTextToolbarItemHandler;

/**
 *
 * @author Faycal Abka
 *
 */
public class EditableModeHandler implements MDERichTextToolbarItemHandler {
	

	@Override
	public void execute(MDERichTextWidget richText) {
		
		boolean editable = richText.isEditable();
		richText.setEditable(!editable);
		if (editable){
			richText.setToolbarItemState(MDERichTextConstants.MDE_EDITABLE, MDERichTextConstants.STATE_OFF);
		} else {
			richText.setToolbarItemState(MDERichTextConstants.MDE_EDITABLE, MDERichTextConstants.STATE_ON);
		}
	}
	
	
	
}
