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

import org.eclipse.emf.ecore.EObject;

import org.eclipse.sirius.diagram.DDiagramElement;

public class DefaultSiriusDiagramHelper implements IDiagramHelper {

	@Override
	public boolean select(EObject eObject) {
		return true;
	}

	@Override
	public EObject getSemanticElement(DDiagramElement element) {
		return element.getTarget();
	}

	@Override
	public boolean isContainer(DDiagramElement element) {
		return true;
	}

	@Override
	public String getElementId(EObject eObject) {
		return "";
	}

	@Override
	public String diagramDocumentationPostTraitement(EObject eObject,
			String documentation, String projectName, String outputFolder) {
		return documentation;
	}

}
