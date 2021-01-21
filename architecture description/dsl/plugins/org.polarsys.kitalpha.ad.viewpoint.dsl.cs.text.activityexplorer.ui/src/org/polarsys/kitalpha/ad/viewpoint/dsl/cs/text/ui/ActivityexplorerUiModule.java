/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.hover.IEObjectHover;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.callback.CommonEditorCallback;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.ActivityExplorerTemplateContextType;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.CommonTemplateStore;

/**
 * Use this class to register components to be used within the IDE.
 */
public class ActivityexplorerUiModule extends org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.AbstractActivityexplorerUiModule {
	public ActivityexplorerUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	@Override
	public Class<? extends IEObjectHover> bindIEObjectHover() {
		return org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.documentation.ActivityExplorerHover.class;
	}
	
	@Override
	public Class<? extends org.eclipse.xtext.ui.editor.contentassist.ITemplateProposalProvider> bindITemplateProposalProvider(){
		return org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.ActivityExplorerTemplateProposalProvider.class;
	}
	
	@Override
	public Class<? extends org.eclipse.jface.text.templates.persistence.TemplateStore> bindTemplateStore() {
		return CommonTemplateStore.class;
	}
	
	public Class<? extends  org.eclipse.xtext.ui.editor.templates.XtextTemplateContextType> bindIContextContentType() {
		return ActivityExplorerTemplateContextType.class;
	}
	
	@Override
	public Class<? extends org.eclipse.xtext.ui.editor.IXtextEditorCallback> bindIXtextEditorCallback() {
		return CommonEditorCallback.class;
	}
	
}
