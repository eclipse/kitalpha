package org.polarsys.kitalpha.common.sirius.extension.internal.rotativeimage;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.polarsys.kitalpha.common.sirius.extension.rotativeimage.RotativeDescription;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.polarsys.kitalpha.common.sirius.extension.rotativeimage";

	public static final String EXT_ID = "org.polarsys.kitalpha.common.sirius.extension.rotativeimage";
	
	// The shared instance
	private static Activator plugin;

	private List<RotativeDescription> descriptions;
	
	public List<RotativeDescription> getDescriptions() {
		return descriptions;
	}
	
	public RotativeDescription getBestDescription(String id) {
		if (id==null) return null;
		for (RotativeDescription desc : descriptions) {
			if (id.startsWith(desc.id)) return desc;
		}
		return null;
	}
	
	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		
		descriptions=new ArrayList<RotativeDescription>();
		
		IConfigurationElement[] config = Platform.getExtensionRegistry().getConfigurationElementsFor(EXT_ID);
		for (IConfigurationElement e : config) {
			String id = e.getAttribute("id");
			int kind = RotativeDescription.ROTATIVE;
			if (e.getAttribute("kind").equals("4images")) kind=RotativeDescription.FOUR_IMAGES;
			descriptions.add(new RotativeDescription(id, kind));
		}

	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

}
