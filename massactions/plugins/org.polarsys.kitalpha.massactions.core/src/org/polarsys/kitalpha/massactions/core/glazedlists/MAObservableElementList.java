/*******************************************************************************
 * Copyright (c) 2018  Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 *  Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.massactions.core.glazedlists;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;

import ca.odell.glazedlists.EventList;
import ca.odell.glazedlists.ObservableElementList;

/**
 * An extension of a {@link ObservableElementList} adding an fficient manner of
 * handling a listener for a collection of elements.
 * 
 * @author Sandu Postaru
 * 
 */
public class MAObservableElementList extends ObservableElementList<EObject> {

	public MAObservableElementList(EventList<EObject> source, Connector<? super EObject> elementConnector) {
		super(source, elementConnector);
	}

	/**
	 * Handle a listener being notified for the specified
	 * <code>listElements</code>. This method causes a ListEvent to be fired
	 * from this EventList for each element in the list, indicating an update
	 * occurred at all locations of the given <code>listElements</code>.
	 *
	 * <p>
	 * This method acquires the write lock for this list before locating the
	 * <code>listElement</code> and broadcasting its update. It is assumed that
	 * this method may be called on any Thread, so to decrease the burdens of
	 * the caller in achieving multi-threaded correctness, this method is Thread
	 * ready.
	 *
	 * @param listElements
	 *            the list elements which have been modified
	 */
	@SuppressWarnings("deprecation")
	public void multipleElementsChanged(Collection<EObject> listElements) {

		if (!listElements.isEmpty()) {

			getReadWriteLock().writeLock().lock();
			try {
				this.updates.beginEvent();

				// locate all indexes containing the given elements
				for (int i = 0, n = size(); i < n; i++) {
					final EObject currentElement = get(i);
					if (listElements.contains(currentElement)) {
						this.updates.elementUpdated(i, currentElement);
					}
				}

				this.updates.commitEvent();
			} finally {
				getReadWriteLock().writeLock().unlock();
			}
		}
	}

}
