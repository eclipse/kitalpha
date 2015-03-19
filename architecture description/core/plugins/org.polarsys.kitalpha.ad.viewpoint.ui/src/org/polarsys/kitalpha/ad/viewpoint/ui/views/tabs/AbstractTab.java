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

package org.polarsys.kitalpha.ad.viewpoint.ui.views.tabs;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.handlers.ModelListener;
import org.polarsys.kitalpha.ad.viewpoint.handlers.ModelManager;
import org.polarsys.kitalpha.ad.viewpoint.ui.AFImages;
import org.polarsys.kitalpha.ad.viewpoint.ui.Activator;
import org.polarsys.kitalpha.ad.viewpoint.ui.provider.AFSelectionProvider;
import org.polarsys.kitalpha.ad.viewpoint.ui.views.editing.BasicEditingSupport;

/**
 * @author Thomas Guiu
 * 
 */
public abstract class AbstractTab implements Tab, ModelListener, AFImages {
	protected Viewpoint viewpoint;
	private boolean designOnly;
	protected ModelManager modelManager;
	private final List<BasicEditingSupport> editingSupports = new ArrayList<BasicEditingSupport>();
	// TODO as t on besoin du site ?
	protected IViewSite site;
	protected final AFLabelProvider labelProvider;
	private CTabItem item;
	protected AFSelectionProvider selectionProvider;

	protected AbstractTab(AFLabelProvider labelProvider) {
		this.labelProvider = labelProvider;
	}

	public ModelManager getModelManager() {
		return modelManager;
	}

	public void setSite(IViewSite site) {
		this.site = site;
	}

	public ISelectionProvider getSelectionProvider() {
		return null;
	}

	public void setModelManager(Viewpoint vp, ModelManager modelManager) {
		if (this.modelManager != null)
			this.modelManager.removeListener(this);
		if (modelManager != null)
			modelManager.addListener(this);
		this.modelManager = modelManager;
		this.viewpoint = vp;
		for (BasicEditingSupport bes : editingSupports)
			bes.setModelManager(modelManager);
		configureLabelProvider();
	}

	public void setSelectionProvider(AFSelectionProvider selectionProvider) {
		this.selectionProvider = selectionProvider;

	}

	protected Composite createTab(FormToolkit toolkit, CTabFolder folder, String label, String image) {
		return createTab(toolkit, folder, label, Activator.getDefault().getImage(image));
	}

	protected Composite createTab(FormToolkit toolkit, CTabFolder folder, String label, Object url) {
		Image image = ExtendedImageRegistry.getInstance().getImage(url);
		return createTab(toolkit, folder, label, image);
	}

	protected Composite createTab(FormToolkit toolkit, CTabFolder folder, String label, Image image) {
		item = new CTabItem(folder, SWT.NONE);
		item.setText(label);
		item.setImage(image);
		ScrolledForm scrolledForm = toolkit.createScrolledForm(folder);
		scrolledForm.setExpandHorizontal(true);
		scrolledForm.setExpandVertical(true);
		Composite composite = scrolledForm.getBody();
		item.setControl(scrolledForm);
		return composite;
	}

	public void dispose() {
		setModelManager(viewpoint, null);
		if (item != null && !item.isDisposed())
			item.dispose();
	}

	protected BasicEditingSupport register(BasicEditingSupport support) {
		editingSupports.add(support);
		return support;
	}

	public void workspaceHasChanged() {
		configureLabelProvider();
	}

	private void configureLabelProvider() {
		Object ref = modelManager == null ? null : modelManager.getResourceManager().getRootModel();
		labelProvider.setReference(viewpoint, ref);
	}

	public void setDesignOnly(boolean b) {
		designOnly = b;
	}

	public boolean isDesignOnly() {
		return designOnly;
	}

	protected void displayError(String message) {
		site.getActionBars().getStatusLineManager().setErrorMessage(message);
	}

	protected class FocusListener2 implements FocusListener {

		public void doFocusLost(FocusEvent e) {

		}

		public final void focusLost(FocusEvent e) {
			displayError(null);
			try {
				doFocusLost(e);
			} catch (Exception e1) {
				displayError(e1.getMessage());
			}
		}

		public void focusGained(FocusEvent e) {

		}
	}

	protected abstract class SelectionListener2 implements SelectionListener {

		public final void widgetDefaultSelected(SelectionEvent e) {

		}

		public final void widgetSelected(SelectionEvent e) {
			displayError(null);
			try {
				doWidgetSelected(e);
			} catch (Exception ee) {
				displayError(ee.getMessage());
			}

		}

		protected abstract void doWidgetSelected(SelectionEvent e) throws Exception;
	}

}
