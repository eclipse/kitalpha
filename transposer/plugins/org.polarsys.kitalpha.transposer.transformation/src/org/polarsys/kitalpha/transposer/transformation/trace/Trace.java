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


package org.polarsys.kitalpha.transposer.transformation.trace;

/**
 * Class that represents a Trace. Traces are used for traceability.
 * @author Franco Bergomi
 */
public class Trace {

  private Object source, target;
  private String role;

  /**
   * create a instance of Trace.
   * @param source_p the source EObject
   * @param target_p the target EObject
   * @param role_p the role that will be written on the trace
   */
  public Trace(Object source_p, Object target_p, String role_p) {
    setSource(source_p);
    setTarget(target_p);
    setRole(role_p);
  }

  public Object getSource() {
    return source;
  }

  public void setSource(Object source_p) {
    source = source_p;
  }

  public Object getTarget() {
    return target;
  }

  public void setTarget(Object target_p) {
    target = target_p;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role_p) {
    role = role_p;
  }

  /**
   * @see java.lang.Object#toString()
   */
  @SuppressWarnings("nls")
  @Override
  public String toString() {
    return source + " <<= " + role + " =>> " + target;
  }
}
