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


package org.polarsys.kitalpha.composer.api.configuration;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * @author Yann Mortier
 */
public interface ICodeManagerInput {

	/**
	 * Returns <code>true</code> if the input is a list of {@link EObject}s.
	 * 
	 * @return <code>true</code> if the input is a list of {@link EObject}s.
	 */
	boolean isMultipleObjectsInput();

	/**
	 * Returns the list of {@link EObject}s to generate. This method should be
	 * used only if {@link #isMultipleObjectsInput()} returns <code>true</code>.
	 * 
	 * @return the list of {@link EObject}s to generate.
	 */
	List<EObject> getListInput();

	/**
	 * Returns the list of root element of all model to generate. This method
	 * should be used only if {@link #isMultipleObjectsInput()} returns
	 * <code>false</code>.
	 * 
	 * @return the list of root element of all model to generate.
	 */
	List<EObject> getRootsInputs();

}
