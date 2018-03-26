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

package org.polarsys.kitalpha.ad.viewpoint.sdk.manager;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.RegistryFactory;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
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
import org.osgi.framework.wiring.FrameworkWiring;
import org.polarsys.kitalpha.ad.viewpoint.sdk.Activator;
import org.polarsys.kitalpha.ad.viewpoint.sdk.Messages;

/**
 * @author Thomas Guiu
 * 
 */
public class BundleManager {
	private final Set<String> allManagedBundles = new HashSet<>();
	private final Map<String, Set<String>> bundle2dependencies = new HashMap<>();
	private final Map<String, Set<String>> bundle2users = new HashMap<>();

	public void unLoad(String symbolicName) throws BundleException {
		if (bundle2users.containsKey(symbolicName) && !bundle2users.get(symbolicName).isEmpty()) {

			StringBuilder string = new StringBuilder();
			string.append(Messages.ManageBundle_error_title6);
			for (String user : bundle2users.get(symbolicName)) {
				string.append(user).append("\n");
			}
			throw new IllegalStateException(string.toString());
		}
		Bundle bundle = Platform.getBundle(symbolicName);
		remove(bundle);
	}

	protected void remove(Bundle bundle) throws BundleException {
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
					if (bundle2 != null) {// in some case the bundle may have been uninstalled
						remove(bundle2);
					}
				}
			}
			bundle2dependencies.remove(bundle.getSymbolicName());
		}
	}

	public void load(String symbolicName) throws BundleException, CoreException, InterruptedException, IOException {

		allManagedBundles.add(symbolicName);

		BundleRegistryListener listener = new BundleRegistryListener(symbolicName);
		RegistryFactory.getRegistry().addListener(listener);
		Set<Bundle> collector = new HashSet<>();
		try {
			IPluginModelBase model = PluginRegistry.findModel(symbolicName);
			load(model.getBundleDescription(), collector);

			findBundle(symbolicName);
			// refresh loaded bundle
			BundleContext context = Activator.getContext();
			Bundle systemBundle = context.getBundle(0);

			FrameworkWiring frameworkWiring = systemBundle.adapt(FrameworkWiring.class);
			frameworkWiring.refreshBundles(collector);

			listener.waitForEventDispatch();
		} finally {
			RegistryFactory.getRegistry().removeListener(listener);
		}
	}

	private void load(BundleDescription description, Set<Bundle> collector) throws BundleException, CoreException, InterruptedException, IOException {
		String symbolicName = description.getSymbolicName();
		for (BundleSpecification spec : description.getRequiredBundles()) {
			BaseDescription supplier = spec.getSupplier();
			if (supplier == null) {
				throw new BundleException(NLS.bind(Messages.ManageBundle_error_title7, spec.getName()));
			}
			String requiredSymbolicName = supplier.getSupplier().getSymbolicName();
			// is the bundle loaded ?
			Bundle bundle = Platform.getBundle(requiredSymbolicName);
			if (bundle == null || (allManagedBundles.contains(requiredSymbolicName) && bundle.getState() != Bundle.ACTIVE)) {
				// need to install or update the bundle
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

	protected Bundle findBundle(String symbolicName) throws BundleException, CoreException, IOException {
		IPluginModelBase model = PluginRegistry.findModel(symbolicName); 
		if (model instanceof ExternalPluginModel) {
			Bundle bundle = Platform.getBundle(symbolicName);
			if (bundle != null){
				return bundle;
			}
			ExternalPluginModel extModel = (ExternalPluginModel) model;
			return installBundle(new File(extModel.getInstallLocation()).toURI());
		}
		IProject project2 = ResourcesPlugin.getWorkspace().getRoot().getProject(symbolicName);
		Bundle installBundle = installBundle2(project2);
		allManagedBundles.add(symbolicName);
		return installBundle;
	}

	private void createLinks(String user, String dependency) {
		if (allManagedBundles.contains(dependency) && allManagedBundles.contains(user)) {
			Set<String> dependencies = bundle2dependencies.get(user);
			if (dependencies == null) {
				dependencies = new HashSet<>();
				bundle2dependencies.put(user, dependencies);
			}
			dependencies.add(dependency);
			Set<String> users = bundle2users.get(dependency);
			if (users == null) {
				users = new HashSet<>();
				bundle2users.put(dependency, users);
			}
			users.add(user);
		}
	}

	private Bundle installBundle2(IProject project) throws BundleException, CoreException, IOException {
		ByteArrayOutputStream array = new ByteArrayOutputStream();
		ZipOutputStream out = new ZipOutputStream(array);
		IJavaProject jProject = JavaCore.create(project);
		List<String> outputFolders = getStringOutputFolders(jProject);
		Set<String> names = new HashSet<>();
		addContent(new File(project.getLocation().toPortableString()), "", "", outputFolders, out, names);
		out.close();
		array.flush();
		array.close();
		String location = "ID->" + getLocation(project);
		Bundle bundle = Activator.getContext().getBundle(location);
		if (bundle == null){
			return Activator.getContext().installBundle(location, new ByteArrayInputStream(array.toByteArray()));
		}
		bundle.update(new ByteArrayInputStream(array.toByteArray()));
		return bundle;

	}

	private void addContent(File folder, String path, String zipPath, List<String> outputFolders, ZipOutputStream out, Set<String> names) throws IOException {
		int BUFFER = 1024;
		byte data[] = new byte[BUFFER];
		String subdirList[] = folder.list();
		for (String sd : subdirList) {
			File f = new File(folder, sd);
			String subPath = path.equals("") ? sd : path + "/" + sd;
			String subzipPath = zipPath.equals("") ? sd : zipPath + "/" + sd;
			if (f.isDirectory()) {
				if (outputFolders.contains(sd)){
					subzipPath = zipPath;
				}
				addContent(f, subPath, subzipPath, outputFolders, out, names);
			} else if (!names.contains(subzipPath)) {
				try (BufferedInputStream origin = new BufferedInputStream(new FileInputStream(f))) {
					ZipEntry entry = new ZipEntry(subzipPath);
					names.add(subzipPath);
					out.putNextEntry(entry);
					int count;
					while ((count = origin.read(data, 0, BUFFER)) != -1) {
						out.write(data, 0, count);
					}
					out.closeEntry();
				} catch (Exception e) {
					throw new IOException(e);
				}
			}

		}
	}

	private Bundle installBundle(URI uri) throws UnsupportedEncodingException, MalformedURLException, BundleException {
		String location = getLocation(uri);
		return  Activator.getContext().installBundle(location);
	}

	private String getLocation(IProject project) throws UnsupportedEncodingException, MalformedURLException {
		return getLocation(project.getLocationURI());
	}

	private String getLocation(URI uri) throws UnsupportedEncodingException, MalformedURLException {
		return "reference:" + URLDecoder.decode(uri.toURL().toExternalForm(), System.getProperty("file.encoding"));
	}

	public boolean isManaged(String symbolicName) {
		return allManagedBundles.contains(symbolicName);
	}

	public boolean isManaged(IProject project) {
		return isManaged(project.getName());
	}

	private static List<String> getStringOutputFolders(IJavaProject project) throws CoreException {
		List<String> outputFoldersAsString = new ArrayList<>();
		if (!project.exists()) {
			return outputFoldersAsString;
		}
		List<IFolder> outputFolders = getOutputFolders(project);
		for (IFolder outputFolder : outputFolders) {
			outputFoldersAsString.add(outputFolder.getFullPath().removeFirstSegments(1).toString());
		}
		return outputFoldersAsString;
	}

	private static List<IFolder> getOutputFolders(IJavaProject project) throws CoreException {
		List<IFolder> folders = new ArrayList<>();
		if (project == null || !project.exists()) {
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
