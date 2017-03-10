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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.helper.desc.ViewpointModelReuseResourceHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.VpdescFactory;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.VpdescPackage;

/**
 * This is the item provider adapter for a {@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ViewpointItemProvider extends ShortNamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewpointItemProvider(AdapterFactory adapterFactory) {
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

			addDependenciesPropertyDescriptor(object);
			addParentsPropertyDescriptor(object);
			addUseViewpointPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Dependencies feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addDependenciesPropertyDescriptor(Object object) {

		// begin-extension-code
		IItemPropertyDescriptor dependenciesPropertyDescriptor = new ItemPropertyDescriptor
		// end-extension-code
		(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Viewpoint_dependencies_feature"), //$NON-NLS-1$
				getString(
						"_UI_PropertyDescriptor_description", "_UI_Viewpoint_dependencies_feature", "_UI_Viewpoint_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				VpdescPackage.Literals.VIEWPOINT__DEPENDENCIES, true, false,
				true, null, null,
				// begin-extension-code
				null) {
			@Override
			public Collection<?> getChoiceOfValues(Object object) {
				// Gather all available VpDsl viewpoint in the platform 
				List<Viewpoint> available_viewpoint = ViewpointModelReuseResourceHelper
						.getAvailableVpdslViewpoints(null);

				// Look for the current one and remove it.
				Viewpoint currentViewpoint = (Viewpoint) object;
				boolean checkName = currentViewpoint.getName() != null
						&& currentViewpoint.getName().length() > 0;
				boolean checkShortName = currentViewpoint.getShortName() != null
						&& currentViewpoint.getShortName().length() > 0;
				Viewpoint viewpointToRemove = null;
				for (Viewpoint iViewpoint : available_viewpoint) {
					boolean equals = true;
					boolean iCheckName = iViewpoint.getName() != null
							&& iViewpoint.getName().length() > 0;
					boolean iCheckShortName = iViewpoint.getShortName() != null
							&& iViewpoint.getShortName().length() > 0;
					if (iCheckName
							&& checkName
							&& !iViewpoint.getName().equals(
									currentViewpoint.getName())) {
						equals = false;
					}

					if (iCheckShortName
							&& checkShortName
							&& !iViewpoint.getShortName().equals(
									currentViewpoint.getShortName())) {
						equals = false;
					}

					if (equals) {
						viewpointToRemove = iViewpoint;
						break;
					}
				}

				if (viewpointToRemove != null) {
					available_viewpoint.remove(viewpointToRemove);
				}

				// If there is viewpoints then return them 
				if (available_viewpoint != null
						&& available_viewpoint.size() > 0)
					return available_viewpoint;
				else
					return super.getChoiceOfValues(object);
			}
		};

		itemPropertyDescriptors.add(dependenciesPropertyDescriptor);
		// end-extension-code

	}

	/**
	 * This adds a property descriptor for the Parents feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addParentsPropertyDescriptor(Object object) {

		// begin-extension-code
		IItemPropertyDescriptor parentsPropertyDescriptor = new ItemPropertyDescriptor
		// end-extension-code
		(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Viewpoint_parents_feature"), //$NON-NLS-1$
				getString(
						"_UI_PropertyDescriptor_description", "_UI_Viewpoint_parents_feature", "_UI_Viewpoint_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				VpdescPackage.Literals.VIEWPOINT__PARENTS, true, false, true,
				null, null,
				// begin-extension-code
				null) {
			@Override
			public Collection<?> getChoiceOfValues(Object object) {
				// Gather all available VpDsl viewpoint in the platform 
				List<Viewpoint> available_viewpoint = ViewpointModelReuseResourceHelper
						.getAvailableVpdslViewpoints(null);

				// Look for the current one and remove it.
				Viewpoint currentViewpoint = (Viewpoint) object;
				boolean checkName = currentViewpoint.getName() != null
						&& currentViewpoint.getName().length() > 0;
				boolean checkShortName = currentViewpoint.getShortName() != null
						&& currentViewpoint.getShortName().length() > 0;
				Viewpoint viewpointToRemove = null;
				for (Viewpoint iViewpoint : available_viewpoint) {
					boolean equals = true;
					boolean iCheckName = iViewpoint.getName() != null
							&& iViewpoint.getName().length() > 0;
					boolean iCheckShortName = iViewpoint.getShortName() != null
							&& iViewpoint.getShortName().length() > 0;
					if (iCheckName
							&& checkName
							&& !iViewpoint.getName().equals(
									currentViewpoint.getName())) {
						equals = false;
					}

					if (iCheckShortName
							&& checkShortName
							&& !iViewpoint.getShortName().equals(
									currentViewpoint.getShortName())) {
						equals = false;
					}

					if (equals) {
						viewpointToRemove = iViewpoint;
						break;
					}
				}

				if (viewpointToRemove != null) {
					available_viewpoint.remove(viewpointToRemove);
				}

				// If there is viewpoints then return them 
				if (available_viewpoint != null
						&& available_viewpoint.size() > 0)
					return available_viewpoint;
				else
					return super.getChoiceOfValues(object);
			}
		};

		itemPropertyDescriptors.add(parentsPropertyDescriptor);
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Use Viewpoint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUseViewpointPropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Viewpoint_useViewpoint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Viewpoint_useViewpoint_feature", "_UI_Viewpoint_type"),
				 VpdescPackage.Literals.VIEWPOINT__USE_VIEWPOINT,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(VpdescPackage.Literals.VIEWPOINT__VP_DATA);
			childrenFeatures.add(VpdescPackage.Literals.VIEWPOINT__VP_ASPECTS);
			childrenFeatures.add(VpdescPackage.Literals.VIEWPOINT__VIEWPOINT_RESOURCES);
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
	 * This returns Viewpoint.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Viewpoint"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {

		String label = ((Viewpoint)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Viewpoint_type") :
			getString("_UI_Viewpoint_type") + " " + label;

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

		switch (notification.getFeatureID(Viewpoint.class)) {
			case VpdescPackage.VIEWPOINT__VP_DATA:
			case VpdescPackage.VIEWPOINT__VP_ASPECTS:
			case VpdescPackage.VIEWPOINT__VIEWPOINT_RESOURCES:
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
						(VpdescPackage.Literals.VIEWPOINT__VP_DATA,
						 VpdescFactory.eINSTANCE.createData()));



				newChildDescriptors.add
					(createChildParameter
						(VpdescPackage.Literals.VIEWPOINT__VIEWPOINT_RESOURCES,
						 VpdescFactory.eINSTANCE.createViewpointResources()));


	}

}
