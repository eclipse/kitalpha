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
  public TaskContent getTaskContent() {
    return _taskContent;
  }

  /**
   * @return the isCompletelyTransposable
   */
  public boolean isCompletelyTransposable() {
    return _isCompletelyTransposable;
  }

  /**
   * @param isCompletelyTransposable_p the isCompletelyTransposable to set
   */
  public void setCompletelyTransposable(boolean isCompletelyTransposable_p) {
    _isCompletelyTransposable = isCompletelyTransposable_p;
  }

  /**
   * @param taskContent_p the taskContent to set
   */
  public void setTaskContent(TaskContent taskContent_p) {
    _taskContent = taskContent_p;
  }
}