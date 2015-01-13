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
import org.eclipse.xtext.ui.editor.hover.IEObjectHover;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.callback.CommonEditorCallback;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.CommonTemplateContextType;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.CommonTemplateProposalProvider;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.CommonTemplateStore;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.VpConfProposalPriorities;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.documentation.CommonEObjectHover;


/**
 * Use this class to register components to be used within the IDE.
 */
public class VpconfUiModule extends org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.AbstractVpconfUiModule {
	public VpconfUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	@Override
	public Class<? extends IEObjectHover> bindIEObjectHover() {
		return CommonEObjectHover.class;
	}
	
	@Override
	public Class<? extends org.eclipse.xtext.ui.editor.contentassist.ITemplateProposalProvider> bindITemplateProposalProvider(){
		return CommonTemplateProposalProvider.class;
	}
	
	public Class<? extends org.eclipse.jface.text.templates.persistence.TemplateStore> bindTemplateStore() {
		return CommonTemplateStore.class;
	}
	
	public Class<? extends  org.eclipse.xtext.ui.editor.templates.XtextTemplateContextType> bindIContextContentType() {
		return CommonTemplateContextType.class;
	}
	
	@Override
	public Class<? extends org.eclipse.xtext.ui.editor.IXtextEditorCallback> bindIXtextEditorCallback() {
		return CommonEditorCallback.class;
	}
	
	public Class<? extends org.eclipse.xtext.ui.editor.contentassist.IContentProposalPriorities> bindIContentProposalPriorities(){
		return VpConfProposalPriorities.class;
	}
	
//	public Class<? extends org.eclipse.xtext.ui.editor.XtextEditor> bindXtextEditor(){
//		return ConfEditor.class;
//	}
}
