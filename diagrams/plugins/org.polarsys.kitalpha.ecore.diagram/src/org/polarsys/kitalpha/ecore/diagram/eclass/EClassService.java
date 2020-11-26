/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ecore.diagram.eclass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.polarsys.kitalpha.ecore.diagram.service.EcoreService;

public class EClassService {

	private static final int MAX_DEPTH = 1;
	private static EcoreService ecoreServicePlus = new EcoreService();
	
	
	/**
	 * Implementation of EF Import EClass Semantic Candidate Expression (SCE)
	 * @param root
	 * @param eTypeInverse
	 * @param allSuperTypeETypeInverse
	 * @return
	 */
	public Collection<EClass> focusEFImportEClassSCE(EClass root, Set<EReference> eTypeInverse, Set<EReference> allSuperTypeETypeInverse){
		EList<EClass> result = new UniqueEList<EClass>();
		result.addAll(root.getEAllSuperTypes());
		
		final EList<EReference> eAllReferences = root.getEAllReferences();
		for (EReference eReference : eAllReferences) 
		{
			result.add((EClass) eReference.eContainer());
		}
		
		if (eTypeInverse != null && ! eTypeInverse.isEmpty())
		{
			for (EReference eReference : eTypeInverse) 
			{
				result.add((EClass) eReference.eContainer());
			}
		}
		
		if (allSuperTypeETypeInverse != null && ! allSuperTypeETypeInverse.isEmpty())
		{
			for (EReference eReference : allSuperTypeETypeInverse) 
			{
				result.add((EClass) eReference.eContainer());
			}
		}
		
		return result; 
	}
	
	/**
	 * Create {@link EOperation} label to display in the diagram.
	 * 
	 * <p>
	 * <ul>
	 * <li> If <code>eOperation parameter</code> has no name, empty name is replaced by <i> &lt&lt No name &gt&gt</i> </li>
	 * <li> If <code>eOperation parameter</code> has a type, <i> : eType name </i> will be added to the name </li>
	 * </ul>
	 * </p>
	 *  
	 * @param eOperation the {@link EOperation} 
	 * @return an {@link EOperation} label composed of it name and eType if they exists. 
	 */
	public String getEOperationLabel(EOperation eOperation){
		String result = "";
		
		if (eOperation != null )
		{
			final String name = eOperation.getName();
			if (name != null && !name.isEmpty())
			{
				result = name;
			}
			else
			{
				result = "<<No name>>";
			}
			
			final EClassifier eType = eOperation.getEType();
			if (eType != null)
			{
				result += " : " + eType.getName();
			}
		}
		
		return result;
	}
	
	public boolean linksPrecondition(EReference reference, Boolean containment, Boolean autoReference){
		EClass eContainer = (EClass) reference.eContainer();
		boolean result = true;
		result &= (autoReference ? eContainer.equals(reference.getEType()) : ! eContainer.equals(reference.getEType()));
		result &= (containment ? reference.isContainment() : ! reference.isContainment());
		return result;
	}
	
	public Collection<EClass> getFocusNeighbourgClassesSemanticCandidate(EClass root, Set<EObject> referencing) {
		EList<EClass> result = new UniqueEList<EClass>();
		
		/** 1- Handle context EClass super classes **/
		result.addAll(root.getESuperTypes());
		
		/** 2- Handle EClass owned references eTypes **/
		for (EReference eReference :  root.getEReferences()) 
		{
			result.add((EClass) eReference.getEType());
		}
		
		/** 3- Handle context EClass super classes **/
		for (EObject reference_o : referencing) 
		{
			result.add((EClass) reference_o.eContainer());
		}
		
		result.remove(root);
		
		return result;
	}
	
	public Collection<EClass> getNeighbourgClassesSemanticCandidate(EClass root, Set<EObject> referencing, Boolean containment) {
		EList<EClass> result = new UniqueEList<EClass>();
		EList<EReference> eAllReferences = root.getEAllReferences();
		
		/** Handle EClass outgoing references **/
		for (EReference eReference : eAllReferences) 
		{
			if (eReference.isContainment() == containment) {
				result.add((EClass) eReference.getEType());
			}
		}
		
		/** Handle EClass incoming containment references **/
		
		for (EObject eReference : referencing) 
		{
			if (eReference instanceof EReference && eReference.eContainer() != root)
			{
				if (((EReference)eReference).isContainment() == containment) {
					result.add((EClass) eReference.eContainer());
				}
			}
		}
		
		return result;
	}
	
	
	public Collection<EClass> getNeighbourgClasses(EClass root) {
		EList<EClass> eAllSuperTypes = root.getEAllSuperTypes();
		Collection<EClass> descendants = getDescendants(root);
		
		EList<EClass> result = new UniqueEList<EClass>();
		result.addAll(eAllSuperTypes);
		result.addAll(descendants);
		
		return result;
	}
	
	public Collection<EClass> getDescendants(EClass root) {
		return getDescendants(root, MAX_DEPTH);
	}

	public Collection<EClass> getDescendants(EClass root, int depth) {
		if (depth > 0) {
			Session session = SessionManager.INSTANCE.getSession(root);
			ECrossReferenceAdapter eCrossReferenceAdapter = session.getSemanticCrossReferencer();
			Collection<EClass> local = ecoreServicePlus.getDirectDescendants(root, eCrossReferenceAdapter);
			if (local.size() > 0) 
			{
				List<EClass> result = new UniqueEList<EClass>();
				result.addAll(local);
				for (EClass e : local) 
				{
					result.addAll(getDescendants(e, depth - 1));
				}
				return result;
			} 
			else 
			{
				return Collections.emptyList();
			}
		} 
		else 
		{
			return Collections.emptyList();
		}

	}

	public Collection<EClass> getAllEClass(EPackage root) {
		Collection<EClass> result = new UniqueEList<EClass>();
		if (root != null) {
			Resource r = root.eResource();
			ResourceSet bigRS = r.getResourceSet();
			if (r != null) {
				ResourceSet rs = new ResourceSetImpl();
				rs.setPackageRegistry(bigRS.getPackageRegistry());
				rs.setResourceFactoryRegistry(bigRS
						.getResourceFactoryRegistry());
				rs.getResource(r.getURI(), true);
				EcoreUtil.resolveAll(rs);

				Collection<URI> uriList = getURIList(rs);
				for (URI uri : uriList) {
					Resource internalResource = getResource(bigRS, uri);
					if (internalResource != null) {
						EPackage ePackage = (EPackage) internalResource
								.getContents().get(0);
						if (ePackage != null) {
							TreeIterator<EObject> iterator = ePackage
									.eAllContents();
							while (iterator.hasNext()) {
								EObject next = iterator.next();
								if (next instanceof EClass) {
									result.add((EClass) next);
								}
							}
						}
					}
				}
			}
		}

		return result;
	}

	private static Resource getResource(ResourceSet rs, URI uri) {
		for (Resource r : rs.getResources()) {
			if (r.getURI().equals(uri)) {
				return r;
			}
		}
		return null;
	}

	private Collection<URI> getURIList(ResourceSet rs) {
		Collection<URI> result = new ArrayList<URI>();
		for (Resource resource : rs.getResources()) {
			URI uri = resource.getURI();
			if (uri.toString().contains("ecore")
					&& resource.getContents() != null
					&& resource.getContents().size() > 0) {
				result.add(uri);
			}
		}
		return result;
	}
}
