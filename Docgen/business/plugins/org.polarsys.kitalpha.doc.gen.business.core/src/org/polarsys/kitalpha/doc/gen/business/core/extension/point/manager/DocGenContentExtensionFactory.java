/*******************************************************************************
 * Copyright (c) 2016 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.doc.gen.business.core.extension.point.manager;

/**
 * Internal factory to create a manger of extension point which allows to contribute to DocGen
 * @author Faycal Abka
 *
 */
public class DocGenContentExtensionFactory {
	
	/**
	 * @return a new Content Extension Manager
	 */
	public static DocGenContentExtensionManager newDocGenContentExtensionManager(){
		return new DocGenContentExtensionManager();
	}
	
}
