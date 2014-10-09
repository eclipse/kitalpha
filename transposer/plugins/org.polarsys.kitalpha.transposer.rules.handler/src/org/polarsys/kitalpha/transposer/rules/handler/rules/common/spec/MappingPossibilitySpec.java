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


package org.polarsys.kitalpha.transposer.rules.handler.rules.common.spec;

import java.util.List;

import org.polarsys.kitalpha.transposer.rules.handler.exceptions.rules.RuleDefinitionException;
import org.polarsys.kitalpha.transposer.rules.handler.exceptions.rules.RuleExecutionException;
import org.polarsys.kitalpha.transposer.rules.handler.internal.util.GenericReflectionUtils;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IDomainHelper;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IRule;
import org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingElement;
import org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingPossibilityImpl;

/**
 * @author Guillaume GEBHART
 * 
 */
public class MappingPossibilitySpec extends MappingPossibilityImpl {

  /**
   * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingPossibilityImpl#checkRules()
   */
  @Override
  public boolean checkRules(IDomainHelper domainHelper_p) throws RuleDefinitionException {
    boolean checked = false;
    if (getCompleteRule() != null)
      checked = checkCompleteRule(domainHelper_p);
    if (getIncompleteRule() != null)
      checked = checked && checkIncompleteRule(domainHelper_p);
    return checked;
  }

  /**
   * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingPossibilityImpl#checkCompleteRule()
   */
  @Override
  public boolean checkCompleteRule(IDomainHelper domainHelper_p) throws RuleDefinitionException {
    return checkRule(getCompleteRule(), domainHelper_p);
  }

  /**
   * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingPossibilityImpl#checkIncompleteRule()
   */
  @Override
  public boolean checkIncompleteRule(IDomainHelper domainHelper_p) throws RuleDefinitionException {
    return checkRule(getIncompleteRule(), domainHelper_p);
  }

  /**
   * @param transfoRule_p
   * @param metaClass_p
   */
  private boolean checkRule(IRule<?> rule_p, IDomainHelper domainHelper_p) {
    boolean checked = false;
    List<Class<?>> parameters = GenericReflectionUtils.getGenericInterfaceTypeArguments(IRule.class, rule_p.getClass());
    Class<?> domainClass = null;

    if (eContainer() instanceof MappingElement)
      domainClass = ((MappingElement) eContainer()).getDomainMetaClass();

    if (domainClass != null && parameters != null && parameters.size() > 0) {
      for (Class<?> parameter : parameters) {
        checked = checked || parameter.isAssignableFrom(domainClass);
      }
    }
    return checked;
  }

  /**
   * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingPossibilityImpl#updateContext(java.lang.Object,
   *      org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext)
   */
  @Override
  public void updateContext(Object object_p, IContext context_p) {
    if (this.getContext() == null)
      return;

    // handle specific treatment for this element
    context_p.setUpForModelElement(object_p);

    // handle specific context provided for this element
    this.getContext().setUpForModelElement(object_p);
    context_p.updateWith(this.getContext());
  }

  /**
   * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingPossibilityImpl#applyRule(java.lang.Object,
   *      org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext, boolean)
   */
  @Override
  public void applyRule(Object object_p, IContext context_p, boolean complete_p) throws RuleExecutionException {
    if (complete_p) {
      applyCompleteRule(object_p, context_p);
    } else if (getIncompleteRule() != null) {
      applyIncompleteRule(object_p, context_p);
    } else
      throw new RuleExecutionException(this.getName() + " should have an incomplete rule"); //$NON-NLS-1$

  }

  /**
   * @param object_p
   * @param context_p
   */
  private void applyCompleteRule(Object object_p, IContext context_p) throws RuleExecutionException {
    if (this.getCompleteRule() != null) {
      IRule rule = this.getCompleteRule();
      try {
        rule.apply(object_p, context_p);
      } catch (Exception e) {
        throw new RuleExecutionException(this.getName(), e);
      }
    }
  }

  /**
   * @param object_p
   * @param context_p
   */
  private void applyIncompleteRule(Object object_p, IContext context_p) throws RuleExecutionException {
    if (this.getIncompleteRule() != null) {
      IRule rule = this.getIncompleteRule();
      try {
        rule.apply(object_p, context_p);
      } catch (Exception e) {
        throw new RuleExecutionException(this.getName(), e);
      }
    }
  }

  /**
   * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingPossibilityImpl#isApplicableOn(java.lang.Object)
   */
  @Override
  public boolean isApplicableOn(Object object_p) {
    boolean isApplicable = false;// check the complete rule
    if (this.getCompleteRule() != null) { // && mappingPossibility.checkCompleteRule()) {
      IRule rule = this.getCompleteRule();
      isApplicable = rule.isApplicableOn(object_p);
      // ClassCastException should not happen : the the mapping element is selected regarding its domain class and the given model element.
    }

    if (this.getIncompleteRule() != null) { // && mappingPossibility.checkIncompleteRule()) {
      IRule rule = this.getIncompleteRule();
      isApplicable = isApplicable && rule.isApplicableOn(object_p);
    }

    return isApplicable;
  }

}
