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

package org.polarsys.kitalpha.ad.af.dsl.generation.desc.graph;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;

/**
 * @author Boubekeur Zendagui
 */

public class GenerationNode{
	
	private Viewpoint _viewpoint = null;
	
	public GenerationNode(Viewpoint viewpoint) {
		_viewpoint = viewpoint;
	}
	
	public String getName(){
		return  getViewpoint().getName();
	}
	public Viewpoint getViewpoint() {
		return _viewpoint;
	}
}
