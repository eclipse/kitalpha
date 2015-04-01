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

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.build.templates;

import org.eclipse.egf.model.domain.Domain;
import org.eclipse.egf.model.domain.DomainFactory;
import org.eclipse.egf.model.domain.DomainViewpoint;
import org.eclipse.egf.model.domain.EMFDomain;
import org.eclipse.egf.model.domain.TypeDomain;
import org.eclipse.egf.model.fcore.Activity;
import org.eclipse.egf.model.fcore.Contract;
import org.eclipse.egf.model.fcore.FactoryComponent;
import org.eclipse.egf.model.fcore.FcoreFactory;
import org.eclipse.egf.model.fcore.InvocationContract;
import org.eclipse.egf.model.fcore.InvocationContractContainer;
import org.eclipse.egf.model.fcore.Viewpoint;
import org.eclipse.egf.model.fcore.ViewpointContainer;
import org.eclipse.egf.model.fprod.FprodFactory;
import org.eclipse.egf.model.fprod.ProductionPlan;
import org.eclipse.egf.model.fprod.ProductionPlanInvocation;
import org.eclipse.egf.model.types.TypeString;
import org.eclipse.egf.model.types.TypesFactory;
import org.eclipse.emf.common.util.EList;
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
    String _plus = ("run_" + lvpsShortName);
    fc.setName(_plus);
    final URI uri = URI.createPlatformResourceURI(domainViewpointURI, false);
    final ViewpointContainer viewpointContainer = FcoreFactory.eINSTANCE.createViewpointContainer();
    fc.setViewpointContainer(viewpointContainer);
    final ProductionPlan plan = FprodFactory.eINSTANCE.createProductionPlan();
    final ProductionPlanInvocation invocation = FprodFactory.eINSTANCE.createProductionPlanInvocation();
    ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
    final ResourceSet resourceSet = _resourceSetImpl;
    URI _createPlatformPluginURI = URI.createPlatformPluginURI(this.BUILD_ACTIVITY, false);
    final Resource activityResource = resourceSet.getResource(_createPlatformPluginURI, true);
    EObject _eObject = activityResource.getEObject(this.BUILD_ACTIVITY_ID);
    final Activity activity = ((Activity) _eObject);
    invocation.setInvokedActivity(activity);
    final InvocationContractContainer contractContainer = FcoreFactory.eINSTANCE.createInvocationContractContainer();
    final DomainViewpoint domainViewpoint = DomainFactory.eINSTANCE.createDomainViewpoint();
    EList<Viewpoint> _viewpoints = viewpointContainer.getViewpoints();
    _viewpoints.add(domainViewpoint);
    final EMFDomain emfDomain = DomainFactory.eINSTANCE.createEMFDomain();
    emfDomain.setUri(uri);
    EList<Domain> _domains = domainViewpoint.getDomains();
    _domains.add(emfDomain);
    final InvocationContract buildModelPathContract = FcoreFactory.eINSTANCE.createInvocationContract();
    final TypeDomain typeDomain = DomainFactory.eINSTANCE.createTypeDomain();
    typeDomain.setDomain(emfDomain);
    buildModelPathContract.setType(typeDomain);
    Contract _contract = activity.getContract(this.BUILD_MODEL_PATH);
    buildModelPathContract.setInvokedContract(_contract);
    final InvocationContract generationPathContract = FcoreFactory.eINSTANCE.createInvocationContract();
    final TypeString typeString = TypesFactory.eINSTANCE.createTypeString();
    URI _createPlatformResourceURI = URI.createPlatformResourceURI(generationPath, false);
    String _string = _createPlatformResourceURI.toString();
    typeString.setValue(_string);
    generationPathContract.setType(typeString);
    Contract _contract_1 = activity.getContract(this.GENERATION_PATH);
    generationPathContract.setInvokedContract(_contract_1);
    EList<InvocationContract> _invocationContracts = contractContainer.getInvocationContracts();
    _invocationContracts.add(buildModelPathContract);
    EList<InvocationContract> _invocationContracts_1 = contractContainer.getInvocationContracts();
    _invocationContracts_1.add(generationPathContract);
    invocation.setInvocationContractContainer(contractContainer);
    EList<ProductionPlanInvocation> _invocations = plan.getInvocations();
    _invocations.add(invocation);
    fc.setOrchestration(plan);
    return fc;
  }
}
