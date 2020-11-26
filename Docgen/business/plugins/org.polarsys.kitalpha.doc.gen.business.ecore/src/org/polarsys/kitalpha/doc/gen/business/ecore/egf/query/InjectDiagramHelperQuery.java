/*******************************************************************************
 * Copyright (c) 2016 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
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
