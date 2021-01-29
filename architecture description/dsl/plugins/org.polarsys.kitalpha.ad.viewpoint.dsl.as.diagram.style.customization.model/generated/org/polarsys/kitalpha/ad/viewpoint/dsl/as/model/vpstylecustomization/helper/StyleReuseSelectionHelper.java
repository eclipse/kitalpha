/*******************************************************************************
 * Copyright (c) 2015, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.helper;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.internal.query.EAttributeCustomizationQuery;
import org.eclipse.sirius.business.internal.query.EReferenceCustomizationQuery;
import org.eclipse.sirius.viewpoint.description.EAttributeCustomization;
import org.eclipse.sirius.viewpoint.description.EReferenceCustomization;
import org.eclipse.sirius.viewpoint.description.EStructuralFeatureCustomization;
import org.eclipse.sirius.viewpoint.description.style.StyleDescription;

/**
 * @author Boubekeur Zendagui
 */
@SuppressWarnings("restriction")
public class StyleReuseSelectionHelper {

	public static boolean isStylableElement(EObject candidateStyle){
		return candidateStyle instanceof StyleDescription || candidateStyle.eContainer() instanceof StyleDescription;
	}
	
    public static boolean isStyleConformTo(EObject candidateStyle, EList<EStructuralFeatureCustomization> candidateCustomization) {
    	for (EStructuralFeatureCustomization featureCustomization : candidateCustomization) 
    	{
    		if (featureCustomization instanceof EAttributeCustomization) 
			{
				final boolean conformance = checkEAttributeCustomizationCoformance((EAttributeCustomization) featureCustomization, candidateStyle);
				if (! conformance) 
					return false;
			} 
			
			if (featureCustomization instanceof EReferenceCustomization) 
			{
				final boolean conformance = checkEReferenceCustomizationCoformance((EReferenceCustomization) featureCustomization, candidateStyle);
				if (! conformance) 
					return false;
			}
			
    	}
    	return true;
    }
	
	/**
	 * Check if a Style customization can be applied on the all elements of the candidateList list.
	 * @param eStructuralFeatureCustomization
	 * @param candidateStyles
	 * @return
	 */
	public static boolean isCustomizationApplicableOn(EStructuralFeatureCustomization candidateCustomization, EList<EObject> candidateStyles) {
		for (EObject eObject : candidateStyles) 
		{
			if (eObject instanceof StyleDescription || eObject.eContainer() instanceof StyleDescription) 
			{
				if (candidateCustomization instanceof EAttributeCustomization) 
				{
					final boolean conformance = checkEAttributeCustomizationCoformance((EAttributeCustomization) candidateCustomization, eObject);
					if (! conformance) 
						return false;
				} 
				
				if (candidateCustomization instanceof EReferenceCustomization) 
				{
					final boolean conformance = checkEReferenceCustomizationCoformance((EReferenceCustomization) candidateCustomization, eObject);
					if (! conformance) 
						return false;
				}
			}
		}
		return true;
	}
	
	private static boolean checkEReferenceCustomizationCoformance(EReferenceCustomization customization, EObject style){
		EReferenceCustomizationQuery eReferenceCustomizationQuery = new EReferenceCustomizationQuery(customization);
		return eReferenceCustomizationQuery.isStyleDescriptionEltConformToEReferenceCustomization(style);
	}
	
	private static boolean checkEAttributeCustomizationCoformance(EAttributeCustomization customization, EObject style){
		EAttributeCustomizationQuery eAttributeCustomizationQuery = new EAttributeCustomizationQuery(customization);
		return eAttributeCustomizationQuery.isStyleDescriptionEltConformToEAttributeCustomization(style);
	}
}
