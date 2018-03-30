/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
/**
 * 
 */
package org.polarsys.kitalpha.emde.model.edit.provider;

import java.util.Collection;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.command.CommandParameter;
import org.polarsys.kitalpha.emde.extension.utils.EMFHelper;
import org.polarsys.kitalpha.emde.model.EmdePackage;
import org.polarsys.kitalpha.emde.model.edit.provider.helpers.EMDEHelper;

public class NewChildDescriptorHelper {
	public static boolean isValidCommand(Object owner, CommandParameter parameter) {
		// We only deal with reference
		if (!(parameter.feature instanceof EReference)) {
			return true;
		}
		// Value should be an EObject
		if (!(parameter.value instanceof EObject)) {
			return true;
		}
		EClass value = (EClass) EMFHelper.solveAgainstStaticPackage(((EObject) parameter.value).eClass());
		// Value should be an Extension
		if (!EMDEHelper.isSuperTypeOf(value, EmdePackage.Literals.ELEMENT_EXTENSION)) {
			return true;
		}
		// Owner should be an EObject
		if (!(owner instanceof EObject)) {
			return true;
		}
		EClass eowner = (EClass) EMFHelper.solveAgainstStaticPackage(((EObject) owner).eClass());
		// We only deal with these two references
		EReference reference = (EReference) parameter.feature;
		if (reference == EmdePackage.Literals.EXTENSIBLE_ELEMENT__OWNED_EXTENSIONS) {
			// Retrieve annotations
			BasicDiagnostic basicDiagnostic = new BasicDiagnostic();
			Collection<EClass> extendedElements = EMDEHelper.getExtendedElement(basicDiagnostic, value);
			// There is something to analyze
			if (!extendedElements.isEmpty()) {
				for (EClass extendedElement : extendedElements) {
					// at least one parentExtendedElement should be a super type
					// of ExtendedElement
					if (EMDEHelper.isSuperTypeOf(eowner, extendedElement)) {
						return true;
					}
				}
			}
			return false;
		}
		return true;
	}

}
