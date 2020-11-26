/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram;

import org.eclipse.egf.model.pattern.PatternContext;
import org.eclipse.egf.model.pattern.PatternException;
import org.eclipse.egf.pattern.strategy.domaindriven.DefaultDomainVisitor;

/**
 * 
 * An EMF model visitor allowing to process all direct children of a model element before 
 * processing there children. 
 * 
 * @author Boubekeur Zendagui
 * 
 */

public class SubElementDomainVisitor extends DefaultDomainVisitor{

	@Override
	public void visit(PatternContext context, Object model) throws PatternException {
		for (Object obj : getChildren(model)) 
			if (!hasBeenVisited(obj))
				doProcess(context, obj);
		
		for (Object obj : getChildren(model)) 
			visit(context, obj);
	}
	
}
