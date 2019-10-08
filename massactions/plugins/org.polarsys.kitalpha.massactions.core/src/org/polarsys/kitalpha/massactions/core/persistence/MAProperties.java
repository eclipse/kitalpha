/*******************************************************************************
 * Copyright (c) 2018  Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.massactions.core.persistence;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.nebula.widgets.nattable.persistence.PersistenceHelper;
import org.eclipse.nebula.widgets.nattable.persistence.gui.PersistenceDialog;

/**
 * <p>
 * <font color="red">Experimental</font>
 * </p>
 * 
 * This class is used to manage the table configuration persistence. This class is a direct extension to the mechanism
 * used by Nattable with one notable difference. Here we provide a mechanism that helps us insure that only the valid
 * configurations for the current contained elements are displayed. In order to achieve that, we export with every
 * configuration - a key based on the current class instances contained in the table, and on import we remove any
 * properties that are invalid regarding this key.
 *
 * @author Sandu Postaru
 * 
 */
public class MAProperties extends Properties {

  private static final Log log = LogFactory.getLog(MAProperties.class);

  private static final long serialVersionUID = -6579028390851088684L;
  private static final String DEFAULT_FILE_PATH = "props/massEdition.properties";

  public static final String PERSISTENCE_KEY_VALID_CLASSES = ".validClasses";

  /**
   * Saves the current configuration to a file.
   * 
   * @param filePath
   *          the file name.
   */
  public void save(String filePath) {
    // do not append
    try (FileOutputStream tableStateStream = new FileOutputStream(filePath, false)) {
      store(tableStateStream, null);
    } catch (IOException e) {
      log.error(e.getMessage());
    }
  }

  /**
   * Saves the current configuration to a default file path.
   */
  public void save() {
    this.save(DEFAULT_FILE_PATH);
  }

  /**
   * Load a new configuration from a file.
   * 
   * @param filePath
   *          the file name
   */
  public void load(String filePath) {
    try (FileInputStream tableStateStream = new FileInputStream(filePath)) {
      load(tableStateStream);
    } catch (FileNotFoundException e) {
      log.error("No configuration file found.");
    } catch (IOException e) {
      log.error(e.getMessage());
    }
  }

  /**
   * Load a new configuration from the default file path.
   */
  public void load() {
    this.load(DEFAULT_FILE_PATH);
  }

  /**
   * Creates a shallow copy for the current configuration.
   * 
   * @return a shallow copy for the current configuration.
   */
  public MAProperties copy() {
    MAProperties copy = new MAProperties();
    copy.putAll(this);

    return copy;
  }

  /**
   * Registers a new key for the active configuration, containing the class instances currently contained in the table.
   * This ensures that this configuration will only be displayed for the same original classes.
   * 
   * @param classes
   *          the currently contained classes in the table.
   * @return the previous value of the specified key in this property list, or null if it did not have one.
   */
  public Object setCurentValidClasses(Set<String> classes) {
    String activeConfiguration = getProperty(PersistenceDialog.ACTIVE_VIEW_CONFIGURATION_KEY);
    String key = activeConfiguration + MAProperties.PERSISTENCE_KEY_VALID_CLASSES;
    String value = String.join(",", classes);

    return setProperty(key, value);
  }

  /**
   * Returns the valid classes for which the selected configuration state is valid.
   * 
   * @param state
   *          the selected configuration state.
   * @return returns the valid classes for which the selected configuration state is valid.
   */
  private Set<String> getValidClasses(String state) {
    String key = state + MAProperties.PERSISTENCE_KEY_VALID_CLASSES;
    String value = getProperty(key);

    if (value == null) {
      return Collections.emptySet();
    }

    return new HashSet<>(Arrays.asList(value.split(",")));
  }

  /**
   * Returns a shallow copy containing all the valid configurations for the selected classes.
   * 
   * @param validClasses
   *          the classes used as a key in finding the valid configurations.
   * @return a shallow copy containing all the valid configurations for the selected classes.
   */
  public MAProperties getValidProperties(Set<String> validClasses) {

    MAProperties validProperties = this.copy();
    Collection<String> availableStates = PersistenceHelper.getAvailableStates(validProperties);

    for (String state : availableStates) {
      Set<String> stateClasses = getValidClasses(state);
      if (!stateClasses.equals(validClasses)) {
        PersistenceHelper.deleteState(state, validProperties);
      }
    }

    return validProperties;
  }

}
