/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.ViewpointActivityExplorer;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.ViewpointActivityExplorerFactory;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.ViewpointActivityExplorerPackage;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.provider.AspectItemProvider;

/**
 * This is the item provider adapter for a {@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.ViewpointActivityExplorer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ViewpointActivityExplorerItemProvider extends AspectItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewpointActivityExplorerItemProvider(AdapterFactory adapterFactory) {
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

			addAllActivitiesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the All Activities feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllActivitiesPropertyDescriptor(Object object) {

		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ViewpointActivityExplorer_allActivities_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ViewpointActivityExplorer_allActivities_feature", "_UI_ViewpointActivityExplorer_type"),
				 ViewpointActivityExplorerPackage.Literals.VIEWPOINT_ACTIVITY_EXPLORER__ALL_ACTIVITIES,
				 false,
				 false,
				 false,
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
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ViewpointActivityExplorerPackage.Literals.VIEWPOINT_ACTIVITY_EXPLORER__OWNED_PAGES);
			childrenFeatures.add(ViewpointActivityExplorerPackage.Literals.VIEWPOINT_ACTIVITY_EXPLORER__OWNED_SECTION_EXTENSIONS);
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
	 * This returns ViewpointActivityExplorer.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ViewpointActivityExplorer"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {

		String label = ((ViewpointActivityExplorer)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ViewpointActivityExplorer_type") :
			"[" + getString("_UI_ViewpointActivityExplorer_type") + "] " + label;

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

		switch (notification.getFeatureID(ViewpointActivityExplorer.class)) {
			case ViewpointActivityExplorerPackage.VIEWPOINT_ACTIVITY_EXPLORER__OWNED_PAGES:
			case ViewpointActivityExplorerPackage.VIEWPOINT_ACTIVITY_EXPLORER__OWNED_SECTION_EXTENSIONS:
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
						(ViewpointActivityExplorerPackage.Literals.VIEWPOINT_ACTIVITY_EXPLORER__OWNED_PAGES,
						 ViewpointActivityExplorerFactory.eINSTANCE.createPage()));



				newChildDescriptors.add
					(createChildParameter
						(ViewpointActivityExplorerPackage.Literals.VIEWPOINT_ACTIVITY_EXPLORER__OWNED_PAGES,
						 ViewpointActivityExplorerFactory.eINSTANCE.createPageExtension()));



				newChildDescriptors.add
					(createChildParameter
						(ViewpointActivityExplorerPackage.Literals.VIEWPOINT_ACTIVITY_EXPLORER__OWNED_SECTION_EXTENSIONS,
						 ViewpointActivityExplorerFactory.eINSTANCE.createSectionExtension()));


	}


}
