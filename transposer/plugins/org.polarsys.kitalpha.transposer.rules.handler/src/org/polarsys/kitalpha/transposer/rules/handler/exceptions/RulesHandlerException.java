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


package org.polarsys.kitalpha.transposer.rules.handler.exceptions;

import org.polarsys.kitalpha.transposer.rules.handler.business.GenericRulesHandler;
import org.polarsys.kitalpha.transposer.rules.handler.exceptions.rules.RuleExecutionException;
import org.polarsys.kitalpha.transposer.rules.handler.exceptions.rules.RuleResolutionException;

/**
 * @author Franco Bergomi
 */
public class RulesHandlerException extends Exception {

  RuleResolutionException _ruleResolutionException;
  RuleExecutionException _ruleExecutionException;
  Exception _ruleException;

  /**
   * @param ruleResolutionException_p
   */
  public RulesHandlerException(RuleResolutionException ruleResolutionException_p) {
    _ruleResolutionException = ruleResolutionException_p;
  }

  /**
   * @param ruleExecutionException_p
   */
  public RulesHandlerException(RuleExecutionException ruleExecutionException_p) {
    _ruleExecutionException = ruleExecutionException_p;
  }

  /**
   * @param ruleException_p
   */
  public RulesHandlerException(Exception ruleException_p) {
    _ruleException = ruleException_p;
  }

  /**
   * 
   */
  private static final long serialVersionUID = -5325360737471348622L;

  /**
   * @see java.lang.Throwable#toString()
   */
  @Override
  public String toString() {
    StringBuffer sb = new StringBuffer();
    StackTraceElement[] trace;

    sb.append("\n" + super.toString()); //$NON-NLS-1$

    if (null != _ruleException) {
      sb.append("\n" + _ruleException.toString()); //$NON-NLS-1$

      trace = _ruleException.getStackTrace();
      for (StackTraceElement stackTraceElement : trace) {
        if (stackTraceElement.getClassName().equals(GenericRulesHandler.class.getName()))
          return sb.toString();

        sb.append("\nat " + stackTraceElement.toString()); //$NON-NLS-1$
      }
      return sb.toString();
    }

    if (null != _ruleExecutionException) {
      sb.append("\n" + _ruleExecutionException.toString()); //$NON-NLS-1$

      trace = _ruleExecutionException.getStackTrace();
      for (StackTraceElement stackTraceElement : trace) {
        if (stackTraceElement.getClassName().equals(GenericRulesHandler.class.getName()))
          return sb.toString();

        sb.append("\nat " + stackTraceElement.toString()); //$NON-NLS-1$
      }
      return sb.toString();
    }

    if (null != _ruleResolutionException) {
      sb.append("\n" + _ruleResolutionException.toString()); //$NON-NLS-1$

      trace = _ruleResolutionException.getStackTrace();
      for (StackTraceElement stackTraceElement : trace) {

        if (stackTraceElement.getClassName().equals(GenericRulesHandler.class.getName()))
          return sb.toString();

        sb.append("\nat " + stackTraceElement.toString()); //$NON-NLS-1$
      }

      return sb.toString();
    }

    return super.toString();
  }
}
