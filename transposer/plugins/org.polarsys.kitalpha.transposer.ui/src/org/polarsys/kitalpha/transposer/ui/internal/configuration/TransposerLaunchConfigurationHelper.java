/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.transposer.ui.internal.configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchManager;

import org.polarsys.kitalpha.transposer.rules.handler.business.registry.GenericPurposeRegistry;
import org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping;

/**
 * Helper for {@link TransposerLaunchConfigurationType}.
 * 
 * @author GEBHART Guillaume
 */
public final class TransposerLaunchConfigurationHelper {

  /**
   * Avoid instantiation from external.
   */
  private TransposerLaunchConfigurationHelper() {
    // empty.
  }

  /**
   * Returns all code manager launch configuration.
   * 
   * @return all code manager launch configuration.
   * @throws CoreException if a problem occurs.
   */
  public static ILaunchConfiguration[] getAllTransposerLaunchConfigurations() throws CoreException {
    List<ILaunchConfiguration> result = new LinkedList<ILaunchConfiguration>();

    for (ILaunchConfiguration launchConfiguration : getLaunchManager().getLaunchConfigurations()) {
      if (launchConfiguration.getType() != null && launchConfiguration.getType().getIdentifier() != null
          && launchConfiguration.getType().getIdentifier().equals(ITransposerLaunchConfigurationConstants.TRANSPOSER_LAUNCH_CONFIGURATION_TYPE_ID)) {
        result.add(launchConfiguration);
      }
    }
    return result.toArray(new ILaunchConfiguration[result.size()]);
  }

  /**
   * Returns all code manager launch configuration working for the given business Metamodel URI.
   * 
   * @param mmUri the business metamodel URI.
   * @return all code manager launch configuration working for the given business Metamodel URI.
   * @throws CoreException
   */
  public static ILaunchConfiguration[] getAllTransposerLaunchConfigurations(final List<?> selection_p) throws CoreException {
    final Map<Mapping, List<ILaunchConfiguration>> launchConfigurations = new HashMap<Mapping, List<ILaunchConfiguration>>();
    final Set<ILaunchConfiguration> enabledConfigurations = new LinkedHashSet<ILaunchConfiguration>();
    final Set<Mapping> enabledMapping = new LinkedHashSet<Mapping>();

    // get mappings for all registered configuration
    for (ILaunchConfiguration launchConfiguration : getAllTransposerLaunchConfigurations()) {
      String purpose = launchConfiguration.getAttribute(ITransposerLaunchConfigurationConstants.PURPOSE_NAME, ""); //$NON-NLS-1$
      String mappingId = launchConfiguration.getAttribute(ITransposerLaunchConfigurationConstants.MAPPING_ID, ""); //$NON-NLS-1$

      Mapping mapping = GenericPurposeRegistry.getInstance().getContributedMapping(purpose, mappingId);

      if (mapping != null) {
       
      
      if (launchConfigurations.containsKey(mapping)) {
        launchConfigurations.get(mapping).add(launchConfiguration);
      } else {
        List<ILaunchConfiguration> configs = new ArrayList<ILaunchConfiguration>();
        configs.add(launchConfiguration);
        launchConfigurations.put(mapping, configs);
      }
      }
    }

    // get enabled mapping for selection
    for (Mapping mapping : launchConfigurations.keySet()) {
      boolean mappingToEnable = false;
      for (Object obj : selection_p) {
        if (mapping.getDomainHelper().isDomainFor(obj)) {
          mappingToEnable = true;
          break;
        }
      }
      if (mappingToEnable) {
		enabledMapping.add(mapping);
	}
    }
    
    // handle enabled mappings
    for (Mapping mapping : enabledMapping) {
      if (launchConfigurations.containsKey(mapping)) {
		enabledConfigurations.addAll(launchConfigurations.get(mapping));
	}
    }  

    return enabledConfigurations.toArray(new ILaunchConfiguration[launchConfigurations.size()]);
  }

  private static ILaunchManager getLaunchManager() {
    return DebugPlugin.getDefault().getLaunchManager();
  }

}
