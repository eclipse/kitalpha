/*******************************************************************************
 * Copyright (c) 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation.
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
	public List<EObject> getListInput() {
		return Collections.<EObject> emptyList();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.polarsys.kitalpha.composer.api.ICodeManagerInput#getRootsInputs()
	 */
	public List<EObject> getRootsInputs() {
		return this.rootsInputs;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.polarsys.kitalpha.composer.api.ICodeManagerInput#isMultipleObjectsInput()
	 */
	public boolean isMultipleObjectsInput() {
		return false;
	}

}
