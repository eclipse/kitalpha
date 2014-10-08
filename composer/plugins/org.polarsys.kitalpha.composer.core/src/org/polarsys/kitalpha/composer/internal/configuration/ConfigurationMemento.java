/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.composer.internal.configuration;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import org.polarsys.kitalpha.composer.api.Parameter;
import org.polarsys.kitalpha.composer.api.configuration.CodeManagerConfiguration;
import org.polarsys.kitalpha.composer.api.configuration.ICodeManagerInput;
import org.polarsys.kitalpha.composer.api.configuration.IConfigurationMemento;

/**
 * This class is able to retrieve old configurations values.
 * 
 * @author Yann Mortier
 */
public class ConfigurationMemento implements IConfigurationMemento {

	private static final String STRATEGY_PREFIX = "strategy";
	private static final String REFINERY_PREFIX = "refinery";
	private static final String GENERATOR_PREFIX = "generator";

	private static final String DESTINATION_FOLDER_PREFIX = "destinationFolder";

	private static final String IDENTIFIER_SEPARATOR = ".";

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.polarsys.kitalpha.composer.internal.configuration.IConfigurationMemento#restore(org.polarsys.kitalpha.composer.api.configuration.CodeManagerConfiguration)
	 */
	public void restore(CodeManagerConfiguration configuration)
			throws CoreException {
		String configurationKey = configuration.getStrategy().getClass()
				.getName()
				+ IDENTIFIER_SEPARATOR
				+ configuration.getRefinery().getClass().getName()
				+ configuration.getStrategy().getClass().getName();
		restore(configuration, configurationKey);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.polarsys.kitalpha.composer.internal.configuration.IConfigurationMemento#restore(org.polarsys.kitalpha.composer.api.configuration.CodeManagerConfiguration,
	 *      java.lang.String)
	 */
	public void restore(CodeManagerConfiguration configuration,
			String configurationKey) throws CoreException {
		ICodeManagerInput input = configuration.getInput();
		if (!input.isMultipleObjectsInput()) {
			//
			// retrieve for one resource !
			Set<Resource> resources = new HashSet<Resource>();
			for (EObject root : input.getRootsInputs()) {
				if (root.eResource() != null)
					resources.add(root.eResource());
			}
			for (Resource resource : resources) {
				IFile iFile = getFile(resource);
				if (iFile != null
						&& restore(configuration, iFile, configurationKey)) {
					break;
				}
			}
		} else {
			for (EObject eObject : input.getListInput()) {
				if (eObject.eResource() != null) {
					IFile iFile = getFile(eObject.eResource());
					if (iFile != null) {
						boolean isRestored = restore(configuration,
								configurationKey, iFile, eObject);
						if (isRestored)
							break;
					}
				}
			}
		}
	}

	private boolean restore(CodeManagerConfiguration configuration,
			String configurationKey, IResource resource, EObject eObject)
			throws CoreException {
		boolean isRestored = false;

		EObject current = eObject;
		while (current != null && !isRestored) {
			String uriFragment = current.eResource().getURIFragment(current);
			isRestored = restore(configuration, resource, configurationKey
					+ IDENTIFIER_SEPARATOR + uriFragment);
			if (!isRestored)
				current = current.eContainer();
		}
		if (!isRestored)
			isRestored = restore(configuration, resource, configurationKey);

		return isRestored;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.polarsys.kitalpha.composer.internal.configuration.IConfigurationMemento#save(org.polarsys.kitalpha.composer.api.configuration.CodeManagerConfiguration)
	 */
	public void save(CodeManagerConfiguration configuration)
			throws CoreException {
		String configurationKey = configuration.getStrategy().getClass()
				.getName()
				+ IDENTIFIER_SEPARATOR
				+ configuration.getRefinery().getClass().getName()
				+ configuration.getStrategy().getClass().getName();
		save(configuration, configurationKey);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.polarsys.kitalpha.composer.internal.configuration.IConfigurationMemento#save(org.polarsys.kitalpha.composer.api.configuration.CodeManagerConfiguration,
	 *      java.lang.String)
	 */
	public void save(CodeManagerConfiguration configuration,
			String configurationKey) throws CoreException {
		ICodeManagerInput input = configuration.getInput();
		if (!input.isMultipleObjectsInput()) {
			Set<Resource> resources = new HashSet<Resource>();
			for (EObject root : input.getRootsInputs()) {
				if (root.eResource() != null)
					resources.add(root.eResource());
			}
			for (Resource resource : resources) {
				IFile iFile = getFile(resource);
				if (iFile != null)
					save(configuration, iFile, configurationKey);
			}
		} else {
			for (EObject eObject : input.getListInput()) {
				if (eObject.eResource() != null) {
					String uriFragment = eObject.eResource().getURIFragment(
							eObject);
					IFile iFile = getFile(eObject.eResource());
					if (iFile != null)
						save(configuration, iFile, configurationKey
								+ IDENTIFIER_SEPARATOR + uriFragment);
				}
			}
		}
	}

	private boolean restore(CodeManagerConfiguration configuration,
			IResource resource, String keySuffix) throws CoreException {
		boolean isRestored = false;

		//
		// destination folder
		String prefix = keySuffix == null || keySuffix.length() == 0 ? DESTINATION_FOLDER_PREFIX
				: DESTINATION_FOLDER_PREFIX + IDENTIFIER_SEPARATOR + keySuffix;
		String value = resource.getPersistentProperty(new QualifiedName(DESTINATION_FOLDER_PREFIX,
				prefix));
		if (value != null) {
			isRestored = true;
			configuration.setDestinationFolder(new Path(value));
		}

		//
		// strategy
		prefix = keySuffix == null || keySuffix.length() == 0 ? STRATEGY_PREFIX
				: STRATEGY_PREFIX + IDENTIFIER_SEPARATOR + keySuffix;
		isRestored = restore(configuration.getStrategyParameters(), resource,
				prefix)
				|| isRestored;

		//
		// refinery
		prefix = keySuffix == null || keySuffix.length() == 0 ? REFINERY_PREFIX
				: REFINERY_PREFIX + IDENTIFIER_SEPARATOR + keySuffix;
		isRestored = restore(configuration.getRefineryParameters(), resource,
				prefix)
				|| isRestored;

		//
		// generator
		prefix = keySuffix == null || keySuffix.length() == 0 ? GENERATOR_PREFIX
				: GENERATOR_PREFIX + IDENTIFIER_SEPARATOR + keySuffix;
		isRestored = restore(configuration.getGeneratorParameters(), resource,
				prefix)
				|| isRestored;

		return isRestored;
	}

	private boolean restore(Map<String, Parameter> parameters,
			IResource resource, String prefix) throws CoreException {
		boolean isRestored = false;

		for (Entry<String, Parameter> parameter : parameters.entrySet()) {
			String value = resource.getPersistentProperty(new QualifiedName(
					prefix, parameter.getKey()));
			if (value != null) {
				isRestored = true;
				parameter.getValue().setValue(value);
			}
		}

		return isRestored;
	}

	private void save(CodeManagerConfiguration configuration,
			IResource resource, String keySuffix) throws CoreException {

		//
		// destination folder.
		String prefix = keySuffix == null || keySuffix.length() == 0 ? DESTINATION_FOLDER_PREFIX
				: DESTINATION_FOLDER_PREFIX + IDENTIFIER_SEPARATOR + keySuffix;
		String destinationFolder = configuration.getDestinationFolder() == null ? null
				: configuration.getDestinationFolder().toString();
		resource.setPersistentProperty(new QualifiedName(DESTINATION_FOLDER_PREFIX, prefix),
				destinationFolder);

		//
		// strategy
		prefix = keySuffix == null || keySuffix.length() == 0 ? STRATEGY_PREFIX
				: STRATEGY_PREFIX + IDENTIFIER_SEPARATOR + keySuffix;
		save(configuration.getStrategyParameters(), resource, prefix);

		//
		// refinery
		prefix = keySuffix == null || keySuffix.length() == 0 ? REFINERY_PREFIX
				: REFINERY_PREFIX + IDENTIFIER_SEPARATOR + keySuffix;
		save(configuration.getRefineryParameters(), resource, prefix);

		//
		// generator
		prefix = keySuffix == null || keySuffix.length() == 0 ? GENERATOR_PREFIX
				: GENERATOR_PREFIX + IDENTIFIER_SEPARATOR + keySuffix;
		save(configuration.getGeneratorParameters(), resource, prefix);

	}

	private void save(Map<String, Parameter> parameters, IResource resource,
			String prefix) throws CoreException {
		for (Entry<String, Parameter> parameter : parameters.entrySet()) {
			resource.setPersistentProperty(new QualifiedName(prefix, parameter
					.getKey()), parameter.getValue().getValue());
		}
	}

	private IFile getFile(Resource resource) {
		if (resource.getURI() != null && resource.getURI().isPlatformResource()) {
			return ResourcesPlugin.getWorkspace().getRoot().getFile(
					new Path(resource.getURI().toPlatformString(true)));
		}
		return null;
	}
}
