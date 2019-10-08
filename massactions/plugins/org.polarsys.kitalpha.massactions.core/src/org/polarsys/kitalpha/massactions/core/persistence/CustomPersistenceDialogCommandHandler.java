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

import java.util.Set;

import org.eclipse.nebula.widgets.nattable.NatTable;
import org.eclipse.nebula.widgets.nattable.persistence.PersistenceHelper;
import org.eclipse.nebula.widgets.nattable.persistence.command.DisplayPersistenceDialogCommandHandler;

/**
 * <p>
 * <font color="red">Experimental</font>
 * </p>
 * 
 * This class is a direct extension to the {@link DisplayPersistenceDialogCommandHandler}, allowing us to insure that
 * only the valid configurations for the current contained elements are displayed. In order to achieve that, we export
 * with every configuration - a key based on the current class instances contained in the table, and on import we remove
 * any properties that are invalid regarding this key.
 * 
 * @author Sandu Postaru
 * 
 */
public class CustomPersistenceDialogCommandHandler extends DisplayPersistenceDialogCommandHandler {

  /**
   * The class names for which the <b>valid</b> available configurations will be displayed.
   */
  private Set<String> validClasses;

  /**
   * The original properties containing <b>all</b> the available configurations.
   */
  private MAProperties originalProperties;

  /**
   * A flag indicating if the current configuration is dirty (contains modifications that are not persisted). A save is
   * performed only if this flag has the value {@code true}.
   */
  private boolean dirtyState;

  public CustomPersistenceDialogCommandHandler(MAProperties properties, NatTable natTable, Set<String> validClasses) {
    super(properties, natTable);

    this.validClasses = validClasses;
    this.originalProperties = properties;

    setDirtyState(false);

    initializeData();
    initializeListeners();
  }

  private void initializeData() {
    // get the valid properties in regards to the current valid classes
    MAProperties validProperties = originalProperties.getValidProperties(validClasses);

    // display only these properties when a new persistence dialog is
    // created
    setProperties(validProperties);
  }

  /**
   * This method should be invoked when the current table content has changed. This insures that only the valid
   * properties for the new table content will be displayed.
   * 
   * @param currentClasses
   *          the new classes contained in the table
   */
  public void update(Set<String> currentClasses) {

    if (isDirtyState()) {
      // propagate any previous local changes - to the original properties
      originalProperties.putAll(getProperties());
    }

    this.validClasses = currentClasses;
    initializeData();
  }

  @Override
  public MAProperties getProperties() {
    return (MAProperties) super.getProperties();
  }

  private void initializeListeners() {
    addStateChangeListener(event -> {

      // the state changed -> the state is now dirty
      setDirtyState(true);

      switch (event.getType()) {

      case CREATE:
        // a new local configuration is created -> add the valid classes
        // key
        getProperties().setCurentValidClasses(validClasses);
        break;

      case DELETE:
        // an old local configuration is created -> delete it from the
        // global properties
        PersistenceHelper.deleteState(event.getViewConfigName(), originalProperties);
        break;

      default:
        break;
      }
    });
  }

  public void saveState() {

    if (isDirtyState()) {
      // copy any local changes to the global properties before the save
      originalProperties.putAll(getProperties());
      // save the changes
      originalProperties.save();
      setDirtyState(false);
    }
  }

  private boolean isDirtyState() {
    return dirtyState;
  }

  private void setDirtyState(boolean dirtyState) {
    this.dirtyState = dirtyState;
  }
}
