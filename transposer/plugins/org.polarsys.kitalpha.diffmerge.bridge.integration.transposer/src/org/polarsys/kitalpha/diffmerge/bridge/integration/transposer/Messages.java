/*********************************************************************
 * Copyright (c) 2014-2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S. - initial API and implementation
 **********************************************************************/
package org.polarsys.kitalpha.diffmerge.bridge.integration.transposer;

import org.eclipse.osgi.util.NLS;

@SuppressWarnings("javadoc")
public class Messages extends NLS {
  private static final String BUNDLE_NAME = "org.polarsys.kitalpha.diffmerge.bridge.integration.transposer.messages"; //$NON-NLS-1$
  public static String bridgeLoggerTransposerRunStepMessage;
  public static String bridgeLoggerTransposerBridgeTransformationKeyNullIllegalArgument;
  public static String bridgeLoggerTransposerBridgeTransformationKeySourceObjectNullIllegalArgument;
  public static String bridgeLoggerTransposerBridgeTransformationKeyRoleNullIllegalArgument;
  static {
    // initialize resource bundle
    NLS.initializeMessages(BUNDLE_NAME, Messages.class);
  }

  private Messages() {
  }
}
