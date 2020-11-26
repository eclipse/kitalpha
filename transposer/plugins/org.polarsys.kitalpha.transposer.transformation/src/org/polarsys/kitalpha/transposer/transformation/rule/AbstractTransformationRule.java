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


package org.polarsys.kitalpha.transposer.transformation.rule;

import org.polarsys.kitalpha.transposer.rules.handler.business.premises.ContainmentPremise;
import org.polarsys.kitalpha.transposer.rules.handler.business.premises.PrecedencePremise;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IRule;
import org.polarsys.kitalpha.transposer.transformation.context.ContextHelper;
import org.polarsys.kitalpha.transposer.transformation.context.TransformationKey;

/**
 * @author GEBHART Guillaume
 * 
 */
public abstract class AbstractTransformationRule<T> implements IRule<T> {

  /**
   * @see org.polarsys.kitalpha.transposer.rules.handler.rules.api.IRule#getName()
   */
  @Override
public String getName() {
    return this.getClass().getSimpleName();
  }

  /**
   * @param <E>
   * @param object_p
   * @return
   */
  protected <E> ContainmentPremise<E> createContainmentPremise(E object_p) {
    ContainmentPremise<E> premise = null;
    premise = new ContainmentPremise<E>(object_p);
    return premise;
  }

  /**
   * 
   * @param <E>
   * @param object_p
   * @param string_p
   * @return
   */
  @SuppressWarnings("nls")
  protected <E> PrecedencePremise<E> createPrecedencePremise(E object_p, String string_p) {
    PrecedencePremise<E> premise = null;
    premise = new PrecedencePremise<E>(object_p, string_p);
    return premise;
  }

  @Override
public void apply(T element_p, IContext context_p) throws Exception {
    boolean existingMainTarget = false;
    TransformationKey mainTargetKey = new TransformationKey(element_p, ContextHelper.MAIN_ROLE);
    Object createdObject = null;

    existingMainTarget = context_p.exists(mainTargetKey);
    if (!existingMainTarget) {
      createdObject = create(element_p, context_p);
      if (createdObject != null) {
		ContextHelper.createMainTarget(context_p, element_p, createdObject);
	}
    } else {
      createdObject = context_p.get(mainTargetKey);
    }

    if (createdObject != null) {
		update(createdObject, element_p, context_p);
	}
  }

  /**
   * @param element_p
   * @param context_p
   * @return
   */
  protected abstract Object create(T element_p, IContext context_p) throws Exception;

  /**
   * @param stereotypeApplication_p
   * @param element_p
   * @param context_p
   */
  protected abstract void update(Object object_p, T element_p, IContext context_p) throws Exception;

}