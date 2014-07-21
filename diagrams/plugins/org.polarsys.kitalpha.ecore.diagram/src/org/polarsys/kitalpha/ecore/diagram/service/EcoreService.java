package org.polarsys.kitalpha.ecore.diagram.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.DEdge;
import org.eclipse.sirius.diagram.DNodeList;
import org.eclipse.sirius.diagram.DSemanticDiagram;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;

public class EcoreService {
	
//	public int getNodeWith(EObject context){
//		if (context instanceof EClass)
//		{
//			return ((EClass) context).getEAttributes().isEmpty() ? 10 : -1;
//		}
//		
//		if (context instanceof EEnum)
//		{
//			return ((EEnum) context).getELiterals().isEmpty() ? 10 : -1;
//		}
//		
//		return -1;
//	}

	public EcoreService() {
		super();
	}
	
	/**	
	 * Original Acceleo 2 expression
	 <%
			focusOnEClassSCE(EObject eObject)
			-
			$containerView.eContents().filter("DNodeList").target)[self != null].nMinimize
		%>
	*/
	
	public Collection<EClass> insertEClassSelectionWizard(EObject eObject, EObject containerView){
		Collection<EClass> focusOnEClass = focusOnEClassSCE(eObject);
		DSemanticDiagram diagram = (DSemanticDiagram) containerView;
		Predicate<EObject> withEClassTarget = new Predicate<EObject>(){
			@Override
			public boolean apply(EObject arg0) {
				if (arg0 instanceof DNodeList)
				{
					DNodeList nodeList = ((DNodeList)arg0);
					final EObject target = nodeList.getTarget();
					return target != null && target instanceof EClass;
				}
				else
					return false;
			}
		};
		
		final Iterator<EObject> filter = Iterators.filter(diagram.eContents().iterator(), withEClassTarget);
		final ArrayList<EObject> availableTargets = Lists.newArrayList(filter);
		for (EObject target : availableTargets) 
		{
			final DNodeList dNodeList = (DNodeList) target;
			focusOnEClass.remove(dNodeList.getTarget());
		}
		return focusOnEClass;
	}
	
	/**
	 * Original Acceleo 2 expression
		<%
		(
			(
				(
					eContents().filter("EClass") 
					+ 
					eContents().filter("EClass").eAllOperations.eType.filter("EClass")
				).nPut("class1").nGet("class1") 
				+ 	
				(
					nGet("class1").eAllStructuralFeatures.filter("EReference").eType 
					+ 	
					nGet("class1").eAllOperations.eType.filter("EClass")
				).nMinimize().nPut("class2").nGet("class2") 
				+ 	
				(
					nGet("class2").eAllStructuralFeatures.filter("EReference").eType 
					+ 	
					nGet("class2").eAllOperations.eType.filter("EClass")
				).nMinimize().nPut("class3").nGet("class3") 
				+ 	
				(
					nGet("class3").eAllStructuralFeatures.filter("EReference").eType 
					+ 
					nGet("class3").eAllOperations.eType.filter("EClass")
				).nMinimize()
			).nMinimize.nPut("maliste").nGet("maliste") 
			+  
			nGet("maliste").eAllSuperTypes 
			+ 
			nGet("maliste").ePackage.nMinimize().eContents().filter("EClass")
		).nMinimize%>
	*/
	public Collection<EClass> focusOnEClassSCE(EObject eObject){
		EPackage ePackage = (EPackage) eObject;
		EList<EClass> result = new UniqueEList<EClass>();
		/** 1- handle ePackage EClasses **/
		final Iterator<EClass> eClasses = Iterators.filter(ePackage.eContents().iterator(), EClass.class);
		while (eClasses.hasNext())
		{
			final EClass curentEClass = eClasses.next();
			result.add(curentEClass);
			final EList<EOperation> eAllOperations = curentEClass.getEAllOperations();
			for (EOperation eOperation : eAllOperations) 
			{
				if (eOperation.getEType() instanceof EClass )
					result.add((EClass) eOperation.getEType());
			}
		}
		
		// Handle related EClasses 3 times. Why ?
		final List<EClass> handleReferencedEClasses1 = handleReferencedEClasses(result);
		result.addAll(handleReferencedEClasses1);
		final List<EClass> handleReferencedEClasses2 = handleReferencedEClasses(result);
		result.addAll(handleReferencedEClasses2);
		final List<EClass> handleReferencedEClasses3 = handleReferencedEClasses(result);
		result.addAll(handleReferencedEClasses3);
		
		List<EClass> toAdd = new UniqueEList<EClass>();
		for (EClass eClass : result) 
		{
			final EList<EClass> eAllSuperTypes = eClass.getEAllSuperTypes();
			if (eAllSuperTypes.isEmpty() == false)
				toAdd.addAll(eAllSuperTypes);

			if (eClass.eIsProxy())
			{
				final URI uri = EcoreUtil.getURI(eClass);
				final URI new_uri = uri.trimFragment();
				eObject.eResource().getResourceSet().getResource(new_uri, true);
				eClass = (EClass) eObject.eResource().getResourceSet().getEObject(uri, true);
			}
			
			final EPackage eClassPackage = eClass.getEPackage();
			final EList<EClassifier> eClassifiers = eClassPackage.getEClassifiers();
			if (eClassifiers.isEmpty() == false)
			{
				final Iterator<EClass> filter = Iterators.filter(eClassifiers.iterator(), EClass.class);
				toAdd.addAll(Lists.newArrayList(filter));
			}
		}
		result.addAll(toAdd);
		return result;
	}
	
	/**
	 * 
	 * @param eObject
	 * @return
	 */
	public Collection<EEnum> focusOnEENumSCE(EObject eObject){
		Collection<EEnum> result = new UniqueEList<EEnum>();
		// To get every EClass that can be concerned by diagram context
		// FIXME: Note that eContents().filter("EClass").eAllStructuralFeatures.filter("EReference").eType  is not included
		Collection<EClass> focusOnEClass = focusOnEClassSCE(eObject);
		for (EClass eClass : focusOnEClass) 
		{
			final EPackage ePackage = eClass.getEPackage();
			final UnmodifiableIterator<EEnum> ePackageEEnum = Iterators.filter(ePackage.eContents().iterator(), EEnum.class);
			final ArrayList<EEnum> eEnums = Lists.newArrayList(ePackageEEnum);
			result.addAll(eEnums);
		}
		return result;
	}
	
	public Collection<EEnum> insertEEnumSelectionWizard(EPackage eObject, DSemanticDiagram containerView){
		Collection<EEnum> focusOnEEnum = focusOnEENumSCE(eObject);
		DSemanticDiagram diagram = (DSemanticDiagram) containerView;
		Predicate<EObject> withEEnumTarget = new Predicate<EObject>(){
			@Override
			public boolean apply(EObject arg0) {
				if (arg0 instanceof DNodeList)
				{
					DNodeList nodeList = ((DNodeList)arg0);
					final EObject target = nodeList.getTarget();
					return target != null && target instanceof EEnum;
				}
				else
					return false;
			}
		};
		
		final Iterator<EObject> filter = Iterators.filter(diagram.eContents().iterator(), withEEnumTarget);
		final ArrayList<EObject> availableTargets = Lists.newArrayList(filter);
		for (EObject target : availableTargets) 
		{
			final DNodeList dNodeList = (DNodeList) target;
			focusOnEEnum.remove(dNodeList.getTarget());
		}
		return focusOnEEnum;
	}
	
	
	/**
	 * @param eClasses {@link EClass}es to handle
	 * @return related {@link EClass} {@link EList}
	 */
	private List<EClass> handleReferencedEClasses(EList<EClass> eClasses){
		List<EClass> result = new UniqueEList<EClass>();
		for (EClass eClass : eClasses) 
		{
			// Handle EReferences
			final Iterator<EReference> references = Iterators.filter(eClass.getEAllStructuralFeatures().iterator(), EReference.class);
			while (references.hasNext()) 
			{
				EReference eReference = (EReference) references.next();
				if ( eReference.getEType() != null)
				result.add((EClass) eReference.getEType());
			}
			
			// Handle EOperation types. 
			// FIXME: Must we Handle EOperation parameters type ?
			final EList<EOperation> eAllOperations = eClass.getEAllOperations();
			if (eAllOperations != null && eAllOperations.size() > 0)
			{
				for(EOperation eOperation : eAllOperations)
				{
					if (eOperation.getEType() != null && eOperation.getEType() instanceof EClass)
						result.add((EClass)eOperation.getEType());
				}
			}
		
		}
		return result;
	}
	
	public Collection<EOperation> findAllEOperation(EClass eClass) {
		List<EOperation> local = new ArrayList<EOperation>(eClass.getEAllOperations());
//		local.removeAll(eClass.getEAttributes());
		Collections.sort(local, new MyEOperationComparator());
		return local;
	}
	
	/*************************************************************************************************/
	
	
	public boolean isImplemented(EClass subClass, DEdge dEdge) {
		if (dEdge != null && dEdge.getTargetNode() != null) 
		{
			EClass parentClass = (EClass) ((DDiagramElement) dEdge.getTargetNode()).getTarget();
			return isImplemented(subClass, parentClass);
		} 
		else 
		{
			return false;
		}
	}

	private boolean isImplemented(EClass subClass, EClass parentClass) {
		if (subClass != null && parentClass != null) 
		{
			Collection<EClass> sp = subClass.getESuperTypes();
			if (sp != null && sp.size() > 0) 
			{
				EClass firstSP = subClass.getESuperTypes().get(0);
				if (firstSP != null) 
				{
					if (firstSP.equals(parentClass)) 
						return true;
					else 
						return isImplemented(firstSP, parentClass);
				} 
				else 
				{
					return false;
				}
			} 
			else 
			{
				return false;
			}
		} 
		else 
		{
			return false;
		}
	}
	/**
	 * Return an inheritance path from the source object to target object
	 * 
	 * @param source
	 *            the source object *
	 * @param target
	 *            the target object
	 * @return an inheritance path from the source object to target object or an
	 *         empty list when there is no path
	 */
	public Collection<EClass> superTypesLabel(EClass source, EClass destination) {
		if (source != null && destination != null) 
		{
			List<EClass> result = new UniqueEList<EClass>();
			for (EClass sp : source.getEAllSuperTypes()) 
			{
				if (sp.getEAllSuperTypes().contains(destination))
					result.add(sp);
			}
			return result;
		} 
		else 
		{
			return Collections.emptyList();
		}

	}
	
	/**
	 * Return all nearest displayed super types of the given EClass object
	 * 
	 * @param root
	 *            the root object
	 * 
	 * @param nodeList
	 *            the displayed objects
	 * 
	 * @return all nearest displayed super types of the root object or an empty
	 *         list if there is none
	 * 
	 */
	public Collection<EClass> nearestSuperTypes(EObject root, Collection<EObject> nodeList) {
		if (root instanceof EClass) 
		{
			EClass rootClass = (EClass) root;

			// Examining only EClass objects
			Collection<EClass> eClassList = filter(nodeList);

			// Find the intersection of the root's supertypes and the displayed
			// objects
			Collection<EClass> superTypes = new UniqueEList<EClass>(rootClass.getEAllSuperTypes());
			superTypes.retainAll(eClassList);

			// Return the result(s)
			if (superTypes.size() <= 1) 
				return superTypes;
			else 
				return nearestSuperTypes(superTypes);
		} 
		else 
		{
			return Collections.emptyList();
		}
	}

	private Collection<EClass> nearestSuperTypes(Collection<EClass> superTypes) {
		MyEClassComparator myComparator = new MyEClassComparator();
		List<EClass> local = new ArrayList<EClass>(superTypes);
		// Sort classes following the hierarchy order
		Collections.sort(local, myComparator);
		EClass first = local.get(0);

		// Filtering to get the final result
		List<EClass> result = new UniqueEList<EClass>();
		for (EClass c : local) 
		{
			if (myComparator.compare(first, c) == 0) 
				result.add(c);
		}

		if (result.size() > 0) 
		{
			local = new ArrayList<EClass>();
			for (EClass x : result) 
			{
				for (EClass y : result) 
				{
					if (myComparator.compare(x, y) < 0)
						local.add(y);
				}
			}
			result.removeAll(local);
			return result;
		} 
		else 
		{
			return Collections.emptyList();
		}
	}
	/**
	 * Return the potential ERefences
	 * 
	 * @param EPackage
	 *            the ePackage object
	 * @param nodeList
	 *            the list of displayed objects in the diagram
	 * 
	 * @return the potential ERefences
	 */
	public Collection<EReference> focusedEReferences(EReference eReference, Collection<EObject> nodeList) {
		final EPackage ePackage = eReference.getEContainingClass().getEPackage();
		return focusedEReferences(ePackage, nodeList);
	}
	
	
	public Collection<EReference> focusedEReferences(EPackage ePackage, Collection<EObject> nodeList) {
		Collection<EClass> eClassList = filter(nodeList);
		List<EClass> potentialNodes = new UniqueEList<EClass>(eClassList);
		for (EObject o : eClassList) 
		{
			potentialNodes.addAll(((EClass) o).getEAllSuperTypes());
		}

		List<EReference> result = new UniqueEList<EReference>();
		for (EClass o : potentialNodes) 
		{
			result.addAll(o.getEReferences());
		}
		return result;
	}
	
	/**
	 * Return a specific label of the given EReference object
	 * 
	 * @param eReference
	 *            the EReference object
	 * @param nodeList
	 *            the list of displayed objects in the diagram
	 * 
	 * @return the specific label of the given EReference object
	 */
	public String computeEReferenceLabel(EReference eReference, Collection<EObject> nodeList) {
		StringBuilder s = new StringBuilder();
		s.append(eReference.getName());
		EObject source = eReference.eContainer();
		if (source instanceof EClass && nodeList.contains(source) == false) 
		{
			s.append(" : ");
			s.append(((EClass) source).getName());
		}
		return s.toString();
	}
	
	/**
	 * Return the potential EAttributes which can be displayed within the given
	 * EClass object
	 * 
	 * @param eClass
	 *            the EClass object
	 * @param nodeList
	 *            the list of displayed objects in the diagram
	 * 
	 * @return the potential EAttributes which can be displayed within the given
	 *         EClass object
	 */
	public Collection<EAttribute> findAllEAtribute(EClass eClass) {
		List<EAttribute> local = new ArrayList<EAttribute>(eClass.getEAllAttributes());
//		local.removeAll(eClass.getEAttributes());
		Collections.sort(local, new MyEAttributeComparator());
		return local;
	}
	
	/**
	 * This helper class is needed to sort EAttribute objects following the
	 * hierarchy relationship
	 */
	public static class MyEAttributeComparator implements
			Comparator<EAttribute> {
		public static MyEClassComparator myEClassComparator = new MyEClassComparator();

		public int compare(EAttribute o1, EAttribute o2) {
			return myEClassComparator.compare((EClass) o1.eContainer(), (EClass) o2.eContainer());
		}

	}
	
	/**
	 * This helper class is needed to sort EAttribute objects following the
	 * hierarchy relationship
	 */
	public static class MyEOperationComparator implements
			Comparator<EOperation> {
		public static MyEClassComparator myEClassComparator = new MyEClassComparator();

		public int compare(EOperation o1, EOperation o2) {
			return myEClassComparator.compare((EClass) o1.eContainer(), (EClass) o2.eContainer());
		}

	}
	
	/**
	 * This helper class is needed to sort EClass objects following the
	 * hierarchy relationship
	 */
	public static class MyEClassComparator implements Comparator<EClass> {

		public int compare(EClass o1, EClass o2) {
			if (o1.getEAllSuperTypes().contains(o2))
				return -1;
			
			if (o2.getEAllSuperTypes().contains(o1))
				return 1;
			
			return 0;
		}

	}
	
	/**
	 * This method checks whether an given EClass object can display an
	 * EAttribute inherited from a super type.
	 * 
	 * @param eAttribute
	 *            the EAttribute object
	 * @param parent
	 *            the potential EClass object
	 * @param nodeList
	 *            the list of displayed objects in the diagram
	 * 
	 * @return whether an given EClass object can display an EAttribute
	 *         inherited from a super type.
	 */

	public boolean hasNotDisplayedSuperType(EClass eClass, EObject parent, Collection<EObject> nodeList) {
		if (eClass != null) 
			return mostAbstractObject(eClass, nodeList).contains(parent);
		else 
			return false;
	}
	
//	public boolean hasNotDisplayedSuperType(EAttribute eAttribute, DSemanticDecorator container, DSemanticDiagram diagram) {
//		EObject target = container.getTarget();
//		Collection<EObject> nodeList = diagram.getNodes();
//		
//	
//		return hasNotDisplayedSuperType(eAttribute.getEContainingClass(), container, nodeList);
//	}
	
	/**
	 * Return the most abstract displayed descendants of the given EClass object
	 * 
	 * @param root
	 *            the root object
	 * @param nodeList
	 *            the list of displayed objects in the diagram
	 * 
	 * @return the most abstract displayed descendants of the root object or an
	 *         empty list if there is none descendant in the diagram
	 */
	
	public Collection<EClass> mostAbstractObject(EReference eReference, Collection<EObject> nodeList) {
		final EClass containerClass = eReference.getEContainingClass();
		return mostAbstractObject(containerClass, nodeList);
	}
	
	public Collection<EClass> mostAbstractObject(EClass root, Collection<EObject> nodeList) {
		Collection<EClass> eClassList = filter(nodeList);

		// If the root is in the diagram
		List<EClass> result = new UniqueEList<EClass>();
		if (eClassList.contains(root)) 
		{
			result.add(root);
			return result;
		}

		// If the root is not in the diagram
		// First we search all potential nodes by 2 conditions :
		// 1. Being in the diagram
		// 2. Having root as a super type
		List<EClass> potentialList = new UniqueEList<EClass>();
		for (EClass node : eClassList) 
		{
			if (node.getEAllSuperTypes().contains(root))
				potentialList.add(node);
		}
		// If there is only one or none potential node
		if (potentialList.size() < 2) 
			return potentialList;
		
		// If there is more than one potential node
		Session session = SessionManager.INSTANCE.getSession(root);
		ECrossReferenceAdapter eCrossReferenceAdapter = session.getSemanticCrossReferencer();
		// Searching recursively
		Collection<EClass> local = mostAbstractObject(root, potentialList, eCrossReferenceAdapter);

		return local;
	}
	
	/**
	 * Compute the most abstract object
	 * @param root
	 * @param potentialList
	 * @param eCrossReferenceAdapter
	 * @return
	 */
	private Collection<EClass> mostAbstractObject(EClass root, Collection<EClass> potentialList, ECrossReferenceAdapter eCrossReferenceAdapter) {
		List<EClass> result = new UniqueEList<EClass>();
		Collection<EClass> collection = getDirectDescendants(root, eCrossReferenceAdapter);

		Collection<EClass> rest = new UniqueEList<EClass>();
		for (EClass c : collection) 
		{
			if (potentialList.contains(c)) 
				result.add(c);
			else 
				rest.add(c);
		}
		
		if (rest.size() == 0 && result.size() > 0) 
		{
			return result;
		} 
		else 
		{
			potentialList.removeAll(result);
			if (potentialList.size() > 0) 
			{
				for (EClass c : rest) 
				{
					result.addAll(mostAbstractObject(c, new ArrayList<EObject>(potentialList)));
				}
			}
		}
		return result;
	}
	
	/**
	 * Compute direct descendants 
	 * @param eClass
	 * @param eCrossReferenceAdapter
	 * @return
	 */
	public Collection<EClass> getDirectDescendants(EClass eClass, ECrossReferenceAdapter eCrossReferenceAdapter) {
		Collection<Setting> list = eCrossReferenceAdapter.getInverseReferences(eClass, true);
		if (list != null && list.size() > 0) 
		{
			List<EClass> result = new UniqueEList<EClass>();
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
	 * Keep only EClasses
	 * @param collection
	 * @return
	 */
	private Collection<EClass> filter(Collection<EObject> collection) {
		List<EClass> result = new UniqueEList<EClass>();
		for (EObject o : collection) 
		{
			if (o instanceof EClass)
				result.add((EClass) o);
		}
		return result;
	}
	
}
