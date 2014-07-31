/**
 *        (c) 2007-2010 IKOffice GmbH
 *
 *        http://www.ikoffice.de
 *        
 *        EPL from http://code.google.com/p/swtsplitbutton/
 */
package de.ikoffice.widgets;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;

/**
 * Copied from SplitButton
 * 
 */
public class DropDownButton extends Button {

	private Menu menu;

	public DropDownButton(Composite parent, int style) {
		super(parent, SWT.PUSH);
		setText("");
		super.addListener(SWT.MouseDown, new Listener() {

			public void handleEvent(Event event) {
				Button button = (Button) event.widget;
				Rectangle rect = button.getBounds();
				Point p = button.toDisplay(rect.x, rect.y + rect.height);
				getMenu().setLocation(p.x - rect.x, p.y - rect.y);
				getMenu().setVisible(true);

			}
		});
		menu = new Menu(getShell(), SWT.POP_UP);

	}

	@Override
	public Menu getMenu() {
		return menu;
	}

	@Override
	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

}
