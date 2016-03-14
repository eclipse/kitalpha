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
/**
 * 
 */
package org.polarsys.kitalpha.emde.egf.utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.egf.common.helper.BundleHelper;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.osgi.util.NLS;
import org.eclipse.pde.core.IBaseModel;
import org.eclipse.pde.core.plugin.IPluginBase;
import org.eclipse.pde.core.plugin.IPluginImport;
import org.eclipse.pde.core.plugin.IPluginModelFactory;
import org.eclipse.pde.internal.core.ICoreConstants;
import org.eclipse.pde.internal.core.ibundle.IBundle;
import org.eclipse.pde.internal.core.ibundle.IBundlePluginModelBase;
import org.eclipse.pde.internal.core.ibundle.IManifestHeader;
import org.eclipse.pde.internal.core.text.bundle.BundleActivatorHeader;
import org.eclipse.pde.internal.ui.util.ModelModification;
import org.eclipse.pde.internal.ui.util.PDEModelUtility;
import org.osgi.framework.Constants;
import org.osgi.framework.Version;
import org.polarsys.kitalpha.emde.egf.helper.ExtensionHelper;
import org.polarsys.kitalpha.emde.egf.l10n.Messages;
import org.polarsys.kitalpha.emde.extension.utils.ExtensionAnnotationsHelper;

/**
 * @author Thomas Guiu
 * 
 */
public abstract class ManifestHelper {
	protected final GenModel genModel;
	private final IFile manifestFile;

	public static ManifestHelper createModelHelper(GenModel genModel) {
		return new ModelManifestHelper(genModel);
	}

	public static ManifestHelper createEditHelper(GenModel genModel) {
		return new EditManifestHelper(genModel);
	}

	public static ManifestHelper createEditorHelper(GenModel genModel) {
		return new EditorManifestHelper(genModel);
	}

	protected static IFile computeTargetFile(String projectDirectory) {
		IPath path = new Path(projectDirectory);
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		final IProject project = workspace.getRoot().getProject(path.segment(0));
		IFile file = project.getFile(ICoreConstants.BUNDLE_FILENAME_DESCRIPTOR);
		return file;
	}

	public ManifestHelper(GenModel genModel, IFile manifestFile) {
		this.genModel = genModel;
		this.manifestFile = manifestFile;
	}

	public void updateFile(IProgressMonitor monitor) {
		if (!isEnabled())
			return;
		PDEModelUtility.modifyModel(new ModelModification(manifestFile) {

			@Override
			protected void modifyModel(IBaseModel model, IProgressMonitor innerMonitor) throws CoreException {
				if (model instanceof IBundlePluginModelBase) {
					SubMonitor.convert(innerMonitor, NLS.bind(Messages.setupManifestMF, BundleHelper.getBundleId(manifestFile.getProject())), 100);
					doUpdateFile(model);
				}
			}

		}, monitor);

	}

	protected void doUpdateFile(IBaseModel model) throws CoreException {
		processVersion((IBundlePluginModelBase) model);
		processImport((IBundlePluginModelBase) model, getRequiredPlugins());

	}

	protected abstract boolean isEnabled();

	protected abstract List<String> getRequiredPlugins();

	protected void processVersion(IBundlePluginModelBase model) {
		IBundle bundle = model.getBundleModel().getBundle();
		String pluginVersion = bundle.getHeader(Constants.BUNDLE_VERSION);
		if (pluginVersion == null) {
			pluginVersion = "1.0.0.qualifier"; //$NON-NLS-1$
			bundle.setHeader(Constants.BUNDLE_VERSION, pluginVersion);
		} else {
			Version version = Version.parseVersion(pluginVersion);
			if ("".equals(version.getQualifier())) {
				pluginVersion = version.toString() + ".qualifier"; //$NON-NLS-1$
				bundle.setHeader(Constants.BUNDLE_VERSION, pluginVersion);
			}
		}
	}

	protected void processImport(IBundlePluginModelBase model, List<String> importAdditions) throws CoreException {
		IPluginModelFactory factory = model.getPluginFactory();
		IPluginBase base = model.getPluginBase();
		Set<String> imports = new HashSet<String>();

		for (IPluginImport plugin : base.getImports()) {
			imports.add(plugin.getId());
		}

		for (String addition : importAdditions) {
			if (!imports.contains(addition)) {
				IPluginImport plugin = factory.createImport();
				plugin.setId(addition);
				plugin.setName(addition);
				plugin.setReexported(true);
				base.add(plugin);
			}
		}
	}

	private static class EditorManifestHelper extends ManifestHelper {

		public EditorManifestHelper(GenModel genModel) {
			super(genModel, computeTargetFile(genModel.getEditorProjectDirectory()));
		}

		@Override
		protected List<String> getRequiredPlugins() {
			List<String> additions = new ArrayList<String>();
			additions.addAll(genModel.getEditorPluginVariables());
			additions.add("org.eclipse.emf.ecore.edit"); //$NON-NLS-1$
			additions.add("org.eclipse.emf.ecore.editor"); //$NON-NLS-1$
			additions.add("org.polarsys.kitalpha.emde.ui"); //$NON-NLS-1$
			additions.add("org.polarsys.kitalpha.ad.metadata"); //$NON-NLS-1$
			return additions;
		}

		@Override
		protected boolean isEnabled() {
			return genModel.isBundleManifest();
		}
	}

	private static class EditManifestHelper extends ManifestHelper {

		public EditManifestHelper(GenModel genModel) {
			super(genModel, computeTargetFile(genModel.getEditProjectDirectory()));
		}

		@Override
		protected List<String> getRequiredPlugins() {
			List<String> additions = new ArrayList<String>();
			additions.addAll(genModel.getEditPluginVariables());
			additions.add("org.polarsys.kitalpha.emde"); //$NON-NLS-1$
			for (GenPackage genPackage : genModel.getGenPackages()) {
				if (genPackage.isChildCreationExtenders() == false) {
					continue;
				}
				for (String detail : ExtensionAnnotationsHelper.getUsedGenPackages(genPackage.getEcorePackage())) {
					if (detail != null) {
						URI uri = URI.createURI(detail);
						if (uri.isRelative()) {
							uri = uri.resolve(genPackage.eResource().getURI());
						}
						EObject eObject = genModel.eResource().getResourceSet().getEObject(uri, true);
						if (eObject instanceof GenPackage) {
							additions.add(((GenPackage) eObject).getGenModel().getModelPluginID());
						}
					}
				}
			}
			return additions;
		}

		@Override
		protected boolean isEnabled() {
			return genModel.isBundleManifest() && !genModel.sameEditEditorProject();
		}
	}

	private static class ModelManifestHelper extends ManifestHelper {

		public ModelManifestHelper(GenModel genModel) {
			super(genModel, computeTargetFile(genModel.getModelProjectDirectory()));
		}

		@Override
		protected List<String> getRequiredPlugins() {
			List<String> additions = new ArrayList<String>();
			additions.addAll(genModel.getModelPluginVariables());
			
			if (ExtensionHelper.hasExtensibleProviderFactory(genModel) || ExtensionHelper.hasChildCreationExtenders(genModel)) {
				additions.add("org.polarsys.kitalpha.emde.xmi"); //$NON-NLS-1$
			}
			return additions;
		}

		@Override
		protected boolean isEnabled() {
			return genModel.isBundleManifest() && genModel.hasPluginSupport() && !genModel.sameModelEditProject() && !genModel.sameModelEditorProject();
		}

		@Override
		protected void doUpdateFile(IBaseModel model) throws CoreException {
			super.doUpdateFile(model);
			processActivator((IBundlePluginModelBase) model);
		}

		protected void processActivator(IBundlePluginModelBase model) {
			// Locate manifest model
			IBundle bundle = model.getBundleModel().getBundle();
			// Activator Class name
			String activator = genModel.hasModelPluginClass() ? (genModel.getQualifiedModelPluginClassName() + "$Implementation") : null; //$NON-NLS-1$
			// Process Activator
			IManifestHeader header = bundle.getManifestHeader(Constants.BUNDLE_ACTIVATOR);
			if (header != null && header instanceof BundleActivatorHeader) {
				((BundleActivatorHeader) header).setClassName(activator);
			} else {
				if (bundle.getHeader(Constants.BUNDLE_ACTIVATOR) == null && activator == null)
					return; // setHeader throws an unexpected NPE in this case
				bundle.setHeader(Constants.BUNDLE_ACTIVATOR, activator);
			}
		}

	}
}
