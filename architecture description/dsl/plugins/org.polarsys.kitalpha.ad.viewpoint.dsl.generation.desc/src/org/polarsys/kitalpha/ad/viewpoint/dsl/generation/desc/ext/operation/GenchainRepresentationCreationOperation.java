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

import org.eclipse.egf.portfolio.genchain.generationChain.GenerationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;

/**
 * @author Boubekeur Zendagui
 */

public class GenchainRepresentationCreationOperation extends AbstractRepresentationCreationOperation {
	
	/**
	 * GenerationChain Viewpoint informations 
	 */
	private static final String GENCHAIN__VSM__PLUGIN_ID = "org.polarsys.kitalpha.egf.genchain.diagram";
	private static final String GENCHAIN__VIEWPOINT_NAME = "genchain.viewpoint.id";

	/***
	 * Default constructor
	 * @param genchainURI GenerationChain model {@link URI}
	 */
	public GenchainRepresentationCreationOperation(URI genchainURI) {
		super(genchainURI, null, GENCHAIN__VSM__PLUGIN_ID, GENCHAIN__VIEWPOINT_NAME);
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
					if (eObject instanceof GenerationChain)
					{
						GenerationChain genChain = (GenerationChain) eObject;
						result.add(genChain);
					}
				}
			}
		}
		return result;
	}

	/**
	 * @see #getLabelFrom(EObject)
	 */
	@Override
	public String getLabelFrom(EObject currentSemantic, RepresentationDescription description) {
		return currentSemantic instanceof GenerationChain ? ((GenerationChain)currentSemantic).getName() + " " + description.getLabel() : "";
	}
	
	/**
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.generation.desc.ext.operation.AbstractRepresentationCreationOperation#initializeDiagram(org.eclipse.emf.ecore.EObject, org.eclipse.sirius.viewpoint.description.RepresentationDescription)
	 */
	@Override
	public boolean initializeDiagram(DDiagram diagram) {
		return false;
	}
}
