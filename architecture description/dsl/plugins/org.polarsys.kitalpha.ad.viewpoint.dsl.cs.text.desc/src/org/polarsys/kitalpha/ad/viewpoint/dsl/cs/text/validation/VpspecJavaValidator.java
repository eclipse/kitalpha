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

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.validation.Check;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.VpspecGrammarAccess;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.validation.AbstractVpspecJavaValidator;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.VpspecPackage;

import com.google.inject.Inject;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Aspect;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramSet;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UIDescription;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.Build;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.Configuration;
 
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
				if (type.equals(access.getViewpointAccess().getTypeDiagramsKeyword_14_0_0().getValue()) && !(aspects.get(index) instanceof DiagramSet))
					error(Messages.VpspecJavaValidator_TypeMismatch, VpspecPackage.Literals.VIEWPOINT__VP_ASPECTS, index);
				if (type.equals(access.getViewpointAccess().getTypeUIKeyword_13_0_0().getValue()) && !(aspects.get(index) instanceof UIDescription))
					error(Messages.VpspecJavaValidator_TypeMismatch, VpspecPackage.Literals.VIEWPOINT__VP_ASPECTS, index);
				if (type.equals(access.getViewpointAccess().getTypeConfigurationKeyword_17_0_0().getValue()) && !(aspects.get(index) instanceof Configuration))
					error(Messages.VpspecJavaValidator_TypeMismatch, VpspecPackage.Literals.VIEWPOINT__VP_ASPECTS, index);
				if (type.equals(access.getViewpointAccess().getTypeBuildKeyword_16_0_0().getValue()) && !(aspects.get(index) instanceof Build))
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
}
