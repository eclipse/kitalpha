/*******************************************************************************
 * Copyright (c) 2017 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.richtext.widget.tools.utils;

/**
 * 
 * @author Faycal Abka
 *
 * @param <First> type of the first element of the tuple
 * @param <Second> type of the second element of the tuple
 */
public class Tuple<First, Second> {
	
	private final First first;
	private final Second second;
	
	public Tuple(First fist, Second second) {
		this.first = fist;
		this.second = second;
	}
	
	public First getFirst() {
		return first;
	}
	
	public Second getSecond() {
		return second;
	}
}
