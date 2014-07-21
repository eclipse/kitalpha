/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.callback.VpspecEditorCallback;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.VpspecContentProposalPriorities;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.VpspecTemplateContextType;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.VpspecTemplateProposalProvider;


/**
 * 
 * @author Amine Lajmi
 *
 */
public class VpspecUiModule extends org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.AbstractVpspecUiModule {
	
	public VpspecUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	@Override
	public Class<? extends org.eclipse.xtext.ui.editor.IXtextEditorCallback> bindIXtextEditorCallback() {
		return VpspecEditorCallback.class;
	}
	
	@Override
	public Class<? extends org.eclipse.xtext.ui.editor.contentassist.ITemplateProposalProvider> bindITemplateProposalProvider(){
		return VpspecTemplateProposalProvider.class;
	}
	
	public Class<? extends org.eclipse.xtext.ui.editor.contentassist.IContentProposalPriorities> bindIContentProposalPriorities(){
		return VpspecContentProposalPriorities.class;
	}
	
	public Class<? extends  org.eclipse.xtext.ui.editor.templates.XtextTemplateContextType> bindIContextContentType() {
		return VpspecTemplateContextType.class;
	}
}
