/*******************************************************************************
 * Copyright (c) Thales Corporate Services S.A.S, 2009.
 *******************************************************************************/
package org.polarsys.kitalpha.doc.gen.business.ecore.helpers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.provider.EcoreItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.diagram.description.DiagramDescription;
import org.eclipse.sirius.viewpoint.description.Viewpoint;

public class AIRDDiagramGeneratorHelper {

	private static final String AIRD = ".aird";
	private static final String GEN_DIAGRAM = "genDiagram_";
	public static final ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
			new EcoreItemProviderAdapterFactory());
	private static final String TITLE = "Selection dialog";
	private static final String MESSAGE = "Select elements for generating documentation";

	// Generate a URI for the AIRD file
	public static URI generateURI(IPath path) {
		URI airdURI = URI.createPlatformResourceURI(path.toString() + 
													"/"
													+ GEN_DIAGRAM + 
													System.currentTimeMillis() + 
													AIRD, true);
		return airdURI;
	}

	public static URI getExistedURI(IPath path) {
		try {
			IFolder folder = ResourcesPlugin.getWorkspace().getRoot().getFolder(path);
			if (folder.exists()) 
			{
				IResource[] members = folder.members();
				for (IResource resource : members) 
				{
					String fileName = resource.getName();
					if (fileName.startsWith(GEN_DIAGRAM) && fileName.endsWith(AIRD)) 
					{
						String pathName = resource.getFullPath().toString();
						return URI.createPlatformResourceURI(pathName, false);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// Generate diagram from a semantic object
	public static void generateDiagram(Viewpoint viewpoint, EObject semanticObject, boolean canSelect) {
		Map<DiagramDescription, Boolean> initOptionMap = new
		HashMap<DiagramDescription, Boolean>();
		for (Object o : viewpoint.getOwnedRepresentations()) {
			if (o instanceof DiagramDescription) {
				final DiagramDescription description = (DiagramDescription) o;
				initOptionMap.put(description, description.isInitialisation());
				description.setInitialisation(true);
			}
		}

		final NullProgressMonitor monitor = new NullProgressMonitor();
		
		if (canSelect) 
		{
			Shell shell = new Shell();
			ElementListSelectionDialog dialog = new ElementListSelectionDialog(
					shell, labelProvider);
			List<EObject> list = getCandidateList(semanticObject);
			dialog.setElements(list.toArray());
			dialog.setTitle(TITLE);
			dialog.setMessage(MESSAGE);
			dialog.setMultipleSelection(true);
			if (dialog.open() == Window.OK) 
			{
				Object[] selection = dialog.getResult();
				for (Object object : selection)
					DialectManager.INSTANCE.initRepresentations(viewpoint, (EObject) object, monitor);
			}
			shell.dispose();
		} 
		else 
		{
			DialectManager.INSTANCE.initRepresentations(viewpoint, semanticObject, monitor);
		}

		for (DiagramDescription description : initOptionMap.keySet()) 
		{
			description.setInitialisation(initOptionMap.get(description));
		}
	}

	private static List<EObject> getCandidateList(EObject semanticObject) {
		List<EObject> result = new ArrayList<EObject>();
		Iterator<EObject> iterator = semanticObject.eAllContents();
		while (iterator.hasNext()) {
			EObject next = iterator.next();
			if (isQualified(next)) {
				result.add(next);
			}
		}
		return result;
	}

	public static boolean isQualified(EObject next) {
		return next instanceof EClass;
	}
}
