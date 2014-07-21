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
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.CommonPrefixMatcher;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.CommonTemplateContextType;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.CommonTemplateProposalProvider;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.CommonTemplateStore;


/**
 * 
 * @author Amine Lajmi
 *
 */
public class CommonUiModule extends org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.AbstractCommonUiModule {
	
	public CommonUiModule(AbstractUIPlugin plugin) {
		super(plugin);
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
	
	public Class<? extends org.eclipse.xtext.ui.editor.contentassist.PrefixMatcher> bindPrefixMatcher() {
		return CommonPrefixMatcher.class;
	}
}
