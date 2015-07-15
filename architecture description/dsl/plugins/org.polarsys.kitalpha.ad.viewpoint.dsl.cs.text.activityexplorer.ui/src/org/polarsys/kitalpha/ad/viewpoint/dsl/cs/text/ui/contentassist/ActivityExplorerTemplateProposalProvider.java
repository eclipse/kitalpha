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
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist;

import org.eclipse.jface.text.templates.ContextTypeRegistry;
import org.eclipse.jface.text.templates.Template;
import org.eclipse.jface.text.templates.persistence.TemplateStore;
import org.eclipse.xtext.ui.editor.templates.ContextTypeIdHelper;

import com.google.inject.Inject;

/**
 * 
 * @author Faycal Abka
 *
 */
public class ActivityExplorerTemplateProposalProvider extends CommonTemplateProposalProvider {
	
	private static final int PAGES_PRIORITY = 50;
	private static final int SECTIONS_PRIORITY = 40;
	private static final int ACTIVITIES_PRIORITY = 30;
	
	private static final String PAGES_TEMPLATE_ID = "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Activityexplorer.kw_Pages";
	private static final String SECTIONS_TEMPLATE_ID = "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Activityexplorer.kw_Sections";
	private static final String ACTVITIES_TEMPLATE_ID = "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Activityexplorer.kw_Activities";
	
	

	@Inject
	public ActivityExplorerTemplateProposalProvider(TemplateStore templateStore, ContextTypeRegistry registry, ContextTypeIdHelper helper) {
		super(templateStore, registry, helper);
		this.templateStore = templateStore;
	}
	
	
	
	@Override
	public int getRelevance(Template template) {
		String contextTypeId = template.getContextTypeId();
		
		if (contextTypeId.equals(PAGES_TEMPLATE_ID))
			return PAGES_PRIORITY;
		
		if (contextTypeId.equals(SECTIONS_TEMPLATE_ID))
			return SECTIONS_PRIORITY;
		
		if (contextTypeId.equals(ACTVITIES_TEMPLATE_ID))
			return ACTIVITIES_PRIORITY;
		
		return super.getRelevance(template);
		
	}

}
