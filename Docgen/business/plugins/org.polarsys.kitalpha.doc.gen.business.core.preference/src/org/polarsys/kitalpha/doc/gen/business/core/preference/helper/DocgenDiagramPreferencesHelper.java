/*******************************************************************************
 * Copyright (c) 2016, 2019 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.doc.gen.business.core.preference.helper;

import org.eclipse.sirius.common.tools.api.resource.ImageFileFormat;

/**
 * @author Boubekeur Zendagui
 */
public class DocgenDiagramPreferencesHelper extends AbstractDocgenPreferencesHelper {
	
	 /** Default extension image. */
    public static final ImageFileFormat IMAGE_FORMAT_DEFAULT_VALUE = ImageFileFormat.JPG;
    public static final ImageFileFormat[] IMAGE_FORMAT_SAFE_VALUES = { IMAGE_FORMAT_DEFAULT_VALUE, ImageFileFormat.PNG, /*ImageFileFormat.SVG,*/ ImageFileFormat.BMP, ImageFileFormat.GIF };
	
	/**
	 * @return the value of the image alternate text preference
	 */
	public static boolean getExportDiagram(){
		return getCustomizedBooleanValue(DocgenPreferenceConstant.DOCGEN_DIAGRAMS_EXPORT);
	}
	
	/**
	 * @return the value of the image alternate text preference
	 */
	public static String getImageFormat(){
		return getCustomizedStringValue(DocgenPreferenceConstant.DOCGEN_DIAGRAMS_IMAGE_FORMAT);
	}
	
	/**
	 * @return the file extension chosen by the end-user in the preferences
	 */
	public static String getImageFileExtension() {
		String imageFormat = DocgenDiagramPreferencesHelper.getImageFormat();
		return imageFormat != null && ! imageFormat.isEmpty() ? imageFormat : DocgenDiagramPreferencesHelper.IMAGE_FORMAT_DEFAULT_VALUE.getName();
	}
	
	public static ImageFileFormat getImageFileFormat() {
		String imageFileExtension = getImageFileExtension();
		for (ImageFileFormat imageFileFormat : DocgenDiagramPreferencesHelper.IMAGE_FORMAT_SAFE_VALUES) {
			if (imageFileFormat.getName().equalsIgnoreCase(imageFileExtension)) {
				return imageFileFormat;
			}
		}
		return DocgenDiagramPreferencesHelper.IMAGE_FORMAT_DEFAULT_VALUE;
	}
	
	/**
	 * Set copyright preference to it default value.
	 */
	public static void restorExportDiagramDefaultValues(){
		STORE.setDefault(DocgenPreferenceConstant.DOCGEN_DIAGRAMS_EXPORT, 
						 DocgenPreferenceConstant.DOCGEN_DIAGRAMS_EXPORT_DEFAULT_VALUE);
	
		STORE.setDefault(DocgenPreferenceConstant.DOCGEN_DIAGRAMS_IMAGE_FORMAT, 
				 DocgenPreferenceConstant.DOCGEN_DIAGRAMS_IMAGE_FORMAT_DEFAULT_VALUE);
	}
}
