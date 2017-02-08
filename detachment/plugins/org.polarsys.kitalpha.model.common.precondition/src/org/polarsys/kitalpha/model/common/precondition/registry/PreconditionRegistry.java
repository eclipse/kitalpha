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
package org.polarsys.kitalpha.model.common.precondition.registry;

import java.util.HashSet;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.polarsys.kitalpha.model.common.precondition.constants.Constants;
import org.polarsys.kitalpha.model.common.precondition.interfaces.IPrecondition;

/**
 * 
 * @author Faycal Abka
 * @param <T>
 *
 */
public class PreconditionRegistry {
	
	public static final Logger LOGGER = Logger.getLogger(PreconditionRegistry.class);
	
	public static final PreconditionRegistry INSTANCE = new PreconditionRegistry();
	
	private Set<RegistryPreconditionElement> registry;
	
	private PreconditionRegistry(){
		this.registry = new HashSet<PreconditionRegistry.RegistryPreconditionElement>();
	}

	@SuppressWarnings("rawtypes")
	public Set<RegistryPreconditionElement> initRegistry(){
		
		dispose();
		
		IExtension [] extensions = RegistryHelper.getAllExtensionsFor(Constants.EXTENSION_POINT_ID);

		if (extensions != null && extensions.length > 0){
			for (IExtension extension : extensions) {
				for(IConfigurationElement config: extension.getConfigurationElements()){
					if (config.getName().equals(Constants.PRECONDITION_ELT)){
						
						try {
							String priorityStr = config.getAttribute(Constants.PRIORITY_ATTR);
							float priority = 0;
							
							if (priorityStr != null && !priorityStr.isEmpty()){
								priority = Float.parseFloat(priorityStr);
							}
							
							Object precond = config.createExecutableExtension(Constants.CLASS_ATTR);
							IPrecondition precondition = (IPrecondition)precond;
							registry.add(new RegistryPreconditionElement(priority, precondition));
							
						} catch (CoreException e) {
							e.printStackTrace();
						}
						
					}
				}
			}
		}
		return registry;
	}
	
	
	private void dispose() {
		registry.clear();
	}


	@SuppressWarnings("rawtypes")
	public static class RegistryPreconditionElement implements Comparable<RegistryPreconditionElement>{

		private final float priority;
		private IPrecondition precondition;
		
		public RegistryPreconditionElement(float priority,
				IPrecondition precondition) {
			super();
			this.priority = priority;
			this.precondition = precondition;
		}


		public float getPriority() {
			return priority;
		}

		public IPrecondition getPrecondition() {
			return precondition;
		}


		@Override
		public int compareTo(RegistryPreconditionElement arg0) {
			if (getPriority() - arg0.getPriority() < 0)
				return 1;
			
			return 0;
		}
		
	}
	
}
