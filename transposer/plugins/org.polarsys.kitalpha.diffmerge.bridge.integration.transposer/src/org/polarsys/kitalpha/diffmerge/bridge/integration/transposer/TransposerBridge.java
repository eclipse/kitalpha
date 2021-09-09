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

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.diffmerge.api.scopes.IEditableModelScope;
import org.eclipse.emf.diffmerge.bridge.api.IBridge;
import org.eclipse.emf.diffmerge.bridge.api.IBridgeExecution;
import org.eclipse.emf.diffmerge.bridge.api.IBridgeTrace;
import org.eclipse.emf.diffmerge.bridge.impl.AbstractBridge;
import org.polarsys.kitalpha.transposer.api.ITransposer;
import org.polarsys.kitalpha.transposer.api.TransposerConfiguration;
import org.polarsys.kitalpha.transposer.generic.GenericTransposer;


/**
 * A bridge that wraps a Transposer transformation to an EMF instance model.
 * @see IBridge
 * @see ITransposer
 * @param <S> the type of the source data set
 */
public class TransposerBridge<S> extends AbstractBridge<S, IEditableModelScope> {
  
  /** The non-null Transposer transformation */
  private final ITransposer _transposer;
  
  /** The optional Transposer configuration */
  private final TransposerConfiguration _configuration;
  
  
  /**
   * Constructor
   * @param purposeID_p a non-null Transposer purpose ID
   * @param mappingID_p a non-null Transposer mapping ID belonging to the purpose
   */
  public TransposerBridge(String purposeID_p, final String mappingID_p) {
    this(new GenericTransposer(purposeID_p, mappingID_p));
  }
  
  /**
   * Constructor
   * @param transposer_p a non-null Transposer transformation
   */
  public TransposerBridge(ITransposer transposer_p ) {
    this(transposer_p, null);
  }
  
  /**
   * Constructor
   * @param transposer_p a non-null Transposer transformation
   * @param configuration_p an optional Transposer configuration
   */
  public TransposerBridge(ITransposer transposer_p, TransposerConfiguration configuration_p) {
    _transposer = transposer_p;
    _configuration = configuration_p;
  }
  
  /**
   * Create and return a bridge operation for the given source and target data sets and the given execution
   * @param sourceDataSet_p a non-null source data set
   * @param targetDataSet_p a non-null target data set
   * @param execution_p a non-null bridge execution
   * @return a non-null object
   */
  protected TransposerBridgeOperation createBridgeOperation(S sourceDataSet_p,
      IEditableModelScope targetDataSet_p, TransposerBridgeExecution execution_p) {
		return new TransposerBridgeOperation(sourceDataSet_p, targetDataSet_p, this, getTransposerConfiguration(),
				execution_p);
  }
  
  /**
   * @see org.eclipse.emf.diffmerge.bridge.api.IBridge#createExecution(org.eclipse.emf.diffmerge.bridge.api.IBridgeTrace.Editable)
   */
  public TransposerBridgeExecution createExecution(IBridgeTrace.Editable trace_p) {
    return new TransposerBridgeExecution(trace_p, getLogger());
  }
  
  /**
   * @see org.eclipse.emf.diffmerge.bridge.api.IBridge#executeOn(java.lang.Object, java.lang.Object, org.eclipse.emf.diffmerge.bridge.api.IBridgeExecution, org.eclipse.core.runtime.IProgressMonitor)
   */
  public TransposerBridgeExecution executeOn(S sourceDataSet_p, IEditableModelScope targetDataSet_p,
      IBridgeExecution execution_p, IProgressMonitor monitor_p) {
    TransposerBridgeExecution execution;
    if (execution_p instanceof TransposerBridgeExecution)
      execution = (TransposerBridgeExecution) execution_p;
    else
      execution = createExecution(null);
    TransposerBridgeOperation operation = createBridgeOperation(
        sourceDataSet_p, targetDataSet_p, execution);
    operation.run(monitor_p);
    return operation.getBridgeExecution();
  }
  
  /**
   * Return the wrapped Transposer transformation
   * @return a non-null object
   */
  public ITransposer getTransposer() {
    return _transposer;
  }
  
  /**
   * Return the configuration for the Transposer transformation
   * @return a non-null object
   */
  public TransposerConfiguration getTransposerConfiguration() {
    return _configuration;
  }
  
  /**
   * @see org.eclipse.emf.diffmerge.bridge.api.IBridge#getWorkAmount(java.lang.Object, java.lang.Object)
   */
  public int getWorkAmount(S sourceDataSet_p, IEditableModelScope targetDataSet_p) {
    return 1;
  }
  
}
