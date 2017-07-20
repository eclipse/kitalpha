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
package org.eclipse.kitalpha.richtext.common.intf;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.ModifyListener;

/**
 * Definition of services that MDE Rich text widget must responds to be used in context of MDE
 * 
 * @author Faycal Abka
 *
 */
public interface MDERichTextWidget {
	
	
	/**
	 * Set base href to the widget.
	 * 
	 * @param baseHref
	 */
	void setBaseHrefPath(String baseHref);
	
	
	/**
	 * @return The owner of the property where the content will be saved and loaded
	 */
	EObject getElement();
	
	/**
	 * @return The property where the content will be saved and loaded
	 */
	EStructuralFeature getFeature();
	
	/**
	 * Bind this widget to model object where the content will be saved or loaded 
	 * @param owner not null eObject which hold the property where to save and load the content
	 * @param feature not null eStructuralFeature where save and load the content
	 */
	void bind(EObject owner, EStructuralFeature feature);
	
	/**
	 * Set the MDE Rich Text visibility states
	 * @param visible is the visibility state
	 */
	void setVisible(boolean visible);
	
	/**
	 * @return The text contained in the text area of the Rich text widget or <code>null</code>.<br>The text contains HTML tags 
	 */
	String getText();
	
	/**
	 * Set the text in the editing area.
	 * @param text is the string to set
	 */
	void setText(String text);
	
	/**
	 * Insert Text in the selected position
	 * @param text is the string to insert
	 */
	void insertText(String text);
	
	/**
	 * Insert HTML at the selected position in WYIWYG
	 * @param html is the string to insert
	 */
	void insertRawText(String html);
	
	/**
	 * @return The selected text without HTML Tags
	 */
	String getSelectedText();
	
	/**
	 * @return The selected text with HTML tags
	 */
	String getSelectedRawText();
	
	
	/**
	 * @return whether the edition is allowed in the widget
	 */
	boolean isEditable();
	
	/**
	 * Set editable state of the widget 
	 * @param editable is the editable state
	 */
	void setEditable(boolean editable);
	
	/**
	 * Update the toolbar of the widget
	 */
	void updateToolbar();
	
	/**
	 * Set toolbar item command state
	 * @param command the command of the item set the state
	 * @param state could be one of <br/>
	 * 	<ul>
	 * 		<li>TRISTATE_OFF</li>
	 * 		<li>TRISTATE_ON</li>
	 * 		<li>TRISTATE_DISABLE</li>
	 *  </ul>
	 */
	boolean setToolbarItemState(String command, String state);
	
	/**
	 * Update the whole editor
	 */
	void updateEditor();
	
	/**
	 * Save the content of the property (feature) binded to this widget
	 */
	void saveContent();
	
	/**
	 * Set a custom save strategy. This strategy will be called by saveContent() to store the
	 * value in the feature
	 * @param strategy
	 */
	void setSaveStrategy(SaveStrategy strategy);
	
	/**
	 * Load the content of the property (feature) binded to this widget
	 */
	void loadContent();
	
	/**
	 * Set a focus on Rich Text Widget.
	 * @return whether the widget get the focus
	 */
	boolean setFocus();
	
	/**
	 * force the widget to get the focus
	 * @return whether the widget get the focus
	 */
	boolean forceFocus();
	
	/**
	 * Check if the widget has UI Focus
	 * @return whether the widget has the focus
	 */
	boolean hasFocus();
	
	/**
	 * @param listener
	 */
	void addFocusListener(FocusListener listener);
	
	/**
	 * @param listener
	 */
	void removeFocusListener(FocusListener listener);
	
	
	/**
	 * Add Modify listener to the underlying Rich Text control
	 * @param listener to add
	 */
	void addModifyListener(ModifyListener listener);
	
	/**
	 * Remove Modify listener to the underlying Rich Text control
	 * @param listener to remove
	 */
	void removeModifyListener(ModifyListener listener);
	
	
	/**
	 * Release resources used by MDE Rich Text Widget
	 */
	void dispose();

}
