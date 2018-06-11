/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.validation.provider.generic;

import org.eclipse.emf.validation.service.AbstractConstraintDescriptor;

/**
 * Abstract implementation of {@link IAccuracyConstraintDescriptor}.
 * 
 * @author THALESGROUP
 */
public abstract class AbstractAccuracyConstraintDescriptor extends
		AbstractConstraintDescriptor implements IAccuracyConstraintDescriptor {

	private String invariantId;

	private String requirementId;
	
	private String pluginId;

	private String id;

	/**
	 * Creates an new {@link AbstractAccuracyConstraintDescriptor} with the
	 * given invariant and requirement ID.
	 * 
	 * @param contributorName
	 *            the name of the bundle that provides the constraint.
	 * @param requirementId
	 *            the ID of the requirement.
	 * @param invariantId
	 *            the ID of the invariant.
	 */
	public AbstractAccuracyConstraintDescriptor(String contributorName,
			String requirementId, String invariantId) {
		this.requirementId = requirementId;
		this.invariantId = invariantId;
		this.id = contributorName + "." + requirementId + "." + invariantId;
		this.pluginId = contributorName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.polarsys.kitalpha.validation.provider.generic.IAccuracyConstraintDescriptor#getInvariantId()
	 */
	@Override
	public final String getInvariantId() {
		return this.invariantId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.polarsys.kitalpha.validation.provider.generic.IAccuracyConstraintDescriptor#getRequirementId()
	 */
	@Override
	public final String getRequirementId() {
		return this.requirementId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.validation.service.IConstraintDescriptor#getId()
	 */
	@Override
	public final String getId() {
		return this.id;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.validation.service.IConstraintDescriptor#getPluginId()
	 */
	@Override
	public final String getPluginId() {
		return this.pluginId;
	}

}
