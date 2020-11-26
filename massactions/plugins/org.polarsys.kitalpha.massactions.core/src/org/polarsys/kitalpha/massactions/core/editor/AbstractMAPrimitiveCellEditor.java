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
package org.polarsys.kitalpha.massactions.core.editor;

import java.util.Map;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.nebula.widgets.nattable.edit.editor.ICellEditor;
import org.polarsys.kitalpha.massactions.core.table.layer.body.IMABodyLayer;

/**
 * Abstract implementation of {@link ICellEditor} that wraps SWT controls to be
 * cell editors.
 * 
 * You should extend this class if your editor is based on a
 * {@link EStructuralFeature}, if that is not the case, extend
 * {@link AbstractMACellEditor} instead.
 * 
 * This implementation adds support for managing your
 * {@link EStructuralFeature}s, using a hash-map having as key the row object's
 * class and as value the associated feature.
 *
 * @author Sandu Postaru
 * 
 */
public abstract class AbstractMAPrimitiveCellEditor extends AbstractMACellEditor {

	protected Map<String, EStructuralFeature> featureMap;

	public AbstractMAPrimitiveCellEditor(IMABodyLayer bodyLayer, Map<String, EStructuralFeature> featureMap) {
		super(bodyLayer);
		this.featureMap = featureMap;
	}

}
