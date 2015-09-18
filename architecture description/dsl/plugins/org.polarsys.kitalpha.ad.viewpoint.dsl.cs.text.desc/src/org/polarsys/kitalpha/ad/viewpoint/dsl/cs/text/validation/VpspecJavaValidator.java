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

package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.validation;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.validation.Check;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Aspect;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramSet;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UIDescription;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.VpspecGrammarAccess;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.VpspecPackage;

import com.google.inject.Inject;
 
/**
 * 
 * @author Amine Lajmi
 *
 */
public class VpspecJavaValidator extends AbstractVpspecJavaValidator {
	
	@Inject
	IGrammarAccess grammar;

	@Check
	public void checkViewpoint(org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint vp) {
		VpspecGrammarAccess access = (VpspecGrammarAccess)grammar;
		EList<String> types = vp.getType();
		EList<Aspect> aspects = vp.getVP_Aspects();
		if (!aspects.isEmpty()) {
			for (String type : types) {
				int index = types.indexOf(type);
				if (type.equals(access.getViewpointAccess().getTypeDiagramsKeyword_15_0_0().getValue()) && !(aspects.get(index) instanceof DiagramSet))
					error(Messages.VpspecJavaValidator_TypeMismatch, VpspecPackage.Literals.VIEWPOINT__VP_ASPECTS, index);
				if (type.equals(access.getViewpointAccess().getTypeUIKeyword_14_0_0().getValue()) && !(aspects.get(index) instanceof UIDescription))
					error(Messages.VpspecJavaValidator_TypeMismatch, VpspecPackage.Literals.VIEWPOINT__VP_ASPECTS, index);
			}
			EList<Viewpoint> dependencies = vp.getDependencies();
			for (Viewpoint v : dependencies) {
				if (v.getName().equals(vp.getName())) {
					error(Messages.VpspecJavaValidator_ForbiddenSelfDependency, VpspecPackage.Literals.VIEWPOINT__DEPENDENCIES, dependencies.indexOf(v));
				}	
			}
			EList<Viewpoint> parents = vp.getParents();
			for (Viewpoint v : parents) {
				if (v.getName().equals(vp.getName())) {
					error(Messages.VpspecJavaValidator_ForbiddenSelfInheritance, VpspecPackage.Literals.VIEWPOINT__PARENTS, parents.indexOf(v));
				}	
			}	
		}
	}
	
	@Check
	public void checkUsedModelExisting(org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint vp){
		EList<String> useAnyEMFResource = vp.getUseAnyEMFResource();
		
		for (String model : useAnyEMFResource) {
			if (!isModelExist(model)){
				error(Messages.bind(Messages.VpspecJavaValidator_NotExistingModel, model), VpspecPackage.Literals.VIEWPOINT__USE_ANY_EMF_RESOURCE, useAnyEMFResource.indexOf(model));
			}
		}
	}
	
	@Check
	public void checkUsedDiagramExisting(org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint vp){
		EList<String> usedDiagram = vp.getUseDiagramResource();
		
		for (String model : usedDiagram) {
			if (!isModelExist(model)){
				error(Messages.bind(Messages.VpspecJavaValidator_NotExistingDiagramModel, model), VpspecPackage.Literals.VIEWPOINT__USE_DIAGRAM_RESOURCE, usedDiagram.indexOf(model));
			}
		}
	}

	private boolean isModelExist(String model) {
		model = trimQuotes(model);
		URI uri = URI.createURI(model);
		
		if (!uri.isPlatform())
			return false;
		
		if (uri.isPlatformResource()){
			String filePath = getFilePath(model);
			IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(filePath));
			return file.exists();
		}
		
		return uri.isPlatformPlugin();
	}

	private static String RESOURCE_SEGMENT = "resource/";
	private static int SIZE = RESOURCE_SEGMENT.length();
	
	private String getFilePath(String model) {
		int index = model.indexOf("resource/");
		index += SIZE;
		
		return model.substring(index);
	}

	private String trimQuotes(String model) {
		return model.replace("\"", "").trim();
	}
}
