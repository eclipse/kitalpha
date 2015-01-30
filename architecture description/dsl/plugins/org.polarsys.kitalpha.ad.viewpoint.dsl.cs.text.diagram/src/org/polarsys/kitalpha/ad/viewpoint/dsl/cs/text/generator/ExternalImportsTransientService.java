/*******************************************************************************	
 * Copyright (c) 2014 Thales Global Services S.A.S.	
 * All rights reserved. This program and the accompanying materials	
 * are made available under the terms of the Eclipse Public License v1.0	
 * which accompanies this distribution, and is available at	
 * http://www.eclipse.org/legal/epl-v10.html	
 * 	
 * Contributors:	
 * Thales Global Services S.A.S - initial API and implementation	
 ******************************************************************************/	

package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.generator;	

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;	
import org.eclipse.emf.ecore.EStructuralFeature;	
import org.eclipse.xtext.parsetree.reconstr.impl.DefaultTransientValueService;	
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ViewpointElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Create;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Diagram;	
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramSet;	
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage;	
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.scoping.VpDiagramHelper;

/**
 * 
 * @author Faycal Abka
 *
 */
public class ExternalImportsTransientService extends DefaultTransientValueService {	

	
	private static final Integer diagramTransient_features[] = {
		VpdiagramPackage.ABSTRACT_EDGE__ID,
		VpdiagramPackage.ACTION__ID,
		VpdiagramPackage.BORDERED_NODE__ID,
		VpdiagramPackage.CONTAINER__ID,
		VpdiagramPackage.CREATE__ID,
		VpdiagramPackage.DELETE__ID,
		VpdiagramPackage.DIAGRAM__ID,
		VpdiagramPackage.DIAGRAM_CHILDREN__ID,
		VpdiagramPackage.DIAGRAM_ELEMENT__ID,
		VpdiagramPackage.DIAGRAM_EXTENSION__ID,
		VpdiagramPackage.DIAGRAM_REPRESENTATION__ID,
		VpdiagramPackage.DIAGRAM_SET__ID,
		VpdiagramPackage.DROP__ID,
		VpdiagramPackage.EDGE__ID,
		VpdiagramPackage.EDGE_IMPORT__ID,
		VpdiagramPackage.NODE__ID,
		VpdiagramPackage.OPEN_ACTION__ID,
		VpdiagramPackage.RECONNECT_EDGE__ID,
	};
	
	private static final Integer diagramTransient_desc_features[] = {
		VpdiagramPackage.ABSTRACT_EDGE__DESCRIPTION,
		VpdiagramPackage.ACTION__DESCRIPTION,
		VpdiagramPackage.BORDERED_NODE__DESCRIPTION,
		VpdiagramPackage.CONTAINER__DESCRIPTION,
		VpdiagramPackage.CREATE__DESCRIPTION,
		VpdiagramPackage.DELETE__DESCRIPTION,
		VpdiagramPackage.DIAGRAM_CHILDREN__DESCRIPTION,
		VpdiagramPackage.DIAGRAM_ELEMENT__DESCRIPTION,
		VpdiagramPackage.DIAGRAM_EXTENSION__DESCRIPTION,
		VpdiagramPackage.DIAGRAM_REPRESENTATION__DESCRIPTION,
		VpdiagramPackage.DIAGRAM_SET__DESCRIPTION,
		VpdiagramPackage.DROP__DESCRIPTION,
		VpdiagramPackage.EDGE__DESCRIPTION,
		VpdiagramPackage.EDGE_IMPORT__DESCRIPTION,
		VpdiagramPackage.NODE__DESCRIPTION,
		VpdiagramPackage.OPEN_ACTION__DESCRIPTION,
		VpdiagramPackage.RECONNECT_EDGE__DESCRIPTION,
	};
	
	
	@Override	
	public boolean isTransient(EObject owner, EStructuralFeature feature, int index) {
		
//		if (!(owner instanceof Diagram) && 
//				Arrays.asList(diagramTransient_desc_features).contains(feature.getFeatureID()))
//			return true;
//		
//		
//		if (owner instanceof Create && 
//				check_id(VpdiagramPackage.CREATE__DESCRIPTION, feature))
//			return true;
//		
//		if (owner instanceof Create && 
//				check_id(VpdiagramPackage.NODE__DESCRIPTION, feature))
//			return true;
//		
//		if (owner instanceof ViewpointElement &&
//				Arrays.asList(diagramTransient_features).contains(feature.getFeatureID()))
//			return true;
		
		if (owner instanceof DiagramSet &&	
				check_id(VpdiagramPackage.DIAGRAM_SET__ADDITIONAL_EXTERNAL_DATA, feature)){	
			return true;	
		}
		
		if (owner instanceof DiagramSet &&
				check_id(VpdiagramPackage.DIAGRAM_SET__ADDITIONAL_EXTERNAL_GROUP, feature)){	
			return true;	
		}
		
//		if (owner instanceof DiagramSet &&	
//				check_id(VpdiagramPackage.DIAGRAM_SET__ID, feature)){
//			return true;	
//		}	
//
//		if (owner instanceof DiagramSet &&	
//				check_id(VpdiagramPackage.DIAGRAM_SET__DESCRIPTION, feature)){	
//			return true;	
//		}
//
//		if (owner instanceof Diagram &&	
//				check_id(VpdiagramPackage.DIAGRAM__ID, feature)){
//			return true;
//		}
	
		return super.isTransient(owner, feature, index);
	}	

	private boolean check_id(int id, EStructuralFeature feature){	
		return id == feature.getFeatureID();	
	}	
} 