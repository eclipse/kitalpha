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

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ContainerStyleCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationFactory;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage;

/**
 * This is the item provider adapter for a {@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.ContainerStyleCustomization} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ContainerStyleCustomizationItemProvider extends AbstractNodeStyleCustomizationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerStyleCustomizationItemProvider(AdapterFactory adapterFactory) {
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

			addAppliedOnPropertyDescriptor(object);
			addArcWithPropertyDescriptor(object);
			addArcHeightPropertyDescriptor(object);
			addRoundedCornerPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_ContainerStyleCustomization_appliedOn_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContainerStyleCustomization_appliedOn_feature", "_UI_ContainerStyleCustomization_type"),
				 VpstylecustomizationPackage.Literals.CONTAINER_STYLE_CUSTOMIZATION__APPLIED_ON,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));

	}

	/**
	 * This adds a property descriptor for the Arc With feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArcWithPropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContainerStyleCustomization_arcWith_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContainerStyleCustomization_arcWith_feature", "_UI_ContainerStyleCustomization_type"),
				 VpstylecustomizationPackage.Literals.CONTAINER_STYLE_CUSTOMIZATION__ARC_WITH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));

	}

	/**
	 * This adds a property descriptor for the Arc Height feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArcHeightPropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContainerStyleCustomization_arcHeight_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContainerStyleCustomization_arcHeight_feature", "_UI_ContainerStyleCustomization_type"),
				 VpstylecustomizationPackage.Literals.CONTAINER_STYLE_CUSTOMIZATION__ARC_HEIGHT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));

	}

	/**
	 * This adds a property descriptor for the Rounded Corner feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRoundedCornerPropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContainerStyleCustomization_roundedCorner_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContainerStyleCustomization_roundedCorner_feature", "_UI_ContainerStyleCustomization_type"),
				 VpstylecustomizationPackage.Literals.CONTAINER_STYLE_CUSTOMIZATION__ROUNDED_CORNER,
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
			childrenFeatures.add(VpstylecustomizationPackage.Literals.CONTAINER_STYLE_CUSTOMIZATION__OWNED_SPECIFIC_CONTAINER_STYLE_CUSTOMIZATION);
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
	 * This returns ContainerStyleCustomization.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ContainerStyleCustomization"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {

		ContainerStyleCustomization containerStyleCustomization = (ContainerStyleCustomization)object;
		return getString("_UI_ContainerStyleCustomization_type") + " " + containerStyleCustomization.isApplyonAll();

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

		switch (notification.getFeatureID(ContainerStyleCustomization.class)) {
			case VpstylecustomizationPackage.CONTAINER_STYLE_CUSTOMIZATION__ARC_WITH:
			case VpstylecustomizationPackage.CONTAINER_STYLE_CUSTOMIZATION__ARC_HEIGHT:
			case VpstylecustomizationPackage.CONTAINER_STYLE_CUSTOMIZATION__ROUNDED_CORNER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case VpstylecustomizationPackage.CONTAINER_STYLE_CUSTOMIZATION__OWNED_SPECIFIC_CONTAINER_STYLE_CUSTOMIZATION:
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
						(VpstylecustomizationPackage.Literals.CONTAINER_STYLE_CUSTOMIZATION__OWNED_SPECIFIC_CONTAINER_STYLE_CUSTOMIZATION,
						 VpstylecustomizationFactory.eINSTANCE.createShapeContainerStyleCustomization()));



				newChildDescriptors.add
					(createChildParameter
						(VpstylecustomizationPackage.Literals.CONTAINER_STYLE_CUSTOMIZATION__OWNED_SPECIFIC_CONTAINER_STYLE_CUSTOMIZATION,
						 VpstylecustomizationFactory.eINSTANCE.createFlatContainerStyleCustomization()));



				newChildDescriptors.add
					(createChildParameter
						(VpstylecustomizationPackage.Literals.CONTAINER_STYLE_CUSTOMIZATION__OWNED_SPECIFIC_CONTAINER_STYLE_CUSTOMIZATION,
						 VpstylecustomizationFactory.eINSTANCE.createContainerWorkspaceImageCustomization()));


	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == VpstylecustomizationPackage.Literals.ABSTRACT_NODE_STYLE_CUSTOMIZATION__TOOLTIP_EXPRESSION ||
			childFeature == VpstylecustomizationPackage.Literals.ABSTRACT_NODE_STYLE_CUSTOMIZATION__BORDER_SIZE_COMPUTATION_EXPRESSION;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}


}
