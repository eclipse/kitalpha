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
/**
 * Copyright (c) THALES, 2012. All rights reserved.
 */
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.text.templates.SimpleTemplateVariableResolver;
import org.eclipse.jface.text.templates.TemplateContext;
import org.eclipse.jface.text.templates.TemplateVariable;
import org.eclipse.xtext.ui.editor.templates.XtextTemplateContext;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.ResourceHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint;


/**
 * 
 * @author Amine Lajmi
 *
 */
public class VpservicesTemplateVariableResolver extends CommonTemplateVariableResolver {	
	
	public static final String VIEWPOINT_NAME = "viewpointName";
	public static final String VIEWPOINT_NAME_DESCRIPTION = "Viewpoint name";
	
	public static class ViewpointName extends SimpleTemplateVariableResolver {
		
		public ViewpointName() {
			super(VIEWPOINT_NAME, VIEWPOINT_NAME_DESCRIPTION);
		}
		
		protected String resolve(TemplateContext context) {
			XtextTemplateContext castedContext = (XtextTemplateContext) context;
			EObject current = castedContext.getContentAssistContext().getCurrentModel();
			if (current !=null) {
				ResourceSet resourceSet = current.eResource().getResourceSet();
				//get viewpoint information
				URI primary = ResourceHelper.getPrimaryResourceURI();
				Resource primaryResource = ResourceHelper.loadResource(primary, resourceSet);
				if (primaryResource ==null)
					throw new RuntimeException("could not locate primary resource with uri " + primary);
				Viewpoint viewpoint = (Viewpoint) primaryResource.getContents().get(0);
				return viewpoint.getName();
			}
			return VIEWPOINT_NAME;
		}
	}
	
	@Override
	public List<String> resolveValues(TemplateVariable variable, XtextTemplateContext xtextTemplateContext) {
		return null;
	}
}
