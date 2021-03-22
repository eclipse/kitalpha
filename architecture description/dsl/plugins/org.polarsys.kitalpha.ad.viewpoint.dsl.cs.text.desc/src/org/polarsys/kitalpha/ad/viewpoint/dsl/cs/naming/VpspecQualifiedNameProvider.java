/*******************************************************************************
 * Copyright (c) 2021 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.naming;

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
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint;

import com.google.common.base.Function;
import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * Inspired from
 * {@code org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.naming.ServicesQualifiedNameProvider}
 * and adapted to use shortName attribute value on {@link Viewpoint} elements
 * instead of name.
 * 
 * @author Arnaud Dieumegard
 */
public class VpspecQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {

	private PolymorphicDispatcher<QualifiedName> qualifiedName = new PolymorphicDispatcher<QualifiedName>(
			"qualifiedName", 1, 1, Collections.singletonList(this),
			PolymorphicDispatcher.NullErrorHandler.<QualifiedName>get()) {
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

	private Function<EObject, String> shortNameResolver = SimpleAttributeResolver.newResolver(String.class,
			"shortName");

	@Override
	protected Function<EObject, String> getResolver() {
		return resolver;
	}

	@Override
	public QualifiedName getFullyQualifiedName(final EObject obj) {
		return cache.get(Tuples.pair(obj, "fqn"), obj.eResource(), new Provider<QualifiedName>() {

			@Override
			public QualifiedName get() {
				EObject temp = obj;
				QualifiedName qualifiedNameFromDispatcher = qualifiedName.invoke(temp);
				if (qualifiedNameFromDispatcher != null) {
					return qualifiedNameFromDispatcher;
				}
				String name = null;
				if (temp instanceof Viewpoint) {
					name = shortNameResolver.apply(temp);
				} else {
					name = getResolver().apply(temp);
				}
				if (Strings.isEmpty(name)) {
					return null;
				}
				QualifiedName qualifiedNameFromConverter = converter.toQualifiedName(name);
				while (temp.eContainer() != null) {
					temp = temp.eContainer();
					QualifiedName parentsQualifiedName = getFullyQualifiedName(temp);
					if (parentsQualifiedName != null) {
						return parentsQualifiedName.append(qualifiedNameFromConverter);
					}
				}
				return qualifiedNameFromConverter;
			}
		});
	}
}
