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
 ******************************************************************************/
package org.polarsys.kitalpha.doc.gen.business.core.util;

import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.swt.graphics.Image;

public class GenDocExtendedImageRegistry extends ExtendedImageRegistry {

	private static GenDocExtendedImageRegistry INSTANCE = new GenDocExtendedImageRegistry();

	public static GenDocExtendedImageRegistry getInstance() {
		return INSTANCE;
	}

	public void dispose() {
		for(Image image : table.values()) {
			image.dispose();
		}
		table.clear();
	}
}
