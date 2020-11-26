/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.services.manager;

/**
 * @author Thomas Guiu
 * 
 */
public class ViewpointActivationException extends Exception {

	private static final long serialVersionUID = 3777264270307926091L;

	public ViewpointActivationException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public ViewpointActivationException(String arg0) {
		super(arg0);
	}

	public ViewpointActivationException(Throwable arg0) {
		super(arg0);
	}

}
