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
import org.polarsys.kitalpha.emde.model.EmdePackage;

public class NewEMEAction extends AbstractNewExtensibleElement {

	@Override
	public EClass getSuperType() {
		return EmdePackage.Literals.ELEMENT_EXTENSION;
	}

}
