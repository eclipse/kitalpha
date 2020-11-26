/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
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

/**
 * Sirius diagram helper.
 * 
 * @author Florian Barbin
 * 
 */
public interface IDiagramHelper {

	/**
	 * Determines whether given element is navigable.
	 * 
	 * @param eObject
	 * @return true if navigable otherwise false.
	 */
	boolean select(EObject eObject);

	/**
	 * Provides the semantic element linked to the given diagram element.
	 * 
	 * @param element
	 *            the diagram element.
	 * @return the corresponding semantic element within the model.
	 */
	EObject getSemanticElement(DDiagramElement element);

	/**
	 * Determines whether given element is a real graphical container.
	 * 
	 * @param element
	 *            the DDiagramElement.
	 * @return true if element is a graphical container, otherwise false.
	 */
	boolean isContainer(DDiagramElement element);

	/**
	 * Provides the unique eObject id. In some case we need to navigate to a
	 * specific location within a documentation page. The element id is used to
	 * go to this location.
	 * 
	 * @param eObject
	 *            the given semantic element.
	 * @return the eObject id.
	 */
	String getElementId(EObject eObject);
	
	String diagramDocumentationPostTraitement(EObject eObject, String documentation, String projectName, String outputFolder);

}
