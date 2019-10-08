
package org.polarsys.kitalpha.example.tags.tags.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.polarsys.kitalpha.emde.extension.ExtensionModelManager;
import org.polarsys.kitalpha.emde.extension.ModelExtensionHelper;

import org.polarsys.kitalpha.example.tags.tags.Status;
import org.polarsys.kitalpha.example.tags.tags.TagsPackage;

/**
 * This is the item provider adapter for a {@link org.polarsys.kitalpha.example.tags.tags.Status} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StatusItemProvider extends AbstractNamedEntityItemProvider implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IItemPropertyDescriptor kindPropertyDescriptor;

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void checkChildCreationExtender(Object object) {
		super.checkChildCreationExtender(object);
		if (object instanceof EObject) {
			EObject eObject = (EObject) object;
			// Process TagsPackage.Literals.STATUS__KIND
			if (kindPropertyDescriptor != null) {
				Object kindValue = eObject.eGet(TagsPackage.Literals.STATUS__KIND, true);
				if (kindValue != null && kindValue instanceof EObject
						&& ModelExtensionHelper.getInstance(eObject).isExtensionModelDisabled((EObject) kindValue)) {
					itemPropertyDescriptors.remove(kindPropertyDescriptor);
				} else if (kindValue == null
						&& ExtensionModelManager.getAnyType(eObject, TagsPackage.Literals.STATUS__KIND) != null) {
					itemPropertyDescriptors.remove(kindPropertyDescriptor);
				} else if (itemPropertyDescriptors.contains(kindPropertyDescriptor) == false) {
					itemPropertyDescriptors.add(kindPropertyDescriptor);
				}
			}
		}
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

			addKindPropertyDescriptor(object);
			addIconePropertyDescriptor(object);
			addColorPropertyDescriptor(object);
		}
		// begin-extension-code
		checkChildCreationExtender(object);
		// end-extension-code
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Kind feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKindPropertyDescriptor(Object object) {
		// begin-extension-code
		kindPropertyDescriptor = createItemPropertyDescriptor
		// end-extension-code		
		(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Status_kind_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_Status_kind_feature", "_UI_Status_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				TagsPackage.Literals.STATUS__KIND, true, false, true, null, null,
				// begin-extension-code
				null);
		itemPropertyDescriptors.add(kindPropertyDescriptor);
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Icone feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIconePropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors.add(createItemPropertyDescriptor
				// end-extension-code
				(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
						getString("_UI_Status_icone_feature"), //$NON-NLS-1$
						getString("_UI_PropertyDescriptor_description", "_UI_Status_icone_feature", "_UI_Status_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						TagsPackage.Literals.STATUS__ICONE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
						// begin-extension-code
						null));
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addColorPropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors.add(createItemPropertyDescriptor
				// end-extension-code
				(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
						getString("_UI_Status_color_feature"), //$NON-NLS-1$
						getString("_UI_PropertyDescriptor_description", "_UI_Status_color_feature", "_UI_Status_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						TagsPackage.Literals.STATUS__COLOR, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
						// begin-extension-code
						null));
		// end-extension-code
	}

	/**
	 * This returns Status.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Status")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {

		String label = ((Status) object).getName();
		// begin-extension-code
		return label == null || label.length() == 0 ? "[" + getString("_UI_Status_type") + "]" : label; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
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

		switch (notification.getFeatureID(Status.class)) {
		case TagsPackage.STATUS__ICONE:
		case TagsPackage.STATUS__COLOR:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

}