/*******************************************************************************
 * Copyright (c) 2017, 2018 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
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
