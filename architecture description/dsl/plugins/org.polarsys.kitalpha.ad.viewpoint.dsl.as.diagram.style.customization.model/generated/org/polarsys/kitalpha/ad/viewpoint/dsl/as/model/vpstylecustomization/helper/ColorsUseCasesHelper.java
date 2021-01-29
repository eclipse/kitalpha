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

import org.eclipse.sirius.diagram.description.style.DotDescription;
import org.eclipse.sirius.diagram.description.style.EdgeStyleDescription;
import org.eclipse.sirius.diagram.description.style.FlatContainerStyleDescription;
import org.eclipse.sirius.diagram.description.style.GaugeCompositeStyleDescription;
import org.eclipse.sirius.diagram.description.style.GaugeSectionDescription;
import org.eclipse.sirius.diagram.description.style.WorkspaceImageDescription;
import org.eclipse.sirius.viewpoint.description.style.StyleDescription;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ColorCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ColorUseCase;

/**
 * @author Boubekeur Zendagui
 */
public class ColorsUseCasesHelper {

	public static boolean acceptColor(ColorCustomization colorCustomization, Object candidate_value) {
		ColorUseCase propertyName = colorCustomization.getColorUseCase();
		switch (propertyName) {
			case BORDER:
				return candidate_value instanceof StyleDescription && false == candidate_value instanceof EdgeStyleDescription;
	
			case BACKGROUND:
				return candidate_value instanceof FlatContainerStyleDescription
						|| candidate_value instanceof GaugeSectionDescription
						|| candidate_value instanceof DotDescription;
	
			case COLOR:
				return candidate_value instanceof StyleDescription
						&& false == candidate_value instanceof FlatContainerStyleDescription
						&& false == candidate_value instanceof GaugeSectionDescription
						&& false == candidate_value instanceof GaugeCompositeStyleDescription
						&& false == candidate_value instanceof WorkspaceImageDescription
						&& false == candidate_value instanceof DotDescription;
	
			case FOREGROUND:
				return candidate_value instanceof FlatContainerStyleDescription || candidate_value instanceof GaugeSectionDescription;
		}

		return false;
	}
}
