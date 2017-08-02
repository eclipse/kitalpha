/*******************************************************************************
 * Copyright (c) 2017 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.richtext.widget.editor;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.resource.ImageDescriptor;
import org.polarsys.kitalpha.richtext.common.intf.SaveStrategy;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;
import org.polarsys.kitalpha.richtext.mde.tools.utils.MDERichTextToolsHelper;

/**
 * 
 * @author Faycal Abka
 *
 */
public class MDERichTextEditorInput implements IEditorInput{
	
	private EObject owner;
	private EStructuralFeature feature;
	private SaveStrategy saveStrategy;
	
	public MDERichTextEditorInput(EObject owner, EStructuralFeature feature, SaveStrategy saveStrategy) {
		this.owner = owner;
		this.feature = feature;
		this.saveStrategy = saveStrategy;
	}

	@Override
	public <T> T getAdapter(Class<T> adapter) {
		return null;
	}

	@Override
	public boolean exists() {
		return owner != null && feature != null;
	}

	@Override
	public ImageDescriptor getImageDescriptor() {
		return null;
	}

	@Override
	public String getName() {
		return MDERichTextToolsHelper.getName(getElement());
	}

	@Override
	public IPersistableElement getPersistable() {
		return null;
	}

	@Override
	public String getToolTipText() {
		return MDERichTextToolsHelper.getName(getElement());
	}
	
	public EObject getElement() {
		return owner;
	}
	 
	public EStructuralFeature getFeature() {
		return feature;
	}
	
	public SaveStrategy getSaveStrategy() {
		return saveStrategy;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		result = obj instanceof MDERichTextEditorInput &&
				((MDERichTextEditorInput)obj).getFeature() == getFeature() &&
						((MDERichTextEditorInput)obj).getElement() == getElement();
		return result;
	}
	
	@Override
	public int hashCode() {
		return super.hashCode() + getElement().hashCode() + getFeature().hashCode();
	}
	
}
