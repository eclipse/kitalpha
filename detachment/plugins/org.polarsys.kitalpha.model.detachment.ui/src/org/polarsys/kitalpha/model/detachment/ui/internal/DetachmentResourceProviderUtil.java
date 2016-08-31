/*******************************************************************************
 * Copyright (c) 2016 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.model.detachment.ui.internal;

import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.polarsys.kitalpha.model.common.share.resource.loading.LoadResource;

/**
 * This is a helper that provide the input resource to Detachment.
 * Detachment can be launched on closed or opened Sirius (aird) session.
 * @author Faycal ABKA
 *
 */
public class DetachmentResourceProviderUtil {
	
	/**
	 * Resolve the input resource for the detachment
	 * @param airdFile
	 * @return the resource from existing session or load it
	 * @throws IllegalArgumentException if  the airdFile is null or the extension is not {@code SiriusUtil.SESSION_RESOURCE_EXTENSION}
	 */
	public synchronized static Resource getResource(IFile airdFile) 
			throws IllegalArgumentException {
		if (airdFile == null){
			throw new IllegalArgumentException("the file must be not null"); //$NON-NLS-1$
		}
		Map<String, Object> extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
		if (!extensionToFactoryMap.containsKey(airdFile.getFileExtension())){//airdFile.getFileExtension().equals(SiriusUtil.SESSION_RESOURCE_EXTENSION)){
			throw new IllegalArgumentException("Cannot resolve resource from: " + airdFile.getFullPath().toString()); //$NON-NLS-1$
		}
		URI uri = URI.createPlatformResourceURI(airdFile.getFullPath().toString(), true);
		Session session = SessionManager.INSTANCE.getExistingSession(uri);
		if (session != null){
			return session.getSessionResource();
		}
		return (new LoadResource(airdFile)).getResource();
	}

}
