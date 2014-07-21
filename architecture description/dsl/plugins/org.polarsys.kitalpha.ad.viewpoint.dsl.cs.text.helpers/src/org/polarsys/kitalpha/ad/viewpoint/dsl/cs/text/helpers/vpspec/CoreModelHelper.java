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

package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.helpers.vpspec;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;

/**
 *  Reworked from {@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.helper.desc.CoreModelHelper} to fit with textual viewpoint dsl.
 * 
 * @author Amine Lajmi
 *
 */
public class CoreModelHelper {

	/**
	 * 
	 * @param object Any model element
	 * @return The Viewpoint Element. It is root model element.
	 */
	public static Viewpoint getDSLViewpoint(Object object){
		if (object instanceof EObject) {
			EObject eObject = (EObject) object;
			EObject rootObject = EcoreUtil.getRootContainer(eObject);
			// First check the root object type. If it is a Viewpoint then return it
			if (rootObject instanceof Viewpoint)
				return (Viewpoint) rootObject;
			else {
				// In this case, we handle a Fragmented resource
				// TODO : case of fragmented resource
			}
		}
		return null;
	}
	
	/**
	 * 
	 * @param object Any model element
	 * @return The Viewpoint Short Name specified in the Viewpoint element.
	 */
	public static String getViewpointShortName(Object object){
		Viewpoint vp;
		if (object instanceof Viewpoint)
			vp = (Viewpoint) object;
		else
			vp = getDSLViewpoint(object);
		
		if (vp != null)
			return vp.getShortName();
		else
			return null;
	}
	
	/**
	 * 
	 * @param object Any model element
	 * @return The Viewpoint Short Name specified in the Viewpoint element.
	 */
	public static String getViewpointName(Object object){
		Viewpoint vp;
		if (object instanceof Viewpoint)
			vp = (Viewpoint) object;
		else
			vp = getDSLViewpoint(object);
		
		if (vp != null)
			return vp.getName();
		else
			return null;
	}
}
