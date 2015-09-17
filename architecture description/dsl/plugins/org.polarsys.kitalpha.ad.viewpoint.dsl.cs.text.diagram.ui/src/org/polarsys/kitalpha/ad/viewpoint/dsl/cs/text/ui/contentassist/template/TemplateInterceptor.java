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

import java.util.Collection;
import java.util.HashSet;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.templates.Template;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.wizards.impl.diagram.template.observer.IObserver;

import com.google.inject.Inject;

/**
 * This class is about recomputing the content of template intercepted template.
 * 
 * @author Faycal Abka
 *
 */
public class TemplateInterceptor implements IObserver {
	
	protected static final String SEPARATOR = ".";
	protected static final String LINE_SEPARATOR = "\n";	
	protected static final String INDENTATION = "	";
	
	
	private Template template;
	private EObject model; //diagram
	private Collection<Class> classes = new HashSet<Class>();
	
	@Inject
	private IQualifiedNameProvider qualifiedNameProvider;
	

	
	public TemplateInterceptor(){
	}
	
	
	
	public Template getTemplate() {
		return template;
	}

	public void setTemplate(Template template) {
		this.template = template;
	}
	
	
	
	public EObject getModel() {
		return model;
	}



	public void setModel(EObject model) {
		this.model = model;
	}



	public void addAll(Collection<Class> newClasses){
		classes.addAll(newClasses);
	}

	public Collection<Class> getClasses()
	{
		return classes;
	}


	@SuppressWarnings("deprecation")
	@Override
	public void update(Class vpClass, boolean isDiagramExtension)
	{
		Template template = getTemplate();
		
		if (template != null){

			IGenerationStrategy newDiagGen;
			
			if (qualifiedNameProvider == null)
			{
				qualifiedNameProvider = new DefaultDeclarativeQualifiedNameProvider();
			}
			
			if (isDiagramExtension)
			{
				newDiagGen = new ExtendedDiagramGeneration(model, qualifiedNameProvider);
			}
			else
			{
				newDiagGen = new NewDiagramGeneraton(model, qualifiedNameProvider);
			}

			template.setPattern(newDiagGen.generateDiagram(vpClass).getContent());
		}
	}

}
