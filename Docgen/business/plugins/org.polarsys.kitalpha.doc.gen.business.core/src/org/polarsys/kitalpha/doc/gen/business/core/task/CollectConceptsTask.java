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
package org.polarsys.kitalpha.doc.gen.business.core.task;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.egf.ftask.producer.invocation.ITaskProduction;
import org.polarsys.kitalpha.doc.gen.business.core.services.IndexItem;
import org.polarsys.kitalpha.doc.gen.business.core.services.IndexerService;

public class CollectConceptsTask implements ITaskProduction {

	public void preExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
		// No need fot this step
	}

	public void doExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
		List<String> concepts = IndexerService.INSTANCE.getSortedElements();
		Map<String, IndexItem> indexItems = IndexerService.INSTANCE.getElementsToIndexItems();
		
		/*
		 * Sort the map
		 */
		List<Entry<String, IndexItem>> entryList = new LinkedList<>(indexItems.entrySet());
		Collections.sort(entryList, new Comparator<Entry<String, IndexItem>>() {
			
			@Override
			public int compare(Entry<String, IndexItem> a, Entry<String, IndexItem> b) {
				return a.getValue().compareTo(b.getValue());
			}
		});
		
		Map<String, IndexItem> sortedMap = new LinkedHashMap<>();
		
		for (Entry<String, IndexItem> entry : entryList) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		
		/*
		 * Concepts List not used. To delete
		 */
		productionContext.setOutputValue("concepts", concepts);
		
		productionContext.setOutputValue("indexItems", sortedMap);

	}

	public void postExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
		// No need fot this step
	}

}
