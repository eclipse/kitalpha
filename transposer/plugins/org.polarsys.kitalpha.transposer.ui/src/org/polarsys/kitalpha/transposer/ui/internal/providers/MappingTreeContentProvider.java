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


package org.polarsys.kitalpha.transposer.ui.internal.providers;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping;
import org.polarsys.kitalpha.transposer.rules.handler.rules.contribution.ContributedPurpose;

/**
 * @author Guillaume Gebhart
 * 
 */
public class MappingTreeContentProvider extends ArrayContentProvider implements ITreeContentProvider {


  /**
   * @see org.eclipse.jface.viewers.ITreeContentProvider#getChildren(java.lang.Object)
   */
  @Override
public Object[] getChildren(Object arg0_p) {
    if (arg0_p instanceof Mapping) {
      return getChildrenForPurpose((Mapping) arg0_p);
    }
    return null;
  }

  /**
   * @see org.eclipse.jface.viewers.ITreeContentProvider#getParent(java.lang.Object)
   */
  @Override
public Object getParent(Object arg0_p) {
    if (arg0_p instanceof Mapping) {
      return ((Mapping) arg0_p).getExtendedMapping();
    }
    return null;
  }

  /**
   * @see org.eclipse.jface.viewers.ITreeContentProvider#hasChildren(java.lang.Object)
   */
  @Override
public boolean hasChildren(Object arg0_p) {
    if (arg0_p instanceof Mapping) {
      return ((Mapping) arg0_p).getExtenders().size() > 0;
    }
    return false;
  }

  /**
   * @see org.eclipse.jface.viewers.ArrayContentProvider#getElements(java.lang.Object)
   */
  @Override
  public Object[] getElements(Object inputElement_p) {
    if (inputElement_p instanceof ContributedPurpose) {
      Mapping rootMapping = null;
      rootMapping = ((ContributedPurpose) inputElement_p).getMostGenericMapping();
      return new Object[] { rootMapping, };
    }

    if (inputElement_p instanceof Mapping) {
      return getChildrenForPurpose((Mapping) inputElement_p);
    }

    return super.getElements(inputElement_p);
  }

  /**
   * @param arg0_p
   * @return
   */
  private Object[] getChildrenForPurpose(Mapping mapping_p) {
    return mapping_p.getExtendersWithSamePurpose().toArray();
  }

}
