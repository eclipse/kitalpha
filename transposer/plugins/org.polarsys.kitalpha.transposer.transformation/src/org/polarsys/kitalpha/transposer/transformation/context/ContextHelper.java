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


package org.polarsys.kitalpha.transposer.transformation.context;

import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;

/**
 * @author GEBHART Guillaume
 *
 */
public class ContextHelper {
  
  public static String MAIN_ROLE = "transposer.transformation.role.main"; //$NON-NLS-1$
  
  public static Object getMainTarget(IContext context_p, Object element_p) {
    return getTarget(context_p, element_p, MAIN_ROLE);
  }

  public static Object getTarget(IContext context_p, Object element_p, String role_p) {
    TransformationKey key = new TransformationKey(element_p, role_p);
    return context_p.get(key);
  }
  
  public static boolean existsTarget(IContext context_p, Object element_p, String role_p) {
    TransformationKey key = new TransformationKey(element_p, role_p);
    return context_p.exists(key);
  }

  public static void createMainTarget(IContext context_p, Object element_p, Object target_p) {
    createTarget(context_p, element_p, MAIN_ROLE, target_p);
  }

  public static void createTarget(IContext context_p, Object element_p, String role_p, Object target_p) {
    TransformationKey key = new TransformationKey(element_p, role_p);
    context_p.put(key, target_p);
  }
}
