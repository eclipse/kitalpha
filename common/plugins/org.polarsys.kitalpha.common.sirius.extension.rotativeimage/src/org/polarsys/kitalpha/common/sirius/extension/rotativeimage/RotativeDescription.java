/*******************************************************************************
 * Copyright (c) 2020 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.common.sirius.extension.rotativeimage;

public class RotativeDescription {
	
	public static final int FOUR_IMAGES = 0;
	public static  final int ROTATIVE = 1;
	
	public String id;
	public int mode;
	
	public RotativeDescription(String id, int mode) {
		this.id=id;
		this.mode=mode;
	}
}
