/*******************************************************************************
 * Copyright (c) 2016 Thales Global Services S.A.S.
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
public class PluginXMLNotFindException extends RuntimeException {

	/**
	 *
	 */
	private static final long serialVersionUID = 5057173757972136263L;


	private static final String MESSAGE_COULD_NOT_FIND_XML = "could not find plugin.xml file of project: ";

	public PluginXMLNotFindException(final String fileName) {
		super(MESSAGE_COULD_NOT_FIND_XML + fileName);
	}
}
