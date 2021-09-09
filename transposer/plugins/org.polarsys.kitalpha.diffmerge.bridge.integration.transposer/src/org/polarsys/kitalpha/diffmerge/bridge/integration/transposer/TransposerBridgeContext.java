/*********************************************************************
 * Copyright (c) 2015-2019 Thales Global Services S.A.S.
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

import java.util.List;

import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.transformation.context.TransformationKey;


/**
 * A Transposer context that is part of a bridge execution.
 */
public class TransposerBridgeContext implements IContext{
  
  /** The non-null context for the Transposer execution */
  private final IContext _context;
  
  /** The non-null bridge execution */
  private final TransposerBridgeExecution _execution;
  
  
  /**
   * Constructor
   * @param context_p a non-null context for the Transposer execution
   * @param execution_p a non-null bridge execution
   */
  public TransposerBridgeContext(IContext context_p,
      TransposerBridgeExecution execution_p) {
    _context = context_p;
    _execution = execution_p;
  }
  
  /**
   * Register the given value for the given key without notifying the bridge execution
   * @param key_p a non-null object
   * @param value_p a non-null object
   */
  /*package*/ void doPut(Object key_p, Object value_p) {
    _context.put(key_p, value_p);
  }
  
  /**
   * @see org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext#exists(java.lang.Object)
   */
  public boolean exists(Object object_p) {
    return _context.exists(object_p);
  }
  
  /**
   * @see org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext#get(java.lang.Object)
   */
  public Object get(Object object_p) {
    return _context.get(object_p);
  }
  
  /**
   * Return the bridge execution associated to this Transposer context
   * @return a non-null object
   */
  public TransposerBridgeExecution getBridgeExecution() {
    return _execution;
  }
  
  /**
   * @see org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext#getKeys()
   */
  public List<Object> getKeys() {
    return _context.getKeys();
  }
  
  /**
   * @see org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext#getName()
   */
  public String getName() {
    return _context.getName();
  }
  
  /**
   * @see org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext#initWith(org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext)
   */
  public void initWith(IContext object_p) {
    _context.initWith(object_p);
  }
  
  /**
   * @see org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext#put(java.lang.Object, java.lang.Object)
   */
  public void put(Object key_p, Object value_p) {
    doPut(key_p, value_p);
    if (key_p instanceof TransformationKey)
      _execution.doPut((TransformationKey)key_p, value_p);
  }
  
  /**
   * @see org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext#reset()
   */
  public void reset() {
    _context.reset();
  }
  
  /**
   * @see org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext#setUpForModelElement(java.lang.Object)
   */
  public void setUpForModelElement(Object object_p) {
    _context.setUpForModelElement(object_p);
  }
  
  /**
   * @see org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext#updateWith(org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext)
   */
  public void updateWith(IContext context_p) {
    _context.updateWith(context_p);
  }
  
}
