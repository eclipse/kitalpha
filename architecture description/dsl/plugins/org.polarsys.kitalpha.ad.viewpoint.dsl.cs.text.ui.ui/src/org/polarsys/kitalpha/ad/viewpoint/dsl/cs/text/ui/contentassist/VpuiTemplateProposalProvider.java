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

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.text.templates.ContextTypeRegistry;
import org.eclipse.jface.text.templates.Template;
import org.eclipse.jface.text.templates.TemplateContext;
import org.eclipse.jface.text.templates.TemplateContextType;
import org.eclipse.jface.text.templates.TemplateProposal;
import org.eclipse.jface.text.templates.persistence.TemplateStore;
import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ITemplateAcceptor;
import org.eclipse.xtext.ui.editor.templates.ContextTypeIdHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractAssociation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Attribute;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Data;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Enumeration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ExternalAttributeType;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.LocalAttributeType;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.FileExtension;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.ResourceHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.output.TreeAppendable;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint;

import com.google.inject.Inject;

/**
 * 
 * @author Amine Lajmi
 *
 */
public class VpuiTemplateProposalProvider extends CommonTemplateProposalProvider {
			
	private ResourceSet resourceSet;
	
	@Inject
	private IValueConverterService valueConverter;
	
	@Inject
	public VpuiTemplateProposalProvider(TemplateStore templateStore, ContextTypeRegistry registry, ContextTypeIdHelper helper) {
		super(templateStore, registry, helper);
		this.templateStore = templateStore;
	}

	@Override
	protected void createTemplates(TemplateContext templateContext, ContentAssistContext context, ITemplateAcceptor acceptor) {
		TemplateContextType contextType = templateContext.getContextType();
		Template[] templates = templateStore.getTemplates(contextType.getId());		
		for (Template template: templates) {
			if (template.getDescription().equals("Generate User Interface for all classes")) {
				template = buildUIGenerationTemplate(template, context);
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
	
	
	@SuppressWarnings("deprecation")
	private Template buildUIGenerationTemplate(Template template, ContentAssistContext context) {
		EObject current = context.getCurrentModel();
		//get resource set
		resourceSet = current.eResource().getResourceSet();
		String projectName = current.eResource().getURI().segment(1);
		//get viewpoint information
		URI primary = ResourceHelper.getPrimaryResourceURI(projectName);
		Resource primaryResource = ResourceHelper.loadResource(primary, resourceSet);
		if (primaryResource ==null)
			throw new RuntimeException("could not locate primary resource with uri " + primary);
		Viewpoint viewpoint = (Viewpoint) primaryResource.getContents().get(0);
		//get data from data resource
		List<URI> dataResourceURIs = ResourceHelper.getSecondaryResourceURIsByExtension(FileExtension.DATA_EXTENSION, projectName);
		for (URI uri : dataResourceURIs) {
			List<EObject> dataRoots = ResourceHelper.loadDataResource(uri, resourceSet);
			if (!dataRoots.isEmpty()) {
				for (EObject root : dataRoots) {
					if (root instanceof Data) {
						Data data = (Data) root;
						TreeAppendable appendable = new TreeAppendable(current, INDENTATION, LINE_SEPARATOR);				
						EList<Class> vp_Classes = data.getVP_Classes();
						for(Class candidate : vp_Classes) {
							generateUIForCurrentClass(candidate, viewpoint, data.getName(), appendable);
						}
						//update template content
						template.setPattern(appendable.getContent());
						break;
					}
				}
			}
		}	
		return template;
	}


	private void generateUIForCurrentClass(Class containingClass, Viewpoint vp, String prefix,	TreeAppendable appendable) {
		//escape keywords conflicts
		String className = containingClass.getName(); 
		try {
			className = valueConverter.toString(className, "FQN");
		} catch (ValueConverterException e) {
			e.printStackTrace();
		}		
		appendable.append("UI ").append(vp.getShortName().replaceAll("\"", "")).append("_").append(containingClass.getName()).append(" {");
		appendable.increaseIndentation().newLine();
		appendable.append("label: \"").append(toLabel(vp.getShortName().replaceAll("\"", ""))).append("\"");
		appendable.newLine();
		appendable.append("Container ").append(vp.getShortName().replaceAll("\"", "")).append("_").append(containingClass.getName()).append("_Section").append(" {");
		appendable.increaseIndentation().newLine();
		// Attributes group
		if (!containingClass.getVP_Class_Attributes().isEmpty()) {
			appendable.append("Container ").append(vp.getShortName().replaceAll("\"", "")).append("_").append(containingClass.getName()).append("_").append("AttributeGroup").append(" {");
			appendable.increaseIndentation().newLine();
			appendable.append("label: \"").append(toLabel(containingClass.getName())).append(" Attributes").append("\"");			
			//Attributes
			for (org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Attribute attribute : containingClass.getVP_Class_Attributes()){
				EDataType type;
				
				if (attribute.getOwned_type() instanceof LocalAttributeType){
					Enumeration enumeration = ((LocalAttributeType)attribute.getOwned_type()).getType();
					generateRadioBoxUIEnumeration(enumeration, attribute, className, prefix, appendable);
					continue;
				}
				
				if (attribute.getOwned_type() instanceof ExternalAttributeType)
					type = ResourceHelper.resolveDataType(((ExternalAttributeType)attribute.getOwned_type()).getType(), resourceSet);
				else
					continue;
				
				//escape keywords conflicts
				String attributeName = attribute.getName(); 
				try {
					attributeName = valueConverter.toString(attributeName, "FQN");
				} catch (ValueConverterException e) {
					e.printStackTrace();
				}
				
				if (type.getName().equals("EBoolean")) {	
					//checkbox				
					appendable.newLine().append("Field ").append(attribute.getName()).
					append("Field").append(" label: \"").append(toLabel(attribute.getName())).append("\" type ").
					append("checkbox").append(" , mapped-to ").append(prefix).append(".").append(className).append(".").append(attributeName);
				}
				else if (type.getName().equals("EEnumerator") || type instanceof EEnum) {
					//radiobox			
					appendable.newLine().append("Field ").append(attribute.getName()).
					append("Field").append(" label: \"").append(toLabel(attribute.getName())).append("\" type ").
					append("radiobox").append(" , mapped-to ").append(prefix).append(".").append(className).append(".").append(attributeName);			
				}
				else {
					//text			
					appendable.newLine().append("Field ").append(attribute.getName()).
					append("Field").append(" label: \"").append(toLabel(attribute.getName())).append("\" type ").
					append("text").append(" , mapped-to ").append(prefix).append(".").append(className).append(".").append(attributeName);
				}
			}
			appendable.decreaseIndentation().newLine();
			appendable.append("}");	
		}
		
		if (!containingClass.getVP_Classes_Associations().isEmpty()) {
			if (!containingClass.getVP_Class_Attributes().isEmpty())
				appendable.newLine();
			//Associations group
			appendable.append("Container ").append(vp.getShortName().replaceAll("\"", "")).append("_").append(containingClass.getName()).append("_").append("AssociationGroup").append(" {");
			appendable.increaseIndentation().newLine();
			appendable.append("label: \"").append(toLabel(containingClass.getName())).append(" Associations").append("\"");
			
			//Associations
			EList<AbstractAssociation> vp_Classes_Associations = containingClass.getVP_Classes_Associations();
			for (AbstractAssociation abs : vp_Classes_Associations){
				String cardinality = abs.getCardinality().getName();
				if (cardinality.equals("One_Or_Many") || cardinality.equals("Nothing_Or_Many")){
					appendable.newLine().append("Field ").append(abs.getName()).append("Association").append(" label: \"").append(toLabel(abs.getName())).append("\" type ").
					append("multipleChoiceList").append(" , mapped-to ").append(prefix).append(".").append(className).append(".").append(abs.getName());
				} else {
					appendable.newLine().append("Field ").append(abs.getName()).append("Association").append(" label: \"").append(toLabel(abs.getName())).append("\" type ").
					append("simpleChoiceList").append(" , mapped-to ").append(prefix).append(".").append(className).append(".").append(abs.getName());
				}		
			}
			appendable.decreaseIndentation().newLine();
			appendable.append("}");
		}
		appendable.decreaseIndentation().newLine();
		appendable.append("}");	
		appendable.decreaseIndentation().newLine();
		appendable.append("}").newLine();		
	}
	
	
	
	private void generateRadioBoxUIEnumeration(Enumeration enumeration, Attribute attribute, String className, String prefix, TreeAppendable appendable){
		//escape keywords conflicts
		String attributeName = attribute.getName(); 
		try {
			attributeName = valueConverter.toString(attributeName, "FQN");
		} catch (ValueConverterException e) {
			e.printStackTrace();
		}
		appendable.newLine().append("Field ").append(enumeration.getName()).
		append("Field").append(" label: \"").append(toLabel(enumeration.getName())).append("\" type ").
		append("radiobox").append(" , mapped-to ").append(prefix).append(".").append(className).append(".").append(attributeName);
	}
}
