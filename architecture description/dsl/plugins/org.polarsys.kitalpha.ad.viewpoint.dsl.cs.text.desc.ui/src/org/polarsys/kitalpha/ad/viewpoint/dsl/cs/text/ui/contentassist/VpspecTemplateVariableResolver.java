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

import org.eclipse.jface.text.templates.SimpleTemplateVariableResolver;
import org.eclipse.jface.text.templates.TemplateContext;
import org.eclipse.jface.text.templates.TemplateVariable;
import org.eclipse.xtext.ui.editor.templates.XtextTemplateContext;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.FileExtension;


/**
 * 
 * @author Amine Lajmi
 *
 */
public class VpspecTemplateVariableResolver extends CommonTemplateVariableResolver {	
	
	public static final String ASPECT_NAME = "aspectName";
	
	public static final String ASPECT_NAME_DESCRIPTION = "Aspect name";
	
	@Override
	protected String resolve(TemplateContext context) {
		return super.resolve(context);
	}
	
	public static class AspectName extends SimpleTemplateVariableResolver {

		private String fileName;
		
		public AspectName() {
			super(ASPECT_NAME, ASPECT_NAME_DESCRIPTION);
		}
		
		public void setFileName(String fileName) {
			this.fileName = fileName;
		}
		
		@Override
		protected String resolve(TemplateContext context) {
			return (fileName!=null) ? fileName.replaceFirst("." + FileExtension.PRIMARY_EXTENSION, "") : "";
		}
	}
	
	@Override
	public List<String> resolveValues(TemplateVariable variable, XtextTemplateContext xtextTemplateContext) {
		return null;
	}
}
