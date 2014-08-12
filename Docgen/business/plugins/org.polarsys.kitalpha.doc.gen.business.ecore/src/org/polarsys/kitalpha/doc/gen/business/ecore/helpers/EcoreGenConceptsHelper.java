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
package org.polarsys.kitalpha.doc.gen.business.ecore.helpers;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EPackage;
import org.polarsys.kitalpha.doc.gen.business.core.helper.IConceptsHelper;


public class EcoreGenConceptsHelper implements IConceptsHelper {

	public boolean accept(Object modelElement) {
		return ((modelElement instanceof EClass)
				|| (modelElement instanceof EPackage) || (modelElement instanceof EDataType));
	}

	public String getConceptLabel(Object modelElement) {
		if (modelElement instanceof ENamedElement) {
			return ((ENamedElement) modelElement).getName();
		} else {
			return modelElement.toString();
		}
	}

}
