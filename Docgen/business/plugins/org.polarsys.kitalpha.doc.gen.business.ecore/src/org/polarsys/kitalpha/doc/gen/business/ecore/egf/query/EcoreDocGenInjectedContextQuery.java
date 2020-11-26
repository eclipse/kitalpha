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
import java.util.List;
import java.util.Map;

import org.eclipse.egf.model.pattern.PatternContext;
import org.eclipse.egf.pattern.query.IQuery;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * 
 * @author Faycal Abka
 *
 */
public class EcoreDocGenInjectedContextQuery implements IQuery {

	public EcoreDocGenInjectedContextQuery() {
	}

	@Override
	public List<Object> execute(ParameterDescription parameter, Map<String, String> queryCtx, PatternContext context) {
		ArrayList<Object> returnedList = new ArrayList<Object>();
		Object injectedElement = context.getValue(PatternContext.INJECTED_CONTEXT);
		if (injectedElement != null && injectedElement instanceof EObject){
			EObject result = (EObject)injectedElement;
			URI uri = EcoreUtil.getURI(result.eClass());
			if (parameter.getType().equals(uri.toString())){
				returnedList.add(result);
			}
		}
		return returnedList;
	}

}
