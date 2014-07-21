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

package org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.generators;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IGenerator;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Aspect;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Data;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramSet;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UIDescription;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.Build;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.Configuration;

/**
 * 
 * @author Amine Lajmi
 *
 */
public interface IViewpointBackwardSynchronizer extends IGenerator {

	EObject backwardSynchronize(Data object, Resource target);
	
	EObject backwardSynchronize(Configuration object, Resource target);
	
	EObject backwardSynchronize(UIDescription object, Resource target);
	
	EObject backwardSynchronize(DiagramSet object, Resource target);

	EObject backwardSynchronize(List<Aspect> services, Resource target);
	
	EObject backwardSynchronize(Build object, Resource target);
}
