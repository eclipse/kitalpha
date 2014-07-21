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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.util;

import java.util.Collection;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.Configuration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.ConfigurationElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.ExtensionGeneratrionConfiguration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpconf.Generation;

/**
 * @author Boubekeur Zendagui
 */

/**
 * @generated NOT
 */

public class ConfigurationElementsAdditionsHelper {

	/**
	 * @generated NOT
	 */
	public static boolean canAddMoreConfigurationElement(EObjectContainmentEList<ConfigurationElement> vpConfElements, 
			ConfigurationElement confElement){
		EClass aClazz = confElement.eClass();
		for (EObject eObject : vpConfElements){
			if (aClazz == eObject.eClass()){
				return false;
			}
		}
		return true;
	}
	
	/**
	 * @generated NOT
	 */
	public static boolean canAddMoreConfigurationElements(EObjectContainmentEList<ConfigurationElement> vpConfElements, 
										Collection<? extends ConfigurationElement> confElements){
		for (EObject aspectToAdd : confElements) {
			EClass aClazz = aspectToAdd.eClass();
			for (EObject vpAspect : vpConfElements) {
				if (aClazz == vpAspect.eClass())
					return false;
			}
		}
		return true;
	}
	
	/**
	 * @generated NOT
	 */
	public static boolean canAddMoreConfigurationElement(Configuration vpConfiguration, ConfigurationElement confElement){
		EClass aClazz = confElement.eClass();
		for (EObject eObject : vpConfiguration.getVpConfigurationElements())
		{
			if (aClazz == eObject.eClass())
				return false;
		}
		return true;
	}
	
	public static boolean canAddMoreExtensionGenConf(Generation gen, ExtensionGeneratrionConfiguration ext){
		EClass aClazz = ext.eClass();
		for (EObject eObject : gen.getOwnedExtensionGenConf())
		{
			if (aClazz.equals(eObject.eClass()))
				return false;
		}
		return true;
	}

	/**
	 * @generated NOT
	 */
	public static boolean canAddMoreConfigurationElements(Configuration vpConfiguration, 
			Collection<? extends ConfigurationElement> confElement){
		for (ConfigurationElement aspectToAdd : confElement) {
			EClass aClazz = aspectToAdd.eClass();
			for (ConfigurationElement vpConfElement : vpConfiguration.getVpConfigurationElements()) {
				if (aClazz == vpConfElement.eClass())
					return false;
			}
		}
		return true;
	}
	
}
