/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
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
import org.eclipse.swt.events.SelectionAdapter;
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

/**
 * @author Thomas Guiu
 * @author Guillaume Gebhart
 */
final class OpenViewAction extends Action implements IMenuCreator {
	private Resource resource;
	private List<ViewElement> viewIds = new ArrayList<>();

	private SelectionListener listener = new SelectionAdapter() {

		@Override
		public void widgetSelected(SelectionEvent ee) {
			try {
				MenuItem menuItem = (MenuItem) ee.getSource();
				ViewElement viewElt = (ViewElement) menuItem.getData();
				showView(viewElt.getId());
			} catch (Exception e) {
				AD_Log.getDefault().logError(e);
			}

		}

	};

	public OpenViewAction() {
		super("", IAction.AS_DROP_DOWN_MENU); //$NON-NLS-1$
		setMenuCreator(this);
	}
	@Override
	public void run() {
		try {
			for (ViewElement id : viewIds) {
				showView(id.getId());
			}
		} catch (Exception e) {
			AD_Log.getDefault().logError(e);
		}
	}

	/**
	 * 
	 * @param resource
	 */
	public void setResource(final Resource resource) {
		if (this.resource == resource){
			return;
		}
		this.resource = resource;
		setEnabled(resource != null && resource.getProviderLocation() != Location.WORSPACE);
		viewIds.clear();
		if (resource == null){
			return;
		}
		viewIds = ViewHelper.getViewIds(resource);
		if (viewIds.isEmpty()){
			setEnabled(false);
		}
	}

	public void dispose() {
		//nothing to do
	}

	private void fillMenu(Menu menu) {
		for (MenuItem mi : menu.getItems()){
			mi.dispose();
		}
		for (ViewElement view : viewIds) {
			MenuItem mi = new MenuItem(menu, SWT.PUSH);
			mi.setText(view.getName());
			mi.setData(view);
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
				//nothing to do
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
				//nothing to do
			}
		});

		return dynamicMenu;
	}

	public void showView(String viewId) throws PartInitException {
		IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		activePage.showView(viewId);
	}
}