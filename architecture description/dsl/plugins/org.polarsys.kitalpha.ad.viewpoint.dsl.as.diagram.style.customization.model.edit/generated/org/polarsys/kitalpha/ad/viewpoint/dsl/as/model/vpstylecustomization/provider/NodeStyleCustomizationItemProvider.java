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
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.NodeStyleCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationFactory;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage;

/**
 * This is the item provider adapter for a {@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.NodeStyleCustomization} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NodeStyleCustomizationItemProvider extends AbstractNodeStyleCustomizationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeStyleCustomizationItemProvider(AdapterFactory adapterFactory) {
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
			addLabelPositionPropertyDescriptor(object);
			addHideLabelByDefaultPropertyDescriptor(object);
			addResizeKindPropertyDescriptor(object);
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
				 getString("_UI_NodeStyleCustomization_appliedOn_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NodeStyleCustomization_appliedOn_feature", "_UI_NodeStyleCustomization_type"),
				 VpstylecustomizationPackage.Literals.NODE_STYLE_CUSTOMIZATION__APPLIED_ON,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));

	}

	/**
	 * This adds a property descriptor for the Label Position feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLabelPositionPropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NodeStyleCustomization_labelPosition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NodeStyleCustomization_labelPosition_feature", "_UI_NodeStyleCustomization_type"),
				 VpstylecustomizationPackage.Literals.NODE_STYLE_CUSTOMIZATION__LABEL_POSITION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));

	}

	/**
	 * This adds a property descriptor for the Hide Label By Default feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHideLabelByDefaultPropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NodeStyleCustomization_hideLabelByDefault_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NodeStyleCustomization_hideLabelByDefault_feature", "_UI_NodeStyleCustomization_type"),
				 VpstylecustomizationPackage.Literals.NODE_STYLE_CUSTOMIZATION__HIDE_LABEL_BY_DEFAULT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));

	}

	/**
	 * This adds a property descriptor for the Resize Kind feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResizeKindPropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NodeStyleCustomization_resizeKind_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NodeStyleCustomization_resizeKind_feature", "_UI_NodeStyleCustomization_type"),
				 VpstylecustomizationPackage.Literals.NODE_STYLE_CUSTOMIZATION__RESIZE_KIND,
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
			childrenFeatures.add(VpstylecustomizationPackage.Literals.NODE_STYLE_CUSTOMIZATION__OWNED_SPECIFIC_NODE_STYLE_CUSTOMIZATION);
			childrenFeatures.add(VpstylecustomizationPackage.Literals.NODE_STYLE_CUSTOMIZATION__SIZE_COMPUTATION_EXPRESSION);
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
	 * This returns NodeStyleCustomization.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/NodeStyleCustomization"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {

		NodeStyleCustomization nodeStyleCustomization = (NodeStyleCustomization)object;
		return getString("_UI_NodeStyleCustomization_type") + " " + nodeStyleCustomization.isApplyonAll();

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

		switch (notification.getFeatureID(NodeStyleCustomization.class)) {
			case VpstylecustomizationPackage.NODE_STYLE_CUSTOMIZATION__LABEL_POSITION:
			case VpstylecustomizationPackage.NODE_STYLE_CUSTOMIZATION__HIDE_LABEL_BY_DEFAULT:
			case VpstylecustomizationPackage.NODE_STYLE_CUSTOMIZATION__RESIZE_KIND:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case VpstylecustomizationPackage.NODE_STYLE_CUSTOMIZATION__OWNED_SPECIFIC_NODE_STYLE_CUSTOMIZATION:
			case VpstylecustomizationPackage.NODE_STYLE_CUSTOMIZATION__SIZE_COMPUTATION_EXPRESSION:
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
						(VpstylecustomizationPackage.Literals.NODE_STYLE_CUSTOMIZATION__OWNED_SPECIFIC_NODE_STYLE_CUSTOMIZATION,
						 VpstylecustomizationFactory.eINSTANCE.createEllipseCustomization()));



				newChildDescriptors.add
					(createChildParameter
						(VpstylecustomizationPackage.Literals.NODE_STYLE_CUSTOMIZATION__OWNED_SPECIFIC_NODE_STYLE_CUSTOMIZATION,
						 VpstylecustomizationFactory.eINSTANCE.createLozengeCustomization()));



				newChildDescriptors.add
					(createChildParameter
						(VpstylecustomizationPackage.Literals.NODE_STYLE_CUSTOMIZATION__OWNED_SPECIFIC_NODE_STYLE_CUSTOMIZATION,
						 VpstylecustomizationFactory.eINSTANCE.createSquareCustomization()));



				newChildDescriptors.add
					(createChildParameter
						(VpstylecustomizationPackage.Literals.NODE_STYLE_CUSTOMIZATION__OWNED_SPECIFIC_NODE_STYLE_CUSTOMIZATION,
						 VpstylecustomizationFactory.eINSTANCE.createBundledImageCustomization()));



				newChildDescriptors.add
					(createChildParameter
						(VpstylecustomizationPackage.Literals.NODE_STYLE_CUSTOMIZATION__OWNED_SPECIFIC_NODE_STYLE_CUSTOMIZATION,
						 VpstylecustomizationFactory.eINSTANCE.createDotCustomization()));



				newChildDescriptors.add
					(createChildParameter
						(VpstylecustomizationPackage.Literals.NODE_STYLE_CUSTOMIZATION__OWNED_SPECIFIC_NODE_STYLE_CUSTOMIZATION,
						 VpstylecustomizationFactory.eINSTANCE.createGaugeCustomization()));



				newChildDescriptors.add
					(createChildParameter
						(VpstylecustomizationPackage.Literals.NODE_STYLE_CUSTOMIZATION__OWNED_SPECIFIC_NODE_STYLE_CUSTOMIZATION,
						 VpstylecustomizationFactory.eINSTANCE.createNodeWorkspaceImageCustomization()));



				newChildDescriptors.add
					(createChildParameter
						(VpstylecustomizationPackage.Literals.NODE_STYLE_CUSTOMIZATION__SIZE_COMPUTATION_EXPRESSION,
						 VpstylecustomizationFactory.eINSTANCE.createCustomizationExpression()));


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
			childFeature == VpstylecustomizationPackage.Literals.ABSTRACT_NODE_STYLE_CUSTOMIZATION__BORDER_SIZE_COMPUTATION_EXPRESSION ||
			childFeature == VpstylecustomizationPackage.Literals.NODE_STYLE_CUSTOMIZATION__SIZE_COMPUTATION_EXPRESSION;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}


}
