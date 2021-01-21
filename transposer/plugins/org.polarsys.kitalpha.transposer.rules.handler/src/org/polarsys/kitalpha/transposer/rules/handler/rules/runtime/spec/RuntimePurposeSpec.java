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


package org.polarsys.kitalpha.transposer.rules.handler.rules.runtime.spec;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

import org.polarsys.kitalpha.transposer.rules.handler.RuleHandlerPlugin;
import org.polarsys.kitalpha.transposer.rules.handler.exceptions.possibilities.MappingPossibilityResolutionException;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IDomainHelper;
import org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingElement;
import org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingPossibility;
import org.polarsys.kitalpha.transposer.rules.handler.rules.runtime.impl.RuntimePurposeImpl;

/**
 * @author Guillaume GEBHART
 * 
 */
public class RuntimePurposeSpec extends RuntimePurposeImpl {

  private final String BLANK_DESCRIPTION = "Purpose withour mapping."; //$NON-NLS-1$

  /**
   * @see org.polarsys.kitalpha.transposer.rules.handler.rules.runtime.impl.RuntimePurposeImpl#resolveApplicablePossibility(java.lang.Object)
   */
  @Override
  public MappingPossibility resolveApplicablePossibility(Object object_p, IDomainHelper domainHelper_p) throws MappingPossibilityResolutionException {
    return this.getMapping().resolveApplicablePossibility(object_p, domainHelper_p);
  }

  /**
   * @see org.polarsys.kitalpha.transposer.rules.handler.rules.runtime.impl.RuntimePurposeImpl#getMappingElement(java.lang.Class)
   */
  @Override
  public MappingElement getMappingElement(Class<?> domainClass_p) {
    return getMapping().getOwnedMappingElement(domainClass_p);
  }

  /**
   * @see org.polarsys.kitalpha.transposer.rules.handler.rules.runtime.impl.RuntimePurposeImpl#validate()
   */
  @Override
  public IStatus validate() {
    int severity = IStatus.INFO;
    String message = "Runtime purpose " + getName() + " is valid, check the error log for information."; //$NON-NLS-1$ //$NON-NLS-2$

    IStatus result = this.getMapping().validate();
    if (result.getSeverity() != IStatus.INFO) {
		severity = result.getSeverity();
	}

    if (severity == IStatus.WARNING) {
      message = "WARNING ! Runtime purpose " + getName() + " validates with warnings, check the error log for information."; //$NON-NLS-1$ //$NON-NLS-2$
    }

    if (severity == IStatus.WARNING) {
      message = "ERROR ! Runtime purpose " + getName() + " is invalid, check the error log for information."; //$NON-NLS-1$ //$NON-NLS-2$
    }

    return new Status(severity, RuleHandlerPlugin.PLUGIN_ID, message);
  }

  /**
   * @see org.polarsys.kitalpha.transposer.rules.handler.rules.runtime.impl.RuntimePurposeImpl#getDescription()
   */
  @Override
  public String getDescription() {
    if (this.getMapping() == null) {
      return this.BLANK_DESCRIPTION;
    }
    return this.getMapping().getDescription();
  }

}
