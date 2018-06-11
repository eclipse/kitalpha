/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ecore.diagram.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DDiagramElementContainer;
import org.eclipse.sirius.diagram.DEdge;
import org.eclipse.sirius.diagram.DNodeList;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.diagram.EdgeTarget;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;

/**
 * Services used in Hide/Reveal tools
 */

public class HideRevealToolsService {
	
	public Collection<EObject> computeAllReferencesToHide(EPackage element, DSemanticDiagram diagram) {
		return computeAllIReferences(element, diagram, true);
	}
	
	public Collection<EObject> computeAllReferencesToShow(EPackage element, DSemanticDiagram diagram) {
		return computeAllIReferences(element, diagram, false);
	}
	
	public Collection<EObject> computeAllIReferences(EPackage element, DSemanticDiagram diagram, boolean visible) {
		Collection<EObject> result = new HashSet<>();
		final EList<DDiagramElementContainer> containers = diagram.getContainers();
		for (DDiagramElementContainer dDiagramElementContainer : containers) 
		{
			final EList<DEdge> outgoingEdges = dDiagramElementContainer.getOutgoingEdges();
			for (DEdge dEdge : outgoingEdges) 
			{
				if (dEdge.isVisible() == visible) {
					result.add(dEdge);
				}
			}
			final EList<DEdge> incomingEdges = dDiagramElementContainer.getIncomingEdges();
			for (DEdge dEdge : incomingEdges) 
			{
				if (dEdge.isVisible() == visible) {
					result.add(dEdge);
				}
			}
		}

		return result;
	}
	
	public boolean toolsShowHidePrecondition(EObject eObject, EObject containerView){
		// Case 1 : user select a Focus EClass node or one of its children
		if (eObject instanceof EStructuralFeature || eObject instanceof EClass || eObject instanceof EOperation) {
			return true;
		}
		
		// Case 2 : user select the diagram
		if (eObject instanceof EPackage)
		{
			if (containerView instanceof DSemanticDiagram)
			{
				final EList<DDiagramElementContainer> containers = ((DSemanticDiagram) containerView).getContainers();
				for (DDiagramElementContainer diagramContainer : containers) 
				{
					if (diagramContainer.getTarget() instanceof EClass)
					{
						return true;
					}
				}
			}
		}
		return false;
	}
	
	/**
	 * 
	 * @param any
	 * @param view
	 * @return
	 */
	public Collection<EObject> revealClassReferencesCandidates(EPackage any, DSemanticDiagram view) {
		return getClassReferencesCandidates(view, false);
	}
	
	public Collection<EObject> revealClassReferencesCandidates(EClass any, DNodeList view) {
		return getClassReferencesCandidates(view, false);
	}
	
	/**
	 * 
	 * @param any
	 * @param view
	 * @return
	 */
	
	public Collection<EObject> revealClassReferencesRoot(EPackage any, DSemanticDiagram view) {
		return revealClassReferencesRoot(view);
	}
	
	public Collection<EObject> revealClassReferencesRoot(EClass any, DNodeList view) {
		return revealClassReferencesRoot(view);
	}
	
	public Collection<EObject> revealClassReferencesRoot(DSemanticDecorator view) {
		Collection<EObject> collection = getClassReferencesCandidates(view, false);
		Collection<EObject> collectionToReturn = new ArrayList<EObject>();

		for (EObject currentEObject : collection) 
		{
			if (currentEObject instanceof EReference) 
			{
				if (view instanceof DDiagram) 
				{
					collectionToReturn.add(currentEObject.eContainer());
				} 
				else 
				{
					collectionToReturn.add(currentEObject);
				}
			}
		}
		return collectionToReturn;
	}


	private Collection<EObject> getClassReferencesCandidates(DSemanticDecorator view, boolean visible) {
		Collection<EObject> collection = new ArrayList<EObject>();
		if (view instanceof EdgeTarget) 
		{
			EdgeTarget edgeTarget = (EdgeTarget) view;
			for (DEdge edge : edgeTarget.getIncomingEdges()) 
			{
				if ((visible == edge.isVisible()) && edge.getTarget() instanceof EReference) 
				{
					collection.add(edge.getTarget());
					collection.add(edge.getTarget().eContainer());
				}
			}

			for (DEdge edge : edgeTarget.getOutgoingEdges()) 
			{
				if ((visible == edge.isVisible()) && edge.getTarget() instanceof EReference) 
				{
					collection.add(edge.getTarget());
					collection.add(edge.getTarget().eContainer());
				}
			}
		}
		else
		{
			if (view instanceof DDiagram) 
			{
				DDiagram diagram = (DDiagram) view;
				for (DEdge edge : diagram.getEdges()) 
				{
					if ((visible == edge.isVisible())) 
					{
						collection.add(edge.getTarget());
						collection.add(edge.getTarget().eContainer());
					}
				}
			}
		}
		return collection;
	}

	/**
	 * 
	 * @param any : used only to localize method
	 * @param view
	 * @return
	 */
	
	public Collection<EObject> hideClassReferencesCandidates(EClass any, DNodeList view) {
		return hideClassReferencesCandidates(view);
	}
	
	/**
	 * 
	 * @param any : used only to localize method
	 * @param view
	 * @return
	 */
	public Collection<EObject> hideClassReferencesCandidates(EPackage any, DSemanticDiagram view) {
		return hideClassReferencesCandidates(view);
	}
	
	/**
	 * 
	 * @param view
	 * @return
	 */
	public Collection<EObject> hideClassReferencesCandidates(DSemanticDecorator view) {
		Collection<EObject> collection = new ArrayList<EObject>();
		if (view instanceof EdgeTarget) 
		{
			EdgeTarget edgeTarget = (EdgeTarget) view;
			for (DEdge edge : edgeTarget.getIncomingEdges()) 
			{
				if (edge.isVisible() && edge.getTarget() instanceof EReference) 
				{
					collection.add(edge.getTarget());
					collection.add(edge.getTarget().eContainer());
				}
			}

			for (DEdge edge : edgeTarget.getOutgoingEdges()) 
			{
				if (edge.isVisible() && edge.getTarget() instanceof EReference) 
				{
					collection.add(edge.getTarget());
					collection.add(edge.getTarget().eContainer());
				}
			}
		}
		else if (view instanceof DDiagram) 
		{
			DDiagram diagram = (DDiagram) view;
			for (DEdge edge : diagram.getEdges()) 
			{
				if (edge.isVisible()) 
				{
					collection.add(edge.getTarget());
					collection.add(edge.getTarget().eContainer());
				}
			}
		}
		return collection;
	}
	
	/**
	 * 
	 * @param any : used only to localize method 
	 * @param view
	 * @return
	 */
	public Collection<EObject> hideClassReferencesRoot(EClass any, DNodeList view) {
		return hideClassReferencesRoot(view);
	}
	
	/**
	 * 
	 * @param any : used only to localize method 
	 * @param view
	 * @return
	 */
	public Collection<EObject> hideClassReferencesRoot(EPackage any, DSemanticDiagram view) {
		return hideClassReferencesRoot(view);
	}
	
	/**
	 * 
	 * @param view the view selected by tool
	 * @return  
	 */
	public Collection<EObject> hideClassReferencesRoot(DSemanticDecorator view) {
		Collection<EObject> collection = hideClassReferencesCandidates(view);
		Collection<EObject> collectionToReturn = new ArrayList<EObject>();
		for (EObject currentEObject : collection) 
		{
			if (currentEObject instanceof EReference) 
			{
				if (view instanceof DDiagram) {
					collectionToReturn.add(currentEObject.eContainer());
				} else {
					collectionToReturn.add(currentEObject);
				}
			}
		}
		return collectionToReturn;
	}
	
	public Collection<EObject> getViewElement(DSemanticDiagram view) {
		return getAnyViewElement(view);
	}
	
	public Collection<EObject> getViewElement(DNodeList view) {
		return getAnyViewElement(view);
	}
	
	public Collection<EObject> getAnyViewElement(DSemanticDecorator view) {
		Collection<EObject> collection = new ArrayList<EObject>();
		if (view instanceof EdgeTarget) 
		{
			collection.addAll(((EdgeTarget) view).getIncomingEdges());
			collection.addAll(((EdgeTarget) view).getOutgoingEdges());
		} 
		else
		{
			if (view instanceof DDiagram) {
				collection.addAll(((DDiagram) view).getEdges());
			}
		}
		return collection;
	}
}
