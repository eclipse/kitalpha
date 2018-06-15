/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.scoping;

import java.util.Collections;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.sirius.diagram.description.ContainerMapping;
import org.eclipse.sirius.diagram.description.EdgeMapping;
import org.eclipse.sirius.diagram.description.Layer;
import org.eclipse.sirius.diagram.description.NodeMapping;
import org.eclipse.sirius.viewpoint.description.ConditionalStyleDescription;
import org.eclipse.sirius.viewpoint.description.style.StyleDescription;

/**
 * 
 * @author Faycal Abka 
 *
 */
public class VpdiagramNamingHelper {
	
	private static final String SPECIAL_CHARACTERS_PATTERN_STRING = "[^a-zA-Z0-9_\\\\^\\\\s]";
	private static final Pattern SPECIAL_CHARACTERS_PATERN = Pattern.compile(SPECIAL_CHARACTERS_PATTERN_STRING, Pattern.CASE_INSENSITIVE);
	
	private final static AdapterFactoryLabelProvider labelProvider;
	
	static {
		ComposedAdapterFactory adapter = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		labelProvider = new AdapterFactoryLabelProvider(adapter);
	}
	
	/**
	 * Process the identifier to find not allowed characters in the identifier
	 * and trim them
	 * @param identifier
	 * @return
	 */
	public static String normalizeIdentifier(String identifier)
	{
		Matcher matcher = SPECIAL_CHARACTERS_PATERN.matcher(identifier);
		
		while (matcher.find())
		{
			return matcher.replaceAll("");
		}
		
		return identifier;
	}

	public static String computeEdgeStyleDescriptionName(StyleDescription edgeStyleDescription){
		return getHierarchicalName(edgeStyleDescription);
	}
	
	public static String computeConditionalEdgeStyleDescriptionName(ConditionalStyleDescription conditionaledgeStyleDescription) {
		return getHierarchicalName(conditionaledgeStyleDescription);
	}
	
	
	private static String getHierarchicalName(EObject eObject){
		StringBuffer result = new StringBuffer();
		LinkedList<EObject> containers = getContainersUntilLayer(eObject);
		
		for (EObject e : containers) {
			result.append("[").append(dispatchCallGetLabelOrName(e)).append("] ");
		}

		result.append(getLabelprovider().getText(eObject));
		
		return result.toString();
	}
	

	private static LinkedList<EObject> getContainersUntilLayer(EObject eObject) {
		LinkedList<EObject> containers = new LinkedList<EObject>();
		
		EObject container = eObject.eContainer(); 
		while (container != null){
			containers.add(container);
			container = container.eContainer();
			
			if (container instanceof Layer) {
				break;
			}
		}
		//Add Layer
		containers.add(container);
		Collections.reverse(containers);
		
		return containers;
	}

	
	private static String dispatchCallGetLabelOrName(EObject eObject){
		if (eObject instanceof EdgeMapping) {
			return getLabelOrName((EdgeMapping) eObject);
		}
		if (eObject instanceof ContainerMapping) {
			return getLabelOrName((ContainerMapping) eObject);
		}
		if (eObject instanceof NodeMapping) {
			return getLabelOrName((NodeMapping) eObject);
		}
		if (eObject instanceof Layer) {
			return getLabelOrName((Layer)eObject);
		}
		
		return "";
	}
	
	private static String getLabelOrName(EdgeMapping edgeMapping) {
		if (edgeMapping.getLabel() != null && !edgeMapping.getLabel().isEmpty()) {
			return edgeMapping.getLabel().trim();
		}
		return edgeMapping.getName().trim();
	}

	private static String getLabelOrName(ContainerMapping containerMapping){
		if (containerMapping.getLabel() != null && !containerMapping.getLabel().isEmpty()) {
			return containerMapping.getLabel().trim();
		}
		return containerMapping.getName().trim();
	}
	
	private static String getLabelOrName(NodeMapping nodeMapping){
		if (nodeMapping.getLabel() != null && !nodeMapping.getLabel().isEmpty()) {
			return nodeMapping.getLabel().trim();
		}
		return nodeMapping.getName();
	}
	
	private static String getLabelOrName(Layer layer){
		if (layer.getLabel() != null && !layer.getLabel().isEmpty()) {
			return layer.getLabel().trim();
		}
		return layer.getName();
	}

	private static AdapterFactoryLabelProvider getLabelprovider() {
		return labelProvider;
	}

	public static String computeName(EObject eObject) {
		return getHierarchicalName(eObject);
	}

	
}
