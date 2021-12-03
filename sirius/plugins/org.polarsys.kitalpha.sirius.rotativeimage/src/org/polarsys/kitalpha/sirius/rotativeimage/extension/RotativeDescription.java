/*******************************************************************************
 * Copyright (c) 2020, 2021 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.sirius.rotativeimage.extension;

public class RotativeDescription {
	
	public static final int FOUR_IMAGES = 0;
	public static final int ROTATIVE = 1;
	
	public String id;
	public int mode;
	
	public RotativeDescription(String id, int mode) {
		this.id=id;
		this.mode=mode;
	}
}
