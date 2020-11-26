/*******************************************************************************
 * Copyright (c) 2014, 2016 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
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
	private static final int PAGE_EXTENSIONS_PRIORITY = 40;
	private static final int PAGE_PRIORITY = 30;
	private static final int SECTION_EXTENSIONS_PRIORITY = 20;
	private static final int SECTION_PRIORITY = 10;

	private static final String PAGES_TEMPLATE_ID = "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Activityexplorer.kw_pages";
	private static final String PAGE_EXTENSIONS_TEMPLATE_ID = "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Activityexplorer.PageExtension";
	private static final String PAGE_TEMPLATE_ID = "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Activityexplorer.kw_page";
	private static final String SECTION_EXTENSIONS_TEMPLATE_ID = "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Activityexplorer.SectionExtension";
	private static final String SECTION_TEMPLATE_ID = "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.Activityexplorer.kw_section";



	@Inject
	public ActivityExplorerTemplateProposalProvider(final TemplateStore templateStore, final ContextTypeRegistry registry, final ContextTypeIdHelper helper) {
		super(templateStore, registry, helper);
		this.templateStore = templateStore;
	}



	@Override
	public int getRelevance(final Template template) {
		final String contextTypeId = template.getContextTypeId();

		if (contextTypeId.equals(PAGES_TEMPLATE_ID)) {
			return PAGES_PRIORITY;
		}

		if (contextTypeId.equals(PAGE_EXTENSIONS_TEMPLATE_ID)) {
			return PAGE_EXTENSIONS_PRIORITY;
		}

		if (contextTypeId.equals(PAGE_TEMPLATE_ID)) {
			return PAGE_PRIORITY;
		}

		if (contextTypeId.equals(SECTION_EXTENSIONS_TEMPLATE_ID)) {
			return SECTION_EXTENSIONS_PRIORITY;
		}

		if (contextTypeId.equals(SECTION_TEMPLATE_ID)) {
			return SECTION_PRIORITY;
		}

		return super.getRelevance(template);

	}
}
