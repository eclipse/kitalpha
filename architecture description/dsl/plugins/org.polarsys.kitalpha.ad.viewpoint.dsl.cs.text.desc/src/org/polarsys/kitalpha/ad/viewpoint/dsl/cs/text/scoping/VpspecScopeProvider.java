/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
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
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Aspect;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Data;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.Services;

import com.google.common.base.Predicate;

/**
 * 
 * @author Amine Lajmi
 *
 */
public class VpspecScopeProvider extends AbstractDeclarativeScopeProvider {

	IScope scope_Viewpoint_parents(EObject context, EReference reference) {
		final EObject context2 = context;
		return new FilteringScope(delegateGetScope(context, reference),
				new Predicate<IEObjectDescription>() {
					@Override
					public boolean apply(IEObjectDescription d) {
						return (d.getEObjectOrProxy() instanceof org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint
								&& !d.getEObjectOrProxy().equals(context2));
					}
				});
	}
	
	IScope scope_Viewpoint_dependencies(EObject context, EReference reference) {
		final EObject context2 = context;
		return new FilteringScope(delegateGetScope(context, reference),
				new Predicate<IEObjectDescription>() {
					@Override
					public boolean apply(IEObjectDescription d) {
						return (d.getEObjectOrProxy() instanceof org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint 
								&& !d.getEObjectOrProxy().equals(context2));
					}
				});
	}
	
	IScope scope_Viewpoint_VP_Data(EObject context, EReference reference) {
		return new FilteringScope(delegateGetScope(context, reference),
				new Predicate<IEObjectDescription>() {
					@Override
					public boolean apply(IEObjectDescription d) {
						return (d.getEObjectOrProxy() instanceof Data);
					}
				});
	}
	
	IScope scope_Viewpoint_VP_Aspects(EObject context, EReference reference) {
		return new FilteringScope(delegateGetScope(context, reference),
				new Predicate<IEObjectDescription>() {
					@Override
					public boolean apply(IEObjectDescription d) {
						return (d.getEObjectOrProxy() instanceof Aspect || d.getEObjectOrProxy() instanceof Services);
					}
				});
	}
	
	IScope scope_Viewpoint_useViewpoint(EObject context, EReference reference){
		final EObject context2 = context;
		return new FilteringScope(delegateGetScope(context, reference),
				new Predicate<IEObjectDescription>() {
					@Override
					public boolean apply(IEObjectDescription d) {
						return (d.getEObjectOrProxy() instanceof org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint && 
								!d.getEObjectOrProxy().equals(context2));
					}
				});
	}
	
	
}
