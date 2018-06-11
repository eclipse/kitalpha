/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.transposer.rules.handler.rules.common.spec;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.polarsys.kitalpha.transposer.rules.handler.exceptions.mappings.AmbiguousMappingException;
import org.polarsys.kitalpha.transposer.rules.handler.exceptions.mappings.MappingResolutionException;
import org.polarsys.kitalpha.transposer.rules.handler.exceptions.possibilities.MappingPossibilityResolutionException;
import org.polarsys.kitalpha.transposer.rules.handler.internal.util.IDescriptionBuilderContants;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IDomainHelper;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IPurpose;
import org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping;
import org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingElement;
import org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingPackage;
import org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingPossibility;
import org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingImpl;
import org.polarsys.kitalpha.transposer.rules.handler.rules.common.util.MappingHelper;
import org.polarsys.kitalpha.transposer.rules.handler.validation.MappingValidator;

/**
 * @author Guillaume GEBHART
 * 
 */
public class MappingSpec extends MappingImpl {

  private Map<Class<?>, MappingElement> domainClassToMappingElement;

  /**
   * 
   */
  public MappingSpec() {
    super();
    domainClassToMappingElement = new HashMap<Class<?>, MappingElement>();
  }

  /**
   * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingImpl#getDomainHelper()
   */
  @Override
  public IDomainHelper getDomainHelper() {
    IDomainHelper domainHelperToUse = null;
    if (this.getOwnedDomainHelper() != null) {
      domainHelperToUse = this.getOwnedDomainHelper();
    } else if (this.getExtendedMapping() != null) {
      domainHelperToUse = this.getExtendedMapping().getDomainHelper();
    }
    return domainHelperToUse;
  }

  /**
   * 
   * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingImpl#getAllOwnedMappingElements()
   */
  @Override
  public EList<MappingElement> getAllOwnedMappingElements() {
    EList<MappingElement> allMappingElements = new BasicEList<MappingElement>();

    allMappingElements.addAll(getOwnedMappingElements());

    for (MappingPackage mappingPackage : getOwnedPackages()) {
      allMappingElements.addAll(mappingPackage.getAllMappingElements());
    }

    return allMappingElements;
  }

  /**
   * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingImpl#getPurpose()
   */
  @Override
  public IPurpose getPurpose() {
    IPurpose purpose = null;
    if (eContainer() instanceof IPurpose) {
      purpose = (IPurpose) eContainer;
    }
    return purpose;
  }

  /**
   * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingImpl#resolveUniqueAvailableMappingElement(java.lang.Object)
   */
  @Override
  public MappingElement resolveUniqueAvailableMappingElement(Object object_p, IDomainHelper domainHelper_p) throws MappingResolutionException {
    List<MappingElement> availableMappingElements = Collections.<MappingElement> emptyList();
    Class<?> objectClass = domainHelper_p.getDomainMetaclass(object_p);

    if (objectClass != null) {
		availableMappingElements = resolveAllAvailableMappingElements(objectClass);
	}

    if (availableMappingElements.size() == 0) {
      // There is no MappingElement that can handle this object in this Mapping
      return null;
    }

    if (availableMappingElements.size() == 1) {
      return availableMappingElements.get(0);
    }

    // There is more than one available MappingElements in this Mapping that can handle this EObject => ambiguity
    throw new AmbiguousMappingException(objectClass, availableMappingElements);
  }

  /**
   * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingImpl#resolveAllAvailableMappingElements(java.lang.Class)
   */
  @Override
  public EList<MappingElement> resolveAllAvailableMappingElements(Class<?> domainClass_p) {
    EList<MappingElement> mappingElementsForMetaClass = new BasicEList<MappingElement>();
    MappingHelper.resolveAllAvailableMappingElements(this, domainClass_p, mappingElementsForMetaClass);
    return mappingElementsForMetaClass;
  }

  /**
   * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingImpl#validate()
   */
  @Override
  public IStatus validate() {
    MappingValidator validator = new MappingValidator();
    return validator.validateMapping(this);
  }

  /**
   * 
   * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingImpl#resolveApplicablePossibility(java.lang.Object)
   */
  @Override
  public MappingPossibility resolveApplicablePossibility(Object object_p, IDomainHelper domainHelper_p) throws MappingPossibilityResolutionException {
    MappingElement mappingElement;

    try {
      mappingElement = resolveUniqueAvailableMappingElement(object_p, domainHelper_p);
    } catch (MappingResolutionException e) {
      throw new MappingPossibilityResolutionException(e);
    }

    if (mappingElement == null) {
		return null;
	}

    return mappingElement.getApplicablePossibility(object_p);

  }

  /**
   * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingImpl#getOwnedMappingElement(java.lang.Class)
   */
  @Override
  public MappingElement getOwnedMappingElement(Class<?> domainClass_p) {
    MappingElement result = null;
    if (domainClassToMappingElement.containsKey(domainClass_p)) {
		result = domainClassToMappingElement.get(domainClass_p);
	}

    for (MappingElement mappingElement : getAllOwnedMappingElements()) {
      if (domainClass_p.equals(mappingElement.getDomainMetaClass())) {
        domainClassToMappingElement.put(domainClass_p, mappingElement);
        result = mappingElement;
        break;
      }
    }
    return result;
  }

  /**
   * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingImpl#getCompleteDescription()
   */
  @Override
  public String getCompleteDescription() {
    StringBuilder completeDescription = new StringBuilder();

    completeDescription.append(this.getName()).append(IDescriptionBuilderContants.SEPARATOR);
    completeDescription.append(IDescriptionBuilderContants.NEW_LINE);

    completeDescription.append(this.getDescription());

    if (this.getExtendedMapping() == null) {
      return completeDescription.toString();
    }

    IPurpose currentPurpose = this.getPurpose();
    IPurpose extendedPurpose = this.getExtendedMapping().getPurpose();

    completeDescription.append(IDescriptionBuilderContants.NEW_LINE).append(IDescriptionBuilderContants.NEW_LINE);

    if (currentPurpose != null && !currentPurpose.equals(extendedPurpose)) {
      completeDescription.append(IDescriptionBuilderContants.EXTENDS_PURPOSE);
      completeDescription.append(extendedPurpose.getName());
      completeDescription.append(IDescriptionBuilderContants.NEW_LINE);
      completeDescription.append(IDescriptionBuilderContants.EXTENDS_MAPPING);
    } else {
		completeDescription.append(IDescriptionBuilderContants.EXTENDS);
	}

    completeDescription.append(this.getExtendedMapping().getCompleteDescription());

    return completeDescription.toString();
  }

  /**
   * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingImpl#getExtendersWithSamePurpose()
   */
  @Override
  public EList<Mapping> getExtendersWithSamePurpose() {
    IPurpose purpose = getPurpose();
    EList<Mapping> mappingHierarchyForPurpose = new BasicEList<Mapping>();

    if (purpose == null) {
		return mappingHierarchyForPurpose;
	}

    for (Mapping child : getExtenders()) {
      if (purpose.equals(child.getPurpose())) {
		mappingHierarchyForPurpose.add(child);
	}
    }
    return mappingHierarchyForPurpose;
  }

  /**
   * @see org.polarsys.kitalpha.transposer.rules.handler.rules.common.impl.MappingImpl#getContext()
   */
  @Override
  public IContext getContext() {
    IContext contextToUse = null;
    if (this.getOwnedContext() != null) {
      contextToUse = this.getOwnedContext();
    } else if (this.getExtendedMapping() != null) {
      contextToUse = this.getExtendedMapping().getContext();
    }
    return contextToUse;
  }

}
