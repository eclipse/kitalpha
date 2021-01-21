/*******************************************************************************
 * Copyright (c) 2017, 2020 Thales Global Services.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.predicate.factories;

import org.polarsys.kitalpha.ad.viewpoint.predicate.interfaces.TransitionFactory;
import org.polarsys.kitalpha.ad.viewpoint.predicate.internal.engine.impl.DefaultFactory;

/**
 * Provider for Transition Factory.
 * This implementation return a default factory for creating transitions and engines
 * 
 * @author Faycal Abka
 *
 */
public class FactoryProvider {
	
	public static TransitionFactory getTransitionFactory(){
		return DefaultFactory.INSTANCE;
	}

}
