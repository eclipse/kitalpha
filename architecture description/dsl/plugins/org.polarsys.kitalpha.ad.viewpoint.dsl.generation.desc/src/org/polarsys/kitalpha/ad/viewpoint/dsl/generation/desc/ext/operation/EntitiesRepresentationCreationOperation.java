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

/**
 * @author Boubekeur Zendagui
 *
 */
public class EntitiesRepresentationCreationOperation extends AbstractRepresentationCreationOperation {

	/**
	 * eMDE Viewpoint informations 
	 */
	private static final String ENTITIES__VSM__PLUGIN_ID = "org.eclipse.emf.ecoretools.design";
	private static final String ENTITIES__VIEWPOINT_NAME = "Design";

	/**
	 * Default constructor
	 * @param ecoreURI ecore model {@link URI}
	 */
	public EntitiesRepresentationCreationOperation(URI ecoreURI) {
		super(ecoreURI, null, ENTITIES__VSM__PLUGIN_ID, ENTITIES__VIEWPOINT_NAME);
	}
	
	/**
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.generation.desc.ext.operation.AbstractRepresentationCreationOperation#getSemanticElements(org.eclipse.sirius.business.api.session.Session, org.eclipse.emf.common.util.URI)
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

	/**
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.generation.desc.ext.operation.AbstractRepresentationCreationOperation#getLabelFrom(org.eclipse.emf.ecore.EObject, org.eclipse.sirius.viewpoint.description.RepresentationDescription)
	 */
	@Override
	public String getLabelFrom(EObject currentSemantic, RepresentationDescription description) {
		return currentSemantic instanceof EPackage ? ((EPackage)currentSemantic).getName() + " " + description.getName() : "";
	}

	/**
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.generation.desc.ext.operation.AbstractRepresentationCreationOperation#initializeDiagram(org.eclipse.sirius.diagram.DDiagram)
	 */
	@Override
	public boolean initializeDiagram(DDiagram diagram) {
		return true;
	}

}
