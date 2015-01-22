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

import org.eclipse.emf.ecore.EObject;	
import org.eclipse.emf.ecore.EStructuralFeature;	
import org.eclipse.xtext.parsetree.reconstr.impl.DefaultTransientValueService;	
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Diagram;	
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramExtension;	
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramSet;	
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage;	

/**
 * 
 * @author Faycal Abka
 *
 */
public class ExternalImportsTransientService extends DefaultTransientValueService {	

	@Override	
	public boolean isTransient(EObject owner, EStructuralFeature feature, int index) {	
		if (owner instanceof DiagramSet &&	
				check_id(VpdiagramPackage.DIAGRAM_SET__ADDITIONAL_EXTERNAL_DATA, feature)){	
			return true;	
		}	

		if (owner instanceof DiagramSet &&
				check_id(VpdiagramPackage.DIAGRAM_SET__ADDITIONAL_EXTERNAL_GROUP, feature)){	
			return true;	
		}	

		if (owner instanceof DiagramSet &&	
				check_id(VpdiagramPackage.DIAGRAM_SET__ID, feature)){
			return true;	
		}	

		if (owner instanceof DiagramSet &&	
				check_id(VpdiagramPackage.DIAGRAM_SET__DESCRIPTION, feature)){	
			return true;	
		}

		if (owner instanceof Diagram &&	
				check_id(VpdiagramPackage.DIAGRAM__ID, feature)){
			return true;
		}	

		if (owner instanceof DiagramExtension &&
				check_id(VpdiagramPackage.DIAGRAM_EXTENSION__ID, feature)){	
			return true;
		}
		
		if (owner instanceof DiagramExtension &&
				check_id(VpdiagramPackage.DIAGRAM_EXTENSION__DESCRIPTION, feature)){	
			return true;
		}

		return false;
	}	

	private boolean check_id(int id, EStructuralFeature feature){	
		return id == feature.getFeatureID();	
	}	
} 