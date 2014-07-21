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


package org.polarsys.kitalpha.transposer.scheduler.api;

/**
 * @author GEBHART Guillaume
 * 
 */
public interface ITransposerTask<TaskContent> {

  /**
   * @return the taskContent
   */
  public TaskContent getTaskContent();

  /**
   * @return the isCompletelyTransposable
   */
  public boolean isCompletelyTransposable();

  /**
   * @param isCompletelyTransposable_p the isCompletelyTransposable to set
   */
  public void setCompletelyTransposable(boolean isCompletelyTransposable_p);

  /**
   * @param taskContent_p the taskContent to set
   */
  public void setTaskContent(TaskContent taskContent_p);

}
