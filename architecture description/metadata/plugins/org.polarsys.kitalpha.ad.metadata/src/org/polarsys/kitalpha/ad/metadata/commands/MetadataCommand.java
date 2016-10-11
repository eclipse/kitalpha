/*******************************************************************************
 * Copyright (c) 2016 Thales Global Services.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.ad.metadata.commands;

import org.eclipse.emf.common.command.AbstractCommand;

/**
 * @author Thomas Guiu
 * 
 */
public abstract class MetadataCommand extends AbstractCommand {

	public MetadataCommand(String label) {
		super(label);
	}

	@Override
	protected boolean prepare()
	{
		return true;
	}
	
	@Override
	public void redo() {
		execute();
	}

}