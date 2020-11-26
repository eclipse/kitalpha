/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.doc.gen.business.core.task;

import org.eclipse.emf.common.util.URI;
import org.polarsys.kitalpha.doc.gen.business.core.sirius.util.diagram.CoordinatesCalculator;
import org.polarsys.kitalpha.doc.gen.business.core.sirius.util.session.DiagramSessionHelper;
import org.polarsys.kitalpha.doc.gen.business.core.util.LabelProviderHelper;


public class CloseSiriusTask extends AbstrackSiriusTaskAction {

	@Override
	public void doTask(URI uri) {
		DiagramSessionHelper.cleanSession();
		CoordinatesCalculator.COORDINATES_MAP.clear();
		LabelProviderHelper.disposeImageRegistry();
	}

}
