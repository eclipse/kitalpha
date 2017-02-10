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

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LabelCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationFactory;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage;

/**
 * This is the item provider adapter for a {@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.LabelCustomization} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LabelCustomizationItemProvider extends AbstractCustomizationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelCustomizationItemProvider(AdapterFactory adapterFactory) {
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
			addSizePropertyDescriptor(object);
			addFormatPropertyDescriptor(object);
			addShowIconPropertyDescriptor(object);
			addIconPathPropertyDescriptor(object);
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
				 getString("_UI_LabelCustomization_color_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LabelCustomization_color_feature", "_UI_LabelCustomization_type"),
				 VpstylecustomizationPackage.Literals.LABEL_CUSTOMIZATION__COLOR,
				 true,
				 false,
				 true,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));

	}

	/**
	 * This adds a property descriptor for the Applied On feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAppliedOnPropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LabelCustomization_appliedOn_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LabelCustomization_appliedOn_feature", "_UI_LabelCustomization_type"),
				 VpstylecustomizationPackage.Literals.LABEL_CUSTOMIZATION__APPLIED_ON,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));

	}

	/**
	 * This adds a property descriptor for the Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSizePropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LabelCustomization_size_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LabelCustomization_size_feature", "_UI_LabelCustomization_type"),
				 VpstylecustomizationPackage.Literals.LABEL_CUSTOMIZATION__SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));

	}

	/**
	 * This adds a property descriptor for the Format feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFormatPropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LabelCustomization_format_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LabelCustomization_format_feature", "_UI_LabelCustomization_type"),
				 VpstylecustomizationPackage.Literals.LABEL_CUSTOMIZATION__FORMAT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));

	}

	/**
	 * This adds a property descriptor for the Show Icon feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShowIconPropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LabelCustomization_showIcon_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LabelCustomization_showIcon_feature", "_UI_LabelCustomization_type"),
				 VpstylecustomizationPackage.Literals.LABEL_CUSTOMIZATION__SHOW_ICON,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));

	}

	/**
	 * This adds a property descriptor for the Icon Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIconPathPropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LabelCustomization_iconPath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LabelCustomization_iconPath_feature", "_UI_LabelCustomization_type"),
				 VpstylecustomizationPackage.Literals.LABEL_CUSTOMIZATION__ICON_PATH,
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
			childrenFeatures.add(VpstylecustomizationPackage.Literals.LABEL_CUSTOMIZATION__OWNED_LABEL_ALIGNMENT);
			childrenFeatures.add(VpstylecustomizationPackage.Literals.LABEL_CUSTOMIZATION__EXPRESSION);
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
	 * This returns LabelCustomization.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LabelCustomization"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {

		LabelCustomization labelCustomization = (LabelCustomization)object;
		return getString("_UI_LabelCustomization_type") + " " + labelCustomization.isApplyonAll();

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

		switch (notification.getFeatureID(LabelCustomization.class)) {
			case VpstylecustomizationPackage.LABEL_CUSTOMIZATION__SIZE:
			case VpstylecustomizationPackage.LABEL_CUSTOMIZATION__FORMAT:
			case VpstylecustomizationPackage.LABEL_CUSTOMIZATION__SHOW_ICON:
			case VpstylecustomizationPackage.LABEL_CUSTOMIZATION__ICON_PATH:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case VpstylecustomizationPackage.LABEL_CUSTOMIZATION__OWNED_LABEL_ALIGNMENT:
			case VpstylecustomizationPackage.LABEL_CUSTOMIZATION__EXPRESSION:
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
						(VpstylecustomizationPackage.Literals.LABEL_CUSTOMIZATION__OWNED_LABEL_ALIGNMENT,
						 VpstylecustomizationFactory.eINSTANCE.createLabelAlignmentCustomization()));



				newChildDescriptors.add
					(createChildParameter
						(VpstylecustomizationPackage.Literals.LABEL_CUSTOMIZATION__EXPRESSION,
						 VpstylecustomizationFactory.eINSTANCE.createCustomizationExpression()));


	}


}
