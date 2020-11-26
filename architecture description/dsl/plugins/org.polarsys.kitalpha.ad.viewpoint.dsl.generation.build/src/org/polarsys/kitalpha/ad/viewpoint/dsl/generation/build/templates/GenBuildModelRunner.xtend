/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.build.templates

import org.eclipse.egf.model.domain.DomainFactory
import org.eclipse.egf.model.domain.DomainViewpoint
import org.eclipse.egf.model.domain.EMFDomain
import org.eclipse.egf.model.domain.TypeDomain
import org.eclipse.egf.model.fcore.Activity
import org.eclipse.egf.model.fcore.FactoryComponent
import org.eclipse.egf.model.fcore.FcoreFactory
import org.eclipse.egf.model.fcore.InvocationContract
import org.eclipse.egf.model.fcore.InvocationContractContainer
import org.eclipse.egf.model.fcore.ViewpointContainer
import org.eclipse.egf.model.fprod.FprodFactory
import org.eclipse.egf.model.fprod.ProductionPlan
import org.eclipse.egf.model.fprod.ProductionPlanInvocation
import org.eclipse.egf.model.types.TypeString
import org.eclipse.egf.model.types.TypesFactory
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl


class GenBuildModelRunner {
	
	val String BUILD_ACTIVITY = "org.eclipse.egf.portfolio.eclipse.build/egf/Build.fcore"
	val String BUILD_ACTIVITY_ID = "_N4pRwI6UEd-e7viTqNBNrA"
	val String BUILD_MODEL_PATH = "buildModelPath"
	val String GENERATION_PATH = "generationPath"
	
	def FactoryComponent doGenerate(String domainViewpointURI, String lvpsShortName, String generationPath) {	
		val FactoryComponent fc = FcoreFactory::eINSTANCE.createFactoryComponent()	
		fc.setName("run_"+lvpsShortName)
		val URI uri = URI::createPlatformResourceURI(domainViewpointURI, false)		
		val ViewpointContainer viewpointContainer = FcoreFactory::eINSTANCE.createViewpointContainer();
		fc.setViewpointContainer(viewpointContainer)	
			val ProductionPlan plan = FprodFactory::eINSTANCE.createProductionPlan()
				val ProductionPlanInvocation invocation = FprodFactory::eINSTANCE.createProductionPlanInvocation()
				//Invoke build activity
				val ResourceSet resourceSet = new ResourceSetImpl()
				val Resource activityResource = resourceSet.getResource(URI::createPlatformPluginURI(BUILD_ACTIVITY, false), true)
				val Activity activity = activityResource.getEObject(BUILD_ACTIVITY_ID) as Activity
				invocation.setInvokedActivity(activity)			
					val InvocationContractContainer contractContainer = FcoreFactory::eINSTANCE.createInvocationContractContainer()
						// Create domain viewpoint
    					val DomainViewpoint domainViewpoint = DomainFactory::eINSTANCE.createDomainViewpoint();
    					viewpointContainer.getViewpoints().add(domainViewpoint);
						val EMFDomain emfDomain = DomainFactory::eINSTANCE.createEMFDomain();
    					emfDomain.setUri(uri);
                        domainViewpoint.getDomains().add(emfDomain); 					
    					//build model path contract
    					val InvocationContract buildModelPathContract = FcoreFactory::eINSTANCE.createInvocationContract()
						val TypeDomain typeDomain = DomainFactory::eINSTANCE.createTypeDomain()
						typeDomain.setDomain(emfDomain)
						buildModelPathContract.setType(typeDomain)
						buildModelPathContract.setInvokedContract(activity.getContract(BUILD_MODEL_PATH))					
						//generation path contract
						val InvocationContract generationPathContract = FcoreFactory::eINSTANCE.createInvocationContract()
						val TypeString typeString = TypesFactory::eINSTANCE.createTypeString()	
						typeString.setValue(URI::createPlatformResourceURI(generationPath, false).toString)
						generationPathContract.setType(typeString)
						generationPathContract.setInvokedContract(activity.getContract(GENERATION_PATH))							
					contractContainer.invocationContracts.add(buildModelPathContract)
					contractContainer.invocationContracts.add(generationPathContract)
				invocation.setInvocationContractContainer(contractContainer)
			plan.invocations.add(invocation)		
		fc.setOrchestration(plan)
		return fc
	}
}