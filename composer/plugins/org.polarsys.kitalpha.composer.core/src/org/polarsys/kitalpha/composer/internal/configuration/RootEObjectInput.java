/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
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

import org.polarsys.kitalpha.composer.api.configuration.ICodeManagerInput;

/**
 * @author Yann Mortier
 */
public class RootEObjectInput extends AbstractRootsInput {

	private RootEObjectInput(List<EObject> rootsInputs) {
		super(rootsInputs);
	}

	public static ICodeManagerInput create(EObject eObject) {
		if (eObject == null) {
			throw new IllegalArgumentException("eObject is null");
		}
		ArrayList<EObject> list = new ArrayList<EObject>(1);
		list.add(eObject);
		return new RootEObjectInput(list);
	}

}
