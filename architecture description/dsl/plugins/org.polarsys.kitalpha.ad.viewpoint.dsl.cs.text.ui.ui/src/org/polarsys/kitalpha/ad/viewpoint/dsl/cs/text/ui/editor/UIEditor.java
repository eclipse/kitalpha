package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.editor;

import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.internal.VpuiActivator;

public class UIEditor extends VpdslEditor {

	@Override
	public String getDialogTitleWithAspectName() {
		return "UI aspect save error"; //$NON-NLS-1$
	}

	@Override
	public String getPluginId() {
		return VpuiActivator.getInstance().getBundle().getSymbolicName();
	}

}
