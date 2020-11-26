/*******************************************************************************
 * Copyright (c) 2019  Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 *  Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.massactions.core.helper;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IDecoratorManager;
import org.eclipse.ui.PlatformUI;

/**
 * A EObject image provider helper, providing some utility methods.
 * 
 * @author Sandu Postaru
 *
 */
public class EObjectImageProvider implements ImageProvider {

  private static ImageProvider instance;

  public static ImageProvider getInstance() {
    if (instance == null) {
      instance = new EObjectImageProvider();
    }

    return instance;
  }

  /**
   * Get the image for given object based on generated item provider.
   * 
   * @param object
   * @return<code>null</code> if one of parameters is <code>null</code> or if no image is found.
   */
  @Override
  public Image getImage(Object object) {

    if (object instanceof EObject) {
      EObject eObject = (EObject) object;

      Object imageObject = null;

      IItemLabelProvider provider = EObjectLabelProviderHelper.getItemLabelProvider(eObject);

      if (null != provider) {
        imageObject = provider.getImage(eObject);
      }

      return (null != imageObject) ? extractImageFromObject(imageObject, eObject) : null;
    }

    return null;
  }

  /**
   * Get Image from a object representation of it.
   * 
   * @param image
   * @return <code>null</code> if image creation fails.
   */
  protected Image extractImageFromObject(Object imageObject, EObject object) {

    Image image = ExtendedImageRegistry.getInstance().getImage(imageObject);

    IDecoratorManager decoratorManager = PlatformUI.getWorkbench().getService(IDecoratorManager.class);
    return decoratorManager.decorateImage(image, object);
  }

}
