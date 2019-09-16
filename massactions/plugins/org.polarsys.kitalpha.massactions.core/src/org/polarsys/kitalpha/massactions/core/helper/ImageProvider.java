/*******************************************************************************
 * Copyright (c) 2019 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
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
