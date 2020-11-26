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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.polarsys.kitalpha.composer.api.configuration.ICodeManagerInput;

/**
 * @author Yann Mortier
 * 
 */
public abstract class AbstractRootsInput implements ICodeManagerInput {

	private final List<EObject> rootsInputs;

	protected AbstractRootsInput(List<EObject> rootsInputs) {
		this.rootsInputs = new ArrayList<EObject>(rootsInputs);
		if (rootsInputs == null) {
			throw new IllegalArgumentException("rootsInputs is null");
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.polarsys.kitalpha.composer.api.ICodeManagerInput#getListInput()
	 */
	@Override
	public List<EObject> getListInput() {
		return Collections.<EObject> emptyList();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.polarsys.kitalpha.composer.api.ICodeManagerInput#getRootsInputs()
	 */
	@Override
	public List<EObject> getRootsInputs() {
		return this.rootsInputs;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.polarsys.kitalpha.composer.api.ICodeManagerInput#isMultipleObjectsInput()
	 */
	@Override
	public boolean isMultipleObjectsInput() {
		return false;
	}

}
