/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.doc.gen.business.ecore.helpers;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.polarsys.kitalpha.doc.gen.business.core.util.LabelProviderHelper;


public class EPackageContentHelper {

	public static String getDataTypesList(EPackage ePackage, String projectName,
			String folderName) {
		EList<EClassifier> list = ePackage.getEClassifiers();
		if (list.size() > 0) {
			StringBuffer buffer = new StringBuffer();
			buffer.append("<ul class=\"generatedList\">");
			for (EClassifier classifier : list) {
				buffer.append("<li>");
				String imageName = LabelProviderHelper.getImageFileName(classifier, projectName,
						folderName);
				buffer.append("<img src=\"../icon/");
				buffer.append(imageName);
				buffer.append("\" alt=\"\"/>");
				buffer.append(org.polarsys.kitalpha.doc.gen.business.ecore.helpers.EcoreModelHelper.getTypeHyperLink(classifier));
				buffer.append("</li>");
			}
			buffer.append("</ul>");
			return buffer.toString();
		}
		return "";
	}
	
	public static String getSubPackagesList(EPackage ePackage, String projectName,
			String folderName) {
		EList<EPackage> list = ePackage.getESubpackages();
		if (list.size() > 0) {
			StringBuffer buffer = new StringBuffer();
			buffer.append("<ul class=\"generatedList\">");
			for (EPackage package1 : list) {
				buffer.append("<li>");
				String imageName = LabelProviderHelper.getImageFileName(package1, projectName,
						folderName);
				buffer.append("<img src=\"../icon/");
				buffer.append(imageName);
				buffer.append("\" alt=\"\"/>");
				buffer.append(org.polarsys.kitalpha.doc.gen.business.ecore.helpers.EcoreModelHelper.getTypeHyperLink(package1));
				buffer.append("</li>");
			}
			buffer.append("</ul>");
			return buffer.toString();
		}
		return "";
	}
}
