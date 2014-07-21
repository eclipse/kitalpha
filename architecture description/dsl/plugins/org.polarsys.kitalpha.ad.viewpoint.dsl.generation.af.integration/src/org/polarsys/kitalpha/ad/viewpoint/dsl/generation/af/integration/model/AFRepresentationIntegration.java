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

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.af.integration.model;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.sirius.viewpoint.description.Group;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.af.integration.bundles.AFBundlesIntegration;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.af.integration.exception.AFIntegrationException;

/**
 * @author Boubekeur Zendagui
 */

public class AFRepresentationIntegration {
	
	private static AFRepresentationIntegration INSTANCE = null;
	
	/**
	 * This serves to add Representation in an existing AF model.
	 */
	private static List<Group> dRepresentationToRegister ;
	
	public AFRepresentationIntegration() {
		dRepresentationToRegister = new ArrayList<Group>();
	}
	
	public static AFRepresentationIntegration getInstance(){
		if (INSTANCE == null)
			INSTANCE = new AFRepresentationIntegration();
		
		return INSTANCE;
	}

	public List<Group> getRepresentationToRegister(){
		return dRepresentationToRegister;
	}
	
	/**
	 * This method allows to register a viewpoint Group in the representations list.
	 * By the way, the bundle containing the resource that contain this object is $
	 * registered in the bundle list.  
	 * @param group
	 * @throws AFIntegrationException
	 */
	public void registerDoremiRepresentation(Group group) throws AFIntegrationException{
		if (! dRepresentationToRegister.contains(group))
		{
			dRepresentationToRegister.add(group);
			
			AFBundlesIntegration.getInstance().registerBundle(group);
		}
		else
			throw new AFIntegrationException(AFIntegrationException.EPackage, AFIntegrationException.component_Existing_MSG);
	}
}
