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
