/*******************************************************************************
 * Copyright (c) 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation
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
