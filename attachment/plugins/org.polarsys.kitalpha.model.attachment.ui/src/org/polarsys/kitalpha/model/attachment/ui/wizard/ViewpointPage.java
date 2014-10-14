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

package org.polarsys.kitalpha.model.attachment.ui.wizard;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.polarsys.kitalpha.model.attachment.ui.Messages;
import org.polarsys.kitalpha.model.common.scrutiny.analyzer.ModelScrutinyException;
import org.polarsys.kitalpha.model.common.scrutiny.analyzer.Scrutineer;
import org.polarsys.kitalpha.model.common.scrutiny.interfaces.IScrutinize;
import org.polarsys.kitalpha.model.common.scrutiny.registry.ModelScrutinyRegistry.RegistryElement;
import org.polarsys.kitalpha.model.common.share.resource.loading.LoadResource;
import org.polarsys.kitalpha.model.common.share.ui.utilities.ExtensionTreeViewer;
import org.polarsys.kitalpha.model.common.share.ui.utilities.vp.providers.ViewpointTreeLabelProvider;
import org.polarsys.kitalpha.model.common.share.ui.utilities.vp.providers.ViewpointTreeProvider;
import org.polarsys.kitalpha.model.common.share.ui.utilities.vp.tree.IViewpointTreeDescription;
import org.polarsys.kitalpha.model.common.share.ui.utilities.vp.tree.ViewpointTreeContainer;

/**
 * @author Thomas Guiu
 * 
 */
public class ViewpointPage extends AbstractWizardPage {
	public static final String NAME = "vppage";
	private Label label;
	private ExtensionTreeViewer treeViewer;
	public ViewpointTreeContainer analysisResult;

	protected ViewpointPage() {
		super(NAME);
		setTitle(Messages.wizard_page_title1);
		setDescription(Messages.wizard_page_description1);
		// setPageComplete(false);
	}

	@Override
	protected void createControls(Composite parent) {
		label = new Label(parent, SWT.None);
		GridData ld = new GridData(GridData.FILL_HORIZONTAL);
		ld.horizontalSpan = 3;
		label.setLayoutData(ld);

		Label label = new Label(parent, SWT.None);
		label.setText(Messages.wizard_page_label2);
		ld = new GridData(GridData.FILL_HORIZONTAL);
		ld.horizontalSpan = 3;
		label.setLayoutData(ld);

		treeViewer = new ExtensionTreeViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
		GridData gd = new GridData(GridData.FILL_BOTH);
		gd.horizontalSpan = 3;
		treeViewer.getControl().setLayoutData(gd);

		treeViewer.setContentProvider(new ViewpointTreeProvider());
		treeViewer.setLabelProvider(new ViewpointTreeLabelProvider());
		treeViewer.setComparator(new ViewerComparator());

	}

	@Override
	public void setVisible(boolean visible) {
		ModelPage page = (ModelPage) getWizard().getPage(ModelPage.NAME);
		label.setText(NLS.bind(Messages.wizard_page_label3, page.getSourceFile().getFullPath().toString()));
		if (visible) {
			final IFile targetFile = page.getTargetFile();
			final IFile sourceFile = page.getSourceFile();
			IRunnableWithProgress op = new IRunnableWithProgress() {
				public void run(IProgressMonitor monitor) throws InvocationTargetException {
					try {
						monitor.beginTask(Messages.wizard_page_label4, 10);
						monitor.worked(1);
						Set<String> targetViewpointIds = getViewpointIds(targetFile);
						monitor.worked(3);

						RegistryElement registry = getRegistry(sourceFile);
						IScrutinize next = registry.getFinders().iterator().next();
						analysisResult = (ViewpointTreeContainer) next.getAnalysisResult();
						monitor.worked(3);

						removeDescriptions(analysisResult.getRoots(), targetViewpointIds);

						monitor.worked(3);
						Thread.sleep(2000);
					} catch (Throwable e) {
						throw new InvocationTargetException(e);
					} finally {
						monitor.done();
					}
				}
			};
			try {
				getContainer().run(false, false, op);
				treeViewer.setInput(analysisResult);
			} catch (InterruptedException e) {
			} catch (InvocationTargetException e) {
				Throwable realException = e.getTargetException();
				MessageDialog.openError(getShell(), Messages.error_dialog_title, realException.getMessage());
			}

		}
		super.setVisible(visible);
	}

	private void removeDescriptions(Collection<IViewpointTreeDescription> elts, Set<String> ids) {
		for (IViewpointTreeDescription child : new ArrayList<IViewpointTreeDescription>(elts)) {
			if (ids.contains(child.getViewpointId()))
				elts.remove(child);
			else
				removeDescriptions(child.getChildren(), ids);
		}
	}

	private Set<String> getViewpointIds(IFile airdResource) throws ModelScrutinyException {
		RegistryElement registryElement = getRegistry(airdResource);
		return getViewpointIds(registryElement);
	}

	private RegistryElement getRegistry(IFile airdResource) throws ModelScrutinyException {
		Resource resource = new LoadResource(airdResource).getResource();
		Scrutineer.startScrutiny(resource);
		// TODO et les autres points d'ext ?
		RegistryElement registryElement = Scrutineer.getRegistryElement("org.polarsys.kitalpha.model.common.scrutiny.contrib.scrutiny.viewpoints");
		return registryElement;
	}

	private Set<String> getViewpointIds(RegistryElement registryElement) {
		HashSet<String> ids = new HashSet<String>();
		IScrutinize next = registryElement.getFinders().iterator().next();
		ViewpointTreeContainer analysisResult = (ViewpointTreeContainer) next.getAnalysisResult();
		collectViewpointIds(ids, analysisResult.getRoots());
		return ids;
	}

	private void collectViewpointIds(HashSet<String> ids, Collection<IViewpointTreeDescription> elts) {
		for (IViewpointTreeDescription desc : elts) {
			ids.add(desc.getViewpointId());
			collectViewpointIds(ids, desc.getChildren());
		}
	}

}
