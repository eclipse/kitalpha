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

package org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.AfdescPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.helper.desc.ViewpointModelReuseResourceHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;

/**
 * This is the item provider adapter for a {@link org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.Viewpoints} object.
 * <!-- begin-user-doc -->
 * @superClass ExtensionItemProviderAdapter
 * <!-- end-user-doc -->
 * @generated
 */
public class ViewpointsItemProvider extends ItemProviderAdapter implements
		IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewpointsItemProvider(AdapterFactory adapterFactory) {
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

			addOwned_viewpointsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
		/**
	 * This adds a property descriptor for the Owned viewpoints feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addOwned_viewpointsPropertyDescriptor(Object object) {
		// begin-extension-code
		IItemPropertyDescriptor owned_viewpointsPropertyDescriptor = new ItemPropertyDescriptor
		// end-extension-code		
		(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Viewpoints_owned_viewpoints_feature"), //$NON-NLS-1$
				getString(
						"_UI_PropertyDescriptor_description", "_UI_Viewpoints_owned_viewpoints_feature", "_UI_Viewpoints_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				AfdescPackage.Literals.VIEWPOINTS__OWNED_VIEWPOINTS, true,
				false, true, null, null,
				// begin-extension-code
				null) {
			@Override
			public Collection<?> getChoiceOfValues(Object object) {
				// Gather all available VpDsl viewpoint in the platform 
				List<Viewpoint> available_viewpoint = ViewpointModelReuseResourceHelper
						.getAvailableVpdslViewpoints(null);
				// If there is viewpoints then return them 
				if (available_viewpoint != null
						&& available_viewpoint.size() > 0)
					return available_viewpoint;
				else
					return super.getChoiceOfValues(object);
			}
		};
		itemPropertyDescriptors.add(owned_viewpointsPropertyDescriptor);
		// end-extension-code
	}

	/**
	 * This returns Viewpoints.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Viewpoints"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {

		return getString("_UI_Viewpoints_type");

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

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ((IChildCreationExtender)adapterFactory).getResourceLocator();
	}

}
