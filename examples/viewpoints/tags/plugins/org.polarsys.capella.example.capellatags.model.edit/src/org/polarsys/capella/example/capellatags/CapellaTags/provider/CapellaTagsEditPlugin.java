
package org.polarsys.capella.example.capellatags.CapellaTags.provider;

import java.util.MissingResourceException;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.provider.EcoreEditPlugin;

import org.polarsys.kitalpha.emde.model.edit.provider.EmdeEditPlugin;

import org.polarsys.kitalpha.example.tags.tags.provider.TagsEditPlugin;

/**
 * This is the central singleton for the CapellaTags edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class CapellaTagsEditPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CapellaTagsEditPlugin INSTANCE = new CapellaTagsEditPlugin();

	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Implementation plugin;

	/**
	 * Create the instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapellaTagsEditPlugin() {
		super(new ResourceLocator[] { EcoreEditPlugin.INSTANCE, EmdeEditPlugin.INSTANCE, TagsEditPlugin.INSTANCE, });
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	public static Implementation getPlugin() {
		return plugin;
	}

	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class Implementation extends EclipsePlugin {
		/**
		 * Creates an instance.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Implementation() {
			super();

			// Remember the static instance.
			//
			plugin = this;
		}
	}

	/**
	 * @generated
	 */
	@Override
	public Object getImage(String key) {
		Object image = super.getImage(key);
		if (image == null)
			return delegatedGetImage(key);
		return image;
	}

	/**
	 * @generated
	 */
	@Override
	protected Object delegatedGetImage(String key) throws MissingResourceException {
		for (int i = 0; i < delegateResourceLocators.length; ++i) {
			try {
				Object image = delegateResourceLocators[i].getImage(key);
				if (image != null)
					return image;
			} catch (MissingResourceException exception) {
			}
		}
		return null;
	}

}
