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
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.serializer;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.MultimapBasedScope;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.tokens.CrossReferenceSerializer;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;


/**
 * 
 * @author Faycal ABKA
 *
 */
@SuppressWarnings("restriction")
public class ScopeDataSerializer extends CrossReferenceSerializer {

	
	@Inject
	IResourceDescription.Manager descriptionManager;
	
	
	
	@Override
	protected String getCrossReferenceNameFromScope(EObject semanticObject,
			CrossReference crossref, EObject target, final IScope scope,
			Acceptor errors) {

		Iterable<IEObjectDescription> exportedObjects = scope.getAllElements();
		
		Resource resource = target.eResource();
		
		if (resource != null){
			if (descriptionManager != null){
				IResourceDescription resourceDescription = descriptionManager
						.getResourceDescription(resource);
				if (resourceDescription != null)
					exportedObjects = Iterables.concat(exportedObjects,
							resourceDescription.getExportedObjects());
			}
		}

		IScope newLocalScope = MultimapBasedScope.createScope(scope, exportedObjects, false);
		
		return super.getCrossReferenceNameFromScope(semanticObject, crossref, target, newLocalScope, errors);
		
	}

}
