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

package org.polarsys.kitalpha.transposer.rules.handler.business.premises;

/**
 * @author David Baudon
 * 
 */
public class ContainmentPremise<MetaClass> extends PrecedencePremise<MetaClass> {

  /**
   * @param firstElement_p
   */
  public ContainmentPremise(MetaClass firstElement_p) {
    super(firstElement_p, "container"); //$NON-NLS-1$
    setCritical(true);
  }

}
