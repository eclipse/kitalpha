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
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.polarsys.kitalpha.ad.metadata.metadata.Metadata;
import org.polarsys.kitalpha.ad.metadata.metadata.MetadataFactory;

/**
 * @author Thomas Guiu
 * 
 */
public class CreateMetadataResourceCommand extends RecordingCommand {

	private URI uri;
	private TransactionalEditingDomain domain2;

	public CreateMetadataResourceCommand(TransactionalEditingDomain domain, URI uri) {
		super(domain);
		domain2 = domain;
		this.uri = uri;
	}

	@Override
	protected void doExecute() {
		Resource resource = domain2.getResourceSet().createResource(uri);
		Metadata integration = MetadataFactory.eINSTANCE.createMetadata();
		domain2.getResourceSet().getResources().add(resource);
		resource.getContents().add(integration);

	}

}
