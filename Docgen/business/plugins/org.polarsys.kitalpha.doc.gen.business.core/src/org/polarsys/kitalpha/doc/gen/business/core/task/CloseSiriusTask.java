/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
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
