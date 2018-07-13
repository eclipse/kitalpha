/*******************************************************************************
 * Copyright (c) 2018  Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.massactions.core.data.accessor;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.nebula.widgets.nattable.data.IColumnPropertyAccessor;
import org.eclipse.nebula.widgets.nattable.edit.command.EditSelectionCommand;
import org.polarsys.kitalpha.massactions.core.column.IMAColumn;
import org.polarsys.kitalpha.massactions.core.extensionpoint.columnprovider.IMAColumnProvider;
import org.polarsys.kitalpha.massactions.core.table.layer.IMAComponent;

/**
 * Maps the properties from the row object to the corresponding columns.
 * 
 * @author Sandu Postaru
 * 
 */
public interface IMAColumnPropertyAccessor extends IMAComponent, IColumnPropertyAccessor<EObject> {

	/**
	 * A hook method that is executed before processing a
	 * {@link EditSelectionCommand}. This typically enables the use of a batch
	 * processing mechanism for the whole selection, instead of processing each
	 * individual edit.
	 */
	void beforeEditSelectionCommand();

	/**
	 * A hook method that is executed after processing a
	 * {@link EditSelectionCommand}. This typically enables the use of a batch
	 * processing mechanism for the whole selection, instead of processing each
	 * individual edit.
	 */
	void afterEditSelectionCommand();

	/**
	 * A hook method that is executed after a {@link EditSelectionCommand} has
	 * been processed and the edit actions were committed. This typically
	 * enables the disposing of the used resources during the processing of the
	 * command.
	 */
	void cleanResources();

	/**
	 * Returns the column properties that are used as header values.
	 * 
	 * @return the column properties.
	 */
	List<String> getColumnProperties();

	/**
	 * Returns the column properties that were used as header values, before the
	 * last "data changed" call.
	 * 
	 * @return the previous column properties.
	 */
	List<String> getPrevColumnProperties();

	/**
	 * Returns the column properties that are used as header values, under an
	 * array form.
	 * 
	 * @return the column properties.
	 */
	String[] getColumnPropertiesArray();

	/**
	 * Returns the complete list of columns (visible and hidden).
	 * 
	 * @return the list of columns.
	 */
	List<IMAColumn> getColumnList();

	/**
	 * Returns the current column providers.
	 * 
	 * @return the current column providers.
	 */
	List<IMAColumnProvider> getColumnProviders();

	/**
	 * Returns the underlying data representation that is used currently used by
	 * the column accessor. While the original data is a collection of raw
	 * EObjects, the currently displayed data can be a representation variation
	 * based on the original data. (Ex: in the Mass Visualization view, objects
	 * can be unfolded).
	 * 
	 * @return the underlying data form that is used currently used by the
	 *         column accessor.
	 * 
	 */
	Collection<EObject> getCurrentDataRepresentation();
}
