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
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.sirius.diagram.business.internal.metamodel.helper.ContentHelper;
import org.eclipse.sirius.diagram.description.ContainerMapping;
import org.eclipse.sirius.diagram.description.DiagramDescription;
import org.eclipse.sirius.diagram.description.EdgeMapping;
import org.eclipse.sirius.diagram.description.NodeMapping;
import org.eclipse.sirius.diagram.description.style.ContainerStyleDescription;
import org.eclipse.sirius.diagram.description.style.HideLabelCapabilityStyleDescription;
import org.eclipse.sirius.viewpoint.description.ColorDescription;
import org.eclipse.sirius.viewpoint.description.ConditionalStyleDescription;
import org.eclipse.sirius.viewpoint.description.Group;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;
import org.eclipse.sirius.viewpoint.description.SystemColor;
import org.eclipse.sirius.viewpoint.description.SytemColorsPalette;
import org.eclipse.sirius.viewpoint.description.UserColor;
import org.eclipse.sirius.viewpoint.description.UserColorsPalette;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.sirius.viewpoint.description.style.BasicLabelStyleDescription;
import org.eclipse.sirius.viewpoint.description.style.StyleDescription;
import org.eclipse.sirius.viewpoint.description.style.TooltipStyleDescription;

/**
 * 
 * @author Faycal Abka
 *         Boubekeur Zendagui	
 *
 */
public class SiriusViewpointHelper {
	
	/**
	 * FIXME: Handle the other viewpoint of a given group and not only the first one
	 * @param resource
	 * @return
	 */
	public static Viewpoint getRootviewpoint(Resource resource){
		final EList<EObject> contents = resource.getContents();
		if (contents != null && ! contents.isEmpty())
		{
			final EObject eObject = contents.get(0);
			if (eObject instanceof Group)
			{
				return ((Group) eObject).getOwnedViewpoints().get(0);
			}
		}
		
		return null;
	}
	
	public static Group getViewpointGroup(Resource resource){
		
		
		TreeIterator<EObject> it = resource.getAllContents();
		
		while (it.hasNext()){
			EObject obj = it.next();
			
			if (obj instanceof Group) {
				return (Group)obj;
			}
		}
		
		return null;
	}
	
	public static List<RepresentationDescription> getAllRepresentationDescription(Resource resource){
		
		Viewpoint v = getRootviewpoint(resource);
		if (v != null) {
			return Collections.unmodifiableList(v.getOwnedRepresentations());
		} else {
			return null;
		}
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
					result.addAll(ContentHelper.getAllContainerMappings(dd, true));
					
					for (ContainerMapping cm : ContentHelper.getAllContainerMappings(dd, true)) {
						List<ContainerMapping> subResult = getSubContainers(cm);
						if (subResult != null && !subResult.isEmpty()) {
							result.addAll(subResult);
						}
					}
				}
			}
			
		}
		
		return result;
	}
	
	/**
	 * [BZE] an alternative method to {@link #getAllContainerMapping(Resource)}
	 * Returns all {@link ContainerMapping} of the diagrams provided by <code> diagrams</code>
	 * @param diagrams {@link DiagramDescription}s defining the scope
	 * @return all {@link ContainerMapping} defined in <code> diagrams </code>
	 */
	public static List<ContainerMapping> getAllContainerMapping(List<DiagramDescription> diagrams)
	{
		List<ContainerMapping> result = new ArrayList<ContainerMapping>();
		for (DiagramDescription dd : diagrams) 
		{
			// Add to result all direct contained mapping in the current diagram
			result.addAll(ContentHelper.getAllContainerMappings(dd, true));

			// Look for sub mapping
			for (ContainerMapping cm : ContentHelper.getAllContainerMappings(dd, true)) {
				List<ContainerMapping> subResult = getSubContainers(cm);
				if (subResult != null && !subResult.isEmpty()) {
					result.addAll(subResult);
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
				result.addAll(ContentHelper.getAllNodeMappings(dd, true));

				for (NodeMapping nm : ContentHelper.getAllNodeMappings(dd, true)) {
					List<NodeMapping> borderedNodes = getBorderedNodes(nm);
					if (borderedNodes != null && borderedNodes.size() > 0) {
						for (NodeMapping nodeMapping : borderedNodes) {
							if (! result.contains(nodeMapping)) {
								result.add(nodeMapping);
							}
						}
					}
				}

				for (ContainerMapping iContainerMapping : ContentHelper.getAllContainerMappings(dd, true)) {
					List<NodeMapping> subNodes = getSubNodes(iContainerMapping);
					if (subNodes != null && subNodes.size() > 0) {
						result.addAll(subNodes);
					}
				}
			}
		}
		return result;
	}
	
	/**
	 * [BZE] an alternative method to {@link #getAllNodeMapping(Resource)}
	 * Returns all {@link NodeMapping} of the diagrams provided by <code> diagrams</code>
	 * @param diagrams {@link DiagramDescription}s defining the scope
	 * @return all {@link NodeMapping} defined in <code> diagrams </code>
	 */
	public static List<NodeMapping> getAllNodeMapping(List<DiagramDescription> diagrams){
		List<NodeMapping> result = new ArrayList<NodeMapping>();
		if (diagrams != null && !diagrams.isEmpty())
		{
			for (DiagramDescription dd : diagrams) 
			{
				// Get all direct contained NodeMapping
				result.addAll(ContentHelper.getAllNodeMappings(dd, true));

				// Get sub NodeMappings
				for (NodeMapping nm : ContentHelper.getAllNodeMappings(dd, true)) {
					List<NodeMapping> borderedNodes = getBorderedNodes(nm);
					if (borderedNodes != null && borderedNodes.size() > 0) {
						for (NodeMapping nodeMapping : borderedNodes) {
							if (! result.contains(nodeMapping)) {
								result.add(nodeMapping);
							}
						}
					}
				}

				// Get Sub NodeMappings of all ContainerMappings
				for (ContainerMapping iContainerMapping : ContentHelper.getAllContainerMappings(dd, true)) {
					List<NodeMapping> subNodes = getSubNodes(iContainerMapping);
					if (subNodes != null && subNodes.size() > 0) {
						result.addAll(subNodes);
					}
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

	public static  List<NodeMapping> getBorderedNodes(NodeMapping node){
		List<NodeMapping> result = new BasicEList<NodeMapping>();
		for (NodeMapping borderedNodeMapping : node.getBorderedNodeMappings()) {
			if (! result.contains(borderedNodeMapping)) {
				result.add(borderedNodeMapping);
			}
		}	
		return result;
	}
	
	
	public static List<EdgeMapping> getAllEdgeMapping(Resource resource){
		List<EdgeMapping> result = new ArrayList<EdgeMapping>();
		
		List<DiagramDescription> diagrams = getAllDiagramDescription(resource);
		for (DiagramDescription iDiagram : diagrams) {
			result.addAll(iDiagram.getAllEdgeMappings());
		}
		
		return result;
	}
	
	/**
	 * [BZE] an alternative method to {@link #getAllEdgeMapping(Resource)}
	 * Returns all {@link EdgeMapping} of the diagrams provided by <code> diagrams</code>
	 * @param diagrams {@link DiagramDescription}s defining the scope
	 * @return all {@link EdgeMapping} defined in <code> diagrams </code>
	 */
	public static List<EdgeMapping> getAllEdgeMapping(List<DiagramDescription> diagrams){
		List<EdgeMapping> result = new ArrayList<EdgeMapping>();
		
		if (diagrams != null && !diagrams.isEmpty())
		{
			for (DiagramDescription iDiagram : diagrams) {
				result.addAll(iDiagram.getAllEdgeMappings());
			}
		}
		
		return result;
	}
	
	
	public static List<StyleDescription> getAllStyleDescriptionFromEdgeMappings(List<EdgeMapping> edgeMappings){
		List<StyleDescription> result = new ArrayList<StyleDescription>();
		
		
		if (edgeMappings != null && !edgeMappings.isEmpty()){
			for (EdgeMapping edge : edgeMappings) {
				result.add(edge.getStyle());
			}
		}
		
		return result;
	}
	
	public static List<ConditionalStyleDescription> getAllConditionalStyleDescriptionFromMappings(List<EdgeMapping> edgeMappings){
		List<ConditionalStyleDescription> result = new ArrayList<ConditionalStyleDescription>();
		
		if (edgeMappings != null && !edgeMappings.isEmpty()){
			for (EdgeMapping edge : edgeMappings) {
				result.addAll(edge.getConditionnalStyles());
			}
		}
		
		return result;
	}
	
	//TODO rework -- all methods after
	public static List<StyleDescription> getAllStyleDescription(List<DiagramDescription> diagrams){
		List<StyleDescription> result = new ArrayList<StyleDescription>();
		
		for (DiagramDescription diagramDescription : diagrams) {
			findAllStyleDescriptions(diagramDescription, result);
		}
		
		return result;
	}

	private static void findAllStyleDescriptions(DiagramDescription diagramDescription, List<StyleDescription> result) {
		TreeIterator<EObject> eAllContents = diagramDescription.eAllContents();
		
		while (eAllContents.hasNext()){
			EObject next = eAllContents.next();
			if (next instanceof StyleDescription){
				result.add((StyleDescription) next);
			}
		}
	}
	
	public static List<BasicLabelStyleDescription> getAllBasicLabelDescription(List<DiagramDescription> diagrams){
		List<BasicLabelStyleDescription> result = new ArrayList<BasicLabelStyleDescription>();
		
		for (DiagramDescription diagramDescription : diagrams) {
			findAllBasicLabelDescription(diagramDescription, result);
		}
		
		return result;
	}

	private static void findAllBasicLabelDescription(DiagramDescription diagramDescription, List<BasicLabelStyleDescription> result) {
		TreeIterator<EObject> eAllContents = diagramDescription.eAllContents();
		
		while (eAllContents.hasNext()){
			EObject next = eAllContents.next();
			if (next instanceof BasicLabelStyleDescription){
				result.add((BasicLabelStyleDescription) next);
			}
		}
	}
	
	public static List<TooltipStyleDescription> getAllToolTipStyleDescription(List<DiagramDescription> diagrams){
		List<TooltipStyleDescription> result = new ArrayList<TooltipStyleDescription>();
		
		for (DiagramDescription diagramDescription : diagrams) {
			findAllToolTipStyleDescription(diagramDescription, result);
		}
		
		return result;
	}

	private static void findAllToolTipStyleDescription(DiagramDescription diagramDescription, List<TooltipStyleDescription> result) {
		TreeIterator<EObject> eAllContents = diagramDescription.eAllContents();
		
		while (eAllContents.hasNext()){
			EObject next = eAllContents.next();
			if (next instanceof TooltipStyleDescription){
				result.add((TooltipStyleDescription) next);
			}
		}
	}
	
	public static List<HideLabelCapabilityStyleDescription> getAllHideLabelCapabilityStyleDescription(List<DiagramDescription> diagrams){
		List<HideLabelCapabilityStyleDescription> result = new ArrayList<HideLabelCapabilityStyleDescription>();
		
		for (DiagramDescription diagramDescription : diagrams) {
			findAllHideLabelCapabilityStyleDescription(diagramDescription, result);
		}
		
		return result;
	}

	private static void findAllHideLabelCapabilityStyleDescription(DiagramDescription diagramDescription, List<HideLabelCapabilityStyleDescription> result) {
		TreeIterator<EObject> eAllContents = diagramDescription.eAllContents();
		
		while (eAllContents.hasNext()){
			EObject next = eAllContents.next();
			if (next instanceof HideLabelCapabilityStyleDescription){
				result.add((HideLabelCapabilityStyleDescription) next);
			}
		}
	}
	
	public static List<UserColor> getAllUserColor(Resource resource){
		List<UserColor> result = new ArrayList<UserColor>();
		
		Group group = getGroup(resource);
		findAllUserColor(group, result);
		
		return result;
	}
	
	private static void findAllUserColor(Group group, List<UserColor> result) {
		if (group != null){
			EList<UserColorsPalette> userColorsPalettes = group.getUserColorsPalettes();
			
			for (UserColorsPalette userColorsPalette : userColorsPalettes) {
				EList<UserColor> entries = userColorsPalette.getEntries();
				result.addAll(entries);
			}
		}
	}

	public static List<ColorDescription> getAllSystemColor(Resource resource){
		List<ColorDescription> result = new ArrayList<ColorDescription>();
		
		Group group = getGroup(resource);
		findAllColorDescription(group, result);
		return result;
	}

	private static Group getGroup(Resource resource) {
		final EList<EObject> contents = resource.getContents();
		if (contents != null && ! contents.isEmpty())
		{
			final EObject eObject = contents.get(0);
			if (eObject instanceof Group)
			{
				return (Group)eObject;
			}
		}
		return null;
	}
	

	private static void findAllColorDescription(Group group, List<ColorDescription> result) {
		if (group != null) {
			findAllSystemColors(group, result);
		}
	}

	private static void findAllSystemColors(Group group, List<ColorDescription> result) {
		SytemColorsPalette systemColorsPalette = group.getSystemColorsPalette();
		EList<SystemColor> entries = systemColorsPalette.getEntries();
		
		result.addAll(entries);
	}
	
	public static List<ContainerStyleDescription> getAllContainerStyleDescription(List<DiagramDescription> diagrams){
		List<ContainerStyleDescription> result = new ArrayList<ContainerStyleDescription>();
		
		for (DiagramDescription diagramDescription : diagrams) {
			findAllContainerStyleDescription(diagramDescription, result);
		}
		
		return result;
	}

	private static void findAllContainerStyleDescription(DiagramDescription diagramDescription, List<ContainerStyleDescription> result) {
		TreeIterator<EObject> eAllContents = diagramDescription.eAllContents();
		
		while (eAllContents.hasNext()){
			EObject next = eAllContents.next();
			if (next instanceof ColorDescription){
				result.add((ContainerStyleDescription) next);
			}
		}
	}
}