/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.transposer.generic;

import org.polarsys.kitalpha.transposer.rules.handler.contexts.AbstractContext;

/**
 * @author Guillaume Gebhart
 * 
 */
public class GenericContext extends AbstractContext {

  /**
   * @see org.polarsys.kitalpha.transposer.rules.handler.contexts.AbstractContextImpl#getName()
   */
  @Override
  public String getName() {
    return this.getClass().getSimpleName();
  }

  /**
   * @see org.polarsys.kitalpha.transposer.rules.handler.contexts.AbstractContextImpl#setUpForModelElement(java.lang.Object)
   */
  @Override
  public void setUpForModelElement(Object object_p) {
    // Nothing to do;
  }

}
