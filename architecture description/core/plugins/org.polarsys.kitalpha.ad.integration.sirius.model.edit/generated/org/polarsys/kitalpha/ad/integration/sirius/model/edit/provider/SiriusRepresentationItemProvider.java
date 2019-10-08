/*******************************************************************************
 * Copyright (c) 2014, 2017 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.integration.sirius.model.edit.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.sirius.viewpoint.description.Group;
import org.polarsys.kitalpha.ad.integration.sirius.model.SiriusPackage;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.model.edit.helpers.ModelHelper;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.edit.provider.RepresentationElementItemProvider;

/**
 * This is the item provider adapter for a {@link org.polarsys.kitalpha.ad.integration.sirius.model.SiriusRepresentation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SiriusRepresentationItemProvider
	extends RepresentationElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiriusRepresentationItemProvider(AdapterFactory adapterFactory) {
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

			addOdesignPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Odesign feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	protected void addOdesignPropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor(
			  ((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			  getResourceLocator(),
			  (String) getString("_UI_SiriusRepresentation_odesign_feature"),
			  (String) getString("_UI_PropertyDescriptor_description", "_UI_SiriusRepresentation_odesign_feature", "_UI_SiriusRepresentation_type"),
			  SiriusPackage.Literals.SIRIUS_REPRESENTATION__ODESIGN,
			  true,
			  false,
			  true,
			  null,
			  null,
			  null) {
				@Override
				public Collection<?> getChoiceOfValues(Object object) {
					return ModelHelper.getCandidates((EObject) object, Group.class, "*.odesign");
			
				}});

	}

	/**
	 * This returns SiriusRepresentation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SiriusRepresentation"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {

		return getString("_UI_SiriusRepresentation_type");

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
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}


}
