/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.composer.examples.basic.ecore.gen.strategy.vowel;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;

import org.polarsys.kitalpha.composer.api.Parameter;
import org.polarsys.kitalpha.composer.api.ParameterError;
import org.polarsys.kitalpha.composer.extension.points.IStrategy;

import ecorebasicalloc.EcoreClass;
import ecorebasicalloc.EcoreFile;
import ecorebasicalloc.EcoreRoot;
import ecorebasicalloc.EcorebasicallocFactory;

/**
 * This strategy creates a file with one type for each EClass of the Ecore
 * model.
 * 
 * @author Yann Mortier
 */
public class VowelStrategy implements IStrategy {

	private static final char[] VOWELS = { 'a', 'e', 'i', 'o', 'u', 'y', 'A',
			'E', 'I', 'O', 'U', 'Y' };
	static {
		Arrays.sort(VOWELS);
	}

	/** The key of the author param. */
	private static final String AUTHOR_PARAM = "Author";

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.kitalpha.composer.extension.points.IStrategy#getParameters()
	 */
	public Map<String, Parameter> getParameters() {
		Parameter author = new Parameter(AUTHOR_PARAM,AUTHOR_PARAM,
				"The author of the model");
		Map<String, Parameter> parameters = new HashMap<String, Parameter>();
		parameters.put(AUTHOR_PARAM, author);
		return parameters;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.kitalpha.composer.extension.points.IStrategy#validateParameters(java.util.Map)
	 */
	public Map<String, ParameterError> validateParameters(
			Map<String, Parameter> valuedParameters_p) {
		// paramaters are always valids.
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.kitalpha.composer.extension.points.IStrategy#allocateModelElements(org.eclipse.emf.ecore.EObject,
	 *      java.util.Map)
	 */
	public EcoreRoot allocateModelElements(EObject modelRoot_p,
			Map<String, Parameter> strategyParams_p) {
		EcoreRoot result = EcorebasicallocFactory.eINSTANCE.createEcoreRoot();

		Iterator<EObject> children = modelRoot_p.eAllContents();
		while (children.hasNext()) {
			EObject currentChild = children.next();
			if (EcorePackage.eINSTANCE.getEClass().isInstance(currentChild)) {
				EClass eClass = (EClass) currentChild;
				if (eClass.getName() != null
						&& eClass.getName().length() != 0
						&& Arrays.binarySearch(VOWELS, eClass.getName().charAt(
								0)) >= 0) {
					result.getOwnedFiles().add(this.createFile(eClass));
				}
			}
		}
		return result;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.polarsys.kitalpha.composer.extension.points.IStrategy#allocateModelElements(org.eclipse.emf.ecore.EObject,
	 *      java.util.Map, java.util.List)
	 */
	public EcoreRoot allocateModelElements(EObject modelRoot_p,
			Map<String, Parameter> strategyParams_p,
			List<EObject> modelElementsToGenerate_p) {
		EcoreRoot result = EcorebasicallocFactory.eINSTANCE.createEcoreRoot();

		for (EObject eObject : modelElementsToGenerate_p) {
			if (EcorePackage.eINSTANCE.getEClass().isInstance(eObject)) {
				EClass eClass = (EClass) eObject;
				if (eClass.getName() != null
						&& eClass.getName().length() != 0
						&& Arrays.binarySearch(VOWELS, eClass.getName().charAt(
								0)) >= 0) {
					result.getOwnedFiles().add(
							this.createFile((EClass) eObject));
				}
			}
		}

		return result;
	}

	/**
	 * Creates a file for the given class.
	 * 
	 * @param eClass
	 *            the class.
	 * @return the created file.
	 */
	private EcoreFile createFile(EClass eClass) {
		EcoreClass type = EcorebasicallocFactory.eINSTANCE.createEcoreClass();
		type.setReferencedElement(eClass);
		EcoreFile file = EcorebasicallocFactory.eINSTANCE.createEcoreFile();
		file.setName(eClass.getName() + ".html");
		file.setPath("/");
		file.getOwnedTypes().add(type);
		return file;
	}

}