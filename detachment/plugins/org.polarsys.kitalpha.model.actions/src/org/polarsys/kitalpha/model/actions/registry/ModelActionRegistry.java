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
package org.polarsys.kitalpha.model.actions.registry;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.polarsys.kitalpha.model.actions.action.ModelAction;
import org.polarsys.kitalpha.model.actions.constants.Constants;

/**
 * @author Faycal Abka
 */
public class ModelActionRegistry {
	
	private static Logger LOGGER = Logger.getLogger(ModelActionRegistry.class);
	
	private Map<String, RegistryActionElement> registry;
	
	public final static ModelActionRegistry INSTANCE = new ModelActionRegistry();
	
	private ModelActionRegistry(){
		this.registry = new HashMap<String, RegistryActionElement>();
	}
	
	
	public Map<String, RegistryActionElement> initRegistry(){
		
		dispose();
		
		//Read all extensions
		IExtension [] extensions = RegistryHelper.getAllExtensionsFor(Constants.ACTION_EXTENSION_POINT);
		
		if (extensions != null && extensions.length > 0){
			for (IExtension extension : extensions) {
				for(IConfigurationElement config: extension.getConfigurationElements()){
					if (config.getName().equals(Constants.ACTION)){
						String id = config.getAttribute(Constants.ACTION_ID);
						String finderId = config.getAttribute(Constants.ACTION_FINDER_ID);
						String className = config.getAttribute(Constants.ACTION_CLASS);
						
						try {
							if (className != null && !className.isEmpty()){
								String priorityStr = config.getAttribute(Constants.PRIORITY_ATTR);
								float priority = Float.parseFloat(priorityStr);
								
								Object action = config.createExecutableExtension(Constants.ACTION_CLASS);
								ModelAction modelAction = (ModelAction)action;

								if (finderId != null && !finderId.isEmpty())
									modelAction.setModelAnalysisID(finderId);

								registry.put(id, new RegistryActionElement(priority, modelAction));
							}
						} catch (CoreException e) {
							e.printStackTrace();
							LOGGER.error(e.getMessage(), e);
						}
					}
				}
			}
		}
		
		return registry;
	}
	
	
	public void dispose(){
		this.registry.clear();
	}
	
	
	public static class RegistryActionElement implements Comparable<RegistryActionElement>{
		
		private final float priority;
		private ModelAction action;
		
		public RegistryActionElement(float priority, ModelAction action){
			this.priority = priority;
			this.action = action;
		}

		public float getPriority() {
			return priority;
		}

		public ModelAction getAction() {
			return action;
		}


		@Override
		public int compareTo(RegistryActionElement arg0) {
			
			if (getPriority() - arg0.getPriority() < 0)
				return 1;
			
			return 0;
		}
		
	}

}
