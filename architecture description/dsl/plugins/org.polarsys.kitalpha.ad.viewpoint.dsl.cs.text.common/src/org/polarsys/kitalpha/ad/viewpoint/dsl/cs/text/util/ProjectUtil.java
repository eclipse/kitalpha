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
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * 
 * Hold misc utility of management of project or object created
 * in the project
 * @author Faycal Abka
 *
 */
public class ProjectUtil {
	
	
	/**
	 * 
	 * @param e1
	 * @param e2
	 * @return true if the e1 and e2 are defined in the same project
	 */
	public static boolean areInSameProject(EObject e1, EObject e2){
		URI uri1 = EcoreUtil.getURI(e1);
		URI uri2 = EcoreUtil.getURI(e2);
		
		String project1 = uri1.segment(1);
		String project2 = uri2.segment(1);
		
		return project1.equalsIgnoreCase(project2);
	}

}
