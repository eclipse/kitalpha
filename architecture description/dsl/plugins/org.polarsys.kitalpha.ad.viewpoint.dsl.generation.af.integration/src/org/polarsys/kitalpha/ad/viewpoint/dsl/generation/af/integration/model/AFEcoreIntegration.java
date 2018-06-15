/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.af.integration.model;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.af.integration.bundles.AFBundlesIntegration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.af.integration.exception.AFIntegrationException;


/**
 * @author Boubekeur Zendagui
 */

public class AFEcoreIntegration {
	
	private static AFEcoreIntegration INSTANCE = null;
	
	/**
	 * This serves to add Meta-models in an existing AF model.
	 */
	private static final List<EPackage> ePackagesToRegister = new ArrayList<EPackage>();
	
	public AFEcoreIntegration() {
	}
	
	public static AFEcoreIntegration getInstance(){
		if (INSTANCE == null) {
			INSTANCE = new AFEcoreIntegration();
		}
		
		return INSTANCE;
	}
	
	
	public List<EPackage> getEPackageToRegister(){
		return ePackagesToRegister;
	}
	
	/**
	 * This method allows to register an ePackage in the ePackagesToRegister list.
	 * By the way, the bundle containing the resource that contain this object is $
	 * registered in the bundle list.
	 * @param ePackage
	 * @throws AFIntegrationException
	 */
	public void registerEPackage(EPackage ePackage) throws AFIntegrationException 
	{
		if (! isEPackageRegistered(ePackage))
		{
			// Register the EPackage
			ePackagesToRegister.add(ePackage);
			// Register bundle containing the EPackage
			AFBundlesIntegration.getInstance().registerBundle(ePackage);
		} else {
			throw new AFIntegrationException(AFIntegrationException.EPackage, AFIntegrationException.component_Existing_MSG);
		}
	}
	
	/**
	 * Check if the EPackage is already registered in the ePackagesToRegister list
	 * @param ePackage
	 * @return
	 */
	private boolean isEPackageRegistered(EPackage ePackage){
		for (EPackage iEPackage : ePackagesToRegister) {
			if (iEPackage.getName().equals(ePackage.getName()) &&
					iEPackage.getNsURI().equals(ePackage.getNsURI()))
			{
				return true;
			}
		}
		return false;
	}

}
