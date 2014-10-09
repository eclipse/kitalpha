/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
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
    if (_mostGenericMapping == null)
      computeMostGenericMapping();

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
          System.out
              .println("ERROR => PROHIBITED SITUATION : There are many specifics mappings for the purpose <" + currentMapping.getPurpose().getName() + ">"); //$NON-NLS-1$ //$NON-NLS-2$
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
    String message = "Contributed purpose " + getName() + " is valid, check the error log for information."; //$NON-NLS-1$ //$NON-NLS-2$

    for (Mapping mapping : getMappings()) {
      IStatus result = mapping.validate();
      if (result.getSeverity() != IStatus.INFO)
        severity = result.getSeverity();
    }

    if (severity == IStatus.WARNING) {
      message = "WARNING ! Contributed purpose " + getName() + " validates with warnings, check the error log for information."; //$NON-NLS-1$ //$NON-NLS-2$
    }

    if (severity == IStatus.WARNING) {
      message = "ERROR ! Contributed purpose " + getName() + " is invalid, check the error log for information."; //$NON-NLS-1$ //$NON-NLS-2$
    }

    return new Status(severity, RuleHandlerPlugin.PLUGIN_ID, message);
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

			public boolean apply(Mapping mapping) {
				return !mapping.isPrivate();
			}
		});
		
		return mappings.isEmpty();
	}
}
