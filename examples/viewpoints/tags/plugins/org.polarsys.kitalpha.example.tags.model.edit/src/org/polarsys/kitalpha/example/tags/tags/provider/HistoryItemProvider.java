
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

import org.polarsys.kitalpha.example.tags.tags.History;
import org.polarsys.kitalpha.example.tags.tags.TagsPackage;

/**
 * This is the item provider adapter for a {@link org.polarsys.kitalpha.example.tags.tags.History} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HistoryItemProvider extends AbstractTagEntityItemProvider implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IItemPropertyDescriptor oldStatusPropertyDescriptor;

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryItemProvider(AdapterFactory adapterFactory) {
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
			// Process TagsPackage.Literals.HISTORY__OLD_STATUS
			if (oldStatusPropertyDescriptor != null) {
				Object oldStatusValue = eObject.eGet(TagsPackage.Literals.HISTORY__OLD_STATUS, true);
				if (oldStatusValue != null && oldStatusValue instanceof EObject && ModelExtensionHelper
						.getInstance(eObject).isExtensionModelDisabled((EObject) oldStatusValue)) {
					itemPropertyDescriptors.remove(oldStatusPropertyDescriptor);
				} else if (oldStatusValue == null && ExtensionModelManager.getAnyType(eObject,
						TagsPackage.Literals.HISTORY__OLD_STATUS) != null) {
					itemPropertyDescriptors.remove(oldStatusPropertyDescriptor);
				} else if (itemPropertyDescriptors.contains(oldStatusPropertyDescriptor) == false) {
					itemPropertyDescriptors.add(oldStatusPropertyDescriptor);
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

			addOldStatusPropertyDescriptor(object);
			addChangeDatePropertyDescriptor(object);
			addUserPropertyDescriptor(object);
			addChangeCommentPropertyDescriptor(object);
		}
		// begin-extension-code
		checkChildCreationExtender(object);
		// end-extension-code
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Old Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOldStatusPropertyDescriptor(Object object) {
		// begin-extension-code
		oldStatusPropertyDescriptor = createItemPropertyDescriptor
		// end-extension-code		
		(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_History_oldStatus_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_History_oldStatus_feature", "_UI_History_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				TagsPackage.Literals.HISTORY__OLD_STATUS, true, false, true, null, null,
				// begin-extension-code
				null);
		itemPropertyDescriptors.add(oldStatusPropertyDescriptor);
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Change Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChangeDatePropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors.add(createItemPropertyDescriptor
				// end-extension-code
				(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
						getString("_UI_History_changeDate_feature"), //$NON-NLS-1$
						getString("_UI_PropertyDescriptor_description", "_UI_History_changeDate_feature", //$NON-NLS-1$//$NON-NLS-2$
								"_UI_History_type"), //$NON-NLS-1$
						TagsPackage.Literals.HISTORY__CHANGE_DATE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
						// begin-extension-code
						null));
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the User feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUserPropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors.add(createItemPropertyDescriptor
				// end-extension-code
				(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
						getString("_UI_History_user_feature"), //$NON-NLS-1$
						getString("_UI_PropertyDescriptor_description", "_UI_History_user_feature", "_UI_History_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						TagsPackage.Literals.HISTORY__USER, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
						// begin-extension-code
						null));
		// end-extension-code
	}

	/**
	 * This adds a property descriptor for the Change Comment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChangeCommentPropertyDescriptor(Object object) {

		// begin-extension-code
		itemPropertyDescriptors.add(createItemPropertyDescriptor
				// end-extension-code
				(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
						getString("_UI_History_changeComment_feature"), //$NON-NLS-1$
						getString("_UI_PropertyDescriptor_description", "_UI_History_changeComment_feature", //$NON-NLS-1$//$NON-NLS-2$
								"_UI_History_type"), //$NON-NLS-1$
						TagsPackage.Literals.HISTORY__CHANGE_COMMENT, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
						// begin-extension-code
						null));
		// end-extension-code
	}

	/**
	 * This returns History.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/History")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {

		String label = ((History) object).getId();
		// begin-extension-code
		return label == null || label.length() == 0 ? "[" + getString("_UI_History_type") + "]" : label; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
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

		switch (notification.getFeatureID(History.class)) {
		case TagsPackage.HISTORY__CHANGE_DATE:
		case TagsPackage.HISTORY__USER:
		case TagsPackage.HISTORY__CHANGE_COMMENT:
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