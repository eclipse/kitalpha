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

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IPremise;
import org.polarsys.kitalpha.transposer.rules.handler.util.Doublet;

/**
 * @author Franco Bergomi
 * 
 */
public class PrecedencePremise<T> extends EObjectImpl implements IPremise, Doublet<T, String> {

  private boolean _isCritical;
  private T _firstElement;
  private String _secondElement;

  /**
   * @param firstElement_p
   * @param secondElement_p
   */
  public PrecedencePremise(T firstElement_p, String secondElement_p) {
    super();
    _firstElement = firstElement_p;
    _secondElement = secondElement_p;
    setCritical(false);
  }

  /**
   * @return the isCritical
   */
  public boolean isCritical() {
    return _isCritical;
  }

  /**
   * @param isCritical_p the isCritical to set
   */
  public void setCritical(boolean isCritical_p) {
    _isCritical = isCritical_p;
  }

  /**
   * @see org.polarsys.kitalpha.transposer.rules.handler.util.Doublet#getFirstElement()
   */
  @Override
public T getFirstElement() {
    return _firstElement;
  }

  /**
   * @see org.polarsys.kitalpha.transposer.rules.handler.util.Doublet#getSecondElement()
   */
  @Override
public String getSecondElement() {
    return _secondElement;
  }

  /**
   * @see org.polarsys.kitalpha.transposer.rules.handler.util.Doublet#setFirstElement(java.lang.Object)
   */
  @Override
public void setFirstElement(T firstElement_p) {
    _firstElement = firstElement_p;
  }

  /**
   * @see org.polarsys.kitalpha.transposer.rules.handler.util.Doublet#setSecondElement(java.lang.Object)
   */
  @Override
public void setSecondElement(String secondElement_p) {
    _secondElement = secondElement_p;
  }

  /**
   * @see java.lang.Object#toString()
   */
  @SuppressWarnings("nls")
  @Override
  public String toString() {
    return "[" + getFirstElement() + " ; " + getSecondElement() + "]";
  }

}
