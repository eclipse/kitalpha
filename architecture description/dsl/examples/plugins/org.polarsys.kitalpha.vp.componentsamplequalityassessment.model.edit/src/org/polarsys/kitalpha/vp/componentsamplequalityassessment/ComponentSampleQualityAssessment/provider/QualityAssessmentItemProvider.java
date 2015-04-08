/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.command.CommandParameter;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.polarsys.kitalpha.emde.model.EmdePackage;

import org.polarsys.kitalpha.emde.model.edit.provider.NewChildDescriptorHelper;

import org.polarsys.kitalpha.vp.componentsample.ComponentSample.provider.ComponentElementItemProvider;

import org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.ComponentSampleQualityAssessmentFactory;
import org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.ComponentSampleQualityAssessmentPackage;
import org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.QualityAssessment;

/**
 * This is the item provider adapter for a {@link org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.QualityAssessment} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class QualityAssessmentItemProvider extends ComponentElementItemProvider
		implements IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityAssessmentItemProvider(AdapterFactory adapterFactory) {
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

			addBasedOnPropertyDescriptor(object);
			addContextPropertyDescriptor(object);
			addMaturityLevelPropertyDescriptor(object);
			addConfidenceLevelPropertyDescriptor(object);
			addAssessedPropertyDescriptor(object);
		}
		// begin-extension-code
		checkChildCreationExtender(object);
		// end-extension-code
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Based On feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBasedOnPropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor
				// end-extension-code
				(((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_QualityAssessment_basedOn_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_QualityAssessment_basedOn_feature", "_UI_QualityAssessment_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						ComponentSampleQualityAssessmentPackage.Literals.QUALITY_ASSESSMENT__BASED_ON,
						true, false, true, null, null,
						// begin-extension-code
						null));
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Context feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContextPropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor
				// end-extension-code
				(((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_QualityAssessment_context_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_QualityAssessment_context_feature", "_UI_QualityAssessment_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						ComponentSampleQualityAssessmentPackage.Literals.QUALITY_ASSESSMENT__CONTEXT,
						true, false, true, null, null,
						// begin-extension-code
						null));
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Maturity Level feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaturityLevelPropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor
				// end-extension-code
				(((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_QualityAssessment_maturityLevel_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_QualityAssessment_maturityLevel_feature", "_UI_QualityAssessment_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						ComponentSampleQualityAssessmentPackage.Literals.QUALITY_ASSESSMENT__MATURITY_LEVEL,
						true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
						// begin-extension-code
						null));
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Confidence Level feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConfidenceLevelPropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor
				// end-extension-code
				(((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_QualityAssessment_confidenceLevel_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_QualityAssessment_confidenceLevel_feature", "_UI_QualityAssessment_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						ComponentSampleQualityAssessmentPackage.Literals.QUALITY_ASSESSMENT__CONFIDENCE_LEVEL,
						true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
						// begin-extension-code
						null));
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Assessed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssessedPropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor
				// end-extension-code
				(((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_QualityAssessment_assessed_feature"), //$NON-NLS-1$
						getString(
								"_UI_PropertyDescriptor_description", "_UI_QualityAssessment_assessed_feature", "_UI_QualityAssessment_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						ComponentSampleQualityAssessmentPackage.Literals.QUALITY_ASSESSMENT__ASSESSED,
						true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null,
						// begin-extension-code
						null));
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
	public Collection<? extends EStructuralFeature> getChildrenFeatures(
			Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures
					.add(ComponentSampleQualityAssessmentPackage.Literals.QUALITY_ASSESSMENT__MEASURES);
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
	 * This returns QualityAssessment.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/QualityAssessment")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {

		String label = ((QualityAssessment) object).getName();
		// begin-extension-code
		return label == null || label.length() == 0 ? "[" + getString("_UI_QualityAssessment_type") + "]" : label; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
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

		switch (notification.getFeatureID(QualityAssessment.class)) {
		case ComponentSampleQualityAssessmentPackage.QUALITY_ASSESSMENT__MATURITY_LEVEL:
		case ComponentSampleQualityAssessmentPackage.QUALITY_ASSESSMENT__CONFIDENCE_LEVEL:
		case ComponentSampleQualityAssessmentPackage.QUALITY_ASSESSMENT__ASSESSED:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), false, true));
			return;
		case ComponentSampleQualityAssessmentPackage.QUALITY_ASSESSMENT__MEASURES:
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
		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					EmdePackage.Literals.EXTENSIBLE_ELEMENT__OWNED_EXTENSIONS,
					ComponentSampleQualityAssessmentFactory.eINSTANCE
							.createQualityAssessment());
			if (NewChildDescriptorHelper.isValidCommand(object,
					commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

		// begin-extension-code
		{
			CommandParameter commandParameter = createChildParameter(
					ComponentSampleQualityAssessmentPackage.Literals.QUALITY_ASSESSMENT__MEASURES,
					ComponentSampleQualityAssessmentFactory.eINSTANCE
							.createQualityMeasure());
			if (NewChildDescriptorHelper.isValidCommand(object,
					commandParameter)) {
				newChildDescriptors.add(commandParameter);
			}
		}
		// end-extension-code

	}

}