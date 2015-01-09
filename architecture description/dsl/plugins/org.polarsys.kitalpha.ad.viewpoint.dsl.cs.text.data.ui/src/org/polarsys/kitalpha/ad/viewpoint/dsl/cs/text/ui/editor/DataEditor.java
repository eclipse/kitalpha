package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.editor;

import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.internal.DataActivator;

public class DataEditor extends VpdslEditor {

	@Override
	public String getDialogTitleWithAspectName() {
		return "Data aspect save error"; //$NON-NLS-1$
	}

	@Override
	public String getPluginId() {
		return DataActivator.getInstance().getBundle().getSymbolicName();
	}

}
