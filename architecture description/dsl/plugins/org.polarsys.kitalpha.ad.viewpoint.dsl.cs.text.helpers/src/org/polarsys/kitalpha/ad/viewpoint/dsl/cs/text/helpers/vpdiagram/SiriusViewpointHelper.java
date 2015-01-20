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

package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.helpers.vpdiagram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.sirius.diagram.description.ContainerMapping;
import org.eclipse.sirius.diagram.description.DiagramDescription;
import org.eclipse.sirius.diagram.description.EdgeMapping;
import org.eclipse.sirius.diagram.description.NodeMapping;
import org.eclipse.sirius.viewpoint.description.Group;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;
import org.eclipse.sirius.viewpoint.description.Viewpoint;

/**
 * 
 * @author Faycal Abka
 *
 */
public class SiriusViewpointHelper {
	 
	public static Viewpoint getRootviewpoint(Resource resource){
		TreeIterator<EObject> it = resource.getAllContents();
		
		while (it.hasNext()){
			EObject next = it.next();
			
			if (next instanceof Viewpoint)
				return (Viewpoint)next;
		}
		
		return null;
	}
	
	public static Group getViewpointGroup(Resource resource){
		
		
		TreeIterator<EObject> it = resource.getAllContents();
		
		while (it.hasNext()){
			EObject obj = it.next();
			
			if (obj instanceof Group)
				return (Group)obj;
		}
		
		return null;
	}
	
	public static List<RepresentationDescription> getAllRepresentationDescription(Resource resource){
		
		Viewpoint v = getRootviewpoint(resource);
		if (v != null)
			return Collections.unmodifiableList(v.getOwnedRepresentations());
		else 
//			throw new RuntimeException("Couldn't find the import of the resource: " + resource.getURI());
			return null;
	}
	
	
	public static List<ContainerMapping> getAllContainerMapping(Resource resource)
	{
		List<ContainerMapping> result = new ArrayList<ContainerMapping>();
		
		Viewpoint v = getRootviewpoint(resource);
		
		if (v != null){
			EList<RepresentationDescription> desc = v.getOwnedRepresentations();
			
			for (RepresentationDescription rd : desc) {
				if (rd instanceof DiagramDescription){
					DiagramDescription dd = (DiagramDescription)rd;
					result.addAll(dd.getAllContainerMappings());
					
					for (ContainerMapping cm : dd.getAllContainerMappings()) {
						List<ContainerMapping> subResult = getSubContainers(cm);
						if (subResult != null && !subResult.isEmpty())
							result.addAll(subResult);
					}
				}
			}
			
		}
		
		return result;
	}
	
	//FIXME: Duplicated code, it's bad :)
	/**
	 * Method from DoremiDiagramElementHelper
	 * @param container
	 * @return
	 */
	public static List<ContainerMapping> getSubContainers(ContainerMapping container){
		List<ContainerMapping> result = new ArrayList<ContainerMapping>();	
		for (ContainerMapping containerMapping : container.getSubContainerMappings()) {
			if (! result.contains(containerMapping))
				result.add(containerMapping);			
			List<ContainerMapping> subResult = getSubContainers(containerMapping);
			if (subResult != null && subResult.size() > 0)
				for (ContainerMapping containerMapping2 : subResult) 
					if (! result.contains(containerMapping2))
						result.add(containerMapping2);
		}
		
		return result;
	}
	
	
	public static List<DiagramDescription> getAllDiagramDescription(Resource resource){
		
		List<DiagramDescription> diagramDescriptions = new ArrayList<DiagramDescription>();
		
		List<RepresentationDescription> desc = getAllRepresentationDescription(resource);

		if (desc != null && !desc.isEmpty()){
			for (RepresentationDescription rd : desc) {
				if (rd instanceof DiagramDescription){
					DiagramDescription dd = (DiagramDescription)rd;
					diagramDescriptions.add(dd);
				}
			}
		}
		return diagramDescriptions;
	}
	
	public static List<NodeMapping> getAllNodeMapping(Resource resource){
		
		List<NodeMapping> result = new ArrayList<NodeMapping>();

		List<DiagramDescription> desc = getAllDiagramDescription(resource);

		if (desc != null && !desc.isEmpty()){
			for (DiagramDescription dd : desc) {
				result.addAll(dd.getAllNodeMappings());

				for (NodeMapping nm : dd.getAllNodeMappings()) {
					List<NodeMapping> borderedNodes = getBorderedNodes(nm);
					if (borderedNodes != null && borderedNodes.size() > 0)
						for (NodeMapping nodeMapping : borderedNodes) 
							if (! result.contains(nodeMapping))
								result.add(nodeMapping);
				}

				for (ContainerMapping iContainerMapping : dd.getAllContainerMappings()) {
					List<NodeMapping> subNodes = getSubNodes(iContainerMapping);
					if (subNodes != null && subNodes.size() > 0)
						result.addAll(subNodes);
				}
			}
		}
		return result;
	}

	
	//FIXME duplacate code (see comment below)
	public static List<NodeMapping> getSubNodes(
			ContainerMapping container) {
		List<NodeMapping> result = new BasicEList<NodeMapping>();
		// The current Container sub node and their bordered nodes
		for (NodeMapping subNodeMapping : container.getSubNodeMappings()) {
			if (! result.contains(subNodeMapping))
				result.add(subNodeMapping);
			List<NodeMapping> nodeBorderedNodes = getBorderedNodes(subNodeMapping);
			if (nodeBorderedNodes != null && nodeBorderedNodes.size() > 0)
				for (NodeMapping nodeMapping : nodeBorderedNodes) 
					if (! result.contains(nodeMapping))
						result.add(nodeMapping);
		}
		
		// The current container bordered nodes
		for (NodeMapping borderedNodeMapping : container.getBorderedNodeMappings())
			if (! result.contains(borderedNodeMapping))
					result.add(borderedNodeMapping);
		// Handle sub container of the current Mapping
		for (ContainerMapping iContainerMapping : container.getSubContainerMappings()) {
			List<NodeMapping> subContainerSubNodes = getSubNodes(iContainerMapping);
			if (subContainerSubNodes != null && subContainerSubNodes.size() > 0)
				for (NodeMapping nodeMapping : subContainerSubNodes) 
					if (! result.contains(nodeMapping))
						result.add(nodeMapping);				
		}	
		return result;
	}

	//FIXME duplacate code (see comment below)
//	public static List<NodeMapping> getBorderedNode(NodeMapping node) {
//		List<NodeMapping> result = new BasicEList<NodeMapping>();
//		for (NodeMapping borderedNodeMapping : node.getBorderedNodeMappings())
//			if (! result.contains(borderedNodeMapping))
//				result.add(borderedNodeMapping);	
//		return result;
//	}
	
	public static  List<NodeMapping> getBorderedNodes(NodeMapping node){
		List<NodeMapping> result = new BasicEList<NodeMapping>();
		for (NodeMapping borderedNodeMapping : node.getBorderedNodeMappings())
			if (! result.contains(borderedNodeMapping))
				result.add(borderedNodeMapping);	
		return result;
	}
	
	
	public static List<EdgeMapping> getAllEdgeMapping(Resource resource){
		List<EdgeMapping> result = new ArrayList<EdgeMapping>();
		
		List<DiagramDescription> diagrams = getAllDiagramDescription(resource);
		for (DiagramDescription iDiagram : diagrams) 
			result.addAll(iDiagram.getAllEdgeMappings());
		
		return result;
	}
	
}
