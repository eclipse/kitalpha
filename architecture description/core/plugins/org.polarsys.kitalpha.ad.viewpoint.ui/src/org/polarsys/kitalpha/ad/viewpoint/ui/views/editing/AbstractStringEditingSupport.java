/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.ui.views.editing;

import java.lang.reflect.Method;

import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.osgi.util.NLS;
import org.polarsys.kitalpha.ad.common.AD_Log;
import org.polarsys.kitalpha.ad.viewpoint.ui.Messages;

public abstract class AbstractStringEditingSupport extends BasicEditingSupport {

	protected static final Class<?>[] EMPTY_CLASS_ARRAY = new Class[0];
	private static final Object[] EMPTY_OBJECT_ARRAY = new Object[0];
	protected static final Class<?>[] STRING_ARRAY = new Class[] { String.class };
	protected Method getter;
	protected Method setter;

	public AbstractStringEditingSupport(ColumnViewer viewer, Class<?> candidate, String propertyName) {
		super(viewer);
		String getterName = "get" + Character.toUpperCase(propertyName.charAt(0)) + propertyName.substring(1);
		String setterName = "set" + Character.toUpperCase(propertyName.charAt(0)) + propertyName.substring(1);
		try {
			getter = candidate.getMethod(getterName, EMPTY_CLASS_ARRAY);
			setter = candidate.getMethod(setterName, STRING_ARRAY);
		} catch (Exception e) {
			AD_Log.getDefault().logInfo(NLS.bind(Messages.EditingSupport_error1, propertyName), e);
		}
	}

	@Override
	protected void doSetValue(Object element, Object value) {
		try {
			setter.invoke(element, new Object[] { value });
		} catch (Exception e) {
			AD_Log.getDefault().logError(e);
		}
	}

	@Override
	protected boolean canEdit(Object element) {
		if (setter == null || getter == null) {
			return false;
		}
		return super.canEdit(element);
	}

	@Override
	protected Object getValue(Object element) {
		try {
			Object value = getter.invoke(element, EMPTY_OBJECT_ARRAY);
			return value == null ? "" : value;
		} catch (Exception e) {
			AD_Log.getDefault().logError(e);
		}
		return "";
	}

}