/**
 *
 * Copyright (c) Polarsys, 2014. All rights reserved.
 *
 */
package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.HudsonDeployment;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.VpbuildFactory;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.VpbuildPackage;

/**
 * This is the item provider adapter for a {@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpbuild.HudsonDeployment} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HudsonDeploymentItemProvider extends ItemProviderAdapter implements
		IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HudsonDeploymentItemProvider(AdapterFactory adapterFactory) {
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

			addAntNamePropertyDescriptor(object);
			addAssignedNodePropertyDescriptor(object);
			addBuild_idPropertyDescriptor(object);
			addEnabledPropertyDescriptor(object);
			addJdkNamePropertyDescriptor(object);
			addUserDeployJobNamePropertyDescriptor(object);
			addUserDeployServerUrlPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Ant Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAntNamePropertyDescriptor(Object object) {

		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_HudsonDeployment_antName_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_HudsonDeployment_antName_feature", "_UI_HudsonDeployment_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						VpbuildPackage.Literals.HUDSON_DEPLOYMENT__ANT_NAME,
						true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));

	}

	/**
	 * This adds a property descriptor for the Assigned Node feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssignedNodePropertyDescriptor(Object object) {

		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_HudsonDeployment_assignedNode_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_HudsonDeployment_assignedNode_feature", "_UI_HudsonDeployment_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						VpbuildPackage.Literals.HUDSON_DEPLOYMENT__ASSIGNED_NODE,
						true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));

	}

	/**
	 * This adds a property descriptor for the Build id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBuild_idPropertyDescriptor(Object object) {

		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_HudsonDeployment_build_id_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_HudsonDeployment_build_id_feature", "_UI_HudsonDeployment_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						VpbuildPackage.Literals.HUDSON_DEPLOYMENT__BUILD_ID,
						true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));

	}

	/**
	 * This adds a property descriptor for the Enabled feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnabledPropertyDescriptor(Object object) {

		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_HudsonDeployment_enabled_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_HudsonDeployment_enabled_feature", "_UI_HudsonDeployment_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						VpbuildPackage.Literals.HUDSON_DEPLOYMENT__ENABLED,
						true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));

	}

	/**
	 * This adds a property descriptor for the Jdk Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addJdkNamePropertyDescriptor(Object object) {

		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_HudsonDeployment_jdkName_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_HudsonDeployment_jdkName_feature", "_UI_HudsonDeployment_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						VpbuildPackage.Literals.HUDSON_DEPLOYMENT__JDK_NAME,
						true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));

	}

	/**
	 * This adds a property descriptor for the User Deploy Job Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUserDeployJobNamePropertyDescriptor(Object object) {

		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_HudsonDeployment_userDeployJobName_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_HudsonDeployment_userDeployJobName_feature", "_UI_HudsonDeployment_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						VpbuildPackage.Literals.HUDSON_DEPLOYMENT__USER_DEPLOY_JOB_NAME,
						true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));

	}

	/**
	 * This adds a property descriptor for the User Deploy Server Url feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUserDeployServerUrlPropertyDescriptor(Object object) {

		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_HudsonDeployment_userDeployServerUrl_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_HudsonDeployment_userDeployServerUrl_feature", "_UI_HudsonDeployment_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						VpbuildPackage.Literals.HUDSON_DEPLOYMENT__USER_DEPLOY_SERVER_URL,
						true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));

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
			childrenFeatures
					.add(VpbuildPackage.Literals.HUDSON_DEPLOYMENT__USERS);
			childrenFeatures
					.add(VpbuildPackage.Literals.HUDSON_DEPLOYMENT__GENERATION_LOCATION);
			childrenFeatures
					.add(VpbuildPackage.Literals.HUDSON_DEPLOYMENT__TRIGGERS);
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean hasChildren(Object object) {
		return hasChildren(object, true);
	}

	/**
	 * This returns HudsonDeployment.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/HudsonDeployment")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {

		String label = ((HudsonDeployment) object).getAntName();
		return label == null || label.length() == 0 ? getString("_UI_HudsonDeployment_type") : //$NON-NLS-1$
				getString("_UI_HudsonDeployment_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$

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

		switch (notification.getFeatureID(HudsonDeployment.class)) {
		case VpbuildPackage.HUDSON_DEPLOYMENT__ANT_NAME:
		case VpbuildPackage.HUDSON_DEPLOYMENT__ASSIGNED_NODE:
		case VpbuildPackage.HUDSON_DEPLOYMENT__BUILD_ID:
		case VpbuildPackage.HUDSON_DEPLOYMENT__ENABLED:
		case VpbuildPackage.HUDSON_DEPLOYMENT__JDK_NAME:
		case VpbuildPackage.HUDSON_DEPLOYMENT__USER_DEPLOY_JOB_NAME:
		case VpbuildPackage.HUDSON_DEPLOYMENT__USER_DEPLOY_SERVER_URL:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), false, true));
			return;
		case VpbuildPackage.HUDSON_DEPLOYMENT__USERS:
		case VpbuildPackage.HUDSON_DEPLOYMENT__GENERATION_LOCATION:
		case VpbuildPackage.HUDSON_DEPLOYMENT__TRIGGERS:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), true, false));
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

		newChildDescriptors.add(createChildParameter(
				VpbuildPackage.Literals.HUDSON_DEPLOYMENT__USERS,
				VpbuildFactory.eINSTANCE.createUser()));

		newChildDescriptors.add(createChildParameter(
				VpbuildPackage.Literals.HUDSON_DEPLOYMENT__GENERATION_LOCATION,
				VpbuildFactory.eINSTANCE.createGenerationLocation()));

		newChildDescriptors.add(createChildParameter(
				VpbuildPackage.Literals.HUDSON_DEPLOYMENT__TRIGGERS,
				VpbuildFactory.eINSTANCE.createTrigger()));

		newChildDescriptors.add(createChildParameter(
				VpbuildPackage.Literals.HUDSON_DEPLOYMENT__TRIGGERS,
				VpbuildFactory.eINSTANCE.createCron()));

		newChildDescriptors.add(createChildParameter(
				VpbuildPackage.Literals.HUDSON_DEPLOYMENT__TRIGGERS,
				VpbuildFactory.eINSTANCE.createSCM()));

	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ((IChildCreationExtender) adapterFactory).getResourceLocator();
	}

}
