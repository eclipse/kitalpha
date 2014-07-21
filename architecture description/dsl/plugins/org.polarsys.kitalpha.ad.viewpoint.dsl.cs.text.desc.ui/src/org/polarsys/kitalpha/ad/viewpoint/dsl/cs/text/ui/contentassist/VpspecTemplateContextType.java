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

import org.eclipse.jface.text.templates.TemplateContext;
import org.eclipse.jface.text.templates.TemplateVariable;
import org.eclipse.jface.text.templates.TemplateVariableResolver;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.callback.VpspecEditorCallback.AspectAddedListener;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.CommonTemplateContextType;



/**
 * 
 * @author Amine Lajmi
 *
 */
public class VpspecTemplateContextType extends CommonTemplateContextType implements AspectAddedListener{
	
	private static String currentFile;
	
	@Override
	protected void addDefaultTemplateVariables() {
		super.addDefaultTemplateVariables();
		addResolver(new VpspecTemplateVariableResolver.AspectName());
	}
	
	@Override
	public void resolve(TemplateVariable variable, TemplateContext context) {
		String type= variable.getType();
		TemplateVariableResolver resolver= getResolver(type);
		if (resolver == null)
			resolver= new VpspecTemplateVariableResolver();
		if (resolver instanceof VpspecTemplateVariableResolver.AspectName) {
			((VpspecTemplateVariableResolver.AspectName)resolver).setFileName(currentFile);
		} 
		super.resolve(variable, context);
	}

	@Override
	public void notifyResolver(String proposal) {
		currentFile = proposal;
	}
}
