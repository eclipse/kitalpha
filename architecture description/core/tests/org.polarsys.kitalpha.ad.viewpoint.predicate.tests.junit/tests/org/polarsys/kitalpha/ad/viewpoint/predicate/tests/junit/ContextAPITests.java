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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.polarsys.kitalpha.ad.viewpoint.predicate.exceptions.ValueNotFoundException;
import org.polarsys.kitalpha.ad.viewpoint.predicate.interfaces.Context;
import org.polarsys.kitalpha.ad.viewpoint.predicate.interfaces.ContextProvider;

/**
 * 
 * @author Faycal Abka
 *
 */
public class ContextAPITests {
	
	
	private ContextProvider provider = new ContextProvider() {
		
		@Override
		public Context getContext() {
			return new Context() {
				
				@Override
				protected void initializeContext() {
					add("varTest", "Unique Value");
				}
			};
		}
	};
	
	@Test
	public void testGetValideValue() throws ValueNotFoundException{
		Context newInstance = provider.getContext();
		Object value = newInstance.getValue("varTest");
		assertNotNull(value);
		assertEquals("Unique Value", value);
	}

	@Test
	public void testGetNoteValideValue(){
		Context newInstance = provider.getContext();
		try {
			newInstance.getValue("notDound");
			fail("A ValueNotFoundException should be thrown");
		} catch (ValueNotFoundException e) {
			//do nothing
		}
	}

}
