/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
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

import org.eclipse.xtext.ui.editor.templates.XtextTemplateContextType;

/**
 * 
 * @author Amine Lajmi
 *
 */
public class CommonTemplateContextType extends XtextTemplateContextType {
	
	@Override
	protected void addDefaultTemplateVariables() {
		super.addDefaultTemplateVariables();
		addResolver(new CommonTemplateVariableResolver.FileName());
		addResolver(new CommonTemplateVariableResolver.ShortName());
		addResolver(new CommonTemplateVariableResolver.ViewpointName());
	}
}
