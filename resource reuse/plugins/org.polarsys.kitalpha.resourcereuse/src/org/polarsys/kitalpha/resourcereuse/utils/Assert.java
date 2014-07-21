/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.resourcereuse.utils;

import java.util.List;

import org.polarsys.kitalpha.resourcereuse.Messages;
import org.polarsys.kitalpha.resourcereuse.model.SearchCriteria;


/**
 * @author Thomas Guiu
 * 
 */
public class Assert {
	public static void notNullnotEmpty(String value) {
		if (isEmpty(value))
			throw new IllegalArgumentException(Messages.Illegal_String_Parameter);

	}

	public static void usable(SearchCriteria criteria) {
		if (criteria == null || (isEmpty(criteria.getId()) && isEmpty(criteria.getName()) && isEmpty(criteria.getVersion()) && isEmpty(criteria.getDomain()) && isEmpty(criteria.getTags()) && isEmpty(criteria.getUsedInConcerns()) && isEmpty(criteria.getUserInConcerns()) && isEmpty(criteria.getConcerns())))
			throw new IllegalArgumentException(Messages.Illegal_Criteria_Parameter);
	}

	private static boolean isEmpty(String value) {
		return value == null || "".equals(value);
	}

	private static boolean isEmpty(List<String> values) {
		if (values == null || values.isEmpty())
			return true;
		for (String value : values) {
			if (isEmpty(value))
				return true;
		}
		return false;
	}
}
