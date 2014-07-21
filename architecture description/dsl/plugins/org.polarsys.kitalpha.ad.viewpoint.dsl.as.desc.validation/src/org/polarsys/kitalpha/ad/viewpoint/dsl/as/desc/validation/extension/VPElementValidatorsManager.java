/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.extension;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;

/**
 * @author Boubekeur Zendagui
 */

public class VPElementValidatorsManager {
	
	public static final String PLUGIN_ID = "org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation"; //$NON-NLS-1$
	
	public static final String EXTENSION_ID__CORE_CONSTRAINT = "org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.coreConstraintContribution"; //$NON-NLS-1$
	public static final String EXTENSION_ID__ADDITIONAL_CONSTRAINT = "org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.validation.additionalConstraint"; //$NON-NLS-1$
	public static final String ELEMENT_ID__CORE_CONSTRAINT__CONTRIBUTION = "contribution"; //$NON-NLS-1$
	public static final String ELEMENT_ID__ADDITIONAL_CONSTRAINT__ADDITION = "addition"; //$NON-NLS-1$
	public static final String ATTRIBUTE__NAME = "name"; //$NON-NLS-1$
	public static final String ATTRIBUTE__CLASS = "class"; //$NON-NLS-1$
	public static final String ATTRIBUTE__CONSTRAINT = "constraint"; //$NON-NLS-1$
	
	private static Map<String, List<ICoreConstraintContribution>> registeredValidators = new HashMap<String, List<ICoreConstraintContribution>>();
	
	private static Map<String, List<IAdditionalConstraint>> registeredFreeValidators = new HashMap<String, List<IAdditionalConstraint>>();
	
	
	// This method is called when the platform starts 
	public static void initValidators() throws CoreException{
		loadCoreConstraintContributions();
		loadAdditionalConstraints();
	}
	
	/*
	 * Extensible EMF Validation Rules extension Manager
	 */
	public static void loadCoreConstraintContributions() throws CoreException{
		IConfigurationElement[] config =Platform.getExtensionRegistry().getConfigurationElementsFor(EXTENSION_ID__CORE_CONSTRAINT);
		
		if (config.length != 0)
		{
			for (IConfigurationElement iConfigurationElement : config) 
			{
				if (iConfigurationElement.getName().equals(ELEMENT_ID__CORE_CONSTRAINT__CONTRIBUTION))
				{
					String constraint = iConfigurationElement.getAttribute(ATTRIBUTE__CONSTRAINT);
					constraint = PLUGIN_ID+"."+constraint;
					if (registeredValidators.get(constraint) == null)
						registeredValidators.put(constraint, new ArrayList<ICoreConstraintContribution>());
					
					ICoreConstraintContribution vpElementValidator = 
							(ICoreConstraintContribution)iConfigurationElement.createExecutableExtension(ATTRIBUTE__CLASS);
					
					registeredValidators.get(constraint).add(vpElementValidator);
				}
			}
		}
	}
	
	public static List<ICoreConstraintContribution> getValidatorFor(String constraintProviderID){
		if (! registeredValidators.isEmpty())
			return registeredValidators.get(constraintProviderID);
		
		return null;
	}
	
	/*
	 * Extensible EMF Validation Free Rule extension Manager
	 */
	public static void loadAdditionalConstraints() throws CoreException{
		IConfigurationElement[] config =Platform.getExtensionRegistry().getConfigurationElementsFor(EXTENSION_ID__ADDITIONAL_CONSTRAINT);
		if (config.length != 0)
		{
			for (IConfigurationElement iConfigurationElement : config)
			{
				if (iConfigurationElement.getName().equals(ELEMENT_ID__ADDITIONAL_CONSTRAINT__ADDITION))
				{
					String constraint = iConfigurationElement.getAttribute(ATTRIBUTE__CONSTRAINT);
					constraint = PLUGIN_ID+"."+constraint;
					if (registeredFreeValidators.get(constraint) == null)
						registeredFreeValidators.put(constraint, new ArrayList<IAdditionalConstraint>());
					
					IAdditionalConstraint vpElementValidator = 
							(IAdditionalConstraint)iConfigurationElement.createExecutableExtension(ATTRIBUTE__CLASS);
					
					registeredFreeValidators.get(constraint).add(vpElementValidator);
				}
			}
		}
	}
	
	public static List<IAdditionalConstraint> getFreeValidatorFor(String constraintProviderID){
		if (! registeredFreeValidators.isEmpty())
			return registeredFreeValidators.get(constraintProviderID);
	
		return null;
	}
}
