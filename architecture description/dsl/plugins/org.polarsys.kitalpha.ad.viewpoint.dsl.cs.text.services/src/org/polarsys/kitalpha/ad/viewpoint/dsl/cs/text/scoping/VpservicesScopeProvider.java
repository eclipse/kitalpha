/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.scoping.impl.FilteringScope;

import com.google.common.base.Predicate;

/**
 * 
 * @author Amine Lajmi
 *
 */
public class VpservicesScopeProvider extends AbstractDeclarativeScopeProvider {
	
	IScope scope_Service_relatedRules(EObject context, EReference reference) {
		return new FilteringScope(delegateGetScope(context, reference),
				new Predicate<IEObjectDescription>() {
					@Override
					public boolean apply(IEObjectDescription d) {
						return (d.getEObjectOrProxy() instanceof org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpservices.Rule);
					}
				});
	}

}
