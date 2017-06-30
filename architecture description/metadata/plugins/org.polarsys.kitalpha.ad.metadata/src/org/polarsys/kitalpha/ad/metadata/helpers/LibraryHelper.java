/*******************************************************************************
 * Copyright (c) 2017 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.ad.metadata.helpers;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.polarsys.kitalpha.ad.metadata.metadata.Metadata;

/**
 * @author Thomas Guiu
 * 
 */
public class LibraryHelper {

	/**
	 * This method enlists the metadata associated to the lib model into the main model's metadata. 
	 */
	public static void add(ResourceSet set, URI mainModel, URI libModel) {
        URI mainMetadataURI = MetadataHelper.getExpectedMetadataStorageURI(mainModel);
        URI libMetadataURI = MetadataHelper.getExpectedMetadataStorageURI(libModel);

        Metadata mainMetadata = null;
        Metadata libMetadata = null;

        Resource mainMetadataRes = set.getResource(mainMetadataURI, true);
        if (!mainMetadataRes.getContents().isEmpty())
        	mainMetadata = (Metadata)mainMetadataRes.getContents().get(0);

        Resource libMetadataRes = null;
        try {
	        libMetadataRes = set.getResource(libMetadataURI, true);
	        if (!libMetadataRes.getContents().isEmpty())
	        	libMetadata = (Metadata)libMetadataRes.getContents().get(0);
		} catch (Exception e) {
			// clean proxy resource
			if (libMetadataRes != null && libMetadataRes.getContents().isEmpty()) {
				libMetadataRes.unload();
				set.getResources().remove(libMetadataRes);
			}
			throw new NoMetadataException("Cannot find metadata from lib model", e);
		}
        
        mainMetadata.getAdditionalMetadata().add(libMetadata);
		
	}
	
	/**
	 * This method delists the metadata associated to the lib model from the main model's metadata. 
	 */
	public static void remove(ResourceSet set, URI mainModel, URI libModel) {
        URI mainMetadataURI = MetadataHelper.getExpectedMetadataStorageURI(mainModel);
        URI libMetadataURI = MetadataHelper.getExpectedMetadataStorageURI(libModel);

        Metadata mainMetadata = null;
        Metadata libMetadata = null;

        Resource mainMetadataRes = set.getResource(mainMetadataURI, true);
        if (!mainMetadataRes.getContents().isEmpty())
        	mainMetadata = (Metadata)mainMetadataRes.getContents().get(0);

        Resource libMetadataRes = null;
        try {
	        libMetadataRes = set.getResource(libMetadataURI, true);
	        if (!libMetadataRes.getContents().isEmpty())
	        	libMetadata = (Metadata)libMetadataRes.getContents().get(0);
		} catch (Exception e) {
			// clean proxy resource
			if (libMetadataRes != null && libMetadataRes.getContents().isEmpty()) {
				libMetadataRes.unload();
				set.getResources().remove(libMetadataRes);
			}
			throw new NoMetadataException("Cannot find metadata from lib model", e);
		}
        
        mainMetadata.getAdditionalMetadata().remove(libMetadata);
		
	}

	public static class NoMetadataException extends RuntimeException {

		private static final long serialVersionUID = 6289563783712353541L;

		public NoMetadataException(String message, Throwable cause) {
			super(message, cause);
		}
		
	}
}
