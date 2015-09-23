/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ColorCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage;

import org.polarsys.kitalpha.emde.extension.edit.ExtensionItemPropertyDescriptor;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.helper.ColorsUseCasesHelper;

/**
 * This is the item provider adapter for a {@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ColorCustomization} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ColorCustomizationItemProvider extends AbstractCustomizationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorCustomizationItemProvider(AdapterFactory adapterFactory) {
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

			addColorPropertyDescriptor(object);
			addAppliedOnPropertyDescriptor(object);
			addColorUseCasePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addColorPropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ColorCustomization_color_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ColorCustomization_color_feature", "_UI_ColorCustomization_type"),
				 VpstylecustomizationPackage.Literals.COLOR_CUSTOMIZATION__COLOR,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));

	}

	/**
	 * This adds a property descriptor for the Applied On feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addAppliedOnPropertyDescriptor(Object object) {

		ItemPropertyDescriptor attributePropertyDescriptor = new ExtensionItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_ColorCustomization_appliedOn_feature"), //$NON-NLS-1$
				getString(
						"_UI_PropertyDescriptor_description", "_UI_ColorCustomization_appliedOn_feature", "_UI_ColorCustomization_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				VpstylecustomizationPackage.Literals.COLOR_CUSTOMIZATION__APPLIED_ON,
				true, false, true, null, null,
				// begin-extension-code
				null) {
			public java.util.Collection<?> getChoiceOfValues(Object object) {
				Collection<?> availableChoise = super.getChoiceOfValues(object);
				Collection<EObject> toRemoveChoise = new BasicEList<EObject>();
				for (Object object2 : availableChoise) {
					if (object2 != null && object != null
							&& ! ColorsUseCasesHelper.acceptColor((ColorCustomization)object , object2))
						toRemoveChoise.add((EObject) object2);
				}

				if (toRemoveChoise.size() > 0) {
					availableChoise.removeAll(toRemoveChoise);
				}

				return availableChoise;
			};
		};
		itemPropertyDescriptors.add(attributePropertyDescriptor);
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Color Use Case feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addColorUseCasePropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ColorCustomization_colorUseCase_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ColorCustomization_colorUseCase_feature", "_UI_ColorCustomization_type"),
				 VpstylecustomizationPackage.Literals.COLOR_CUSTOMIZATION__COLOR_USE_CASE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));

	}

	/**
	 * This returns ColorCustomization.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ColorCustomization"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {

		ColorCustomization colorCustomization = (ColorCustomization)object;
		return getString("_UI_ColorCustomization_type") + " " + colorCustomization.isApplyonAll();

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

		switch (notification.getFeatureID(ColorCustomization.class)) {
			case VpstylecustomizationPackage.COLOR_CUSTOMIZATION__COLOR_USE_CASE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}


}
