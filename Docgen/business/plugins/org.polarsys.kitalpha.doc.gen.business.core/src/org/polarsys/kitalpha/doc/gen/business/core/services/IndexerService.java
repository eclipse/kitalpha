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
package org.polarsys.kitalpha.doc.gen.business.core.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class IndexerService {

	public static IndexerService INSTANCE = new IndexerService();
	private List<String> elementsToIndex = new ArrayList<String>();

	private IndexerService() {

	}

	public List<String> getElements() {
		return elementsToIndex;
	}

	public List<String> getSortedElements() {
		Collections.sort(elementsToIndex, new IndexerComparator());
		return elementsToIndex;
	}
	
	public boolean checkConceptExistence(String concept){
		for (String iConcept : elementsToIndex) 
		{
			if (iConcept.toUpperCase().equals(concept.toUpperCase()))
				return true;
		}
		return false;
	}

	private class IndexerComparator implements Comparator<String> {

		public int compare(String arg0, String arg1) {
			return arg0.compareTo(arg1);

		}

	}

}
