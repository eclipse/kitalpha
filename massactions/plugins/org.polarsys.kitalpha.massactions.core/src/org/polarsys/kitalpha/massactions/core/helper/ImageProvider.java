/*******************************************************************************
 * Copyright (c) 2019, 2020 THALES GLOBAL SERVICES.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.massactions.core.helper;

import org.eclipse.swt.graphics.Image;

public interface ImageProvider {

  /**
   * Get the image for given object
   * 
   * @param object
   *          the object
   * @return<code>null</code> if one of parameters is <code>null</code> or if no image is found.
   */
  Image getImage(Object object);
}
