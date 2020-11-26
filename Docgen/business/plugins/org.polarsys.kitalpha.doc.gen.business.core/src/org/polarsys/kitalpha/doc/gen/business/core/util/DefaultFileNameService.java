/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
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

	@Override
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
