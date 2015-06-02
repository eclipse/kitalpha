/*******************************************************************************
 * Copyright (c) 2015 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.doc.gen.business.core.scope;

import org.eclipse.egf.model.pattern.PatternContext;
import org.eclipse.egf.model.pattern.PatternException;
import org.eclipse.egf.pattern.strategy.domaindriven.SubClassEmfModelVisitor;
import org.eclipse.emf.ecore.EObject;

/**
 * @author Boubekeur Zendagui
 */
public class SubClassEmfModelVisitorWithScoping extends SubClassEmfModelVisitor {
	
	private static GenerationGlobalScope generationScope = GenerationGlobalScope.getInstance();
	
	@Override
	protected void doProcess(PatternContext context, Object model) throws PatternException {
		/** In this case, the generation is scoped and all model elements out of scope are 
		 *  always available in the resource. So we have to keep in mind to ignore patterns 
		 *  associated with them. */
		if (generationScope.inScope((EObject) model, true))
			super.doProcess(context, model);
		else
			markVisited(model);
	}
}
