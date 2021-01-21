/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.generators.util;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.viewpoint.description.Group;
import org.eclipse.xtext.ui.XtextProjectHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Data;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramSet;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.helpers.vpspec.CoreModelHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.ResourceHelper;


/**
 * 
 * @author Amine Lajmi,
 * Faycal Abka,
 * Arnaud Dieumegard
 *
 */


public class GeneratorsUtil {

	public static final String COPYRIGHT_KITALPHA = "PolarSys";
	
	private GeneratorsUtil() {}
	
	public static String getCurrentUserName() {
		return System.getProperty("user.name");
	}
	
	public static String getCurrentDate() {
		return DateFormat.getDateInstance().format(new java.util.Date());
	}
	
	public static String getCurrentYear(){
		return String.valueOf(Calendar.getInstance().get(Calendar.YEAR));
	}
	
	public static URI computeURI(IStructuredSelection selection) {
		Object obj = selection.getFirstElement();
		IFile file = (IFile) Platform.getAdapterManager().getAdapter(obj, IFile.class);	
		return ResourceHelper.computeURI(file);
	}
	
	public static URI computeURI(EObject inputObject, String extension, String fragment) {
		String vpName = CoreModelHelper.getViewpointShortName(inputObject);
		if (vpName==null)
			vpName = CoreModelHelper.getViewpointName(inputObject);
		String projectName = EcoreUtil.getURI(inputObject).segment(1);
		return ResourceHelper.computeURI(projectName, vpName, extension, fragment);
	}
	
	//to support external imports
	public static String getExternalImportDataHeader(Data data){
		
		if (data != null && data.getAdditionalExternalData().size() > 0) {

			StringBuffer imports = new StringBuffer("\n");

			List<EPackage> ePackages = data.getAdditionalExternalData();

			for (EPackage ePackage : ePackages) {
				imports.append("import external \"")
						.append(ePackage.getNsURI()).append("\"\n");
			}

			imports.append("\n");
			return imports.toString();

		}
		
		return "";
	}
 
	//to support diagram external imports 
	public static String getExternalImportDiagramHeader(DiagramSet diagram){

		if (diagram != null) {

			StringBuffer imports = new StringBuffer("");

			List<EPackage> ePackages = diagram.getAdditionalExternalData();

			if (!ePackages.isEmpty()) {
				imports.append("\n");
			}
			for (EPackage ePackage : ePackages) {
				imports.append("import external \"");
				Resource resource = ePackage.eResource();
				
				//TODO: create helper to get platform uri
				if (resource != null){
					String uri = resource.getURI().toString();
					imports.append(uri);
				} else {
					imports.append(ePackage.getNsURI());
				}
				
				imports.append("\"\n");
			}

			List<Group> groups = diagram.getAdditionalExternalGroup();

			for (Group group : groups) {
				imports.append("import external \"")
				.append(group.eResource().getURI().toString()).append("\"\n");
			}

			return imports.toString();

		}

		return "";
	}
		
	public static void toggleXtextNature(String projectName) {
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		if (project.exists() && project.isAccessible() && !project.isHidden()) {
			try {
				IProjectDescription description = project.getDescription();
				String[] natures = description.getNatureIds();
				for (int i = 0; i < natures.length; ++i) {
					if (XtextProjectHelper.NATURE_ID.equals(natures[i])) {
						// Remove the nature
						String[] newNatures = new String[natures.length - 1];
						System.arraycopy(natures, 0, newNatures, 0, i);
						System.arraycopy(natures, i + 1, newNatures, i,
								natures.length - i - 1);
						description.setNatureIds(newNatures);
						project.setDescription(description, null);
						return;
					}
				}
				// Add the nature
				String[] newNatures = new String[natures.length + 1];
				System.arraycopy(natures, 0, newNatures, 0, natures.length);
				newNatures[natures.length] = XtextProjectHelper.NATURE_ID;
				description.setNatureIds(newNatures);
				project.setDescription(description, null);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
	}
}
