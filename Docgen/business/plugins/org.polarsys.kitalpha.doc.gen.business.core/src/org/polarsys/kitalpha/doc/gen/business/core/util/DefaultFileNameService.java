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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class DefaultFileNameService implements IFileNameService {
	public static IFileNameService INSTANCE = new DefaultFileNameService();

	private DefaultFileNameService() {

	}

	public String getFileName(EObject eObject) {
		String id = EcoreUtil.getID(eObject);
		if (id != null) {
			return DocGenHtmlUtil.getValidFileName(eObject.eClass().getName() + "_" + id);
		} else {
			String identification = EcoreUtil.getIdentification(eObject);
			return DocGenHtmlUtil.getValidFileName(identification);
		}
	}

}
