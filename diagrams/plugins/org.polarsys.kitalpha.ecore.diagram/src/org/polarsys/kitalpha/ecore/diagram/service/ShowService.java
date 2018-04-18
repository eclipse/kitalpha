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

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.provider.EcoreItemProviderAdapterFactory;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DDiagramElementContainer;
import org.eclipse.sirius.diagram.DNodeList;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.polarsys.kitalpha.ecore.diagram.internal.ShowNeighborCommandHandler;

/**
 * @author ?, Boubekeur Zendagui
 */

public class ShowService {
	
	public Collection<EObject> showReferences(EObject eObject, Collection<EObject> displayedNodes) {
		if (eObject instanceof EClass) 
		{
			EClass root = (EClass) eObject;
			Collection<EObject> result = new UniqueEList<>();
			for (EObject o : root.eCrossReferences()) 
			{
				if (o instanceof EReference) 
				{
					EClassifier owner = ((EReference) o).getEType();
					if (owner instanceof EClass) 
					{
						result.add(o.eContainer());
						result.add(o);
					}
				}
			}

			Session session = SessionManager.INSTANCE.getSession(root);
			ECrossReferenceAdapter eCrossReferenceAdapter = session.getSemanticCrossReferencer();
			Collection<Setting> list = eCrossReferenceAdapter.getInverseReferences(root, true);
			if (list != null && !list.isEmpty()) 
			{
				for (Setting s : list) 
				{
					EObject o = s.getEObject();
					if (o instanceof EReference) 
					{
						EClass e = (EClass) o.eContainer();
						if (e != null) 
						{
							result.add(e);
							result.add(o);
						}
					}
				}
			}
			
			for (EObject current : displayedNodes)
			{
				if (current != null && current instanceof EReference)
				{
					result.remove(current);
				}
			}
			
			return result;
		} 
		else 
		{
			return Collections.emptyList();
		}

	}
	
	/**
	 * 
	 * @param eObject
	 * @param displayedNodes
	 * @return
	 */
	public Collection<EObject> showReferencesRoot(EObject eObject, Collection<EObject> displayedNodes) {
		Collection<EObject> listTemp = showReferences(eObject, displayedNodes);
		Collection<EObject> toReturn = new UniqueEList<>();
		for (EObject current : listTemp) 
		{
			if (current instanceof EReference)
				toReturn.add(current.eContainer());
		}
		return toReturn;
	}
	
	public boolean toolShowPrecondition(EObject context){
		return context instanceof EClass;
	}
	
	
	public Collection<EClass> showNeighbor(EClass eClass, DNodeList selectedClassNode) {
		final Collection<EClass> displayedEClasses = getdisplayedEClasses(selectedClassNode);
		return showNeighbor(eClass, displayedEClasses);
	}
	
	public Collection<EClass> showNeighbor(EClass eClass, Collection<EClass> displayedEClasses) {
		if (eClass != null && displayedEClasses != null) 
		{
			Collection<EClass> result = ShowNeighborCommandHandler.getNeighbor(eClass);
			result.removeAll(displayedEClasses);
			return result;
		} 
		else 
		{
			return Collections.emptyList();
		}
	}
	
	public Collection<EClass> showRelation(EClass eClass, DNodeList selectedClassNode) {
		final Collection<EClass> displayedEClasses = getdisplayedEClasses(selectedClassNode);
		final Collection<EClass> eClassesToShow = showRelation(eClass, displayedEClasses);
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(window.getShell(), new AdapterFactoryLabelProvider(new EcoreItemProviderAdapterFactory()));
		dialog.setMessage("Select elements :");
		dialog.setMultipleSelection(true);
		dialog.setTitle("Selection wizard");
		dialog.setElements(eClassesToShow.toArray());

		eClassesToShow.clear();
		if (dialog.open() == Window.OK) 
		{
			for (Object object : Arrays.asList(dialog.getResult())) 
			{
				eClassesToShow.add((EClass) object);
			}
		}
		return eClassesToShow;
	}
	
	public Collection<EClass> showRelation(EClass eObject, Collection<EClass> displayedNodes) {
		Collection<EClass> result = new UniqueEList<>();
		EClass root = eObject;

		for (EObject o : root.eCrossReferences()) 
		{
			if (o instanceof EClass) 
			{
				result.add((EClass) o);
			} 
			else 
			{
				if (o instanceof EReference) 
				{
					EClassifier owner = ((EReference) o).getEType();
					if (owner instanceof EClass) 
					{
						result.add((EClass) owner);
					}
				}
			}
		}

		result.addAll(root.getEAllSuperTypes());

		Session session = SessionManager.INSTANCE.getSession(root);
		ECrossReferenceAdapter eCrossReferenceAdapter = session.getSemanticCrossReferencer();
		Collection<Setting> list = eCrossReferenceAdapter.getInverseReferences(root, true);
		if (list != null && !list.isEmpty()) 
		{
			for (Setting s : list) 
			{
				EObject o = s.getEObject();
				if (o instanceof EClass) 
				{
					result.add((EClass) o);
				} 
				else 
				{
					if (o instanceof EReference) 
					{
						EClass e = (EClass) o.eContainer();
						if (e != null) 
						{
							result.add(e);
							result.addAll(getAllDescendants(e));
						}
					}
				}
			}
		}

		result.addAll(getAllDescendants(root));

		result.removeAll(displayedNodes);

		return result;

	}
	
	/**
	 * Return all descendants of the given EClass object
	 * 
	 * @param root
	 *            the root object
	 * @return all descendants of the root object or an empty list if it hasn't
	 *         any descendant
	 */
	public Collection<EClass> getAllDescendants(EClass root) {
		Session session = SessionManager.INSTANCE.getSession(root);
		ECrossReferenceAdapter eCrossReferenceAdapter = session.getSemanticCrossReferencer();
		Collection<EClass> local = getDirectDescendants(root, eCrossReferenceAdapter);
		if (!local.isEmpty()) 
		{
			List<EClass> result = new UniqueEList<>();
			result.addAll(local);
			for (EClass e : local) 
			{
				result.addAll(getAllDescendants(e));
			}
			return result;
		} 
		else 
		{
			return Collections.emptyList();
		}
	}
	
	public Collection<EClass> getDirectDescendants(EClass eClass, ECrossReferenceAdapter eCrossReferenceAdapter) {
		Collection<Setting> list = eCrossReferenceAdapter.getInverseReferences(eClass, true);
		if (list != null && !list.isEmpty()) 
		{
			List<EClass> result = new UniqueEList<>();
			for (Setting s : list) 
			{
				if (EcorePackage.Literals.ECLASS__ESUPER_TYPES.equals(s.getEStructuralFeature())) {
					EClass e = (EClass) s.getEObject();
					result.add(e);
				}
			}
			return result;
		} 
		else 
		{
			return Collections.emptyList();
		}

	}
	
	/**
	 * Return all displayed EClasses in the parent diagram of <code> selectedClassNode </code> {@link DNodeList}
	 * @param selectedClassNode selected element in the diagram
	 * @return a {@link Collection} of displayed {@link EClass}es in the parent diagram of <code> selectedClassNode </code> {@link DNodeList} 
	 */
	private Collection<EClass> getdisplayedEClasses(DNodeList selectedClassNode){
		final DDiagram parentDiagram = selectedClassNode.getParentDiagram();
		final EList<DDiagramElementContainer> containers = parentDiagram.getContainers();
		final Collection<EClass> displayedEClasses = new HashSet<>();
		for (DDiagramElementContainer container : containers) 
		{
			if (container.getTarget() instanceof EClass)
			{
				EClass clazz = (EClass) container.getTarget();
				displayedEClasses.add(clazz);
			}
		}
		
		return displayedEClasses;
	}
}
