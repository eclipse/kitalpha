/*******************************************************************************
 * Copyright (c) 2017 Thales Global Services.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.predicate.tests.junit;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.polarsys.kitalpha.ad.viewpoint.predicate.factories.FactoryProvider;
import org.polarsys.kitalpha.ad.viewpoint.predicate.interfaces.Transition;

/**
 * Check if the contribution form extension point are well readed from
 * Transition Engine API
 * 
 * @author Faycal Abka
 *
 */
public class ExtensionManagerTests {
	
	private final String viewpointID = "No.id.for.viewpoint";
	private final String actionID = "org.polarsys.kitalpha.ad.viewpoint.predicate.tests.junit.check.manager.action";
	private final String predicateID = "org.polarsys.kitalpha.ad.viewpoint.predicate.tests.junit.check.manager.predicate";

	@Test
	public void testTransitionCreation() {
		Transition transition = FactoryProvider.getTransitionFactory().createTransition(viewpointID, actionID);
		assertNotNull(transition);
		assertNotNull(transition.getAction());
		assertTrue(transition.getPredicates().size() == 1);
		assertTrue(transition.getViewpointID().equals(viewpointID));
		assertTrue(transition.getActionID().equals(actionID));
		assertTrue(transition.getPredicates().keySet().iterator().next().equals(predicateID));
	}
}
