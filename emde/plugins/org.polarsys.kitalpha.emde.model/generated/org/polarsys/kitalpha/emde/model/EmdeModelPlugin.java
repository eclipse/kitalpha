/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.emde.model;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;

/**
 * This is the central singleton for the Emde model plugin.
 * <!-- begin-user-doc
 * --> <!-- end-user-doc -->
 * @generated
 */
public final class EmdeModelPlugin extends EMFPlugin {
  /**
   * Keep track of the singleton. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   */
  public static final EmdeModelPlugin INSTANCE = new EmdeModelPlugin();

  /**
   * Keep track of the singleton. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   */
  private static Implementation plugin;

  /**
   * Create the instance.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public EmdeModelPlugin() {
    super(new ResourceLocator[] {});
  }

  /**
   * Returns the singleton instance of the Eclipse plugin.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the singleton instance.
   * @generated
   */
  @Override
  public ResourceLocator getPluginResourceLocator() {
    return plugin;
  }

  /**
   * Returns the singleton instance of the Eclipse plugin.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the singleton instance.
   * @generated
   */
  public static Implementation getPlugin() {
    return plugin;
  }

  /**
   * The actual implementation of the Eclipse <b>Plugin</b>. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public static class Implementation extends EclipsePlugin {
    /**
     * Creates an instance.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Implementation() {
      super();

      // Remember the static instance.
      //
      plugin = this;
    }
  }

}
