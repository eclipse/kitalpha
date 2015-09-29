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
package org.polarsys.kitalpha.emde.extension;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.polarsys.kitalpha.emde.extension.registry.URIFactory;

/* 
 * @author Xavier Maysonnave
 */
public class ExtensibleModel extends Model<ExtensibleModel> {

	private final Map<String, ExtendedModel> extendedModels = new HashMap<String, ExtendedModel>();

	private List<ExtensibleModel> inheritedExtensibleModels;

	private Map<String, ExtendedModel> inheritedExtendedModels;

	private final String path;

	private final String qualifiedName;

	/**
	 * Initializes me with my ID and parent category.
	 * 
	 * @param id
	 *            my ID (must not be <code>null</code>)
	 * @param parent
	 *            my parent category, or <code>null</code> if none (which should only be the case for the {@link #GLOBAL_NAMESPACE}
	 */
	public ExtensibleModel(String name, URIFactory uriFactory) {
		super(name, uriFactory);
		qualifiedName = path = getName();
	}

	/**
	 * Obtains my path, which is my fully-qualified slash-separated ID that is unique within the global namespace.
	 * 
	 * @return my unique path
	 */
	@Override
	public final String getPath() {
		return path;
	}

	@Override
	public boolean equals(Object other_p) {
		return (other_p instanceof ExtensibleModel) && ((ExtensibleModel) other_p).getPath().equals(getPath());
	}

	/**
	 * Obtains my qualified name, which includes my ancestors' names separated by slashes.
	 * 
	 * @return my qualified name
	 */
	@Override
	public String getQualifiedName() {
		return qualifiedName;
	}

	/**
	 * Obtains all my extended models.
	 * 
	 * @return an unmodifiable set of the {@link ExtendedModel}s that are my extended models, sorted by {@link #getName name}. May be an empty set
	 */
	public SortedSet<ExtendedModel> getAllExtendedModels() {
		TreeSet<ExtendedModel> extended = new TreeSet<ExtendedModel>(extendedModels.values());
		if (inheritedExtendedModels == null) {
			// Solved Inherited extended Models if necessary
			getInheritedExtendedModels();
		}
		extended.addAll(inheritedExtendedModels.values());
		return Collections.unmodifiableSortedSet(extended);
	}

	/**
	 * Obtains my extended models.
	 * 
	 * @return an unmodifiable set of the {@link ExtendedModel}s that are my children, sorted by {@link #getName name}. May be an empty set
	 */
	public SortedSet<ExtendedModel> getExtendedModels() {
		return Collections.unmodifiableSortedSet(new TreeSet<ExtendedModel>(extendedModels.values()));
	}

	/**
	 * Obtains my inherited extensible models.
	 * 
	 * @return an unmodifiable list of the {@link ExtensibleModel}s that are inherited sorted by {@link #getName name}. May be an empty set
	 */
	public SortedSet<ExtensibleModel> getInheritedExtensibleModels() {
		if (inheritedExtensibleModels == null) {
			inheritedExtensibleModels = new ArrayList<ExtensibleModel>();
			EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(getName());
			if (ePackage != null) {
				// Build inherited namespaces
				List<String> inheritedNamespaces = new ArrayList<String>();
				// SuperTypes
				for (EClassifier eClassifier : ePackage.getEClassifiers()) {
					if (eClassifier instanceof EClass) {
						for (EClass superTypeEClass : ((EClass) eClassifier).getEAllSuperTypes()) {
							String currentNamespace = superTypeEClass.getEPackage().getNsURI();
							if (currentNamespace.equals(getName()) == false && inheritedNamespaces.contains(currentNamespace) == false) {
								inheritedNamespaces.add(currentNamespace);
							}
						}
					}
				}
				// Process Inherited namespaces
				for (String inheritedNamespace : inheritedNamespaces) {
					ExtensibleModel inheritedExtensibleModel = ModelExtensionDescriptor.INSTANCE.getExtensibleModel(inheritedNamespace);
					if (inheritedExtensibleModel != null && inheritedExtensibleModels.contains(inheritedExtensibleModel) == false) {
						inheritedExtensibleModels.add(inheritedExtensibleModel);
					}
				}
			}
		}
		return Collections.unmodifiableSortedSet(new TreeSet<ExtensibleModel>(inheritedExtensibleModels));
	}

	/**
	 * Obtains my inherited extended models.
	 * 
	 * @return an unmodifiable set of the {@link ExtendedModel}s that are inherited sorted by {@link #getName name}. May be an empty set
	 */
	public SortedSet<ExtendedModel> getInheritedExtendedModels() {
		if (inheritedExtendedModels == null) {
			inheritedExtendedModels = new HashMap<String, ExtendedModel>();
			for (ExtensibleModel extensibleModel : getInheritedExtensibleModels()) {
				for (ExtendedModel extendedModel : extensibleModel.getExtendedModels()) {
					if (inheritedExtendedModels.containsKey(extendedModel.getName()) == false) {
						inheritedExtendedModels.put(extendedModel.getName(), extendedModel);
					}
				}
			}
		}
		return Collections.unmodifiableSortedSet(new TreeSet<ExtendedModel>(inheritedExtendedModels.values()));
	}

	/**
	 * Obtains the extended model of mine that has the specified <code>extended name</code>.
	 * 
	 * @param extendedModelName_p
	 *            the name to find
	 * @return the matching model, or <code>null</code> if not found
	 */
	public ExtendedModel getExtendedModel(String extendedModelName) {
		if (extendedModelName == null || extendedModelName.trim().length() == 0) {
			return null;
		}
		return extendedModels.get(extendedModelName.trim());
	}

	/**
	 * Obtains the inherited extended model of mine that has the specified <code>inherited extended name</code>.
	 * 
	 * @param inheritedExtendedModelName_p
	 *            the name to find
	 * @return the matching model, or <code>null</code> if not found
	 */
	public ExtendedModel getInheritedExtendedModel(String inheritedExtendedModelName) {
		if (inheritedExtendedModelName == null || inheritedExtendedModelName.trim().length() == 0) {
			return null;
		}
		if (inheritedExtendedModels == null) {
			// Solved Inherited extended Models if necessary
			getInheritedExtendedModels();
		}
		return inheritedExtendedModels.get(inheritedExtendedModelName.trim());
	}

	/**
	 * Adds the specified <code>child</code> model to me. Note that this must only be called from the constructor of <code>child</code>.
	 * 
	 * @param child
	 *            my new child model
	 */
	protected void addExtendedModel(ExtendedModel child) {
		if (!extendedModels.containsKey(child.getName())) {
			extendedModels.put(child.getName(), child);
		}
	}

	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("ExtensibleModel[name="); //$NON-NLS-1$
		result.append(getName());
		result.append(", adapterFactory="); //$NON-NLS-1$
		result.append(getURIFactory().getAdapterFactoryName());
		result.append(']');
		return result.toString();
	}

}
