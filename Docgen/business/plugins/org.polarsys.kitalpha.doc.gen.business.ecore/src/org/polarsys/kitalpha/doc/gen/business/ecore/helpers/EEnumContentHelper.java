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
package org.polarsys.kitalpha.doc.gen.business.ecore.helpers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.polarsys.kitalpha.doc.gen.business.core.util.LabelProviderHelper;


public class EEnumContentHelper {

	public static List<String> getLiterals(EEnum eEnum) {
		List<String> literals = new ArrayList<String>();
		for (EEnumLiteral literal : eEnum.getELiterals()) {
			StringBuffer buffer = new StringBuffer();
			buffer.append(literal);
			literals.add(buffer.toString());
		}
		return literals;
	}
	
	public static String getLiteralsList(EEnum eEnum, String projectName,
			String folderName) {
		EList<EEnumLiteral> list = eEnum.getELiterals();
		if (list.size() > 0) {
			StringBuffer buffer = new StringBuffer();
			buffer.append("<ul class=\"generatedList\">");
			for (EEnumLiteral literal : list) {
				buffer.append("<li>");
				String imageName = LabelProviderHelper.getImageFileName(literal, projectName,
						folderName);
				buffer.append("<img src=\"../icon/");
				buffer.append(imageName);
				buffer.append("\" alt=\"\"/>");
				buffer.append(literal.getLiteral());
				buffer.append(" = ");
				buffer.append(literal.getValue());
				buffer.append("</li>");
			}
			buffer.append("</ul>");
			return buffer.toString();
		}
		return "";
	}
}
