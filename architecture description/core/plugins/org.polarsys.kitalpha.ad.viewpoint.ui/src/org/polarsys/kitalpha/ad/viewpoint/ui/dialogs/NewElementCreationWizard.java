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
package org.polarsys.kitalpha.ad.viewpoint.ui.dialogs;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.internal.ui.wizards.NewElementWizard;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.pde.core.plugin.IPluginBase;
import org.eclipse.pde.core.plugin.IPluginExtension;
import org.eclipse.pde.core.plugin.IPluginImport;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.core.plugin.IPluginModelFactory;
import org.eclipse.pde.internal.core.ICoreConstants;
import org.eclipse.pde.internal.core.PDECore;
import org.eclipse.pde.internal.core.bundle.WorkspaceBundlePluginModel;
import org.eclipse.pde.internal.core.bundle.WorkspaceBundlePluginModelBase;
import org.eclipse.pde.internal.core.plugin.PluginObject;
import org.polarsys.kitalpha.ad.viewpoint.ui.Activator;

public abstract class NewElementCreationWizard extends NewElementWizard {

	protected List<String> requiredDependencies = new ArrayList<>();
	protected NewElementWizardPage fPage;

	public NewElementCreationWizard() {
		super();
		setDialogSettings(Activator.loadWizardSettings());
	}

	@Override
	public void addPages() {
		super.addPages();
		addPage(fPage);
		fPage.init(getSelection());
	}

	protected String getFullClassname() {
		return fPage.getPackageText() + "." + fPage.getTypeName();
	}

	protected String getElementName() {
		return fPage.getElementName();
	}

	@Override
	protected void finishPage(final IProgressMonitor monitor) throws InterruptedException, CoreException {
		IProject project = fPage.getJavaProject().getProject();
		//
		IDialogSettings section = getDialogSettingSection();
		if (section != null) {
			section.put(Activator.DEFAULT_LOCATION_KEY, fPage.getPackageFragmentRootText());
			section.put(Activator.DEFAULT_PACKAGE_KEY, fPage.getPackageText());
		}
		Activator.saveWizardSettings(getDialogSettings());

		WorkspaceBundlePluginModelBase model = getModel(project);
		addRequiredDependencies(model);
		manageManifestFile(model);
		model.save();
		getShell().getDisplay().asyncExec(() -> {
				try {
					postFinishPage(monitor);
				} catch (Exception e) {
					Activator.getDefault().logError(e);
				}
		});
	}

	protected abstract IDialogSettings getDialogSettingSection();

	protected void postFinishPage(final IProgressMonitor monitor) throws InterruptedException, CoreException {
		fPage.createType(null);
	}

	public WorkspaceBundlePluginModelBase getModel(IProject project) throws CoreException {
		// This is a quick& dirty hack to manage EP creations and dependency
		// additions
		WorkspaceBundlePluginModel model = new WorkspaceBundlePluginModel(project.getFile(ICoreConstants.BUNDLE_FILENAME_DESCRIPTOR), project.getFile(ICoreConstants.PLUGIN_FILENAME_DESCRIPTOR));
		model.load();

		IPluginModelBase findModel = PDECore.getDefault().getModelManager().findModel(project);

		// PDECore.getDefault().getModelManager().getExternalModelManager()
		// PDECore.getDefault().getModelManager().bundleRootChanged(project)
		IPluginExtension[] findExtensionsForPlugin = PDECore.getDefault().getExtensionsRegistry().findExtensionsForPlugin(findModel);
		for (IPluginExtension extension : PDECore.getDefault().getExtensionsRegistry().findExtensionsForPlugin(findModel)) {

			((PluginObject) extension).setModel(model.getExtensionsModel());
			((PluginObject) extension).setParent(model.getExtensions());

			model.getExtensions().add(extension);
		}
		return model;
	}

	protected void addRequiredDependencies(IPluginModelBase model) throws CoreException {
		IPluginModelFactory factory = model.getPluginFactory();
		IPluginBase base = model.getPluginBase();

		// 1 - Add required dependencies
		List<String> requiredDependenciesCopy = new ArrayList<>(requiredDependencies);
		if (base.getImports() != null) {
			for (IPluginImport plugin : base.getImports()) {
				requiredDependenciesCopy.remove(plugin.getId());
			}
			for (String dependency : requiredDependenciesCopy) {
				IPluginImport plugin = factory.createImport();
				plugin.setId(dependency);
				plugin.setName(dependency);
				plugin.setReexported(true);
				base.add(plugin);
			}
		}
	}

	protected abstract void manageManifestFile(IPluginModelBase model) throws CoreException;

	@Override
	public boolean performFinish() {
		warnAboutTypeCommentDeprecation();
		boolean res = super.performFinish();
		if (res) {
			IResource resource = fPage.getModifiedResource();
			if (resource != null) {
				selectAndReveal(resource);
				openResource((IFile) resource);
			}
		}
		return res;
	}

	@Override
	public IJavaElement getCreatedElement() {
		return fPage.getCreatedType();
	}

}