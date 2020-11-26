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
package org.polarsys.kitalpha.massactions.core.config;

import org.polarsys.kitalpha.massactions.core.table.layer.IMAComponent;

/**
 * A configuration interface for a {@link IMAComponent}.
 * 
 * @author Sandu Postaru
 * 
 */
public interface IMAConfiguration extends IMAComponent {

  /**
   * Apply the current configuration.
   */
  void apply();
}