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


package org.polarsys.kitalpha.transposer.rules.handler.util;

/**
 * @author Franco Bergomi
 * 
 */
public class AbstractDoublet<A, B> implements Doublet<A, B> {
  private A _firstElement;
  private B _secondElement;

  /**
   * @param firstElement_p
   * @param secondElement_p
   */
  @SuppressWarnings("nls")
  public AbstractDoublet(A firstElement_p, B secondElement_p) {
    _firstElement = firstElement_p;
    _secondElement = secondElement_p;
  }

  public A getFirstElement() {
    return _firstElement;
  }

  public void setFirstElement(A firstElement_p) {
    _firstElement = firstElement_p;
  }

  public B getSecondElement() {
    return _secondElement;
  }

  public void setSecondElement(B secondElement_p) {
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
