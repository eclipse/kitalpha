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

package org.polarsys.kitalpha.transposer.rules.handler.contexts;



import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;

/**
 * @author Franco Bergomi
 * 
 */
public abstract class AbstractContext implements IContext {

  protected HashMap<Object, Object> _repository;

  /**
   * 
   */
  public AbstractContext() {
    _repository = new HashMap<Object, Object>();
  }

  /**
   * @see org.polarsys.kitalpha.ccm.rules.handler.common.interfaces.IContext#exists(java.lang.String)
   */
  public boolean exists(Object object_p) {
    return (_repository.containsKey(object_p));
  }

  /**
   * @see org.polarsys.kitalpha.ccm.rules.handler.common.interfaces.IContext#get(java.lang.String)
   */
  public Object get(Object object_p) {
    return _repository.get(object_p);
  }

  @SuppressWarnings("nls")
  abstract public String getName();

  /**
   * @see org.polarsys.kitalpha.ccm.rules.handler.common.interfaces.IContext#getKeys()
   */
  public EList<Object> getKeys() {
    return new BasicEList<Object>(_repository.keySet());
  }

  /**
   * @see org.polarsys.kitalpha.ccm.rules.handler.common.interfaces.IContext#init(org.polarsys.kitalpha.ccm.rules.handler.common.interfaces.IContext)
   */
  public void initWith(IContext context_p) {
    reset();
    updateWith(context_p);
  }

  /**
   * @see org.polarsys.kitalpha.ccm.rules.handler.common.interfaces.IContext#init(org.polarsys.kitalpha.ccm.rules.handler.common.interfaces.IContext)
   */
  public void updateWith(IContext context_p) {
    if (context_p == null) {
      return;
    }

    List<Object> keys = context_p.getKeys();
    for (Object obj : keys) {
      put(obj, context_p.get(obj));
    }
  }

  /**
   * @see org.polarsys.kitalpha.ccm.rules.handler.common.interfaces.IContext#put(java.lang.String, java.lang.Object)
   */
  public void put(Object object_p, Object value_p) {
    _repository.put(object_p, value_p);
  }

  /**
   * @see org.polarsys.kitalpha.ccm.rules.handler.common.interfaces.IContext#reset()
   */
  public void reset() {
    _repository.clear();
  }

  public abstract void setUpForModelElement(Object object_p);

  /**
   * @see java.lang.Object#toString()
   */
  @SuppressWarnings("nls")
  @Override
  public String toString() {
    StringBuffer sb = new StringBuffer();
    EList<Object> keys = getKeys();
    for (Object obj : keys) {
      sb.append("\t<" + obj.toString() + ">  ->  <" + get(obj).toString() + ">\n");
    }
    return sb.toString();
  }

}