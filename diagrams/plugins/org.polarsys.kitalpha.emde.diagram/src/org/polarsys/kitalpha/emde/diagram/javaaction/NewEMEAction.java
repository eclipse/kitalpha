/*******************************************************************************
 * Copyright (c) Thales Corporate Services S.A.S, 2009.
 *******************************************************************************/
package org.polarsys.kitalpha.emde.diagram.javaaction;

import org.eclipse.emf.ecore.EClass;
import org.polarsys.kitalpha.emde.model.EmdePackage;

public class NewEMEAction extends AbstractNewExtensibleElement {

	@Override
	public EClass getSuperType() {
		return EmdePackage.Literals.ELEMENT_EXTENSION;
	}

}
