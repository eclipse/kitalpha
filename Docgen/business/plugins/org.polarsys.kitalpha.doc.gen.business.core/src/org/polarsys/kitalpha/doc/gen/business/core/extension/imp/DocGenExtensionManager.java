/*******************************************************************************
 * Copyright (c) 2016-2018 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.doc.gen.business.core.extension.imp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.egf.model.pattern.Pattern;
import org.polarsys.kitalpha.doc.gen.business.core.Activator;
import org.polarsys.kitalpha.doc.gen.business.core.extension.intf.IDocGenExtension;
import org.polarsys.kitalpha.doc.gen.business.core.extension.point.manager.DocGenContentExtensionFactory;
import org.polarsys.kitalpha.doc.gen.business.core.extension.point.manager.DocGenContentExtensionManager;
import org.polarsys.kitalpha.doc.gen.business.core.extension.point.manager.IDocGenExtensionElement;

/**
 * Implementation of an utility which allows to access to contributed patterns.
 * This class deals with content extension manager which retrieves the contribution
 * @author Faycal Abka
 *
 */
public final class DocGenExtensionManager implements IDocGenExtension {
	
	private static IDocGenExtension instance;
	private static Collection<IDocGenExtensionElement> contributionsRegistry;
	
	//Handle these maps/Collections for performance issues
	private final Collection<Pattern> patterns = new LinkedHashSet<Pattern>();
	private final Map<Integer, Collection<Pattern>> priorityPatterns = new LinkedHashMap<Integer, Collection<Pattern>>();
	private final Map<String, Collection<Pattern>> idsPattern = new LinkedHashMap<String, Collection<Pattern>>();
	private final Map<Pattern, Integer> patternToPriority = new HashMap<Pattern, Integer>();
	
	
	public static synchronized IDocGenExtension getInstance(){
		if (instance == null){
			DocGenContentExtensionManager manager = DocGenContentExtensionFactory.newDocGenContentExtensionManager();
			contributionsRegistry = manager.getDocGenExtensions();
			instance = new DocGenExtensionManager();
		}
		return instance;
	}

	@Override
	public Collection<Pattern> getAllPatterns() {
		if (patterns.isEmpty()){
			for (IDocGenExtensionElement e : contributionsRegistry) {
				patterns.addAll(e.getPatterns());
			}			
		}
		return patterns;
	}

	@Override
	public Map<Integer, Collection<Pattern>> getAllPatternsWithPriorities() {
		if (priorityPatterns.isEmpty()){
			for (IDocGenExtensionElement e : contributionsRegistry) {
				if (!priorityPatterns.containsKey(e.getPriority())) {
					priorityPatterns.put(e.getPriority(), new LinkedHashSet<Pattern>());
				}
				priorityPatterns.get(e.getPriority()).addAll(e.getPatterns());
			}
		}
		return priorityPatterns;
	}

	@Override
	public Map<String, Collection<Pattern>> getAllPatternsWithTopics() {
		if (idsPattern.isEmpty()){
			for (IDocGenExtensionElement e : contributionsRegistry) {
				if (!idsPattern.containsKey(e.getTopic())) {
					idsPattern.put(e.getTopic(), new LinkedHashSet<Pattern>());
				}
				idsPattern.get(e.getTopic()).addAll(e.getPatterns());
			}
		}
		return idsPattern;
	}

	@Override
	public Collection<Pattern> getPatternsWithPriority(Integer priority) {
		if (priorityPatterns.isEmpty()){
			//Init the map before
			getAllPatternsWithPriorities();
		}
		return priorityPatterns.get(priority);
	}

	@Override
	public Collection<Pattern> getPatternsWithTopic(String id) {
		if (idsPattern.isEmpty()){
			//Init the map before
			getAllPatternsWithTopics();
		}
		return sortPatternsByPriority(idsPattern.get(id));
	}
	
	private Integer getPattern2Priority(Pattern p){
		if (patternToPriority.isEmpty()){
			Map<Integer, Collection<Pattern>> allPatternsWithPriorities = getAllPatternsWithPriorities();
			for(Entry<Integer, Collection<Pattern>> e: allPatternsWithPriorities.entrySet()){
				Collection<Pattern> value = e.getValue();
				for (Pattern pattern : value) {
					patternToPriority.put(pattern, e.getKey());
				}
			}
		}
		return patternToPriority.get(p);
	}
	
	
	private Collection<Pattern> sortPatternsByPriority(Collection<Pattern> toSort){

		if (toSort == null || toSort.isEmpty()){
			return Collections.emptySet();
		}
		
		List<Pattern> copy = new ArrayList<Pattern>();
		copy.addAll(toSort);
		
		int size = copy.size();
		List<Integer> priorities = new ArrayList<Integer>();
		Pattern[] result = new Pattern[size];
		int start = 0;
		int end = size - 1;
		
		for (Pattern pattern : copy) {
			priorities.add(getPattern2Priority(pattern));
		}
		Collections.sort(priorities);
		
		for (Integer i : priorities) {
			if (i == -1){
				while (result[end] != null){
					end--;
				}
				Pattern p = getPattern(copy, i);
				if (p != null){
					result[end] = p;
					copy.remove(result[end]);
				} else {
					//Should never occure. Maybe throw IllegaleStateException!
					logIllegaleStateError(i);
				}
			} else {
				while (result[start] != null){
					start++;
				}
				Pattern p = getPattern(copy, i);
				if (p != null){
					result[start] = p;
					copy.remove(result[start]);
				} else {
					//Should never occure. Maybe throw IllegaleStateException!
					logIllegaleStateError(i);
				}
			}
		}
		return Arrays.asList(result);
	}

	private void logIllegaleStateError(Integer i) {
		Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, 
				"Illegale State of the DocGen Extension Registry. Cannot find a patterns with priority " + i)); //$NON-NLS-1$
	}

	private Pattern getPattern(Collection<Pattern> toSort, Integer i) {
		Collection<Pattern> candidates = getPatternsWithPriority(i);
		for (Pattern pattern : toSort) {
			if (candidates.contains(pattern)){
				return pattern;
			}
		}
		return null;
	}

}
