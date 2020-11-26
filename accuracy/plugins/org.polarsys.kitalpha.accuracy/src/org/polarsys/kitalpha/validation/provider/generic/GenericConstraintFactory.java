/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.validation.provider.generic;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.regex.Pattern;

import org.eclipse.emf.validation.model.Category;
import org.eclipse.emf.validation.model.CategoryManager;
import org.eclipse.emf.validation.model.ConstraintSeverity;
import org.eclipse.emf.validation.service.AbstractConstraintDescriptor;

import org.polarsys.kitalpha.validation.AccuracyPlugin;

/**
 * Generic Constraint Factory.
 * 
 * @author Yann Mortier
 */
public abstract class GenericConstraintFactory {

	/** The cancel severity level. */
	private static final String CANCEL = "CANCEL";

	/** The error severity level. */
	private static final String ERROR = "ERROR";

	/** The warning severity level. */
	private static final String WARNING = "WARNING";

	/** The info severity level. */
	private static final String INFO = "INFO";

	/** The null severity level. */
	private static final String NULL = "NULL";

	/** The invariant keyword. */
	private static final String INVARIANT = "Invariant";

	/** The categories keyword. */
	private static final String CATEGORIES = "Categories";

	/** The code keyword. */
	private static final String CODE = "Code";

	/** the severity kleyword. */
	private static final String SEVERITY = "Severity";

	/** the message keyword. */
	private static final String MESSAGE = "Message";

	/** The name keyword. */
	private static final String NAME = "Name";

	/** The common category keyword. */
	private static final String COMMON_ROOT_CATEGORY = "CommonRootCategory";

	private static final String MANDATORY_REQUIREMENT = "mandatory.rules.list";

	/** The key separator. */
	private static final String KEY_SEPARATOR = ".";

	/** The configuration file. */
	private ResourceBundle configurationFileResourceBundle;

	/**
	 * Creates a new factory with the given provider.
	 * 
	 * @param provider
	 *            the provider.
	 */
	public GenericConstraintFactory(GenericConstraintProvider provider) {
		this.configurationFileResourceBundle = provider
				.getConfigurationFileResourceBundle();
	}

	/**
	 * Associate the given constraint with the given category.
	 * 
	 * @param currentConstraintDescriptor
	 *            the constraint descriptor.
	 * @param category
	 *            the category to associate with the constraint.
	 */
	public void associateConstaintToCategory(
			AbstractConstraintDescriptor currentConstraintDescriptor,
			Category category) {
		if (category != null) {
			category.addConstraint(currentConstraintDescriptor);
		}
	}

	/**
	 * Associate the given constraint with the given categories.
	 * 
	 * @param currentConstraintDescriptor
	 *            the constraint descriptor.
	 * @param category
	 *            the categories to associate with the constraint.
	 */
	public void associateConstraintToCategories(
			AbstractConstraintDescriptor currentConstraintDescriptor,
			List<String> constraintCategories) {
		for (String categoryName : constraintCategories) {
			Category currentCategory = CategoryManager.getInstance()
					.getCategory(categoryName);
			associateConstaintToCategory(currentConstraintDescriptor,
					currentCategory);
		}
	}
	
	

	/**
	 * Returns the name of the common category for all constraints.
	 * 
	 * @return the name of the common category for all constraints.
	 */
	public String getCommonConstraintCategory() {
		return this.getString(COMMON_ROOT_CATEGORY);
	}

	/**
	 * Returns the {@link ConstraintSeverity} corresponding to the given
	 * security label.
	 * 
	 * @param severity
	 *            the severity label.
	 * @return the {@link ConstraintSeverity} corresponding to the given
	 *         security label.
	 */
	protected ConstraintSeverity toConstraintSeverity(String severity) {
		if (null != severity) {
			if (severity.equals(NULL)) {
				return ConstraintSeverity.NULL;
			}
			if (severity.equals(INFO)) {
				return ConstraintSeverity.INFO;
			}
			if (severity.equals(WARNING)) {
				return ConstraintSeverity.WARNING;
			}
			if (severity.equals(ERROR)) {
				return ConstraintSeverity.ERROR;
			}
			if (severity.equals(CANCEL)) {
				return ConstraintSeverity.CANCEL;
			}
		}
		return ConstraintSeverity.ERROR;
	}

	/**
	 * Creates all constraints.
	 * 
	 * @return the created constraints.
	 */
	public abstract List<AbstractConstraintDescriptor> createConstraints();

	/**
	 * Creates the key for the given invariant of the givent requirement.
	 * 
	 * @param requirementId
	 *            the requirement.
	 * @param invariantId
	 *            the invariant.
	 * @param keyword
	 *            the keyword of the key.
	 * @return the created key.
	 */
	protected String createKey(final String requirementId,
			final String invariantId, String keyword) {
		final StringBuilder builder = new StringBuilder(requirementId.length()
				+ invariantId.length() + keyword.length() + INVARIANT.length()
				+ (KEY_SEPARATOR.length() * 3));
		builder.append(requirementId);
		builder.append(KEY_SEPARATOR);
		builder.append(INVARIANT);
		builder.append(KEY_SEPARATOR);
		builder.append(invariantId);
		builder.append(KEY_SEPARATOR);
		builder.append(keyword);
		return builder.toString();
	}

	/**
	 * Returns the name of the given invariant of the given requirement.
	 * 
	 * @param requirementId
	 *            the requirement.
	 * @param invariantId
	 *            the invariant.
	 * @return the name of the given invariant of the given requirement.
	 */
	public String getName(final String requirementId, final String invariantId) {
		return getString(createKey(requirementId, invariantId, NAME));
	}

	/**
	 * Returns the message of the given invariant of the given requirement.
	 * 
	 * @param requirementId
	 *            the requirement.
	 * @param invariantId
	 *            the invariant.
	 * @return the message of the given invariant of the given requirement.
	 */
	public String getMessage(final String requirementId,
			final String invariantId) {
		return getString(createKey(requirementId, invariantId, MESSAGE));
	}

	/**
	 * Returns the severity of the given invariant of the given requirement.
	 * 
	 * @param requirementId
	 *            the requirement.
	 * @param invariantId
	 *            the invariant.
	 * @return the severity of the given invariant of the given requirement.
	 */
	public String getSeverity(final String requirementId,
			final String invariantId) {
		return getString(createKey(requirementId, invariantId, SEVERITY));
	}

	/**
	 * Returns the code of the given invariant of the given requirement.
	 * 
	 * @param requirementId
	 *            the requirement.
	 * @param invariantId
	 *            the invariant.
	 * @return the code of the given invariant of the given requirement.
	 */
	public String getCode(final String requirementId, final String invariantId) {
		return getString(createKey(requirementId, invariantId, CODE));
	}

	/**
	 * Returns the categories of the given invariant of the given requirement.
	 * 
	 * @param requirementId
	 *            the ID of the requirement.
	 * @param invariantId
	 *            the ID of the invariant.
	 * @return the categories of the given invariant of the given requirement.
	 */
	public List<String> getConstraintCategories(String requirementId,
			String invariantId) {
		String categoriesString = this.getString(createKey(requirementId,
				invariantId, CATEGORIES));

		ArrayList<String> categories = new ArrayList<String>();

		if (null != categoriesString) {
			String[] categoriesArray = categoriesString.split(","); //$NON-NLS-1$

			for (String string : categoriesArray) {
				categories.add(string.trim());
			}
		}
		return categories;
	}

	/**
	 * Returns the integer corresponding to the given string.
	 * 
	 * @param codeStr
	 *            the string.
	 * @return the integer corresponding to the given string.
	 */
	protected int toIntegerCode(String codeStr) {
		String codeStrTmp = codeStr.replaceAll("^(0+)", "").trim();

		int code = -1;
		try {
			code = Integer.parseInt(codeStrTmp, 10);
		} catch (NumberFormatException nfe) {
			// silent
			// fail.
		}
		return code;
	}

	/**
	 * Returns mandatory requirements.
	 * 
	 * @return mandatory requirements.
	 */
	protected List<String> getMandatoryRequirements() {
		List<String> result = new ArrayList<String>();
		
		if (!containsKey(MANDATORY_REQUIREMENT)) {
			return result;
		}
		
		String mandatoryRequirements = getString(MANDATORY_REQUIREMENT);
		if (mandatoryRequirements != null) {
			String[] split = mandatoryRequirements.split(Pattern.quote(","));
			for (String requirement : split) {
				result.add(requirement.trim());
			}
		}
		return result;
	}

	private String getString(final String key) {
		try {
			return configurationFileResourceBundle.getString(key);
		} catch (MissingResourceException e) {
			AccuracyPlugin.getDefault().error(
					"Error while accessing configuration file", e);
		}
		return null;
	}
	
	private boolean containsKey(String mandatoryRequirement) {
		Enumeration<String> keys = configurationFileResourceBundle.getKeys();
		while (keys.hasMoreElements()) {
			String key = keys.nextElement();
			if (mandatoryRequirement != null && mandatoryRequirement.equals(key)) {
				return true;
			}
		}
		return false;
	}

}
