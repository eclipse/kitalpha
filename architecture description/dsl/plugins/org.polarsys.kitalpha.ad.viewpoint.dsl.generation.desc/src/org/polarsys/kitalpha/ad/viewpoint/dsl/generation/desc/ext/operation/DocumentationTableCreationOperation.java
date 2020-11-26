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

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.desc.ext.operation;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;

public class DocumentationTableCreationOperation extends AbstractRepresentationCreationOperation {

	private static final String DOCUMENTATION__VSM__PLUGIN_ID = "org.polarsys.kitalpha.ecore.diagram";
	private static final String DOCUMENTATION__VIEWPOINT_NAME = "Kitalpha_Documentation";
	
	public DocumentationTableCreationOperation(URI ecoreURI) {
		super(ecoreURI, null, DOCUMENTATION__VSM__PLUGIN_ID, DOCUMENTATION__VIEWPOINT_NAME);
	}

	/**
	 * @see #getSemanticElements(Session, URI)
	 */
	@Override
	public List<EObject> getSemanticElements(Session session, URI modelUri) {
		final List<EObject> result = new ArrayList<EObject>();
		for (Resource resource : session.getSemanticResources()) 
		{
			if (resource.getURI().toString().equals(modelUri.toString()))
			{
				EList<EObject> contents = resource.getContents();
				if (contents != null && ! contents.isEmpty())
				{
					EObject eObject = contents.get(0);
					if (eObject instanceof EPackage)
					{
						EPackage ePackage = (EPackage) eObject;
						result.add(ePackage);
					}
				}
			}
		}
		
		return result;
	}

	@Override
	public String getLabelFrom(EObject currentSemantic, RepresentationDescription description) {
		return currentSemantic instanceof EPackage ? ((EPackage)currentSemantic).getName() + " " + description.getName() : "";
	}

	/**
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.generation.desc.ext.operation.AbstractRepresentationCreationOperation#initializeDiagram(org.eclipse.emf.ecore.EObject, org.eclipse.sirius.viewpoint.description.RepresentationDescription)
	 */
	@Override
	public boolean initializeDiagram(DDiagram diagram) {
		return false;
	}

}
