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

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.provider.NamedElementItemProvider;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.StyleCustomizationDescriptions;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationFactory;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage;

/**
 * This is the item provider adapter for a {@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.StyleCustomizationDescriptions} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StyleCustomizationDescriptionsItemProvider 
	extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleCustomizationDescriptionsItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(VpstylecustomizationPackage.Literals.STYLE_CUSTOMIZATION_DESCRIPTIONS__OWNED_CUSTOMIZATIONS);
			childrenFeatures.add(VpstylecustomizationPackage.Literals.STYLE_CUSTOMIZATION_DESCRIPTIONS__PRECONDTION_EXPRESSION);
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
	 * This returns StyleCustomizationDescriptions.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/StyleCustomizationDescriptions"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {

		String label = ((StyleCustomizationDescriptions)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_StyleCustomizationDescriptions_type") :
			getString("_UI_StyleCustomizationDescriptions_type") + " " + label;

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

		switch (notification.getFeatureID(StyleCustomizationDescriptions.class)) {
			case VpstylecustomizationPackage.STYLE_CUSTOMIZATION_DESCRIPTIONS__OWNED_CUSTOMIZATIONS:
			case VpstylecustomizationPackage.STYLE_CUSTOMIZATION_DESCRIPTIONS__PRECONDTION_EXPRESSION:
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
						(VpstylecustomizationPackage.Literals.STYLE_CUSTOMIZATION_DESCRIPTIONS__OWNED_CUSTOMIZATIONS,
						 VpstylecustomizationFactory.eINSTANCE.createLabelCustomization()));



				newChildDescriptors.add
					(createChildParameter
						(VpstylecustomizationPackage.Literals.STYLE_CUSTOMIZATION_DESCRIPTIONS__OWNED_CUSTOMIZATIONS,
						 VpstylecustomizationFactory.eINSTANCE.createColorCustomization()));



				newChildDescriptors.add
					(createChildParameter
						(VpstylecustomizationPackage.Literals.STYLE_CUSTOMIZATION_DESCRIPTIONS__OWNED_CUSTOMIZATIONS,
						 VpstylecustomizationFactory.eINSTANCE.createEdgeStyleCustomization()));



				newChildDescriptors.add
					(createChildParameter
						(VpstylecustomizationPackage.Literals.STYLE_CUSTOMIZATION_DESCRIPTIONS__OWNED_CUSTOMIZATIONS,
						 VpstylecustomizationFactory.eINSTANCE.createContainerStyleCustomization()));



				newChildDescriptors.add
					(createChildParameter
						(VpstylecustomizationPackage.Literals.STYLE_CUSTOMIZATION_DESCRIPTIONS__OWNED_CUSTOMIZATIONS,
						 VpstylecustomizationFactory.eINSTANCE.createNodeStyleCustomization()));



				newChildDescriptors.add
					(createChildParameter
						(VpstylecustomizationPackage.Literals.STYLE_CUSTOMIZATION_DESCRIPTIONS__PRECONDTION_EXPRESSION,
						 VpstylecustomizationFactory.eINSTANCE.createCustomizationExpression()));


	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return VpstylecustomizationEditPlugin.INSTANCE;
	}


}
