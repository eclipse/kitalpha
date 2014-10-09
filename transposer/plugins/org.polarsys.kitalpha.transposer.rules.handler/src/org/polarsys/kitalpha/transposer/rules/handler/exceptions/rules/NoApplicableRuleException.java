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


package org.polarsys.kitalpha.transposer.rules.handler.exceptions.rules;

import java.util.List;

import org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingElement;
import org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingPossibility;


/**
 * @author Franco Bergomi
 * 
 */
public class NoApplicableRuleException extends NoAvailableRuleException {

  private Object _incriminatedEObject;
  private MappingElement _mappingElement;

  /**
   * @param object_p
   * @param mappingElement_p
   */
  public NoApplicableRuleException(Object object_p, MappingElement mappingElement_p) {
    _incriminatedEObject = object_p;
    _mappingElement = mappingElement_p;
  }

  /**
   * 
   */
  private static final long serialVersionUID = 5413780373615523522L;

  /**
   * @see org.polarsys.kitalpha.transposer.rules.handler.exceptions.rules.NoAvailableRuleException#toString()
   */
  @SuppressWarnings("nls")
  @Override
  public String toString() {
    StringBuffer sb = new StringBuffer();
    sb.append("There were no applicable Rules for this EObject : \n");
    sb.append(_incriminatedEObject);
    sb.append("None of the following rules is applicable on this EObject : \n");

    List<MappingPossibility> possibilities = _mappingElement.getAllPossibilities();
    for (MappingPossibility mappingPossibility : possibilities) {
      sb.append(mappingPossibility.getCompleteRule().getName());
      if (null != mappingPossibility.getIncompleteRule())
        sb.append(mappingPossibility.getIncompleteRule().getName());
    }

    return sb + super.toString();
  }

}
