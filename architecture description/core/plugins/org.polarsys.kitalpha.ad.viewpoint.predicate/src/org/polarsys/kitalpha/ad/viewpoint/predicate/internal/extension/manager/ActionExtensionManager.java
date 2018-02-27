/*******************************************************************************
 * Copyright (c) 2017 Thales Global Services.
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
import org.polarsys.kitalpha.ad.viewpoint.predicate.interfaces.Action;
import org.polarsys.kitalpha.ad.viewpoint.predicate.internal.Activator;

/**
 * Extension point manager for actions
 * 
 * @author Faycal Abka
 *
 */
public class ActionExtensionManager extends AbstractExtensionManager {
	
	private static final ActionExtensionManager INSTANCE = new ActionExtensionManager();
	
	public static synchronized ActionExtensionManager getInstance(){
		return INSTANCE;
	}
	
	/**
	 * Find a contributed action 
	 * @param id of the contributed action
	 * @return the first contributed action found
	 * @throws CoreException
	 */
	public Action retriveAction(String id) throws CoreException {
		IConfigurationElement[] actionsExtensions = getExtensionFor.apply(ExtensionConstantes.ACTION_EXTENSION_POINT);
		Stream<IConfigurationElement> stream = Arrays.stream(actionsExtensions);
		List<IConfigurationElement> actions = stream.filter(
				e -> e.getAttribute(ExtensionConstantes.ID_ATTRIBUTE).equals(id)).collect(Collectors.toList());
		
		//One contribution found for the id
		if (actions.size() == 1){
			return createAction(actions);
		}
		
		//On or more
		if (actions.size() > 1){
			Status status = new Status(IStatus.WARNING, Activator.PLUGIN_ID, "More than one contribution found for the id: " + id + ". Only the first is taken in account");
			Activator.getDefault().getLog().log(status);
			return createAction(actions);
		}
		Status status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, "No contribution found for Action ID: " + id);
		throw new CoreException(status);
		
	}

	private Action createAction(List<IConfigurationElement> actions) throws CoreException {
		return (Action) actions.get(0).createExecutableExtension(ExtensionConstantes.CLASS_ATTRIBUTE);
	}

}
