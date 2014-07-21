/*******************************************************************************
 * Copyright (c) 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation.
 *******************************************************************************/


package org.polarsys.kitalpha.validation.internal.configurer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.regex.Pattern;

import org.eclipse.emf.validation.model.Category;
import org.eclipse.emf.validation.model.CategoryManager;
import org.eclipse.emf.validation.preferences.EMFModelValidationPreferences;
import org.eclipse.emf.validation.service.ConstraintRegistry;
import org.eclipse.emf.validation.service.IConstraintDescriptor;

import org.polarsys.kitalpha.validation.configurer.ConfigurerException;
import org.polarsys.kitalpha.validation.configurer.IConstraintConfigurer;
import org.polarsys.kitalpha.validation.provider.generic.IAccuracyConstraintDescriptor;
import org.polarsys.kitalpha.validation.util.TypeUtils;

/**
 * Default implementation of {@link IConstraintConfigurer}.
 * 
 * @author THALESGROUP
 */
public class ConstraintConfigurer implements IConstraintConfigurer {

	private static final String RULES_LIST = "additional.rules.list";

	private static final String CATEGORY = "category";

	private Map<String, Set<IAccuracyConstraintDescriptor>> requirementIdToConstraints;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.polarsys.kitalpha.validation.configurer.IConstraintConfigurer#configure(java.util.Properties)
	 */
	public void configure(Properties properties) throws ConfigurerException {
		//
		// First of all, deactivate all constraints from the given category.
		Category category = getCategory(properties);
		deactivateCategory(category);
		//
		// Activate selected constraints.
		List<IConstraintDescriptor> descriptors = getDescriptors(properties);
		activateConstraints(descriptors);
	}

	private void activateConstraints(List<IConstraintDescriptor> descriptors) {
		for (IConstraintDescriptor descriptor : descriptors) {
			EMFModelValidationPreferences.setConstraintDisabled(descriptor.getId(), false);
		}
	}

	private List<IConstraintDescriptor> getDescriptors(Properties properties)
			throws ConfigurerException {
		String additionalRules = properties.getProperty(RULES_LIST);
		if (additionalRules == null) {
			throw new ConfigurerException(
					"No additional rules found in the properties (missing key: '"
							+ RULES_LIST + "')");
		}
		String[] splittedRules = additionalRules.split(Pattern.quote(","));
		for (int i = 0; i < splittedRules.length; i++) {
			splittedRules[i] = splittedRules[i].trim();
		}

		List<IConstraintDescriptor> result = new ArrayList<IConstraintDescriptor>(
				splittedRules.length);
		for (String ruleId : splittedRules) {
			Set<IAccuracyConstraintDescriptor> descriptors = this
					.getRequirementIdToConstraints().get(ruleId);
			if (descriptors != null)
				result.addAll(descriptors);
			else {
				throw new ConfigurerException(
						"No constraints found for rule id: " + ruleId);
			}

		}
		return result;
	}

	private void deactivateCategory(Category category) {
		for (IConstraintDescriptor constraintDescriptor : TypeUtils.cast(
				category.getConstraints(), IConstraintDescriptor.class)) {
			if (!isMandatory(constraintDescriptor))
				EMFModelValidationPreferences.setConstraintDisabled(
						constraintDescriptor.getId(), true);
		}

		for (Category cat : TypeUtils.cast(category.getChildren(),
				Category.class)) {
			deactivateCategory(cat);
		}

	}

	private Category getCategory(Properties properties)
			throws ConfigurerException {
		String categoryName = properties.getProperty(CATEGORY);
		if (categoryName == null) {
			throw new ConfigurerException(
					"No additional rules found in the properties (missing key: '"
							+ RULES_LIST + "')");
		}
		Category category = CategoryManager.getInstance().getCategory(
				categoryName);
		return category;
	}

	private Map<String, Set<IAccuracyConstraintDescriptor>> getRequirementIdToConstraints() {
		if (requirementIdToConstraints == null) {
			requirementIdToConstraints = new HashMap<String, Set<IAccuracyConstraintDescriptor>>();
			for (Object descriptor : ConstraintRegistry.getInstance()
					.getAllDescriptors()) {
				if (descriptor instanceof IAccuracyConstraintDescriptor) {
					IAccuracyConstraintDescriptor constraintDescriptor = (IAccuracyConstraintDescriptor) descriptor;
					String requirementId = constraintDescriptor
							.getRequirementId();
					Set<IAccuracyConstraintDescriptor> descriptors = requirementIdToConstraints
							.get(requirementId);
					if (descriptors == null) {
						descriptors = new HashSet<IAccuracyConstraintDescriptor>();
						requirementIdToConstraints.put(requirementId,
								descriptors);
					}
					descriptors.add(constraintDescriptor);
				}
			}
		}
		return requirementIdToConstraints;
	}

	private static boolean isMandatory(IConstraintDescriptor descriptor) {
		boolean result = false;
		for (Iterator<Category> iter = TypeUtils.cast(
				descriptor.getCategories(), Category.class).iterator(); !result
				&& iter.hasNext();) {
			result = iter.next().isMandatory();
		}

		return result;
	}

}
