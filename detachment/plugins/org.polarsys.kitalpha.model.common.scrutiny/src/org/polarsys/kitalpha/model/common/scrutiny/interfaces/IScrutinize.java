/*******************************************************************************
 * Copyright (c) 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.model.common.scrutiny.interfaces;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * Contract that each contributor should respect to find element in the model.
 * 
 * @author Matthieu Helleboid
 */


public interface IScrutinize<T, K> {
	
	public void findIn(EObject eObject);
	
	public void findIn(Resource resource);
	
	/**
	 * @return T which is the type containing the result
	 * of the analysis
	 */
	public T getAnalysisResult();
	
	/**
	 * return a feedback about the analysis - for instance, to the user (
	 * i.e: UI -
	 * 
	 * NOTE: interfaces to implements the type which containing
	 * the feedback are provided by the model analysis, but you can give
	 * your own type to the finders.
	 * 
	 * (org.polarsys.kitalpha.model.analysis.interfaces.IFeedback and 
	 * org.polarsys.kitalpha.model.analysis.interfaces.IFeedback.IFeedbackMessage)
	 * 
	 * @return the type containing the feedback
	 */
	public K getFeedbackAnalysisMessages();
}
