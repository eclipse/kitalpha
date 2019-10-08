/*******************************************************************************
 * Copyright (c) 2017 Thales Global Services.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
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
