/*******************************************************************************
 * Copyright (c) 2018, 2019 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 *  Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.massactions.shared.messages;

import org.eclipse.osgi.util.NLS;

/**
 * A message bundle class.
 * 
 * @author Sandu Postaru
 *
 */
public class Messages extends NLS {
  private static final String BUNDLE_NAME = "org.polarsys.kitalpha.massactions.shared.messages.messages"; //$NON-NLS-1$

  public static String MA_VIEW_NAME;
  public static String MA_VIEW_CLEAR_TOOLTIP_TEXT;
  public static String MA_VIEW_FILTER_TOOLTIP_TEXT;
  public static String MA_VIEW_NEW_VIEW_TOOLTIP_TEXT;
  public static String MV_VIEW_SWITCH_PERSPECTIVE_TOOLTIP_TEXT;
  public static String MA_VIEW_EXPORT_TO_CSV_TOOLTIP_TEXT;

  public static String MA_VIEW_MESSAGE_INFO_1;
  public static String MA_VIEW_MESSAGE_INFO_2;

  static {
    // initialize resource bundle
    NLS.initializeMessages(BUNDLE_NAME, Messages.class);
  }

  private Messages() {
    // Exists only to defeat instantiation.
  }

}
