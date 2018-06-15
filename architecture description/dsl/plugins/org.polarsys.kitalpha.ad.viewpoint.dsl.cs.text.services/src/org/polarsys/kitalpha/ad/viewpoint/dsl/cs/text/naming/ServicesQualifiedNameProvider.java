/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.naming;

import java.util.Collections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.util.IResourceScopeCache;
import org.eclipse.xtext.util.PolymorphicDispatcher;
import org.eclipse.xtext.util.SimpleAttributeResolver;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.util.Tuples;

import com.google.common.base.Function;
import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * 
 * @author Amine Lajmi
 *
 */
public class ServicesQualifiedNameProvider extends	DefaultDeclarativeQualifiedNameProvider {

	public static String RULES_PREFIX = "rules";
	
	private PolymorphicDispatcher<QualifiedName> qualifiedName = new PolymorphicDispatcher<QualifiedName>("qualifiedName",1,1,Collections.singletonList(this), PolymorphicDispatcher.NullErrorHandler.<QualifiedName>get())
	{
		@Override
		protected QualifiedName handleNoSuchMethod(Object... params) { 
			return null;
		}
	}; 
	
	@Inject
	private IQualifiedNameConverter converter = new IQualifiedNameConverter.DefaultImpl();
	
	@Inject
	private IResourceScopeCache cache = IResourceScopeCache.NullImpl.INSTANCE;
	
	private Function<EObject, String> resolver = SimpleAttributeResolver.newResolver(String.class, "name");
	
	@Override
	protected Function<EObject, String> getResolver() {
		return resolver;
	}

	@Override
	public QualifiedName getFullyQualifiedName(final EObject obj) {
		return cache.get(Tuples.pair(obj, "fqn"), obj.eResource(), new Provider<QualifiedName>(){

			@Override
			public QualifiedName get() {
				EObject temp = obj;
				QualifiedName qualifiedNameFromDispatcher = qualifiedName.invoke(temp);
				if (qualifiedNameFromDispatcher!=null) {
					return qualifiedNameFromDispatcher;
				}
				String name = getResolver().apply(temp);
				if (Strings.isEmpty(name)) {
					return null;
				}
				QualifiedName qualifiedNameFromConverter = converter.toQualifiedName(name);
				while (temp.eContainer() != null) {
					temp = temp.eContainer();
					QualifiedName parentsQualifiedName = getFullyQualifiedName(temp);
					if (parentsQualifiedName != null){
						//remove ecore prefix for elements from Ecore.ecore
						if (parentsQualifiedName.getSegment(1).equals(RULES_PREFIX)) {
							return qualifiedNameFromConverter;
						}
						return parentsQualifiedName.append(qualifiedNameFromConverter);
					}
				}
				return qualifiedNameFromConverter;
			}
		});
	}
}
