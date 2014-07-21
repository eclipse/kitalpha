/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
/**
 *        (c) 2007-2010 IKOffice GmbH
 *
 *        http://www.ikoffice.de
 *        
 *        EPL from http://code.google.com/p/swtsplitbutton/
 */
package de.ikoffice.widgets;

/**
 * SplitButtonSelectionListener
 * 
 * @author junhuang huangjun78@gmail.com
 * @version 1.0
 */
public interface SplitButtonSelectionListener {

	/**
	 * Fire if the main area of button is clicked
	 */
	public void buttonSelected();

	/**
	 * Fire if right arrow is clicked
	 * 
	 * @return false, not show the menu
	 */
	public boolean showMenu();

}
