/*********************************************************************
 * Copyright (c) 2017-2019 Thales Global Services S.A.S.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S. - initial API and implementation
 **********************************************************************/
package org.polarsys.kitalpha.diffmerge.bridge.integration.transposer;

import org.eclipse.emf.diffmerge.bridge.api.ICause;
import org.eclipse.emf.diffmerge.bridge.impl.emf.EMFSymbolFunction;
import org.eclipse.emf.diffmerge.bridge.util.BaseTraceLoggingMessage;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.transposer.transformation.context.ContextHelper;


/**
 * A trace logging message for Transposer bridge executions.
 */
public class TransposerTraceLoggingMessage extends BaseTraceLoggingMessage {
  
  /**
   * Default constructor
   * @param context_p the (non-null) Transposer context 
   * @param target_p the (non-null) target object
   * @param cause_p the (non-null) presence cause
   */
  public TransposerTraceLoggingMessage(
      TransposerBridgeContext context_p, Object target_p, ICause<?> cause_p) {
    super(target_p, cause_p);
  }
  
  /**
   * @see org.eclipse.emf.diffmerge.bridge.util.AbstractLoggingMessage#getPrefix()
   */
  @Override
  protected String getPrefix() {
    return "\t|\t|__Produced "; //$NON-NLS-1$
  }
  
  /**
   * @see org.eclipse.emf.diffmerge.bridge.util.AbstractLoggingMessage#getMessageBody()
   */
  @Override
  protected String getMessageBody() {
    StringBuilder builder = new StringBuilder("("); //$NON-NLS-1$
    builder.append(getTarget().getClass().getSimpleName()).append(" \""); //$NON-NLS-1$
    builder.append(getObjectLabel(getTarget())).append("\""); //$NON-NLS-1$
    final EMFSymbolFunction function = EMFSymbolFunction.getInstance();
    //append the identifier inside the message using symbol function. 
    builder.append("[").append(function.getSymbol(getTarget())).append("]");//$NON-NLS-1$ //$NON-NLS-2$
    //source however can be a single object or a tuple
    builder.append(") From {"); //$NON-NLS-1$
    for (Object source : getCause().getSourceElements()) {
      String sourceName = getObjectLabel(source);
      String sourceType = ((EObject) source).eClass().getName();
      builder.append("("); //$NON-NLS-1$
      builder.append(sourceType).append(" \""); //$NON-NLS-1$
      builder.append(sourceName).append("\""); //$NON-NLS-1$
      builder.append("[").append(function.getSymbol(source)).append("])");//$NON-NLS-1$ //$NON-NLS-2$
    }
    String role = ((TransposerBridgeCause) getCause()).getTransformationKey().getRole();
    if (!role.equals(ContextHelper.MAIN_ROLE))
      builder.append("|").append(role); //$NON-NLS-1$
    builder.append("}"); //$NON-NLS-1$
    return builder.toString();
  }
  
}