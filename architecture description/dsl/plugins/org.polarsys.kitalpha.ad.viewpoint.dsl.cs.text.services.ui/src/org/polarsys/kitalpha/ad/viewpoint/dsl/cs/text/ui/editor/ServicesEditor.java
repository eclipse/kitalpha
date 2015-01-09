package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.editor;

import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.internal.VpservicesActivator;

public class ServicesEditor extends VpdslEditor {

	@Override
	public String getDialogTitleWithAspectName() {
		return "Services aspect save error"; //$NON-NLS-1$
	}

	@Override
	public String getPluginId() {
		return VpservicesActivator.getInstance().getBundle().getSymbolicName();
	}

}
