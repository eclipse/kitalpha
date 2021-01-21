/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
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
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.sirius.diagram.description.NodeMapping;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.diagram.helper.extension.DoremiDiagramElementHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Node;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramFactory;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage;

/**
 * This is the item provider adapter for a {@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Node} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NodeItemProvider extends DiagramChildrenItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeItemProvider(AdapterFactory adapterFactory) {
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
		if (object != null && object instanceof EObject) {
			currentObject = (EObject) object;
		}

		final List<NodeMapping> nodeMappingList = DoremiDiagramElementHelper
				.getAvailableNodeMappingsFor(currentObject);
		
		ItemPropertyDescriptor importsPropertyDescriptor = null;

		if (nodeMappingList != null && !nodeMappingList.isEmpty()) {
			// begin-extension-code
			importsPropertyDescriptor = new ItemPropertyDescriptor
			// end-extension-code		
			(
					((ComposeableAdapterFactory) adapterFactory)
							.getRootAdapterFactory(),
					getResourceLocator(),
					getString("_UI_Node_imports_feature"), //$NON-NLS-1$
					getString(
							"_UI_PropertyDescriptor_description", "_UI_Node_imports_feature", "_UI_Node_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
					VpdiagramPackage.Literals.NODE__IMPORTS, true, false, true,
					null, null,
					// begin-extension-code
					null) {
				@Override
				public Collection<?> getChoiceOfValues(Object object) {
					return (nodeMappingList.isEmpty() ? super
							.getChoiceOfValues(object) : nodeMappingList);
				}
			};
		} else {
			// begin-extension-code
			importsPropertyDescriptor = createItemPropertyDescriptor
			// end-extension-code		
			(((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
					getResourceLocator(),
					getString("_UI_Node_imports_feature"), //$NON-NLS-1$
					getString(
							"_UI_PropertyDescriptor_description", "_UI_Node_imports_feature", "_UI_Node_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
					VpdiagramPackage.Literals.NODE__IMPORTS, true, false, true,
					null, null,
					// begin-extension-code
					null);
		}
		
		itemPropertyDescriptors.add(importsPropertyDescriptor);
		// end-extension-code
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(
			Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(VpdiagramPackage.Literals.ABSTRACT_NODE__THE_DOMAIN);
			childrenFeatures.add(VpdiagramPackage.Literals.NODE__STYLE);
			childrenFeatures.add(VpdiagramPackage.Literals.NODE__CHILDREN);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Node.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		Node node = (Node) object;
		if (node.getImports() != null)
			return overlayImage(object,
					getResourceLocator().getImage("full/obj16/INode")); //$NON-NLS-1$
		else
			return overlayImage(object,
					getResourceLocator().getImage("full/obj16/Node")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {

		String label = ((Node)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Node_type") :
			getString("_UI_Node_type") + " " + label;

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

		switch (notification.getFeatureID(Node.class)) {
			case VpdiagramPackage.NODE__THE_DOMAIN:
			case VpdiagramPackage.NODE__STYLE:
			case VpdiagramPackage.NODE__CHILDREN:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
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

				newChildDescriptors.add
					(createChildParameter
						(VpdiagramPackage.Literals.ABSTRACT_NODE__THE_DOMAIN,
						 VpdiagramFactory.eINSTANCE.createNodeDomainElement()));



				newChildDescriptors.add
					(createChildParameter
						(VpdiagramPackage.Literals.NODE__STYLE,
						 VpdiagramFactory.eINSTANCE.createNodeDescription()));



				newChildDescriptors.add
					(createChildParameter
						(VpdiagramPackage.Literals.NODE__CHILDREN,
						 VpdiagramFactory.eINSTANCE.createNodeChildren()));


	}

}
