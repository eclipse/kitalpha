/*******************************************************************************
 * Copyright (c) 2016 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.doc.gen.business.ecore.egf.query;

import java.util.ArrayList;
import java.util.Map;

import org.eclipse.egf.model.pattern.PatternContext;
import org.eclipse.egf.pattern.query.IQuery;
import org.polarsys.kitalpha.doc.gen.business.core.util.DefaultSiriusDiagramHelper;
import org.polarsys.kitalpha.doc.gen.business.core.util.IDiagramHelper;

/**
 * @author Faycal ABKA
 *
 */
public class InjectDiagramHelperQuery implements IQuery {
	
	private static IDiagramHelper helper = new DefaultSiriusDiagramHelper();

	public InjectDiagramHelperQuery() {
	}

	@Override
	public ArrayList<Object> execute(ParameterDescription parameter, Map<String, String> queryCtx, PatternContext context) {
		ArrayList<Object> diagramHelper = new ArrayList<Object>();
		diagramHelper.add(helper);
		return diagramHelper;
	}

}
