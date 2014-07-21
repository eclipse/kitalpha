/*******************************************************************************
 * Copyright (c) Thales Corporate Services S.A.S, 2009.
 *******************************************************************************/
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
