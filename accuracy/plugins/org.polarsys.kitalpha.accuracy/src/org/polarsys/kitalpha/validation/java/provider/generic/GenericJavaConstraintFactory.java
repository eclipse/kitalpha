/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.validation.java.provider.generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.emf.validation.model.Category;
import org.eclipse.emf.validation.model.CategoryManager;
import org.eclipse.emf.validation.model.ConstraintSeverity;
import org.eclipse.emf.validation.service.AbstractConstraintDescriptor;
import org.osgi.framework.Bundle;

import org.polarsys.kitalpha.validation.AccuracyPlugin;
import org.polarsys.kitalpha.validation.provider.generic.GenericConstraintFactory;

/**
 * Builds Java Constraints.
 * 
 * @author Yann Mortier
 */
public class GenericJavaConstraintFactory extends GenericConstraintFactory {

	/** requirement id keyword. */
	private static final String REQUIREMENT_ID = "requirementId";

	/** invariant id keyword. */
	private static final String INVARIANT_ID = "invariantId";

	/** Common category for all created constraints. */
	private Category commonCategory;

	/** Mandatory category for all mandatory constraints. */
	private Category mandatoryCategory;

	/** The name of the common category for all constraints. */
	private String commonCategoryName;

	/** The plugin that provides Java Constraints. */
	private Bundle contributorPluginBundle;

	/** The Constraints provider. */

	/** The created constraints. */
	private List<JavaConstraintDescriptor> createdConstraints = new LinkedList<JavaConstraintDescriptor>();

	/**
	 * Creates a new factory for the given constraint provider.
	 * 
	 * @param provider
	 *            the java constraints provider.
	 */
	public GenericJavaConstraintFactory(GenericJavaConstraintProvider provider) {
		super(provider);
		contributorPluginBundle = provider.getContributorBundle();
		commonCategoryName = getCommonConstraintCategory();
		commonCategory = CategoryManager.getInstance().getCategory(
				commonCategoryName);
	}

	private Category getMandatoryCategory() {
		if (mandatoryCategory == null) {
			mandatoryCategory = CategoryManager.getInstance().getCategory(
					commonCategoryName + "/mandatory");
			mandatoryCategory.setMandatory(true);
		}
		return mandatoryCategory;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.kitalpha.validation.provider.generic.GenericConstraintFactory#createConstraints()
	 */
	@Override
	public List<AbstractConstraintDescriptor> createConstraints() {
		this.createdConstraints.clear();
		Collection<IConfigurationElement> constraints = JavaConstraintExtension
				.getConstraintsFromContributor(this.contributorPluginBundle
						.getSymbolicName());
		for (IConfigurationElement currentConstraint : constraints) {
			createConstraintsFromConfigurationElement(currentConstraint);
		}
		return new ArrayList<AbstractConstraintDescriptor>(
				this.createdConstraints);
	}

	/**
	 * Creates a constraint from the given configuration element.
	 * 
	 * @param currentConstraint
	 *            the configuration element.
	 */
	private void createConstraintsFromConfigurationElement(
			IConfigurationElement currentConstraint) {
		List<String> mandatoryRequirements = getMandatoryRequirements();
		for (IConfigurationElement child : currentConstraint.getChildren()) {
			createConstraintFromJavaConstraint(child, mandatoryRequirements);
		}
	}

	private void createConstraintFromJavaConstraint(
			IConfigurationElement javaConstraint,
			List<String> mandatoryRequirements) {
		try {
			IJavaConstraint<?> executableInstance = (IJavaConstraint<?>) javaConstraint
					.createExecutableExtension(JavaConstraintExtension.JAVA_CONSTRAINT_CLASS);
			String requirementId = javaConstraint.getAttribute(REQUIREMENT_ID);
			String invariantId = javaConstraint.getAttribute(INVARIANT_ID);

			String message = getMessage(requirementId, invariantId);
			ConstraintSeverity severity = toConstraintSeverity(getSeverity(
					requirementId, invariantId));
			String name = getName(requirementId, invariantId);

			String codeStr = getCode(requirementId, invariantId);
			int code = toIntegerCode(codeStr);

			JavaConstraintDescriptor descriptor = new JavaConstraintDescriptor(
					this.contributorPluginBundle.getSymbolicName(),
					requirementId, invariantId, message, message, name,
					severity, executableInstance, code);

			// fetch categories to which this invariant is associated
			List<String> constraintCategories = getConstraintCategories(
					requirementId, invariantId);
			// add invariant to main category
			associateConstaintToCategory(descriptor, commonCategory);

			// add invariant to categories specified in the properties
			// file
			associateConstraintToCategories(descriptor, constraintCategories);

			if (mandatoryRequirements.contains(requirementId)) {
				associateConstaintToCategory(descriptor, getMandatoryCategory());
			}

			this.createdConstraints.add(descriptor);
		} catch (CoreException e) {
			AccuracyPlugin.getDefault().getLog().log(e.getStatus());
		}
	}
}
