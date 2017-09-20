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
package org.polarsys.kitalpha.richtext.widget.editor;


import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.browser.BrowserFunction;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchListener;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPartConstants;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.polarsys.kitalpha.richtext.common.intf.MDERichTextWidget;
import org.polarsys.kitalpha.richtext.nebula.widget.MDENebulaBasedRichTextWidget;
import org.polarsys.kitalpha.richtext.widget.editor.intf.MDERichTextEditorCallback;
import org.polarsys.kitalpha.richtext.widget.factory.MDERichTextFactory;
import org.polarsys.kitalpha.richtext.widget.internal.Activator;
import org.polarsys.kitalpha.richtext.widget.internal.extension.MDERichTextExtensionManager;

/**
 * 
 * @author Faycal Abka
 *
 */
public class MDERichTextEditor extends EditorPart implements ITabbedPropertySheetPageContributor {
	
	private static final String SAVE_CALLBACK_EXTENSION_ID = "org.polarsys.kitalpha.richtext.widget.saveResourceCallback"; //$NON-NLS-1$

	private static final String SAVE_CALLBACK_CLASS_ATTR = "class"; //$NON-NLS-1$

	private MDERichTextWidget widget;
	
	private final MDERichTextExtensionManager propertySheetExtensionManager = new MDERichTextExtensionManager(this);
	private TabbedPropertySheetPage propertySheetPage;
	private final IWorkbenchListener closeListener = new IWorkbenchListener() {
		
		@Override
		public boolean preShutdown(IWorkbench workbench, boolean forced) {
			IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
			activePage.closeEditor(MDERichTextEditor.this, true);
			return true;
		}
		
		@Override
		public void postShutdown(IWorkbench workbench) {
			//Do nothing
		}
	};
	
	public MDERichTextEditor() {
		PlatformUI.getWorkbench().addWorkbenchListener(closeListener);
	}


	@Override
	public void doSave(IProgressMonitor monitor) {
		widget.saveContent();
		doSaveCallback(widget);
		firePropertyChange(PROP_DIRTY);
		firePropertyChange(PROP_TITLE);
	}
	

	@Override
	public void doSaveAs() {
		
	}

	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		setSite(site);
		setInput(input);
		setMDERichTextEditorPartName();
		getEditorSite().setSelectionProvider(new ISelectionProvider() {

			@Override
			public void addSelectionChangedListener(ISelectionChangedListener listener_p) {
				// do nothing
			}

			@Override
			public ISelection getSelection() {
				EObject modelElement = widget.getElement();
				return (null != modelElement) ? new StructuredSelection(modelElement) : StructuredSelection.EMPTY;
			}

			@Override
			public void removeSelectionChangedListener(ISelectionChangedListener listener_p) {
				// do nothing
			}

			@Override
			public void setSelection(ISelection selection_p) {
				// do nothing
			}
		});
	}


	private void setMDERichTextEditorPartName() {
		String title = getEditorInput().getName();
		setPartName(title);
	}
	
	
	@Override
	public boolean isDirty() {
		boolean resourceState = doCheckWorkspaceResourceStatus(widget);
		if (resourceState) {
			return widget.isDirty();
		}
		return widget.isDirty();
	}

	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}

	@Override
	public void createPartControl(Composite parent) {
		parent.setLayout(new GridLayout());
		this.widget = (new MDERichTextFactory()).createEditorRichTextWidget(parent);
		
		
		MDERichTextEditorInput input = (MDERichTextEditorInput) getEditorInput();
		this.widget.setSaveStrategy(input.getSaveStrategy());
		widget.bind(input.getElement(), input.getFeature());
		
		new BrowserFunction(((MDENebulaBasedRichTextWidget)widget).getBrowser(), "firePropertyChangeEvent"){ //$NON-NLS-1$
			public Object function(Object[] arguments) {
				firePropertyChange(IWorkbenchPartConstants.PROP_DIRTY);
				return null;
			};
		};
	}
	
	@Override
	public void setFocus() {
		widget.setFocus();
	}
	
	@Override
	public void dispose(){
		if (null != propertySheetPage) {
			propertySheetPage.dispose();
			propertySheetPage = null;
		}
		
		super.dispose();
		
		widget.dispose();
		PlatformUI.getWorkbench().removeWorkbenchListener(closeListener);
	}


	@Override
	public String getContributorId() {
		return propertySheetExtensionManager.getContributorId();
	}
	
	
	public TabbedPropertySheetPage getPropertySheetPage() {
		if (propertySheetPage == null){
			propertySheetPage = propertySheetExtensionManager.getDelegate();
		}
		return propertySheetPage;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Object getAdapter(Class adapter_p) {
		if (IPropertySheetPage.class.equals(adapter_p)) {
			return getPropertySheetPage();
		}
		return super.getAdapter(adapter_p);
	}
	
	private void doSaveCallback(MDERichTextWidget widget) {
		IConfigurationElement[] contributions = Platform.getExtensionRegistry().getConfigurationElementsFor(SAVE_CALLBACK_EXTENSION_ID);
		
		if (contributions != null && contributions.length > 0) {
			for (IConfigurationElement c : contributions) {
				try {
					MDERichTextEditorCallback callback = (MDERichTextEditorCallback) c.createExecutableExtension(SAVE_CALLBACK_CLASS_ATTR);
					callback.saveWorkspaceResource(widget);
				} catch (CoreException e) {
					Status status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
					Activator.getDefault().getLog().log(status);
				}
			}
		}
	}
	
	private boolean doCheckWorkspaceResourceStatus(MDERichTextWidget widget) {
		boolean result = true;
		
		IConfigurationElement[] contributions = Platform.getExtensionRegistry().getConfigurationElementsFor(SAVE_CALLBACK_EXTENSION_ID);

		if (contributions != null && contributions.length > 0) {
			for (IConfigurationElement c : contributions) {
				try {
					MDERichTextEditorCallback callback = (MDERichTextEditorCallback) c.createExecutableExtension(SAVE_CALLBACK_CLASS_ATTR);
					result &= callback.isWorkspaceResourceDirty(widget);
				} catch (CoreException e) {
					Status status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
					Activator.getDefault().getLog().log(status);
				}
			}
		}
		
		return result;
	}
}
