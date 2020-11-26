/*******************************************************************************
 * Copyright (c) 2016, 2020 Thales Global Services.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
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