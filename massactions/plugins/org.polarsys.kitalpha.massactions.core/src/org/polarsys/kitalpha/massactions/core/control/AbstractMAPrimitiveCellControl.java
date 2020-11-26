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
package org.polarsys.kitalpha.massactions.core.control;

import java.util.Map;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.nebula.widgets.nattable.data.convert.IDisplayConverter;
import org.eclipse.swt.widgets.Composite;

/**
 * An editor control that is wrapped by a {@link AbstractMACellEditor}, and
 * adding support for {@link EStructuralFeature} based cell values. 
 *
 * @author Sandu Postaru
 */
public abstract class AbstractMAPrimitiveCellControl extends AbstractMACellControl {

	protected Map<String, EStructuralFeature> featureMap;

	public AbstractMAPrimitiveCellControl(Composite parent, int style, IDisplayConverter displayConverter,
			Map<String, EStructuralFeature> featureMap) {
		super(parent, style, displayConverter);
		this.featureMap = featureMap;
	}

}
