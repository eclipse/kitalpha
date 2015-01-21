/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
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

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.helpers.vpspec.CoreModelHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.FileExtension;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.ResourceHelper;


/**
 * 
 * @author Amine Lajmi
 *
 */
public class PluginUtil {
	
	private static final NullProgressMonitor Null_Progress_Monitor = new NullProgressMonitor();  

	public static void doCreatePluginXml(final IProject project, String viewpointShortName){
		StringBuffer appendable = null;
		appendable = createPluginXml(project, viewpointShortName);	
		ByteArrayInputStream fileInputStream = new ByteArrayInputStream(appendable.toString().getBytes());
		try {
			IFile pluginXmlFile = project.getFile("plugin.xml");
			if (pluginXmlFile.exists())
				pluginXmlFile.setContents(fileInputStream, true, false, null);
			else
				pluginXmlFile.create(fileInputStream, true, null);
			project.refreshLocal(IProject.DEPTH_INFINITE, Null_Progress_Monitor);
			} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	public static StringBuffer createPluginXml(IProject project, String viewpointShortName){
		String projectName = project.getName();
		String path = '/' + projectName + "/model/" + viewpointShortName + ".vptext";
		StringBuffer contents = new StringBuffer();
		contents.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
		contents.append("<?eclipse version=\"3.4\"?>\n");
		contents.append("<plugin>\n");
		contents.append("	<extension\n");
		contents.append("	     point=\"org.polarsys.kitalpha.resourcereuse.resources\">\n");
		contents.append("	  <resource\n");
		contents.append("	        domain=\"AE\"\n");
		contents.append("	        id=\"").append(projectName).append(".resource").append("\"\n");
		contents.append("	        tags=\"Viewpoint\"\n");
		contents.append("	        name=\"").append(viewpointShortName).append("\"\n");
		contents.append("	        path=\"").append(path).append("\"/>\n");
		contents.append("	</extension>\n");
		contents.append("</plugin>\n");
		contents.append("\n");
		return contents;
	}
	
	public static void addModelReuseExtension(String projectName, String viewpointShortName, String extension) {
		final IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		URI uri = ResourceHelper.computeURI(projectName, viewpointShortName, extension);
		if (project.exists()) {
			IFile pluginXml = project.getFile("plugin.xml");
			if (pluginXml.exists()) {
				try {
					byte[] data = loadPluginXmlData(projectName);	
					String content = new String(data);
					content = content.substring(0,content.indexOf("</plugin>"));
					StringBuffer buffer = new StringBuffer(content);
					buffer.append("\n");
					buffer.append(createModelReuseExtension(projectName, viewpointShortName, uri));
					buffer.append("</plugin>");
					ByteArrayInputStream newContent = new ByteArrayInputStream(buffer.toString().getBytes());
					pluginXml.setContents(newContent, true, false, null);
					project.refreshLocal(IProject.DEPTH_INFINITE, Null_Progress_Monitor);
					return;
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (CoreException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}			
			}
			throw new RuntimeException("could not find plugin.xml file of project: " + projectName);
		}
		throw new RuntimeException("could not find project: " + projectName);
	}
	
	public static void addModelReuseExtension(String fileName, String projectName, String viewpointShortName, URI uri){
		final IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		if (project.exists()) {
			IFile pluginXml = project.getFile("plugin.xml");
			if (pluginXml.exists()) {
				try {			
					byte[] data = loadPluginXmlData(projectName);	
					String content = new String(data);
					content = content.substring(0,content.indexOf("</plugin>"));
					StringBuffer buffer = new StringBuffer(content);
					buffer.append("\n");
					buffer.append(createModelReuseExtension(fileName, projectName, viewpointShortName, uri));
					buffer.append("</plugin>");
					ByteArrayInputStream newContent = new ByteArrayInputStream(buffer.toString().getBytes());
					pluginXml.setContents(newContent, true, false, null);
					project.refreshLocal(IProject.DEPTH_INFINITE, Null_Progress_Monitor);
					return;
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (CoreException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}			
			}
			throw new RuntimeException("could not find plugin.xml file of project: " + projectName);
		}
		throw new RuntimeException("could not find project: " + projectName);
	}
	
	public static void addModelReuseExtension(String projectName, EObject inputObject, URI uri){
		final IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		if (project.exists()) {
			IFile pluginXml = project.getFile("plugin.xml");
			if (pluginXml.exists()) {
				String viewpointShortName = CoreModelHelper.getViewpointShortName(inputObject);
				if (viewpointShortName==null)
					viewpointShortName = CoreModelHelper.getViewpointName(inputObject);
				try {			
					byte[] data = loadPluginXmlData(projectName);	
					String content = new String(data);
					content = content.substring(0,content.indexOf("</plugin>"));
					StringBuffer buffer = new StringBuffer(content);
					buffer.append("\n");
					buffer.append(createModelReuseExtension(projectName, viewpointShortName, uri));
					buffer.append("</plugin>");
					ByteArrayInputStream newContent = new ByteArrayInputStream(buffer.toString().getBytes());
					pluginXml.setContents(newContent, true, false, null);
					project.refreshLocal(IProject.DEPTH_INFINITE, Null_Progress_Monitor);
					return;
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (CoreException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}			
			}
			throw new RuntimeException("could not find plugin.xml file of project: " + projectName);
		}
		throw new RuntimeException("could not find project: " + projectName);
	}

	public static void removeModelReuseExtension(String projectName, URI uri){
		final IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		Path path = new Path(uri.path());
		String resourcePath = "/" + path.removeFirstSegments(1).toString();
		if (project.exists()) {
			IFile pluginXml = project.getFile("plugin.xml");
			if (pluginXml.exists()) {
				try {			
					byte[] data = loadPluginXmlData(projectName);	
					String content = new String(data);
					Pattern p = Pattern.compile("</extension>", Pattern.MULTILINE);
					Matcher m = p.matcher(content);
					int index = 0;
					StringBuffer buffer = null;
					while (m.find()) {
						String current = content.substring(index, m.start());
					    if (current.contains(resourcePath)) {
					    	buffer = new StringBuffer(current).append("</extension>");
					    }
					    index = m.end();
					}
					if (buffer == null)
						throw new RuntimeException("Could not localize model reuse extension of deleted resource: " + path);
					String newPluginXml = content.replaceFirst(buffer.toString(), "");
					ByteArrayInputStream newContent = new ByteArrayInputStream(newPluginXml.getBytes());
					pluginXml.setContents(newContent, true, false, null);
					project.refreshLocal(IProject.DEPTH_INFINITE, Null_Progress_Monitor);
					return;
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (CoreException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}			
			}
			throw new RuntimeException("could not find plugin.xml file of project: " + projectName);
		}
		throw new RuntimeException("could not find project: " + projectName);
	}

	public static StringBuffer createModelReuseExtension(String projectName, String viewpointShortName, URI uri) {
		String path = "/" + new Path(uri.path()).removeFirstSegments(1).toString();
		String aspect = uri.lastSegment().substring(uri.lastSegment().indexOf(".")+1, uri.lastSegment().lastIndexOf("."));
		StringBuffer contents = new StringBuffer();
		contents.append("	<extension\n");
		contents.append("	     point=\"org.polarsys.kitalpha.resourcereuse.resources\">\n");
		contents.append("	  <resource\n");
		contents.append("	        domain=\"vpdsl\"\n");
		contents.append("	        id=\"").append(projectName).append(".resource").append("."+viewpointShortName + "." +aspect).append("\"\n");
		contents.append("	        tags=\"Viewpoint\"\n");
		contents.append("	        name=\"").append(aspect).append("\"\n");
		contents.append("	        path=\"").append(path).append("\"/>\n");
		contents.append("	</extension>\n");
		return contents;
	}
	
	public static StringBuffer createModelReuseExtension(String fileName, String projectName, String viewpointShortName, URI uri) {
		String path = "/" + new Path(uri.path()).removeFirstSegments(1).toString();
		String aspect = fileName.replaceFirst("." + FileExtension.PRIMARY_EXTENSION, "");
		StringBuffer contents = new StringBuffer();
		contents.append("	<extension\n");
		contents.append("	     point=\"org.polarsys.kitalpha.resourcereuse.resources\">\n");
		contents.append("	  <resource\n");
		contents.append("	        domain=\"vpdsl\"\n");
		contents.append("	        id=\"").append(projectName).append(".resource").append("."+aspect).append("\"\n");
		contents.append("	        tags=\"Viewpoint\"\n");
		contents.append("	        name=\"").append(aspect.substring(aspect.indexOf(".")+1, aspect.length())).append("\"\n");
		contents.append("	        path=\"").append(path).append("\"/>\n");
		contents.append("	</extension>\n");
		return contents;
	}
	
	public static StringBuffer createModelReuseExtensionForAE(String projectName, String viewpointShortName) {
		StringBuffer contents = new StringBuffer();
		String path = '/' + projectName + "/model/" + viewpointShortName + ".vptext";
		contents.append("	<extension\n");
		contents.append("	     point=\"org.polarsys.kitalpha.resourcereuse.resources\">\n");
		contents.append("	  <resource\n");
		contents.append("	        domain=\"AE\"\n");
		contents.append("	        id=\"").append(projectName).append(".resource").append("."+viewpointShortName).append("\"\n");
		contents.append("	        tags=\"Viewpoint\"\n");
		contents.append("	        name=\"").append(viewpointShortName).append("\"\n");
		contents.append("	        path=\"").append(path).append("\"/>\n");
		contents.append("	</extension>\n");
		return contents;
	}

	public static byte[] loadPluginXmlData(String bundleName) throws IOException {	
    	final IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(bundleName);
		if (project != null) {	
			IPath location = project.getLocation();
			IPath filePath = location.append("/plugin.xml");
			File file = filePath.toFile();			
		    long size = (long) file.length();
			if (size>0) {
			    byte buff[] = new byte[(int) size];
			    FileInputStream fis = new FileInputStream(file);
			    DataInputStream dis = new DataInputStream(fis);
			    dis.readFully(buff);
			    dis.close();
			    return buff;
			} else {
				throw new RuntimeException("could not find plugin.xml file of project: " + project.getName());
			}
		}	
		return null;
    }
    
    public static byte[] getBytes(InputStream is) throws IOException {
        int len;
        int size = 1024;
        byte[] buf;
        if (is instanceof ByteArrayInputStream) {
          size = is.available();
          buf = new byte[size];
          len = is.read(buf, 0, size);
        } else {
          ByteArrayOutputStream bos = new ByteArrayOutputStream();
          buf = new byte[size];
          while ((len = is.read(buf, 0, size)) != -1)
            bos.write(buf, 0, len);
          buf = bos.toByteArray();
        }
        return buf;
    }
	
	public static String getFileContent(InputStream fis) {
		StringBuilder sb = new StringBuilder();
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
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}
}
