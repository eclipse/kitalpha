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


/**
 * 
 * @author Faycal Abka
 *
 */
public class ActivityExplorerTemplateContextType extends CommonTemplateContextType {
	
	@Override
	protected void addDefaultTemplateVariables() {
		super.addDefaultTemplateVariables();
		addResolver(new ActivityExplorerTemplateVariableResolver.PageName());
		addResolver(new ActivityExplorerTemplateVariableResolver.PageIndex());
		addResolver(new ActivityExplorerTemplateVariableResolver.SectionName());
		addResolver(new ActivityExplorerTemplateVariableResolver.SectionIndex());
		addResolver(new ActivityExplorerTemplateVariableResolver.ActivityName());
		addResolver(new ActivityExplorerTemplateVariableResolver.ActivityIndex());
	}

}
