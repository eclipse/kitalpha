/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.emde.diagram.javaaction;

import org.eclipse.emf.ecore.EClass;

public class NewESAction extends AbstractNewExtensibleElement {

	// private static final String EXTENSIBLE_SET = "ExtensibleSet";

	@Override
	public EClass getSuperType() {
//		return EmdePackage.Literals.EXTENSION_SET;
		return null;
	}
}
