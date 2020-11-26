/*******************************************************************************	
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.	
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0	
 * 	
 * Contributors:	
 * Thales Global Services S.A.S - initial API and implementation	
 ******************************************************************************/	

package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.generator;	

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.parsetree.reconstr.impl.DefaultTransientValueService;
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
		
	
		return super.isTransient(owner, feature, index);
	}	

	private boolean check_id(int id, EStructuralFeature feature){	
		return id == feature.getFeatureID();	
	}	
} 