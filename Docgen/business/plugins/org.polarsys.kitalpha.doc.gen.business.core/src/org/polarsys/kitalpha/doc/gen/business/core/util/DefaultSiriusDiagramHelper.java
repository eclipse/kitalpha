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
package org.polarsys.kitalpha.doc.gen.business.core.util;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.sirius.diagram.DDiagramElement;

public class DefaultSiriusDiagramHelper implements IDiagramHelper {

	public boolean select(EObject eObject) {
		return true;
	}

	public EObject getSemanticElement(DDiagramElement element) {
		return element.getTarget();
	}

	public boolean isContainer(DDiagramElement element) {
		return true;
	}

	public String getElementId(EObject eObject) {
		return "";
	}

	public String diagramDocumentationPostTraitement(EObject eObject,
			String documentation, String projectName, String outputFolder) {
		return documentation;
	}

}
