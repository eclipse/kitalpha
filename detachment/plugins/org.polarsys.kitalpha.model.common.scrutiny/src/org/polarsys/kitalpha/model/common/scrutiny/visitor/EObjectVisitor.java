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

package org.polarsys.kitalpha.model.common.scrutiny.visitor;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * @author Matthieu Helleboid
 */
public abstract class EObjectVisitor {

	Set<Resource> visitedResources = new HashSet<Resource>();
	Set<EObject> visitedEObjects = new HashSet<EObject>();

	public void accept(Resource resource) {
		if (resource == null) {
			return;
		}

		if (visitedResources.contains(resource)) {
			return;
		}
		visitedResources.add(resource);

		if (!visit(resource)) {
			return;
		}

		for (Iterator<EObject> i = resource.getAllContents(); i.hasNext();) {
			EObject eObject = i.next();
			internalAccept(eObject);
		}
		
		visited(resource);
	}

	public void accept(EObject eObject) {
		internalAccept(eObject);
		
		for (Iterator<EObject> i = eObject.eAllContents(); i.hasNext();) {
			EObject childEObject = i.next();
			internalAccept(childEObject);
		}
	}

	protected void internalAccept(EObject eObject) {
		if (eObject == null) {
			return;
		}

		if (visitedEObjects.contains(eObject)) {
			return;
		}
		visitedEObjects.add(eObject);

		if (!visit(eObject)) {
			return;
		}

		accept(eObject.eResource());

		for (Iterator<EObject> i = eObject.eCrossReferences().iterator(); i
				.hasNext();) {
			EObject crossReferencedEObject = i.next();
			internalAccept(crossReferencedEObject);
		}
		
		visited(eObject);
	}

	public boolean visit(EObject eObject) {
		return true;
	}
	
	public boolean visit(Resource resource) {
		return true;
	}

	public abstract void visited(EObject eObject);

	public abstract void visited(Resource resource);
}

