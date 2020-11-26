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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.scoping.impl.FilteringScope;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Enumeration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.LocalClassAssociation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.util.ProjectUtil;

import com.google.common.base.Predicate;

/**
 * 
 * @author Amine Lajmi
 *
 */
public class DataScopeProvider extends AbstractDeclarativeScopeProvider {

	IScope scope_Class_extends(EObject context, EReference reference) {
		return new FilteringScope(delegateGetScope(context, reference),
				new Predicate<IEObjectDescription>() {
					@Override
					public boolean apply(IEObjectDescription d) {
						return (d.getEObjectOrProxy() instanceof EClass);
					}
				});
	}

	IScope scope_ExternalSuperClass_superClass(EObject context,	EReference reference) {
		return new FilteringScope(delegateGetScope(context, reference),
				new Predicate<IEObjectDescription>() {
					@Override
					public boolean apply(IEObjectDescription d) {
						return (d.getEObjectOrProxy() instanceof EClass);
					}
				});
	}

	IScope scope_LocalSuperClass_superClass(EObject context, EReference reference) {
		final EObject context2 = context;
		
		return new FilteringScope(delegateGetScope(context, reference),
				new Predicate<IEObjectDescription>() {
					@Override
					public boolean apply(IEObjectDescription d) {
						return (d.getEObjectOrProxy() instanceof org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class
								&& !d.getEObjectOrProxy().equals(context2));
					}
				});
	}

	IScope scope_ExternalAttributeType_type(EObject context, EReference reference) {
		return new FilteringScope(delegateGetScope(context, reference),
				new Predicate<IEObjectDescription>() {
					@Override
					public boolean apply(IEObjectDescription d) {
						return (d.getEObjectOrProxy() instanceof EDataType);
					}
				});
	}
	
	IScope scope_LocalAttributeType_type(EObject context, EReference reference) {
		
		final EObject context2 = context;
		return new FilteringScope(delegateGetScope(context, reference),
				new Predicate<IEObjectDescription>() {
					@Override
					public boolean apply(IEObjectDescription d) {
						return (d.getEObjectOrProxy() instanceof Enumeration && ProjectUtil.areInSameProject(context2, d.getEObjectOrProxy()));
					}
				});
	}

	IScope scope_ResultData_type(EObject context, EReference reference) {
		return new FilteringScope(delegateGetScope(context, reference),
				new Predicate<IEObjectDescription>() {
					@Override
					public boolean apply(IEObjectDescription d) {
						return (d.getEObjectOrProxy() instanceof EDataType);
					}
				});
	}

	IScope scope_LocalClassAssociation_opposite(EObject context, EReference reference){
		final EObject context2 = context;
		return new FilteringScope(delegateGetScope(context, reference),
				new Predicate<IEObjectDescription>() {
			@Override
			public boolean apply(IEObjectDescription d) {
				EObject target = d.getEObjectOrProxy();
				if (!(context2.equals(target)) && 
						context2 instanceof LocalClassAssociation && 
						target instanceof LocalClassAssociation){
					LocalClassAssociation currentReference = (LocalClassAssociation)context2;
					LocalClassAssociation oppositeReference = (LocalClassAssociation)target;
					
					Class referenceContainingClass = (Class) currentReference.eContainer();
					Class referencedType = currentReference.getLocalTarget();
					
					Class oppositeContainingClass = (Class)oppositeReference.eContainer();
					Class oppositeReferencedType = oppositeReference.getLocalTarget();
					
					return DataSpecificationHelper.isSupertype(oppositeContainingClass, referencedType) &&
							DataSpecificationHelper.isSupertype(referenceContainingClass, oppositeReferencedType);
				}
				return false;
			}
		});
	}

	IScope scope_LocalClassAssociation_LocalTarget(EObject context,	EReference reference) {
		
		final EObject context2 = context;
		return new FilteringScope(delegateGetScope(context, reference),
				new Predicate<IEObjectDescription>() {
					@Override
					public boolean apply(IEObjectDescription d) {
						return (d.getEObjectOrProxy() instanceof org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class 
								&& ProjectUtil.areInSameProject(context2, d.getEObjectOrProxy()));
					}
				});
	}

	IScope scope_ExternalClassAssociation_ExternalTarget(EObject context, EReference reference) {
		return new FilteringScope(delegateGetScope(context, reference),
				new Predicate<IEObjectDescription>() {
					@Override
					public boolean apply(IEObjectDescription d) {
						return (d.getEObjectOrProxy() instanceof EClass);
					}
				});
	}
	
	IScope scope_ExternalType_type(EObject context, EReference reference) {
		return new FilteringScope(delegateGetScope(context, reference),
				new Predicate<IEObjectDescription>() {
					@Override
					public boolean apply(IEObjectDescription d) {
						return (d.getEObjectOrProxy() instanceof EClassifier);
					}
				});
	}
	
	IScope scope_LocalType_type(EObject context, EReference reference) {
		
		final EObject context2 = context;
		return new FilteringScope(delegateGetScope(context, reference),
				new Predicate<IEObjectDescription>() {
					@Override
					public boolean apply(IEObjectDescription d) {
						return (d.getEObjectOrProxy() instanceof org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ViewpointClassifier
								&& ProjectUtil.areInSameProject(context2, d.getEObjectOrProxy()));
					}
				});
	}
}
