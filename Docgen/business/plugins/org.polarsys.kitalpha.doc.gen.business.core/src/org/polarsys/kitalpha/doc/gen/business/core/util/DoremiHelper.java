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
package org.polarsys.kitalpha.doc.gen.business.core.util;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.doc.gen.business.core.sirius.util.session.DiagramSessionHelper;


import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.business.api.dialect.DialectManager;

public class DoremiHelper {
	public static Collection<DRepresentation> getDiagramForObject(
			EObject element) {
		Collection<DRepresentation> representations = DialectManager.INSTANCE
				.getRepresentations(element,
						DiagramSessionHelper.getCurrentSession());

		return representations;

	}
}
