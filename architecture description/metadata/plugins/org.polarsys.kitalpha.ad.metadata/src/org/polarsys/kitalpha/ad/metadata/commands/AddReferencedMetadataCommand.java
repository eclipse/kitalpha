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
package org.polarsys.kitalpha.ad.metadata.commands;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.polarsys.kitalpha.ad.metadata.helpers.LibraryHelper;

/**
 * @author Thomas Guiu
 * 
 */
public class AddReferencedMetadataCommand extends MetadataCommand {

	private URI mainModel;
	private URI libModel;
	private ResourceSet ctx;

	public AddReferencedMetadataCommand(ResourceSet ctx, URI mainModel, URI libModel) {
		super("Add an additionnal metadata");
		this.ctx = ctx;
		this.mainModel = mainModel;
		this.libModel = libModel;
		
	}

	@Override
	public void execute() {
		LibraryHelper.add(ctx, mainModel, libModel);
	}

	@Override
	public void undo() {
		LibraryHelper.remove(ctx, mainModel, libModel);
	}

	
}
