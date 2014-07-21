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

package org.polarsys.kitalpha.ad.viewpoint.ui.dialogs;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.osgi.service.resolver.BundleDescription;
import org.eclipse.osgi.service.resolver.BundleSpecification;
import org.eclipse.osgi.util.NLS;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.core.plugin.PluginRegistry;
import org.eclipse.search.core.text.TextSearchEngine;
import org.eclipse.search.core.text.TextSearchRequestor;
import org.eclipse.search.core.text.TextSearchScope;
import org.eclipse.search.ui.text.FileTextSearchScope;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.osgi.framework.Bundle;
import org.polarsys.kitalpha.ad.common.AD_Log;
import org.polarsys.kitalpha.ad.viewpoint.ui.Messages;

/**
 * @author Thomas Guiu
 * 
 */
public class ModelFileDialog extends TitleAreaDialog {

	private ListViewer viewer;
	private final List<URI> result = new ArrayList<URI>();
	private final IProject project;

	private final String filePattern;

	public ModelFileDialog(Shell parentShell, IProject project, String filePattern) {
		super(parentShell);
		this.project = project;
		this.filePattern = filePattern;
	}

	protected Control createDialogArea(Composite parent) {
		// top level composite
		Composite parentComposite = (Composite) super.createDialogArea(parent);

		initializeDialogUnits(parentComposite);

		// creates dialog area composite
		Composite contents = createComposite(parentComposite);

		// creates and lay outs dialog area widgets
		createWidgets(contents);

		init();

		Dialog.applyDialogFont(parentComposite);

		return contents;
	}

	public void init() {
		IPluginModelBase model = PluginRegistry.findModel(project);
		if (model == null) {
			setErrorMessage(Messages.LoadModelDialog_error1);
			return;
		}

		List<URI> ecoreUris = new ArrayList<URI>();
		final List<IProject> wsProjects = new ArrayList<IProject>();
		final List<Bundle> pBundles = new ArrayList<Bundle>();

		collectBundles(model, wsProjects, pBundles, new HashSet<String>(300));

		collectFileInPlatform(pBundles, ecoreUris);
		collectFileInWorkspace(wsProjects, ecoreUris);

		viewer.setInput(ecoreUris);
	}

	private void collectFileInPlatform(List<Bundle> pBundles, List<URI> fileUris) {
		for (Bundle bundle : pBundles) {
			Enumeration e = bundle.findEntries(".", filePattern, true);
			while (e != null && e.hasMoreElements()) {
				URL url = (URL) e.nextElement();
				String path = url.getPath();
				URI uri = URI.createPlatformPluginURI(bundle.getSymbolicName() + path.substring(2), true);
				fileUris.add(uri);
			}
		}
	}

	private void collectFileInWorkspace(List<IProject> wsProjects, final List<URI> fileUris) {
		String[] fileNamePattern = new String[] { filePattern };
		TextSearchScope fScope = FileTextSearchScope.newSearchScope(wsProjects.toArray(new IResource[wsProjects.size()]), fileNamePattern, true);

		TextSearchRequestor requestor = new TextSearchRequestor() {
			@Override
			public boolean acceptFile(IFile file) throws CoreException {
				URI uri = URI.createPlatformResourceURI(file.getFullPath().toPortableString(), true);
				fileUris.add(uri);
				return super.acceptFile(file);
			}
		};
		Pattern searchPattern = Pattern.compile("");
		TextSearchEngine.create().search(fScope, requestor, searchPattern, null);
	}

	private void collectBundles(IPluginModelBase model, List<IProject> wsProjects, List<Bundle> pBundles, Set<String> visited) {
		String symbolicName = model.getBundleDescription().getSymbolicName();
		IResource underlyingResource = model.getUnderlyingResource();
		if (underlyingResource != null)
			wsProjects.add(underlyingResource.getProject());
		else {
			Bundle bundle = Platform.getBundle(symbolicName);
			pBundles.add(bundle);
		}

		visited.add(symbolicName);

		BundleDescription description = model.getBundleDescription();
		for (BundleSpecification req : description.getRequiredBundles()) {
			if (req.getSupplier() == null) {
				AD_Log.getDefault().logWarning(NLS.bind(Messages.LoadModelDialog_error2, req.hashCode()));
				continue;
			}
			IPluginModelBase reqModel = PluginRegistry.findModel(req.getSupplier().getSupplier());
			symbolicName = reqModel.getBundleDescription().getSymbolicName();
			if (!visited.contains(symbolicName))
				collectBundles(reqModel, wsProjects, pBundles, visited);
		}

	}

	public void collectDependenciesInWorkspace(IPluginModelBase model, Set<String> wsModels, List<IResource> collector) {
		IResource underlyingResource = model.getUnderlyingResource();
		if (underlyingResource != null)
			collector.add(underlyingResource.getProject());

		BundleDescription description = model.getBundleDescription();
		for (BundleSpecification req : description.getRequiredBundles()) {
			if (req.getSupplier() == null) {
				AD_Log.getDefault().logWarning(NLS.bind(Messages.LoadModelDialog_error2, req.hashCode()));
				continue;
			}
			IPluginModelBase reqModel = PluginRegistry.findModel(req.getSupplier().getSupplier());
			String symbolicName = reqModel.getBundleDescription().getSymbolicName();
			if (wsModels.contains(symbolicName)) {
				collectDependenciesInWorkspace(reqModel, wsModels, collector);
			}
		}
	}

	public Set<String> computeWorkspaceModels() {
		Set<String> result = new HashSet<String>();
		for (IPluginModelBase model : PluginRegistry.getWorkspaceModels())
			result.add(model.getBundleDescription().getSymbolicName());
		return result;
	}

	private void createWidgets(Composite parent) {
		viewer = new ListViewer(parent);
		viewer.getList().setLayoutData(new GridData(GridData.FILL_BOTH));
		viewer.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				getButton(IDialogConstants.OK_ID).setEnabled(!event.getSelection().isEmpty());
			}
		});
		viewer.setSorter(new ViewerSorter());
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				okPressed();
			}
		});
		viewer.setContentProvider(new IStructuredContentProvider() {

			public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
			}

			public void dispose() {
			}

			public Object[] getElements(Object inputElement) {
				if (inputElement instanceof Collection) {
					return ((Collection<?>) inputElement).toArray();
				}
				return new Object[0];
			}
		});
		viewer.setLabelProvider(new LabelProvider());
	}

	protected void createButtonsForButtonBar(Composite parent) {
		// create OK and Cancel buttons by default
		createButton(parent, IDialogConstants.OK_ID, Messages.Dialog_Add_label, true).setEnabled(false);
		createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
	}

	private Composite createComposite(Composite parentComposite) {
		// creates a composite with standard margins and spacing
		Composite contents = new Composite(parentComposite, SWT.NONE);

		contents.setLayout(new GridLayout(1, false));
		contents.setLayoutData(new GridData(GridData.FILL_BOTH));

		setTitle(Messages.LoadModelDialog_title);
		setMessage(Messages.LoadModelDialog_description);
		return contents;
	}

	@Override
	protected void okPressed() {
		IStructuredSelection ss = (IStructuredSelection) viewer.getSelection();
		for (Object obj : ss.toArray()) {
			result.add((URI) obj);
		}
		super.okPressed();
	}

	public List<URI> getResult() {
		return result;
	}

}
