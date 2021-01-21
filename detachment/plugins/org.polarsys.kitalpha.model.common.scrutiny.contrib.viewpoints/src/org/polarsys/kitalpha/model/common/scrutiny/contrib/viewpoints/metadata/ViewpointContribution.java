/*******************************************************************************
 * Copyright (c) 2016, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.model.common.scrutiny.contrib.viewpoints.metadata;

import java.util.Set;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.osgi.framework.Version;
import org.polarsys.kitalpha.ad.metadata.helpers.Contribution;
import org.polarsys.kitalpha.ad.metadata.helpers.MetadataHelper;
import org.polarsys.kitalpha.ad.services.manager.ViewpointManager;
import org.polarsys.kitalpha.model.common.scrutiny.contrib.viewpoints.scrutinizes.UsedAFViewpoints;

/**
 * @author Thomas Guiu
 * 
 */
public class ViewpointContribution extends Contribution {

  public ViewpointContribution() {
  }

  @Override
public void update(ResourceSet context) {
    Set<org.polarsys.kitalpha.resourcereuse.model.Resource> lookForViewpoints = UsedAFViewpoints
        .lookUp(context.getResources());
    for (org.polarsys.kitalpha.resourcereuse.model.Resource res : lookForViewpoints) {
      Version version = ViewpointManager.readVersion(res);
      MetadataHelper.getViewpointMetadata(context).updateVersion(res, version);
    }
  }

}
