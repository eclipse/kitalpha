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
