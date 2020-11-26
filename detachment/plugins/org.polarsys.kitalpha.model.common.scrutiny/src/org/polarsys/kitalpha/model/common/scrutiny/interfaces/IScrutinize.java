/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.model.common.scrutiny.interfaces;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * Contract that each contributor should respect to find element in the model.
 * 
 * @author Matthieu Helleboid
 */


public interface IScrutinize<T, K> {
	
	void findIn(EObject eObject);
	
	void findIn(Resource resource);
	
	/**
	 * This method returns the structure of the srutinizer resource result to the UI and Commands.
	 * Note: The returned structure must contains the selection of the user 
	 * 
	 * @return T which is the type containing the result
	 * of the analysis
	 */
	T getAnalysisResult();
	
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
	K getFeedbackAnalysisMessages();
}
