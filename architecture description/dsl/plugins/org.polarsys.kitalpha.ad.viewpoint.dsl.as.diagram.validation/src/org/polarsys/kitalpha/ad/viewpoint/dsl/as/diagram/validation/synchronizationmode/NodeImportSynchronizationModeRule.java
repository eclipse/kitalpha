/*******************************************************************************
 * Copyright (c) 2016 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.dsl.as.diagram.validation.synchronizationmode;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.ValidationStatus;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Node;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.SynchronizationMode;

/**
 * @author Faycal ABKA
 *
 */
public class NodeImportSynchronizationModeRule extends AbstractImportSynchronizationModeRule {


	@Override
	public boolean isObjectInScope(Object object) {
		return object instanceof Node && ((Node)object).getImports() != null;
	}

	@Override
	public String getMessage(ValidationStatus status, Object object) {
		return getMessage("Node", object); //$NON-NLS-1$
	}

	@Override
	protected SynchronizationMode getSynchronizationMode(Object data) {
		return ((Node)data).getSynchronizationMode();
	}

	@Override
	protected boolean isCreateElement(Object data) {
		return ((Node)data).getImports().isCreateElements();
	}

	@Override
	protected boolean isSynchronizedLock(Object data) {
		return ((Node)data).getImports().isSynchronizationLock();
	}

}
