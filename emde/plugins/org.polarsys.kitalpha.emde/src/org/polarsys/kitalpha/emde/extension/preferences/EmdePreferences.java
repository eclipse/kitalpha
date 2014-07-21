/**
 * 
 */
package org.polarsys.kitalpha.emde.extension.preferences;

import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.osgi.service.prefs.Preferences;

/**
 * @author Thomas Guiu
 * 
 */
public class EmdePreferences {

	private static String PREFERENCE_STORE = "org.polarsys.kitalpha.emde";

	public static final String FORCE_GENERATION_KEY = "force.generation";

	public static Preferences getInstancePreferences() {

		return Platform.getPreferencesService().getRootNode().node(InstanceScope.SCOPE).node(PREFERENCE_STORE);
	}

}
