/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.doc.gen.business.ecore.helpers;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.polarsys.kitalpha.doc.gen.business.core.util.DocGenHtmlUtil;
import org.polarsys.kitalpha.doc.gen.business.core.util.IFileNameService;


public class EcoreFileNameService implements IFileNameService {

	public static EcoreFileNameService INSTANCE = new EcoreFileNameService();

	private EcoreFileNameService() {

	}

	@Override
	public String getFileName(EObject eObject) {
		if (eObject instanceof EClassifier) {
			return eObject.eClass().getName() + "_"
					+ getEClassifierName((EClassifier) eObject);

		} else if (eObject instanceof EPackage) {
			return ((EPackage) eObject).getName();
		} else {
			String id = EcoreUtil.getID(eObject);
			if (id != null) {
				return DocGenHtmlUtil.getValidFileName(eObject.eClass()
						.getName() + "_" + id);
			} else {
				String identification = EcoreUtil.getIdentification(eObject);
				return DocGenHtmlUtil.getValidFileName(identification);
			}
		}
	}

	private String getEClassifierName(EClassifier classifier) {
		String classifierName = classifier.getName();
		if (classifier.getEPackage() != null) {
			classifierName = getPackageName(classifier.getEPackage()) + "_"
					+ classifierName;
		}
		return classifierName;
	}

	private String getPackageName(EPackage ePackage) {
		String packageName = ePackage.getName();
		if (ePackage.getESuperPackage() != null) {
			packageName = getPackageName(ePackage.getESuperPackage()) + "_"
					+ packageName;
		}
		return packageName;
	}

}
