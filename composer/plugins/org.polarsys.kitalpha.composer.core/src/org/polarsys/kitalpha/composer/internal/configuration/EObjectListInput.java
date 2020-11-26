/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
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

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.polarsys.kitalpha.composer.api.configuration.ICodeManagerInput;

/**
 * Input that is a list of {@link EObject}s.
 * 
 * @author Yann Mortier
 */
public class EObjectListInput implements ICodeManagerInput {

	private final List<EObject> input;

	private EObjectListInput(List<EObject> input) {
		this.input = input;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.polarsys.kitalpha.composer.api.ICodeManagerInput#getListInput()
	 */
	@Override
	public List<EObject> getListInput() {
		return this.input;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.polarsys.kitalpha.composer.api.ICodeManagerInput#getRootsInputs()
	 */
	@Override
	public List<EObject> getRootsInputs() {
		return Collections.<EObject> emptyList();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.polarsys.kitalpha.composer.api.ICodeManagerInput#isMultipleObjectsInput()
	 */
	@Override
	public boolean isMultipleObjectsInput() {
		return true;
	}

	public static ICodeManagerInput create(List<EObject> input) {
		if (input == null) {
			throw new IllegalArgumentException("The input is null");
		}
		return new EObjectListInput(input);
	}
}
