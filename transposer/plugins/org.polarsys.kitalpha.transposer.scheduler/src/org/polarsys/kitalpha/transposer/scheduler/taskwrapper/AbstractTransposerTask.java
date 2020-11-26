/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.transposer.scheduler.taskwrapper;

import org.polarsys.kitalpha.transposer.scheduler.api.ITransposerTask;

/**
 * @author Franco Bergomi
 */
public abstract class AbstractTransposerTask<TaskContent> implements ITransposerTask<TaskContent>{

  private boolean _isCompletelyTransposable;
  private TaskContent _taskContent;

  /**
   * 
   */
  public AbstractTransposerTask(TaskContent taskContent_p, boolean isCompletelyTransposable_p) {
    setTaskContent(taskContent_p);
    setCompletelyTransposable(isCompletelyTransposable_p);
  }

  /**
   * @return the taskContent
   */
  @Override
public TaskContent getTaskContent() {
    return _taskContent;
  }

  /**
   * @return the isCompletelyTransposable
   */
  @Override
public boolean isCompletelyTransposable() {
    return _isCompletelyTransposable;
  }

  /**
   * @param isCompletelyTransposable_p the isCompletelyTransposable to set
   */
  @Override
public void setCompletelyTransposable(boolean isCompletelyTransposable_p) {
    _isCompletelyTransposable = isCompletelyTransposable_p;
  }

  /**
   * @param taskContent_p the taskContent to set
   */
  @Override
public void setTaskContent(TaskContent taskContent_p) {
    _taskContent = taskContent_p;
  }
}