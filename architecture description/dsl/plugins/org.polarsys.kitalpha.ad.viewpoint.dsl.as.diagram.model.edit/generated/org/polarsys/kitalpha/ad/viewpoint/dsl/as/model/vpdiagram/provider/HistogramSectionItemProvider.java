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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.sirius.viewpoint.description.SystemColors;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.ExpressionFactory;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.HistogramSection;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage;

/**
 * This is the item provider adapter for a {@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.HistogramSection} object.
 * <!-- begin-user-doc -->
 * @superClass ExtensionItemProviderAdapter
 * <!-- end-user-doc -->
 * @generated
 */
public class HistogramSectionItemProvider extends ItemProviderAdapter
		implements IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistogramSectionItemProvider(AdapterFactory adapterFactory) {
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

			addBackgroundColorPropertyDescriptor(object);
			addForgroundColorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Background Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBackgroundColorPropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HistogramSection_backgroundColor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HistogramSection_backgroundColor_feature", "_UI_HistogramSection_type"),
				 VpdiagramPackage.Literals.HISTOGRAM_SECTION__BACKGROUND_COLOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));

	}

	/**
	 * This adds a property descriptor for the Forground Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addForgroundColorPropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HistogramSection_forgroundColor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HistogramSection_forgroundColor_feature", "_UI_HistogramSection_type"),
				 VpdiagramPackage.Literals.HISTOGRAM_SECTION__FORGROUND_COLOR,
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
	public Collection<? extends EStructuralFeature> getChildrenFeatures(
			Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(VpdiagramPackage.Literals.HISTOGRAM_SECTION__MIN_VALUE);
			childrenFeatures.add(VpdiagramPackage.Literals.HISTOGRAM_SECTION__MAX_VALUE);
			childrenFeatures.add(VpdiagramPackage.Literals.HISTOGRAM_SECTION__VALUE);
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
	 * This returns HistogramSection.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/HistogramSection"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {

		SystemColors backgroundColor = ((HistogramSection) object)
				.getBackgroundColor();
		SystemColors forgroundColor = ((HistogramSection) object)
				.getForgroundColor();
		String label = "Section ["
				+ (backgroundColor == null ? "" : backgroundColor.getLiteral())
				+ (forgroundColor != null && backgroundColor != null ? " , "
						: "")
				+ (forgroundColor == null ? "" : forgroundColor.getLiteral())
				+ "]";
		// begin-extension-code
		return label == null || label.length() == 0 ? "[" + getString("_UI_HistogramSection_type") + "]" : label; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		// end-extension-code
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

		switch (notification.getFeatureID(HistogramSection.class)) {
			case VpdiagramPackage.HISTOGRAM_SECTION__BACKGROUND_COLOR:
			case VpdiagramPackage.HISTOGRAM_SECTION__FORGROUND_COLOR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case VpdiagramPackage.HISTOGRAM_SECTION__MIN_VALUE:
			case VpdiagramPackage.HISTOGRAM_SECTION__MAX_VALUE:
			case VpdiagramPackage.HISTOGRAM_SECTION__VALUE:
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
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

				newChildDescriptors.add
					(createChildParameter
						(VpdiagramPackage.Literals.HISTOGRAM_SECTION__MIN_VALUE,
						 ExpressionFactory.eINSTANCE.createJavaElement()));



				newChildDescriptors.add
					(createChildParameter
						(VpdiagramPackage.Literals.HISTOGRAM_SECTION__MIN_VALUE,
						 ExpressionFactory.eINSTANCE.createDomainElement()));



				newChildDescriptors.add
					(createChildParameter
						(VpdiagramPackage.Literals.HISTOGRAM_SECTION__MAX_VALUE,
						 ExpressionFactory.eINSTANCE.createJavaElement()));



				newChildDescriptors.add
					(createChildParameter
						(VpdiagramPackage.Literals.HISTOGRAM_SECTION__MAX_VALUE,
						 ExpressionFactory.eINSTANCE.createDomainElement()));



				newChildDescriptors.add
					(createChildParameter
						(VpdiagramPackage.Literals.HISTOGRAM_SECTION__VALUE,
						 ExpressionFactory.eINSTANCE.createJavaElement()));



				newChildDescriptors.add
					(createChildParameter
						(VpdiagramPackage.Literals.HISTOGRAM_SECTION__VALUE,
						 ExpressionFactory.eINSTANCE.createDomainElement()));


	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature,
			Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == VpdiagramPackage.Literals.HISTOGRAM_SECTION__MIN_VALUE ||
			childFeature == VpdiagramPackage.Literals.HISTOGRAM_SECTION__MAX_VALUE ||
			childFeature == VpdiagramPackage.Literals.HISTOGRAM_SECTION__VALUE;

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
