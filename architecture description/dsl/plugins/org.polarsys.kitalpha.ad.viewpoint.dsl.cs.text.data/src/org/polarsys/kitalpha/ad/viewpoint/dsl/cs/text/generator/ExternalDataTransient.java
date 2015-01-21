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
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.generator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.parsetree.reconstr.impl.DefaultTransientValueService;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractFeature;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Data;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Enumeration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Value;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.VpdescPackage;

/**
 * 
 * @author Faycal ABKA
 *
 */
public class ExternalDataTransient extends DefaultTransientValueService {
	
	@Override
	public boolean isTransient(EObject owner, EStructuralFeature feature, int index) {
		if (owner instanceof Data &&
				check_id(VpdescPackage.DATA__ADDITIONAL_EXTERNAL_DATA, feature))
			return true;
		if (owner instanceof Value && 
				check_id(VpdescPackage.VALUE__NAME, feature))
			return true;
		
		if (owner instanceof Enumeration &&
				check_id(VpdescPackage.ENUMERATION__ID, feature))
			return true;
			
		if (owner instanceof Enumeration &&
				check_id(VpdescPackage.ENUMERATION__DESCRIPTION, feature))
			return true;
		
		if (owner instanceof AbstractFeature &&
				((check_id(VpdescPackage.ATTRIBUTE__CHANGEABLE, feature)) ||
				(check_id(VpdescPackage.ATTRIBUTE__ORDERED, feature)) ||
				(check_id(VpdescPackage.ATTRIBUTE__UNIQUE, feature)))){
			return false;
		}
		
		return super.isTransient(owner, feature, index);
	}
	
	private boolean check_id(int id, EStructuralFeature feature){
		return id == feature.getFeatureID();
	}
}
