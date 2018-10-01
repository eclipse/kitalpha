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

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
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
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractSuperClass;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Attribute;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Data;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Enumeration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ExternalAttributeType;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.LocalAttributeType;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.LocalSuperClass;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.FileExtension;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.ResourceHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.output.TreeAppendable;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.internal.VpuiActivator;
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
	
	/*
	 * Used to avoid conflicts with names which are equals
	 */
	private int counter = 1;
	
	/*
	 * Contains already generated field names
	 */
	private final Set<String> namesTracker = new HashSet<>();
	
	
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
			if (!acceptor.canAcceptMoreTemplates()) {
				return;
			}
			if (validate(template, templateContext)) {	
				TemplateProposal proposal = createProposal(template, templateContext, context, getImage(template), getRelevance(template));
				acceptor.accept(proposal);
			}
		}
		//reset name tracker and counter
		namesTracker.clear();
		counter = 1;
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
		if (primaryResource ==null) {
			throw new RuntimeException("could not locate primary resource with uri " + primary);
		}
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
						EList<Class> vpClasses = data.getVP_Classes();
						for(Class candidate : vpClasses) {
							if (!candidate.isAbstract()) {
								generateUIForCurrentClass(candidate, viewpoint, data.getName(), appendable);
							}
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
		appendable.append("UI ").append(vp.getShortName().replaceAll("\"", "")).append("_").append(containingClass.getName()).append(" {");
		appendable.increaseIndentation().newLine();
		appendable.append("label: \"").append(toLabel(vp.getShortName().replaceAll("\"", ""))).append("\"");
		appendable.newLine();
		appendable.append("Container ").append(vp.getShortName().replaceAll("\"", "")).append("_").append(containingClass.getName()).append("_Section").append(" {");
		appendable.increaseIndentation().newLine();
		// Attributes group
		if (hasAttributes(containingClass)) {
			appendable.append("Container ").append(vp.getShortName().replaceAll("\"", "")).append("_").append(containingClass.getName()).append("_").append("AttributeGroup").append(" {");
			appendable.increaseIndentation().newLine();
			appendable.append("label: \"").append(toLabel(containingClass.getName())).append(" Attributes").append("\"");
			
			//Attributes
			List<Attribute> allAttributes = collectAllAttributes(containingClass);
			Collection<Attribute> processed = new HashSet<>();
			for (org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Attribute attribute : allAttributes){
				if (processed.contains(attribute)) {
					continue;
				}
				
				Class ownedClass = (Class)attribute.eContainer();
				String className = getFQN(ownedClass.getName());
				
				EDataType type;
				
				if (attribute.getOwned_type() instanceof LocalAttributeType){
					Enumeration enumeration = ((LocalAttributeType)attribute.getOwned_type()).getType();
					
					generateRadioBoxUIEnumeration(enumeration, attribute, className, prefix, appendable);
					processed.add(attribute);
					continue;
				}
				
				if (attribute.getOwned_type() instanceof ExternalAttributeType) {
					type = ResourceHelper.resolveDataType(((ExternalAttributeType)attribute.getOwned_type()).getType(), resourceSet);
				} else {
					processed.add(attribute);
					continue;
				}
				
				//escape keywords conflicts
				String attributeName = attribute.getName(); 
				attributeName = getFQN(attributeName);
				
				if (type.getName().equals("EBoolean")) {	
					//checkbox				
					appendable.newLine().append("Field ").append(attributeName).append("Field");
					appendCounterToField(appendable, attributeName);
					appendable.append(" label: \"").append(toLabel(attribute.getName())).append("\" type ").
					append("checkbox").append(" , mapped-to ").append(prefix).append(".").append(className).append(".").append(attributeName);
				}
				else if (type.getName().equals("EEnumerator") || type instanceof EEnum) {
					//radiobox			
					appendable.newLine().append("Field ").append(attributeName).append("Field");
					appendCounterToField(appendable, attributeName);
					appendable.append(" label: \"").append(toLabel(attribute.getName())).append("\" type ").
					append("radiobox").append(" , mapped-to ").append(prefix).append(".").append(className).append(".").append(attributeName);			
				}
				else {
					//text			
					appendable.newLine().append("Field ").append(attributeName).append("Field");
					appendCounterToField(appendable, attributeName);
					appendable.append(" label: \"").append(toLabel(attribute.getName())).append("\" type ").
					append("text").append(" , mapped-to ").append(prefix).append(".").append(className).append(".").append(attributeName);
				}
				processed.add(attribute);
				namesTracker.add(attributeName);
			}
			appendable.decreaseIndentation().newLine();
			appendable.append("}");
			processed.clear();
		}
		
		if (hasAssociations(containingClass)) {
			if (hasAttributes(containingClass)) {
				appendable.newLine();
			}
			//Associations group
			appendable.append("Container ").append(vp.getShortName().replaceAll("\"", "")).append("_").append(containingClass.getName()).append("_").append("AssociationGroup").append(" {");
			appendable.increaseIndentation().newLine();
			appendable.append("label: \"").append(toLabel(containingClass.getName())).append(" Associations").append("\"");
			
			//Associations
			List<AbstractAssociation> allAssociations = collectAllAssociations(containingClass);
			Collection<AbstractAssociation> processed = new HashSet<>();
			for (AbstractAssociation abs : allAssociations){
				if (processed.contains(abs)) {
					continue;
				}
				
				Class ownedClass = (Class)abs.eContainer();
				String className = getFQN(ownedClass.getName());
				String absName = abs.getName();
				
				String cardinality = abs.getCardinality().getName();
				if (cardinality.equals("One_Or_Many") || cardinality.equals("Nothing_Or_Many")){
					appendable.newLine().append("Field ").append(absName).append("Association");
					appendCounterToField(appendable, absName);
					appendable.append(" label: \"").append(toLabel(absName)).append("\" type ").
					append("multipleChoiceList").append(" , mapped-to ").append(prefix).append(".").append(className).append(".").append(absName);
				} else {
					appendable.newLine().append("Field ").append(absName).append("Association");
					appendCounterToField(appendable, absName);
					appendable.append(" label: \"").append(toLabel(absName)).append("\" type ").
					append("simpleChoiceList").append(" , mapped-to ").append(prefix).append(".").append(className).append(".").append(absName);
				}
				processed.add(abs);
				namesTracker.add(absName);
			}
			appendable.decreaseIndentation().newLine();
			appendable.append("}");
			processed.clear();
		}
		appendable.decreaseIndentation().newLine();
		appendable.append("}");	
		appendable.decreaseIndentation().newLine();
		appendable.append("}").newLine();		
	}

	private String getFQN(String className) {
		try {
			className = valueConverter.toString(className, "FQN");
		} catch (ValueConverterException e) {
			Status status = new Status(IStatus.ERROR, VpuiActivator.ORG_POLARSYS_KITALPHA_AD_VIEWPOINT_DSL_CS_TEXT_VPUI, e.getMessage(), e);
			VpuiActivator.getInstance().getLog().log(status);
		}
		return className;
	}
	
	
	
	private void generateRadioBoxUIEnumeration(Enumeration enumeration, Attribute attribute, String className, String prefix, TreeAppendable appendable){
		//escape keywords conflicts
		String attributeName = attribute.getName(); 
		attributeName = getFQN(attributeName);
		
		appendable.newLine().append("Field ").append(attributeName).append("Field");
		appendCounterToField(appendable, attributeName);
		appendable.append(" label: \"").append(toLabel(enumeration.getName())).append("\" type ").
		append("radiobox").append(" , mapped-to ").append(prefix).append(".").append(className).append(".").append(attributeName);
		
		namesTracker.add(attributeName);
	}
	
	/**
	 * 
	 * @param clazz
	 * @return true if clazz or one of its superClass defines at least one attribute
	 */
	private boolean hasAttributes(Class clazz) {
		for (AbstractSuperClass superClass: clazz.getInheritences()) {
			if (superClass instanceof LocalSuperClass) {
				return hasAttributes(((LocalSuperClass)superClass).getSuperClass());
			}
		}
		return !clazz.getVP_Class_Attributes().isEmpty();
	}
	
	/**
	 * 
	 * @param clazz
	 * @return true if clazz or one of its superClass defines at least one association
	 */
	private boolean hasAssociations(Class clazz) {
		for (AbstractSuperClass superClass: clazz.getInheritences()) {
			if (superClass instanceof LocalSuperClass) {
				return hasAssociations(((LocalSuperClass)superClass).getSuperClass());
			}
		}
		return !clazz.getVP_Classes_Associations().isEmpty();
	}
	
	/**
	 * 
	 * @param clazz
	 * @return list of attributes defined in super classes of clazz append to clazz attribute
	 */
	private List<Attribute> collectAllAttributes(Class clazz) {
		List<Attribute> result = new ArrayList<>();
		
		for (AbstractSuperClass superClass: clazz.getInheritences()) {
			if (superClass instanceof LocalSuperClass) {
				Class superClazz = ((LocalSuperClass)superClass).getSuperClass();
				result.addAll(superClazz.getVP_Class_Attributes());
				result.addAll(collectAllAttributes(superClazz));
			}
		}
		result.addAll(clazz.getVP_Class_Attributes());
		return result;
	}
	
	/**
	 * 
	 * @param clazz
	 * @return list of association defined in super classes of clazz append to clazz attribute
	 */
	private List<AbstractAssociation> collectAllAssociations(Class clazz) {
		List<AbstractAssociation> result = new ArrayList<>();
		
		for (AbstractSuperClass superClass: clazz.getInheritences()) {
			if (superClass instanceof LocalSuperClass) {
				Class superClazz = ((LocalSuperClass)superClass).getSuperClass();
				result.addAll(superClazz.getVP_Classes_Associations());
				result.addAll(collectAllAssociations(superClazz));
			}
		}
		result.addAll(clazz.getVP_Classes_Associations());
		return result;
	}
	
	/**
	 * Append counter to fields which name is conflicts each other.
	 * if the counter is appended, counter is incremented
	 * @param appendable
	 * @param name
	 * @return
	 */
	private TreeAppendable appendCounterToField(TreeAppendable appendable, String name) {
		if (namesTracker.contains(name)) {
			appendable.append(String.valueOf(counter));
			counter++;
		}
		return appendable;
	}
}
