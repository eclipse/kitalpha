/*******************************************************************************
 * Copyright (c) 2017 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.richtext.mde.tools.misc.handlers;

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
