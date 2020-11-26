/*******************************************************************************
 * Copyright (c) 2016-2017 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.ad.metadata.commands;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.polarsys.kitalpha.ad.metadata.metadata.Metadata;
import org.polarsys.kitalpha.ad.metadata.metadata.MetadataFactory;

/**
 * @author Thomas Guiu
 * 
 */
public class CreateMetadataResourceCommand extends MetadataCommand implements AbstractCommand.NonDirtying{

	private URI uri;
	private ResourceSet resourceSet;

	public CreateMetadataResourceCommand(ResourceSet resourceSet, URI uri) {
		super("Create metadata resource");
		this.resourceSet = resourceSet;
		this.uri = uri;
	}

	@Override
	public void execute() {

		try {

			resourceSet.getResource(uri, true);

		} catch (Exception e) {
			// Nothing here

		} finally {
			Resource resource = resourceSet.getResource(uri, false);
			if (resource != null && resource.getContents().isEmpty()) {
				resource.unload();
				resourceSet.getResources().remove(resource);
				resource = null;
			}

			if (resource == null) {
				Resource newResource = resourceSet.createResource(uri);
				Metadata metadata = MetadataFactory.eINSTANCE.createMetadata();
				metadata.setId(EcoreUtil.generateUUID());
				resourceSet.getResources().add(newResource);
				newResource.getContents().add(metadata);
			}
		}

	}

	@Override
	public Collection<?> getResult() {
		return Collections.singletonList(resourceSet.getResource(uri, false));
	}

	public Resource getMetadataResource() {
		Collection<?> results = getResult();
		if (!results.isEmpty()) {
			return (Resource) (getResult().iterator().next());
		}
		return null;
	}

	@Override
	public void undo() {
		Resource resource = resourceSet.getResource(uri, false);
		if (resource != null) {
			resource.unload();
			resourceSet.getResources().remove(resource);
		}
	}

}
