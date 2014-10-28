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

import org.eclipse.sirius.diagram.description.style.ContainerStyleDescription;
import org.eclipse.sirius.diagram.description.style.FlatContainerStyleDescription;
import org.eclipse.sirius.diagram.description.style.WorkspaceImageDescription;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.ContainerDescription;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.FlatStyle;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.ImageStyle;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage;

/**
 * @author Boubekeur Zendagui
 */
public class ContainerStyleImportMerger extends LabelStyleImportMerger {

	public static ContainerStyleDescription mergeStyles(ContainerStyleDescription originalStyle, 
												 ContainerStyleDescription generatedStyle,
												 ContainerDescription viewpointContainerDescription){
		/* Imported container has either no style or contains only ConditionalStyles */
		if (originalStyle == null && generatedStyle != null)
			return generatedStyle;
		
		/* No style defined for the imported container */
		if (generatedStyle == null)
			return null;
		
		ContainerStyleDescription result = generatedStyle;
		
		/* Merge Label style data*/
		result = (ContainerStyleDescription) mergeLabelStyle(originalStyle, result, viewpointContainerDescription);
		
		/* Merge generated style data */
		result = mergeGeneratedStyleData(originalStyle, result, viewpointContainerDescription);
		
		/* Import all NO generated data */ 
		result = mergeNoGeneratedStyleData(originalStyle, result);
		
		return result;
	}
	
	/**
	 * 
	 * @param originalStyle
	 * @param generatedStyle
	 * @param viewpointContainerDescription
	 * @return
	 */
	protected static ContainerStyleDescription mergeGeneratedStyleData(ContainerStyleDescription originalStyle, 
															 ContainerStyleDescription generatedStyle,
															 ContainerDescription viewpointContainerDescription){
		ContainerStyleDescription result = generatedStyle;
		/* Handle Flat Style*/
		if (originalStyle instanceof FlatContainerStyleDescription && result instanceof FlatContainerStyleDescription)
		{
			result = generatedFlatstyleData((FlatContainerStyleDescription) originalStyle, 
									 (FlatContainerStyleDescription) generatedStyle, 
									 (FlatStyle) viewpointContainerDescription.getStyle());
		}
		
		/* Handle Image Syle*/
		if (originalStyle instanceof WorkspaceImageDescription && result instanceof WorkspaceImageDescription)
		{
			result = generatedWorkspaceImageData((WorkspaceImageDescription) originalStyle, 
									 (WorkspaceImageDescription) generatedStyle, 
									 (ImageStyle) viewpointContainerDescription.getStyle());
		}
		
		return result;
	}
	
	/**
	 * 
	 * @param originalStyle
	 * @param generatedStyle
	 * @param viewpointContainerDescription
	 * @return
	 */
	private static final ContainerStyleDescription generatedWorkspaceImageData(WorkspaceImageDescription originalStyle, 
																			   WorkspaceImageDescription generatedStyle,
																			   ImageStyle viewpointContainerDescription){
		WorkspaceImageDescription result = generatedStyle;
		
		if (! viewpointContainerDescription.eIsSet(VpdiagramPackage.eINSTANCE.getAbstractNodeStyle_BorderColor()))
			result.setBorderColor(originalStyle.getBorderColor());
		
		if (! viewpointContainerDescription.eIsSet(VpdiagramPackage.eINSTANCE.getImageStyle_ImagePath()))
			result.setWorkspacePath(originalStyle.getWorkspacePath());
		
		return result;
	}
	
	/**
	 * Manage Generated Container Flat Style data 
	 * @param originalStyle
	 * @param generatedStyle
	 * @param viewpointContainerDescription
	 * @return
	 */
	private static final ContainerStyleDescription generatedFlatstyleData(FlatContainerStyleDescription originalStyle, 
																   FlatContainerStyleDescription generatedStyle,
																   FlatStyle viewpointContainerDescription){
		FlatContainerStyleDescription result = generatedStyle;
		
		if (! viewpointContainerDescription.eIsSet(VpdiagramPackage.eINSTANCE.getFlatStyle_BackgroundColor()))
			result.setBackgroundColor(originalStyle.getBackgroundColor());
		
		if (! viewpointContainerDescription.eIsSet(VpdiagramPackage.eINSTANCE.getFlatStyle_BackgroundStyle()))
			result.setBackgroundStyle(originalStyle.getBackgroundStyle());
		
		if (! viewpointContainerDescription.eIsSet(VpdiagramPackage.eINSTANCE.getFlatStyle_ForgroundColor()))
			result.setForegroundColor(originalStyle.getForegroundColor());
		
		if (! viewpointContainerDescription.eIsSet(VpdiagramPackage.eINSTANCE.getFlatStyle_BorderColor()))
			result.setBorderColor(originalStyle.getBorderColor());
		
		return result;
	}
	
	/**
	 * 
	 * @param originalStyle
	 * @param generatedStyle
	 * @return
	 */
	private static ContainerStyleDescription mergeNoGeneratedStyleData(ContainerStyleDescription originalStyle, 
																	   ContainerStyleDescription generatedStyle){
		ContainerStyleDescription result = generatedStyle;
		result.setRoundedCorner(originalStyle.isRoundedCorner());
		result.setArcHeight(originalStyle.getArcHeight());
		result.setArcWidth(originalStyle.getArcWidth());
		result.setBorderSizeComputationExpression(originalStyle.getBorderSizeComputationExpression());
		result.setTooltipExpression(originalStyle.getTooltipExpression());
		
		/* Handle Flat Style no generated data */
		if (originalStyle instanceof FlatContainerStyleDescription && result instanceof FlatContainerStyleDescription)
			noGeneratedFlatstyleData((FlatContainerStyleDescription) originalStyle, (FlatContainerStyleDescription) result);
		
		/* Handle Workspace Image no generated Data */
		if (originalStyle instanceof WorkspaceImageDescription && result instanceof WorkspaceImageDescription)
			result = noGeneratedWorkspaceImageData((WorkspaceImageDescription) originalStyle, (WorkspaceImageDescription) generatedStyle);
		
		return result;
	}
	
	/**
	 * 
	 * @param originalStyle
	 * @param generatedStyle
	 * @return
	 */
	private static final ContainerStyleDescription noGeneratedFlatstyleData(FlatContainerStyleDescription originalStyle, 
																			FlatContainerStyleDescription generatedStyle){
		FlatContainerStyleDescription result = generatedStyle;
		result.setWidthComputationExpression(generatedStyle.getWidthComputationExpression());
		result.setHeightComputationExpression(generatedStyle.getHeightComputationExpression());
		return result;
	}
	
	/**
	 * 
	 * @param originalStyle
	 * @param generatedStyle
	 * @return
	 */
	private static final ContainerStyleDescription noGeneratedWorkspaceImageData(WorkspaceImageDescription originalStyle, 
																				 WorkspaceImageDescription generatedStyle){
		WorkspaceImageDescription result = generatedStyle;
		result.setSizeComputationExpression(generatedStyle.getSizeComputationExpression());
		result.setLabelPosition(generatedStyle.getLabelPosition());
		result.setHideLabelByDefault(generatedStyle.isHideLabelByDefault());
		result.setResizeKind(generatedStyle.getResizeKind());
		return result;
	}
}
