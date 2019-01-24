/*******************************************************************************
 * Copyright (c) 2014, 2019 Thales Global Services S.A.S.
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IndexerService {

	public static final IndexerService INSTANCE = new IndexerService();
	private List<String> elementsToIndex = new ArrayList<>();
	private Map<String, IndexItem> elementToIndexItems = new HashMap<>(); //Concept name to index item

	private IndexerService() {
		//Do nothing
	}

	public List<String> getElements() {
		return elementsToIndex;
	}
	
	public Map<String, IndexItem> getElementsToIndexItems() {
		return elementToIndexItems;
	}
	
	/**
	 * 
	 * @param concept
	 * @return index item for concept. Otherwise null
	 */
	public IndexItem getElement(String concept) {
		if (getElementsToIndexItems().containsKey(concept)) {
			return getElementsToIndexItems().get(concept);
		}
		return null;
	}

	public List<String> getSortedElements() {
		Collections.sort(elementsToIndex, new IndexerComparator());
		return elementsToIndex;
	}
	
	public boolean checkConceptExistence(String concept){
		for (String iConcept : elementsToIndex) {
			if (iConcept.equals(concept))
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
