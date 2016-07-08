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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.sirius.diagram.description.EdgeMapping;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.diagram.helper.extension.DoremiDiagramElementHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeImport;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage;

/**
 * This is the item provider adapter for a {@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.EdgeImport} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EdgeImportItemProvider extends AbstractEdgeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeImportItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addImportsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Imports feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addImportsPropertyDescriptor(Object object) {
		// begin-added-code
		EObject currentObject = null;
		if (object != null && object instanceof EObject)
			currentObject = (EObject) object;

		final List<EdgeMapping> edgeMappingList = DoremiDiagramElementHelper
				.getAvailableEdgeMappingsFor(currentObject);
		
		ItemPropertyDescriptor importsPropertyDescriptor;
		
		if (edgeMappingList != null && !edgeMappingList.isEmpty()) {
			// begin-extension-code
			importsPropertyDescriptor = new ItemPropertyDescriptor
			// end-extension-code		
			(
					((ComposeableAdapterFactory) adapterFactory)
							.getRootAdapterFactory(),
					getResourceLocator(),
					getString("_UI_EdgeImport_imports_feature"), //$NON-NLS-1$
					getString(
							"_UI_PropertyDescriptor_description", "_UI_EdgeImport_imports_feature", "_UI_EdgeImport_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
					VpdiagramPackage.Literals.EDGE_IMPORT__IMPORTS, true,
					false, true, null, null,
					// begin-extension-code
					null) {
				@Override
				public Collection<?> getChoiceOfValues(Object object) {
					return (edgeMappingList.isEmpty() ? super
							.getChoiceOfValues(object) : edgeMappingList);
				}
			};
		} else {
			// begin-extension-code
			importsPropertyDescriptor = createItemPropertyDescriptor
			// end-extension-code		
			(((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
					getResourceLocator(),
					getString("_UI_EdgeImport_imports_feature"), //$NON-NLS-1$
					getString(
							"_UI_PropertyDescriptor_description", "_UI_EdgeImport_imports_feature", "_UI_EdgeImport_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
					VpdiagramPackage.Literals.EDGE_IMPORT__IMPORTS, true,
					false, true, null, null,
					// begin-extension-code
					null);
		}
		itemPropertyDescriptors.add(importsPropertyDescriptor);
		// end-extension-code
	}

	/**
	 * This returns EdgeImport.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EdgeImport"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {

		String label = ((EdgeImport)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_EdgeImport_type") :
			getString("_UI_EdgeImport_type") + " " + label;

	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
