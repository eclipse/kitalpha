/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.helper.egf;

import org.eclipse.egf.model.domain.Domain;
import org.eclipse.egf.model.domain.DomainViewpoint;
import org.eclipse.egf.model.domain.EMFDomain;
import org.eclipse.egf.model.fcore.Contract;
import org.eclipse.egf.model.fcore.FactoryComponent;
import org.eclipse.egf.model.types.Type;
import org.eclipse.egf.model.types.TypeBoolean;
import org.eclipse.egf.model.types.TypeString;
import org.eclipse.emf.common.util.URI;

/**
 * @author Boubekeur Zendagui
 */

public class ContractHelper {

	/**
	 * Set the domain viewpoint of a factory component. Note that this method 
	 * use the first domain model defined in the domain viewpoint of the 
	 * factory component. 
	 * @param factoryComponent the factory component containing the contract.
	 * @param uri the model URI to load.
	 * @return The EMF domain wherein model is loaded 
	 */
	public static EMFDomain setDomain(FactoryComponent factoryComponent, String contractName, URI uri) {
		org.eclipse.egf.model.fcore.Viewpoint viewpoint = factoryComponent.getViewpointContainer().getViewpoint(DomainViewpoint.class);
		if (viewpoint instanceof DomainViewpoint) 
		{
			DomainViewpoint domainViewpoint = (DomainViewpoint) viewpoint;
			
			for (Domain domain : domainViewpoint.getDomains()) 
			{
				if (domain instanceof EMFDomain && domain.getName().equals(contractName)) 
				{
					EMFDomain domainURI = (EMFDomain) domain;
					domainURI.setUri(uri);
					return domainURI;
				}
			}
			
			
		}
		return null;
	}

	/**
	 * 
	 * @param factoryComponent the factory component containing the contract.
	 * @param contractName the name of the contract of type String.
	 * @param value the new value to set to the contract 
	 * @return the contract named @param contractName
	 */
	public static TypeString setStringContract(FactoryComponent factoryComponent, String contractName, String value) {
		Contract invokedContract = factoryComponent.getContract(contractName);
		Type type = invokedContract.getType();
		if (type instanceof TypeString) 
		{
			TypeString typeString = (TypeString) type;
			typeString.setValue(value);
			return typeString;
		}
		return null;
	}

	/**
	 * 
	 * @param factoryComponent the factory component containing the contract.
	 * @param contractName
	 * @param value
	 * @return
	 */
	public static TypeBoolean setBooleanContract(FactoryComponent factoryComponent, String contractName, boolean value) {
		Contract invokedContract = factoryComponent.getContract(contractName);
		Type type = invokedContract.getType();
		if (type instanceof TypeBoolean) 
		{
			TypeBoolean typeBoolean = (TypeBoolean) type;
			typeBoolean.setValue(value);
			return typeBoolean;
		}
		return null;
	}
}
