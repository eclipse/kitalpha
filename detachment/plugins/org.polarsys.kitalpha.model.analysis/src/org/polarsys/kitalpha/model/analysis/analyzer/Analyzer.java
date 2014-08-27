/*******************************************************************************
 * Copyright (c) 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.model.analysis.analyzer;

import java.util.Collection;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.resource.Resource;
import org.polarsys.kitalpha.model.analysis.Messages;
import org.polarsys.kitalpha.model.analysis.registry.ModelAnalysisRegistry;
import org.polarsys.kitalpha.model.analysis.registry.ModelAnalysisRegistry.RegistryElement;
import org.polarsys.kitalpha.model.analysis.visitor.FinderVisitor;

/**
 * @author Faycal Abka
 */
public class Analyzer {
	
	private static Logger LOGGER = Logger.getLogger(Analyzer.class);
	
	
	public static void startAnalysis(Resource resource){
		FinderVisitor visitor = new FinderVisitor();
		visitor.accept(resource);
	}
	
	public static RegistryElement getRegistryElement(String id) 
			throws ModelAnalyzerException {
		
		if (isKnownId(id))
			return ModelAnalysisRegistry.INSTANCE.getRegistryElement(id);
		
		String message = Messages.NO_SUCH_REGISTRY_ELEMENT;
		message = message + ": " + id;
		
		ModelAnalyzerException e = new ModelAnalyzerException(message);
		LOGGER.error(message, e);
		
		throw e;
		
	}
	
	public static Collection<RegistryElement> getAllRegistryElement(){
		return ModelAnalysisRegistry.INSTANCE.getRegistry().values();
	}
	
	public static Set<String> getAllFindersId(){
		return ModelAnalysisRegistry.INSTANCE.getRegistry().keySet();
	}
	
	public static boolean isKnownId(String id){
		return getAllFindersId().contains(id);
	}
}
