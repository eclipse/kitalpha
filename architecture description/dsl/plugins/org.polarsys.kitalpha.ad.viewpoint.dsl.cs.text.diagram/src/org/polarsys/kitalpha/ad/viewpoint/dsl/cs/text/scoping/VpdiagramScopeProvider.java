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

package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.scoping;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.sirius.diagram.description.ContainerMapping;
import org.eclipse.sirius.diagram.description.DiagramDescription;
import org.eclipse.sirius.diagram.description.EdgeMapping;
import org.eclipse.sirius.diagram.description.NodeMapping;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.scoping.impl.FilteringScope;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.AbstractAssociation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.commondata.AbstractClass;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.AbstractNode;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.BorderedNode;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Container;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.ContainerChildren;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Diagram;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DomainContainer;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.MappingSet;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Node;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.NodeDomainElement;

import com.google.common.base.Predicate;


/**
 * 
 * @author Amine Lajmi
 *
 */
public class VpdiagramScopeProvider extends AbstractDeclarativeScopeProvider {

	/**
	 * Scope of the vpdiagram sublanguage
	 */
	IScope scope_LocalClass_class(EObject context, EReference reference) {
		return new FilteringScope(delegateGetScope(context, reference),
				new Predicate<IEObjectDescription>() {
					public boolean apply(IEObjectDescription d) {
						return (d.getEObjectOrProxy() instanceof org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class);
					}
				});
	}
	
	IScope scope_ExternalClass_class(EObject context, EReference reference) {
		return new FilteringScope(delegateGetScope(context, reference),
				new Predicate<IEObjectDescription>() {
					public boolean apply(IEObjectDescription d) {
						return (d.getEObjectOrProxy() instanceof EClass);
					}
				});
	}
	
	IScope scope_NodeDomainElement_domain_Class(EObject context, EReference reference) {
		return new FilteringScope(delegateGetScope(context, reference),
				new Predicate<IEObjectDescription>() {
					public boolean apply(IEObjectDescription d) {
						return (d.getEObjectOrProxy() instanceof org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class);
					}
				});
	}
	
	IScope scope_NodeDomainElement_chlidren_list(EObject context, EReference reference) {
		return new FilteringScope(delegateGetScope(context, reference),
				new Predicate<IEObjectDescription>() {
					public boolean apply(IEObjectDescription d) {
						return (d.getEObjectOrProxy() instanceof org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.LocalClassAssociation);
					}
				});
	}
	
	
	IScope scope_ExternalAssociation_reference(EObject context, EReference reference) {
		
		final EObject context2 = context;
		return new FilteringScope(delegateGetScope(context, reference),
				new Predicate<IEObjectDescription>() {
					public boolean apply(IEObjectDescription d) {
						return VpdiagramScopeHelper.selectExternalAssociation(context2, d);
					}
					
		});
	}
	
	
	private AbstractClass getAbstractClassDomainOfContainer(AbstractAssociation abstractAssociation){
		
		if (abstractAssociation == null)
			return null;
		
		
		EObject container = abstractAssociation.eContainer();
		
		if (container instanceof DomainContainer){
			DomainContainer domainContainer = (DomainContainer)container;
			EObject containerDomain = domainContainer.eContainer();
			
			if (containerDomain instanceof MappingSet){
				containerDomain = containerDomain.eContainer();
			}
			
			if (containerDomain instanceof Diagram){
				Diagram diagram = (Diagram)containerDomain;
				return getAbstractClassOf(diagram);
			}
		}
		
		if (container instanceof NodeDomainElement){
			NodeDomainElement nde = (NodeDomainElement)container;
			EObject containerDomainElement = nde.eContainer().eContainer();
			
			if (containerDomainElement!= null && 
					containerDomainElement instanceof MappingSet){
				containerDomainElement = containerDomainElement.eContainer();
			}
			
			if (containerDomainElement != null &&
					containerDomainElement instanceof ContainerChildren){
				containerDomainElement = containerDomainElement.eContainer();
			}
			
			if (containerDomainElement instanceof Container){
				Container domainElementContainer = (Container)containerDomainElement;
				return domainElementContainer.getThe_domain().getDomain_Class();				
			}
			
			if (containerDomainElement instanceof Diagram){
				Diagram diagram = (Diagram)containerDomainElement;
				return getAbstractClassOf(diagram);
			}
			
			if (containerDomainElement instanceof org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.Node){
				Node domainElementContainer = (Node)containerDomainElement;
				return getAbstractClassOf(domainElementContainer);				
			}
			
			if (containerDomainElement instanceof org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.BorderedNode){
				BorderedNode domainElementContainer = (BorderedNode)containerDomainElement;
				return getAbstractClassOf(domainElementContainer);				
			}
		}
		
		return null;
	}
	
	private AbstractClass getAbstractClassOf(Diagram diagram){
		return diagram.getThe_domain().getThe_domain();
	}
	
	private AbstractClass getAbstractClassOf(Node node){
		return node.getThe_domain().getDomain_Class();
	}
	
	private AbstractClass getAbstractClassOf(BorderedNode borderedNode){
		return borderedNode.getThe_domain().getDomain_Class();
	}
	
	
	
	IScope scope_LocalAssociation_reference(EObject context, EReference reference) {
		
		final EObject context2 = context;
		
		return new FilteringScope(delegateGetScope(context, reference),
				new Predicate<IEObjectDescription>() {
					public boolean apply(IEObjectDescription d) {
						
						
//						if (d.getEObjectOrProxy() instanceof LocalClassAssociation){
//							LocalClassAssociation localClassAssociation = (LocalClassAssociation)d.getEObjectOrProxy();
//							Class target = localClassAssociation.getLocalTarget();
//							EObject localClassAssociationContainer = localClassAssociation.eContainer();
//							
//							if (localClassAssociationContainer instanceof Class){
//								Class lClassAssociationContainer = (Class)localClassAssociationContainer;
//								
//								if (nodeDomainElement == null) 
//									return false;
//								
//								
//								AbstractClass abstractDomain_class = nodeDomainElement.getDomain_Class();
//								
//								AbstractClass containerDomainClass = getAbstractClassFrom(nodeDomainElement);
//								
//								if (abstractDomain_class != null && containerDomainClass != null 
//										&& abstractDomain_class instanceof LocalClass && containerDomainClass instanceof LocalClass){
//									LocalClass domain_class = (LocalClass)abstractDomain_class;
//									LocalClass container_domainClass = (LocalClass)containerDomainClass;
//									
//									EList<AbstractSuperClass> superClasses = domain_class.getClass_().getInheritences();
//									
//									
//									boolean isSuperClass = false;
//									for (AbstractSuperClass abstractSuperClass : superClasses) {
//										if (abstractSuperClass instanceof LocalSuperClass){
//											isSuperClass = ((LocalSuperClass)abstractSuperClass).getSuperClass() == target;
//										}
//									}
//									
//									
//									return (lClassAssociationContainer != null 
//											&& lClassAssociationContainer.getVP_Classes_Associations().contains(localClassAssociation))
//											&& ((domain_class.getClass_() == target) || isSuperClass)
//											&& container_domainClass.getClass_().getVP_Classes_Associations().contains(localClassAssociation);
//								}
//							}
//						}
						
						 return VpdiagramScopeHelper.selectLocalAssociation(context2, d);
						//return d.getEObjectOrProxy() instanceof org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.LocalClassAssociation;
					}
				});
	}
	
	
	private AbstractClass getAbstractClassFrom(NodeDomainElement nde){
		
		//Skip its container
		EObject container = nde.eContainer().eContainer();
		
		if (container instanceof ContainerChildren){
			container = container.eContainer();
		}
		
		if (container instanceof MappingSet){
			container = container.eContainer();
		}
		
		if (container instanceof Container){
			return ((Container)container).getThe_domain().getDomain_Class();
		}
		
		if (container instanceof Node){
			Node n = (Node)container;
			return getAbstractClassOf(n);
		}
		
		if (container instanceof BorderedNode){
			BorderedNode bn = (BorderedNode)container;
			return getAbstractClassOf(bn);
		}
		
		if (container instanceof Diagram){
			Diagram d = (Diagram)container;
			return getAbstractClassOf(d);
		}
		
		return null;	
		
		
	}
	
	IScope scope_DomainElement_attribute(EObject context, EReference reference) {
		return new FilteringScope(delegateGetScope(context, reference),
				new Predicate<IEObjectDescription>() {
					public boolean apply(IEObjectDescription d) {
						return (d.getEObjectOrProxy() instanceof org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Attribute);
					}
				});
	}
	
	IScope scope_DiagramExtension_extented_diagram(EObject context, EReference reference) {
		return new FilteringScope(delegateGetScope(context, reference),
				new Predicate<IEObjectDescription>() {
					public boolean apply(IEObjectDescription d) {
						return (d.getEObjectOrProxy() instanceof DiagramDescription);
					}
				});
	}
	
	IScope scope_Edge_source(EObject context, EReference reference) {
		return new FilteringScope(delegateGetScope(context, reference),
				new Predicate<IEObjectDescription>() {
					public boolean apply(IEObjectDescription d) {
						return (d.getEObjectOrProxy() instanceof DiagramElement);
					}
				});
	}
	
	IScope scope_Edge_target(EObject context, EReference reference) {
		return new FilteringScope(delegateGetScope(context, reference),
				new Predicate<IEObjectDescription>() {
					public boolean apply(IEObjectDescription d) {
						return (d.getEObjectOrProxy() instanceof DiagramElement);
					}
				});
	}
	
	IScope scope_EdgeImport_imports(EObject context, EReference reference) {
		return new FilteringScope(delegateGetScope(context, reference),
				new Predicate<IEObjectDescription>() {
					public boolean apply(IEObjectDescription d) {
						return (d.getEObjectOrProxy() instanceof EdgeMapping);
					}
				});
	}
	
	IScope scope_Node_imports(EObject context, EReference reference) {
		return new FilteringScope(delegateGetScope(context, reference),
				new Predicate<IEObjectDescription>() {
					public boolean apply(IEObjectDescription d) {
						return (d.getEObjectOrProxy() instanceof NodeMapping);
					}
				});
	}
	
	IScope scope_BorderedNode_imports(EObject context, EReference reference) {
		return new FilteringScope(delegateGetScope(context, reference),
				new Predicate<IEObjectDescription>() {
					public boolean apply(IEObjectDescription d) {
						return (d.getEObjectOrProxy() instanceof NodeMapping);
					}
				});
	}
	
	IScope scope_Container_imports(EObject context, EReference reference) {
		return new FilteringScope(delegateGetScope(context, reference),
				new Predicate<IEObjectDescription>() {
					public boolean apply(IEObjectDescription d) {
						return (d.getEObjectOrProxy() instanceof ContainerMapping);
					}
				});
	}
	
	IScope scope_Action_tool_For(EObject context, EReference reference) {
		return new FilteringScope(delegateGetScope(context, reference),
				new Predicate<IEObjectDescription>() {
					public boolean apply(IEObjectDescription d) {
						return (d.getEObjectOrProxy() instanceof DiagramElement);
					}
				});
	}
	
	IScope scope_ContainerChildren_reused_nodes(EObject context, EReference reference){
		return new FilteringScope(delegateGetScope(context, reference), 
				new Predicate<IEObjectDescription>() {
					public boolean apply(IEObjectDescription d){
						return (d.getEObjectOrProxy() instanceof AbstractNode);
					}
				});
	}
	
	
	IScope scope_NodeChildren_reused_boderednodes(EObject context, EReference reference){
		return new FilteringScope(delegateGetScope(context, reference), 
				new Predicate<IEObjectDescription>() {
					public boolean apply(IEObjectDescription d){
						return (d.getEObjectOrProxy() instanceof BorderedNode);
					}
				});
	}
}
