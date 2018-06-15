/*******************************************************************************
 * Copyright (c) 2017, 2018 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.serializer;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.linking.impl.LinkingHelper;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.parsetree.reconstr.impl.TokenUtil;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.diagnostic.ITokenDiagnosticProvider;
import org.eclipse.xtext.serializer.tokens.CrossReferenceSerializer;
import org.eclipse.xtext.serializer.tokens.ICrossReferenceSerializer;

import com.google.inject.Inject;

/**
 * 
 * @author Faycal Abka
 *
 */

@SuppressWarnings("restriction")
public class DiagramCrossReferenceSerializer implements
		ICrossReferenceSerializer {
	
	@Inject
	CrossReferenceSerializer crossReferenceDelegate;
	
	@Inject
	ScopeDiagramSerializer diagramSerializer;
	
	@Inject
	protected ITokenDiagnosticProvider diagnostics;

	@Inject
	private LinkingHelper linkingHelper;

	@Inject
	private IQualifiedNameConverter qualifiedNameConverter;

	@Inject
	private IScopeProvider scopeProvider;

	@Inject
	protected TokenUtil tokenUtil;

	@Inject
	private IValueConverterService valueConverter;

	@Override
	public boolean isValid(EObject context, CrossReference crossref,
			EObject target, INode node, Acceptor errorAcceptor) {
		return crossReferenceDelegate.isValid(context, crossref, target, node, errorAcceptor);
	}

	@Override
	public String serializeCrossRef(EObject semanticObject, CrossReference crossref,
			EObject target, INode node, Acceptor errors) {
		if (target.eIsProxy() && node != null) {
			return tokenUtil.serializeNode(node);
		}

		final EReference ref = GrammarUtil.getReference(crossref, semanticObject.eClass());
		final IScope scope = scopeProvider.getScope(semanticObject, ref);
		if (scope == null) {
			if (errors != null) {
				errors.accept(diagnostics.getNoScopeFoundDiagnostic(semanticObject, crossref, target));
			}
			return null;
		}

		if (node != null) {
			String text = linkingHelper.getCrossRefNodeAsString(node, true);
			QualifiedName qn = qualifiedNameConverter.toQualifiedName(text);
			URI targetURI = EcoreUtil.getURI(target);
			if (target.eResource() != null && target.eResource().getResourceSet() != null) {
				targetURI = target.eResource().getResourceSet().getURIConverter().normalize(targetURI);
			}
			for (IEObjectDescription desc : scope.getElements(qn)) {
				if (desc.getEObjectURI().equals(targetURI)) {
					return tokenUtil.serializeNode(node);
				}
			}
		}

		return diagramSerializer.getCrossReferenceNameFromScope(semanticObject, crossref, target, scope, errors);
	}

}
