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
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.scoping;

import java.util.Calendar;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.diagram.description.AbstractNodeMapping;
import org.eclipse.sirius.diagram.description.ContainerMapping;
import org.eclipse.sirius.diagram.description.DiagramDescription;
import org.eclipse.sirius.diagram.description.EdgeMapping;
import org.eclipse.sirius.diagram.description.NodeMapping;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.AbstractAssociation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.AbstractClass;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.ExternalAssociation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.ExternalClass;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.LocalAssociation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.LocalClass;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractSuperClass;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ExternalSuperClass;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.LocalSuperClass;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.AbstractNode;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.BorderedNode;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Container;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.ContainerChildren;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Diagram;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramExtension;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.MappingSet;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Node;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.NodeChildren;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.NodeDomainElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.registry.DataWorkspaceEPackage;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;


/**
 * 
 * @author Faycal Abka
 *
 */
public class VpDiagramHelper {
	
	
	
	private static LoadingCache<EClass, List<EClass>> hierarchyCache = CacheBuilder.newBuilder()
			.maximumSize(1000)
			.expireAfterWrite(1, TimeUnit.DAYS)
			.build(new CacheLoader<EClass, List<EClass>>()
					{

						@Override
						public List<EClass> load(EClass arg0) throws Exception {
							return CollectAllSuperTypes(arg0);
						}
				
					});
	
	
	/**
	 * Get all super types of of localClass
	 * @param localClass
	 * @return Collection of super classes
	 */
	public static Collection<EClass> getExternalSuperClassEClasses(
			Class localClass) {
		
		Collection<EClass> superEClasses = new UniqueEList<EClass>();
		
		EList<AbstractSuperClass> inheritences = localClass.getInheritences();
		
		
		for (AbstractSuperClass superClass : inheritences) {
			if (superClass instanceof ExternalSuperClass){
				ExternalSuperClass esc = (ExternalSuperClass)superClass;
				superEClasses.add(esc.getSuperClass());
			}
			if (superClass instanceof LocalSuperClass){
				LocalSuperClass lsc = (LocalSuperClass)superClass;
				superEClasses.addAll(getExternalSuperClassEClasses(lsc.getSuperClass()));
			}
		}
		
		EList<EClass> extendEClasses = localClass.getExtends();
		
		for (EClass eClass : extendEClasses) {
			EcoreUtil.resolveAll(eClass);
			superEClasses.add(eClass);
			superEClasses.addAll(eClass.getEAllSuperTypes());
		}
		
		return superEClasses;
	}
	
	
	/**
	 * Get node domain element of an external or local association
	 * @param association
	 * @return NodeDomainElement
	 */
	public static NodeDomainElement getNodeDomainElementFrom(
			AbstractAssociation association) {
		
		if (association instanceof ExternalAssociation){
			ExternalAssociation externalAssociation = (ExternalAssociation)association;
			EObject eContainer = externalAssociation.eContainer();

			if (eContainer instanceof NodeDomainElement){
				return ((NodeDomainElement)eContainer);
			}
		}
		
		if (association instanceof LocalAssociation){
			LocalAssociation localAssociation = (LocalAssociation)association;
			EObject eContainer = localAssociation.eContainer();

			if (eContainer instanceof NodeDomainElement){
				return ((NodeDomainElement)eContainer);
			}
		}
		return null;
	}
	

	/**
	 * Filter references in allRefernceContainerDomain with type
	 * @param allReferencesContainerDomain all references of container domain class
	 * @param type
	 * @return Collection of references which they type is type
	 */
	public static EList<EReference> filterReferenceWithType(
			EList<EReference> allReferencesContainerDomain, EClass type) {

		EList<EReference> filtredReferences = new UniqueEList<EReference>();

		List<EClass> superTypesOfType;
		try {
			superTypesOfType = hierarchyCache.get(type);

			if (superTypesOfType == null || superTypesOfType.isEmpty())
			{
				superTypesOfType = CollectAllSuperTypes(type);
			}

			for (EReference eReference : allReferencesContainerDomain) {
				EClass eRefType = (EClass) eReference.getEType();

				if (type == eReference.getEType()){
					filtredReferences.add(eReference);
					continue;
				}

				try {
					List<EClass> superTypesOfRefType = hierarchyCache.get(eRefType);

					if (superTypesOfRefType == null || superTypesOfRefType.isEmpty())
					{
						superTypesOfRefType = CollectAllSuperTypes(eRefType);
					}

					if (superTypesOfType.contains(eRefType)) {
						filtredReferences.add(eReference);
					}


					for (EClass eClass : superTypesOfRefType) {

						for (EClass eClass2 : superTypesOfType) {
							if (eClass.getName().equals(eClass2.getName())){
								filtredReferences.add(eReference);
							}
						}
					}
				} catch (ExecutionException e) {
					return filtredReferences;
				}

			}
		} catch (ExecutionException e1) {
			e1.printStackTrace();
		}
		return filtredReferences;
	}
	
	
	/**
	 * Collect all super types of type
	 * @param type 
	 * @return List of Super types of type EClasses
	 */
	private static EList<EClass> CollectAllSuperTypes(EClass type) {
		EList<EClass> result = new UniqueEList<EClass>();
		
		EList<EClass> superTypes = type.getEAllSuperTypes();
		
		result.addAll(superTypes);
		
		for (EClass eClass : superTypes) {
			collectHierarchyTypes(eClass, result);
		}
		return result;
	}

	
	/**
	 * Collect superTypes of eClass recursively
	 * @param eClass
	 * @param result contains all super types of eClass
	 */
	private static void collectHierarchyTypes(EClass eClass,
			EList<EClass> result) {
		
		try {
			List<EClass> superTypes = hierarchyCache.get(eClass);
			if (superTypes != null && !superTypes.isEmpty())
			{
				result.addAll(superTypes);
			} else {
				superTypes = eClass.getEAllSuperTypes();
				result.addAll(superTypes);
				
				for (EClass eClass2 : superTypes) {
					collectHierarchyTypes(eClass2, result);
				}
			}
			
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}

	
	/**
	 * Get the domain class
	 * @param nde
	 * @return AbstractClass
	 */
	public static AbstractClass getDomain_class(NodeDomainElement nde){
		
		if (nde != null) {
			return nde.getDomain_Class();
		}
		
		return null;
	}

	
	/**
	 * Get domain context of container of the container of NodeDomainElement nde.
	 * @param nde
	 * @return The domain context EClass
	 */
	public static EClass getDomainContainerOfContainerOfElementExternal(NodeDomainElement nde){
		if (nde == null) {
			return null;
		}

		EObject container = nde.eContainer().eContainer();

		if (container instanceof Diagram){
			Diagram diagram = (Diagram)container;
			AbstractClass abstClass = diagram.getThe_domain().getThe_domain();
			if (abstClass instanceof ExternalClass){
				return ((ExternalClass)abstClass).getClass_();
			}

		}

		if (container instanceof AbstractNode){
			
			EClass result = getAbstractNodeDomainEClass(container);
			
			if (result != null){
				return result;
			}
			
			NodeDomainElement nde2 = ((AbstractNode)container).getThe_domain();
			AbstractClass abstClass = VpDiagramHelper.getDomain_class(nde2);
			if (abstClass instanceof ExternalClass){
				return ((ExternalClass)abstClass).getClass_();
			}
		}

		if (container instanceof ContainerChildren){
			EObject childrenContainer = container.eContainer();
			EClass result = getAbstractNodeDomainEClass(childrenContainer);
			
			if (result != null){
				return result;
			}
		}
		
		if (container instanceof NodeChildren){
			NodeChildren nc = (NodeChildren)container;
			Node node = (Node)nc.eContainer();
			
			EClass result = getAbstractNodeDomainEClass(node);
			if (result != null){
				return result;
			}
		}

		if (container instanceof MappingSet){
			EObject mappingSetContainer = container.eContainer();
			if (mappingSetContainer instanceof Diagram){
				Diagram diagram = (Diagram)mappingSetContainer;
				AbstractClass abstClass = diagram.getThe_domain().getThe_domain();
				if (abstClass instanceof ExternalClass){
					return ((ExternalClass)abstClass).getClass_();
				}
			}
			
			if (mappingSetContainer instanceof DiagramExtension){
				DiagramExtension diagramExtension = (DiagramExtension)mappingSetContainer;
				EClass result = getAbstractNodeDomainEClass(diagramExtension);
				
				if (result != null){
					return result;
				}
			}
		}
		return null;
	}
	
	
	/*
	 * FIXME this is ugly method; dispach this on several methods
	 */
	private static EClass getAbstractNodeDomainEClass(EObject container){
		long t1 = Calendar.getInstance().getTimeInMillis();
		if (container instanceof Node){
			Node node = ((Node)container);
			NodeMapping nodeImport = node.getImports();
			
			if (nodeImport != null){
				String importedDomainEclass = nodeImport.getDomainClass();
				
				if (importedDomainEclass != null && !importedDomainEclass.isEmpty())
				{ 
					return getImportedEClass(importedDomainEclass);
				}
			}
			
			NodeDomainElement nde2 = ((Node)container).getThe_domain();
			AbstractClass abstClass = VpDiagramHelper.getDomain_class(nde2);
			if (abstClass instanceof ExternalClass){
				return ((ExternalClass)abstClass).getClass_();
			}
		}

		if (container instanceof Container){
			NodeDomainElement nde2 = ((Container)container).getThe_domain();
			if (nde2 == null){
				Container c = ((Container)container);
				
				ContainerMapping containerMapping = c.getImports();
				
				if (containerMapping != null){
					String importedDomainClassName = containerMapping.getDomainClass();
					return getImportedEClass(importedDomainClassName);
				}
			}

			AbstractClass abstClass = VpDiagramHelper.getDomain_class(nde2);
			if (abstClass instanceof ExternalClass){
				return ((ExternalClass)abstClass).getClass_();
			}
		}

		if (container instanceof BorderedNode){
			BorderedNode borderedNode = (BorderedNode)container;
			
			NodeMapping nodeMapping = borderedNode.getImports();
			
			if (nodeMapping != null){
				String importedDomainClassName = nodeMapping.getDomainClass();
				return getImportedEClass(importedDomainClassName);
			}
			
			NodeDomainElement nde2 = ((BorderedNode)container).getThe_domain();
			AbstractClass abstClass = VpDiagramHelper.getDomain_class(nde2);
			if (abstClass instanceof ExternalClass){
				return ((ExternalClass)abstClass).getClass_();
			}
		}
		
		if (container instanceof DiagramExtension){
			DiagramExtension diagramExtension = (DiagramExtension)container;
			String domainClass =diagramExtension.getExtented_diagram().getDomainClass();
			if (domainClass != null && !domainClass.isEmpty()){
				return getImportedEClass(domainClass);
			}
		}
		
		return null;
	}
	
	
	private static EClass getImportedEClass(String importedDomainClassName) {
		String tmp = null;
		
		if (importedDomainClassName == null) {
			return null;
		}
		
		if (importedDomainClassName.contains(".")){
			tmp = importedDomainClassName.substring(importedDomainClassName.lastIndexOf(".") + 1);
		} else {
			tmp = importedDomainClassName;
		}

		Collection<Object> ePackageRegistry = DataWorkspaceEPackage.INSTANCE.values();

		for (Object object : ePackageRegistry) {
			if (object instanceof EPackage){
				EPackage ePackage = (EPackage)object;

				EClass eClass = (EClass) ePackage.getEClassifier(tmp);
				//return the first class found
				if (eClass != null){
					return eClass;
				}

			}
		}
		return null;
	}

	
	private static boolean checkImports(EObject container){
		
		if (container instanceof Node){
			NodeMapping nodeMappings = ((Node)container).getImports();
			return (nodeMappings != null && nodeMappings.getDomainClass() != null 
					&& !nodeMappings.getDomainClass().isEmpty());
		}
		
		if (container instanceof Container){
			ContainerMapping containerMapping = ((Container)container).getImports();
			
			return (containerMapping != null && containerMapping.getDomainClass() != null 
					&& !containerMapping.getDomainClass().isEmpty());
		}
		
		if (container instanceof BorderedNode){
			NodeMapping nodeMappings = ((BorderedNode)container).getImports();
			
			return (nodeMappings != null && nodeMappings.getDomainClass() != null 
					&& !nodeMappings.getDomainClass().isEmpty());
		}
		
		return false;
	}
	
	

	public static AbstractClass getDomainContainerOfContainerOfElement(NodeDomainElement nde){
		
		if (nde == null) {
			return null;
		}
		
		EObject container = nde.eContainer().eContainer();
		
		if (container instanceof Diagram){
			Diagram diagram = (Diagram)container;
			
			return diagram.getThe_domain().getThe_domain();
		}
		
		if (container instanceof AbstractNode){
			
			if (checkImports(container)){
				return null;
			}
			
			NodeDomainElement nde2 = ((AbstractNode)container).getThe_domain();
			
			return VpDiagramHelper.getDomain_class(nde2);
		}
		
		if (container instanceof ContainerChildren){
			EObject childrenContainer = container.eContainer();
			
			if (checkImports(container)){
				return null;
			}
			
			if (childrenContainer instanceof Node){
				
				NodeDomainElement nde2 = ((Node)childrenContainer).getThe_domain();
				
				return VpDiagramHelper.getDomain_class(nde2);
			}
			
			if (childrenContainer instanceof Container){
				NodeDomainElement nde2 = ((Container)childrenContainer).getThe_domain();
				
				return VpDiagramHelper.getDomain_class(nde2);
			}
			
			if (childrenContainer instanceof BorderedNode){
				NodeDomainElement nde2 = ((BorderedNode)childrenContainer).getThe_domain();
				
				return VpDiagramHelper.getDomain_class(nde2);
			}
		}
		
		if (container instanceof NodeChildren){
			NodeChildren nc = (NodeChildren)container;
			Node node = (Node)nc.eContainer();
			
			if (checkImports(node)){
				return null;
			}

			return node.getThe_domain().getDomain_Class();
		}
		
		if (container instanceof MappingSet){
			EObject mappingSetContainer = container.eContainer();
			if (mappingSetContainer instanceof Diagram){
				Diagram diagram = (Diagram)mappingSetContainer;
				
				return diagram.getThe_domain().getThe_domain();
			}
		}
		
		return null;
	}
	
	
	/**
	 * Filter refrences in allContainerReferences which they type is eClazz
	 * @param allContainerReferences
	 * @param eClazz
	 */
	public static void filterEReferencesWithType(
			Collection<EReference> allContainerReferences, EClass eClazz) {
		
		EList<EClass> superTypes = eClazz.getEAllSuperTypes();
		
		Iterator<EReference> it = allContainerReferences.iterator();
		
		while (it.hasNext()){
			EReference ref = it.next();
			if (!superTypes.contains(ref.getEType())){
				it.remove();
			}
		}
	}
	
	
	/**
	 * Return all local references of containerLocalDomain_class
	 * @param containerLocalDomainClass
	 * @return all local references of containerLocalDomain_class
	 */
	public static Collection<EReference> getLocalEReferences(
			LocalClass containerLocalDomainClass) {
		
		
		Collection<EReference> currentEReferences = getCurrentEReferences(containerLocalDomainClass.getClass_());
		
		EList<AbstractSuperClass> superClasses = containerLocalDomainClass.getClass_().getInheritences();
		
		for (AbstractSuperClass abstractSuperClass : superClasses) {
			if (abstractSuperClass instanceof ExternalSuperClass){
				ExternalSuperClass ec = (ExternalSuperClass)abstractSuperClass;
				currentEReferences.addAll(ec.getSuperClass().getEAllReferences());
			}
			
			if (abstractSuperClass instanceof LocalSuperClass){
				LocalSuperClass lsc = (LocalSuperClass)abstractSuperClass;
				collectEReferences(currentEReferences, lsc);
			}
		}
		
		return currentEReferences;
	}
	
	/**
	 * Return EReferences of vpdslClass
	 * @param vpdslClass
	 * @return
	 */
	public static Collection<EReference> getCurrentEReferences(
			Class vpdslClass) {
		
		Collection<EReference> ref = new HashSet<EReference>();
		
		EList<org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractAssociation> associations = 
				vpdslClass.getVP_Classes_Associations();
		
		for (org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractAssociation abstractAssociation : associations) {
			if (abstractAssociation instanceof ExternalAssociation){
				ExternalAssociation ea = (ExternalAssociation)abstractAssociation;
				ref.add(ea.getReference());
			}
		}
		
		return ref;
	}
	
	
	/**
	 * Collect all reference of the local class lsc in currentERefrences collection
	 * @param currentEReferences
	 * @param lsc
	 */
	private static void collectEReferences(
			Collection<EReference> currentEReferences, LocalSuperClass lsc) {
		
		Class clazz = lsc.getSuperClass();
		
		currentEReferences.addAll(VpDiagramHelper.getCurrentEReferences(clazz));
		
		EList<AbstractSuperClass> superTypes = clazz.getInheritences();
		
		if (superTypes.isEmpty()) {
			return;
		}
		
		for (AbstractSuperClass abstractSuperClass : superTypes) {
			if (abstractSuperClass instanceof ExternalSuperClass){
				ExternalSuperClass esc = (ExternalSuperClass)abstractSuperClass;
				currentEReferences.addAll(esc.getSuperClass().getEAllReferences());
			}
			
			if (abstractSuperClass instanceof LocalSuperClass){
				LocalSuperClass lsc2 = (LocalSuperClass)abstractSuperClass;
				collectEReferences(currentEReferences, lsc2);
			}
		}
	}
	
	/**
	 * Test if localVpdesc contains localVpdescClass in inheritence hierarchy
	 * @param target
	 * @param localVpdescClass
	 * @return true if localVpdescClass is in hierarchy of localVpdesc otherwise false
	 */
	public static boolean areEqualWithHerarchy(Class target,
			Class localVpdescClass) {
		
		if (localVpdescClass == null) {
			return false;
		}
		if (target.eClass() == localVpdescClass.eClass()) {
			return true;
		}
		
		boolean areEqual = false;
		
		EList<AbstractSuperClass> superClasses = localVpdescClass.getInheritences();
		
		if (superClasses.isEmpty()) {
			return false;
		}
		
		for (AbstractSuperClass abstractSuperClass : superClasses) {
			if (abstractSuperClass instanceof LocalSuperClass){
				Class clazz = ((LocalSuperClass)abstractSuperClass).getSuperClass();
				
				areEqual |= (clazz.eClass() == target.eClass());
				
				if (areEqual) {
					return areEqual;
				}
				
				return areEqualWithHerarchy(target, clazz);
			}
		}
		
		return false;
	}
	
	
	
	/*
	 * Helpers methods for diagram extension
	 */
	
	
	/**
	 * Return the first container of context with type. if there are no container with type, return null
	 * @param context context
	 * @param type type of container
	 * @return
	 */
	public static EObject getDiagramContainerInstanceType(EObject context, EClass type)
	{
		if (context == null || type == null) {
			return null;
		}
		
		EObject container = context.eContainer();
		
		while (container != null && container != context && container != EcoreUtil.getRootContainer(context))
		{
			if (container.eClass() == type) {
				return container;
			}

			container = container.eContainer();
		}

		return null;
	}


	public static boolean isValidContainerMapping(EObject eObjectOrProxy, EObject eObject, EReference reference2) {
		if (!(eObjectOrProxy instanceof ContainerMapping))
		{
			return false;
		}
		else
		{
			DiagramExtension diagramExtension = (DiagramExtension)eObject;
			DiagramDescription diagDesc = diagramExtension.getExtented_diagram();
			DiagramDescription diagramDescription = getDiagramDescription((ContainerMapping) eObjectOrProxy);
			return EcoreUtil.equals(diagramDescription, diagDesc);
		}

	}


	public static boolean isValidNode(EObject eObjectOrProxy, EObject eObject, EReference reference2) {
		if (!(eObjectOrProxy instanceof NodeMapping))
		{
			return false;
		}
		else
		{
			DiagramExtension diagramExtension = (DiagramExtension)eObject;
			DiagramDescription diagDesc = diagramExtension.getExtented_diagram();
			DiagramDescription diagramDescription = getDiagramDescription((NodeMapping) eObjectOrProxy);
			return EcoreUtil.equals(diagramDescription, diagDesc);
		}
	}



	public static boolean isValidEdge(EObject eObjectOrProxy, EObject eObject, EReference reference2) {

		DiagramExtension diagramExtension = (DiagramExtension)eObject;
		DiagramDescription diagDesc = diagramExtension.getExtented_diagram();
		EList<EdgeMapping> edges = diagDesc.getAllEdgeMappings();

		return edges.contains(eObjectOrProxy);
	}

	private static DiagramDescription getDiagramDescription(AbstractNodeMapping mapping){
		EObject parent = mapping.eContainer();

		while (parent != null){
			if (parent instanceof DiagramDescription) {
				return (DiagramDescription) parent;
			} else {
				parent = parent.eContainer();
			}
		}

		return null;
	}

}
