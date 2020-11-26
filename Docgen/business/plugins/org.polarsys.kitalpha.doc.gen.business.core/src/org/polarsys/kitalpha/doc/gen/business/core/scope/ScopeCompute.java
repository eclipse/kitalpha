/*******************************************************************************
 * Copyright (c) 2015, 2018 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.doc.gen.business.core.scope;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.polarsys.kitalpha.doc.gen.business.core.messages.Messages;

/**
 * @author Boubekeur Zendagui
 */
public class ScopeCompute {
	
	/**
	 * Hidden constrcutor
	 */
	private ScopeCompute(){
	}

	public static List<EObject> computeScope(EObject modelElement, ScopeElementStrategy strategy) throws ScopeException{
		List<EObject> result = new ArrayList<EObject>();
		
		if (modelElement == null) {
			throw new ScopeException(Messages.Scope_Cant_Compute_On_Null_Object);
		}
		
		boolean addParents = false;
		boolean addChildren = false;
		boolean addCurrent = false;
		
		switch (strategy) {
		case ALL:
			addParents = true;
			addChildren = true;
			addCurrent = true;
			break;
		case CHILDREN:
			addChildren = true;
			addCurrent = true;
			break;
		case PARENT:
			addParents = true;
			addCurrent = true;
			break;
		case ELEMENT:
			addCurrent = true;
			break;
		}
		
		if (addParents)
		{
			List<EObject> parentsOf = getParentsOf(modelElement);
			if (! parentsOf.isEmpty()) {
				result.addAll(parentsOf);
			}
		}
		
		if (addCurrent) {
			result.add(modelElement);
		}
		
		if (addChildren)
		{
			List<EObject> childrenOf = getChildrenOf(modelElement);
			if (! childrenOf.isEmpty()) {
				result.addAll(childrenOf);
			}
		}
		
		// Always add model root element if it was not added yet.
		EObject rootContainer = EcoreUtil.getRootContainer(modelElement);
		if (! result.contains(rootContainer))
		{
			result.add(rootContainer);
		}
		
		return result;
	}
	
	/**
	 * Compute all model element children
	 * @param modelElement the current model element
	 * @return all model element children
	 */
	private static List<EObject> getChildrenOf(EObject modelElement){
		List<EObject> result = new ArrayList<EObject>();
		
		TreeIterator<EObject> eAllContents = modelElement.eAllContents();
		while (eAllContents.hasNext()) 
		{
			EObject eObject = eAllContents.next();
			result.add(eObject);
		}
		
		return result;
	}
	
	/**
	 * Compute all parents of a model element
	 * @param modelElement the current model element
	 * @return all model element parents
	 */
	private static List<EObject> getParentsOf(EObject modelElement){
		List<EObject> result = new ArrayList<EObject>();
		
		EObject parent = modelElement.eContainer();
		while (parent != null) 
		{
			result.add(parent);
			parent = parent.eContainer();
		}
		
		return result;
	}
}
