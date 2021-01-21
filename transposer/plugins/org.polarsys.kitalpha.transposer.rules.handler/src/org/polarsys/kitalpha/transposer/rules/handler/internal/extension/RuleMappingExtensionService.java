/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.transposer.rules.handler.internal.extension;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.EMFPlugin;

import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IDomainHelper;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IRule;
import org.polarsys.kitalpha.transposer.rules.handler.rules.common.CommonFactory;
import org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping;
import org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingElement;
import org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingPackage;
import org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingPossibility;
import org.polarsys.kitalpha.transposer.rules.handler.rules.contribution.ContributedPurpose;
import org.polarsys.kitalpha.transposer.rules.handler.rules.contribution.ContributionFactory;

import com.google.common.base.Strings;

/**
 * This class provides services to load contributed rules mappings.
 * 
 * @author Guillaume GEBHART
 * 
 */
public final class RuleMappingExtensionService implements IRuleMappingExtensionConstants {

  /** The instance of the service. */
  private static RuleMappingExtensionService __instance = new RuleMappingExtensionService();

  /**
   * All contributed pruposes (instance of {@link ContributedPurpose}). Purpose contains mapping contributed by "rules" plugins.
   */
  private Map<String, ContributedPurpose> _contributedPurposes;

  /**
   * Map that links Mappings ids to the mappings themselves
   */
  private Map<String, Mapping> _mappingsHashMap;

  /**
   * Map that links rule class name to java class : avoid to create several java class instance of the same class
   */
  private Map<String, IRule<?>> _classNameToIRule;

  /** <code>true</code> if purposes are loaded. */
  private boolean _contributedPurposesLoaded = false;

  /**
   * Avoid instantiation from external.
   */
  private RuleMappingExtensionService() {
    this._contributedPurposes = new HashMap<String, ContributedPurpose>();
    this._classNameToIRule = new HashMap<String, IRule<?>>();
    this._mappingsHashMap = new HashMap<String, Mapping>();
  }

  public static RuleMappingExtensionService getInstance() {
    return RuleMappingExtensionService.__instance;
  }

  public Collection<ContributedPurpose> getContributedPurposes() {
    if (!this._contributedPurposesLoaded) {
      this.loadContributedPurposes();
    }
    return _contributedPurposes.values();
  }

  /**
   * Loads all contributed purposes
   */
  public void loadContributedPurposes() {
    this._contributedPurposes.clear();
    this._mappingsHashMap.clear();

    if (EMFPlugin.IS_ECLIPSE_RUNNING) {
      final IExtension[] extensions = Platform.getExtensionRegistry().getExtensionPoint(RULES_MAPPING_EXTENSION_POINT).getExtensions();

      // Instantiate all the mapping
      for (IExtension extension : extensions) {
        String currentMappingID = extension.getUniqueIdentifier();
        for (IConfigurationElement mappingConfigurationElement : extension.getConfigurationElements()) {
          if (mappingConfigurationElement.getName().equals(MAPPING_TAG_ENGINE)) {
            Mapping currentMapping = createMapping(mappingConfigurationElement);
            String purpose = mappingConfigurationElement.getAttribute(MAPPING_PURPOSE);
            ContributedPurpose currentPurpose = getCurrentPurpose(purpose);

            currentPurpose.getMappings().add(currentMapping);

            currentMapping.setId(currentMappingID);
            _mappingsHashMap.put(currentMappingID, currentMapping);
          }
        }
      }

      // Create the mapping hierarchy
      for (IExtension extension : extensions) {
        String currentMappingID = extension.getUniqueIdentifier();
        Mapping currentMapping = _mappingsHashMap.get(currentMappingID);
        String extendedMappingID = getExtendedMappingID(extension);

        if (extendedMappingID != null) {
          Mapping extendedMapping = _mappingsHashMap.get(extendedMappingID);
          currentMapping.setExtendedMapping(extendedMapping);
        }
      }

      // Load each mapping ( the optional declaration of the domain helper implies the mapping hierarchy computation before loading mapping elements)
      for (IExtension extension : extensions) {
        String currentMappingID = extension.getUniqueIdentifier();
        for (IConfigurationElement mappingConfigurationElement : extension.getConfigurationElements()) {
          if (mappingConfigurationElement.getName().equals(MAPPING_TAG_ENGINE) && _mappingsHashMap.containsKey(currentMappingID)) {
            Mapping currentMapping = _mappingsHashMap.get(currentMappingID);
            try {
              loadMapping(currentMapping, mappingConfigurationElement);
            } catch (Exception e) {
              e.printStackTrace();
            }
          }
        }
      }
    }

    // Create the mapping element hierarchy
    List<Mapping> roots = new ArrayList<Mapping>();
    for (ContributedPurpose purpose : _contributedPurposes.values()) {
      Mapping mostGenericMappingInPurpose = purpose.getMostGenericMapping();
      if (mostGenericMappingInPurpose.getExtendedMapping() == null) {
		roots.add(mostGenericMappingInPurpose);
	}
    }

    for (Mapping rootMapping : roots) {
      handleMappingElementHierarchy(rootMapping, new HashMap<Class<?>, MappingElement>());

    }

    this._contributedPurposesLoaded = true;
  }

  /**
   * @param rootMapping_p
   * @param hashMap_p
   */
  private void handleMappingElementHierarchy(Mapping mapping_p, HashMap<Class<?>, MappingElement> hashMap_p) {

    for (MappingElement element : mapping_p.getAllOwnedMappingElements()) {
      if (hashMap_p.containsKey(element.getDomainMetaClass())) {
		element.setExtendedMappingElement(hashMap_p.get(element.getDomainMetaClass()));
	}
      hashMap_p.put(element.getDomainMetaClass(), element);
    }

    if (mapping_p.getExtenders() != null && mapping_p.getExtenders().size() > 0) {
      for (Mapping extender : mapping_p.getExtenders()) {
        handleMappingElementHierarchy(extender, new HashMap<Class<?>, MappingElement>(hashMap_p));
      }
    }
  }

  /**
   * @param purpose_p
   * @return
   */
  private ContributedPurpose getCurrentPurpose(String purpose_p) {
    ContributedPurpose currentPurpose;
    if (_contributedPurposes.containsKey(purpose_p)) {
      currentPurpose = _contributedPurposes.get(purpose_p);
    } else {
      currentPurpose = ContributionFactory.eINSTANCE.createContributedPurpose();
      currentPurpose.setName(purpose_p);
      _contributedPurposes.put(purpose_p, currentPurpose);
    }
    return currentPurpose;
  }

  private String getExtendedMappingID(IExtension extension) {
    IConfigurationElement[] elements = extension.getConfigurationElements();
    IConfigurationElement mappingConfigurationElement = elements[0];
    if (!mappingConfigurationElement.getName().equals(MAPPING_TAG_ENGINE)) {
		return null;
	}
    return mappingConfigurationElement.getAttribute(EXTENDED_MAPPING_EXTENSION_ID);
  }

  /**
   * @param mappingConfigurationElement_p
   * @return
   */
  private Mapping createMapping(IConfigurationElement mappingConfigurationElement_p) {
    Mapping currentMapping = CommonFactory.eINSTANCE.createMapping();
    currentMapping.setName(mappingConfigurationElement_p.getAttribute(MAPPING_NAME));
    currentMapping.setDescription(mappingConfigurationElement_p.getAttribute(MAPPING_DESCRIPTION));
    
    final String isPrivateStr = mappingConfigurationElement_p.getAttribute(MAPPING_PRIVATE);
    final boolean isPrivate = Strings.isNullOrEmpty(isPrivateStr) ? false : Boolean.parseBoolean(isPrivateStr) ;
    
    currentMapping.setPrivate(isPrivate);

    if (mappingConfigurationElement_p.getAttribute(MAPPING_DOMAIN_HELPER) != null) {

      try {
        currentMapping.setOwnedDomainHelper((IDomainHelper) mappingConfigurationElement_p.createExecutableExtension(MAPPING_DOMAIN_HELPER));
      } catch (CoreException exception_p) {
        exception_p.printStackTrace();
      }
    }
    if (mappingConfigurationElement_p.getAttribute(MAPPING_DEFAULT_CONTEXT) != null) {
      try {
        currentMapping.setOwnedContext((IContext) mappingConfigurationElement_p.createExecutableExtension(MAPPING_DEFAULT_CONTEXT));
      } catch (CoreException exception_p) {
        exception_p.printStackTrace();
      }
    }

    return currentMapping;
  }

  /**
   * @param currentMapping_p
   * @param mappingConfigurationElement_p
   * @return
   */
  private void loadMapping(Mapping currentMapping_p, IConfigurationElement mappingConfigurationElement_p) {
    IConfigurationElement[] mappingChildren = mappingConfigurationElement_p.getChildren();
    for (IConfigurationElement configurationElement : mappingChildren) {
      if (configurationElement.getName().equals(MAPPING_ELEMENT_TAG_ENGINE)) {
        currentMapping_p.getOwnedMappingElements().add(handleMappingElement(configurationElement, currentMapping_p));
      }
      if (configurationElement.getName().equals(MAPPING_PACKAGE_TAG_ENGINE)) {
        currentMapping_p.getOwnedPackages().add(handleMappingPackage(configurationElement, currentMapping_p));
      }
    }
  }

  /**
   * @param packageConfigurationElement_p
   * @param currentMapping_p_p
   */
  private MappingPackage handleMappingPackage(IConfigurationElement packageConfigurationElement_p, Mapping currentMapping_p_p) {
    MappingPackage currentPackage = CommonFactory.eINSTANCE.createMappingPackage();
    currentPackage.setName(packageConfigurationElement_p.getAttribute(MAPPING_PACKAGE_NAME));

    IConfigurationElement[] mappingChildren = packageConfigurationElement_p.getChildren();
    for (IConfigurationElement configurationElement : mappingChildren) {
      if (configurationElement.getName().equals(MAPPING_ELEMENT_TAG_ENGINE)) {
        currentPackage.getOwnedMappingElements().add(handleMappingElement(configurationElement, currentMapping_p_p));
      }
      if (configurationElement.getName().equals(MAPPING_PACKAGE_TAG_ENGINE)) {
        currentPackage.getOwnedPackages().add(handleMappingPackage(configurationElement, currentMapping_p_p));
      }
    }
    return currentPackage;
  }

  /**
   * @param configurationElement_p
   * @param currentMapping_p
   */
  private MappingElement handleMappingElement(IConfigurationElement configurationElement_p, Mapping currentMapping_p) {
    MappingElement currentElement = CommonFactory.eINSTANCE.createMappingElement();

    // Handle name
    String name = configurationElement_p.getAttribute(MAPPING_ELEMENT_NAME);
    currentElement.setName(name);

    // Handle meta class element
    String domainMetaclassName = configurationElement_p.getAttribute(MAPPING_ELEMENT_DOMAIN_METACLASS);
    currentElement.setDomainMetaClass(currentMapping_p.getDomainHelper().getDomainMetaclass(domainMetaclassName));

    // Handle reuse of super possibilities
    String reusedSuperPossibilities = configurationElement_p.getAttribute(MAPPING_ELEMENT_REUSE_POSSIBILITIES);
    currentElement.setReuseSuperPossibilities(Boolean.parseBoolean(reusedSuperPossibilities));

    // Handle reuse of super default possibility
    String reusedSuperDefaultPossibility = configurationElement_p.getAttribute(IRuleMappingExtensionConstants.MAPPING_ELEMENT_REUSE_DEFAULT_POSSIBILITY);
    currentElement.setReuseSuperDefaultPossibility(Boolean.parseBoolean(reusedSuperDefaultPossibility));

    IConfigurationElement[] defaultPossibilities = configurationElement_p.getChildren(IRuleMappingExtensionConstants.MAPPING_DEFAUT_POSSIBILITY_TAG_ENGINE);
    for (IConfigurationElement defaultPossibility : defaultPossibilities) {
      currentElement.setOwnedDefaultPossibility(handlePossibility(defaultPossibility));
      /* There should be 0 or 1 default possibility */
    }

    IConfigurationElement[] possibilities = configurationElement_p.getChildren(IRuleMappingExtensionConstants.MAPPING_POSSIBILITY_TAG_ENGINE);
    for (IConfigurationElement possibility : possibilities) {
      currentElement.getOwnedPossibilities().add(handlePossibility(possibility));
    }

    return currentElement;
  }

  /**
   * @param possibility_p
   * @return
   */
  private MappingPossibility handlePossibility(IConfigurationElement possibilityConfigurationElement_p) {
    MappingPossibility currentPossibility = CommonFactory.eINSTANCE.createMappingPossibility();
    currentPossibility.setName(possibilityConfigurationElement_p.getAttribute(IRuleMappingExtensionConstants.MAPPING_POSSIBILITY_NAME));

    String enabled = possibilityConfigurationElement_p.getAttribute(IRuleMappingExtensionConstants.MAPPING_POSSIBILITY_ENABLED);

    if (!Boolean.parseBoolean(enabled)) {
      return currentPossibility;
    }

    // Complete Rule
    String completeRuleClassName = possibilityConfigurationElement_p.getAttribute(IRuleMappingExtensionConstants.MAPPING_POSSIBILITY_COMPLETE_RULE);
    if (completeRuleClassName != null) {
      if (_classNameToIRule.containsKey(completeRuleClassName)) {
        currentPossibility.setCompleteRule(_classNameToIRule.get(completeRuleClassName));
      } else {
        try {
          currentPossibility.setCompleteRule((IRule<?>) possibilityConfigurationElement_p
              .createExecutableExtension(IRuleMappingExtensionConstants.MAPPING_POSSIBILITY_COMPLETE_RULE));
        } catch (CoreException exception_p) {
          exception_p.printStackTrace();
        }
      }
    }
    // Incomplete Rule
    String incompleteRuleClassName = possibilityConfigurationElement_p.getAttribute(IRuleMappingExtensionConstants.MAPPING_POSSIBILITY_INCOMPLETE_RULE);
    if (incompleteRuleClassName != null) {
      if (_classNameToIRule.containsKey(incompleteRuleClassName)) {
        currentPossibility.setIncompleteRule(_classNameToIRule.get(incompleteRuleClassName));
      } else {
        try {
          currentPossibility.setIncompleteRule((IRule<?>) possibilityConfigurationElement_p
              .createExecutableExtension(IRuleMappingExtensionConstants.MAPPING_POSSIBILITY_INCOMPLETE_RULE));
        } catch (CoreException exception_p) {
          exception_p.printStackTrace();
        }
      }
    }

    // Context
    if (possibilityConfigurationElement_p.getAttribute(IRuleMappingExtensionConstants.MAPPING_POSSIBILITY_CONTEXT) != null) {
      try {
        currentPossibility.setContext((IContext) possibilityConfigurationElement_p
            .createExecutableExtension(IRuleMappingExtensionConstants.MAPPING_POSSIBILITY_CONTEXT));
      } catch (CoreException exception_p) {
        exception_p.printStackTrace();
      }
    }

    return currentPossibility;
  }

  public void reset() {
    this._contributedPurposesLoaded = false;
    this._classNameToIRule.clear();
    this._contributedPurposes.clear();
    this._mappingsHashMap.clear();
  }

  public void dispose() {
    this._contributedPurposesLoaded = false;
    this._contributedPurposes.clear();
  }

}