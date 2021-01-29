/*******************************************************************************
 * Copyright (c) 2016, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.exceptions;

/**
 *
 * @author Faycal ABKA
 *
 */
public class ProjectNotFoundException extends RuntimeException {

	/**
	 *
	 */
	private static final long serialVersionUID = -4750726005774515189L;

	private static final String MESSAGE_COULD_NOT_FIND_PROJECT = "could not find project: ";


	public ProjectNotFoundException(final String projectName){
		super(MESSAGE_COULD_NOT_FIND_PROJECT + projectName);
	}


}
