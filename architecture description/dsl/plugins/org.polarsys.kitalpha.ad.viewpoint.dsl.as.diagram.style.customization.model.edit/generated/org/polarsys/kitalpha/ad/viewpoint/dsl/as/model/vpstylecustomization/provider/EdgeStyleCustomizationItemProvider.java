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
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EdgeStyleCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationFactory;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage;

/**
 * This is the item provider adapter for a {@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.EdgeStyleCustomization} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EdgeStyleCustomizationItemProvider extends AbstractCustomizationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeStyleCustomizationItemProvider(AdapterFactory adapterFactory) {
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
			addCenteredSourceMappingsPropertyDescriptor(object);
			addCenteredTargetMappingsPropertyDescriptor(object);
			addBeginLabelStyleDescriptionPropertyDescriptor(object);
			addCenterLabelStyleDescriptionPropertyDescriptor(object);
			addEndLabelStyleDescriptionPropertyDescriptor(object);
			addLineStylePropertyDescriptor(object);
			addSourceArrowPropertyDescriptor(object);
			addTargetArrowPropertyDescriptor(object);
			addRoutingStylePropertyDescriptor(object);
			addFoldingStylePropertyDescriptor(object);
			addEndCenteringPropertyDescriptor(object);
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
				 getString("_UI_EdgeStyleCustomization_appliedOn_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EdgeStyleCustomization_appliedOn_feature", "_UI_EdgeStyleCustomization_type"),
				 VpstylecustomizationPackage.Literals.EDGE_STYLE_CUSTOMIZATION__APPLIED_ON,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));

	}

	/**
	 * This adds a property descriptor for the Centered Source Mappings feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCenteredSourceMappingsPropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EdgeStyleCustomization_centeredSourceMappings_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EdgeStyleCustomization_centeredSourceMappings_feature", "_UI_EdgeStyleCustomization_type"),
				 VpstylecustomizationPackage.Literals.EDGE_STYLE_CUSTOMIZATION__CENTERED_SOURCE_MAPPINGS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));

	}

	/**
	 * This adds a property descriptor for the Centered Target Mappings feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCenteredTargetMappingsPropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EdgeStyleCustomization_centeredTargetMappings_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EdgeStyleCustomization_centeredTargetMappings_feature", "_UI_EdgeStyleCustomization_type"),
				 VpstylecustomizationPackage.Literals.EDGE_STYLE_CUSTOMIZATION__CENTERED_TARGET_MAPPINGS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));

	}

	/**
	 * This adds a property descriptor for the Begin Label Style Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBeginLabelStyleDescriptionPropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EdgeStyleCustomization_beginLabelStyleDescription_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EdgeStyleCustomization_beginLabelStyleDescription_feature", "_UI_EdgeStyleCustomization_type"),
				 VpstylecustomizationPackage.Literals.EDGE_STYLE_CUSTOMIZATION__BEGIN_LABEL_STYLE_DESCRIPTION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));

	}

	/**
	 * This adds a property descriptor for the Center Label Style Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCenterLabelStyleDescriptionPropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EdgeStyleCustomization_centerLabelStyleDescription_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EdgeStyleCustomization_centerLabelStyleDescription_feature", "_UI_EdgeStyleCustomization_type"),
				 VpstylecustomizationPackage.Literals.EDGE_STYLE_CUSTOMIZATION__CENTER_LABEL_STYLE_DESCRIPTION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));

	}

	/**
	 * This adds a property descriptor for the End Label Style Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEndLabelStyleDescriptionPropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EdgeStyleCustomization_endLabelStyleDescription_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EdgeStyleCustomization_endLabelStyleDescription_feature", "_UI_EdgeStyleCustomization_type"),
				 VpstylecustomizationPackage.Literals.EDGE_STYLE_CUSTOMIZATION__END_LABEL_STYLE_DESCRIPTION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));

	}

	/**
	 * This adds a property descriptor for the Line Style feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLineStylePropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EdgeStyleCustomization_lineStyle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EdgeStyleCustomization_lineStyle_feature", "_UI_EdgeStyleCustomization_type"),
				 VpstylecustomizationPackage.Literals.EDGE_STYLE_CUSTOMIZATION__LINE_STYLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));

	}

	/**
	 * This adds a property descriptor for the Source Arrow feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceArrowPropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EdgeStyleCustomization_sourceArrow_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EdgeStyleCustomization_sourceArrow_feature", "_UI_EdgeStyleCustomization_type"),
				 VpstylecustomizationPackage.Literals.EDGE_STYLE_CUSTOMIZATION__SOURCE_ARROW,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));

	}

	/**
	 * This adds a property descriptor for the Target Arrow feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetArrowPropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EdgeStyleCustomization_targetArrow_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EdgeStyleCustomization_targetArrow_feature", "_UI_EdgeStyleCustomization_type"),
				 VpstylecustomizationPackage.Literals.EDGE_STYLE_CUSTOMIZATION__TARGET_ARROW,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));

	}

	/**
	 * This adds a property descriptor for the Routing Style feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRoutingStylePropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EdgeStyleCustomization_routingStyle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EdgeStyleCustomization_routingStyle_feature", "_UI_EdgeStyleCustomization_type"),
				 VpstylecustomizationPackage.Literals.EDGE_STYLE_CUSTOMIZATION__ROUTING_STYLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));

	}

	/**
	 * This adds a property descriptor for the Folding Style feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFoldingStylePropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EdgeStyleCustomization_foldingStyle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EdgeStyleCustomization_foldingStyle_feature", "_UI_EdgeStyleCustomization_type"),
				 VpstylecustomizationPackage.Literals.EDGE_STYLE_CUSTOMIZATION__FOLDING_STYLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));

	}

	/**
	 * This adds a property descriptor for the End Centering feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEndCenteringPropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EdgeStyleCustomization_endCentering_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EdgeStyleCustomization_endCentering_feature", "_UI_EdgeStyleCustomization_type"),
				 VpstylecustomizationPackage.Literals.EDGE_STYLE_CUSTOMIZATION__END_CENTERING,
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
			childrenFeatures.add(VpstylecustomizationPackage.Literals.EDGE_STYLE_CUSTOMIZATION__SIZE_COMPUTATION_EXPRESSION);
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
	 * This returns EdgeStyleCustomization.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EdgeStyleCustomization"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {

		EdgeStyleCustomization edgeStyleCustomization = (EdgeStyleCustomization)object;
		return getString("_UI_EdgeStyleCustomization_type") + " " + edgeStyleCustomization.isApplyonAll();

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

		switch (notification.getFeatureID(EdgeStyleCustomization.class)) {
			case VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__LINE_STYLE:
			case VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__SOURCE_ARROW:
			case VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__TARGET_ARROW:
			case VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__ROUTING_STYLE:
			case VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__FOLDING_STYLE:
			case VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__END_CENTERING:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case VpstylecustomizationPackage.EDGE_STYLE_CUSTOMIZATION__SIZE_COMPUTATION_EXPRESSION:
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
						(VpstylecustomizationPackage.Literals.EDGE_STYLE_CUSTOMIZATION__SIZE_COMPUTATION_EXPRESSION,
						 VpstylecustomizationFactory.eINSTANCE.createCustomizationExpression()));


	}


}
