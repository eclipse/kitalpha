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
package org.polarsys.kitalpha.ad.viewpoint.predicate.tests.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.polarsys.kitalpha.ad.viewpoint.predicate.exceptions.EvaluationException;
import org.polarsys.kitalpha.ad.viewpoint.predicate.factories.FactoryProvider;
import org.polarsys.kitalpha.ad.viewpoint.predicate.interfaces.Action;
import org.polarsys.kitalpha.ad.viewpoint.predicate.interfaces.Context;
import org.polarsys.kitalpha.ad.viewpoint.predicate.interfaces.ContextProvider;
import org.polarsys.kitalpha.ad.viewpoint.predicate.interfaces.Predicate;
import org.polarsys.kitalpha.ad.viewpoint.predicate.interfaces.Transition;
import org.polarsys.kitalpha.ad.viewpoint.predicate.interfaces.TransitionEngine;

public class TransitionEngineAPI {
	
	private Transition transition = null;
	private Transition transitionPredicateException = null;
	
	private TransitionEngine engine = null;
	private TransitionEngine engineException = null;
	
	private boolean booleanValue = false;
	
	private Map<String, Predicate> predicates = new HashMap<>();
	private Map<String, Predicate> predicatesException = new HashMap<>();
	
	private Action reverseBoolean = c -> booleanValue = !booleanValue;
	private Predicate isTrue = c -> booleanValue == true;
	private Predicate throwExceptionFromPredicate = c -> {throw new RuntimeException("Exeception");};
	private Action throwExceptionFromAction = c -> {throw new RuntimeException("Exeception");};
	
	@Before
	public void setup(){
		booleanValue = true;
		predicates.put("isTrue", isTrue);
		predicatesException.put("exception", throwExceptionFromPredicate);
		transition  = FactoryProvider.getTransitionFactory().createTransition("", "", reverseBoolean, predicates);
		transitionPredicateException = FactoryProvider.getTransitionFactory().createTransition("", "", throwExceptionFromAction, predicatesException);
		engine = FactoryProvider.getTransitionFactory().createTransitionEngine(transition, new ContextProvider() {
			@Override
			public Context getContext() {
				return Context.EMPTY_CONTEXT;
			}
		});
		engineException = FactoryProvider.getTransitionFactory().createTransitionEngine(transitionPredicateException, new ContextProvider() {
			@Override
			public Context getContext() {
				return Context.EMPTY_CONTEXT;
			}
		});
	}

	@Test
	public void testGetTransition(){
		Transition transition = engine.getTransition();
		assertNotNull(transition);
		assertEquals(transition, transition);
	}
	
	@Test
	public void testEval() throws EvaluationException {
		boolean eval = engine.eval();
		assertEquals(true, eval);
		
	}
	
	@Test
	public void testRun() throws EvaluationException {
		boolean run = engine.run();
		assertEquals(true, run);
		assertEquals(false, booleanValue);
	}
	
	@Test
	public void testThrowExceptionFromPredicate(){
		try {
			engineException.eval();
			fail("Expected a EvaluationException to be thrown");
		} catch (EvaluationException e) {
			//Do nothing
		}
	}
	
	@Test
	public void testThrowExceptionFromAction(){
		try {
			engineException.run();
			fail("Expected a EvaluationException to be thrown");
		} catch (EvaluationException e) {
			//Do nothing
		}
	}
	
	@After
	public void tearDown(){
		engine = null;
		engineException = null;
		transition = null;
		transitionPredicateException = null;
	}

}
