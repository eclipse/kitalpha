/*******************************************************************************
 * Copyright (c) 2014, 2016 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.exceptions.PluginXMLNotFindException;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.exceptions.ProjectNotFoundException;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.helpers.vpspec.CoreModelHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.FileExtension;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.ResourceHelper;


/**
 *
 * @author Amine Lajmi
 * @author Faycal ABKA
 *
 */
public final class PluginUtil {

	private static final Logger LOGGER = Logger.getLogger(PluginUtil.class);

	private static final NullProgressMonitor Null_Progress_Monitor = new NullProgressMonitor();

	private static final String PLUGIN_XML = "plugin.xml";


	private PluginUtil(){
	}

	public static void doCreatePluginXml(final IProject project, final String viewpointShortName){
		StringBuffer appendable = null;
		appendable = createPluginXml(project, viewpointShortName);
		final ByteArrayInputStream fileInputStream = new ByteArrayInputStream(appendable.toString().getBytes());
		try {

			final IFile pluginXmlFile = project.getFile(PLUGIN_XML);
			if (pluginXmlFile.exists()) {
				pluginXmlFile.setContents(fileInputStream, true, false, null);
			} else {
				pluginXmlFile.create(fileInputStream, true, null);
			}
			project.refreshLocal(IProject.DEPTH_INFINITE, Null_Progress_Monitor);
		} catch (final CoreException e) {
			LOGGER.error(e.getMessage(), e);
		}
	}

	private static StringBuffer createPluginXml(
			final String id,
			final String name,
			final String path,
			final String version,
			final String domain,
			final String... tags){
		final StringBuffer contents = new StringBuffer();
		contents.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
		contents.append("<?eclipse version=\"3.4\"?>\n");
		contents.append("<plugin>\n");
		createModelReuseExtension(contents, id, name, path, version, domain, tags);
		contents.append("</plugin>\n");
		contents.append("\n");
		return contents;
	}

	private static StringBuffer createModelReuseExtension(final StringBuffer contents,
			final String id, final String name, final String path, final String version, final String domain, final String... tags) {
		contents.append("	<extension\n");
		contents.append("	     point=\"org.polarsys.kitalpha.resourcereuse.resources\">\n");
		contents.append("	  <resource\n");
		contents.append("	        domain=\"").append(domain).append("\"\n");
		contents.append("	        id=\"").append(id).append("\"\n");
		contents.append("	        tags=\"").append(extractTags(tags)).append("\"\n");
		contents.append("	        name=\"").append(name).append("\"\n");
		contents.append("	        path=\"").append(path).append("\"/>\n");
		contents.append("	</extension>\n");
		return contents;
	}

	private static String extractTags(final String... tags){
		final StringBuffer b = new StringBuffer();
		if ((tags != null) && (tags.length > 0)){
			final int length = tags.length;
			for (final String t : tags) {
				if (!tags[length - 1].trim().equals(t.trim())) {
					b.append(t).append(",");
				} else {
					b.append(t);
				}
			}
		}
		return b.toString();
	}

	public static StringBuffer createPluginXml(final IProject project, final String viewpointShortName){
		final String projectName = project.getName();
		final String path = '/' + projectName + "/model/" + viewpointShortName + ".vptext";
		return createPluginXml(projectName + ".resource", viewpointShortName, path, "", "AE", "Viewpoint");
	}

	public static void addModelReuseExtension(final String projectName, final String viewpointShortName, final String extension) {
		final IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		final URI uri = ResourceHelper.computeURI(projectName, viewpointShortName, extension);
		if (project.exists()) {
			final IFile pluginXml = project.getFile(PLUGIN_XML);
			if (pluginXml.exists()) {
				try {
					final byte[] data = loadPluginXmlData(projectName);
					String content = new String(data);
					content = content.substring(0,content.indexOf("</plugin>"));
					final StringBuffer buffer = new StringBuffer(content);
					buffer.append("\n");
					buffer.append(createModelReuseExtension(projectName, viewpointShortName, uri));
					buffer.append("</plugin>");
					final ByteArrayInputStream newContent = new ByteArrayInputStream(buffer.toString().getBytes());
					pluginXml.setContents(newContent, true, false, null);
					project.refreshLocal(IProject.DEPTH_INFINITE, Null_Progress_Monitor);
					return;
				} catch (final FileNotFoundException e) {
					LOGGER.error(e.getMessage(), e);
				} catch (final CoreException e) {
					LOGGER.error(e.getMessage(), e);
				} catch (final IOException e) {
					LOGGER.error(e.getMessage(), e);
				}
			}
			throwNewFileNotFoundException(projectName);
		}

		throwNewProjectNotFoundException(projectName);
	}


	public static void addModelReuseExtension(final String fileName, final String projectName, final String viewpointShortName, final URI uri){
		final IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		if (project.exists()) {
			final IFile pluginXml = project.getFile(PLUGIN_XML);
			if (pluginXml.exists()) {
				try {
					final byte[] data = loadPluginXmlData(projectName);
					String content = new String(data);
					content = content.substring(0,content.indexOf("</plugin>"));
					final StringBuffer buffer = new StringBuffer(content);
					buffer.append("\n");
					buffer.append(createModelReuseExtension(fileName, projectName, viewpointShortName, uri));
					buffer.append("</plugin>");
					final ByteArrayInputStream newContent = new ByteArrayInputStream(buffer.toString().getBytes());
					pluginXml.setContents(newContent, true, false, null);
					project.refreshLocal(IProject.DEPTH_INFINITE, Null_Progress_Monitor);
					return;
				} catch (final FileNotFoundException e) {
					LOGGER.error(e.getMessage(), e);
				} catch (final CoreException e) {
					LOGGER.error(e.getMessage(), e);
				} catch (final IOException e) {
					LOGGER.error(e.getMessage(), e);
				}
			}
			throwNewFileNotFoundException(projectName);
		}
		throwNewProjectNotFoundException(projectName);
	}

	public static void addModelReuseExtension(final String projectName, final EObject inputObject, final URI uri){
		final IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		if (project.exists()) {
			final IFile pluginXml = project.getFile(PLUGIN_XML);
			if (pluginXml.exists()) {
				String viewpointShortName = CoreModelHelper.getViewpointShortName(inputObject);
				if (viewpointShortName==null) {
					viewpointShortName = CoreModelHelper.getViewpointName(inputObject);
				}
				try {
					final byte[] data = loadPluginXmlData(projectName);
					String content = new String(data);
					content = content.substring(0,content.indexOf("</plugin>"));
					final StringBuffer buffer = new StringBuffer(content);
					buffer.append("\n");
					buffer.append(createModelReuseExtension(projectName, viewpointShortName, uri));
					buffer.append("</plugin>");
					final ByteArrayInputStream newContent = new ByteArrayInputStream(buffer.toString().getBytes());
					pluginXml.setContents(newContent, true, false, null);
					project.refreshLocal(IProject.DEPTH_INFINITE, Null_Progress_Monitor);
					return;
				} catch (final FileNotFoundException e) {
					LOGGER.error(e.getMessage(), e);
				} catch (final CoreException e) {
					LOGGER.error(e.getMessage(), e);
				} catch (final IOException e) {
					LOGGER.error(e.getMessage(), e);
				}
			}
			throwNewFileNotFoundException(projectName);
		}
		throwNewProjectNotFoundException(projectName);
	}

	public static void removeModelReuseExtension(final String projectName, final URI uri){
		final IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		final Path path = new Path(uri.path());
		final String resourcePath = "/" + path.removeFirstSegments(1).toString();
		if (project.exists()) {
			final IFile pluginXml = project.getFile(PLUGIN_XML);
			if (pluginXml.exists()) {
				try {
					final byte[] data = loadPluginXmlData(projectName);
					final String content = new String(data);
					final Pattern p = Pattern.compile("</extension>", Pattern.MULTILINE);
					final Matcher m = p.matcher(content);
					int index = 0;
					StringBuffer buffer = null;
					while (m.find()) {
						final String current = content.substring(index, m.start());
						if (current.contains(resourcePath)) {
							buffer = new StringBuffer(current).append("</extension>");
						}
						index = m.end();
					}
					if (buffer == null) {
						throw new RuntimeException("Could not localize model reuse extension of deleted resource: " + path);
					}
					final String newPluginXml = content.replaceFirst(buffer.toString(), "");
					final ByteArrayInputStream newContent = new ByteArrayInputStream(newPluginXml.getBytes());
					pluginXml.setContents(newContent, true, false, null);
					project.refreshLocal(IProject.DEPTH_INFINITE, Null_Progress_Monitor);
					return;
				} catch (final FileNotFoundException e) {
					LOGGER.error(e.getMessage(), e);
				} catch (final CoreException e) {
					LOGGER.error(e.getMessage(), e);
				} catch (final IOException e) {
					LOGGER.error(e.getMessage(), e);
				}
			}
			throwNewFileNotFoundException(projectName);
		}
		throwNewProjectNotFoundException(projectName);
	}

	private static void throwNewProjectNotFoundException(final String projectName) {
		throw new ProjectNotFoundException(projectName);
	}

	private static void throwNewFileNotFoundException(final String projectName) {
		throw new PluginXMLNotFindException(projectName);
	}

	public static StringBuffer createModelReuseExtension(final String projectName, final String viewpointShortName, final URI uri) {
		final String path = "/" + new Path(uri.path()).removeFirstSegments(1).toString();
		final String aspect = uri.lastSegment().substring(uri.lastSegment().indexOf(".")+1, uri.lastSegment().lastIndexOf("."));
		final String id = projectName + ".resource." + viewpointShortName + "." + aspect;
		final StringBuffer contents = new StringBuffer();
		return createModelReuseExtension(contents, id, aspect, path, "", "vpdsl", "Viewpoint");
	}

	public static StringBuffer createModelReuseExtension(final String fileName, final String projectName, final String viewpointShortName, final URI uri) {
		final String path = "/" + new Path(uri.path()).removeFirstSegments(1).toString();
		final String aspect = fileName.replaceFirst("." + FileExtension.PRIMARY_EXTENSION, "");
		final String id = projectName + ".resource." + viewpointShortName + "." + aspect;
		final StringBuffer contents = new StringBuffer();
		return createModelReuseExtension(contents, id, aspect.substring(aspect.indexOf(".")+1, aspect.length()), path, "", "vpdsl", "Viewpoint");
	}

	public static StringBuffer createModelReuseExtensionForAE(final String projectName, final String viewpointShortName) {
		final String path = '/' + projectName + "/model/" + viewpointShortName + ".vptext";
		final String id = projectName + ".resource." + viewpointShortName;
		final StringBuffer contents = new StringBuffer();
		return createModelReuseExtension(contents, id, viewpointShortName, path, "", "AE", "Viewpoint");
	}

	public static byte[] loadPluginXmlData(final String bundleName) throws IOException {
		final IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(bundleName);
		if (project != null) {
			final IPath location = project.getLocation();
			final IPath filePath = location.append("/plugin.xml");
			final File file = filePath.toFile();
			final long size = file.length();
			if (size>0) {
				final byte buff[] = new byte[(int) size];
				final FileInputStream fis = new FileInputStream(file);
				final DataInputStream dis = new DataInputStream(fis);
				dis.readFully(buff);
				dis.close();
				return buff;
			} else {
				throw new RuntimeException("could not find plugin.xml file of project: " + project.getName());
			}
		}
		return null;
	}

	public static byte[] getBytes(final InputStream is) throws IOException {
		int size = 1024;
		byte[] buf;
		if (is instanceof ByteArrayInputStream) {
			size = is.available();
			buf = new byte[size];
			is.read(buf, 0, size);
		} else {
			final ByteArrayOutputStream bos = new ByteArrayOutputStream();
			int len;
			buf = new byte[size];
			while ((len = is.read(buf, 0, size)) != -1) {
				bos.write(buf, 0, len);
			}
			buf = bos.toByteArray();
		}
		return buf;
	}

	public static String getFileContent(final InputStream fis) {
		final StringBuilder sb = new StringBuilder();
		Reader r;
		try {
			if (fis instanceof FileInputStream) {
				r = new InputStreamReader(fis, "UTF-8");
				int ch = r.read();
				while (ch >= 0) {
					sb.append(ch);
					ch = r.read();
				}
			}
		} catch (final UnsupportedEncodingException e) {
			LOGGER.error(e.getMessage(), e);
		}
		catch (final IOException e) {
			LOGGER.error(e.getMessage(), e);
		}
		return sb.toString();
	}
}
