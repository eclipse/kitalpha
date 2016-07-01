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
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.sirius.diagram.description.ContainerMapping;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.diagram.helper.extension.DoremiDiagramElementHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Container;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramFactory;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage;


/**
 * This is the item provider adapter for a {@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Container} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ContainerItemProvider extends DiagramChildrenItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerItemProvider(AdapterFactory adapterFactory) {
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
			addContentLayoutPropertyDescriptor(object);
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

		final List<ContainerMapping> containerMappingList = DoremiDiagramElementHelper
				.getAvailableContainerMappingsFor(currentObject);

		ItemPropertyDescriptor importsPropertyDescriptor;
		
		if (containerMappingList != null && !containerMappingList.isEmpty()) {
			importsPropertyDescriptor = new ItemPropertyDescriptor
			// end-extension-code		
			(
					((ComposeableAdapterFactory) adapterFactory)
							.getRootAdapterFactory(),
					getResourceLocator(),
					getString("_UI_Container_imports_feature"), //$NON-NLS-1$
					getString(
							"_UI_PropertyDescriptor_description", "_UI_Container_imports_feature", "_UI_Container_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
					VpdiagramPackage.Literals.CONTAINER__IMPORTS, true, false,
					true, null, null,
					// begin-extension-code
					null) {
				@Override
				public Collection<?> getChoiceOfValues(Object object) {
					return (containerMappingList.isEmpty() ? super
							.getChoiceOfValues(object) : containerMappingList);
				}
			};
		} else
		// end-added-code	
		{
			// begin-extension-code
			importsPropertyDescriptor = createItemPropertyDescriptor
			// end-extension-code		
			(((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
					getResourceLocator(),
					getString("_UI_Container_imports_feature"), //$NON-NLS-1$
					getString(
							"_UI_PropertyDescriptor_description", "_UI_Container_imports_feature", "_UI_Container_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
					VpdiagramPackage.Literals.CONTAINER__IMPORTS, true, false,
					true, null, null,
					// begin-extension-code
					null);
		}
		// end-extension-code
		itemPropertyDescriptors.add(importsPropertyDescriptor);
	}

	/**
	 * This adds a property descriptor for the Content Layout feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContentLayoutPropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Container_contentLayout_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Container_contentLayout_feature", "_UI_Container_type"),
				 VpdiagramPackage.Literals.CONTAINER__CONTENT_LAYOUT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));

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
			childrenFeatures.add(VpdiagramPackage.Literals.CONTAINER__STYLE);
			childrenFeatures.add(VpdiagramPackage.Literals.CONTAINER__CHILDREN);
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
	 * This returns Container.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		Container container = (Container) object;
		if (container.getImports() != null)
			return overlayImage(object,
					getResourceLocator().getImage("full/obj16/IContainer")); //$NON-NLS-1$
		else
			return overlayImage(object,
					getResourceLocator().getImage("full/obj16/Container")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {

		String label = ((Container)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Container_type") :
			getString("_UI_Container_type") + " " + label;

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

		switch (notification.getFeatureID(Container.class)) {
			case VpdiagramPackage.CONTAINER__CONTENT_LAYOUT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case VpdiagramPackage.CONTAINER__THE_DOMAIN:
			case VpdiagramPackage.CONTAINER__STYLE:
			case VpdiagramPackage.CONTAINER__CHILDREN:
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
						(VpdiagramPackage.Literals.CONTAINER__STYLE,
						 VpdiagramFactory.eINSTANCE.createContainerDescription()));



				newChildDescriptors.add
					(createChildParameter
						(VpdiagramPackage.Literals.CONTAINER__CHILDREN,
						 VpdiagramFactory.eINSTANCE.createContainerChildren()));


	}

}
