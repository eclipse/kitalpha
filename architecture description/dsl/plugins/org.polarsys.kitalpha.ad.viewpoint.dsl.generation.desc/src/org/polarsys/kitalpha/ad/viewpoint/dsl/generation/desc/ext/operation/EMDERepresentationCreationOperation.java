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
 */

public class EMDERepresentationCreationOperation extends AbstractRepresentationCreationOperation {

	/**
	 * eMDE Viewpoint informations 
	 */
	private static final String EMDE__VSM__PLUGIN_ID = "org.polarsys.kitalpha.emde.diagram";
	private static final String EMDE__VIEWPOINT_NAME = "Extensibility";

	/**
	 * Default constructor
	 * @param ecoreURI ecore model {@link URI}
	 */
	public EMDERepresentationCreationOperation(URI ecoreURI) {
		super(ecoreURI, null, EMDE__VSM__PLUGIN_ID, EMDE__VIEWPOINT_NAME);
	}
	
	/**
	 * @see #getLabelFrom(EObject)t
	 */
	@Override
	public String getLabelFrom(EObject currentSemantic, RepresentationDescription description) {
		return currentSemantic instanceof EPackage ? ((EPackage)currentSemantic).getName() + " " + description.getName() : "";
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
						List<EPackage> subPackages = getSubPackages(ePackage);
						if (! subPackages.isEmpty())
						{
							result.addAll(subPackages);
						}
					}
				}
			}
		}
		
		return result;
	}
	
	
	/**
	 * @param parent the parent {@link EPackage}
	 * @return a {@link List} of sub packages
	 */
	private List<EPackage> getSubPackages(EPackage parent){
		final List<EPackage> result = new ArrayList<EPackage>();
		
		EList<EPackage> eSubpackages = parent.getESubpackages();
		if (eSubpackages != null && ! eSubpackages.isEmpty())
		{
			result.addAll(eSubpackages);
			for (EPackage ePackage : eSubpackages) 
			{
				List<EPackage> children = getSubPackages(ePackage);
				if (! children.isEmpty())
				{
					result.addAll(children);
				}
			}
		}
		
		return result;
	}
	
	/**
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.generation.desc.ext.operation.AbstractRepresentationCreationOperation#initializeDiagram(org.eclipse.emf.ecore.EObject, org.eclipse.sirius.viewpoint.description.RepresentationDescription)
	 */
	@Override
	public boolean initializeDiagram(DDiagram diagram) {
		return false;
	}
}
