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

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.swt.widgets.Composite;

public abstract class EditorModelNode {

	private String				id;
	private String				rteId;
	private String				label;
	private BooleanFieldEditor	preferenceField;
	private Composite			parent;
	
	protected EditorModelNode(String nodeId, String nodeRteId, String nodeLabel)
	{
		this.id = nodeId;
		this.rteId = nodeRteId;
		this.label = nodeLabel;
	}
	
	public String getId()
	{
		return id;
	}

	public String getLabel()
	{
		return label;
	}

	public String getRteId()
	{
		return rteId;
	}

	public BooleanFieldEditor getPreferenceField() {
		return preferenceField;
	}

	public void setPreferenceField(BooleanFieldEditor preferenceField) {
		this.preferenceField = preferenceField;
	}

	public Composite getParent() {
		return parent;
	}

	public void setParent(Composite parent) {
		this.parent = parent;
	}
}
