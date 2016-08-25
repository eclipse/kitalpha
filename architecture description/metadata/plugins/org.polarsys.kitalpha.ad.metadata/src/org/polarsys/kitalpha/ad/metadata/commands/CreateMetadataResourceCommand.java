/*******************************************************************************
 * Copyright (c) 2016 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.ad.metadata.commands;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.polarsys.kitalpha.ad.metadata.metadata.Metadata;
import org.polarsys.kitalpha.ad.metadata.metadata.MetadataFactory;

/**
 * @author Thomas Guiu
 * 
 */
public class CreateMetadataResourceCommand extends MetadataCommand {

	private URI uri;
	private Resource newResource;
	private ResourceSet resourceSet;

	public CreateMetadataResourceCommand(ResourceSet resourceSet, URI uri) {
		super("Create metadata resource");
		this.resourceSet = resourceSet;
		this.uri = uri;
	}

	@Override
	public void execute() {
		newResource = resourceSet.createResource(uri);
		Metadata metadata = MetadataFactory.eINSTANCE.createMetadata();
		metadata.setId(EcoreUtil.generateUUID());
		resourceSet.getResources().add(newResource);
		newResource.getContents().add(metadata);
	}

	@Override
	public void undo() {
		resourceSet.getResources().remove(newResource);
		newResource.unload();
	}

}
