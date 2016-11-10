/*******************************************************************************
 * Copyright (c) 2016 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
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
