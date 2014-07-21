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
package org.polarsys.kitalpha.emde.extension.edit;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IChildCreationExtender;

/**
 * @author Thomas Guiu
 * 
 */
public class ChildCreationExtenderManager extends org.eclipse.emf.edit.provider.ChildCreationExtenderManager {

	protected List<IChildCreationExtender> inheritedChildCreationExtenders;

	/**
	 * Creates an instance for the given primary resource locator to manage the
	 * extensions for the given namespace.
	 * 
	 * @param primaryResourceLocator
	 *            the resource locator for finding basic resources.
	 * @param namespace
	 *            a key in the
	 *            {@link IChildCreationExtender.Descriptor.Registry child
	 *            creation extender registry} which will typically be the
	 *            namespace of the package whose extensions are being managed.
	 */
	public ChildCreationExtenderManager(ResourceLocator primaryResourceLocator, String namespace) {
		super(primaryResourceLocator, namespace);
	}

	/**
	 * Returns a modifiable list of the child creation extenders.
	 * 
	 * @return a modifiable list of the child creation extenders.
	 */
	public List<IChildCreationExtender> getInheritedChildCreationExtenders() {
		if (inheritedChildCreationExtenders == null) {
			inheritedChildCreationExtenders = new ArrayList<IChildCreationExtender>();
			EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(namespace);
			if (ePackage != null) {
				// Build inherited namespaces
				List<String> inheritedNamespaces = new ArrayList<String>();
				// SuperTypes
				for (EClassifier eClassifier : ePackage.getEClassifiers()) {
					if (eClassifier instanceof EClass) {
						for (EClass superTypeEClass : ((EClass) eClassifier).getEAllSuperTypes()) {
							String currentNamespace = superTypeEClass.getEPackage().getNsURI();
							if (currentNamespace.equals(namespace) == false && inheritedNamespaces.contains(currentNamespace) == false) {
								inheritedNamespaces.add(currentNamespace);
							}
						}
					}
				}
				for (String inheritedNamespace : inheritedNamespaces) {
					for (IChildCreationExtender.Descriptor descriptor : IChildCreationExtender.Descriptor.Registry.INSTANCE.getDescriptors(inheritedNamespace)) {
						inheritedChildCreationExtenders.add(descriptor.createChildCreationExtender());
					}
				}
			}
		}
		return inheritedChildCreationExtenders;
	}

	/**
	 * Returns the list of new child descriptors accumulated from each of the
	 * child creation extenders.
	 * 
	 * @param object
	 *            the owner object of the descriptors.
	 * @param editingDomain
	 *            the domain for the descriptors.
	 * @return the list of new child descriptors accumulated from each of the
	 *         child creation extenders.
	 */
	public List<?> getNewChildDescriptors(Object object, EditingDomain editingDomain) {
		List<Object> result = new ArrayList<Object>();
		for (IChildCreationExtender inheritedChildCreationExtender : getInheritedChildCreationExtenders()) {
			result.addAll(inheritedChildCreationExtender.getNewChildDescriptors(object, editingDomain));
		}
		for (IChildCreationExtender childCreationExtender : getChildCreationExtenders()) {
			result.addAll(childCreationExtender.getNewChildDescriptors(object, editingDomain));
		}
		return result;
	}

}
