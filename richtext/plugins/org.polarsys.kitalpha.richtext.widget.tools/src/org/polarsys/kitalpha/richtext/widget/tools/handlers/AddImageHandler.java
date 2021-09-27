/*******************************************************************************
 * Copyright (c) 2017, 2021 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.richtext.widget.tools.handlers;

import java.util.List;

import org.eclipse.sirius.business.api.image.ImageManager;
import org.eclipse.sirius.business.api.image.ImageManagerProvider;
import org.eclipse.sirius.diagram.ui.business.api.image.ImageSelector;
import org.eclipse.sirius.diagram.ui.business.api.image.ImageSelectorService;
import org.polarsys.kitalpha.richtext.common.intf.MDERichTextWidget;
import org.polarsys.kitalpha.richtext.nebula.widget.toolbar.MDERichTextToolbarItemHandler;

/**
 * @author Faycal Abka
 */
public class AddImageHandler implements MDERichTextToolbarItemHandler {

  @Override
	public void execute(MDERichTextWidget richText) {
		ImageSelector imageSelector = ImageSelectorService.INSTANCE.getImageSelector();
		List<String> imagePaths = imageSelector.selectImages(richText.getElement(),
				ImageSelector.SelectionMode.MONO_SELECTION);

		ImageManager imageManager = ImageManagerProvider.getImageManager();
		for (String originalPath : imagePaths) {
			originalPath = originalPath.replace("\\", "/");
			String imageTag = "<img src=\"" + originalPath + "\"/>";
			imageTag = imageManager.computeAndConvertPathsToHtmlFromOriginal(richText.getElement(), imageTag);
			richText.insertRawText(imageTag);
		}
	}
}
