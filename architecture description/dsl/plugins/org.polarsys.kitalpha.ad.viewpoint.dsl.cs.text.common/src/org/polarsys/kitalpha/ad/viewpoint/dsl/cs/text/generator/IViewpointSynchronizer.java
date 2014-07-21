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

package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.generator;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.generator.IGenerator;

/**
 * 
 * @author Amine Lajmi
 *
 */
public interface IViewpointSynchronizer extends IGenerator {

	/**
	 * Synchronize with standalone viewpoint description model
	 * 
	 * @param input: a list of interdependent textual models
	 * @param target: the standalone model to synchronize with
	 * @return the target updated standalone model
	 */
	public EObject synchronize(List<EObject> input, EObject target);
}
