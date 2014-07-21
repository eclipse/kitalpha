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

package org.polarsys.kitalpha.ad.services.detachment.core.registeries.interfaces;

import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.polarsys.kitalpha.ad.services.detachment.core.services.feedback.IFeedback;

/**
 * Contract that each contributor should respect to find element to
 * find in a resource and its content.
 * 
 * @author Matthieu Helleboid
 */
public interface IFinder<T> {
	
	/**
	 * Find T in the hierarchy of eObject
	 * @param eObject
	 * @param messages allows to get unknown elements
	 */
	public void findIn(EObject eObject, IFeedback messages);
	
	/**
	 * Find T in the hierarchy of resource
	 * @param resource
	 * @param messages allows to get unknown elements
	 */
	public void findIn(Resource resource, IFeedback messages);
	
	/**
	 * Returns a set of unknown references instances of T found by findIn methods
	 * @return Set<T> of the unknown references
	 */
	public Set<T> getUndefinedReferences();
	
}