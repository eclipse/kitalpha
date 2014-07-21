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
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.serializer;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.MultimapBasedScope;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.tokens.CrossReferenceSerializer;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.ExternalDataHelper;

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
		
		EPackage ePackage = null;
		EObject eObject = target.eResource().getContents().get(0);
		
		if (eObject instanceof EPackage){
			ePackage = (EPackage)eObject;
		}
//		String ePackage = target.eResource().getURI().toString();
		if (ePackage != null) {
			String importURI = ePackage.getNsURI();
			QualifiedName packageNsURI = QualifiedName.create(importURI);
			URI nsURI = URI.createURI(packageNsURI.toString());
			EPackage ecoreModel = EPackageRegistryImpl.INSTANCE
					.getEPackage(nsURI.toString());
			if (ecoreModel != null) {
				 EPackage loadedEPackage = ExternalDataHelper.loadEPackage(nsURI.toString(), semanticObject.eResource().getResourceSet());
				// EPackageRegistryImpl.INSTANCE.getEPackage(importURI);
				if (descriptionManager != null && loadedEPackage != null
						&& loadedEPackage.eResource() != null) {
					Resource packageResource = ecoreModel.eResource();
					IResourceDescription resourceDescription = descriptionManager
							.getResourceDescription(packageResource);
					exportedObjects = Iterables.concat(exportedObjects,
							resourceDescription.getExportedObjects());
				}
			}
		}
		
		IScope newLocalScope = MultimapBasedScope.createScope(scope, exportedObjects, false);
		
		return super.getCrossReferenceNameFromScope(semanticObject, crossref, target, newLocalScope, errors);
		
	}

}
