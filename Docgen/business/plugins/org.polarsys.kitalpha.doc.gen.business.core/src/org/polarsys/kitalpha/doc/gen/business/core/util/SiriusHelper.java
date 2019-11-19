/*******************************************************************************
 * Copyright (c) 2014, 2019 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.doc.gen.business.core.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.sirius.business.api.query.EObjectQuery;
import org.eclipse.sirius.business.api.query.SiriusReferenceFinder;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.ext.base.Option;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.polarsys.kitalpha.doc.gen.business.core.internal.GenDocDiagramEditPartService;
import org.polarsys.kitalpha.doc.gen.business.core.preference.helper.DocgenDiagramPreferencesHelper;
import org.polarsys.kitalpha.doc.gen.business.core.sirius.util.session.DiagramSessionHelper;

/**
 * @author Zendagui Boubekeur
 */
public class SiriusHelper {

	/**
	 * Hidden constructor
	 */
	private SiriusHelper(){
	}
	
	/**
	 * <p>
	 * Get all representation element having the model element as target.
	 * </p>
	 * @param element The model element
	 * @return a {@link Collection} of all {@link DRepresentation}
	 */
	public static Collection<DRepresentation> getDiagramForObject(EObject element) {
		Session currentSession = DiagramSessionHelper.getCurrentSession();
		return getDiagramForObject(element, currentSession);
	}
	
	/**
	 * <p>
	 * Get all representation element having the model element as target.
	 * </p>
	 * @param element The model element
	 * @param showInvisible Whether or not we take into account elements that are not visible
	 * @return a {@link Collection} of all {@link DRepresentation}
	 */
	public static Collection<DRepresentation> getDiagramForObject(EObject element, boolean showInvisible) {
		Session currentSession = DiagramSessionHelper.getCurrentSession();
		return getDiagramForObject(element, currentSession, showInvisible);
	}
	
	/**
	 * <p>
	 * Get all representation element having the model element as target.
	 * <br>
	 * This method keep only one instance of a given representation if it 
	 * is return many times by Sirius APIs.
	 * </p>
	 * @param element The model element
	 * @param session the {@link Session} used to get {@link DRepresentation}s 
	 * @return a {@link Collection} of all {@link DRepresentation}
	 */
	public static Collection<DRepresentation> getDiagramForObject(EObject element, Session session) {
		return getDiagramForObject(element, session, false);
	}
	
	/**
	 * <p>
	 * Get all representation element having the model element as target.
	 * <br>
	 * This method keep only one instance of a given representation if it 
	 * is return many times by Sirius APIs.
	 * </p>
	 * @param element The model element
	 * @param session the {@link Session} used to get {@link DRepresentation}s 
	 * @param showInvisible Whether or not we take into account elements that are not visible
	 * @return a {@link Collection} of all {@link DRepresentation}
	 */
	public static Collection<DRepresentation> getDiagramForObject(EObject element, Session session, boolean showInvisible) {
		Collection<DRepresentation> result = new ArrayList<DRepresentation>();
		if (DocgenDiagramPreferencesHelper.getExportDiagram())
		{
			Optional<SiriusReferenceFinder> opFinder = SiriusReferenceFinder.of(element);
			if (opFinder.isPresent()) {
				SiriusReferenceFinder finder = opFinder.get();
				Collection<EObject> elements = new HashSet<>();
				elements.add(element);
				Map<EObject, Collection<EObject>> referencingSiriusElements = finder.getReferencingSiriusElements(elements, SiriusReferenceFinder.SearchScope.ALL_REPRESENTATIONS_SCOPE);
				if (!referencingSiriusElements.isEmpty()) {
					Collection<EObject> representations = referencingSiriusElements.get(element);
					representations.stream()
						// Ensure next type checks will be complete 
						.filter(rep -> rep instanceof DRepresentation || rep instanceof DRepresentationElement)
						.forEach(rep -> {
							DRepresentation repToAdd = null;
							if (rep instanceof DRepresentation) {
								repToAdd = (DRepresentation) rep;
							} else if (rep instanceof DRepresentationElement) {
								// We only handle DDiagramElements TODO: handle DTableElement when tables are taken into account
								if (rep instanceof DDiagramElement) {
									DDiagramElement ddElem = (DDiagramElement) rep;
									// If showInvisible then show, else only show visible elements
									if (showInvisible || ddElem.isVisible()) {
										Option<DRepresentation> representation = new EObjectQuery(rep).getRepresentation();
						                if (representation.some()) {
						                	repToAdd = representation.get();    	
						                }
									}
								}
							}
							if (!result.contains(repToAdd)) {
								result.add(repToAdd);
							}
						});
				}
			}
		}
		return result;
	}
	
	/**
     * Activate or deactivate the autoscaling
     * @param tool
     * @param diagramEditPart
     * @return scale factor
     */
	public static double initAutoScaling(final GenDocDiagramEditPartService tool, final DiagramEditPart diagramEditPart) {
		tool.setAutoScalingEnabled(true);
		tool.getExportResolutionFactor(diagramEditPart); //Hack to initialize the scaling factor before get it
		double scalingFactor = tool.getScalingFactor();
		if (scalingFactor >= 1) {
			tool.setAutoScalingEnabled(false);
		}
		
		return scalingFactor;
	}
}
