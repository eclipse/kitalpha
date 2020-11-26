/*******************************************************************************
 * Copyright (c) 2018, 2020  Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 *  Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.massactions.visualize.query;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class QueryRegistry {

  private static final Log log = LogFactory.getLog(QueryRegistry.class);

  private static QueryRegistry instance = null;
  protected Map<String, IQuery> registry;

  public static QueryRegistry getInstance() {
    if (instance == null) {
      instance = new QueryRegistry();
    }

    return instance;
  }

  protected QueryRegistry() {
    registry = new HashMap<>();

    initializeRegistry();
  }

  protected void initializeRegistry() {

    IQuery sampleQuery = createSampleQuery();
    registry.put(sampleQuery.getName(), sampleQuery);
  }

  private IQuery createSampleQuery() {
    String sampleQuery = "aql:diagram.name + ' -> ' + pv.name";

    QueryParameter diagramParameter = new QueryParameter();
    diagramParameter.setName("diagram");

    QueryParameter pvParameter = new QueryParameter();
    pvParameter.setName("pv");

    AQLQuery query = new AQLQuery();
    query.setQuery(sampleQuery);
    query.setParameters(diagramParameter, pvParameter);
    query.setName("XXX");

    return query;
  }

  public IQuery getQuery(String name) {
    return registry.get(name);
  }

  public Set<IQuery> getValidQueries(int[] columnPositions) {
    // convert to column indexes
    // search values
    // for each value get the type
    // verify agains each query

    log.info(columnPositions);
    
    return Collections.emptySet();
  }

}
