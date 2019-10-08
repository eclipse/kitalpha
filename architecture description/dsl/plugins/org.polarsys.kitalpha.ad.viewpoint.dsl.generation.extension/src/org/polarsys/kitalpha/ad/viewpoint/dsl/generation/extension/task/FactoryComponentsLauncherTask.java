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

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.extension.task;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.domain.DomainException;
import org.eclipse.egf.domain.IDomainHelper;
import org.eclipse.egf.domain.emf.EMFDomainHelper;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.egf.ftask.producer.invocation.ITaskProduction;
import org.eclipse.egf.model.domain.EMFDomain;
import org.eclipse.egf.model.domain.LoadableDomain;
import org.eclipse.egf.model.domain.TypeDomain;
import org.eclipse.egf.model.domain.TypeGenPackages;
import org.eclipse.egf.model.fcore.Activity;
import org.eclipse.egf.model.fcore.Contract;
import org.eclipse.egf.model.fcore.FactoryComponent;
import org.eclipse.egf.model.pattern.TypePatternCallBackHandler;
import org.eclipse.egf.model.types.Type;
import org.eclipse.egf.model.types.TypeBigDecimal;
import org.eclipse.egf.model.types.TypeBigInteger;
import org.eclipse.egf.model.types.TypeBoolean;
import org.eclipse.egf.model.types.TypeByte;
import org.eclipse.egf.model.types.TypeCharacter;
import org.eclipse.egf.model.types.TypeCollection;
import org.eclipse.egf.model.types.TypeDate;
import org.eclipse.egf.model.types.TypeDouble;
import org.eclipse.egf.model.types.TypeFloat;
import org.eclipse.egf.model.types.TypeInteger;
import org.eclipse.egf.model.types.TypeList;
import org.eclipse.egf.model.types.TypeLong;
import org.eclipse.egf.model.types.TypeShort;
import org.eclipse.egf.model.types.TypeString;
import org.eclipse.egf.model.types.TypeURI;
import org.eclipse.emf.common.util.URI;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.event.type.GenerationBeginEvent;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.event.type.GenerationEndEvent;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.extension.constant.IContractNames;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.extension.constant.Messages;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.extension.utils.InvocationHelper;

/**
 * @author Boubekeur Zendagui
 */

public class FactoryComponentsLauncherTask implements ITaskProduction {

	@SuppressWarnings("unchecked")
	public void doExecute(ITaskProductionContext productionContext,
								IProgressMonitor monitor) throws InvocationException {
		List<URI> factoryComponentsListValue = productionContext.getInputValue(IContractNames.factoryComponentsList, ArrayList.class);
		Map<String, Object> factoryComponentConstractsValue = productionContext.getInputValue(IContractNames.factoryComponentConstracts, Map.class);
		
		if (factoryComponentsListValue == null)
			throw new IllegalArgumentException(Messages.Contract_Empty_FactoryComponentsList);
		
		for (URI uri : factoryComponentsListValue) 
		{
			Activity extensionLauncher = InvocationHelper.getActivity(uri);
			if (extensionLauncher instanceof FactoryComponent)
			{
				FactoryComponent factoryComponent = (FactoryComponent) extensionLauncher;
				setContractsValues(factoryComponent, factoryComponentConstractsValue);
				new GenerationBeginEvent(factoryComponent).fire();
				InvocationHelper.validateAndInvoke(factoryComponent, monitor);
				new GenerationEndEvent(factoryComponent).fire();
			}
		}
	}
	
	private void setContractsValues(FactoryComponent fc, Map<String, Object> contracts){
		for (Map.Entry<String, Object> iEntry : contracts.entrySet()) {
			String contractName = iEntry.getKey();
			Object contractValue = iEntry.getValue();
			Contract contract = fc.getContract(contractName);
			if (contract != null)
				setContractCorrectValue(contractValue, contract);
		}
	}

	/**
	 * This method cast the @param contractValue to the contract type and set the contract value
	 * @param contractValue
	 * @param contract
	 */
	private void setContractCorrectValue(Object contractValue, Contract contract) {
		if (contract != null && contractValue != null){
			Type type = contract.getType();

			if (type instanceof TypeCollection ||
					type instanceof TypeList ||
					type instanceof TypeGenPackages ||
					type instanceof TypePatternCallBackHandler)
			{
				// TODO : Manage this type of contracts
				// TODO : manage the other types 
			}
			
			if (type instanceof TypeDomain)
			{
				TypeDomain typeDomain = (TypeDomain) type;
				typeDomain.setDomain((EMFDomain)contractValue);
				contract.setType(typeDomain);
				if (typeDomain.getDomain() instanceof LoadableDomain)
				{
					LoadableDomain lDomain = (LoadableDomain) typeDomain.getDomain();
					if (! lDomain.isLoaded())
					{
						IDomainHelper helper = new EMFDomainHelper();
						try 
						{
							helper.loadDomain(lDomain);
						} catch (DomainException e) {
							e.printStackTrace();
						}
					}
				}
			}
			
			if (type instanceof TypeBoolean)
			{
				TypeBoolean typeBoolean = (TypeBoolean) type;
				typeBoolean.setValue((Boolean)contractValue);
			}
			
			if (type instanceof TypeString)
			{
				TypeString typeString = (TypeString) type;
				typeString.setValue((String)contractValue);
			}
			
			if (type instanceof TypeInteger)
			{
				TypeInteger typeInteger = (TypeInteger) type;
				typeInteger.setValue((Integer)contractValue);
			}
			
			if (type instanceof TypeBigDecimal)
			{
				TypeBigDecimal typeBigDecimal = (TypeBigDecimal) type;
				typeBigDecimal.setValue((BigDecimal)contractValue);
			}
			
			if (type instanceof TypeBigInteger)
			{
				TypeBigInteger typeBigInteger = (TypeBigInteger) type;
				typeBigInteger.setValue((BigInteger)contractValue);
			}
			
			if (type instanceof TypeByte)
			{
				TypeByte typeByte = (TypeByte) type;
				typeByte.setValue((Byte)contractValue);
			}
			
			if (type instanceof TypeCharacter)
			{
				TypeCharacter typeCharacter = (TypeCharacter) type;
				typeCharacter.setValue((Character)contractValue);
			}
			
			if (type instanceof TypeDate)
			{
				TypeDate dypeDate = (TypeDate) type;
				dypeDate.setValue((Date)contractValue);
			}
			
			if (type instanceof TypeDouble)
			{
				TypeDouble typeDouble = (TypeDouble) type;
				typeDouble.setValue((Double)contractValue);
			}
			
			if (type instanceof TypeFloat)
			{
				TypeFloat typeFloat = (TypeFloat) type;
				typeFloat.setValue((Float)contractValue);
			}
			
			if (type instanceof TypeLong)
			{
				TypeLong typeLong = (TypeLong) type;
				typeLong.setValue((Long)contractValue);
			}
			
			if (type instanceof TypeShort)
			{
				TypeShort typeShort = (TypeShort) type;
				typeShort.setValue((Short)contractValue);
			}
			
			if (type instanceof TypeURI)
			{
				TypeURI typeShort = (TypeURI) type;
				typeShort.setValue((URI)contractValue);
			}
		}
	}
	
	/******************
	 ***** Unused *****
	 ******************/
	public void preExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
	}
	
	public void postExecute(ITaskProductionContext productionContext,
			IProgressMonitor monitor) throws InvocationException {
	}

}
