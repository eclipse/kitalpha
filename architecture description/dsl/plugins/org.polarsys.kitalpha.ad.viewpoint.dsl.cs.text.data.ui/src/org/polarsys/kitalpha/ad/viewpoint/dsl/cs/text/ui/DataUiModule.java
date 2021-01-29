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
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.CommonTemplateContextType;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.CommonTemplateProposalProvider;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.CommonTemplateStore;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.DataPrefixMatcher;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.documentation.CommonEObjectHover;


/**
 * 
 * @author Amine Lajmi
 *
 */
public class DataUiModule extends org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.AbstractDataUiModule {
	public DataUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	@Override
	public Class<? extends org.eclipse.xtext.ui.editor.contentassist.ITemplateProposalProvider> bindITemplateProposalProvider(){
		return CommonTemplateProposalProvider.class;
	}
	
	@Override
	public Class<? extends org.eclipse.jface.text.templates.persistence.TemplateStore> bindTemplateStore() {
		return CommonTemplateStore.class;
	}
	
	public Class<? extends  org.eclipse.xtext.ui.editor.templates.XtextTemplateContextType> bindIContextContentType() {
		return CommonTemplateContextType.class;
	}
	
	@Override
	public Class<? extends IEObjectHover> bindIEObjectHover() {
		return CommonEObjectHover.class;
	}
	
	@Override
	public Class<? extends org.eclipse.xtext.ui.editor.contentassist.PrefixMatcher> bindPrefixMatcher() {
		return DataPrefixMatcher.class;
	}
	
	@Override
	public Class<? extends org.eclipse.xtext.ui.editor.IXtextEditorCallback> bindIXtextEditorCallback() {
		return CommonEditorCallback.class;
	}
	
}
