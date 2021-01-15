/**
 */
package PatternDependencyAnalysis.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.egf.model.pattern.PatternFactory;
import org.eclipse.egf.model.pattern.provider.PatternItemProvider;
import org.eclipse.egf.model.pattern.provider.PatternItemProviderAdapterFactory;
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
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import PatternDependencyAnalysis.PatternAnalysis;
import PatternDependencyAnalysis.PatternDependencyAnalysisFactory;
import PatternDependencyAnalysis.PatternDependencyAnalysisPackage;

/**
 * This is the item provider adapter for a {@link PatternDependencyAnalysis.PatternAnalysis} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PatternAnalysisItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2020 THALES GLOBAL SERVICES.\nThis program and the accompanying materials are made available under the\nterms of the Eclipse Public License 2.0 which is available at\nhttp://www.eclipse.org/legal/epl-2.0\n\nSPDX-License-Identifier: EPL-2.0\n \nContributors:\n  Thales - initial API and implementation";

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternAnalysisItemProvider(AdapterFactory adapterFactory) {
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

			addPatternPropertyDescriptor(object);
			addSuperPatternPropertyDescriptor(object);
			addCalledByPropertyDescriptor(object);
			addInheritedByPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Pattern feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPatternPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PatternAnalysis_pattern_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PatternAnalysis_pattern_feature", "_UI_PatternAnalysis_type"),
				 PatternDependencyAnalysisPackage.Literals.PATTERN_ANALYSIS__PATTERN,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Super Pattern feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSuperPatternPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PatternAnalysis_superPattern_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PatternAnalysis_superPattern_feature", "_UI_PatternAnalysis_type"),
				 PatternDependencyAnalysisPackage.Literals.PATTERN_ANALYSIS__SUPER_PATTERN,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Called By feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCalledByPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PatternAnalysis_calledBy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PatternAnalysis_calledBy_feature", "_UI_PatternAnalysis_type"),
				 PatternDependencyAnalysisPackage.Literals.PATTERN_ANALYSIS__CALLED_BY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Inherited By feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInheritedByPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PatternAnalysis_inheritedBy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PatternAnalysis_inheritedBy_feature", "_UI_PatternAnalysis_type"),
				 PatternDependencyAnalysisPackage.Literals.PATTERN_ANALYSIS__INHERITED_BY,
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
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(PatternDependencyAnalysisPackage.Literals.PATTERN_ANALYSIS__METHODS);
			childrenFeatures.add(PatternDependencyAnalysisPackage.Literals.PATTERN_ANALYSIS__PARAMETERS);
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
	 * This returns PatternAnalysis.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		PatternItemProvider p = new PatternItemProvider(new PatternItemProviderAdapterFactory());
		Object image = p.getImage(PatternFactory.eINSTANCE.createPattern());
		if (image != null) {
			return image;
		}
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PatternAnalysis"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		PatternAnalysis pa = (PatternAnalysis)object;
		String superPostFix = "";
		if (pa.getSuperPattern() != null) {
			superPostFix = " -> " + pa.getSuperPattern().getContainer().getName() + "." + pa.getSuperPattern().getName();
		}
		return pa.getPattern().getContainer().getName() + "." + pa.getPattern().getName() + superPostFix;
//		return getString("_UI_PatternAnalysis_type");
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

		switch (notification.getFeatureID(PatternAnalysis.class)) {
			case PatternDependencyAnalysisPackage.PATTERN_ANALYSIS__METHODS:
			case PatternDependencyAnalysisPackage.PATTERN_ANALYSIS__PARAMETERS:
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
				(PatternDependencyAnalysisPackage.Literals.PATTERN_ANALYSIS__METHODS,
				 PatternDependencyAnalysisFactory.eINSTANCE.createPatternMethodAnalysis()));

		newChildDescriptors.add
			(createChildParameter
				(PatternDependencyAnalysisPackage.Literals.PATTERN_ANALYSIS__PARAMETERS,
				 PatternDependencyAnalysisFactory.eINSTANCE.createPatternParameterAnalysis()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return PatternDependencyAnalysisEditPlugin.INSTANCE;
	}

}
