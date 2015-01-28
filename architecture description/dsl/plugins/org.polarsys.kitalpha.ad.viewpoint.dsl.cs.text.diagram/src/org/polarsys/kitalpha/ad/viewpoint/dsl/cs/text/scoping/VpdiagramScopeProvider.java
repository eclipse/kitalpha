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
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.AbstractNode;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.BorderedNode;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.util.ProjectUtil;

import com.google.common.base.Predicate;


/**
 * 
 * @author Amine Lajmi
 * 		   Faycal Abka
 *
 */
public class VpdiagramScopeProvider extends AbstractDeclarativeScopeProvider {

	/**
	 * Scope of the vpdiagram sublanguage
	 */
	IScope scope_LocalClass_class(EObject context, EReference reference) {
		
		final EObject context2 = context;
		return new FilteringScope(delegateGetScope(context, reference),
				new Predicate<IEObjectDescription>() {
					public boolean apply(IEObjectDescription d) {
						return (d.getEObjectOrProxy() instanceof org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class 
								&& ProjectUtil.areInSameProject(context2, d.getEObjectOrProxy()));
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
		
		final EObject context2 = context;
		return new FilteringScope(delegateGetScope(context, reference),
				new Predicate<IEObjectDescription>() {
					public boolean apply(IEObjectDescription d) {
						return (d.getEObjectOrProxy() instanceof org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class
								&& ProjectUtil.areInSameProject(context2, d.getEObjectOrProxy()));
					}
				});
	}
	
	IScope scope_NodeDomainElement_chlidren_list(EObject context, EReference reference) {
		
		final EObject context2 = context;
		return new FilteringScope(delegateGetScope(context, reference),
				new Predicate<IEObjectDescription>() {
					public boolean apply(IEObjectDescription d) {
						return (d.getEObjectOrProxy() instanceof org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.LocalClassAssociation
								&& ProjectUtil.areInSameProject(context2, d.getEObjectOrProxy()));
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
	
	
//	private AbstractClass getAbstractClassOf(Diagram diagram){
//		return diagram.getThe_domain().getThe_domain();
//	}
//	
//	private AbstractClass getAbstractClassOf(Node node){
//		return node.getThe_domain().getDomain_Class();
//	}
//	
//	private AbstractClass getAbstractClassOf(BorderedNode borderedNode){
//		return borderedNode.getThe_domain().getDomain_Class();
//	}
	
	
	
	IScope scope_LocalAssociation_reference(EObject context, EReference reference) {
		
		final EObject context2 = context;
		
		return new FilteringScope(delegateGetScope(context, reference),
				new Predicate<IEObjectDescription>() {
					public boolean apply(IEObjectDescription d) {
						 return VpdiagramScopeHelper.selectLocalAssociation(context2, d);
					}
				});
	}
	
	IScope scope_DomainElement_attribute(EObject context, EReference reference) {
		
		final EObject context2 = context;
		return new FilteringScope(delegateGetScope(context, reference),
				new Predicate<IEObjectDescription>() {
					public boolean apply(IEObjectDescription d) {
						return (d.getEObjectOrProxy() instanceof org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Attribute 
								&& ProjectUtil.areInSameProject(context2, d.getEObjectOrProxy()));
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
		
		final EObject context2 = context;
		return new FilteringScope(delegateGetScope(context, reference),
				new Predicate<IEObjectDescription>() {
					public boolean apply(IEObjectDescription d) {
						return (d.getEObjectOrProxy() instanceof DiagramElement && ProjectUtil.areInSameProject(context2, d.getEObjectOrProxy()));
					}
				});
	}
	
	IScope scope_Edge_target(EObject context, EReference reference) {
		
		final EObject context2 = context;
		return new FilteringScope(delegateGetScope(context, reference),
				new Predicate<IEObjectDescription>() {
					public boolean apply(IEObjectDescription d) {
						return (d.getEObjectOrProxy() instanceof DiagramElement && ProjectUtil.areInSameProject(context2, d.getEObjectOrProxy()));
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
		
		final EObject context2 = context;
		return new FilteringScope(delegateGetScope(context, reference),
				new Predicate<IEObjectDescription>() {
					public boolean apply(IEObjectDescription d) {
						return (d.getEObjectOrProxy() instanceof DiagramElement && ProjectUtil.areInSameProject(context2, d.getEObjectOrProxy()));
					}
				});
	}
	
	IScope scope_ContainerChildren_reused_nodes(EObject context, EReference reference){
		
		final EObject context2 = context;
		return new FilteringScope(delegateGetScope(context, reference), 
				new Predicate<IEObjectDescription>() {
					public boolean apply(IEObjectDescription d){
						return (d.getEObjectOrProxy() instanceof AbstractNode && ProjectUtil.areInSameProject(context2, d.getEObjectOrProxy()));
					}
				});
	}
	
	
	IScope scope_NodeChildren_reused_boderednodes(EObject context, EReference reference){
		
		final EObject context2 = context;
		return new FilteringScope(delegateGetScope(context, reference), 
				new Predicate<IEObjectDescription>() {
					public boolean apply(IEObjectDescription d){
						return (d.getEObjectOrProxy() instanceof BorderedNode && ProjectUtil.areInSameProject(context2, d.getEObjectOrProxy()));
					}
				});
	}
}
