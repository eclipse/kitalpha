/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
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
