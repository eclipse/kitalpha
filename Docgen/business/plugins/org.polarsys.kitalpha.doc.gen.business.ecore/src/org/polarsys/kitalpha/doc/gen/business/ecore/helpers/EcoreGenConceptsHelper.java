/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
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

	@Override
	public boolean accept(Object modelElement) {
		return ((modelElement instanceof EClass)
				|| (modelElement instanceof EPackage) || (modelElement instanceof EDataType));
	}

	@Override
	public String getConceptLabel(Object modelElement) {
		if (modelElement instanceof ENamedElement) {
			return ((ENamedElement) modelElement).getName();
		} else {
			return modelElement.toString();
		}
	}

}
