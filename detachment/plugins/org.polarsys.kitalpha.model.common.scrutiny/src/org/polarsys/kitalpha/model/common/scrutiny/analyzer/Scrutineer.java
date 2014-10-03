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
package org.polarsys.kitalpha.model.common.scrutiny.analyzer;

import java.util.Collection;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.resource.Resource;
import org.polarsys.kitalpha.model.common.scrutiny.Messages;
import org.polarsys.kitalpha.model.common.scrutiny.registry.ModelScrutinyRegistry;
import org.polarsys.kitalpha.model.common.scrutiny.registry.ModelScrutinyRegistry.RegistryElement;
import org.polarsys.kitalpha.model.common.scrutiny.visitor.ScrutinizeVisitor;

/**
 * @author Faycal Abka
 */
public class Scrutineer {
	
	private static Logger LOGGER = Logger.getLogger(Scrutineer.class);
	
	
	public static void startScrutiny(Resource resource){
		ScrutinizeVisitor visitor = new ScrutinizeVisitor();
		visitor.accept(resource);
	}
	
	public static RegistryElement getRegistryElement(String id) 
			throws ModelScrutinyException {
		
		if (isKnownScrutinizeId(id))
			return ModelScrutinyRegistry.INSTANCE.getRegistryElement(id);
		
		String message = Messages.NO_SUCH_REGISTRY_ELEMENT;
		message = message + ": " + id;
		
		ModelScrutinyException e = new ModelScrutinyException(message);
		LOGGER.error(message, e);
		
		throw e;
		
	}
	
	public static Collection<RegistryElement> getAllRegistryElement(){
		return ModelScrutinyRegistry.INSTANCE.getRegistry().values();
	}
	
	public static Set<String> getAllScrutinizeId(){
		return ModelScrutinyRegistry.INSTANCE.getRegistry().keySet();
	}
	
	public static boolean isKnownScrutinizeId(String id){
		return getAllScrutinizeId().contains(id);
	}
}
