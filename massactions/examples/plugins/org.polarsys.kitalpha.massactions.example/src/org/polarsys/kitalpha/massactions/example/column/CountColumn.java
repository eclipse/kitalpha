/*******************************************************************************
 * Copyright (c) 2018, 2020  Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 *  Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.massactions.example.column;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.nebula.widgets.nattable.data.convert.IDisplayConverter;
import org.eclipse.nebula.widgets.nattable.edit.editor.ICellEditor;
import org.polarsys.kitalpha.massactions.core.column.AbstractMAColumn;
import org.polarsys.kitalpha.massactions.example.data.convert.CountDisplayConverter;
import org.polarsys.kitalpha.massactions.example.edit.editor.CountCellEditor;

/**
 * 
 * @author Sandu Postaru 
 *
 */
public class CountColumn extends AbstractMAColumn {

	private Map<EObject, String> valueMap;
	
	public CountColumn() {
		valueMap = new HashMap<>();
	}
	
	@Override
	protected IDisplayConverter createDisplayConverter() {
		return new CountDisplayConverter();	
	}
		
	@Override
	protected ICellEditor createCellEditor() {	
		return new CountCellEditor(bodyLayer);
	}
	
	@Override
	public Object getDataValue(EObject rowObject) {
		return valueMap.get(rowObject);
	}

	@Override
	public void setDataValue(EObject rowObject, Object newValue) {
		valueMap.put(rowObject, (String)newValue);		
	}

	@Override
	public void dataChanged(Collection<EObject> newData) {		
		
		for(EObject data: newData){
			valueMap.putIfAbsent(data, "A");			
		}		
	}

}
