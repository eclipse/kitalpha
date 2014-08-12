/**
 * Copyright (c) 2009-2010 Thales Corporate Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
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
  public static final String EMPTY_STRING = ""; //$NON-NLS-1$

  /**
   * TAB character.
   */
  public static final char TAB_CHARACTER = '\t';

  /**
   * Slash character.
   */
  public static final char SLASH_CHARACTER = '/';

  /**
   * Dot character.
   */
  public static final char DOT_CHARACTER = '.';

  /**
   * Dot String.
   */
  public static final String DOT_STRING = "."; //$NON-NLS-1$

  /**
   * Comma character.
   */
  public static final char COMMA_CHARACTER = ',';

  /**
   * Semicolon character.
   */
  public static final char SEMICOLON_CHARACTER = ';';

  /**
   * Colon character.
   */
  public static final char COLON_CHARACTER = ':';

  /**
   * White space character.
   */
  public static final char WHITE_SPACE_CHARACTER = ' ';

  /**
   * End of line character.
   */
  public static final char EOL_CHARACTER = '\n';

  /**
   * Quote character.
   */
  public static final char QUOTE_CHARACTER = '"';

  /**
   * Call method prefix, that is go for the parameters (the real prefix being
   * the method name).
   */
  public static final char PARENTHESIS_OPEN_CHARACTER = '(';

  /**
   * Call method suffix, that is, close parameters list, but do not end call.
   */
  public static final char PARENTHESIS_CLOSE_CHARACTER = ')';

  /**
   * Underscore character.
   */
  public static final char UNDERSCORE_CHARACTER = '_';

  /**
   * Line separator.
   */
  public static final String LINE_SEPARATOR = System.getProperty("line.separator"); //$NON-NLS-1$


  /**
   * Html File extension
   */
  public static final String HTML_FILE_EXTENSION = "html"; //$NON-NLS-1$

  /**
   * Project property name
   */
  public static final String PROJECT_NAME_CONTRACT = "projectName"; //$NON-NLS-1$

  /**
   * Output folder property name 
   */
  public static final String OUTPUT_FOLDER_CONTRACT = "outputFolder"; //$NON-NLS-1$

  /**
   * File name property name 
   */
  public static final String FILE_NAME = "fileName"; //$NON-NLS-1$

  /**
   * Sidebar property name 
   */
  public static final String SIDEBAR = "sidebar"; //$NON-NLS-1$

  /**
   * Sidebar file name 
   */
  public static final String SIDEBAR_FILENAME = "sidebar"; //$NON-NLS-1$


}
