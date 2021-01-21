/*******************************************************************************
 * Copyright (c) 2017, 2020 Thales Global Services.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.predicate.internal.extension.manager;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.polarsys.kitalpha.ad.viewpoint.predicate.factories.FactoryProvider;
import org.polarsys.kitalpha.ad.viewpoint.predicate.interfaces.Action;
import org.polarsys.kitalpha.ad.viewpoint.predicate.interfaces.Predicate;
import org.polarsys.kitalpha.ad.viewpoint.predicate.interfaces.Transition;
import org.polarsys.kitalpha.ad.viewpoint.predicate.internal.Activator;
import org.polarsys.kitalpha.ad.viewpoint.predicate.internal.engine.impl.InternalTransition;

/**
 * 
 * @author Faycal Abka
 *
 */
public class TransitionExtensionManager extends AbstractExtensionManager {
	
	private static final TransitionExtensionManager INSTANCE = new TransitionExtensionManager();
	
	public static synchronized TransitionExtensionManager getInstance(){
		return INSTANCE;
	}
	
	/**
	 * 
	 * @param viewpointID
	 * @param actionID
	 * @return
	 * @throws CoreException 
	 */
	public Transition retriveTransition(String viewpointID, String actionID) {
		
		IConfigurationElement[] transitions = getExtensionFor.apply(ExtensionConstantes.TRANSITION_EXTENSION_POINT);
		Stream<IConfigurationElement> stream = Arrays.stream(transitions);
		
		List<IConfigurationElement> filtredTransactions = stream.filter(e -> e.getAttribute(ExtensionConstantes.VIEWPOINT_ID_ATTRIBUTE).equals(viewpointID) &&
				e.getAttribute(ExtensionConstantes.ACTION_ID_ATTRIBUTE).equals(actionID)).collect(Collectors.toList());
		
		try {
			Action action = ActionExtensionManager.getInstance().retriveAction(actionID);
			InternalTransition transition = (InternalTransition) FactoryProvider.getTransitionFactory().createTransition(viewpointID, actionID, action);
			
			for (IConfigurationElement c : filtredTransactions) {
				IConfigurationElement[] children = c.getChildren();
				Stream<IConfigurationElement> childrenStream = Arrays.stream(children);
				List<String> predicateIDs = childrenStream.filter(e -> e.getName().equals(ExtensionConstantes.PREDICATE_ELEMENT)).map(e -> e.getAttribute(ExtensionConstantes.PREDICATE_ID_ATTRIBUTE)).collect(Collectors.toList());
				
				for (String pid : predicateIDs) {
					IConfigurationElement elt = PredicateExtensionManager.getInstance().retrivePredicateConfigurationElement(pid);
					Predicate predicate = PredicateExtensionManager.getInstance().createPredicate(elt);
					transition.addPredicate(pid, predicate);
					
					//Get Diagnositic message
					String message = PredicateExtensionManager.getInstance().getDiagnosticMessageForPredicate(elt);
					if (message != null && !message.isEmpty()){
						transition.addDiagnostic(pid, message);
					}
				}
			}
			
			return transition;
		} catch (CoreException e1) {
			Status status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, "An error is occured while reading transition extension point", e1);
			Activator.getDefault().getLog().log(status);
		}
		
		return FactoryProvider.getTransitionFactory().createTransition("", "", ExtensionConstantes.NOP, new HashMap<>());
		
	}

}
