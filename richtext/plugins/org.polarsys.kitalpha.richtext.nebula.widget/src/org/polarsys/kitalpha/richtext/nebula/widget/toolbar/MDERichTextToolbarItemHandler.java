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
package org.polarsys.kitalpha.richtext.nebula.widget.toolbar;

import org.polarsys.kitalpha.richtext.common.intf.MDERichTextWidget;

/**
 * Define service of handler to manager click on toolbar item
 * 
 * @author Faycal Abka
 *
 */
public interface MDERichTextToolbarItemHandler {
	
	/**
	 * Called at clicking on toolbar item
	 * @param richText instance widget where the item is attached
	 */
	void execute(MDERichTextWidget richText);

}
