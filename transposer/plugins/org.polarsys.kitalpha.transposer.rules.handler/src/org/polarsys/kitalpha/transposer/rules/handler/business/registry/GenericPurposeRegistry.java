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


package org.polarsys.kitalpha.transposer.rules.handler.business.registry;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.polarsys.kitalpha.transposer.rules.handler.RuleHandlerPlugin;
import org.polarsys.kitalpha.transposer.rules.handler.internal.extension.RuleMappingExtensionService;
import org.polarsys.kitalpha.transposer.rules.handler.internal.util.IDescriptionBuilderContants;
import org.polarsys.kitalpha.transposer.rules.handler.rules.common.CommonFactory;
import org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping;
import org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingElement;
import org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingPossibility;
import org.polarsys.kitalpha.transposer.rules.handler.rules.contribution.ContributedPurpose;
import org.polarsys.kitalpha.transposer.rules.handler.rules.impl.PurposeRegistryImpl;
import org.polarsys.kitalpha.transposer.rules.handler.rules.runtime.RuntimeFactory;
import org.polarsys.kitalpha.transposer.rules.handler.rules.runtime.RuntimePurpose;

/**
 * This class registers available purpose and their rules mappings. It allows to get the applicable possibility for an element, to validate registered and
 * contributed mapping.
 * 
 * @author Guillaume GEBHART
 * 
 */
public final class GenericPurposeRegistry extends PurposeRegistryImpl {

  /** The instance of the service. */
  private static GenericPurposeRegistry __instance = new GenericPurposeRegistry();

  private Map<String, RuntimePurpose> _runtimePurposes = new HashMap<String, RuntimePurpose>();

  /**
   * 
   */
  private GenericPurposeRegistry() {
    super();
    init();
  }

  public static GenericPurposeRegistry getInstance() {
    return GenericPurposeRegistry.__instance;
  }

  /**
   * 
   * @see org.polarsys.kitalpha.transposer.rules.handler.rules.impl.PurposeRegistryImpl#getRegisteredPurpose(java.lang.String, java.lang.String)
   */
  @Override
  public RuntimePurpose getRegisteredPurpose(String purpose_p, String mappingId_p) {
    for (RuntimePurpose purpose : getRegisteredPurposes()) {
      if (purpose_p != null && purpose_p.equals(purpose.getName()) && mappingId_p != null && mappingId_p.equals(purpose.getId())) {
		return purpose;
	}
    }
    return registerPurpose(purpose_p, mappingId_p);
  }

  /**
   * @see org.polarsys.kitalpha.transposer.rules.handler.rules.impl.PurposeRegistryImpl#getContributedMapping(java.lang.String, java.lang.String)
   */
  @Override
  public Mapping getContributedMapping(String purpose_p, String mappingId_p) {
    ContributedPurpose purpose = getContributedPurpose(purpose_p);
    Mapping result = null;

    if (purpose != null && mappingId_p != null) {
      for (Mapping mapping : purpose.getMappings()) {
        if (mappingId_p.equals(mapping.getId())) {
			result = mapping;
		}
      }
    }

    return result;
  }

  /**
   * @see org.polarsys.kitalpha.transposer.rules.handler.rules.impl.PurposeRegistryImpl#getContributedPurpose(java.lang.String)
   */
  @Override
  public ContributedPurpose getContributedPurpose(String purpose_p) {
    for (ContributedPurpose purpose : getContributedPurposes()) {
      if (purpose_p != null && purpose_p.equals(purpose.getName())) {
		return purpose;
	}
    }
    return null;
  }

  /**
   * @see org.polarsys.kitalpha.transposer.rules.handler.rules.impl.MappingRegistryImpl#validateRegisteredPurposes()
   */
  @Override
  public IStatus validateRegisteredPurposes() {
    int severity = IStatus.INFO;
    String message = "Registered purpose are valid, check the error log for information."; //$NON-NLS-1$
    for (RuntimePurpose runtimePurpose : getRegisteredPurposes()) {
      IStatus result = runtimePurpose.validate();
      if (result.getSeverity() != IStatus.INFO) {
		severity = result.getSeverity();
	}
    }

    if (severity == IStatus.WARNING) {
      message = "WARNING ! Registered purpose validate with warnings, check the error log for information."; //$NON-NLS-1$
    }

    if (severity == IStatus.WARNING) {
      message = "ERROR ! Some registered purpose are invalid, check the error log for information."; //$NON-NLS-1$
    }

    return new Status(severity, RuleHandlerPlugin.PLUGIN_ID, message);
  }

  /**
   * @see org.polarsys.kitalpha.transposer.rules.handler.rules.impl.MappingRegistryImpl#validateContributedPurposes()
   */
  @Override
  public IStatus validateContributedPurposes() {
    int severity = IStatus.INFO;
    String message = "Contributed purpose are valid, check the error log for information."; //$NON-NLS-1$

    for (ContributedPurpose contributedPurpose : getContributedPurposes()) {
      IStatus result = contributedPurpose.validate();
      if (result.getSeverity() != IStatus.INFO) {
		severity = result.getSeverity();
	}
    }

    if (severity == IStatus.WARNING) {
      message = "WARNING ! Contributed purpose validate with warnings, check the error log for information."; //$NON-NLS-1$
    }

    if (severity == IStatus.WARNING) {
      message = "ERROR ! Some contributed purpose are invalid, check the error log for information."; //$NON-NLS-1$
    }

    return new Status(severity, RuleHandlerPlugin.PLUGIN_ID, message);
  }

  /**
   * @see org.polarsys.kitalpha.transposer.rules.handler.rules.impl.MappingRegistryImpl#reset()
   */
  @Override
  public void reset() {
    this._runtimePurposes.clear();

    // Extension point will be reloaded
    // RuleMappingExtensionService.getInstance().reset();
  }

  /**
   * @see org.polarsys.kitalpha.transposer.rules.handler.rules.impl.MappingRegistryImpl#init()
   */
  @Override
  public void init() {
    this.reset();
    this.getContributedPurposes().addAll(RuleMappingExtensionService.getInstance().getContributedPurposes());
  }

  /**
   * This method creates for each contributed purpose a runtime purpose which contains a merged mapping. In some cases, the merged mapping can be a simple copy
   * of the contributed mapping : if there is no extension. In other cases, some rules need to be respected : contributed mapping cannot have more than one
   * extender for the same purpose, mapping element extension is implicit (based on mapping extension and domain class),...
   */
  @Override
  public RuntimePurpose registerPurpose(String purpose_p, String mappingId_p) {
    ContributedPurpose selectedPurpose = null;
    Mapping selectedMapping = null;

    for (ContributedPurpose contributedPurpose : getContributedPurposes()) {
      if (purpose_p.equals(contributedPurpose.getName())) {
        selectedPurpose = contributedPurpose;
      }
    }

    if (selectedPurpose == null)
	 {
		throw new NullPointerException("The purpose to register is not in contributed ones : " + purpose_p); //$NON-NLS-1$
	}

    for (Mapping contributedMapping : selectedPurpose.getMappings()) {
      if (mappingId_p.equals(contributedMapping.getId())) {
        selectedMapping = contributedMapping;
      }
    }

    if (selectedMapping == null)
	 {
		throw new NullPointerException("The mapping to register is not in contributed ones : " + purpose_p + "::" + mappingId_p); //$NON-NLS-1$ //$NON-NLS-2$
	}

    RuntimePurpose runtimePurpose = RuntimeFactory.eINSTANCE.createRuntimePurpose();
    runtimePurpose.setName(selectedPurpose.getName());

    runtimePurpose.setDescription(getDescription(purpose_p, selectedMapping));

    if (selectedPurpose.getMappings().size() == 1 && selectedPurpose.getMappings().get(0).getExtendedMapping() == null) {
      runtimePurpose.setMapping((Mapping) EcoreUtil.copy(selectedPurpose.getMappings().get(0)));
    } else {
      runtimePurpose.setMapping(buildRuntimeMapping(selectedPurpose, selectedMapping));
    }

    runtimePurpose.setId(runtimePurpose.getMapping().getId());

    // TODO handle exception
    // runtimePurpose.validate();

    this.getRegisteredPurposes().add(runtimePurpose);

    return runtimePurpose;
  }

  /**
   * @param purpose_p
   * @param mapping_p
   * @return
   */
  private String getDescription(String purpose_p, Mapping mapping_p) {
    StringBuilder runtimeDescription = new StringBuilder();
    runtimeDescription.append(IDescriptionBuilderContants.PURPOSE).append(purpose_p).append(IDescriptionBuilderContants.NEW_LINE)
        .append(IDescriptionBuilderContants.NEW_LINE).append(mapping_p.getCompleteDescription());

    return runtimeDescription.toString();
  }

  /**
   * @param contributedPurpose_p
   * @return
   */
  private Mapping buildRuntimeMapping(ContributedPurpose contributedPurpose_p, Mapping selectedMapping_p) {
    Mapping runtimeMapping = CommonFactory.eINSTANCE.createMapping();
    Map<Class<?>, MappingElement> runtimeMappingElements = new HashMap<Class<?>, MappingElement>();
    Map<Class<?>, MappingElement> contributedMappingsElements = new HashMap<Class<?>, MappingElement>();

    selectContributedMappingElementsToUse(contributedMappingsElements, selectedMapping_p);

    runtimeMapping.setId(selectedMapping_p.getId());
    runtimeMapping.setName(selectedMapping_p.getName());
    runtimeMapping.setOwnedContext(selectedMapping_p.getContext());
    runtimeMapping.setOwnedDomainHelper(selectedMapping_p.getDomainHelper());

    // Populate runtime mapping with contributed element
    for (MappingElement contributedElement : contributedMappingsElements.values()) {
      MappingElement runtimeElement = CommonFactory.eINSTANCE.createMappingElement();
      runtimeElement.setName(contributedElement.getName());
      runtimeElement.setDomainMetaClass(contributedElement.getDomainMetaClass());

      if (!contributedElement.getOwnedPossibilities().isEmpty()) {
		runtimeElement.getOwnedPossibilities().addAll(EcoreUtil.copyAll(contributedElement.getAllPossibilities()));
	}

      if (contributedElement.getDefaultPossibility() != null) {
		runtimeElement.setOwnedDefaultPossibility((MappingPossibility) EcoreUtil.copy(contributedElement.getDefaultPossibility()));
	}

      runtimeMappingElements.put(runtimeElement.getDomainMetaClass(), runtimeElement);
    }

    runtimeMapping.getOwnedMappingElements().addAll(runtimeMappingElements.values());
    return runtimeMapping;
  }

  /**
   * @param contributedMappingsElements_p
   * @param mostSpecificMapping_p
   * @return
   */
  private void selectContributedMappingElementsToUse(Map<Class<?>, MappingElement> contributedMappingsElements_p, Mapping mapping_p) {
    if (mapping_p.getExtendedMapping() != null) {
      selectContributedMappingElementsToUse(contributedMappingsElements_p, mapping_p.getExtendedMapping());
    }
    for (MappingElement currentElement : mapping_p.getAllOwnedMappingElements()) {
      contributedMappingsElements_p.put(currentElement.getDomainMetaClass(), currentElement);
    }
  }
}
