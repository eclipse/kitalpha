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
package org.polarsys.kitalpha.doc.gen.business.ecore.helpers;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

public class EcoreModelHelper {
	private static final String EANNOTATION_SRC = "http://www.polarsys.org/kitalpha/ecore/documentation";

	public static String getDescription(EModelElement modelElement) {
		String descriptionValue = "";
		EAnnotation annotation = modelElement.getEAnnotation(EANNOTATION_SRC);
		if (annotation != null) {
			String description = annotation.getDetails().get("description");
			if (description != null && ! description.toUpperCase().equals("null".toUpperCase()))
				descriptionValue = description;
		}
		descriptionValue = descriptionValue.replaceAll("\n", "<br />");
		return descriptionValue;
	}

	public static String getUsageExamples(EModelElement modelElement) {
		return getEAnnotationHtmlValue(modelElement, "usage examples");
	}

	public static String getUsedInLevels(EModelElement modelElement) {
		return getEAnnotationHtmlValue(modelElement, "used in levels");
	}

	public static String getConstraints(EModelElement modelElement) {
		return getEAnnotationHtmlValue(modelElement, "constraints");
	}

	public static String getUsageGuideline(EModelElement modelElement) {
		return getEAnnotationHtmlValue(modelElement, "usage guideline");
	}

	private static String getEAnnotationHtmlValue(EModelElement modelElement,
			String key) {
		String value = "";
		EAnnotation annotation = modelElement.getEAnnotation(EANNOTATION_SRC);
		if (annotation != null) {
			String keyValue = annotation.getDetails().get(key);
			if (keyValue != null) {
				if (key.equals("usage examples") && !keyValue.equals("n/a")
						&& !keyValue.equals("none")) {
					keyValue = "<img src=\"" + keyValue
							+ "\" alt=\"example\" />";
				}
				StringBuffer buffer = new StringBuffer();
				buffer.append("<p><strong>" + key.substring(0, 1).toUpperCase()
						+ key.substring(1) + ":</strong><br />");
				buffer.append(keyValue);
				buffer.append("</p>");
				return buffer.toString();
			}
		}
		return value;
	}

	public static String getTypeHyperLink(ENamedElement element) {
		return getTypeHyperLink(element, null);
	}

	public static String getTypeHyperLink(ENamedElement element, String content) {
		String modelName = "";
		if (element.eResource() != null) {
			EObject root = element.eResource().getContents().get(0);
			if (root instanceof EPackage)
				modelName = ((EPackage) root).getName();
		}
		StringBuffer buffer = new StringBuffer();
		buffer.append("<a href=\"");
		if (modelName != "") {
			buffer.append("../" + modelName + "/");
		}
		buffer.append(EcoreFileNameService.INSTANCE.getFileName(element));
		buffer.append(".html\">");
		if (content != null)
			buffer.append(content);
		else
			buffer.append(element.getName());
		buffer.append("</a>");
		return buffer.toString();
	}
}
