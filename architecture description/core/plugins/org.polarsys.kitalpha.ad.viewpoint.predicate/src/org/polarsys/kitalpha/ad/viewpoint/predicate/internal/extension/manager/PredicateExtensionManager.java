/*******************************************************************************
 * Copyright (c) 2017, 2018 Thales Global Services.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.predicate.internal.extension.manager;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.polarsys.kitalpha.ad.viewpoint.predicate.interfaces.Predicate;
import org.polarsys.kitalpha.ad.viewpoint.predicate.internal.Activator;

/**
 * Extension point manager for predicates
 * 
 * @author Faycal Abka
 *
 */
public class PredicateExtensionManager extends AbstractExtensionManager {
	
	private static final PredicateExtensionManager INSTANCE = new PredicateExtensionManager();
	
	public static synchronized PredicateExtensionManager getInstance(){
		return INSTANCE;
	}
	
	public String getDiagnosticMessageForPredicate(IConfigurationElement e){
		IConfigurationElement[] children = e.getChildren();
		if (children != null && children.length > 0){
			for (IConfigurationElement c : children) {
				if (c.getName().equals(ExtensionConstantes.PREDICATE_DIAG_MESSAGE)){
					return c.getValue();
				}
			}
		}
		return null;
	}
	
	public IConfigurationElement retrivePredicateConfigurationElement(String id) throws CoreException {
		IConfigurationElement[] predicateExtensions = getExtensionFor.apply(ExtensionConstantes.PREDICAT_EXTENSION_POINT);
		Stream<IConfigurationElement> stream = Arrays.stream(predicateExtensions);
		List<IConfigurationElement> predicates = stream.filter(
				e -> e.getAttribute(ExtensionConstantes.ID_ATTRIBUTE).equals(id)).collect(Collectors.toList());
		
		//One contribution found for the id
		if (predicates.size() == 1){
			return predicates.get(0);
		}

		//On or more
		if (predicates.size() > 1){
			Status status = new Status(IStatus.WARNING, Activator.PLUGIN_ID, "More than one contribution found for the id: " + id + ". Only the first is taken in account");
			Activator.getDefault().getLog().log(status);
			return predicates.get(0);
		}
		
		
		Status status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, "No contribution found for Predicate ID: " + id);
		throw new CoreException(status);
	}
	
	
	

	public Predicate createPredicate(IConfigurationElement predicate) throws CoreException {
		return (Predicate) predicate.createExecutableExtension(ExtensionConstantes.CLASS_ATTRIBUTE);
	}

}
