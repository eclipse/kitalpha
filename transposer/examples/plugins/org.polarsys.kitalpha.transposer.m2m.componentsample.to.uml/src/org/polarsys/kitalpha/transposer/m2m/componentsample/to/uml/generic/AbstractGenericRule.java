/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.transposer.m2m.componentsample.to.uml.generic;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.transposer.rules.handler.business.premises.ContainmentPremise;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IPremise;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IRule;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentElement;

/**
 * @author Guillaume Gebhart
 * 
 */
public abstract class AbstractGenericRule<T extends ComponentElement>
		implements IRule<T> {

	@Override
	public String getName() {
		return this.getClass().getSimpleName();
	}

	@Override
	public List<IPremise> getPremises(T element) {
		List<IPremise> premises = new ArrayList<IPremise>();
		EObject container = element.eContainer();
		ContainmentPremise<EObject> premise = new ContainmentPremise<EObject>(
				container);
		premises.add(premise);

		return premises;
	}

	@Override
	public boolean isApplicableOn(T element) {
		return element instanceof ComponentElement;
	}
}
