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

package org.polarsys.kitalpha.model.attachment.ui;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
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
		setTitle("Viewpoint Page");
		setDescription("Select the viewpoints to attach.");
		// setPageComplete(false);
	}

	@Override
	protected void createControls(Composite parent) {
		label = new Label(parent, SWT.None);
		GridData ld = new GridData(GridData.FILL_HORIZONTAL);
		ld.horizontalSpan = 3;
		label.setLayoutData(ld);

		Label label = new Label(parent, SWT.None);
		label.setText("Attachable viewpoints:");
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
		label.setText("Source model: " + page.getSourceFile().getFullPath().toString());
		if (visible) {
			try {
				Set<String> targetViewpointIds = getViewpointIds(page.getTargetFile());
				// Set<String> ancestorViewpointIds = getViewpointIds(page.getAncestorFile());

				RegistryElement registry = getRegistry(page.getSourceFile());
				IScrutinize next = registry.getFinders().iterator().next();
				analysisResult = (ViewpointTreeContainer) next.getAnalysisResult();
				removeDescriptions(analysisResult.getRoots(), targetViewpointIds);
				treeViewer.setInput(analysisResult);
				System.out.println();
			} catch (ModelScrutinyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
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
