/*******************************************************************************
 * Copyright (c) 2016 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.dsl.as.diagram.validation.synchronizationmode;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension.ValidationStatus;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeImport;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.SynchronizationMode;

/**
 * 
 * @author Faycal ABKA
 *
 */
public class EdgeImportImportSynchronizationModeRule extends AbstractImportSynchronizationModeRule {

	public EdgeImportImportSynchronizationModeRule() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isObjectInScope(Object object) {
		return object instanceof EdgeImport && ((EdgeImport)object).getImports() != null;
	}

	@Override
	public String getMessage(ValidationStatus status, Object object) {
		return getMessage("EdgeImport", object); //$NON-NLS-1$
	}

	@Override
	protected SynchronizationMode getSynchronizationMode(Object data) {
		return ((EdgeImport)data).getSynchronizationMode();
	}

	@Override
	protected boolean isCreateElement(Object data) {
		return ((EdgeImport)data).getImports().isCreateElements();
	}

	@Override
	protected boolean isSynchronizedLock(Object data) {
		return ((EdgeImport)data).getImports().isSynchronizationLock();
	}

}
