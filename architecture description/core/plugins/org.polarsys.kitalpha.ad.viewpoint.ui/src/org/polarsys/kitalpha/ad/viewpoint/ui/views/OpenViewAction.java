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
package org.polarsys.kitalpha.ad.viewpoint.ui.views;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuCreator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MenuEvent;
import org.eclipse.swt.events.MenuListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.polarsys.kitalpha.ad.common.AD_Log;
import org.polarsys.kitalpha.resourcereuse.model.Location;
import org.polarsys.kitalpha.resourcereuse.model.Resource;

final class OpenViewAction extends Action implements IMenuCreator {
	private Resource resource;
	private List<String> viewIds = new ArrayList<String>();

	private SelectionListener listener = new SelectionListener() {

		public void widgetSelected(SelectionEvent ee) {
			try {
				MenuItem menuItem = (MenuItem) ee.getSource();
				String viewId = (String) menuItem.getData();
				showView(viewId);
			} catch (Exception e) {
				AD_Log.getDefault().logError(e);
			}

		}

		public void widgetDefaultSelected(SelectionEvent e) {

		}
	};

	public OpenViewAction() {
		super("", IAction.AS_DROP_DOWN_MENU);
		setMenuCreator(this);
	}

	public void run() {
		try {
			for (String id : viewIds) {
				showView(id);
			}
		} catch (Exception e) {
			AD_Log.getDefault().logError(e);
		}
	}

	public void setResource(Resource resource) {
		if (this.resource == resource)
			return;
		this.resource = resource;
		setEnabled(resource.getProviderLocation() != Location.WORSPACE);
		viewIds.clear();
		if (resource == null)
			return;
		viewIds = ViewHelper.getViewIds(resource);
	}

	public void dispose() {
		// TODO Auto-generated method stub
	}

	private void fillMenu(Menu menu) {
		for (MenuItem mi : menu.getItems())
			mi.dispose();
		for (String id : viewIds) {
			MenuItem mi = new MenuItem(menu, SWT.PUSH);
			mi.setText(id);
			mi.setData(id);
			mi.addSelectionListener(listener);
		}
	}

	public Menu getMenu(Control parent) {
		Menu dynamicMenu = new Menu(parent);
		dynamicMenu.addMenuListener(new MenuListener() {

			public void menuShown(MenuEvent e) {
				fillMenu((Menu) e.getSource());
			}

			public void menuHidden(MenuEvent e) {
			}
		});

		return dynamicMenu;
	}

	public Menu getMenu(Menu parent) {
		Menu dynamicMenu = new Menu(parent);
		dynamicMenu.addMenuListener(new MenuListener() {

			public void menuShown(MenuEvent e) {
				fillMenu((Menu) e.getSource());
			}

			public void menuHidden(MenuEvent e) {
			}
		});

		return dynamicMenu;
	}

	public void showView(String viewId) throws PartInitException {
		IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		activePage.showView(viewId);
	}
}