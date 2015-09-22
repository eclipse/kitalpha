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
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.polarsys.kitalpha.emde.extension.ModelExtensionHelper;
import org.polarsys.kitalpha.emde.extension.ModelExtensionManager;

public class ExtensionItemProviderAdapter extends ItemProviderAdapter {

	public ExtensionItemProviderAdapter(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	public Collection<?> getChildren(Object object) {
		Collection<?> children = super.getChildren(object);
		List<Object> out = new ArrayList<Object>(children.size());
		for (Object element : children) {

			if (element instanceof EObject) {
				if (!ModelExtensionHelper.getInstance((EObject) element).isExtensionModelDisabled((EObject) element))
					out.add(element);
			} else
				out.add(element);

		}

		return out;
	}

	// TODO KIT What is the purpose of this method ? (to be removed)

	public void checkChildCreationExtender(Object object) {
		// Nothing to do
	}

	@Override
	public Collection<?> getNewChildDescriptors(Object object, EditingDomain editingDomain, Object sibling) {
		Collection<?> result = super.getNewChildDescriptors(object, editingDomain, sibling);
		// Filter Duplicate Commands if any
		Object[] objects = result.toArray();
		for (Object innerObject : objects) {
			// We only deal with CommandParameter
			if (innerObject instanceof CommandParameter == false) {
				continue;
			}
			CommandParameter parameter = (CommandParameter) innerObject;
			// We only deal with reference
			if (parameter.feature instanceof EReference == false) {
				continue;
			}
			// Value should be an EObject
			if (parameter.value instanceof EObject == false) {
				continue;
			}
			// Do not process already removed commands
			if (result.contains(innerObject) == false) {
				continue;
			}
			for (Iterator<?> iterator = result.iterator(); iterator.hasNext();) {
				Object innerInnerObject = iterator.next();
				// Ignore myself
				if (innerObject == innerInnerObject) {
					continue;
				}
				// We only deal with CommandParameter
				if (innerInnerObject instanceof CommandParameter == false) {
					continue;
				}
				CommandParameter innerParameter = (CommandParameter) innerInnerObject;
				// We only deal with reference
				if (innerParameter.feature instanceof EReference == false) {
					continue;
				}
				// Value should be an EObject
				if (innerParameter.value instanceof EObject == false) {
					continue;
				}
				// check whether or not command parameter are duplicated
				if (parameter.feature == innerParameter.feature && parameter.value.getClass() == innerParameter.value.getClass()) {
					iterator.remove();
				}
			}
		}
		return result;
	}

	@Override
	protected ItemPropertyDescriptor createItemPropertyDescriptor(AdapterFactory adapterFactory, ResourceLocator resourceLocator, String displayName, String description, EStructuralFeature feature, boolean isSettable, boolean multiLine, boolean sortChoices, Object staticImage, String category, String[] filterFlags) {
		return new ExtensionItemPropertyDescriptor(adapterFactory, resourceLocator, displayName, description, feature, isSettable, multiLine, sortChoices, staticImage, category, filterFlags);
	}

}
