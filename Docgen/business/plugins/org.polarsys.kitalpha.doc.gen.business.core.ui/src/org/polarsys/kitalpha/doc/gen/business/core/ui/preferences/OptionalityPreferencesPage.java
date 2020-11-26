/*******************************************************************************
 * Copyright (c) 2014, 2019 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.doc.gen.business.core.ui.preferences;

import java.util.Collection;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ICheckStateProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.polarsys.kitalpha.doc.gen.business.core.extension.page.PageExtensionElement;
import org.polarsys.kitalpha.doc.gen.business.core.extension.page.PageExtensionElement.PageExtensionActivationStatus;
import org.polarsys.kitalpha.doc.gen.business.core.extension.page.PageExtensionRegistry;
import org.polarsys.kitalpha.doc.gen.business.core.extension.page.helpers.NamingOptionalityPreferencesHelper;
import org.polarsys.kitalpha.doc.gen.business.core.preference.ui.AbstractDocgenPreferencePage;

/**
 * 
 * @author Faycal Abka
 *
 */
public class OptionalityPreferencesPage extends AbstractDocgenPreferencePage {
	
	private ListViewer domainViewer;
	private CheckboxTableViewer categoryViewer;

	public OptionalityPreferencesPage() {
		//Do nothing
	}

	@Override
	protected void createFieldEditors() {
		//Do nothing
	}
	
	
	@Override
	protected Control createContents(Composite parent) {
		
		Composite child = new Composite(parent, SWT.NONE);
		FillLayout layout = new FillLayout();
		child.setLayout(layout);
		SashForm sash = new SashForm(child, SWT.HORIZONTAL);
		sash.setFont(child.getFont());
		
		Composite domainComposite = new Composite(sash, SWT.NONE);
		domainComposite.setLayout(new GridLayout(1, true));
		
		Label domainLabel = new Label(domainComposite, SWT.NONE);
		domainLabel.setText("Domains"); //$NON-NLS-1$
		GridDataFactory.fillDefaults().grab(true, false).applyTo(domainLabel);
		
		domainViewer = new ListViewer(domainComposite);
		GridDataFactory.fillDefaults().grab(true, true).applyTo(domainViewer.getList());
		
		Composite categoryComposite = new Composite(sash, SWT.NONE);
		categoryComposite.setLayout(new GridLayout(1, true));
		
		Label categoryLabel = new Label(categoryComposite, SWT.NONE);
		categoryLabel.setText("Categories"); //$NON-NLS-1$
		GridDataFactory.fillDefaults().grab(true, false).applyTo(categoryLabel);
		
		categoryViewer = CheckboxTableViewer.newCheckList(categoryComposite, SWT.BORDER);
		GridDataFactory.fillDefaults().grab(true, true).applyTo(categoryViewer.getTable());
		
		domainViewer.setContentProvider(ArrayContentProvider.getInstance());
		categoryViewer.setContentProvider(ArrayContentProvider.getInstance());
		
		domainViewer.setInput(doGetDomains());
		
		domainViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				String selectedDomain = (String)((IStructuredSelection)event.getSelection()).getFirstElement();
				categoryViewer.setInput(doGetCategoriesOfDomain(selectedDomain));
			}
		});
		
		categoryViewer.addCheckStateListener(new ICheckStateListener() {
			
			@Override
			public void checkStateChanged(CheckStateChangedEvent event) {
				String domain = doGetSelectedDomain();
				String category = (String)event.getElement();
				PageExtensionActivationStatus status;
				
				boolean isCategoryChecked = event.getChecked();
				
				if (isCategoryChecked) {
					status = PageExtensionActivationStatus.Active;
				} else {
					status = PageExtensionActivationStatus.Inactive;
				}
				
				PageExtensionRegistry.getInstance().setCategoryActivationStatus(domain, category, status);
				String key = NamingOptionalityPreferencesHelper.getKeyOfPageExtensionElement(domain, category);
				NamingOptionalityPreferencesHelper.setCustomizedStringValue(key, status.name());
				categoryViewer.refresh();
			}
		});
		
		categoryViewer.setCheckStateProvider(new ICheckStateProvider() {
			
			@Override
			public boolean isGrayed(Object element) {
				PageExtensionActivationStatus categoryActivationStatus = doGetPageExtensionActivationStatus((String) element);
				return categoryActivationStatus.equals(PageExtensionActivationStatus.Unknown);
			}

			
			@Override
			public boolean isChecked(Object element) {
				PageExtensionActivationStatus categoryActivationStatus = doGetPageExtensionActivationStatus((String)element);
				return categoryActivationStatus.equals(PageExtensionActivationStatus.Active);
			}
			
			private PageExtensionActivationStatus doGetPageExtensionActivationStatus(Object element) {
				String domain = doGetSelectedDomain();
				String category = (String) element;
				PageExtensionActivationStatus categoryActivationStatus = PageExtensionRegistry.getInstance()
						.getCategoryActivationStatus(domain, category);
				return categoryActivationStatus;
			}
		});
		
		doSelectFirstItem();
		
		return child;
	}
	
	
	@Override
	protected void performDefaults() {
		String[] domains = domainViewer.getList().getItems();
		
		for (String domain : domains) {
			Collection<String> categories = PageExtensionRegistry.getInstance().getCategories(domain);
			for (String category : categories) {
				Collection<PageExtensionElement> categoryExtensions = PageExtensionRegistry.getInstance().getCategoryExtensions(domain, category);
				for (PageExtensionElement pageExtensionElement : categoryExtensions) {
					pageExtensionElement.setCurrentActivactionStatus(pageExtensionElement.getDefaultActivationStatus());
				}
			}
		}
		categoryViewer.refresh();
		super.performDefaults();
	}
	
	private void doSelectFirstItem() {
		int itemCount = domainViewer.getList().getItemCount();
		
		if (itemCount > 0) {
			domainViewer.setSelection(new StructuredSelection(domainViewer.getList().getItem(0)));
		}
	}

	private String doGetSelectedDomain() {
		return (String)((IStructuredSelection)domainViewer.getSelection()).getFirstElement();
	}
	
	private Collection<String> doGetDomains() {
		return PageExtensionRegistry.getInstance().getDomains();
	}
	
	private Collection<String> doGetCategoriesOfDomain(String domain) {
		return PageExtensionRegistry.getInstance().getCategories(domain);
	}

}
