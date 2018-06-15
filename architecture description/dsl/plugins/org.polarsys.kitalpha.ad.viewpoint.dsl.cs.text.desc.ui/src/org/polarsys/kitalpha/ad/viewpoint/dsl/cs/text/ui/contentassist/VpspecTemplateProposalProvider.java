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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.templates.ContextTypeRegistry;
import org.eclipse.jface.text.templates.Template;
import org.eclipse.jface.text.templates.TemplateContext;
import org.eclipse.jface.text.templates.TemplateContextType;
import org.eclipse.jface.text.templates.TemplateProposal;
import org.eclipse.jface.text.templates.persistence.TemplateStore;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ITemplateAcceptor;
import org.eclipse.xtext.ui.editor.templates.ContextTypeIdHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.activityexplorer.model.viewpointActivityExplorer.ViewpointActivityExplorer;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.Configuration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Aspect;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Data;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramSet;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.ServiceSet;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpui.UIDescription;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.identifiers.TemplateIDs;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.VpspecGrammarAccess;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.output.TreeAppendable;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint;

import com.google.inject.Inject;

/**
 * 
 * @author Amine Lajmi
 * 		   Faycal Abka
 *
 */
public class VpspecTemplateProposalProvider extends CommonTemplateProposalProvider {
	
	private static final String VARIABLE_NAME = "${aspectName}";
	
	private static final int DATA_PRIORITY = 90;
	private static final int UI_PRIORITY = 80;
	private static final int DIAGRAM_PRIORITY = 70;
	private static final int ACTIVITYEXPLORER_PRIORITY = 60;
	private static final int SERVICES_PRIORITY = 50;
	private static final int BUILD_PRIORITY = 40;
	private static final int CONFIGURATION_PRIORITY = 30;
	

	@Inject
	private IGrammarAccess grammar;
	
	@Inject
	public VpspecTemplateProposalProvider(TemplateStore templateStore, ContextTypeRegistry registry, ContextTypeIdHelper helper) {
		super(templateStore, registry, helper);
		this.templateStore = templateStore;
	}
	
	@Override
	protected void createTemplates(TemplateContext templateContext, ContentAssistContext context, ITemplateAcceptor acceptor) {	
		if (grammar instanceof VpspecGrammarAccess) {
			VpspecGrammarAccess access = (VpspecGrammarAccess) grammar;
			TemplateContextType contextType = templateContext.getContextType();
			Template[] templates = templateStore.getTemplates(contextType.getId());		
			for (Template template: templates) {
				if (isNewAspectTemplate(template.getContextTypeId())) {
					template = buildTemplate(template, context, template.getContextTypeId());
					break;
				}
			}		
			for (Template template : templates) {
				if (!acceptor.canAcceptMoreTemplates()) {
					return;
				}
				if (validate(template, templateContext)) {	
					TemplateProposal proposal = createProposal(template, templateContext, context, getImage(template), getRelevance(template));
					//get current semantic model
					EObject current = context.getCurrentModel();
					String contextTypeId = template.getContextTypeId();
					if (current !=null && current instanceof Viewpoint) {
						Data data = ((Viewpoint) current).getVP_Data();
						if (data!=null && contextTypeId.equals(TemplateIDs.NEW_DATA_TEMPLATE)) {
							return;
						}					
						EList<Aspect> vpAspects = ((Viewpoint) current).getVP_Aspects();
						for (Aspect candidate: vpAspects){				
							if (candidate instanceof ServiceSet && contextTypeId.equals(TemplateIDs.NEW_SERVICES_TEMPLATE)){
								return;
							}
							if (candidate instanceof Configuration && contextTypeId.equals(TemplateIDs.NEW_CONFIGURATION_TEMPLATE)) {
								return;
							}
							if (candidate instanceof UIDescription && contextTypeId.equals(TemplateIDs.NEW_UI_TEMPLATE)) {
								return;
							}
							if (candidate instanceof DiagramSet && contextTypeId.equals(TemplateIDs.NEW_DIAGRAM_TEMPLATE)) {
								return;
							}
							if (candidate instanceof ViewpointActivityExplorer && contextTypeId.equals(TemplateIDs.NEW_ACTIVITY_EXPLORER_TEMPLATE)){
								return;
							}
						}			
					}
					
					//Don't propose UI, Rules, Configuration, and Services before Data	
					
					//Don't propose Diagram before UI	
					if (contextTypeId.matches(TemplateIDs.TEMPLATE_PREFIX + SEPARATOR + "kw_" + access.getViewpointAccess().getTypeDiagramsKeyword_15_0_0().getValue())) {						
						INode currentNode = context.getCurrentNode();
						INode nextSibling = currentNode.getNextSibling();
						if (nextSibling != null) {
							String text = nextSibling.getText();
							if (text.equals(access.getViewpointAccess().getTypeUIKeyword_14_0_0().getValue())){
								return;
							}
						}					
					}
					acceptor.accept(proposal);
				}
			}
		}
	}

	private boolean isNewAspectTemplate(String templateIdentifier) {
		if (templateIdentifier.equals(TemplateIDs.NEW_BUILD_TEMPLATE)) {
			return true;
		}
		if (templateIdentifier.equals(TemplateIDs.NEW_CONFIGURATION_TEMPLATE)) {
			return true;
		}
		if (templateIdentifier.equals(TemplateIDs.NEW_DATA_TEMPLATE)) {
			return true;
		}
		if (templateIdentifier.equals(TemplateIDs.NEW_DIAGRAM_TEMPLATE)) {
			return true;
		}
		if (templateIdentifier.equals(TemplateIDs.NEW_SERVICES_TEMPLATE)) {
			return true;
		}
		if (templateIdentifier.equals(TemplateIDs.NEW_UI_TEMPLATE)) {
			return true;
		}
		if (templateIdentifier.equals(TemplateIDs.NEW_ACTIVITY_EXPLORER_TEMPLATE)) {
			return true;
		}
		return false;
	}

	@SuppressWarnings("deprecation")
	private Template buildTemplate(Template template, ContentAssistContext context, String templateId) {
		EObject current = context.getCurrentModel();
		if (current instanceof Viewpoint) {
			String shortName = ((Viewpoint) current).getShortName();	
			TreeAppendable appendable = new TreeAppendable(current, INDENTATION, LINE_SEPARATOR);
			appendable.append(getTemplatePattern(templateId, shortName));
			template.setPattern(appendable.getContent());
			return template;
		}
		return null;
	}
	
	protected String getTemplatePattern(String templateIdentifier, String shortName) {		
		VpspecGrammarAccess access = (VpspecGrammarAccess)grammar;		
		if (templateIdentifier.equals(TemplateIDs.NEW_DATA_TEMPLATE)) {
			return access.getViewpointAccess().getDataKeyword_13_0().getValue() + " "  + VARIABLE_NAME;
		}
		if (templateIdentifier.equals(TemplateIDs.NEW_DIAGRAM_TEMPLATE)) {
			return access.getViewpointAccess().getTypeDiagramsKeyword_15_0_0().getValue() + " "  + VARIABLE_NAME;
		}
		if (templateIdentifier.equals(TemplateIDs.NEW_UI_TEMPLATE)) {
			return access.getViewpointAccess().getTypeUIKeyword_14_0_0().getValue() + " "  + VARIABLE_NAME;
		}
		if (templateIdentifier.equals(TemplateIDs.NEW_SERVICES_TEMPLATE)) {
			return access.getViewpointAccess().getTypeServicesKeyword_17_0_0().getValue() + " " + VARIABLE_NAME;
		}
		if (templateIdentifier.equals(TemplateIDs.NEW_BUILD_TEMPLATE)) {
			return access.getViewpointAccess().getTypeBuildKeyword_18_0_0().getValue() + " " + VARIABLE_NAME;
		}
		if (templateIdentifier.equals(TemplateIDs.NEW_CONFIGURATION_TEMPLATE)) {
			return access.getViewpointAccess().getTypeConfigurationKeyword_19_0_0().getValue() + " " + VARIABLE_NAME;
		}
		if (templateIdentifier.equals(TemplateIDs.NEW_ACTIVITY_EXPLORER_TEMPLATE)) {
			return access.getViewpointAccess().getTypeActivityExplorerKeyword_16_0_0().getValue() + " " + VARIABLE_NAME;
		}
		return null;
	}
	
	@Override
	public int getRelevance(Template template) {
		String contextTypeId = template.getContextTypeId();
		if (contextTypeId.equals(TemplateIDs.NEW_BUILD_TEMPLATE)) {
			return BUILD_PRIORITY;
		}
		if (contextTypeId.equals(TemplateIDs.NEW_CONFIGURATION_TEMPLATE)) {
			return CONFIGURATION_PRIORITY;
		}
		if (contextTypeId.equals(TemplateIDs.NEW_DATA_TEMPLATE)) {
			return DATA_PRIORITY;
		}		
		if (contextTypeId.equals(TemplateIDs.NEW_DIAGRAM_TEMPLATE)) {
			return DIAGRAM_PRIORITY;
		}
		if (contextTypeId.equals(TemplateIDs.NEW_SERVICES_TEMPLATE)) {
			return SERVICES_PRIORITY;
		}
		if (contextTypeId.equals(TemplateIDs.NEW_UI_TEMPLATE)) {
			return UI_PRIORITY;
		}
		if (contextTypeId.equals(TemplateIDs.NEW_ACTIVITY_EXPLORER_TEMPLATE)) {
			return ACTIVITYEXPLORER_PRIORITY;
		}
		return super.getRelevance(template);
	}
}
