/*******************************************************************************
 * Copyright (c) 2017, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.helper.desc.data;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Association_Types;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Cardinalities;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.LocalClassAssociation;

/**
 * A helper which provides utility methods to check properties (transient...) on VP DSL Association
 * 
 * @author Faycal Abka
 *
 */
public class AssociationsHelper {
	
	/**
	 * Check if the reference association is equal to opposite association
	 * @param reference
	 * @param opposite
	 * @return true if reference is the its opposite association, otherwise false
	 */
	public static boolean areSelfOpposite(LocalClassAssociation reference, LocalClassAssociation opposite){
		if (reference == null || opposite == null) {
			return false;
		}

		return reference.equals(opposite);
	}
	
	/**
	 * Check if the target type of reference is equal to the container type of the opposite association
	 * @param reference
	 * @param opposite
	 * @return true if the type of target type of reference is equal to the container type of the opposite
	 * association, otherwise false
	 */
	public static boolean areCoherentOpposite(LocalClassAssociation reference, LocalClassAssociation opposite){
		if (reference == null || opposite == null) {
			return false;
		}
		
		return reference.getLocalTarget() == opposite.eContainer();
	}
	
	/**
	 * Check if the reference and its opposite are not containment association in the same time.
	 * @param reference
	 * @param opposite
	 * @return true if the reference and opposite are containment association, otherwise, false
	 */
	public static boolean areContainmentAssociations(LocalClassAssociation reference, LocalClassAssociation opposite){
		if (reference == null || opposite == null){
			return false;
		}
		Association_Types typeRef = reference.getType();
		Association_Types typeOpposite = opposite.getType();
		return typeRef.equals(Association_Types.CONTAINMENT) && typeOpposite.equals(Association_Types.CONTAINMENT);
	}
	
	/**
	 * Check if the reference and association have the same transient property value in the same time.
	 * @param reference
	 * @param opposite
	 * @return true if the transient value of reference and oppoiste are the same, otherwise, false
	 */
	public static boolean areTransientAssociations(LocalClassAssociation reference, LocalClassAssociation opposite){
		if (reference == null || opposite == null){
			return false;
		}
		boolean isRefTransient = reference.isTransient();
		boolean isOppositeTransient = opposite.isTransient();
		return isRefTransient == isOppositeTransient;
	}
	
	/**
	 * Return the type which declares e
	 * @param e
	 * @return the type which declares e
	 */
	public static Class getContainingClass(LocalClassAssociation e){
		return (Class)e.eContainer();
	}
	
	/**
	 * @param e
	 * @return the name of containing class or "Unknown Container"
	 */
	public static String getContainingClassName(LocalClassAssociation e) {
		Class containingClass = getContainingClass(e);
		if (containingClass != null) {
			return containingClass.getName();
		}
		return "Unknown Container"; //$NON-NLS-1$
	}
	
	/**
	 * If eOpposite relation is containment, the current reference must have upper bound equal to 1.
	 * @param reference
	 * @param opposite
	 * @return true if relation respect the description above or they are simple references
	 */
	public static boolean hasSingleContainer(LocalClassAssociation reference, LocalClassAssociation opposite){
		if (reference.getOpposite() != null && reference.getOpposite() == opposite){
			boolean containment = opposite.getType().equals(Association_Types.CONTAINMENT);
			if (!containment) {
				//The opposite is simple reference, check if reference is simple
				boolean refIsContainment = reference.getType().equals(Association_Types.CONTAINMENT);
				if (!refIsContainment) {
					return true;
				}
			}
			boolean isOne = reference.getCardinality().equals(Cardinalities.NOTHING_OR_ONE) || reference.getCardinality().equals(Cardinalities.ONLY_ONE);
			return containment && isOne;
		}
		return true;
	}

}
