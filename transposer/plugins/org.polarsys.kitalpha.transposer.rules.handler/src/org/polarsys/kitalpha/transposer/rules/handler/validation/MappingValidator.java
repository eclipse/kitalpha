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

package org.polarsys.kitalpha.transposer.rules.handler.validation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

import org.polarsys.kitalpha.transposer.rules.handler.RuleHandlerPlugin;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IDomainHelper;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IRule;
import org.polarsys.kitalpha.transposer.rules.handler.rules.common.Mapping;
import org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingElement;
import org.polarsys.kitalpha.transposer.rules.handler.rules.common.MappingPossibility;

/**
 * 
 * @author Guillaume GEBHART
 *
 */
public class MappingValidator {

  private final String BR = "\n"; //$NON-NLS-1$

  private Map<Class<?>, Collection<MappingElement>> _ambiguousMappings = null;
  private Map<Class<?>, MappingElement> _explicitMappings = null;
  private List<Class<?>> _implicitMappings = null;
  private List<Class<?>> _undefinedMappings = null;

  private Mapping _mapping;

  private IStatus _validationResult;

  /**
   * Constructor
   */
  public MappingValidator() {
    _ambiguousMappings = new HashMap<Class<?>, Collection<MappingElement>>();
    _explicitMappings = new HashMap<Class<?>, MappingElement>();
    _implicitMappings = new ArrayList<Class<?>>();
    _undefinedMappings = new ArrayList<Class<?>>();
    _validationResult = new Status(IStatus.WARNING, RuleHandlerPlugin.PLUGIN_ID, "No validation result"); //$NON-NLS-1$
  }

  public IStatus validateMapping(Mapping mapping_p) {

    analyseMapping(mapping_p);
    buildValidationMessage();
    computeValidationStatus();

    RuleHandlerPlugin.getDefault().getLog().log(_validationResult);

    return _validationResult;
  }

  /**
   * @return
   */
  private void computeValidationStatus() {
    int severity = IStatus.INFO;
    String message = ""; //$NON-NLS-1$

    if (_explicitMappings.isEmpty()) {
      severity = IStatus.WARNING;
      message += "\nNo defined  explicit Mapping"; //$NON-NLS-1$

      if (_implicitMappings.isEmpty())
	 {
		message += "\nNo defined implicit Mapping"; //$NON-NLS-1$
	}
    }

    if (!_ambiguousMappings.isEmpty()) {
      severity = IStatus.ERROR;
      message += "\nAmbiguous Mapping detected"; //$NON-NLS-1$
    }

    _validationResult = new Status(severity, RuleHandlerPlugin.PLUGIN_ID, message.toString() + buildValidationMessage());
  }

  @SuppressWarnings( { "unchecked", "nls" })
  private String buildValidationMessage() {
    StringBuilder validationMessage = new StringBuilder();
    validationMessage.append("\nValidating Mapping : <" + _mapping.getName() + ">");
    validationMessage.append("\nFrom " + _mapping.getPurpose().eClass().getName() + " : <" + _mapping.getPurpose().getName() + ">");

    if (_mapping.getExtendedMapping() != null) {
      validationMessage.append("\nExtends the mapping <" + _mapping.getExtendedMapping().getName() + ">");
    }
    validationMessage.append("\n\nMetaClasses that have EXPLICITELY Defined Mappings :  [" + _explicitMappings.size() + "]");
    for (MappingElement mappingElement : _explicitMappings.values()) {
      validationMessage.append("\n\t [Explicit] => " + mappingElement.getDomainMetaClass().getSimpleName());
      appendMessageForMappingElement(validationMessage, mappingElement);
    }
    validationMessage.append("\n\nMetaClasses that have IMPLICITELY Defined Mappings : [" + _implicitMappings.size() + "]");
    for (Class<?> domainClass : _implicitMappings) {
      validationMessage.append("\t [Implicit] => [" + domainClass.getSimpleName() + "] ");

      Class x = domainClass;
      while (!_explicitMappings.containsKey(x) && (x != null)) {
        if (x.getInterfaces().length > 0) {
          x = x.getInterfaces()[0];
        } else {
          x = null;
        }

        if (x != null) {
          validationMessage.append(" -> " + x.getSimpleName());
        }
      }

      // x!= null => _explicitMappings.containsKey(x)
      if (x != null) {
        validationMessage.append(BR);
        appendMessageForMappingElement(validationMessage, _explicitMappings.get(x));
      }

      validationMessage.append(BR);
    }

    validationMessage.append("\n\nMetaClasses that have ambiguous mapping :  [" + _ambiguousMappings.size() + "]");
    for (Class<?> domainClass : _ambiguousMappings.keySet()) {
      validationMessage.append("\t => " + domainClass.getSimpleName());
      for (MappingElement mappingElement : _ambiguousMappings.get(domainClass)) {
        validationMessage.append(" " + mappingElement.getName() + " on " + mappingElement.getDomainMetaClass().getSimpleName());
      }
    }

    validationMessage.append("\n\nMetaClasses that have NO Defined Mappings : [" + _undefinedMappings.size() + "]");
    for (Class<?> domainClass : _undefinedMappings) {
      validationMessage.append("\n\t => " + domainClass.getSimpleName());
    }

    validationMessage.append("\n\n\n");

    return validationMessage.toString();
  }

  /**
   * @param validationMessage_p
   * @param mappingElement_p
   */
  @SuppressWarnings( { "unchecked", "nls" })
  private void appendMessageForMappingElement(StringBuilder message_p, MappingElement element_p) {
    for (MappingPossibility mappingPossibility : element_p.getOwnedPossibilities()) {
      message_p.append("\n\t\tpossibility : ");
      appendMessageForPossibility(message_p, mappingPossibility);
    }
    message_p.append(BR);

    if (element_p.getOwnedDefaultPossibility() != null) {
      message_p.append("\n\t\tdefault possibility : ");
      appendMessageForPossibility(message_p, element_p.getOwnedDefaultPossibility());
      message_p.append(BR);
    }

  }

  /**
   * @param message_p
   * @param mappingPossibility_p
   */
  @SuppressWarnings( { "unchecked", "nls" })
  private void appendMessageForPossibility(StringBuilder message_p, MappingPossibility possibility_p) {
    IRule rule = possibility_p.getCompleteRule();

    if (rule != null) {
      message_p.append("\n\t\t\t[Default Rule   ]   " + possibility_p.getCompleteRule().getName());
    }

    IRule incompleteRule = possibility_p.getIncompleteRule();
    if (incompleteRule != null) {
      message_p.append("\n\t\t\t[Incomplete Rule]   " + possibility_p.getIncompleteRule().getName());
    }
  }

  /**
   * @param mapping_p
   */
  private void analyseMapping(Mapping mapping_p) {
    _ambiguousMappings.clear();
    _explicitMappings.clear();
    _implicitMappings.clear();
    _undefinedMappings.clear();
    _validationResult = new Status(IStatus.WARNING, RuleHandlerPlugin.PLUGIN_ID, "No validation result"); //$NON-NLS-1$

    _mapping = mapping_p;

    IDomainHelper domainHelper = mapping_p.getDomainHelper();
    Collection<Class<?>> domainClasses = domainHelper.getAllDomainMetaclasses();
    for (Class<?> domainClass : domainClasses) {
      List<MappingElement> availableMappingElements = mapping_p.resolveAllAvailableMappingElements(domainClass);
      if (availableMappingElements.size() == 1) {
        if (mapping_p.getOwnedMappingElement(domainClass) != null) {
          // <=> availableMappingElements.get(0).getMetaClass() == domainClass
          _explicitMappings.put(domainClass, availableMappingElements.get(0));
        } else {
          _implicitMappings.add(domainClass);
        }
      }

      if (availableMappingElements.size() > 1) {
        _ambiguousMappings.put(domainClass, availableMappingElements);
      }

      if (availableMappingElements.size() == 0) {
        _undefinedMappings.add(domainClass);
      }
    }
  }
}
