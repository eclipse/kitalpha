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

import java.util.Iterator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;

/**
 * 
 * @author Florian Barbin
 * 
 */
public class EClassContentHelper {

	public static String getAttributesTable(EClass element) {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<table>");
		buffer.append("<tr>");
		buffer.append("<th></th>");
		buffer.append("<th>Name</th>");
		buffer.append("<th>Type</th>");
		buffer.append("<th>Changeable</th>");
		buffer.append("<th>Required</th>");
		buffer.append("<th>Derived</th>");
		buffer.append("<th>Cardinality</th>");
		buffer.append("<th>Description</th>");
		buffer.append("</tr>");
		for (EAttribute attribute : element.getEAllAttributes()) {
			if (element.getEAttributes().contains(attribute)) {
				appendAttributeRow(buffer, attribute, false);
			} else {
				appendAttributeRow(buffer, attribute, true);
			}
		}
		buffer.append("</table>");
		return buffer.toString();
	}

	private static void appendAttributeRow(StringBuffer buffer,
			EAttribute attribute, boolean isInherited) {
		String descriptionValue = EcoreModelHelper.getDescription(attribute);
		String attributeType = "";
		String title = "";
		if (attribute.getEType() != null) {
			attributeType = EcoreModelHelper.getTypeHyperLink(attribute
					.getEType());
		}
		buffer.append("<tr");
		if (isInherited) {
			EObject container = attribute.eContainer();
			if (container instanceof ENamedElement) {
				title = "Inherited From "
						+ ((ENamedElement) container).getName();
				buffer.append(" title=\"" + title + "\"");
			}
		}
		buffer.append(">");
		buffer.append("<td>");
		if (isInherited) {
			buffer.append(EcoreModelHelper.getTypeHyperLink(
					(ENamedElement) attribute.eContainer(),
					"<img src=\"../../img/arrow_up.png\" alt=\"" + title
							+ "\" />"));
		}
		buffer.append("</td>");
		buffer.append("<td>" + attribute.getName() + "</td>");
		buffer.append("<td>" + attributeType + "</td>");
		buffer.append("<td>" + attribute.isChangeable() + "</td>");
		buffer.append("<td>" + attribute.isRequired() + "</td>");
		buffer.append("<td>" + attribute.isDerived() + "</td>");
		buffer.append("<td>" + getCardinality(attribute.getLowerBound()) + ".."
				+ getCardinality(attribute.getUpperBound()) + "</td>");
		buffer.append("<td>" + descriptionValue + "</td>");
		buffer.append("</tr>");
	}

	public static String getReferencesTable(EClass element) {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<table>");
		buffer.append("<tr>");
		buffer.append("<th></th>");
		buffer.append("<th>Name</th>");
		buffer.append("<th>Type</th>");
		buffer.append("<th>Changeable</th>");
		buffer.append("<th>Required</th>");
		buffer.append("<th>Ordered</th>");
		buffer.append("<th>Derived</th>");
		buffer.append("<th>Unique</th>");
		buffer.append("<th>Cardinality</th>");
		buffer.append("<th>Description</th>");
		buffer.append("</tr>");
		for (EReference reference : element.getEAllReferences()) {
			if (element.getEReferences().contains(reference)) {
				appendReferenceTableRow(buffer, reference, false);
			} else {
				appendReferenceTableRow(buffer, reference, true);
			}
		}
		buffer.append("</table>");
		return buffer.toString();
	}

	private static void appendReferenceTableRow(StringBuffer buffer,
			EReference reference, boolean isInherited) {
		String referenceType = "";
		String title = "";
		if (reference.getEType() != null) {
			referenceType = EcoreModelHelper.getTypeHyperLink(reference
					.getEType());
		}
		buffer.append("<tr");
		if (isInherited) {
			EObject container = reference.eContainer();
			if (container instanceof ENamedElement) {
				title = "Inherited From "
						+ ((ENamedElement) container).getName();
				buffer.append(" title=\"" + title + "\"");
			}
		}
		buffer.append("><td>");
		if (reference.isContainment()) {
			buffer.append("<img src=\"../../img/ContainmentFeature.gif\" alt=\""
					+ title + "\" />");
		}
		if (isInherited) {
			buffer.append(EcoreModelHelper.getTypeHyperLink(
					(ENamedElement) reference.eContainer(),
					"<img src=\"../../img/arrow_up.png\" alt=\"" + title
							+ "\" />"));
		}
		if (reference.isDerived()) {
			buffer.append("<img src=\"../../img/DerivedFeature.gif\" alt=\""
					+ title + "\" />");
		}
		buffer.append("</td>");
		buffer.append("<td");
		if (isInherited) {
			buffer.append(" title=\"" + title + "\"");

		}
		buffer.append(">" + reference.getName() + "</td>");
		buffer.append("<td>" + referenceType + "</td>");
		buffer.append("<td>" + reference.isChangeable() + "</td>");
		buffer.append("<td>" + reference.isRequired() + "</td>");
		buffer.append("<td>" + reference.isOrdered() + "</td>");
		buffer.append("<td>" + reference.isDerived() + "</td>");
		buffer.append("<td>" + reference.isUnique() + "</td>");
		buffer.append("<td>" + getCardinality(reference.getLowerBound()) + ".."
				+ getCardinality(reference.getUpperBound()) + "</td>");
		buffer.append("<td>" + EcoreModelHelper.getDescription(reference)
				+ "</td>");
		buffer.append("</tr>");
	}

	public static String getOperationsTable(EClass element) {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<table>");
		buffer.append("<tr>");
		buffer.append("<th></th>");
		buffer.append("<th>Name</th>");
		buffer.append("<th>Return</th>");
		buffer.append("<th>Parameter(s)</th>");
		buffer.append("</tr>");
		for (EOperation eOperation : element.getEAllOperations()) {
			if (element.getEOperations().contains(eOperation)) {
				appendOperationTableRow(buffer, eOperation, false);
			} else {
				appendOperationTableRow(buffer, eOperation, true);
			}
		}
		buffer.append("</table>");
		return buffer.toString();
	}

	private static void appendOperationTableRow(StringBuffer buffer,
			EOperation eOperation, boolean isInherited) {
		String eOperationType = "";
		String title = "";
		if (eOperation.getEType() != null) {
			eOperationType = EcoreModelHelper.getTypeHyperLink(eOperation
					.getEType());
		}
		buffer.append("<tr");
		if (isInherited) {
			EObject container = eOperation.eContainer();
			if (container instanceof ENamedElement) {
				title = "Inherited From "
						+ ((ENamedElement) container).getName();
				buffer.append(" title=\"" + title + "\"");
			}
		}
		buffer.append(">");
		buffer.append("<td>");
		if (isInherited) {
			buffer.append(EcoreModelHelper.getTypeHyperLink(
					(ENamedElement) eOperation.eContainer(),
					"<img src=\"../../img/arrow_up.png\" alt=\"" + title
							+ "\" />"));
		}
		buffer.append("</td>");
		buffer.append("<td>" + eOperation.getName() + "</td>");
		buffer.append("<td>0.." + getCardinality(eOperation.getUpperBound())
				+ " " + eOperationType + "</td>");
		buffer.append("<td>");
		Iterator<EParameter> iterator = eOperation.getEParameters().iterator();
		while (iterator.hasNext()) {
			EParameter parameter = iterator.next();
			buffer.append(parameter.getName());
			if (parameter.getEType() != null) {
				buffer.append(": ");
				buffer.append(EcoreModelHelper.getTypeHyperLink(parameter
						.getEType()));
			}
			if (iterator.hasNext()) {
				buffer.append(" | ");
			}
		}
		buffer.append("</td>");
		buffer.append("</tr>");

	}

	private static String getCardinality(int cardinality) {
		if (cardinality == -1) {
			return "*";
		} else {
			return String.valueOf(cardinality);
		}
	}
}
