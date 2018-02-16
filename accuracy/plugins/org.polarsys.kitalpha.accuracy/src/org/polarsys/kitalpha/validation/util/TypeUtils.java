/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.validation.util;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Utility class for types.
 * 
 * @author Guillaume Gebhart
 */
public class TypeUtils {
	
	public TypeUtils() {
		// Prevent instantiation
	}

	public static <T> Iterable<T> cast(Iterable<?> iterable, Class<T> type) {
		return new CastedIterable<T>(iterable, type);
	}

	private static class CastedIterable<T> implements Iterable<T> {

		private Iterable<?> delegate;
		private Class<T> type;

		public CastedIterable(Iterable<?> delegate, Class<T> type) {
			this.delegate = delegate;
			this.type = type;
		}

		public Iterator<T> iterator() {
			return new CastedIterator<T>(delegate.iterator(), type);
		}

	}

	private static class CastedIterator<T> implements Iterator<T> {

		private Iterator<?> delegate;
		private boolean goNext = true;
		private T current = null;
		private Class<T> type;

		public CastedIterator(Iterator<?> delegate, Class<T> type) {
			this.delegate = delegate;
			this.type = type;
		}

		public boolean hasNext() {
			if (goNext) {
				current = internalNext();
				goNext = false;
			}
			return current != null;
		}

		public T next() {
			if (hasNext()) {
				goNext = true;
				return current;
			}
			throw new NoSuchElementException();
		}

		public void remove() {
			delegate.remove();
		}

		private T internalNext() {
			T next = null;
			while (delegate.hasNext() && next == null) {
				Object o = delegate.next();
				if (type.isInstance(o)) {
					next = type.cast(o);
				}
			}
			return next;
		}

	}

}
