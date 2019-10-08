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

package org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.generators.reverse;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.XtextResource;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.Configuration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Data;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.DataFactory;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.data.DataSpec;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.helpers.vpspec.CoreModelHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.generators.BackwardSynchronizer;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.generators.util.GeneratorsUtil;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.generators.util.ReferenceUtil;

/**
 * 
 * @author Amine Lajmi
 *
 */
public class ReverseSynchronizer extends BackwardSynchronizer{

	public static final String DATA_SUFFIX = "data";
	
	public static final String CONFIGURATION_SUFFIX = "conf";
	
	@Override
	public EObject backwardSynchronize(Configuration object, Resource target) {
		String shortName = CoreModelHelper.getViewpointShortName(object);
		XtextResource textResource = (XtextResource) target;
		EObject clone = copier.get(object);
		Configuration config = (Configuration) clone;
		if (config.getName()==null)
			config.setName(shortName + "." + CONFIGURATION_SUFFIX);
		if (textResource.getContents().isEmpty()) {
			textResource.getContents().add(config);
		} else {
			EObject oldRoot = textResource.getContents().get(0);
			EcoreUtil2.replace(oldRoot, config);
		}
		ReferenceUtil.recoverReferences(object, copier);		
		String serializationContent = textResource.getSerializer().serialize(config);
		String newContent = appendCopyRightHeader(config, shortName) + serializationContent;
		if (saveNewResource(textResource, newContent))
			return textResource.getContents().get(0);
		return null;
	}

	@Override
	public EObject backwardSynchronize(Data object, Resource resource) {
		String shortName = CoreModelHelper.getViewpointShortName(object);
		XtextResource textResource = (XtextResource) resource;
		String newContent = null;
		EObject clone = copier.get(object);
		if (((Data) clone).getName()==null)
		((Data) clone).setName(shortName + "." + DATA_SUFFIX);
		if (textResource.getContents().isEmpty()) {
			DataSpec dataSpec = DataFactory.eINSTANCE.createDataSpec();
			dataSpec.setData((Data)clone);
			textResource.getContents().add(dataSpec);
		} else {
			EObject oldRoot = textResource.getContents().get(0);
			DataSpec dataSpec = DataFactory.eINSTANCE.createDataSpec();
			dataSpec.setData((Data)clone);
			EcoreUtil2.replace(oldRoot, dataSpec);
		}
		
		String serializationContent = textResource.getSerializer().serialize(clone);
		newContent = appendCopyRightHeader(clone, CoreModelHelper.getViewpointShortName(object)) + GeneratorsUtil.getExternalImportDataHeader((Data)clone) + serializationContent;
		if (saveNewResource(textResource, newContent))
			return textResource.getContents().get(0);
		return null;
	}
}
