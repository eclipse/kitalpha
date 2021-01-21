/**
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 * 
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 */
package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.build.templates;

import org.eclipse.egf.model.domain.DomainFactory;
import org.eclipse.egf.model.domain.DomainViewpoint;
import org.eclipse.egf.model.domain.EMFDomain;
import org.eclipse.egf.model.domain.TypeDomain;
import org.eclipse.egf.model.fcore.Activity;
import org.eclipse.egf.model.fcore.FactoryComponent;
import org.eclipse.egf.model.fcore.FcoreFactory;
import org.eclipse.egf.model.fcore.InvocationContract;
import org.eclipse.egf.model.fcore.InvocationContractContainer;
import org.eclipse.egf.model.fcore.ViewpointContainer;
import org.eclipse.egf.model.fprod.FprodFactory;
import org.eclipse.egf.model.fprod.ProductionPlan;
import org.eclipse.egf.model.fprod.ProductionPlanInvocation;
import org.eclipse.egf.model.types.TypeString;
import org.eclipse.egf.model.types.TypesFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

@SuppressWarnings("all")
public class GenBuildModelRunner {
  private final String BUILD_ACTIVITY = "org.eclipse.egf.portfolio.eclipse.build/egf/Build.fcore";
  
  private final String BUILD_ACTIVITY_ID = "_N4pRwI6UEd-e7viTqNBNrA";
  
  private final String BUILD_MODEL_PATH = "buildModelPath";
  
  private final String GENERATION_PATH = "generationPath";
  
  public FactoryComponent doGenerate(final String domainViewpointURI, final String lvpsShortName, final String generationPath) {
    final FactoryComponent fc = FcoreFactory.eINSTANCE.createFactoryComponent();
    fc.setName(("run_" + lvpsShortName));
    final URI uri = URI.createPlatformResourceURI(domainViewpointURI, false);
    final ViewpointContainer viewpointContainer = FcoreFactory.eINSTANCE.createViewpointContainer();
    fc.setViewpointContainer(viewpointContainer);
    final ProductionPlan plan = FprodFactory.eINSTANCE.createProductionPlan();
    final ProductionPlanInvocation invocation = FprodFactory.eINSTANCE.createProductionPlanInvocation();
    final ResourceSet resourceSet = new ResourceSetImpl();
    final Resource activityResource = resourceSet.getResource(URI.createPlatformPluginURI(this.BUILD_ACTIVITY, false), true);
    EObject _eObject = activityResource.getEObject(this.BUILD_ACTIVITY_ID);
    final Activity activity = ((Activity) _eObject);
    invocation.setInvokedActivity(activity);
    final InvocationContractContainer contractContainer = FcoreFactory.eINSTANCE.createInvocationContractContainer();
    final DomainViewpoint domainViewpoint = DomainFactory.eINSTANCE.createDomainViewpoint();
    viewpointContainer.getViewpoints().add(domainViewpoint);
    final EMFDomain emfDomain = DomainFactory.eINSTANCE.createEMFDomain();
    emfDomain.setUri(uri);
    domainViewpoint.getDomains().add(emfDomain);
    final InvocationContract buildModelPathContract = FcoreFactory.eINSTANCE.createInvocationContract();
    final TypeDomain typeDomain = DomainFactory.eINSTANCE.createTypeDomain();
    typeDomain.setDomain(emfDomain);
    buildModelPathContract.setType(typeDomain);
    buildModelPathContract.setInvokedContract(activity.getContract(this.BUILD_MODEL_PATH));
    final InvocationContract generationPathContract = FcoreFactory.eINSTANCE.createInvocationContract();
    final TypeString typeString = TypesFactory.eINSTANCE.createTypeString();
    typeString.setValue(URI.createPlatformResourceURI(generationPath, false).toString());
    generationPathContract.setType(typeString);
    generationPathContract.setInvokedContract(activity.getContract(this.GENERATION_PATH));
    contractContainer.getInvocationContracts().add(buildModelPathContract);
    contractContainer.getInvocationContracts().add(generationPathContract);
    invocation.setInvocationContractContainer(contractContainer);
    plan.getInvocations().add(invocation);
    fc.setOrchestration(plan);
    return fc;
  }
}
