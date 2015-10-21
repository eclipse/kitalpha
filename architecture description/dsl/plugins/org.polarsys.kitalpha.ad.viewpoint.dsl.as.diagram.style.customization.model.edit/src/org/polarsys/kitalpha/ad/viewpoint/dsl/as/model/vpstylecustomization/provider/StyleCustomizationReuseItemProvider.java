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
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.sirius.viewpoint.description.EStructuralFeatureCustomization;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.provider.NamedElementItemProvider;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.StyleCustomizationReuse;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.VpstylecustomizationPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.helper.StyleReuseSelectionHelper;
import org.polarsys.kitalpha.emde.extension.edit.ExtensionItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpstylecustomization.StyleCustomizationReuse} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StyleCustomizationReuseItemProvider 
	extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleCustomizationReuseItemProvider(AdapterFactory adapterFactory) {
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

			addReusedCustomizationPropertyDescriptor(object);
			addAppliedOnPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Reused Customization feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addReusedCustomizationPropertyDescriptor(Object object) {

		ItemPropertyDescriptor createItemPropertyDescriptor = new ExtensionItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_StyleCustomizationReuse_reusedCustomization_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_StyleCustomizationReuse_reusedCustomization_feature", "_UI_StyleCustomizationReuse_type"),
						VpstylecustomizationPackage.Literals.STYLE_CUSTOMIZATION_REUSE__REUSED_CUSTOMIZATION,
						true,
						false,
						true,
						null,
						null,
						null){
			public java.util.Collection<?> getChoiceOfValues(Object object) {
				Collection<?> availableChoise = super.getChoiceOfValues(object);
				Collection<EObject> toRemoveChoise = new BasicEList<EObject>();

				StyleCustomizationReuse custoReuse = (StyleCustomizationReuse) object;
				EList<EObject> appliedOn = custoReuse.getAppliedOn();
				if (appliedOn.isEmpty())
				{
					return availableChoise;
				}
				else
				{
					for (Object object2 : availableChoise) 
					{
						if (false == StyleReuseSelectionHelper.isCustomizationApplicableOn((EStructuralFeatureCustomization)object2, appliedOn))
							toRemoveChoise.add((EObject) object2);
					}
				}

				if (toRemoveChoise.size() > 0) 
					availableChoise.removeAll(toRemoveChoise);

				return availableChoise;
			};
		};

		itemPropertyDescriptors.add(createItemPropertyDescriptor);
	}

	/**
	 * This adds a property descriptor for the Applied On feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addAppliedOnPropertyDescriptor(Object object) {
		ItemPropertyDescriptor createItemPropertyDescriptor = new ExtensionItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_StyleCustomizationReuse_appliedOn_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_StyleCustomizationReuse_appliedOn_feature", "_UI_StyleCustomizationReuse_type"),
						VpstylecustomizationPackage.Literals.STYLE_CUSTOMIZATION_REUSE__APPLIED_ON,
						true,
						false,
						true,
						null,
						null,
						null){
			public java.util.Collection<?> getChoiceOfValues(Object object) {
				Collection<?> availableChoise = super.getChoiceOfValues(object);
				Collection<EObject> toRemoveChoise = new BasicEList<EObject>();
				
				StyleCustomizationReuse custoReuse = (StyleCustomizationReuse) object;
				EList<EStructuralFeatureCustomization> reusedCustomization = custoReuse.getReusedCustomization();
				if (reusedCustomization.isEmpty())
				{
					for (Object object2 : availableChoise) 
					{
						if (false == StyleReuseSelectionHelper.isStylableElement((EObject) object2))
							toRemoveChoise.add((EObject) object2);
					}
				}
				else
				{
					for (Object object2 : availableChoise) 
					{
						if (false == StyleReuseSelectionHelper.isStyleConformTo((EObject) object2, reusedCustomization))
							toRemoveChoise.add((EObject) object2);
					}
				}
				
				if (toRemoveChoise.size() > 0) 
					availableChoise.removeAll(toRemoveChoise);

				return availableChoise;
			};
		};

		itemPropertyDescriptors.add(createItemPropertyDescriptor);
	}

	/**
	 * This returns StyleCustomizationReuse.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/StyleCustomizationReuse"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {

		String label = ((StyleCustomizationReuse)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_StyleCustomizationReuse_type") :
			getString("_UI_StyleCustomizationReuse_type") + " " + label;

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
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
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
