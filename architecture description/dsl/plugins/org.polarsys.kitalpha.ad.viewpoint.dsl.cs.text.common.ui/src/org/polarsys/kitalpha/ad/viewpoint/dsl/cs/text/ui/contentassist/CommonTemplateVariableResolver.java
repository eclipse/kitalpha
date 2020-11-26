/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
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

import java.util.List;

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
 * 		   Faycal ABKA
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

		@Override
		protected String resolve(TemplateContext context) {
			XtextTemplateContext castedContext = (XtextTemplateContext) context;
			XtextDocument document =(XtextDocument)  castedContext.getDocument();
			URI resourceURI = document.getResourceURI();
			if (resourceURI != null){
				return resourceURI.trimFileExtension().lastSegment();
			}
			return FILE_NAME;
		}
	}
	
	public static class ShortName extends SimpleTemplateVariableResolver {

		public ShortName() {
			super(SHORT_NAME, SHORT_NAME_DESCRIPTION);
		}
		
		@Override
		protected String resolve(TemplateContext context) {		
			XtextTemplateContext castedContext = (XtextTemplateContext) context;
			XtextDocument document =(XtextDocument)  castedContext.getDocument();
			URI uri = document.getResourceURI();
			if (uri != null){
				String lastSegment = uri.trimFileExtension().lastSegment();
				return lastSegment != null? lastSegment.substring(0, lastSegment.indexOf('.')): null;
			}
			return SHORT_NAME;
		}
	}

	public static class ViewpointName extends SimpleTemplateVariableResolver {

		protected ViewpointName() {
			super(VIEWPOINT_NAME, VIEWPOINT_NAME_DESCRIPTION);
		}
		
		@Override
		protected String resolve(TemplateContext context) {
			XtextTemplateContext castedContext = (XtextTemplateContext) context;
			XtextDocument document =(XtextDocument)  castedContext.getDocument();
			URI resourceURI = document.getResourceURI();
			String fullyProjectName = resourceURI.segment(1);

			if (fullyProjectName != null && !fullyProjectName.isEmpty()){
				return fullyProjectName.substring(0, fullyProjectName.lastIndexOf('.')); //trim vpdsl
			}
			return VIEWPOINT_NAME;
		}
	}
	
	@Override
	public List<String> resolveValues(TemplateVariable variable, XtextTemplateContext xtextTemplateContext) {
		return null;
	}
}
