/*******************************************************************************
 * Copyright (c) 2016, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.launcher.precondition;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;

/**
 * @author Boubekeur Zendagui
 */
public interface IViewpointGenerationPrecondition {
	/**
	 * The precondition implementation
	 * @param viewpoint the {@link Viewpoint} under generation
	 * @return True if the precondition is validated, False otherwise.
	 */
	boolean canGenerate(Viewpoint viewpoint);
	
}
