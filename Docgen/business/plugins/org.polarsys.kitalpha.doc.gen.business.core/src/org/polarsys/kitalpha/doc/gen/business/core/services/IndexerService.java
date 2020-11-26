/*******************************************************************************
 * Copyright (c) 2014, 2019 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.doc.gen.business.core.services;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class IndexerService {

	public static final IndexerService INSTANCE = new IndexerService();
	private Map<String, IndexItem> elementToIndexItems = new HashMap<>(); //Concept name to index item

	private IndexerService() {
		//Do nothing
	}

	public List<String> getElements() {
		return getSortedElements();
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
		List<String> elementsToIndex = getElementsToIndexItems().values().
				parallelStream().map(v -> v.getConceptName()).collect(Collectors.toList());
		Collections.sort(elementsToIndex, new IndexerComparator());
		return elementsToIndex;
	}
	
	public boolean checkConceptExistence(String concept){
		return getElementsToIndexItems().containsKey(concept);
	}
	
	private class IndexerComparator implements Comparator<String> {

		public int compare(String arg0, String arg1) {
			return arg0.compareTo(arg1);
		}
	}

}
