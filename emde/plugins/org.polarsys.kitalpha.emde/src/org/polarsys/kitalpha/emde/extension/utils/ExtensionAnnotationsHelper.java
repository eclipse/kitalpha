/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.emde.extension.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EPackage;

public class ExtensionAnnotationsHelper {

	// Namespace Annotations
	public static final String EXTENSION_NS_URI = "http://www.polarsys.org/kitalpha/emde/1.0.0/extension"; //$NON-NLS-1$  
	public static final String CONSTRAINT_NS_URI = "http://www.polarsys.org/kitalpha/emde/1.0.0/constraint"; //$NON-NLS-1$  

	public static final String TRUE = "true"; //$NON-NLS-1$

	// EPackage Annotations
	public static final String TRACK_RESOURCE_MODIFICATION = "trackResourceModification";

	public static final String USE_UUIDS = "useUUIDs";

	public static final String USE_ID_ATTRIBUTES = "useIDAttributes";

	public static final String USED_GEN_PACKAGES = "usedGenPackages";

	public static final String EXTENDED_ELEMENT = "ExtendedElement";

	public static boolean isTrackResourceModification(EPackage genPackage) {
		return hasAnnotation(genPackage, TRACK_RESOURCE_MODIFICATION);
	}

	public static boolean isUseUUIDS(EPackage genPackage) {
		return hasAnnotation(genPackage, USE_UUIDS);
	}

	public static boolean isUseIDAttributes(EPackage genPackage) {
		return hasAnnotation(genPackage, USE_ID_ATTRIBUTES);
	}

	public static List<String> getUsedGenPackages(EPackage genPackage) {
		return getAnnotationDetails(genPackage, EXTENSION_NS_URI, USED_GEN_PACKAGES);
	}

	public static List<String> getExtendedElement(EClass eClass_p) {
		return getAnnotationDetails(eClass_p, CONSTRAINT_NS_URI, EXTENDED_ELEMENT);
	}

	private static List<String> getAnnotationDetails(EModelElement eModel, String source, String entry) {
		List<String> items = new ArrayList<String>();
		if (eModel == null) {
			return items;
		}
		EAnnotation eAnnotation = eModel.getEAnnotation(source);
		try {
			if (eAnnotation == null) {
				return items;
			}
			String details = eAnnotation.getDetails().get(entry);
			if (details == null) {
				return items;
			}
			StringTokenizer token = new StringTokenizer(details);
			while (token.hasMoreTokens()) {
				String item = token.nextToken();

				if ((item != null) && (items.contains(item.trim()) == false)) {
					items.add(item.trim());
				}
			}
			return items;
		} catch (IndexOutOfBoundsException iobe) {
			throw new IllegalArgumentException("Invalid EAnnotation entry: " + entry); //$NON-NLS-1$
		}
	}

	private static boolean hasAnnotation(EModelElement eModel, String entry) {
		EAnnotation eAnnotation = eModel.getEAnnotation(EXTENSION_NS_URI);
		try {
			return (eAnnotation == null) ? false : TRUE.equalsIgnoreCase(eAnnotation.getDetails().get(entry));
		} catch (IndexOutOfBoundsException iobe) {
			throw new IllegalArgumentException("Invalid EAnnotation entry: " + entry); //$NON-NLS-1$
		}
	}
}
