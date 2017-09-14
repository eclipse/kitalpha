/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.ExpressionFactory;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.provider.NamedElementItemProvider;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.AbstractDecorator;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage;

/**
 * This is the item provider adapter for a {@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.AbstractDecorator} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractDecoratorItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractDecoratorItemProvider(AdapterFactory adapterFactory) {
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

			addPositionPropertyDescriptor(object);
			addDirectionPropertyDescriptor(object);
			addIconPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Position feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPositionPropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractDecorator_position_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractDecorator_position_feature", "_UI_AbstractDecorator_type"),
				 VpdiagramPackage.Literals.ABSTRACT_DECORATOR__POSITION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));

	}

	/**
	 * This adds a property descriptor for the Direction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDirectionPropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractDecorator_direction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractDecorator_direction_feature", "_UI_AbstractDecorator_type"),
				 VpdiagramPackage.Literals.ABSTRACT_DECORATOR__DIRECTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));

	}

	/**
	 * This adds a property descriptor for the Icon feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIconPropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractDecorator_icon_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractDecorator_icon_feature", "_UI_AbstractDecorator_type"),
				 VpdiagramPackage.Literals.ABSTRACT_DECORATOR__ICON,
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
			childrenFeatures.add(VpdiagramPackage.Literals.ABSTRACT_DECORATOR__PRECONDITION);
			childrenFeatures.add(VpdiagramPackage.Literals.ABSTRACT_DECORATOR__TOOLTIP);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {

		String label = ((AbstractDecorator)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_AbstractDecorator_type") :
			getString("_UI_AbstractDecorator_type") + " " + label;

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

		switch (notification.getFeatureID(AbstractDecorator.class)) {
			case VpdiagramPackage.ABSTRACT_DECORATOR__POSITION:
			case VpdiagramPackage.ABSTRACT_DECORATOR__DIRECTION:
			case VpdiagramPackage.ABSTRACT_DECORATOR__ICON:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case VpdiagramPackage.ABSTRACT_DECORATOR__PRECONDITION:
			case VpdiagramPackage.ABSTRACT_DECORATOR__TOOLTIP:
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
						(VpdiagramPackage.Literals.ABSTRACT_DECORATOR__PRECONDITION,
						 ExpressionFactory.eINSTANCE.createJavaElement()));



				newChildDescriptors.add
					(createChildParameter
						(VpdiagramPackage.Literals.ABSTRACT_DECORATOR__PRECONDITION,
						 ExpressionFactory.eINSTANCE.createDomainElement()));



				newChildDescriptors.add
					(createChildParameter
						(VpdiagramPackage.Literals.ABSTRACT_DECORATOR__PRECONDITION,
						 ExpressionFactory.eINSTANCE.createStringElement()));



				newChildDescriptors.add
					(createChildParameter
						(VpdiagramPackage.Literals.ABSTRACT_DECORATOR__TOOLTIP,
						 ExpressionFactory.eINSTANCE.createJavaElement()));



				newChildDescriptors.add
					(createChildParameter
						(VpdiagramPackage.Literals.ABSTRACT_DECORATOR__TOOLTIP,
						 ExpressionFactory.eINSTANCE.createDomainElement()));



				newChildDescriptors.add
					(createChildParameter
						(VpdiagramPackage.Literals.ABSTRACT_DECORATOR__TOOLTIP,
						 ExpressionFactory.eINSTANCE.createStringElement()));


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
			childFeature == VpdiagramPackage.Literals.ABSTRACT_DECORATOR__PRECONDITION ||
			childFeature == VpdiagramPackage.Literals.ABSTRACT_DECORATOR__TOOLTIP;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return VpdiagramEditPlugin.INSTANCE;
	}


}
