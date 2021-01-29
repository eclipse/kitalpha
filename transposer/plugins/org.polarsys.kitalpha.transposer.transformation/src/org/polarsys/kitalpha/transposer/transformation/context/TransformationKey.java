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


package org.polarsys.kitalpha.transposer.transformation.context;

/**
 * @author GEBHART Guillaume
 * 
 */
public class TransformationKey {

  private Object _sourceObject = null;
  private String _role = ""; //$NON-NLS-1$

  /**
   * 
   */
  public TransformationKey(Object sourceObject_p, String role_p) {
    this.setRole(role_p);
    this.setSourceObject(sourceObject_p);
  }

  /**
   * @return the role
   */
  public String getRole() {
    return _role;
  }

  /**
   * @return the sourceObject
   */
  public Object getSourceObject() {
    return _sourceObject;
  }

  /**
   * @param role_p the role to set
   */
  public void setRole(String role_p) {
    _role = role_p;
  }

  /**
   * @param sourceObject_p the sourceObject to set
   */
  public void setSourceObject(Object sourceObject_p) {
    _sourceObject = sourceObject_p;
  }

  /**
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((_role == null) ? 0 : _role.hashCode());
    result = prime * result + ((_sourceObject == null) ? 0 : _sourceObject.hashCode());
    return result;
  }

  /**
   * @see java.lang.Object#equals(java.lang.Object)
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
		return true;
	}
    if (obj == null) {
		return false;
	}
    if (getClass() != obj.getClass()) {
		return false;
	}
    final TransformationKey other = (TransformationKey) obj;
    if (_role == null) {
      if (other._role != null) {
		return false;
	}
    } else if (!_role.equals(other._role)) {
		return false;
	}
    if (_sourceObject == null) {
      if (other._sourceObject != null) {
		return false;
	}
    } else if (!_sourceObject.equals(other._sourceObject)) {
		return false;
	}
    return true;
  }

}
