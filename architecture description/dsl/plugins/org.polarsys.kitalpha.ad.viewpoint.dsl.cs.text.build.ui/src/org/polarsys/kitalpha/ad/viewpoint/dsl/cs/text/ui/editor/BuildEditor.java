package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.editor;

import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.editor.VpdslEditor;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.internal.VpbuildActivator;

public class BuildEditor extends VpdslEditor {

	@Override
	public String getDialogTitleWithAspectName() {
		return "Build aspect save error"; //$NON-NLS-1$
	}

	@Override
	public String getPluginId() {
		return VpbuildActivator.getInstance().getBundle().getSymbolicName();
	}

}
