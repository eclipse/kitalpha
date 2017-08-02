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
package org.polarsys.kitalpha.richtext.widget.propertysheet;

import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.polarsys.kitalpha.richtext.widget.editor.MDERichTextEditor;

/**
 * 
 * @author Faycal Abka
 *
 */
public interface  MDERichTextPropertySheetProvider {
	
	public TabbedPropertySheetPage getTabbedPropertySheetPageDelegate(MDERichTextEditor contributor);

}
