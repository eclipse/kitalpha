package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.editor;

import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.internal.VpspecActivator;

public class SpecEditor extends VpdslEditor {

	@Override
	public String getDialogTitleWithAspectName() {
		return "Specification aspect save error"; //$NON-NLS-1$
	}

	@Override
	public String getPluginId() {
		return VpspecActivator.getInstance().getBundle().getSymbolicName();
	}

}
