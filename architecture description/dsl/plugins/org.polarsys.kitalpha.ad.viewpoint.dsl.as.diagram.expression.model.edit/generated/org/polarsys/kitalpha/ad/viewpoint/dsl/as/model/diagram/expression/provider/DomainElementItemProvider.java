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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.DomainElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.ExpressionPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractAttributeType;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Attribute;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ExternalAttributeType;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Condition;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.HistogramSection;

/**
 * This is the item provider adapter for a {@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.diagram.expression.DomainElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainElementItemProvider extends
		ForeignExpressionElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainElementItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	private boolean accept(Object element, Object candidate_value) {
		final EObject eO_element = (EObject) element;
		final Attribute attribute = (Attribute) candidate_value;
		final AbstractAttributeType abstractAttributeType = attribute.getOwned_type();
		if (abstractAttributeType instanceof ExternalAttributeType)
		{
			final ExternalAttributeType externalType = (ExternalAttributeType) abstractAttributeType;
			final String candidate_classifier_name= externalType.getType().getName();
			if (eO_element.eContainer() instanceof HistogramSection)
			{ // Accept only attributes with numerical value
				return (candidate_classifier_name.equals("EInt")
						|| candidate_classifier_name.equals("EIntegerObject") 
						|| candidate_classifier_name.equals("EBigInteger") 
						|| candidate_classifier_name.equals("EBigDecimal")
						|| candidate_classifier_name.equals("EDoubleObject")
						|| candidate_classifier_name.equals("EDouble")
						|| candidate_classifier_name.equals("EFloatObject")
						|| candidate_classifier_name.equals("EFloat"));
			}
			
			if (eO_element.eContainer() instanceof Condition)
			{// Accept only attributes with boolean value
				return candidate_classifier_name.equals("EBooleanObject") || candidate_classifier_name.equals("EBoolean");
			}
		}

		return true;
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

			addAttributePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Attribute feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addAttributePropertyDescriptor(Object object) {
		// begin-extension-code
		ItemPropertyDescriptor attributePropertyDescriptor = new ItemPropertyDescriptor
		// end-extension-code		
		(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_DomainElement_attribute_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_DomainElement_attribute_feature", "_UI_DomainElement_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				ExpressionPackage.Literals.DOMAIN_ELEMENT__ATTRIBUTE, true,
				false, true, null, null,
				// begin-extension-code
				null) {
			public java.util.Collection<?> getChoiceOfValues(Object object) {
				Collection<?> availableChoise = super.getChoiceOfValues(object);
				Collection<EObject> toRemoveChoise = new BasicEList<EObject>();
				for (Object object2 : availableChoise)
				{
					if (object2 != null && object != null && !accept(object, object2))
						toRemoveChoise.add((EObject) object2);
				}

				if (toRemoveChoise.size() > 0)
				{
					for (EObject eObject : toRemoveChoise)
						availableChoise.remove(eObject);
				}

				return availableChoise;
			};
		};
		itemPropertyDescriptors.add(attributePropertyDescriptor);
		// end-extension-code
	}

	/**
	 * This returns DomainElement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DomainElement"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		// begin adapted code
		DomainElement domainElement = (DomainElement) object;

		String label = (domainElement.getAttribute() != null
				&& domainElement.getAttribute().getName() != null
				&& domainElement.getAttribute().getName().length() > 0 ? domainElement
				.getAttribute().getName() : "");

		String feature_name = domainElement.eContainingFeature().getName();
		if (feature_name.toLowerCase().equals("minValue".toLowerCase()))
			label = "[Min] " + label;
		if (feature_name.toLowerCase().equals("maxValue".toLowerCase()))
			label = "[Max] " + label;
		if (feature_name.toLowerCase().equals("value".toLowerCase()))
			label = "[Value] " + label;

		return label; //!= null && label.length() > 0 ? "[Java] "+ label : label; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		// end adapted code

		// begin-extension-code
		//		return "[" + getString("_UI_DomainElement_type") + "]"; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		// end-extension-code
		// begin adapted code
		//		DomainElement delement = (DomainElement) object;
		//		String label = (delement.getAttribute() != null && delement.getAttribute().getName() != null && delement.getAttribute().getName().length() > 0
		//				? delement.getAttribute().getName()
		//				: "");
		//		return label != null && label.length() > 0 ? label : "[" + getString("_UI_DomainElement_type") + "]"; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		// end adapted code
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
	}

}
