/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.composer.api.configuration;

import org.eclipse.core.runtime.CoreException;

import org.polarsys.kitalpha.composer.internal.configuration.ConfigurationMemento;

public interface IConfigurationMemento {

	IConfigurationMemento INSTANCE = new ConfigurationMemento();

	void restore(CodeManagerConfiguration configuration) throws CoreException;

	void restore(CodeManagerConfiguration configuration, String configurationKey)
			throws CoreException;

	void save(CodeManagerConfiguration configuration) throws CoreException;

	void save(CodeManagerConfiguration configuration, String configurationKey)
			throws CoreException;

}