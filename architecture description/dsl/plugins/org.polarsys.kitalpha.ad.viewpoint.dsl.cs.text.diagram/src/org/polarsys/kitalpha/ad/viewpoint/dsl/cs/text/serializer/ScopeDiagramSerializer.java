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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.diagram.description.ContainerMapping;
import org.eclipse.sirius.diagram.description.DiagramDescription;
import org.eclipse.sirius.diagram.description.EdgeMapping;
import org.eclipse.sirius.diagram.description.NodeMapping;
import org.eclipse.sirius.viewpoint.description.Group;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.MultimapBasedScope;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.tokens.CrossReferenceSerializer;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.helpers.vpdiagram.SiriusViewpointHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.ExternalDataHelper;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;

/**
 * 
 * @author Faycal Abka
 *
 */
@SuppressWarnings("restriction")
public class ScopeDiagramSerializer extends CrossReferenceSerializer {

	@Inject
	IResourceDescription.Manager descriptionManager;
	
	
	@Override
	protected String getCrossReferenceNameFromScope(EObject semanticObject,
			CrossReference crossref, EObject target, final IScope scope,
			Acceptor errors) {

		Iterable<IEObjectDescription> exportedObjects = scope.getAllElements();
		
		
		EObject eObject = null;
		
		Resource res = target.eResource();
		
		if (res != null)
			eObject = res.getContents().isEmpty()? null: res.getContents().get(0);
		
		if (eObject != null && eObject instanceof EPackage){
			Resource resource = eObject.eResource();
			
			if (resource != null){
				URI importURI = resource.getURI();
				EPackage loadedEPackage = ExternalDataHelper.loadEPackage(importURI.toString(), semanticObject.eResource().getResourceSet());
				
				if (descriptionManager != null && loadedEPackage != null) {
					IResourceDescription resourceDescription = descriptionManager
							.getResourceDescription(resource);
					exportedObjects = Iterables.concat(exportedObjects,
							resourceDescription.getExportedObjects());
				}
			}
		}
		
		if (eObject instanceof Group){
			exportedObjects = exportRepresentationElements(eObject.eResource(), exportedObjects);
		}
		
		IScope newLocalScope = MultimapBasedScope.createScope(scope, exportedObjects, false);
		return super.getCrossReferenceNameFromScope(semanticObject, crossref, target, newLocalScope, errors);
	}
	
	
	//From VpDiagramGlobalScopeProvider
	private Iterable<IEObjectDescription> exportRepresentationElements(Resource resource,	Iterable<IEObjectDescription> exportedObjects){	

		Collection<IEObjectDescription> exportImportedObjects = new ArrayList<IEObjectDescription>();	



		if (descriptionManager != null	
				&& resource != null) {	
			EcoreUtil.resolveAll(resource);	

			Group group = SiriusViewpointHelper.getViewpointGroup(resource);	

			if (group != null){	
				IEObjectDescription desc = EObjectDescription.create(group.getName()
						.replaceAll(" ", ""), group, null);	
				exportImportedObjects.add(desc);	
			}	

			List<RepresentationDescription> diagramDescriptions = SiriusViewpointHelper.
					getAllRepresentationDescription(resource);	

			if (diagramDescriptions != null && !diagramDescriptions.isEmpty()){	
				for (RepresentationDescription dd : diagramDescriptions) {	
					IEObjectDescription desc = EObjectDescription.create(dd.getName().replaceAll(" ", ""), dd, null);	
					exportImportedObjects.add(desc);	
				}	
			}	


			List<ContainerMapping> containers = SiriusViewpointHelper.getAllContainerMapping(resource);	

			if (containers != null && !containers.isEmpty()){	
				for (ContainerMapping containerMapping : containers) {	
					IEObjectDescription desc = EObjectDescription.create(containerMapping.getName().replaceAll(" ", ""), containerMapping, null);	
					exportImportedObjects.add(desc);	
				}	
			}	

			List<DiagramDescription> diagramDescription = SiriusViewpointHelper.getAllDiagramDescription(resource);	

			if (diagramDescription != null && !diagramDescription.isEmpty()){	
				for (DiagramDescription dd : diagramDescription) {	
					IEObjectDescription desc = EObjectDescription.create(dd.getName().replaceAll(" ", ""), dd, null);	
					exportImportedObjects.add(desc);	
				}	
			}	

			List<NodeMapping> nodeMappings = SiriusViewpointHelper.getAllNodeMapping(resource);	

			if (nodeMappings != null && !nodeMappings.isEmpty()){	
				for (NodeMapping nm : nodeMappings) {	
					IEObjectDescription desc = EObjectDescription.create(nm.getName().replaceAll(" ", ""), nm, null);	
					exportImportedObjects.add(desc);	
				}	
			}	

			List<EdgeMapping> edgeMappings = SiriusViewpointHelper.getAllEdgeMapping(resource);	

			if (edgeMappings != null && !edgeMappings.isEmpty()){	
				for (EdgeMapping em : edgeMappings) {	
					IEObjectDescription desc = EObjectDescription.create(em.getName().replaceAll(" ", ""), em, null);	
					exportImportedObjects.add(desc);	
				}	
			}	
		}	
		return Iterables.concat(exportedObjects, exportImportedObjects);	
	}
}
