/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
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
  TaskContent getTaskContent();

  /**
   * @return the isCompletelyTransposable
   */
  boolean isCompletelyTransposable();

  /**
   * @param isCompletelyTransposable_p the isCompletelyTransposable to set
   */
  void setCompletelyTransposable(boolean isCompletelyTransposable_p);

  /**
   * @param taskContent_p the taskContent to set
   */
  void setTaskContent(TaskContent taskContent_p);

}
