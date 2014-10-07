/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.validation.ocl.provider.generic;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.validation.model.Category;
import org.eclipse.emf.validation.model.CategoryManager;
import org.eclipse.emf.validation.model.ConstraintSeverity;
import org.eclipse.emf.validation.service.AbstractConstraintDescriptor;
import org.eclipse.ocl.OCLInput;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.utilities.UMLReflection;
import org.osgi.framework.Bundle;

import org.polarsys.kitalpha.validation.AccuracyPlugin;
import org.polarsys.kitalpha.validation.ocl.provider.generic.util.OCLConstraintDescriptor;
import org.polarsys.kitalpha.validation.ocl.provider.generic.util.ValidationInfo;
import org.polarsys.kitalpha.validation.provider.generic.GenericConstraintFactory;

/**
 * This class creates OCL Constraints from description file.
 * 
 * @author THALESGROUP
 */
public class GenericOCLConstraintFactory extends GenericConstraintFactory {

	/** Common category for all created constraints. */
	private Category _commonCategory;

	/** Mandatory category for all mandatory constraints. */
	private Category mandatoryCategory;

	/** The name of the common category for all constraints. */
	private String _commonCategoryName;

	private ResourceBundle _configurationFileResourceBundle;

	/** The plugin that provides OCL Constraints. */
	private Bundle _contributorPluginBundle;

	/** The folder that contains OCL files. */
	private String _constraintsFolder;

	/** The Constraints provider. */
	private GenericOCLConstraintProvider _provider;

	/** The created constraints. */
	private List<OCLConstraintDescriptor> _createdConstraints = new LinkedList<OCLConstraintDescriptor>();

	/**
	 * Creates a constraint factory for the given provider.
	 * 
	 * @param provider
	 *            the constraint provider.
	 */
	public GenericOCLConstraintFactory(GenericOCLConstraintProvider provider) {
		super(provider);
		_configurationFileResourceBundle = provider
				.getConfigurationFileResourceBundle();
		_contributorPluginBundle = provider.getContributorBundle();
		_constraintsFolder = getConstraintsFolder();
		_commonCategoryName = getCommonConstraintCategory();

		_commonCategory = CategoryManager.getInstance().getCategory(
				_commonCategoryName);
		this._provider = provider;
	}

	private Category getMandatoryCategory() {
		if (mandatoryCategory == null) {
			mandatoryCategory = CategoryManager.getInstance().getCategory(
					_commonCategoryName + "/mandatory");
			mandatoryCategory.setMandatory(true);
		}
		return mandatoryCategory;
	}

	/**
	 * Creates a constraint descriptor from the given invariant, file name and
	 * namespace.
	 * 
	 * @param invariant
	 *            the OCL invariant.
	 * @param oclFileName
	 *            the name of the OCL file.
	 * @param constraintNamespace
	 *            the namespace of the invariant.
	 * @return teh created descriptor.
	 */
	private OCLConstraintDescriptor createConstraintDescriptor(
			String requirementId, String invariantId, Constraint invariant,
			String oclFileName, String constraintNamespace) {
		String invariantName = invariant.getName();
		invariant.setName(getName(oclFileName, invariantName));
		String constraintMessage = getMessage(oclFileName, invariantName);
		ConstraintSeverity constraintSeverity = toConstraintSeverity(getSeverity(
				oclFileName, invariantName));
		int constraintCode = toIntegerCode(getCode(oclFileName, invariantName));
		ValidationInfo myinfo = new ValidationInfo(constraintMessage,
				constraintSeverity);
		OCLConstraintDescriptor currentConstraintDescriptor = new OCLConstraintDescriptor(
				requirementId, invariantId, constraintNamespace, invariant,
				oclFileName, constraintCode, myinfo);
		return currentConstraintDescriptor;
	}

	/**
	 * Create and return all OCL constrains descriptors.
	 * 
	 * @return the created OCL constraints descriptors.
	 */
	public List<AbstractConstraintDescriptor> createConstraints() {
		this._createdConstraints.clear();
		List<String> constraintFilesNames = getConstraintFilesNames();
		List<String> mandatoryRequirements = getMandatoryRequirements();
		for (String currentConstraintFileName : constraintFilesNames) {
			// we get the path of the ocl constraint (ocl file)
			String path = _constraintsFolder + currentConstraintFileName
					+ ".ocl"; //$NON-NLS-1$

			if ((path != null) && (path.length() > 0)) {
				createOCLConstraintsFromFile(path, mandatoryRequirements);
			}
		}
		return new ArrayList<AbstractConstraintDescriptor>(
				this._createdConstraints);
	}

	/**
	 * Creates OCL constraints from the given file path.
	 * 
	 * @param path
	 *            the path of the file that contains the OCL constraints.
	 * @param mandatoryRequirements
	 *            all mandatory requirements.
	 */
	private void createOCLConstraintsFromFile(String path,
			List<String> mandatoryRequirements) {
		IPath ipath = new Path(path);

		String oclFileNameWithExtension = ipath.lastSegment();
		String oclFileName = oclFileNameWithExtension.replace(
				"." + ipath.getFileExtension(), ""); //$NON-NLS-1$//$NON-NLS-2$

		// we parse/load constraints from the file
		List<Constraint> localFileConstraints = loadConstraintsFromFile(path,
				_contributorPluginBundle);

		// for each constraint, we set it up with message, description
		// categories
		for (Constraint constraint : localFileConstraints) {
			if (isInvariant(constraint)) {

				String invariantName = constraint.getName();
				OCLConstraintDescriptor currentConstraintDescriptor = createConstraintDescriptor(
						oclFileName, invariantName, constraint, oclFileName,
						_contributorPluginBundle.getSymbolicName());

				// fetch categories to which this invariant is associated
				List<String> constraintCategories = getConstraintCategories(
						oclFileName, invariantName);

				// add invariant to main category
				associateConstaintToCategory(currentConstraintDescriptor,
						_commonCategory);

				// add invariant to categories specified in the properties
				// file
				associateConstraintToCategories(currentConstraintDescriptor,
						constraintCategories);

				if (mandatoryRequirements.contains(oclFileName)) {
					associateConstaintToCategory(currentConstraintDescriptor,
							getMandatoryCategory());
				}

				//
				this._createdConstraints.add(currentConstraintDescriptor);
			}
		}
	}

	/**
	 * Returns all OCL File names.
	 * 
	 * @return all OCL File names.
	 */
	@SuppressWarnings("nls")
	private List<String> getConstraintFilesNames() {
		String constraintFilesNames = this.getString("ConstraintFiles");

		ArrayList<String> constraintFilesNamesList = new ArrayList<String>();
		if (null != constraintFilesNames) {
			String[] constraintFilesArray = constraintFilesNames.split(",");

			for (String string : constraintFilesArray) {
				constraintFilesNamesList.add(string);
			}
			return constraintFilesNamesList;
		}

		System.out.println("[WARNING] No constraint file names were specified");
		return constraintFilesNamesList;
	}

	@SuppressWarnings("nls")
	private String getConstraintsFolder() {
		return getString("ConstraintsFolder");
	}

	private String getString(String key) {
		try {
			return _configurationFileResourceBundle.getString(key);
		} catch (MissingResourceException e) {
			return null;
		}
	}

	private boolean isInvariant(Constraint constraint) {
		return UMLReflection.INVARIANT.equals(constraint.getStereotype());
	}

	@SuppressWarnings("nls")
	private List<Constraint> loadConstraintsFromFile(String oclFilePath,
			Bundle bundle) {
		ArrayList<Constraint> constraints = new ArrayList<Constraint>();

		URL url = _provider.getUrlFromPath(oclFilePath);

		// URL url = bundle.getEntry(oclFilePath);
		if (null != url) {
			try {
				InputStream input = url.openStream();

				try {
					OCLInput oclInput = new OCLInput(input);
					OCL ocl = OCL.newInstance();
					return ocl.parse(oclInput);
				} catch (ParserException e) {
					AccuracyPlugin.getDefault().error(
							"Failed to parse OCL constraints in "
									+ bundle.getSymbolicName() + " for "
									+ oclFilePath, e);
				} finally {
					input.close();
				}
			} catch (IOException e) {
				AccuracyPlugin.getDefault().error(
						"Failed to load OCL constraints from "
								+ bundle.getSymbolicName(), e);
			}
		}
		return constraints;
	}

}
