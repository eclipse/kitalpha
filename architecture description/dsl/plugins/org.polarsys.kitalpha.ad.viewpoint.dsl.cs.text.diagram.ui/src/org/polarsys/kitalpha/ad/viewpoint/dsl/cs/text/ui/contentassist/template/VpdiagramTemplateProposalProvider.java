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
public class VpdiagramTemplateProposalProvider extends CommonTemplateProposalProvider {

	private static final TemplateInterceptor interceptor = new TemplateInterceptor();;


	@Inject
	public VpdiagramTemplateProposalProvider(final TemplateStore templateStore,
			final ContextTypeRegistry registry, final ContextTypeIdHelper helper) {
		super(templateStore, registry, helper);
		this.templateStore = templateStore;
	}


	@Override
	protected void createTemplates(final TemplateContext templateContext, final ContentAssistContext context, final ITemplateAcceptor acceptor) {

		final TemplateContextType contextType = templateContext.getContextType();
		final Template[] templates = templateStore.getTemplates(contextType.getId());

		for (final Template template: templates) {
			if (template.getDescription().equals("Generate Diagrams for all classes")) {
				interceptor.setTemplate(template);
				fillInterceptorWithDataClasses(context);
			}
		}

		for (final Template template : templates) {
			if (!acceptor.canAcceptMoreTemplates()) {
				return;
			}
			if (validate(template, templateContext)) {
				final TemplateProposal proposal = createProposal(template, templateContext, context, getImage(template), getRelevance(template));
				acceptor.accept(proposal);
			}
		}
	}

	public static synchronized TemplateInterceptor getInterceptor() {
		return interceptor;
	}


	private void fillInterceptorWithDataClasses(final ContentAssistContext context) {
		final ResourceSet resourceSet;
		final EObject current = context.getCurrentModel();

		interceptor.setModel(current);

		resourceSet = current.eResource().getResourceSet();
		final String projectName = ResourceHelper.getProjectName(current);

		final List<URI> dataResourceURIs = ResourceHelper.getSecondaryResourceURIsByExtension(FileExtension.DATA_EXTENSION, projectName);

		if ((dataResourceURIs == null) || dataResourceURIs.isEmpty()){
			throw new RuntimeException("could not locate data resource in the project: " + projectName);
		}

		interceptor.getClasses().clear();

		for (final URI uri : dataResourceURIs) {
			final List<EObject> dataRoots = ResourceHelper.loadDataResource(uri, resourceSet);

			for (final EObject eObject : dataRoots) {
				if (eObject instanceof Data){
					final EList<org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class> classes = ((Data)eObject).getVP_Classes();
					interceptor.addAll(classes);
				}
			}

		}
	}
}
