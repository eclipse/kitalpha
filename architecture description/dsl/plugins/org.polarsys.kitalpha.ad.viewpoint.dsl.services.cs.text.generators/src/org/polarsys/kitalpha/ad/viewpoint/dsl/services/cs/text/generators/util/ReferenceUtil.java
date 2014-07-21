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

package org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.generators.util;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EContentsEList.FeatureIterator;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.identifiers.MetamodelIDs;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.FileExtension;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.ResourceHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.generators.Messages;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;

/**
 * 
 * @author Amine Lajmi
 *
 */
public class ReferenceUtil {

	private ReferenceUtil() {}
	
	public static void setTargetReferences(org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint source, org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint target, ResourceSet resourceSet) {
		target.getParents().clear();
		EList<org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint> parents = source.getParents();
		for (org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint x : parents) {
			URI uri = EcoreUtil.getURI(x);
			URI alterEgo = uri.trimFileExtension().appendFileExtension(FileExtension.SPECIFICATION_EXTENSION).trimFragment();
			EObject eObject = ResourceHelper.loadPrimaryResource(alterEgo, resourceSet).get(0);
			target.getParents().add((org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint)eObject);
		}
		target.getDependencies().clear();
		EList<org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint> dependencies = source.getDependencies();
		for (org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint x : dependencies) {
			URI uri = EcoreUtil.getURI(x);
			URI alterEgo = uri.trimFileExtension().appendFileExtension(FileExtension.SPECIFICATION_EXTENSION).trimFragment();
			EObject eObject = ResourceHelper.loadPrimaryResource(alterEgo, resourceSet).get(0);
			target.getDependencies().add((org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint)eObject);
		}
	}
	
	public static void setTargetReferences(org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint viewpoint,	Viewpoint target, ResourceSet resourceSet) {
		target.getParents().clear();
		EList<org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint> parents = viewpoint.getParents();
		for (org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint x : parents) {
			URI uri = EcoreUtil.getURI(x);
			URI alterEgo = uri.trimFileExtension().trimFileExtension().appendFileExtension(FileExtension.VPDESC_EXTENSION);
			EObject eObject = resourceSet.getEObject(alterEgo, true);
			target.getParents().add((Viewpoint)eObject);
		}
		target.getDependencies().clear();
		EList<org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint> dependencies = viewpoint.getDependencies();
		for (org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint x : dependencies) {
			URI uri = EcoreUtil.getURI(x);
			URI alterEgo = uri.trimFileExtension().trimFileExtension().appendFileExtension(FileExtension.VPDESC_EXTENSION);
			EObject eObject = resourceSet.getEObject(alterEgo, true);
			target.getDependencies().add((Viewpoint)eObject);
		}
	}
	
	public static void recoverReferences(EObject inputObject, EcoreUtil.Copier copier) {
		TreeIterator<EObject> eAllContents = inputObject.eAllContents();
		while(eAllContents.hasNext()) {
			EObject current = eAllContents.next();
			@SuppressWarnings("rawtypes")
			FeatureIterator featureIterator = (FeatureIterator) current.eCrossReferences().iterator();
			while (featureIterator.hasNext()) {			
				EObject referenced = (EObject) featureIterator.next();
				EObject eObject = (EObject) referenced;				
				if (eObject.eIsProxy()) {
					URI proxyURI = ((org.eclipse.emf.ecore.InternalEObject) eObject).eProxyURI();
					throw new RuntimeException(Messages.ViewpointDSLActions_BackwardSynchronizer_UnresolvedProxy + proxyURI);
				} else {	
					EObject eObject_copy = copier.get(eObject);
					if (eObject_copy!=null) {
						URI uri_copy = EcoreUtil.getURI(eObject_copy);			
						if (uri_copy.isPlatform()==false) {
							URI correctURI = null;
							if (eObject.eClass().getEPackage().getNsURI().equals(MetamodelIDs.VPSERVICES)) {
								//services references rules
								correctURI = GeneratorsUtil.computeURI(inputObject, FileExtension.SERVICES_EXTENSION, uri_copy.toString().replaceFirst("//", "//@services.1"));
							} else {
								//the rest references data
								correctURI = GeneratorsUtil.computeURI(inputObject, FileExtension.DATA_EXTENSION, uri_copy.toString().replaceFirst("/", ""));
							}
							((org.eclipse.emf.ecore.InternalEObject) eObject_copy).eSetProxyURI(correctURI);
						}					
					}					
				}	
			}
		}
	}	
}
