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

package org.polarsys.kitalpha.transposer.rules.handler.business;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;

import org.polarsys.kitalpha.transposer.rules.handler.api.IRulesHandler;
import org.polarsys.kitalpha.transposer.rules.handler.business.registry.GenericPurposeRegistry;
import org.polarsys.kitalpha.transposer.rules.handler.exceptions.mappings.purposes.NonExistingPurposeException;
import org.polarsys.kitalpha.transposer.rules.handler.exceptions.possibilities.MappingPossibilityResolutionException;
import org.polarsys.kitalpha.transposer.rules.handler.exceptions.rules.ComputePremisesException;
import org.polarsys.kitalpha.transposer.rules.handler.exceptions.rules.RuleExecutionException;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IDomainHelper;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IPremise;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IRule;
import org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingPossibility;
import org.polarsys.kitalpha.transposer.rules.handler.rules.runtime.RuntimePurpose;

/**
 * @author Franco Bergomi
 * 
 */

public class GenericRulesHandler implements IRulesHandler {

  private IContext _context = null;
  private RuntimePurpose _runtimePurpose = null;
  private Map<Object, MappingPossibility> _knownObjects = new HashMap<Object, MappingPossibility>();
  private Set<Object> _knownObjectsWithoutApplicablePossibitity = new HashSet<Object>();

  /**
   * 
   */
  /**
   * 
   */
  public GenericRulesHandler(String purpose_p, String mappingId_p) throws NonExistingPurposeException {
    super();
    init(purpose_p, mappingId_p);
  }

  /**
   * 
   */
  @Override
@SuppressWarnings( { "unchecked", "nls" })
  public void dispose() {
    if (_context != null) {
      _context.reset();
      _context = null;
    }
    _knownObjects.clear();
    _knownObjectsWithoutApplicablePossibitity.clear();

    _runtimePurpose = null;

  }

  /**
   * @param defaultContext_p
   */
  @Override
@SuppressWarnings("unused")
  public void setContext(IContext defaultContext_p) {
    _context = defaultContext_p;
  }

  /**
   * @param eObject_p
   * @return
   * @throws ComputePremisesException
   */
  /**
   * @param eObject_p
   * @return
   * @throws ComputePremisesException
   * @throws NonExistingPurposeException
   */
  @Override
public List<IPremise> getPremises(Object object_p) throws ComputePremisesException {
    MappingPossibility applicablePossibility = null;

    try {
      applicablePossibility = getApplicablePossibility(object_p);
    } catch (MappingPossibilityResolutionException e) {
      throw new ComputePremisesException(e, object_p, getPurpose());
    }

    if (applicablePossibility != null) {
      IRule completeRule = applicablePossibility.getCompleteRule();
      return completeRule.getPremises(object_p);
    }

    return Collections.<IPremise> emptyList();
  }

  /**
   * @param mappingId_p_p
   * @see org.polarsys.kitalpha.transposer.rules.handler.api.IRulesHandler#init(java.lang.String)
   */
  @Override
public void init(String purpose_p, String mappingId_p) throws NonExistingPurposeException {
    this._runtimePurpose = GenericPurposeRegistry.getInstance().getRegisteredPurpose(purpose_p, mappingId_p);
    if (_runtimePurpose != null && _runtimePurpose.getMapping() != null) {
		this._context = _runtimePurpose.getMapping().getContext();
	}
  }

  /**
   * @see org.polarsys.kitalpha.transposer.rules.handler.api.IRulesHandler#getDomainHelper()
   */
  @Override
public IDomainHelper getDomainHelper() {
    return this._runtimePurpose.getMapping().getDomainHelper();
  }

  /**
   * @see org.polarsys.kitalpha.transposer.rules.handler.api.IRulesHandler#getPurpose()
   */
  @Override
public String getPurpose() {
    return this._runtimePurpose.getName();
  }

  /**
   * @see org.polarsys.kitalpha.transposer.rules.handler.api.IRulesHandler#apply(java.lang.Object, boolean)
   */
  @Override
public boolean apply(Object object_p, boolean complete_p, IProgressMonitor monitor_p) throws RuleExecutionException {
    MappingPossibility applicablePossibility = null;

    try {
      applicablePossibility = getApplicablePossibility(object_p);
    } catch (MappingPossibilityResolutionException e) {
      throw new RuleExecutionException(e.getMessage(), e);
    }

    if (applicablePossibility == null) {
		return false;
	}

    if (applicablePossibility.getContext() != null) {
		applicablePossibility.updateContext(object_p, this._context);
	}

    if (monitor_p != null) {
      monitor_p.subTask(applicablePossibility.getName() + " (" + (complete_p ? "complete" : "incomplete") + ") " + object_p.getClass().getSimpleName()); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
    }

    applicablePossibility.applyRule(object_p, this._context, complete_p);
    return true;
  }

  /**
   * @see org.polarsys.kitalpha.transposer.rules.handler.api.IRulesHandler#getApplicablePossibility(java.lang.Object)
   */
  @Override
public MappingPossibility getApplicablePossibility(Object object_p) throws MappingPossibilityResolutionException {
    MappingPossibility applicablePossibility = null;

    if (_knownObjects.containsKey(object_p)) {
      return _knownObjects.get(object_p);
    } else if (_knownObjectsWithoutApplicablePossibitity.contains(object_p)) {
      return null;
    } else {
      applicablePossibility = this._runtimePurpose.getMapping().resolveApplicablePossibility(object_p, _runtimePurpose.getMapping().getDomainHelper());

      if (applicablePossibility != null) {
		_knownObjects.put(object_p, applicablePossibility);
	} else {
		_knownObjectsWithoutApplicablePossibitity.add(object_p);
	}

      return applicablePossibility;
    }

  }

  /**
   * @see org.polarsys.kitalpha.transposer.rules.handler.api.IRulesHandler#validatePurpose()
   */
  @Override
public void validatePurpose() {
    this._runtimePurpose.validate();
  }

  /**
   * @see org.polarsys.kitalpha.transposer.rules.handler.api.IRulesHandler#getContext()
   */
  @Override
public IContext getContext() {
    return _context;
  }
}
