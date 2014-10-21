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

package org.polarsys.kitalpha.ad.viewpoint.sdk.manager;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.osgi.baseadaptor.BaseData;
import org.eclipse.osgi.framework.internal.core.AbstractBundle;
import org.eclipse.osgi.framework.internal.core.PackageAdminImpl;
import org.eclipse.osgi.service.resolver.BaseDescription;
import org.eclipse.osgi.service.resolver.BundleDescription;
import org.eclipse.osgi.service.resolver.BundleSpecification;
import org.eclipse.osgi.util.NLS;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.core.plugin.PluginRegistry;
import org.eclipse.pde.internal.core.plugin.ExternalPluginModel;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleException;
import org.osgi.framework.ServiceReference;
import org.osgi.service.packageadmin.PackageAdmin;
import org.polarsys.kitalpha.ad.viewpoint.sdk.Activator;
import org.polarsys.kitalpha.ad.viewpoint.sdk.Messages;

/**
 * @author Thomas Guiu
 * 
 */
public class BundleManager {
	private final Set<String> allManagedBundles = new HashSet<String>();
	private final Map<String, Set<String>> bundle2dependencies = new HashMap<String, Set<String>>();
	private final Map<String, Set<String>> bundle2users = new HashMap<String, Set<String>>();

	public void unLoad(String symbolicName) throws BundleException {
		if (bundle2users.containsKey(symbolicName) && !bundle2users.get(symbolicName).isEmpty()) {

			String string = Messages.ManageBundle_error_title6;
			for (String user : bundle2users.get(symbolicName)) {
				string += (user + "\n");
			}
			throw new IllegalStateException(string);
		}
		IProject p = null;
		Bundle bundle = Platform.getBundle(symbolicName);
		remove(bundle);
	}

	protected void remove(Bundle bundle) throws BundleException {
		// allManagedBundles.remove(bundle.getSymbolicName());
		bundle.stop(Bundle.STOP_TRANSIENT);
		// clean usages link, this bundle doesn't use anyone now.
		for (Set<String> users : bundle2users.values()) {
			users.remove(bundle.getSymbolicName());
		}
		if (bundle2dependencies.containsKey(bundle.getSymbolicName())) {
			// stop dependencies who are no more in use
			for (String dependency : bundle2dependencies.get(bundle.getSymbolicName())) {
				Set<String> users = bundle2users.get(dependency);
				if (users == null || users.isEmpty()) {
					Bundle bundle2 = Platform.getBundle(dependency);
					if (bundle2 != null) // in some case the bundle may have been uninstalled
						remove(bundle2);
				}
			}
			bundle2dependencies.remove(bundle.getSymbolicName());
		}
		// bundle.uninstall();
	}

	public void load(String symbolicName) throws UnsupportedEncodingException, MalformedURLException, BundleException, CoreException, InterruptedException {

		allManagedBundles.add(symbolicName);

		IPluginModelBase model = PluginRegistry.findModel(symbolicName);
		Set<Bundle> collector = new HashSet<Bundle>();
		load(model.getBundleDescription(), collector);

		Bundle installBundle = findBundle(symbolicName);
		// refresh loaded bundle
		BundleContext context = Activator.getContext();
		ServiceReference packageAdminReference = context.getServiceReference(PackageAdmin.class.getName());
		PackageAdmin packageAdmin = (PackageAdmin) context.getService(packageAdminReference);
		((PackageAdminImpl) packageAdmin).refreshPackages(collector.toArray(new Bundle[collector.size()]), true, null);
		((PackageAdminImpl) packageAdmin).resolveBundles(collector);
		// packageAdmin.resolveBundles(collector.toArray(new Bundle[collector.size()]));

	}

	private void load(BundleDescription description, Set<Bundle> collector) throws UnsupportedEncodingException, MalformedURLException, BundleException, CoreException, InterruptedException {
		String symbolicName = description.getSymbolicName();
		for (BundleSpecification spec : description.getRequiredBundles()) {
			BaseDescription supplier = spec.getSupplier();
			if (supplier == null) {
				throw new BundleException(NLS.bind(Messages.ManageBundle_error_title7, spec.getName()));
			}
			String requiredSymbolicName = supplier.getSupplier().getSymbolicName();
			// is the bundle loaded ?
			Bundle bundle = Platform.getBundle(requiredSymbolicName);
			if (bundle == null) {
				// need to install the bundle
				bundle = findBundle(requiredSymbolicName);
				collector.add(bundle);
				load((BundleDescription) supplier, collector);
				// remember if we use a bundle we started
				createLinks(symbolicName, requiredSymbolicName);
			}
			if (allManagedBundles.contains(requiredSymbolicName)) {
				collector.add(bundle);
				createLinks(symbolicName, requiredSymbolicName);
			}
		}
	}

	protected Bundle findBundle(String symbolicName) throws UnsupportedEncodingException, MalformedURLException, BundleException, CoreException {
		IPluginModelBase model = PluginRegistry.findModel(symbolicName);
		if (model instanceof ExternalPluginModel) {
			ExternalPluginModel extModel = (ExternalPluginModel) model;
			return installBundle(new File(extModel.getInstallLocation()).toURI());
		}
		IProject project2 = ResourcesPlugin.getWorkspace().getRoot().getProject(symbolicName);
		Bundle installBundle = installBundle(project2.getLocationURI());
		allManagedBundles.add(symbolicName);
		addOutputFoldersToBundleClasspath(project2, installBundle);
		return installBundle;
	}

	private void createLinks(String user, String dependency) {
		if (allManagedBundles.contains(dependency) && allManagedBundles.contains(user)) {
			Set<String> dependencies = bundle2dependencies.get(user);
			if (dependencies == null) {
				dependencies = new HashSet<String>();
				bundle2dependencies.put(user, dependencies);
			}
			dependencies.add(dependency);
			Set<String> users = bundle2users.get(dependency);
			if (users == null) {
				users = new HashSet<String>();
				bundle2users.put(dependency, users);
			}
			users.add(user);
		}
	}

	private Bundle installBundle(URI uri) throws UnsupportedEncodingException, MalformedURLException, BundleException, CoreException {
		String location = "reference:" + URLDecoder.decode(uri.toURL().toExternalForm(), System.getProperty("file.encoding"));
		Bundle installBundle = Activator.getContext().installBundle(location);
		return installBundle;
	}

	public boolean isManaged(String symbolicName) {
		return allManagedBundles.contains(symbolicName);
	}

	public boolean isManaged(IProject project) {
		return isManaged(project.getName());
	}

	private void addOutputFoldersToBundleClasspath(IProject project, Bundle bundle) throws CoreException {
		List<String> outputFolders = getStringOutputFolders(JavaCore.create(project));
		BaseData bundleData = (BaseData) ((AbstractBundle) bundle).getBundleData();
		StringBuilder classpath = new StringBuilder();
		if (outputFolders.size() == 0) {
			classpath.append("."); //$NON-NLS-1$
		} else {
			for (Iterator<String> it = outputFolders.iterator(); it.hasNext();) {
				if (classpath.length() > 0) {
					classpath.append(","); //$NON-NLS-1$ 
				}
				classpath.append(it.next());
			}
		}
		bundleData.setClassPathString(classpath.toString());
	}

	private static List<String> getStringOutputFolders(IJavaProject project) throws CoreException {
		List<String> outputFoldersAsString = new ArrayList<String>();
		if (project.exists() == false) {
			return outputFoldersAsString;
		}
		List<IFolder> outputFolders = getOutputFolders(project);
		for (IFolder outputFolder : outputFolders) {
			outputFoldersAsString.add(outputFolder.getFullPath().removeFirstSegments(1).toString());
		}
		return outputFoldersAsString;
	}

	private static List<IFolder> getOutputFolders(IJavaProject project) throws CoreException {
		List<IFolder> folders = new ArrayList<IFolder>();
		if (project == null || project.exists() == false) {
			return folders;
		}
		// Default Output Location
		IFolder folder = getFolder(project.getOutputLocation());
		if (folder != null) {
			folders.add(folder);
		}
		// Lookup in source folders
		for (IClasspathEntry entry : project.getResolvedClasspath(true)) {
			if (entry.getEntryKind() == IClasspathEntry.CPE_SOURCE) {
				IFolder innerFolder = getFolder(entry.getOutputLocation());
				if (innerFolder != null) {
					folders.add(innerFolder);
				}
			}
		}
		return folders;
	}

	private static IFolder getFolder(IPath folderRelativePath) {
		// Precondition.
		if (folderRelativePath == null) {
			return null;
		}
		return ResourcesPlugin.getWorkspace().getRoot().getFolder(folderRelativePath);
	}

	public static final BundleManager INSTANCE = new BundleManager();

}
