/*******************************************************************************
 * Copyright (c) 2016, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
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
	 * Hidden constrcutor
	 */
	private DocGenContentExtensionFactory() {
	}
	/**
	 * @return a new Content Extension Manager
	 */
	public static DocGenContentExtensionManager newDocGenContentExtensionManager(){
		return new DocGenContentExtensionManager();
	}
	
}
