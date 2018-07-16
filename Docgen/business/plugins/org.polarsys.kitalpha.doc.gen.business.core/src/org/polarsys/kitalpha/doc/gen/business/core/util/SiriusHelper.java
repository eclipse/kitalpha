/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.polarsys.kitalpha.doc.gen.business.core.internal.GenDocDiagramEditPartService;
import org.polarsys.kitalpha.doc.gen.business.core.preference.helper.DocgenDiagramPreferencesHelper;
import org.polarsys.kitalpha.doc.gen.business.core.sirius.util.session.DiagramSessionHelper;


import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.session.Session;

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
	 * <br>
	 * This method keep only one instance of a given representation if it 
	 * is return many times by Sirius APIs.
	 * </p>
	 * @param element The model element
	 * @param session the {@link Session} used to get {@link DRepresentation}s 
	 * @return a {@link Collection} of all {@link DRepresentation}
	 */
	public static Collection<DRepresentation> getDiagramForObject(EObject element, Session session) {
		Collection<DRepresentation> result = new ArrayList<DRepresentation>();
		if (DocgenDiagramPreferencesHelper.getExportDiagram())
		{
			Collection<DRepresentation> representations = 
					DialectManager.INSTANCE.getRepresentations(element, session);

			// This issue must be resolved in Sirius.
			for (DRepresentation dRepresentation : representations) 
			{
				if (! result.contains(dRepresentation)) {
					result.add(dRepresentation);
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
