package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.editor;

import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.internal.VpconfActivator;

public class ConfEditor extends VpdslEditor{

	@Override
	public String getDialogTitleWithAspectName() {
		return "Configuration aspect save error"; //$NON-NLS-1$
	}

	@Override
	public String getPluginId() {
		return VpconfActivator.getInstance().getBundle().getSymbolicName();
	}

}
