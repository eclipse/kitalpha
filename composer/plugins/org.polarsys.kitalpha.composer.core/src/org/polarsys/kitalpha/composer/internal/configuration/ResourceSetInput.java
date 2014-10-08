/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.composer.internal.configuration;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import org.polarsys.kitalpha.composer.api.configuration.ICodeManagerInput;

/**
 * @author Yann Mortier
 * 
 */
public class ResourceSetInput extends AbstractRootsInput {

	protected ResourceSetInput(List<EObject> rootsInputs) {
		super(rootsInputs);
	}

	public static ICodeManagerInput create(ResourceSet resourceSet) {
		if (resourceSet == null) {
			throw new IllegalArgumentException("resourceSet is null");
		}
		List<EObject> list = new ArrayList<EObject>();
		for (Resource resource : resourceSet.getResources()) {
			list.addAll(resource.getContents());
		}
		return new ResourceSetInput(list);
	}

}
