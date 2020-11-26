/**
 * Copyright (c) 2009, 2018 Thales Corporate Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 * Thales Corporate Services S.A.S - initial API and implementation
 */
package org.polarsys.kitalpha.doc.gen.business.core.util;

/**
 * @author Benoit Langlois 
 */

public interface DocGenHtmlConstants {


  /**
   * Empty string constant.
   */
  String EMPTY_STRING = ""; //$NON-NLS-1$

  /**
   * TAB character.
   */
  char TAB_CHARACTER = '\t';

  /**
   * Slash character.
   */
  char SLASH_CHARACTER = '/';

  /**
   * Dot character.
   */
  char DOT_CHARACTER = '.';

  /**
   * Dot String.
   */
  String DOT_STRING = "."; //$NON-NLS-1$

  /**
   * Comma character.
   */
  char COMMA_CHARACTER = ',';

  /**
   * Semicolon character.
   */
  char SEMICOLON_CHARACTER = ';';

  /**
   * Colon character.
   */
  char COLON_CHARACTER = ':';

  /**
   * White space character.
   */
  char WHITE_SPACE_CHARACTER = ' ';

  /**
   * End of line character.
   */
  char EOL_CHARACTER = '\n';

  /**
   * Quote character.
   */
  char QUOTE_CHARACTER = '"';

  /**
   * Call method prefix, that is go for the parameters (the real prefix being
   * the method name).
   */
  char PARENTHESIS_OPEN_CHARACTER = '(';

  /**
   * Call method suffix, that is, close parameters list, but do not end call.
   */
  char PARENTHESIS_CLOSE_CHARACTER = ')';

  /**
   * Underscore character.
   */
  char UNDERSCORE_CHARACTER = '_';

  /**
   * Line separator.
   */
  String LINE_SEPARATOR = System.getProperty("line.separator"); //$NON-NLS-1$


  /**
   * Html File extension
   */
  String HTML_FILE_EXTENSION = "html"; //$NON-NLS-1$

  /**
   * Project property name
   */
  String PROJECT_NAME_CONTRACT = "projectName"; //$NON-NLS-1$

  /**
   * Output folder property name 
   */
  String OUTPUT_FOLDER_CONTRACT = "outputFolder"; //$NON-NLS-1$

  /**
   * File name property name 
   */
  String FILE_NAME = "fileName"; //$NON-NLS-1$

  /**
   * Sidebar property name 
   */
  String SIDEBAR = "sidebar"; //$NON-NLS-1$

  /**
   * Sidebar file name 
   */
  String SIDEBAR_FILENAME = "sidebar"; //$NON-NLS-1$


}
