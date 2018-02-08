/**
 * Copyright (c) THALES, 2009. All rights reserved.
 */
package org.polarsys.kitalpha.doc.gen.business.core.util;

import java.util.MissingResourceException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.swt.graphics.Image;

/**
 * Provide services to display EObject.
 * 
 * @author t0076333
 */
public class EObjectLabelProviderHelper {

	public static final String EMPTY_STRING = "";
	public static final char UNDERSCORE_CHARACTER = '_';
	/**
	 * Suffix used by EMF Edit when generating feature labels.
	 */
	private static final String FEATURE_GENERATED_KEY_SUFFIX = "_feature"; //$NON-NLS-1$
	/**
	 * Suffix used by EMF Edit when generating metaclasse labels.
	 */
	private static final String METACLASS_GENERATED_KEY_SUFFIX = "_type"; //$NON-NLS-1$
	/**
	 * Prefix used by EMF Edit when generating labels.
	 */
	private static final String GENERATED_KEY_PREFIX = "_UI_"; //$NON-NLS-1$
	/**
	 * Prefix used in label rendering if requested.
	 */
	private static final String METACLASS_DISPLAY_PREFIX = "["; //$NON-NLS-1$
	/**
	 * Suffix used in label rendering if requested.
	 */
	private static final String METACLASS_DISPLAY_SUFFIX = "] "; //$NON-NLS-1$

	/**
	 * Hidden constructor
	 */
	private EObjectLabelProviderHelper() {
	}
	
	/**
	 * Get the label for given object based on generated item provider.
	 * 
	 * @param object
	 * @return<code>null</code> if one of parameters is <code>null</code> or if
	 *                          no label is found.
	 */
	public static String getText(EObject object) {
		String label = EMPTY_STRING;
		// Precondition.
		if (null == object) {
			return label;
		}
		AdapterFactoryEditingDomain editingDomain = (AdapterFactoryEditingDomain) AdapterFactoryEditingDomain
				.getEditingDomainFor(object);
		// Precondition.
		if (null == editingDomain) {
			return label;
		}
		IItemLabelProvider provider = (IItemLabelProvider) editingDomain
				.getAdapterFactory().adapt(object, IItemLabelProvider.class);
		if (null != provider) {
			label = provider.getText(object);
		}
		return label;
	}

	/**
	 * Get the image for given object based on generated item provider.
	 * 
	 * @param object
	 * @return<code>null</code> if one of parameters is <code>null</code> or if
	 *                          no image is found.
	 */
	public static Image getImage(EObject object) {
		Object image = null;
		// Precondition.
		if (null == object) {
			return null;
		}
		AdapterFactoryEditingDomain editingDomain = (AdapterFactoryEditingDomain) AdapterFactoryEditingDomain
				.getEditingDomainFor(object);
		// Precondition.
		if (null == editingDomain) {
			return null;
		}
		IItemLabelProvider provider = (IItemLabelProvider) editingDomain
				.getAdapterFactory().adapt(object, IItemLabelProvider.class);
		if (null != provider) {
			image = provider.getImage(object);
		}
		return (null != image) ? getImageFromObject(image) : null;
	}

	/**
	 * Get Image from a object representation of it.
	 * 
	 * @param image
	 * @return <code>null</code> if image creation fails.
	 */
	public static Image getImageFromObject(Object image) {
		return ExtendedImageRegistry.getInstance().getImage(image);
	}

	/**
	 * Get the metaclass label (emitted by EMF Edit generation) for given
	 * object.
	 * 
	 * @param object
	 * @param addBrackets
	 *            if <code>true</code> the returned label is surrounded by
	 *            brackets.
	 * @return <code>null</code> if one of parameters is <code>null</code> or if
	 *         no label is found.
	 */
	public static String getMetaclassLabel(EObject object, boolean addBrackets) {
		String label = null;
		// Precondition.
		if (null == object) {
			return label;
		}
		AdapterFactoryEditingDomain editingDomain = (AdapterFactoryEditingDomain) AdapterFactoryEditingDomain
				.getEditingDomainFor(object);
		// Precondition.
		if (null == editingDomain) {
			return label;
		}
		// Adaptation to ItemProviderAdapter returns null due to EMF Edit
		// generated ItemProviderAdapterFactory that do not support this type.
		// So, we adapt to IItemLabelProvider and then we cast...
		IItemLabelProvider provider = (IItemLabelProvider) editingDomain
				.getAdapterFactory().adapt(object, IItemLabelProvider.class);
		if (provider instanceof ItemProviderAdapter) {
			label = getMetaclassLabel(object.eClass(),
					(ItemProviderAdapter) provider);
		}
		if (addBrackets) {
			label = METACLASS_DISPLAY_PREFIX + label + METACLASS_DISPLAY_SUFFIX;
		}
		return label;
	}

	/**
	 * Get the metaclass label (emitted by EMF Edit generation) for given object
	 * according given editing domain.
	 * 
	 * @param object_p
	 * @param provider
	 * @return <code>null</code> if one of parameters is <code>null</code> or if
	 *         no label is found.
	 */
	public static String getMetaclassLabel(EClass eClass, ItemProviderAdapter provider) {
		String label = null;
		// Preconditions.
		if ((null == eClass) || (null == provider)) {
			return label;
		}
		try {
			label = provider.getString(GENERATED_KEY_PREFIX
					+ eClass.getName() + METACLASS_GENERATED_KEY_SUFFIX);
		} catch (MissingResourceException e) {
			label = "<<MissingResourceException>> [" + eClass.getName() + "]"; //$NON-NLS-1$ //$NON-NLS-2$
		}
		return label;
	}

	/**
	 * Get the metaclass label (emitted by EMF Edit generation) for given object
	 * according given editing domain.
	 * 
	 * @param object_p
	 * @param provider
	 * @return <code>null</code> if one of parameters is <code>null</code> or if
	 *         no label is found.
	 */
	public static String getFeatureLabel(EStructuralFeature feature, ItemProviderAdapter provider) {
		String label = null;
		// Preconditions.
		if ((null == feature) || (null == provider)) {
			return label;
		}
		String featureKey = feature.getEContainingClass().getName()
				+ UNDERSCORE_CHARACTER + feature.getName();
		label = provider.getString(GENERATED_KEY_PREFIX + featureKey
				+ FEATURE_GENERATED_KEY_SUFFIX);
		return label;
	}
}
