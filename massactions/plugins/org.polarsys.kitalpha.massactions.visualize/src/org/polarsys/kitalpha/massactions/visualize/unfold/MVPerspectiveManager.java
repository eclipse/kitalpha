/*******************************************************************************
 * Copyright (c) 2018  Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.massactions.visualize.unfold;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.massactions.core.column.IMAColumn;
import org.polarsys.kitalpha.massactions.core.table.MATable;
import org.polarsys.kitalpha.massactions.core.table.layer.IMAComponent;
import org.polarsys.kitalpha.massactions.core.table.layer.body.IMABodyLayer;
import org.polarsys.kitalpha.massactions.visualize.helpers.UnfoldRowObjectHelper;

/**
 * This class manages the underlying data for the {@link MATable}, which can
 * used data represented in two forms: folded and unfolded.
 * 
 * The folded perspective is the default representation and maps directly to the
 * elements that the user sent to the table.
 *
 * The unfolded perspective transforms the elements into
 * {@link UnfoldedRowObject}.
 * 
 * Since the unfold operation is expensive, this manager tries to reuse as much
 * as possible the already computed data, when a new "unfold" operation is
 * invoked.
 * 
 * @author Sandu Postaru
 * 
 */
public class MVPerspectiveManager implements IMAComponent {

	private static final Log log = LogFactory.getLog(MVPerspectiveManager.class);

	protected IMABodyLayer bodyLayer;

	/**
	 * The current raw folded data. Used when passing from the unfolded to
	 * folded representation. We use this representation for the table data in
	 * order to maintain the same data order as the original one.
	 */
	protected Collection<EObject> rawFoldedData;

	/**
	 * The previous raw folded data. Used when passing from the unfolded to
	 * folded representation.
	 */
	protected Set<EObject> cachedPrevFoldedData;

	/**
	 * The same raw folded data under a set form. Used when computing the new
	 * data that was added. We then compute the new state only for the objects
	 * and reuse the old ones.
	 */
	protected Set<EObject> cachedFoldedData;

	/**
	 * The current raw unfolded data. Computed when passing from the unfolded to
	 * folded representation.
	 */
	protected Collection<EObject> rawUnfoldedData;

	/**
	 * The current cached unfolded data. Used when computing a new unfolded
	 * configuration for an existing object.
	 */
	protected Map<EObject, Collection<EObject>> cachedUnfoldedData;

	/**
	 * Existing raw unfolded data that changed its internal data.
	 */
	protected Set<EObject> dirtyFoldedData;

	/**
	 * The current column list. Used when deciding if a new configuration needs
	 * to be integrally or partially built.
	 */
	protected List<IMAColumn> prevColumnList;

	/**
	 * The current hidden column indexes. Used when deciding if a new
	 * configuration needs to be integrally or partially built.
	 */
	protected Set<Integer> hiddenColumnIndexes;

	/**
	 * The folded state for the manager.
	 */
	protected boolean folded;

	public MVPerspectiveManager(IMABodyLayer bodyLayer) {
		this.bodyLayer = bodyLayer;

		folded = true;

		cachedUnfoldedData = new HashMap<>();
		dirtyFoldedData = new HashSet<>();
		prevColumnList = Collections.emptyList();
		hiddenColumnIndexes = Collections.emptySet();
	}

	public void switchPerspective(List<IMAColumn> columnList) {

		if (folded) {
			unfold(columnList);
		} else {
			fold();
		}
	}

	public void fold() {
		folded = true;
	}

	public void unfold(List<IMAColumn> columnList) {

		// new hidden column indexes
		Set<Integer> prevHiddenColumnIndexes = hiddenColumnIndexes;
		hiddenColumnIndexes = new HashSet<>(bodyLayer.getColumnHideShowLayer().getHiddenColumnIndexes());

		// check if the visible column configuration changed
		boolean newVisibleColumns = !hiddenColumnIndexes.equals(prevHiddenColumnIndexes);

		// check if new data is present
		boolean newDataPresent = !cachedFoldedData.equals(cachedPrevFoldedData);

		// check if dirty data is present
		boolean dirtyDataPresent = !dirtyFoldedData.isEmpty();

		if (newDataPresent || newVisibleColumns || dirtyDataPresent) {
			// we need to recompute the unfolded objects
			// we always try to compute as less as objects as possible and reuse
			// the existing unfolded data

			// check if the global column configuration changed
			boolean sameColumnConfig = (prevColumnList.size() == columnList.size());

			// this is the data source for the new unfolded objects
			Collection<EObject> cachedNewFoldedData;

			if (sameColumnConfig && !newVisibleColumns) {

				// we can compute the unfolded objects only for the new added
				// objects and the dirty objects, since the table configuration
				// has not changed
				cachedNewFoldedData = new HashSet<>(cachedFoldedData);
				cachedNewFoldedData.removeAll(cachedPrevFoldedData);

				if (dirtyDataPresent) {
					// remove all dirty objects
					for (EObject dirtyObject : dirtyFoldedData) {
						Collection<EObject> prevUnfoldedData = cachedUnfoldedData.get(dirtyObject);
						rawUnfoldedData.removeAll(prevUnfoldedData);
					}

					// compute their new values also
					cachedNewFoldedData.addAll(dirtyFoldedData);

					log.info("Dirty data present [" + dirtyFoldedData.size() + "] elements\n\t" + dirtyFoldedData);

					dirtyFoldedData.clear();
				}

				log.info("Same column config -> compute only for new objects [" + cachedNewFoldedData.size() + "]");

			} else {
				// we need to recompute all the objects since the table
				// configuration changed
				cachedNewFoldedData = rawFoldedData;
				rawUnfoldedData = new ArrayList<>();

				log.info("diferent column config -> compute for everyone");
			}

			// compute the actual unfolded objects
			for (EObject foldedObject : cachedNewFoldedData) {
				Set<EObject> unfoldedObjects = UnfoldRowObjectHelper.createUnfoldedObjects(foldedObject, columnList,
						hiddenColumnIndexes);

				rawUnfoldedData.addAll(unfoldedObjects);
				cachedUnfoldedData.put(foldedObject, unfoldedObjects);
			}

			log.info("New cached data [" + cachedNewFoldedData.size() + "] elements\n\t" + cachedNewFoldedData);

			// save data for future computations
			cachedPrevFoldedData = cachedFoldedData;
			prevColumnList = columnList;

		} else {
			log.info("No dirty state -> No unfold");
		}

		folded = false;
	}

	public void addDirtyElement(EObject element) {
		dirtyFoldedData.add(element);
	}

	public boolean isFolded() {
		return folded;
	}

	/**
	 * Returns the data that should be displayed in the table, depending on the
	 * currently selected perspective.
	 * 
	 * @return the data that should be displayed in the table.
	 */
	public Collection<EObject> getCurrentPerspectiveData() {
		return folded ? rawFoldedData : rawUnfoldedData;
	}

	@Override
	public void dataChanged(Collection<EObject> newData) {

		if (cachedFoldedData == null) {
			cachedPrevFoldedData = Collections.emptySet();
		} else {
			cachedPrevFoldedData = cachedFoldedData;
		}

		// new values
		rawFoldedData = newData;
		cachedFoldedData = new HashSet<>(rawFoldedData);
	}

	public void elementChanged(EObject element) {
		Collection<EObject> prevUnfoldedData = cachedUnfoldedData.get(element);

		// remove all the existing unfolded objects
		rawUnfoldedData.removeAll(prevUnfoldedData);

		// compute the new ones
		Collection<EObject> newUnfoldedData = UnfoldRowObjectHelper.createUnfoldedObjects(element, prevColumnList,
				hiddenColumnIndexes);

		// replace the old ones
		cachedUnfoldedData.put(element, newUnfoldedData);

		// note the the new elements are added at the end for performance
		// reasons
		rawUnfoldedData.addAll(newUnfoldedData);

		log.info("Element changed [" + element + "]");
	}

	public Collection<EObject> getUnfoldedObjectsForRoot(EObject root) {
		Collection<EObject> unfoldedObjects = cachedUnfoldedData.get(root);
		return unfoldedObjects == null ? Collections.emptySet() : unfoldedObjects;
	}

	@Override
	public void dispose() {
		// Let the good guy GC do the work.
	}
}
