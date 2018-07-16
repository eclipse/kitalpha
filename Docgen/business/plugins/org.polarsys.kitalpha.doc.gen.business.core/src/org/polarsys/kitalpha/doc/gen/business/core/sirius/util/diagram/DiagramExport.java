/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.doc.gen.business.core.sirius.util.diagram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.common.tools.api.resource.ImageFileFormat ;
import org.eclipse.sirius.common.tools.api.util.FileUtil;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.ui.tools.api.actions.export.ExportAction;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.swt.widgets.Display;
import org.polarsys.kitalpha.doc.gen.business.core.Activator;
import org.polarsys.kitalpha.doc.gen.business.core.util.DocGenHtmlUtil;

/**
 * @author Boubekeur Zendagui
 * 
 */
public class DiagramExport {
	private static final String JPG = "JPG";
	private final NullProgressMonitor nullProgressMonitor = new NullProgressMonitor();
	private IPath outputPath;
	private DDiagram diagram;
	private Session session;
	
	private IProject project;

	public DiagramExport(IPath outputPath, DDiagram diagram, Session session) {
		initDiagramExport(outputPath, diagram, session);
	}
	
	public DiagramExport(String projectName, IPath outputPath, DDiagram diagram, Session session) {
		project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		refreshProject();
		initDiagramExport(outputPath, diagram, session);
	}
	
	private void refreshProject(){
		if (null != project && project.exists())
		{
			try {
				project.refreshLocal(IProject.DEPTH_INFINITE, nullProgressMonitor);
			} catch (CoreException e) {
				Activator.logWarning(e.getMessage());
			}
		}
	}
	
	
	private void initDiagramExport(IPath outputPath, DDiagram diagram, Session session) {
		IFolder folder = ResourcesPlugin.getWorkspace().getRoot().getFolder(outputPath);
		if (folder != null && ! folder.exists()) {
			try {
				folder.create(true, true, nullProgressMonitor);
			} catch (CoreException e) {
				Activator.logError("can't create forlder " + folder.getName());
			}
		}
		this.outputPath = folder != null ? folder.getLocation() : null;
		this.diagram = diagram;
		this.session = session;
	}

	/**
	 * @return the image file
	 */
	public IFile exportAsImage() {
		final List<IFile> result = new ArrayList<IFile>();
		Resource airdResource = session.getSessionResource();
		URI airdURI = airdResource.getURI();
		if (airdURI != null) 
		{
			Display.getDefault().syncExec(new Runnable() {
				@Override
				public void run() {
					final ExportAction exportAction = new GenDocDiagramExportAction(session, getRepresentationsToExportAsImage(), outputPath, ImageFileFormat.JPG,false);
					try {
						exportAction.run(nullProgressMonitor);
					} catch (InterruptedException e) {
						Activator.logError("An error occured during export action", e);
					} catch (Exception e) {
						Activator.logError("An error occured during export action", e);
					}
				}
			});

			result.add(getGeneratedDiagram());
		}
		
		if (! result.isEmpty())
		{
			return result.get(0);
		}
		
		return null;
	}

	private IFile getGeneratedDiagram() {
		
		// Compute diagram exported picture name
		String representaionName = DocGenHtmlUtil.getValidFileName(diagram.getName());
		FileUtil obeoDSLFileUtil = new FileUtil(representaionName);
		String expectedFileName;
		if (obeoDSLFileUtil.isValid()){
			expectedFileName = representaionName + "." + JPG.toLowerCase();
		}else{
			expectedFileName = obeoDSLFileUtil.getValidFilename() + "." + JPG.toLowerCase();
		}
		
		// Locate the file
		IFolder folder = (IFolder) ResourcesPlugin.getWorkspace().getRoot().getContainerForLocation(outputPath);
		
		if (null == folder)
		{
			refreshProject();
			folder = (IFolder) ResourcesPlugin.getWorkspace().getRoot().findContainersForLocation(outputPath)[0];
		}
		
		IFile iFile = folder.getFile(expectedFileName);
		if (iFile.exists()) {
			return iFile;
		} else
		{
			// May be we deal with linked resources
			
			// 1- Try to get the linked file
			IPath filePath = outputPath.append(expectedFileName);
			IFile iLinkedFile = ResourcesPlugin.getWorkspace().getRoot().findFilesForLocation(filePath)[0];
			
			// 2- If the file is found, the return it.
			if (null != iLinkedFile && iLinkedFile.exists()) {
				return iLinkedFile;
			}
		}
		
		return null;
	}

	/**
	 * getRepresentationsPerFile(URI) is replaced by getRepresentationsToExportAsImage() 
	 */
	
	@Deprecated
	private Map<URI, List<DRepresentation>> getRepresentationsPerFile(URI airdUri) {
		Map<URI, List<DRepresentation>> representationsPerFile = new HashMap<URI, List<DRepresentation>>();
		List<DRepresentation> list = new ArrayList<DRepresentation>();
		list.add(diagram);
		representationsPerFile.put(airdUri, list);
		return representationsPerFile;
	}
	
	private List<DRepresentation> getRepresentationsToExportAsImage() {
		List<DRepresentation> list = new ArrayList<DRepresentation>();
		list.add(diagram);
		return list;
	}
}
