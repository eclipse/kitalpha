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
package org.polarsys.kitalpha.massactions.edit.data.accessor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.polarsys.kitalpha.massactions.core.activator.MACoreActivator;
import org.polarsys.kitalpha.massactions.core.column.IMAColumn;
import org.polarsys.kitalpha.massactions.core.data.accessor.AbstractMAColumnPropertyAccessor;
import org.polarsys.kitalpha.massactions.core.extensionpoint.columnprovider.IMAColumnProvider;
import org.polarsys.kitalpha.massactions.core.extensions.columnprovider.MABasicColumnProvider;
import org.polarsys.kitalpha.massactions.core.helper.CommonFeaturesHelper;
import org.polarsys.kitalpha.massactions.core.helper.container.PossibleFeature;
import org.polarsys.kitalpha.massactions.core.table.layer.body.IMABodyLayer;

/**
 * The column property accessor for the Mass Editing component, supporting
 * editing of the current values.
 * 
 * Most of the editing work is delegated to each column, the column accessory
 * ensures the validity of the currently displayed data.
 * 
 * It also provides a performant mechanism for batch editing, through the use of
 * the {@link #beforeEditSelectionCommand() and
 * {@link #afterEditSelectionCommand()} methods.
 * 
 * @author Sandu Postaru
 * 
 */
public class MEColumnPropertyAccessor extends AbstractMAColumnPropertyAccessor {

  private static final Log log = LogFactory.getLog(MEColumnPropertyAccessor.class); 
  
	private TransactionalEditingDomain editingDomain;
	private List<Command> recordingCommands;
	private boolean isEditingSelection;

	private Collection<EObject> currentData;

	public MEColumnPropertyAccessor(IMABodyLayer bodyLayer) {
		super(bodyLayer);

		columnProperties = Collections.emptyList();
		prevColumnProperties = Collections.emptyList();

		initializeColumnProviders();
		dataChanged(bodyLayer.getData());
	}

	private void initializeColumnProviders() {

		Deque<IMAColumnProvider> localColumnProviders = new LinkedList<>();

		IExtensionRegistry extensionRegistry = Platform.getExtensionRegistry();
		IConfigurationElement[] config = extensionRegistry
				.getConfigurationElementsFor(MACoreActivator.EP_COLUMN_PROVIDER_ID);

		try {
			for (IConfigurationElement element : config) {
				Object o = element.createExecutableExtension("class");

				if (o instanceof IMAColumnProvider) {
					String kind = element.getAttribute(MACoreActivator.EP_COLUMN_PROVDER_KIND_ID);

					if (MACoreActivator.EP_COLUMN_PROVIDER_KIND_EDITING_VALUE.equals(kind)) {

						IMAColumnProvider columnProvider = (IMAColumnProvider) o;
						columnProvider.setBodyLayer(bodyLayer);

						if (o instanceof MABasicColumnProvider) {
							localColumnProviders.addFirst(columnProvider);
						} else {
							localColumnProviders.add(columnProvider);
						}
					}
				}
			}
		} catch (CoreException e) {
			log.error(e.getMessage());
		}

		columnProviders = new ArrayList<>(localColumnProviders);
	}

	@Override
	public void dataChanged(Collection<EObject> data) {
		currentData = data;

		Collection<PossibleFeature> possibleFeatures = CommonFeaturesHelper.getCommonPossibleFeatures(currentData);

		int columnIndex = 0;
		columnList = new ArrayList<>();
		prevColumnProperties = columnProperties;
		columnProperties = new ArrayList<>();
		columnPropertiesIndex = new HashMap<>();

		for (IMAColumnProvider columnProvider : columnProviders) {
			Collection<IMAColumn> extensionColumns = columnProvider.getColumnValues(possibleFeatures, currentData);

			for (IMAColumn column : extensionColumns) {
				column.setIndex(columnIndex++);
				column.dataChanged(currentData);

				// add to hashmap
				columnProperties.add(column.getName());
				columnPropertiesIndex.put(column.getName(), column.getIndex());
				columnList.add(column);
			}
		}
	}

	@Override
	public void beforeEditSelectionCommand() {
		recordingCommands = new ArrayList<>();
		isEditingSelection = true;
	}

	@Override
	public void afterEditSelectionCommand() {

		if (isEditingSelection && editingDomain != null) {
			CompoundCommand command = new CompoundCommand(recordingCommands);
			editingDomain.getCommandStack().execute(command);
			recordingCommands = null;
		}
	}

	@Override
	public void cleanResources() {
		isEditingSelection = false;
	}

	@Override
	public Object getDataValue(EObject rowObject, int columnIndex) {
		return columnList.get(columnIndex).getDataValue(rowObject);
	}

	@Override
	public void setDataValue(EObject rowObject, int columnIndex, Object newValue) {

		if (editingDomain == null) {
			editingDomain = TransactionUtil.getEditingDomain(rowObject);
		}

		RecordingCommand recordingCommand = new RecordingCommand(editingDomain) {
			@Override
			protected void doExecute() {
				columnList.get(columnIndex).setDataValue(rowObject, newValue);
			}
		};

		if (isEditingSelection) {
			// add the command to the current batch
			// the execution will be done once all the commands have been
			// created
			this.recordingCommands.add(recordingCommand);
		} else {
			editingDomain.getCommandStack().execute(recordingCommand);
		}
	}

	@Override
	public Collection<EObject> getCurrentDataRepresentation() {
		return currentData;
	}
}
