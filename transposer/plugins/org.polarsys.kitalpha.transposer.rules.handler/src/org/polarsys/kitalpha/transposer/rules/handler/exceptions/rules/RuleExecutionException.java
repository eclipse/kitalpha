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


package org.polarsys.kitalpha.transposer.rules.handler.exceptions.rules;

/**
 * @author Franco Bergomi
 * 
 */
public class RuleExecutionException extends Exception {

  /**
   * 
   */
  private static final long serialVersionUID = -5349308254672117614L;
  
  public RuleExecutionException(String reason_p) {
    super(reason_p);
  }
  
  public RuleExecutionException(String reason_p, Throwable e) {
    super(reason_p, e);
  }

}
