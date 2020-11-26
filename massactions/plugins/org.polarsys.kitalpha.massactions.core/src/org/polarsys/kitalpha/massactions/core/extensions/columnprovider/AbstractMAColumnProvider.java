/*******************************************************************************
 * Copyright (c) 2018, 2020  Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 *  Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.massactions.core.extensions.columnprovider;

import org.polarsys.kitalpha.massactions.core.extensionpoint.columnprovider.IMAColumnProvider;
import org.polarsys.kitalpha.massactions.core.table.layer.body.IMABodyLayer;

/**
 * An abstract representation of a {@link IMAColumnProvider} that takes care of
 * some of the internal plumbing.
 *
 * Developers can extend this class in order to define their own column
 * providers.
 * 
 * @author Sandu Postaru
 * 
 */
public abstract class AbstractMAColumnProvider implements IMAColumnProvider {

	protected IMABodyLayer bodyLayer;

	@Override
	public void setBodyLayer(IMABodyLayer bodyLayer) {
		this.bodyLayer = bodyLayer;
	}
}
