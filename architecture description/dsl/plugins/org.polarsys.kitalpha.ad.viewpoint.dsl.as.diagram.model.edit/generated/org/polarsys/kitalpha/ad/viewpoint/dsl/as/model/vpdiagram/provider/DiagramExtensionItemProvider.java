/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.sirius.diagram.description.DiagramDescription;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.diagram.helper.extension.DoremiDiagramElementHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramExtension;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.VpdiagramPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationFactory;

/**
 * This is the item provider adapter for a {@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramExtension} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DiagramExtensionItemProvider extends
		DiagramRepresentationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramExtensionItemProvider(AdapterFactory adapterFactory) {
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

			addExtented_diagramPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Extented diagram feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addExtented_diagramPropertyDescriptor(Object object) {
		// begin-added-code
		EObject currentObject = null;
		if (object != null && object instanceof EObject)
			currentObject = (EObject) object;

		final List<DiagramDescription> diagramList = DoremiDiagramElementHelper
				.getAvailableDoremiDiagramFor(currentObject);

		ItemPropertyDescriptor extented_diagramPropertyDescriptor; 
		
		if (diagramList != null && !diagramList.isEmpty()) {
			extented_diagramPropertyDescriptor = new ItemPropertyDescriptor(
					((ComposeableAdapterFactory) adapterFactory)
							.getRootAdapterFactory(),
					getResourceLocator(),
					getString("_UI_DiagramExtension_extented_diagram_feature"), //$NON-NLS-1$
					getString(
							"_UI_PropertyDescriptor_description", "_UI_DiagramExtension_extented_diagram_feature", "_UI_DiagramExtension_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
					VpdiagramPackage.Literals.DIAGRAM_EXTENSION__EXTENTED_DIAGRAM,
					true, false, true, null, null,
					// begin-extension-code
					null) {
				@Override
				public Collection<?> getChoiceOfValues(Object object) {
					return (diagramList.isEmpty() ? super
							.getChoiceOfValues(object) : diagramList);
				}
			};
		}
		// end-added-code
		else {
			// begin-extension-code
			extented_diagramPropertyDescriptor = createItemPropertyDescriptor
			// end-extension-code		
			(((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
					getResourceLocator(),
					getString("_UI_DiagramExtension_extented_diagram_feature"), //$NON-NLS-1$
					getString(
							"_UI_PropertyDescriptor_description", "_UI_DiagramExtension_extented_diagram_feature", "_UI_DiagramExtension_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
					VpdiagramPackage.Literals.DIAGRAM_EXTENSION__EXTENTED_DIAGRAM,
					true, false, true, null, null,
					// begin-extension-code
					null);
		}
		itemPropertyDescriptors.add(extented_diagramPropertyDescriptor);
		// end-extension-code
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
			childrenFeatures.add(VpdiagramPackage.Literals.DIAGRAM_EXTENSION__OWNED_CUSTOMIZATIONS);
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
	 * This returns DiagramExtension.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DiagramExtension"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {

		String label = ((DiagramExtension)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DiagramExtension_type") :
			getString("_UI_DiagramExtension_type") + " " + label;

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

		switch (notification.getFeatureID(DiagramExtension.class)) {
			case VpdiagramPackage.DIAGRAM_EXTENSION__OWNED_CUSTOMIZATIONS:
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
						(VpdiagramPackage.Literals.DIAGRAM_EXTENSION__OWNED_CUSTOMIZATIONS,
						 VpstylecustomizationFactory.eINSTANCE.createCustomizations()));


	}

}
