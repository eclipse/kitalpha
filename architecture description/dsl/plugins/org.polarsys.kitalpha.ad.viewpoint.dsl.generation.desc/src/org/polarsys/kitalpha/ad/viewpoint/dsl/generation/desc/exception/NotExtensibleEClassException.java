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

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.desc.exception;

import org.eclipse.emf.ecore.EClass;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.common.log.ViewpointDslLogger;

/**
 * @author Boubekeur Zendagui
 */

public class NotExtensibleEClassException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public NotExtensibleEClassException(Class curClass, EClass targetClazz, String vpShortName) {
		// TODO: add in the message the Package URI.
		boolean wasLoggerActivated = true;
		if (! ViewpointDslLogger.isActivated())
		{
			ViewpointDslLogger.setActivated(true);
			wasLoggerActivated = false;
		}

		ViewpointDslLogger.doLogError("The EClass " + targetClazz.getName() +
				"["+targetClazz.getEPackage().getName()+ ", "+
				targetClazz.getEPackage().getNsURI() +"] " +
				"is not defined as extensible. \n" +
				"Extension defined by " + curClass.getName() +" in "+ vpShortName +" viewpoint specification");
		
		if (! wasLoggerActivated){
			ViewpointDslLogger.setActivated(false);
		}
	}

}
