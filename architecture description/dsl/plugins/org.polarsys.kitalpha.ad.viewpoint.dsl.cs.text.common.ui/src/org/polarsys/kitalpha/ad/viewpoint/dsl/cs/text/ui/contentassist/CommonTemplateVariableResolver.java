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

import javax.swing.text.View;

import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.text.templates.SimpleTemplateVariableResolver;
import org.eclipse.jface.text.templates.TemplateContext;
import org.eclipse.jface.text.templates.TemplateVariable;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.eclipse.xtext.ui.editor.templates.AbstractTemplateVariableResolver;
import org.eclipse.xtext.ui.editor.templates.XtextTemplateContext;

/**
 * 
 * @author Amine Lajmi
 *
 */
public class CommonTemplateVariableResolver extends AbstractTemplateVariableResolver {	
	
	
	//file name
	public static final String FILE_NAME = "fileName";
	public static final String FILE_NAME_DESCRIPTION = "File name";
	
	//shortname
	public static final String SHORT_NAME = "shortName";
	public static final String SHORT_NAME_DESCRIPTION = "Viewpoint short name";
	
	//viewpoint name
	public static final String VIEWPOINT_NAME = "viewpointName";
	public static final String VIEWPOINT_NAME_DESCRIPTION = "Viewpoint Complete Name";
	
	
	public static class FileName extends SimpleTemplateVariableResolver {

		public FileName() {
			super(FILE_NAME, FILE_NAME_DESCRIPTION);
		}
		
		protected String resolve(TemplateContext context) {
			XtextTemplateContext castedContext = (XtextTemplateContext) context;
			XtextDocument document =(XtextDocument)  castedContext.getDocument();
			URI resourceURI = document.getResourceURI();
			String lastSegment = resourceURI.trimFileExtension().lastSegment();
			return (lastSegment!=null) ? lastSegment : FILE_NAME;
		}
	}
	
	public static class ShortName extends SimpleTemplateVariableResolver {

		public ShortName() {
			super(SHORT_NAME, SHORT_NAME_DESCRIPTION);
		}
		
		protected String resolve(TemplateContext context) {		
			XtextTemplateContext castedContext = (XtextTemplateContext) context;
			XtextDocument document =(XtextDocument)  castedContext.getDocument();
			URI uri = document.getResourceURI();
			String lastSegment = uri.trimFileExtension().lastSegment();
			String shortName = lastSegment.substring(0, lastSegment.indexOf("."));
			return (lastSegment!=null) ? shortName : SHORT_NAME;
		}
	}
	
	public static class ViewpointName extends SimpleTemplateVariableResolver {

		protected ViewpointName() {
			super(VIEWPOINT_NAME, VIEWPOINT_NAME_DESCRIPTION);
		}
		
		protected String resolve(TemplateContext context) {
			XtextTemplateContext castedContext = (XtextTemplateContext) context;
			XtextDocument document =(XtextDocument)  castedContext.getDocument();
			URI resourceURI = document.getResourceURI();
			String _projectName = resourceURI.segment(1);
			String projectName = _projectName.substring(0, _projectName.lastIndexOf(".")); //trim vpdsl
			
			return projectName != null? projectName: VIEWPOINT_NAME;
		}
		
	}
	
	@Override
	public List<String> resolveValues(TemplateVariable variable, XtextTemplateContext xtextTemplateContext) {
		return null;
	}
}
