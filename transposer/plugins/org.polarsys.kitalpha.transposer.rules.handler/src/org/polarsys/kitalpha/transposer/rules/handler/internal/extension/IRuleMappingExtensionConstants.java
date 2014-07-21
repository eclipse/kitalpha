/*******************************************************************************
 * Copyright (c) 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.transposer.rules.handler.internal.extension;

/**
 * This class provides services to load contributed rules mappings.
 * 
 * @author Guillaume GEBHART
 * 
 */
public interface IRuleMappingExtensionConstants {

  /** Name of the extension point to parse for contributed rules mappings. */
  public static final String RULES_MAPPING_EXTENSION_POINT = "org.polarsys.kitalpha.transposer.rules.handler.mapping"; //$NON-NLS-1$
  /** Externalized here to avoid too many distinct usages. */
  public static final String MAPPING_TAG_ENGINE = "mapping"; //$NON-NLS-1$
  public static final String EXTENDED_MAPPING_EXTENSION_ID = "extendedMappingExtensionID"; //$NON-NLS-1$
  public static final String MAPPING_PURPOSE = "mappingPurpose"; //$NON-NLS-1$
  public static final String MAPPING_NAME = "mappingName"; //$NON-NLS-1$
  public static final String MAPPING_DESCRIPTION = "description"; //$NON-NLS-1$
  public static final String MAPPING_DOMAIN_HELPER = "domainHelper"; //$NON-NLS-1$
  public static final String MAPPING_DEFAULT_CONTEXT = "context"; //$NON-NLS-1$
  public static final String MAPPING_PRIVATE = "private"; //$NON-NLS-1$

  public static final String MAPPING_PACKAGE_TAG_ENGINE = "mappingPackage"; //$NON-NLS-1$
  public static final String MAPPING_PACKAGE_NAME = "name"; //$NON-NLS-1$

  public static final String MAPPING_ELEMENT_TAG_ENGINE = "mappingElement"; //$NON-NLS-1$
  public static final String MAPPING_ELEMENT_NAME = "name"; //$NON-NLS-1$
  public static final String MAPPING_ELEMENT_DOMAIN_METACLASS = "domainMetaClass"; //$NON-NLS-1$
  public static final String MAPPING_ELEMENT_REUSE_DEFAULT_POSSIBILITY = "reuseExtendedElementDefaultPossibility"; //$NON-NLS-1$
  public static final String MAPPING_ELEMENT_REUSE_POSSIBILITIES = "reuseExtendedElementPossibilities"; //$NON-NLS-1$

  public static final String MAPPING_POSSIBILITY_TAG_ENGINE = "mappingPossibility"; //$NON-NLS-1$
  public static final String MAPPING_POSSIBILITY_ENABLED = "enabled"; //$NON-NLS-1$
  public static final String MAPPING_POSSIBILITY_NAME = "name"; //$NON-NLS-1$
  public static final String MAPPING_POSSIBILITY_COMPLETE_RULE = "completeRule"; //$NON-NLS-1$
  public static final String MAPPING_POSSIBILITY_INCOMPLETE_RULE = "incompleteRule";//$NON-NLS-1$
  public static final String MAPPING_POSSIBILITY_CONTEXT = "context"; //$NON-NLS-1$

  public static final String MAPPING_DEFAUT_POSSIBILITY_TAG_ENGINE = "defaultMappingPossibility"; //$NON-NLS-1$

}
