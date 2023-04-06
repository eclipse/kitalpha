/*******************************************************************************
 * Copyright (c) 2017, 2023 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.richtext.widget.configurable.editormodel;

import java.util.List;

public class EditorGroup extends EditorModelNode {
	
	private List<EditorItem> items;
	
	public EditorGroup(String groupId, String groupRteId, String groupLabel)
	{
		super(groupId, groupRteId, groupLabel);
	}
	
	public EditorGroup(String groupId, String groupRteId, String groupLabel, List<EditorItem> items)
	{
		super(groupId, groupRteId, groupLabel);
		this.items = items;
	}
	
	public List<EditorItem> getItems()
	{
		return items;
	}
}
