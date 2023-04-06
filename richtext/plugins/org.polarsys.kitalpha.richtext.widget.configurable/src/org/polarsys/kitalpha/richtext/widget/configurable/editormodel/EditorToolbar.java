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

public class EditorToolbar extends EditorModelNode {
	
	private List<EditorGroup> groups;
	
	public EditorToolbar(String toolbarId, String toolbarRteId, String toolbarLabel)
	{
		super(toolbarId, toolbarRteId, toolbarLabel);
	}
	
	public EditorToolbar(String toolbarId, String toolbarRteId, String toolbarLabel, List<EditorGroup> groups)
	{
		super(toolbarId, toolbarRteId, toolbarLabel);
		this.groups = groups;
	}
	
	public List<EditorGroup> getGroups()
	{
		return groups;
	}
}
