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
package org.polarsys.kitalpha.massactions.core.extensionpoint.columnprovider;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.massactions.core.column.IMAColumn;
import org.polarsys.kitalpha.massactions.core.extensions.columnprovider.AbstractMAColumnProvider;
import org.polarsys.kitalpha.massactions.core.helper.container.PossibleFeature;
import org.polarsys.kitalpha.massactions.core.table.layer.body.IMABodyLayer;

/**
 * Interface for implementing column providers in order to contribute to the
 * existing displayed columns. You should avoid implementing this interface
 * directly and instead extend the {@link AbstractMAColumnProvider} class.
 * 
 * @author Sandu Postaru
 * 
 */
public interface IMAColumnProvider {

	/**
	 * Provides the new columns that will be added in the same order to the
	 * existing ones. Note that this method is called every time new elements
	 * are added into the existing table (since the table configuration might
	 * change) in order to obtain the new column configuration (some elements
	 * that do not share a column with the existing ones might be added, and so
	 * this column should be removed). It is your responsibility to ensure that
	 * this method call is optimized, avoid recreating new columns if the
	 * existing ones did not change.
	 * 
	 * @param commonPossibleFeatures
	 *            current common possible features, containing all the common
	 *            structural features for the initial data objects
	 * @param data
	 *            the initial data objects
	 * @return the new columns that will be added in order, to the existing ones
	 */
	Collection<IMAColumn> getColumnValues(Collection<PossibleFeature> commonPossibleFeatures, Collection<EObject> data);

	void setBodyLayer(IMABodyLayer bodyLayer);
}
