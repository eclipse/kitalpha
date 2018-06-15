/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
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
import org.eclipse.jface.text.templates.TemplateContext;
import org.eclipse.jface.text.templates.TemplateContextType;
import org.eclipse.jface.text.templates.TemplateProposal;
import org.eclipse.jface.text.templates.persistence.TemplateStore;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ITemplateAcceptor;
import org.eclipse.xtext.ui.editor.templates.ContextTypeIdHelper;
import org.eclipse.xtext.ui.editor.templates.DefaultTemplateProposalProvider;
import org.eclipse.xtext.util.Strings;

import com.google.inject.Inject;

/**
 * 
 * @author Amine Lajmi
 *
 */
public class CommonTemplateProposalProvider extends	DefaultTemplateProposalProvider {
	
	protected static final String SEPARATOR = ".";
	protected static final String LINE_SEPARATOR = "\n";	
	protected static final String INDENTATION = "	";
	
	protected TemplateStore templateStore;
	
	@Inject
	public CommonTemplateProposalProvider(TemplateStore templateStore, ContextTypeRegistry registry, ContextTypeIdHelper helper) {
		super(templateStore, registry, helper);
		this.templateStore = templateStore;
	}
	
	@Override
	protected void createTemplates(TemplateContext templateContext, ContentAssistContext context, ITemplateAcceptor acceptor) {
		TemplateContextType contextType = templateContext.getContextType();
		Template[] templates = templateStore.getTemplates(contextType.getId());		
		for (Template template : templates) {
			if (!acceptor.canAcceptMoreTemplates()) {
				return;
			}
			if (validate(template, templateContext)) {	
				TemplateProposal proposal = createProposal(template, templateContext, context, getImage(template), getRelevance(template));
				acceptor.accept(proposal);
			}
		}
	}
	
	public String toLabel(String current) {
		StringBuffer label = new StringBuffer();
		for (int i=0; i<current.length(); i++) {
			if (Character.isUpperCase(current.charAt(i))) {
				label.append(" ").append(Character.toString(current.charAt(i)).toUpperCase());
			} else {
				label.append(current.charAt(i));
			}
		}
		return Strings.toFirstUpper(label.toString()).trim();
	}
}
