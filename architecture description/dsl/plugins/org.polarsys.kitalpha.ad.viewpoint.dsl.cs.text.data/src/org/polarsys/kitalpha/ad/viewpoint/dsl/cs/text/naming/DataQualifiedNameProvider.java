/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.naming;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.identifiers.MetamodelIDs;


/**
 * 
 * @author Amine Lajmi
 *
 */
public class DataQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
	
	@Override
	protected QualifiedName qualifiedName(Object obj){
		if (obj instanceof EDataType) {
			if(((EDataType) obj).getEPackage().getNsURI().equals(MetamodelIDs.ECORE)) {
				final String qualifiedName= getResolver().apply((EObject)obj);
				if (qualifiedName == null) {
					return null;
				}
				return QualifiedName.create(qualifiedName);
			}
		}
		return null;
	}

}
