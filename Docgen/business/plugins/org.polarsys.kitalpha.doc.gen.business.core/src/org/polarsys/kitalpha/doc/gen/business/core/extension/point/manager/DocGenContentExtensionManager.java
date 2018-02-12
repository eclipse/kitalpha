/*******************************************************************************
 * Copyright (c) 2016 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.doc.gen.business.core.extension.point.manager;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.egf.model.fcore.FactoryComponent;
import org.eclipse.egf.model.fcore.Viewpoint;
import org.eclipse.egf.model.fcore.ViewpointContainer;
import org.eclipse.egf.model.pattern.Pattern;
import org.eclipse.egf.model.pattern.PatternLibrary;
import org.eclipse.egf.model.pattern.PatternViewpoint;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.polarsys.kitalpha.doc.gen.business.core.Activator;

/**
 * Manager that read the extension point which allows to contribute to DocGen
 * @author Faycal Abka
 *
 */
public class DocGenContentExtensionManager {
	
	private static final String DOCGEN_CONTENT_EXTENSION = "org.polarsys.kitalpha.doc.gen.business.core.contentExtension";
	private static final String DOCGEN_CONTENT_EXTENSION_ELEMENT = "contentExtension";
	private static final String DOCGEN_CONTENT_EXTENSION_PATTERN_URI = "patternURI";
	private static final String DOCGEN_CONTENT_EXTENSION_FCORES = "fcores";
	private static final String DOCGEN_PRIORITY = "priority";
	private static final String DOCGEN_TOPIC = "topic";
	
	private ResourceSet egfResourceSet = new ResourceSetImpl();
	
	/**
	 * @return ordered contribution by priority
	 */
	public Collection<IDocGenExtensionElement> getDocGenExtensions(){
		Collection<IDocGenExtensionElement> result = new LinkedHashSet<IDocGenExtensionElement>();
		
		IConfigurationElement[] config = Platform.getExtensionRegistry().getConfigurationElementsFor(DOCGEN_CONTENT_EXTENSION);
		if (config.length > 0){
			for (IConfigurationElement elt : config) {
				if (elt.getName().equalsIgnoreCase(DOCGEN_CONTENT_EXTENSION_ELEMENT)){
					Collection<Pattern> patterns = new LinkedHashSet<Pattern>();
					
					String topics = elt.getAttribute(DOCGEN_TOPIC);
					String[] topicTokens = getTopicTokens(topics);
					IConfigurationElement[] children = elt.getChildren(DOCGEN_CONTENT_EXTENSION_FCORES);
					String sPriority = elt.getAttribute(DOCGEN_PRIORITY);
					Integer priority = Integer.valueOf(-1);
					
					try {
						priority = Integer.valueOf(sPriority);
					} catch (NumberFormatException e){
						Activator.logWarning("Priority must be an Integer for " + topics.replace("|", ",") + ". The default (-1) priority is set to this contribution");
					}
					
					for (IConfigurationElement _elt : children) {
						String fcorePath = _elt.getAttribute(DOCGEN_CONTENT_EXTENSION_PATTERN_URI);
						URI uri = URI.createURI(fcorePath);
						EObject eObject = egfResourceSet.getEObject(uri, true);
						
						if (eObject instanceof Pattern){
							getPattern((Pattern)eObject, patterns);
						}
						if (eObject instanceof PatternLibrary){
							getPattern((PatternLibrary)eObject, patterns);
						}
						if (eObject instanceof FactoryComponent){
							getPattern((FactoryComponent)eObject, patterns);
						}
					}
					
					if (topicTokens == null || topicTokens.length == 0){
						IllegalArgumentException e = new IllegalArgumentException("Topic must be not null or empty. See the documentation for more details");
						Activator.getDefault().getLog().log(
								new Status(IStatus.WARNING, Activator.PLUGIN_ID, "Topic must be not null or empty. See the documentation for more details", e));
						throw e;
					} else {
						for (String topic : topicTokens) {
							result.add(createDocGenExtensionElement(topic, priority, patterns));
						}
					}
				}
			}
		}
		return result;
	}
	
	private String[] getTopicTokens(String topic) {
		final String idPattern = "[a-zA-Z][a-zA-Z0-9\\.]*";
		final java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(idPattern);
		Collection<String> result = new LinkedHashSet<String>();
		StringTokenizer s = new StringTokenizer(topic, ",");
		while (s.hasMoreTokens()){
			String nextToken = s.nextToken();
			if (pattern.matcher(nextToken).find()){
				if (!nextToken.equalsIgnoreCase(",")){
					result.add(nextToken.trim());
				}
			} else {
				Activator.getDefault().getLog().log(
						new Status(IStatus.ERROR, Activator.PLUGIN_ID, 
								"The identifier" + nextToken +" is not valid. It must have only alphanumerics or with dot characters"));
			}
		}
		return result.toArray(new String[0]);
	}

	/*
	 * Find where to call it!!
	 */
	public void dispose(){
		if (egfResourceSet != null){
			EList<Resource> resources = egfResourceSet.getResources();
			for (Resource resource : resources) {
				if (resource.isLoaded()){
					resource.unload();
				}
			}
		}
	}
	
	private void getPattern(FactoryComponent eObject, Collection<Pattern> patterns) {
		
		ViewpointContainer viewpointContainer = eObject.getViewpointContainer();
		if (viewpointContainer != null){
			EList<Viewpoint> viewpoints = viewpointContainer.getViewpoints();
			if (!viewpoints.isEmpty()){
				for (Viewpoint viewpoint : viewpoints) {
					if (viewpoint instanceof PatternViewpoint){
						EList<PatternLibrary> libraries = ((PatternViewpoint)viewpoint).getLibraries();
						for (PatternLibrary lib : libraries) {
							getPattern(lib, patterns);
						}
					}
				}
			}
		}
	}

	private void getPattern(PatternLibrary eObject, Collection<Pattern> patterns) {
		EList<Pattern> elements = eObject.getElements();
		for (Pattern pattern : elements) {
			getPattern(pattern, patterns);
		}
	}

	private void getPattern(Pattern eObject, Collection<Pattern> patterns) {
		patterns.add(eObject);
	}

	private IDocGenExtensionElement createDocGenExtensionElement(String id, Integer priority, Collection<Pattern> patterns){
		return new DocGenExtensionElement(id, priority, patterns);
	}

}
