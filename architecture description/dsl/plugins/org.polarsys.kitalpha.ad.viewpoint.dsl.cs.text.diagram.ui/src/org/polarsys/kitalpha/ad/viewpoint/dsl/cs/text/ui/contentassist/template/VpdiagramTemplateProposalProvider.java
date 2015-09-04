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


package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.template;

import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.text.templates.ContextTypeRegistry;
import org.eclipse.jface.text.templates.Template;
import org.eclipse.jface.text.templates.TemplateContext;
import org.eclipse.jface.text.templates.TemplateContextType;
import org.eclipse.jface.text.templates.TemplateProposal;
import org.eclipse.jface.text.templates.persistence.TemplateStore;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ITemplateAcceptor;
import org.eclipse.xtext.ui.editor.templates.ContextTypeIdHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Data;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.FileExtension;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.ResourceHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.CommonTemplateProposalProvider;

import com.google.inject.Inject;


/**
 * 
 * @author Faycal Abka
 *
 */
public class VpdiagramTemplateProposalProvider extends
		CommonTemplateProposalProvider {
	
	private ResourceSet resourceSet;
	
	private static TemplateInterceptor interceptor;
	

	@Inject
	public VpdiagramTemplateProposalProvider(TemplateStore templateStore,
			ContextTypeRegistry registry, ContextTypeIdHelper helper) {
		
		super(templateStore, registry, helper);
		this.templateStore = templateStore;
		interceptor = createTemplateInterceptor();
		
	}
	
	private TemplateInterceptor createTemplateInterceptor()
	{
		return new TemplateInterceptor();
	}
	
	
	@Override
	protected void createTemplates(TemplateContext templateContext, ContentAssistContext context, ITemplateAcceptor acceptor) {
		
		TemplateContextType contextType = templateContext.getContextType();
		Template[] templates = templateStore.getTemplates(contextType.getId());		
		
		for (Template template: templates) {
			if (template.getDescription().equals("Generate Diagrams for all classes")) {
				interceptor.setTemplate(template);
				fillInterceptorWithDataClasses(template, context);
			}
		}
		
		for (Template template : templates) {
			if (!acceptor.canAcceptMoreTemplates())
				return;
			if (validate(template, templateContext)) {	
				TemplateProposal proposal = createProposal(template, templateContext, context, getImage(template), getRelevance(template));
				acceptor.accept(proposal);
			}
		}
	}


	public static TemplateInterceptor getInterceptor() {
		return interceptor;
	}


	private void fillInterceptorWithDataClasses(Template template,
			ContentAssistContext context) {
		
		EObject current = context.getCurrentModel();
		
		interceptor.setModel(current);
		
		resourceSet = current.eResource().getResourceSet();
		String projectName = ResourceHelper.getProjectName(current);
		
		List<URI> dataResourceURIs = ResourceHelper.getSecondaryResourceURIsByExtension(FileExtension.DATA_EXTENSION, projectName);
		
		if (dataResourceURIs == null || dataResourceURIs.isEmpty()){
			throw new RuntimeException("could not locate data resource in the project: " + projectName);
		}
		
		interceptor.getClasses().clear();
		
		for (URI uri : dataResourceURIs) {
			List<EObject> dataRoots = ResourceHelper.loadDataResource(uri, resourceSet);

			for (EObject eObject : dataRoots) {
				if (eObject instanceof Data){
					EList<org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class> classes = ((Data)eObject).getVP_Classes();
					interceptor.addAll(classes);
				}
			}

		}
	}
}
