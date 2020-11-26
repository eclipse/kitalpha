/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.association;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.constraint.VpDescAbstractModelConstraint;

/**
 * @author Boubekeur Zendagui
 *
 */
public abstract class AbstractAssociationConstraint extends VpDescAbstractModelConstraint{

	/** In case of problem, this property will hold that association target object that cause the problem**/
	private EObject targetWithProblem = null;
	
	/**
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.constraint.VpDescAbstractModelConstraint#setEStructuralFeatureName(org.eclipse.emf.ecore.EObject)
	 */
	@Override
	protected abstract void setEStructuralFeatureName(EObject eObject);
	
	/**
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.constraint.VpDescAbstractModelConstraint#isObjectInScope(java.lang.Object)
	 */
	@Override
	protected abstract boolean isObjectInScope(Object object);
	
	/**
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.constraint.VpDescAbstractModelConstraint#getDisplayContainerInformations(java.lang.Object)
	 */
	@Override
	protected boolean getDisplayContainerInformations(Object object) {
		return false;
	}
	
	/**
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.constraint.VpDescAbstractModelConstraint#isValidData(java.lang.Object)
	 */
	@SuppressWarnings("unchecked")
	@Override
	protected boolean isValidData(EObject context, Object data) {
		if (data instanceof EObject)
		{
			EObject eData = (EObject) data;
			final boolean accept = acceptAssociationBetween((EObject) context, eData);
			if (!accept) {
				targetWithProblem = eData;
			}

			return accept;
		}
		
		if (data instanceof EList<?>)
		{
			EList<EObject> lData = (EList<EObject>) data;
			if (! lData.isEmpty())
			{
				for (EObject eObject : lData) 
				{
					final boolean accept = acceptAssociationBetween(context, eObject);
					if (! accept)
					{
						targetWithProblem = eObject;
						return false;
					}
				}
			}
		}
		return true;
	}
	
	/**
	 * 
	 * @param source Association container
	 * @param target Targeted element by association
	 * @return True if association between source and target element is allowed
	 */
	protected abstract boolean acceptAssociationBetween(EObject source, EObject target);

	/**
	 * 
	 * @param source
	 * @param target
	 * @return
	 */
	protected abstract String getMessageToDisplay(EObject source, EObject target);
	
	/**
	 * @see org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.constraint.VpDescAbstractModelConstraint#getMessageToDisplay(org.eclipse.emf.ecore.EObject)
	 */
	@Override
	protected final String getMessageToDisplay(EObject eObject) {
		return getMessageToDisplay(eObject, targetWithProblem);
	}

}
