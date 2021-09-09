/*********************************************************************
 * Copyright (c) 2016-2019 Thales Global Services S.A.S.
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

import java.util.Collection;
import java.util.Collections;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.diffmerge.api.scopes.IEditableModelScope;
import org.eclipse.emf.diffmerge.api.scopes.IPersistentModelScope;
import org.eclipse.emf.diffmerge.bridge.operations.AbstractBridgeOperation;
import org.eclipse.emf.diffmerge.bridge.util.INormalizableModelScope;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.polarsys.kitalpha.transposer.api.ITransposer;
import org.polarsys.kitalpha.transposer.api.TransposerConfiguration;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.transformation.emf.resource.ResourceUtil;


/**
 * An operation that executes a Transposer bridge between data scopes.
 */
public class TransposerBridgeOperation extends AbstractBridgeOperation {
  
  /** The optional Transposer configuration */
  private final TransposerConfiguration _configuration;
  
  
  /**
   * Constructor
   * @param sourceDataSet_p the non-null set of source objects
   * @param targetDataSet_p the non-null target data set
   * @param bridge_p the non-null bridge to execute
   * @param execution_p a non-null execution for the bridge
   */
  public TransposerBridgeOperation(Object sourceDataSet_p,
      IEditableModelScope targetDataSet_p, TransposerBridge<?> bridge_p,
      TransposerConfiguration configuration_p, TransposerBridgeExecution execution_p) {
    super((sourceDataSet_p instanceof Collection<?>)? (Collection<?>)sourceDataSet_p:
      Collections.singleton(sourceDataSet_p),
      targetDataSet_p, bridge_p, execution_p);
    _configuration = configuration_p;
  }
  
  /**
   * @see org.eclipse.emf.diffmerge.generic.util.IExpensiveOperation#run()
   */
  public IStatus run() {
    IStatus result;
    TransposerBridge<?> bridge = getBridge();
    ITransposer transposer = bridge.getTransposer();
    TransposerConfiguration configuration = getTransposerConfiguration();
    if (configuration == null)
      configuration = new TransposerConfiguration();
    try {
      Collection<Object> sourceElements = getSourceDataSet();
      // Execution setup
      IContext context = transposer.getRulesHandler().getContext();
      TransposerBridgeContext contextWrapper =
          new TransposerBridgeContext(context, getBridgeExecution());
      getBridgeExecution().setup(getTargetDataSet(), contextWrapper);
      // Context initialization
      initializeContext(contextWrapper);
      // Transposer execution
      transposer.getRulesHandler().setContext(contextWrapper);
      getLogger().info(Messages.bridgeLoggerTransposerRunStepMessage);  
      transposer.transpose(sourceElements, configuration, null, getMonitor());
      // End
      if (getTargetDataSet() instanceof INormalizableModelScope) {
        ((INormalizableModelScope)getTargetDataSet()).normalize();
      }
      transposer.dispose();
      getMonitor().worked(1);
      result = Status.OK_STATUS;
    } catch (OperationCanceledException e) {
      result = Status.CANCEL_STATUS;
    }
    return result;
  }
  
  /**
   * @see org.eclipse.emf.diffmerge.bridge.operations.AbstractBridgeOperation#getBridge()
   */
  @Override
  @SuppressWarnings("unchecked")
  public TransposerBridge<Collection<Object>> getBridge() {
    return (TransposerBridge<Collection<Object>>)super.getBridge();
  }
  
  /**
   * @see org.eclipse.emf.diffmerge.bridge.operations.AbstractBridgeOperation#getBridgeExecution()
   */
  @Override
  public TransposerBridgeExecution getBridgeExecution() {
    return (TransposerBridgeExecution)super.getBridgeExecution();
  }
  
  /**
   * @see org.eclipse.emf.diffmerge.bridge.operations.AbstractBridgeOperation#getSourceDataSet()
   */
  @Override
  @SuppressWarnings("unchecked")
  public Collection<Object> getSourceDataSet() {
    return (Collection<Object>)super.getSourceDataSet();
  }
  
  /**
   * @see org.eclipse.emf.diffmerge.bridge.operations.AbstractBridgeOperation#getTargetDataSet()
   */
  @Override
  public IEditableModelScope getTargetDataSet() {
    return (IEditableModelScope)super.getTargetDataSet();
  }
  
  /**
   * Return the optional Transposer configuration
   * @return a potentially null object
   */
  protected TransposerConfiguration getTransposerConfiguration() {
    return _configuration;
  }
  
  /**
   * @see org.eclipse.emf.diffmerge.impl.helpers.AbstractExpensiveOperation#getWorkAmount()
   */
  @Override
  protected int getWorkAmount() {
    return getBridge().getWorkAmount(getSourceDataSet(), getTargetDataSet());
  }
  
  /**
   * Initialize the given Transposer bridge context before usage, if needed
   * @param context_p a non-null object
   */
  protected void initializeContext(TransposerBridgeContext context_p) {
    IEditableModelScope targetScope = getTargetDataSet();
    if (targetScope instanceof IPersistentModelScope) {
      Resource resource = ((IPersistentModelScope)targetScope).getHoldingResource();
      if (resource != null) {
        ResourceSet rs = resource.getResourceSet();
        context_p.put(ResourceUtil.TRANSPOSER_RESOURCE_SET, rs);
      }
    }
  }
  
}
