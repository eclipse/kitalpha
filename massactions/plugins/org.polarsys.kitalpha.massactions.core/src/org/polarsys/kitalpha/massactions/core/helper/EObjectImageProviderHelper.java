/*******************************************************************************
 * Copyright (c) 2018  Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
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
public class EObjectImageProviderHelper {

	private EObjectImageProviderHelper() {
		// Exists only to defeat instantiation.
	}

	/**
	 * Get the image for given object based on generated item provider.
	 * 
	 * @param object
	 * @return<code>null</code> if one of parameters is <code>null</code> or if
	 *                          no image is found.
	 */
	public static Image getImage(EObject object) {
	
		Object imageObject = null;

		IItemLabelProvider provider = EObjectLabelProviderHelper.getItemLabelProvider(object);

		if (null != provider) {
			imageObject = provider.getImage(object);
		}

		return (null != imageObject) ? extractImageFromObject(imageObject, object) : null;
	}

	/**
	 * Get Image from a object representation of it.
	 * 
	 * @param image
	 * @return <code>null</code> if image creation fails.
	 */
	public static Image extractImageFromObject(Object imageObject, EObject object) {

		Image image = ExtendedImageRegistry.getInstance().getImage(imageObject);

		IDecoratorManager decoratorManager = PlatformUI.getWorkbench().getService(IDecoratorManager.class);
		return decoratorManager.decorateImage(image, object);
	}

}
