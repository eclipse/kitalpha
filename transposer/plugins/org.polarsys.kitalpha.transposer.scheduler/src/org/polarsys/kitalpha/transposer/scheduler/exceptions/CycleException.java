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

package org.polarsys.kitalpha.transposer.scheduler.exceptions;

/**
 * @author Franco Bergomi
 * 
 */
public class CycleException extends Exception {

  /**
   * 
   */
  public CycleException() {
    super("Cycle Detected, sorting aborted"); //$NON-NLS-1$)
  }

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  /**
   * @see java.lang.Throwable#printStackTrace()
   */
  @Override
  public void printStackTrace() {
    super.printStackTrace();
  }
}
