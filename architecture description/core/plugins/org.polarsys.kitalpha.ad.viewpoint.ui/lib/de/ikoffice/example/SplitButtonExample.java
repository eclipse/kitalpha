/**
 *        (c) 2007-2010 IKOffice GmbH
 *
 *        http://www.ikoffice.de
 *        
 *        EPL from http://code.google.com/p/swtsplitbutton/
 */
package de.ikoffice.example;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;

import de.ikoffice.widgets.SplitButton;
import de.ikoffice.widgets.SplitButtonSelectionListener;

public class SplitButtonExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setSize(300, 300);
		shell.setLayout(new FormLayout());
		SplitButton btnShutDown = new SplitButton(shell, SWT.NONE);
		final FormData fd_btnShutDown = new FormData();
		fd_btnShutDown.right = new FormAttachment(0, 170);
		fd_btnShutDown.top = new FormAttachment(0, 50);
		fd_btnShutDown.left = new FormAttachment(0, 25);
		btnShutDown.setLayoutData(fd_btnShutDown);
		btnShutDown.setText("Shut Down");
		menuCreator(btnShutDown.getMenu());
		btnShutDown.addSplitButtonSelectionListener(new SplitButtonSelectionListener() {

			public boolean showMenu() {
				System.out.println("Show menu");
				return true;
			}

			public void buttonSelected() {
				System.out.println("click Splitbutton");
			}
		});

		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()){
				display.sleep();
			}
		}
		display.dispose();
	}

	private static void menuCreator(Menu menu) {

		MenuItem[] items = menu.getItems();
		if (items != null) {
			for (MenuItem item : items) {
				item.dispose();
			}
		}

		MenuItem logout = new MenuItem(menu, SWT.PUSH);
		logout.setText("Log Out ...");
		logout.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				System.out.println("Click Log Out menu item");
			}

		});

		MenuItem hiberante = new MenuItem(menu, SWT.PUSH);
		hiberante.setText("Hibernate ...");
		hiberante.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				System.out.println("Click Hibernate menu item");
			}

		});

		MenuItem restart = new MenuItem(menu, SWT.PUSH);
		restart.setText("Restart ...");
		restart.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				System.out.println("Click Restart menu item");
			}

		});

		MenuItem shutdown = new MenuItem(menu, SWT.PUSH);
		shutdown.setText("Shut Down ...");
		shutdown.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				System.out.println("Click Shut Down menu item");
			}

		});

	}
}
