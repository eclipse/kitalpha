/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/




package org.polarsys.kitalpha.transposer.rules.handler.rules.common.provider;

import org.polarsys.kitalpha.transposer.rules.handler.rules.common.CommonFactory;
import org.polarsys.kitalpha.transposer.rules.handler.rules.common.CommonPackage;
import org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping;

import org.polarsys.kitalpha.transposer.rules.handler.rules.provider.MappingEditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MappingItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addExtendedMappingPropertyDescriptor(object);
			addExtendersPropertyDescriptor(object);
			addOwnedDomainHelperPropertyDescriptor(object);
			addDomainHelperPropertyDescriptor(object);
			addAllOwnedMappingElementsPropertyDescriptor(object);
			addPurposePropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addCompleteDescriptionPropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addOwnedContextPropertyDescriptor(object);
			addContextPropertyDescriptor(object);
			addPrivatePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Mapping_name_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Mapping_name_feature", "_UI_Mapping_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 CommonPackage.Literals.MAPPING__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));

	}

	/**
	 * This adds a property descriptor for the Extended Mapping feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExtendedMappingPropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Mapping_extendedMapping_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Mapping_extendedMapping_feature", "_UI_Mapping_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 CommonPackage.Literals.MAPPING__EXTENDED_MAPPING,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));

	}

	/**
	 * This adds a property descriptor for the Extenders feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExtendersPropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Mapping_extenders_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Mapping_extenders_feature", "_UI_Mapping_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 CommonPackage.Literals.MAPPING__EXTENDERS,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));

	}

	/**
	 * This adds a property descriptor for the Owned Domain Helper feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedDomainHelperPropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Mapping_ownedDomainHelper_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Mapping_ownedDomainHelper_feature", "_UI_Mapping_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 CommonPackage.Literals.MAPPING__OWNED_DOMAIN_HELPER,
				 true,
				 false,
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));

	}

	/**
	 * This adds a property descriptor for the Domain Helper feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainHelperPropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Mapping_domainHelper_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Mapping_domainHelper_feature", "_UI_Mapping_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 CommonPackage.Literals.MAPPING__DOMAIN_HELPER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));

	}

	/**
	 * This adds a property descriptor for the All Owned Mapping Elements feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllOwnedMappingElementsPropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Mapping_allOwnedMappingElements_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Mapping_allOwnedMappingElements_feature", "_UI_Mapping_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 CommonPackage.Literals.MAPPING__ALL_OWNED_MAPPING_ELEMENTS,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));

	}

	/**
	 * This adds a property descriptor for the Purpose feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPurposePropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Mapping_purpose_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Mapping_purpose_feature", "_UI_Mapping_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 CommonPackage.Literals.MAPPING__PURPOSE,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));

	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Mapping_description_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Mapping_description_feature", "_UI_Mapping_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 CommonPackage.Literals.MAPPING__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));

	}

	/**
	 * This adds a property descriptor for the Complete Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCompleteDescriptionPropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Mapping_completeDescription_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Mapping_completeDescription_feature", "_UI_Mapping_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 CommonPackage.Literals.MAPPING__COMPLETE_DESCRIPTION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));

	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Mapping_id_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Mapping_id_feature", "_UI_Mapping_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 CommonPackage.Literals.MAPPING__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));

	}

	/**
	 * This adds a property descriptor for the Owned Context feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedContextPropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Mapping_ownedContext_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Mapping_ownedContext_feature", "_UI_Mapping_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 CommonPackage.Literals.MAPPING__OWNED_CONTEXT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));

	}

	/**
	 * This adds a property descriptor for the Context feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContextPropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Mapping_context_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Mapping_context_feature", "_UI_Mapping_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 CommonPackage.Literals.MAPPING__CONTEXT,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));

	}

	/**
	 * This adds a property descriptor for the Private feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrivatePropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Mapping_private_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_Mapping_private_feature", "_UI_Mapping_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 CommonPackage.Literals.MAPPING__PRIVATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(CommonPackage.Literals.MAPPING__OWNED_PACKAGES);
			childrenFeatures.add(CommonPackage.Literals.MAPPING__OWNED_MAPPING_ELEMENTS);
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
	 * This returns Mapping.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Mapping")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {

		String label = ((Mapping)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Mapping_type") : //$NON-NLS-1$
			getString("_UI_Mapping_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$

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

		switch (notification.getFeatureID(Mapping.class)) {
			case CommonPackage.MAPPING__NAME:
			case CommonPackage.MAPPING__DESCRIPTION:
			case CommonPackage.MAPPING__COMPLETE_DESCRIPTION:
			case CommonPackage.MAPPING__ID:
			case CommonPackage.MAPPING__OWNED_CONTEXT:
			case CommonPackage.MAPPING__CONTEXT:
			case CommonPackage.MAPPING__PRIVATE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CommonPackage.MAPPING__OWNED_PACKAGES:
			case CommonPackage.MAPPING__OWNED_MAPPING_ELEMENTS:
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
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

				newChildDescriptors.add
					(createChildParameter
						(CommonPackage.Literals.MAPPING__OWNED_PACKAGES,
						 CommonFactory.eINSTANCE.createMappingPackage()));



				newChildDescriptors.add
					(createChildParameter
						(CommonPackage.Literals.MAPPING__OWNED_MAPPING_ELEMENTS,
						 CommonFactory.eINSTANCE.createMappingElement()));


	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return MappingEditPlugin.INSTANCE;
	}


}
