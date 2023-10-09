/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.transposer.rules.handler.rules.contribution.spec;

import java.util.Collection;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.polarsys.kitalpha.transposer.rules.handler.RuleHandlerPlugin;
import org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping;
import org.polarsys.kitalpha.transposer.rules.handler.rules.contribution.impl.ContributedPurposeImpl;

import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;

/**
 * @author Guillaume GEBHART
 * 
 */
public class ContributedPurposeSpec extends ContributedPurposeImpl {

  private Mapping _mostGenericMapping = null;

  /**
   * @return
   */
  @Override
  public Mapping getMostGenericMapping() {
    if (_mostGenericMapping == null) {
      computeMostGenericMapping();
    }

    return _mostGenericMapping;
  }

  /**
   * 
   */
  private void computeMostGenericMapping() {
    Mapping lowestMapping = null;
    for (Mapping currentMapping : getMappings()) {
      if (currentMapping.getExtendedMapping() == null || !getMappings().contains(currentMapping.getExtendedMapping())) {
        if (lowestMapping != null) {
          break;
        }
        lowestMapping = currentMapping;
      }
    }
    _mostGenericMapping = lowestMapping;
  }

  /**
   * @see org.polarsys.kitalpha.transposer.rules.handler.rules.contribution.impl.ContributedPurposeImpl#validate()
   */
  @Override
  public IStatus validate() {
    int severity = IStatus.INFO;
    String message = "Contributed purpose " + getName() + " is valid."; //$NON-NLS-1$ //$NON-NLS-2$

    IStatus multipleMappingsStatus = validateMultipleMappingsForPurposes();
    boolean hasMultipleMappings = multipleMappingsStatus.getSeverity() == IStatus.WARNING;
    
    if (hasMultipleMappings)  severity = multipleMappingsStatus.getSeverity();
    
    for (Mapping mapping : getMappings()) {
      IStatus result = mapping.validate();
      if (result.getSeverity() != IStatus.INFO) {
        severity = result.getSeverity();
      }
    }
    
   

    if (severity == IStatus.WARNING) {
      message = "WARNING ! Contributed purpose " + getName() //$NON-NLS-1$
          + " validates with warnings, check the error log for information."; //$NON-NLS-1$
    }

    if (severity == IStatus.ERROR) {
      message = "ERROR ! Contributed purpose " + getName() + " is invalid, check the error log for information."; //$NON-NLS-1$ //$NON-NLS-2$
    }
    
    if (hasMultipleMappings) {
      message += "\n" + multipleMappingsStatus.getMessage();//$NON-NLS-1$
    }

    return new Status(severity, RuleHandlerPlugin.PLUGIN_ID, message);
  }
  
  private IStatus validateMultipleMappingsForPurposes() {
    Mapping lowestMapping = null;
    for (Mapping currentMapping : getMappings()) {
      if (currentMapping.getExtendedMapping() == null || !getMappings().contains(currentMapping.getExtendedMapping())) {
        if (lowestMapping != null) {
          return new Status(IStatus.WARNING,RuleHandlerPlugin.PLUGIN_ID, 
              "WARNING => PROHIBITED SITUATION : There are many specifics mappings for the purpose <" + currentMapping.getPurpose().getName() + ">"); //$NON-NLS-1$ //$NON-NLS-2$)
        }
        lowestMapping = currentMapping;
      }
    }
    return new Status(IStatus.OK,RuleHandlerPlugin.PLUGIN_ID, "" );
  }

  /**
   * @see org.polarsys.kitalpha.transposer.rules.handler.rules.contribution.impl.ContributedPurposeImpl#getMapping(org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping)
   */
  @Override
  public Mapping getMapping(String mappingId_p) {
    if (mappingId_p != null || !"".equals(mappingId_p)) { //$NON-NLS-1$
      for (Mapping mapping : getMappings()) {
        if (mappingId_p.equals(mapping.getId())) {
          return mapping;
        }
      }
    }
    return null;
  }

  @Override
  public boolean isPrivate() {
    Collection<Mapping> mappings = Collections2.filter(getMappings(), new Predicate<Mapping>() {

      @Override
      public boolean apply(Mapping mapping) {
        return !mapping.isPrivate();
      }
    });

    return mappings.isEmpty();
  }
}
