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
