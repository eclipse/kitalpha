/*******************************************************************************
 * Copyright (c) 2017 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.scoping;

import org.eclipse.emf.common.util.EList;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractSuperClass;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.LocalSuperClass;

/**
 * 
 * @author Faycal ABKA
 *
 */
public class DataSpecificationHelper {
	
	/**
	 * Check if c1 is super type of c2
	 * @param c1
	 * @param c2
	 * @return
	 */
	public static boolean isSupertype(Class c1, Class c2){
		
		if (c1 == c2){
			return true;
		}
		
		EList<AbstractSuperClass> inheritences = c2.getInheritences();

		if (!inheritences.isEmpty()){
			for (AbstractSuperClass c : inheritences) {
				if (c instanceof LocalSuperClass){
					return isSupertype(c1, ((LocalSuperClass) c).getSuperClass());
				}
			}
		}
		return false;
	}

}
