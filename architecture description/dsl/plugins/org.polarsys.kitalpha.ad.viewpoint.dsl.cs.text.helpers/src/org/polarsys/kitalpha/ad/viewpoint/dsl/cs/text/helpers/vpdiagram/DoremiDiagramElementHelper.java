/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.helpers.vpdiagram;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.business.internal.metamodel.helper.ContentHelper;
import org.eclipse.sirius.diagram.description.ContainerMapping;
import org.eclipse.sirius.diagram.description.DiagramDescription;
import org.eclipse.sirius.diagram.description.EdgeMapping;
import org.eclipse.sirius.diagram.description.NodeMapping;
import org.eclipse.sirius.ui.business.api.viewpoint.ViewpointSelection;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdiagram.DiagramRepresentation;


/**
 * Reworked from {@link org.polarsys.kitalpha.ad.viewpoint.dsl.as.diagram.helper.extension.DoremiDiagramElementHelper} to fit with textual viewpoint dsl.
 * 
 * @author Amine Lajmi
 *
 */
public class DoremiDiagramElementHelper {

	public static List<DiagramDescription> getAvailableDoremiDiagramFor(EObject anyModelElement){
		List<DiagramDescription> result = new ArrayList<DiagramDescription>();
		if (anyModelElement != null) {
			List<String> diagramFilter = ExtensionManager.getDiagramFilters(anyModelElement);
			if (diagramFilter != null && ! diagramFilter.isEmpty()) {
				for (String dFilter : diagramFilter) {
					Set<Viewpoint> vpset = ViewpointSelection.getViewpoints(dFilter);
					for (Viewpoint viewpoint : vpset) {
						for (RepresentationDescription iRepresentationDescription : viewpoint.getOwnedRepresentations()) {
							if (iRepresentationDescription instanceof DiagramDescription) {
								result.add((DiagramDescription)iRepresentationDescription);
							}
						}
					}
				}
			}
		}
		
		return result;
	}
	
	/**
	 * Get all imported {@link DiagramRepresentation} by end user.
	 * @param anyModelElement any viewpoint model element.
	 * @return a {@link List} of {@link DiagramRepresentation}
	 */
	public static List<DiagramDescription> getImportedDoremiDiagramFor(EObject anyModelElement){
		List<DiagramDescription> result = new ArrayList<DiagramDescription>();
		
		
		
		return result;
	}
	
		
	/**
	 * This method compute the list of all doremi container mapping defined in the Target Application diagrams.
	 * @param anyModelElement: Any vpdesc model element
	 * @return any containers defined as a child of diagram or as a child of another container 
	 */
	public static List<ContainerMapping> getAvailableContainerMappingsFor(EObject anyModelElement ){
		List<ContainerMapping> result = new ArrayList<ContainerMapping>();
		List<DiagramDescription> diagrams = getAvailableDoremiDiagramFor(anyModelElement);
		for (DiagramDescription iDiagram : diagrams) {
			result.addAll(ContentHelper.getAllContainerMappings(iDiagram, true));
			for (ContainerMapping containerMapping : ContentHelper.getAllContainerMappings(iDiagram, true)) {
				List<ContainerMapping> subResult = getSubContainers(containerMapping);
				if (subResult != null && subResult.size() > 0) {
					result.addAll(subResult);
				}
			}
		}
		
		return result;
	}
	
	/**
	 * This method browses a Tree of ContainerMapping 
	 * @param container: Parent container
	 * @return all direct and indirect container children of type ContainerMapping
	 */
	private static List<ContainerMapping> getSubContainers(ContainerMapping container){
		List<ContainerMapping> result = new ArrayList<ContainerMapping>();	
		for (ContainerMapping containerMapping : container.getSubContainerMappings()) {
			if (! result.contains(containerMapping)) {
				result.add(containerMapping);
			}			
			List<ContainerMapping> subResult = getSubContainers(containerMapping);
			if (subResult != null && subResult.size() > 0) {
				for (ContainerMapping containerMapping2 : subResult) {
					if (! result.contains(containerMapping2)) {
						result.add(containerMapping2);
					}
				}
			}
		}
		
		return result;
	}
	
	/**
	 * This method compute the list of all doremi NodeMapping defined in the Target Application diagrams.
	 * @param anyModelElement : Any vpdesc model element
	 * @return
	 */
	public static List<NodeMapping> getAvailableNodeMappingsFor(EObject anyModelElement ){
		List<NodeMapping> result = new ArrayList<NodeMapping>();
		List<DiagramDescription> diagrams = getAvailableDoremiDiagramFor(anyModelElement);
		for (DiagramDescription iDiagram : diagrams) {
			result.addAll(ContentHelper.getAllNodeMappings(iDiagram, true));
			for (NodeMapping iNodeMapping : ContentHelper.getAllNodeMappings(iDiagram, true)) {
				List<NodeMapping> borderedNodes = getBorderedNodes(iNodeMapping);
				if (borderedNodes != null && borderedNodes.size() > 0) {
					for (NodeMapping nodeMapping : borderedNodes) {
						if (! result.contains(nodeMapping)) {
							result.add(nodeMapping);
						}
					}
				}
			}			
			for (ContainerMapping iContainerMapping : ContentHelper.getAllContainerMappings(iDiagram, true)) {
				List<NodeMapping> subNodes = getSubNodes(iContainerMapping);
				if (subNodes != null && subNodes.size() > 0) {
					result.addAll(subNodes);
				}
			}
		}	
		return result;
	}
	
	/**
	 * This method return all sub nodes of a ContainerMapping. 
	 * @param container : the container
	 * @return the result is composed of direct or indirect NodeMapping and BorderedNodeMapping
	 */
	private static List<NodeMapping> getSubNodes(ContainerMapping container){
		List<NodeMapping> result = new BasicEList<NodeMapping>();
		// The current Container sub node and their bordered nodes
		for (NodeMapping subNodeMapping : container.getSubNodeMappings()) {
			if (! result.contains(subNodeMapping)) {
				result.add(subNodeMapping);
			}
			List<NodeMapping> nodeBorderedNodes = getBorderedNodes(subNodeMapping);
			if (nodeBorderedNodes != null && nodeBorderedNodes.size() > 0) {
				for (NodeMapping nodeMapping : nodeBorderedNodes) {
					if (! result.contains(nodeMapping)) {
						result.add(nodeMapping);
					}
				}
			}
		}
		
		// The current container bordered nodes
		for (NodeMapping borderedNodeMapping : container.getBorderedNodeMappings()) {
			if (! result.contains(borderedNodeMapping)) {
				result.add(borderedNodeMapping);
			}
		}
		// Handle sub container of the current Mapping
		for (ContainerMapping iContainerMapping : container.getSubContainerMappings()) {
			List<NodeMapping> subContainerSubNodes = getSubNodes(iContainerMapping);
			if (subContainerSubNodes != null && subContainerSubNodes.size() > 0) {
				for (NodeMapping nodeMapping : subContainerSubNodes) {
					if (! result.contains(nodeMapping)) {
						result.add(nodeMapping);
					}
				}
			}				
		}	
		return result;
	}
	
	/**
	 * 
	 * @param node
	 * @return All bordered node of a NodeMapping
	 */
	private static  List<NodeMapping> getBorderedNodes(NodeMapping node){
		List<NodeMapping> result = new BasicEList<NodeMapping>();
		for (NodeMapping borderedNodeMapping : node.getBorderedNodeMappings()) {
			if (! result.contains(borderedNodeMapping)) {
				result.add(borderedNodeMapping);
			}
		}	
		return result;
	}
	
	/**
	 * This method compute the list of all doremi EdgeMapping defined in the Target Application diagrams.
	 * @param anyModelElement
	 * @return all EdgeMapping defined in the Target Application diagrams
	 */
	public static List<EdgeMapping> getAvailableEdgeMappingsFor(EObject anyModelElement ){
		List<EdgeMapping> result = new ArrayList<EdgeMapping>();
		List<DiagramDescription> diagrams = getAvailableDoremiDiagramFor(anyModelElement);
		for (DiagramDescription iDiagram : diagrams) {
			result.addAll(iDiagram.getAllEdgeMappings());
		}
		
		return result;
	}
}
