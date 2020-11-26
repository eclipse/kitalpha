/*******************************************************************************
 * Copyright (c) 2016, 2018 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.resourcereuse.emfscheme.utils.context;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.sirius.business.api.session.Session;
import org.polarsys.kitalpha.resourcereuse.model.SearchCriteria;

/**
 * 
 * @author Xavier DECOOL
 *
 */

/**
 * 
 * FIXME Is this a singleton? The initializer by default is public. A client can create
 * other instances of model reuse.
 *
 */
public class ModelReuseContext {
	
	public static final ModelReuseContext INSTANCE = new ModelReuseContext();
	
	private Session session;
	private List<SearchCriteria> criterias = new ArrayList<>();
	
	
	public List<SearchCriteria> getCriterias() {
		return criterias;
	}

	public void addCriteria(SearchCriteria criteria) {
		criterias.add(criteria);
	}
	
	public void resetCriterias(){
		criterias.clear();
	}

	public Session getSession() {
		return session;
	}
	
	public void setSession(Session session) {
		this.session = session;
	}
}
