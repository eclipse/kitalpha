package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.editor;

import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.editor.VpdslEditor;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.internal.VpdiagramActivator;

public class DiagramEditor extends VpdslEditor{

	@Override
	public String getDialogTitleWithAspectName() {
		return "Diagram aspect save error"; //$NON-NLS-1$
	}

	@Override
	public String getPluginId() {
		return VpdiagramActivator.getInstance().getBundle().getSymbolicName();
	}

}
