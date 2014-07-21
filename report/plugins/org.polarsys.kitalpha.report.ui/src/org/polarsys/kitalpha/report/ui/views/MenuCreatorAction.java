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
package org.polarsys.kitalpha.report.ui.views;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IMenuCreator;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.ToolItem;

public abstract class MenuCreatorAction extends Action implements IMenuCreator {

	protected Menu menu;

	public MenuCreatorAction() {
		super();
		setMenuCreator(this);
	}

	public MenuCreatorAction(String text) {
		super(text);
		setMenuCreator(this);
	}

	public MenuCreatorAction(String text, ImageDescriptor image) {
		super(text, image);
		setMenuCreator(this);
	}

	public MenuCreatorAction(String text, int style) {
		super(text, style);
		setMenuCreator(this);
	}

	public void dispose() {
		disposeMenu();
	}

	public Menu getMenu(Menu parent) {
		return null;
	}

	public Menu getMenu(Control parent) {
		disposeMenu();
		menu = new Menu(parent);

		fillMenu(parent);

		return menu;
	}

	public void runWithEvent(Event event) {
		ToolItem ti = (ToolItem) event.widget;
		Menu menu2 = getMenu(ti.getParent());
		if (menu2 != null) {
			menu2.setVisible(true);
		}
	}

	protected void fillMenu(Control parent) {
	}

	protected void addActionToMenu(Menu parent, Action action) {
		ActionContributionItem item = new ActionContributionItem(action);
		item.fill(parent, -1);
	}

	protected void disposeMenu() {
		if (menu != null)
			menu.dispose();
	}

}