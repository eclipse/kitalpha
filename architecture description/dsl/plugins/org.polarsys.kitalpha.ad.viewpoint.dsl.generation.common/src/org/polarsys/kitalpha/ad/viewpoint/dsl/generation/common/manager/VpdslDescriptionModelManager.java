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

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.common.manager;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;

/**
 * @author Boubekeur Zendagui
 */

public class VpdslDescriptionModelManager {
	
	public static VpdslDescriptionModelManager INSTANCE = new VpdslDescriptionModelManager();
	
	private Viewpoint vpRootModelElement = null;
	
	public void initialize(Viewpoint vpDescription){
		vpRootModelElement = vpDescription;
	}
	
	public Viewpoint getVpDescriptionElement(){
		return vpRootModelElement;
	}

	public void unload(){
		 vpRootModelElement = null;
	}
}
