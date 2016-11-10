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

package org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.edit.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.model.edit.helpers.ParentHelper;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.NameElement;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ViewpointFactory;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.ViewpointPackage;

/**
 * This is the item provider adapter for a {@link org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ViewpointItemProvider
	extends NameElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewpointItemProvider(AdapterFactory adapterFactory) {
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

			addParentsPropertyDescriptor(object);
			addDependenciesPropertyDescriptor(object);
			addAbstractPropertyDescriptor(object);
			addVersionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Parents feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated Not
	 */
	protected void addParentsPropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor(
			  ((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			  getResourceLocator(),
			  getString("_UI_Viewpoint_parents_feature"),
			  getString("_UI_PropertyDescriptor_description", "_UI_Viewpoint_parents_feature", "_UI_Viewpoint_type"),
			  ViewpointPackage.Literals.VIEWPOINT__PARENTS,
			  true,
			  false,
			  true,
			  null,
			  null,
			  null) {
				  public Collection<?> getChoiceOfValues(Object object)
				  {
					return ParentHelper.getCandidates(((EObject)object));
				  }
			});

	}

	/**
	 * This adds a property descriptor for the Dependencies feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDependenciesPropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Viewpoint_dependencies_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Viewpoint_dependencies_feature", "_UI_Viewpoint_type"),
				 ViewpointPackage.Literals.VIEWPOINT__DEPENDENCIES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));

	}

	/**
	 * This adds a property descriptor for the Abstract feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAbstractPropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Viewpoint_abstract_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Viewpoint_abstract_feature", "_UI_Viewpoint_type"),
				 ViewpointPackage.Literals.VIEWPOINT__ABSTRACT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));

	}

	/**
	 * This adds a property descriptor for the Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionPropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Viewpoint_version_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Viewpoint_version_feature", "_UI_Viewpoint_type"),
				 ViewpointPackage.Literals.VIEWPOINT__VERSION,
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
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ViewpointPackage.Literals.VIEWPOINT__RULE_SET);
			childrenFeatures.add(ViewpointPackage.Literals.VIEWPOINT__SERVICE_SET);
			childrenFeatures.add(ViewpointPackage.Literals.VIEWPOINT__PROPERTY_SET);
			childrenFeatures.add(ViewpointPackage.Literals.VIEWPOINT__METAMODEL);
			childrenFeatures.add(ViewpointPackage.Literals.VIEWPOINT__REPRESENTATION);
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
	 * This returns Viewpoint.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Viewpoint"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {

		if (object instanceof NameElement) {
			NameElement elt = (NameElement) object;
			String label = elt.getName();
			if (label == null)
				label = "";
			String id = elt.getId();
			if (id == null)
				id = "no ID";
			label = elt.eClass().getName() + " [" + id + "] " + label;
			return label;
		}
		return ((EObject) object).eClass().getName();

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

		switch (notification.getFeatureID(Viewpoint.class)) {
			case ViewpointPackage.VIEWPOINT__ABSTRACT:
			case ViewpointPackage.VIEWPOINT__VERSION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ViewpointPackage.VIEWPOINT__RULE_SET:
			case ViewpointPackage.VIEWPOINT__SERVICE_SET:
			case ViewpointPackage.VIEWPOINT__PROPERTY_SET:
			case ViewpointPackage.VIEWPOINT__METAMODEL:
			case ViewpointPackage.VIEWPOINT__REPRESENTATION:
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
						(ViewpointPackage.Literals.VIEWPOINT__RULE_SET,
						 ViewpointFactory.eINSTANCE.createRuleSet()));



				newChildDescriptors.add
					(createChildParameter
						(ViewpointPackage.Literals.VIEWPOINT__SERVICE_SET,
						 ViewpointFactory.eINSTANCE.createServiceSet()));



				newChildDescriptors.add
					(createChildParameter
						(ViewpointPackage.Literals.VIEWPOINT__PROPERTY_SET,
						 ViewpointFactory.eINSTANCE.createPropertySet()));



				newChildDescriptors.add
					(createChildParameter
						(ViewpointPackage.Literals.VIEWPOINT__METAMODEL,
						 ViewpointFactory.eINSTANCE.createMetamodel()));



				newChildDescriptors.add
					(createChildParameter
						(ViewpointPackage.Literals.VIEWPOINT__REPRESENTATION,
						 ViewpointFactory.eINSTANCE.createRepresentation()));


	}


}
