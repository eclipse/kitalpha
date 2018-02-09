/*******************************************************************************
 * Copyright (c) 2016, 2018 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.resourcereuse.emfscheme.dialog.services;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;
import org.polarsys.kitalpha.resourcereuse.emfscheme.helpers.ModelReuseHelper;
import org.polarsys.kitalpha.resourcereuse.model.Resource;
import org.polarsys.kitalpha.resourcereuse.model.SearchCriteria;

/**
 * 
 * @author Xavier DECOOL
 *
 */
public class GeneralServices {
	// model reuse icon path
	private static final String ICON_PATH = "obj16/searchView.gif";

	/**
	 * Method used for refresh result Table contents
	 * 
	 * @param criteria
	 *            : Criteria used for filter result Table
	 * @param tagsRefresh
	 *            : boolean to specify if we are working with tags
	 * @return True if criteria's tags doesn't fit with any models, false
	 *         otherwise
	 */
	public static void refreshResultsAccordingToCriteria(
			SearchCriteria criteria, Table resultsTable,
			Shell shell) {
		// searching resources...
		resultsTable.removeAll();
		List<Resource> modelsToLoad = ModelReuseHelper
				.findModelsAccordingToCriteria(criteria);
		// creation of new items in result Table
		// if i have resources that fit with setted criteria
		if (!modelsToLoad.isEmpty()) {
			for (Resource resource : modelsToLoad) {
				TableItem resourceItem = new TableItem(resultsTable, SWT.NONE);
				resourceItem
						.setData(constructFullCriteriaFromResource(resource));

				if (resource.getVersion() != null && resource.getName() != null)
					resourceItem.setText(resource.getName() + " v"
							+ resource.getVersion());
				else if (resource.getName() != null)
					resourceItem.setText(resource.getName());
				else
					resourceItem.setText(resource.getId());
				resourceItem.setImage(getParentImage());
			}
		}
	}

	/**
	 * Method which find if a tag fits with models included in the resource reuse library 
	 * @param tagValue : The value of the tag to be tested
	 * @param shell : Parent shell used for store the MessageDialog which is open if the tag does not fit with any models
	 * @return Return false if the tag does not fits, true otherwise
	 */
	public static boolean checkIfCurrentTagFitsWithModels(String tagValue, Shell shell) {
		SearchCriteria criteriaForTags = new SearchCriteria();
		criteriaForTags.getTags().add(tagValue);
		List<Resource> modelsToLoad = ModelReuseHelper
				.findModelsAccordingToCriteria(criteriaForTags);
		if (modelsToLoad.isEmpty()) {
			MessageDialog dialog = new MessageDialog(shell,
					"Error during tags typing...", null,
					"Specified tag doesn't fit with a specific model ...",
					MessageDialog.INFORMATION, new String[] { "OK" }, 0);
			dialog.open();
			return false;
		}
		return true;
	}
	
	public static void constructDialogForExistingTag(String tagValue, Shell shell){
		
		MessageDialog dialog = new MessageDialog(shell,
				"Error during tags typing...", null,
				"Specified tag "+ tagValue +" already exists",
				MessageDialog.WARNING, new String[] { "OK" }, 0);
		dialog.open();
		return;
	}

	/**
	 * Construct a complete criteria based on the given resource
	 * @param resource : The given resource
	 * @return The SearchCriteria resulting of the given resource
	 */
	protected static SearchCriteria constructFullCriteriaFromResource(
			Resource resource) {
		SearchCriteria criteria = new SearchCriteria();
		criteria.setId(resource.getId());
		if (resource.getName() != null)
			criteria.setName(resource.getName());
		if (resource.getDomain() != null)
			criteria.setDomain(resource.getDomain());
		if (resource.getVersion() != null)
			criteria.setVersion(resource.getVersion());
		if (!resource.getTags().isEmpty())
			criteria.getTags().addAll(resource.getTags());

		return criteria;
	}



	/**
	 * Retrieve image of resources
	 * 
	 * @param resource
	 *            : The resource which we want its image
	 * @return The icon of the resource
	 */
	public static Image getParentImage() {
		return org.polarsys.kitalpha.resourcereuse.ui.Activator.getDefault().getImage(ICON_PATH);
	}

	public static java.util.List<StringValue> toStringValueList(
			java.util.List<String> tags) {
		java.util.List<StringValue> result = new ArrayList<>();
		for (String value : tags)
			result.add(new StringValue(value));
		return result;
	}

	public static class StringValue {
		private String value;

		public StringValue(String string) {
			setValue(string);
		}

		@Override
		public String toString() {
			return getValue();
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	private GeneralServices() {
		super();
		
	}
	
}
