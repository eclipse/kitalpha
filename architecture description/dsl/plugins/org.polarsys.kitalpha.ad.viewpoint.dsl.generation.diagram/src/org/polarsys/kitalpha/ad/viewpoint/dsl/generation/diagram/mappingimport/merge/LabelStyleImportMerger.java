/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.mappingimport.merge;

import org.eclipse.sirius.viewpoint.description.style.LabelStyleDescription;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.AbstractDescription;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Label;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage;

/**
 * @author Boubekeur Zendagui
 */
public abstract class LabelStyleImportMerger {
	
	/**
	 * Merge generated label style data with imported mapping label style data
	 * @param originalLabel
	 * @param generatedLabel
	 * @param viewpointDescription
	 * @return
	 */
	public static LabelStyleDescription mergeLabelStyle(LabelStyleDescription originalLabel, 
												 LabelStyleDescription generatedLabel,
												 AbstractDescription viewpointDescription){
		if (originalLabel == null && generatedLabel != null)
			return generatedLabel;
		
		LabelStyleDescription result = generatedLabel;
		
		/* Merge the generated Label Description Style Properties */
		result = mergeGeneratedLabelStyleData(originalLabel, generatedLabel, viewpointDescription);

		/* Merge all no generated Label Description Style Properties */
		result = mergeNoGeneratedLabelStyleData(originalLabel, result);

		return result;
	}

	/**
	 * Merge generated Label Style Data
	 * @param originalLabel
	 * @param generatedLabel
	 * @param viewpointDescription
	 * @return
	 */
	protected static LabelStyleDescription mergeGeneratedLabelStyleData(LabelStyleDescription originalLabel, 
														    LabelStyleDescription generatedLabel,
														    AbstractDescription viewpointDescription){
		LabelStyleDescription result = generatedLabel;
		final Label label = viewpointDescription.getNode_Label();
		// Label Format
		if (label == null || ! (label.eIsSet(VpdiagramPackage.eINSTANCE.getLabel_Bold()) && 
			   label.eIsSet(VpdiagramPackage.eINSTANCE.getLabel_Italic())))
		{
			result.setLabelFormat(originalLabel.getLabelFormat());
		}

		// Label Size
		if (label == null || ! label.eIsSet(VpdiagramPackage.eINSTANCE.getLabel_Color()))
			result.setLabelSize(originalLabel.getLabelSize());
		
		// Label Color
		if (label == null || ! label.eIsSet(VpdiagramPackage.eINSTANCE.getLabel_Size()) )
			result.setLabelColor(originalLabel.getLabelColor());
		
		// Label Expression
		if (label == null || ! label.eIsSet(VpdiagramPackage.eINSTANCE.getLabel_Value()))
			result.setLabelExpression(originalLabel.getLabelExpression());
		
		return result;
	}
	

	/**
	 * Merge no generated Label Style Data
	 * @param originalLabel
	 * @param generatedLabel
	 * @return
	 */
	protected static LabelStyleDescription mergeNoGeneratedLabelStyleData(LabelStyleDescription originalLabel, 
														      LabelStyleDescription generatedLabel){
		LabelStyleDescription result = generatedLabel;
		result.setShowIcon(generatedLabel.isShowIcon());
		result.setIconPath(generatedLabel.getIconPath());
		return result;
	}
}
