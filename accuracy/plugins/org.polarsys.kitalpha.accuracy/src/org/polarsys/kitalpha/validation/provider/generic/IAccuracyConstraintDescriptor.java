/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.validation.provider.generic;

import org.eclipse.emf.validation.service.IConstraintDescriptor;

/**
 * Descriptor of an accuracy constraint.
 * 
 * @author THALESGROUP
 */
public interface IAccuracyConstraintDescriptor extends IConstraintDescriptor {

	/**
	 * Returns the ID of the requirement of the constraint.
	 * 
	 * @return the ID of the requirement of the constraint.
	 */
	String getRequirementId();

	/**
	 * Returns the ID of the invariant of the constraint.
	 * 
	 * @return the ID of the invariant of the constraint.
	 */
	String getInvariantId();

}
