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
package org.polarsys.kitalpha.massactions.core.column;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.nebula.widgets.nattable.config.IConfigRegistry;
import org.polarsys.kitalpha.massactions.core.column.primitive.MAPrimitiveColumn;
import org.polarsys.kitalpha.massactions.core.table.layer.IMAComponent;

/**
 * Represents a column abstraction that corresponds to a displayed column. Its main role is to manage the column data
 * (obtaining the current value of this column for a particular table row and modifying it accordingly).
 * 
 * It is advised that you do not implement this interface directly, and instead inherit of either
 * {@link AbstractMAColumn} or {@link MAPrimitiveColumn}.
 *
 * @author Sandu Postaru
 * 
 */
public interface IMAColumn extends IMAComponent {

  /**
   * Returns the current cell value of this column for a specific row object.
   * 
   * @param rowObject
   *          the row object
   * @return the current cell value of this column for a specific row object
   */
  Object getDataValue(EObject rowObject);

  /**
   * Modifies the current cell value of this column for a specific row object.
   * 
   * @param rowObject
   *          the row object
   * @param newValue
   *          the new cell value
   */
  void setDataValue(EObject rowObject, Object newValue);

  /**
   * Configures the internal NatTable registry associated with this column. This methods is part of our internal
   * mechanism and should not be overridden by client code, as you should generally extend either
   * {@link AbstractMAColumn} or {@link MAPrimitiveColumn}.
   * 
   * @param configRegistry
   *          the configuration registry
   */
  void configureRegistry(IConfigRegistry configRegistry);

  /**
   * Destroys the internal NatTable registry associated with this column. This methods is part of our internal mechanism
   * and should not be overridden by client code, as you should generally extends either {@link AbstractMAColumn} or
   * {@link MAPrimitiveColumn}.
   * 
   * @param configRegistry
   *          the configuration registry
   */
  void destroyRegistry(IConfigRegistry configRegistry);

  /**
   * Returns the index of this column.
   * 
   * @return the current index of this column.
   */
  int getIndex();

  /**
   * Sets the the current index of this column.
   * 
   * @param index
   *          the the current index of this column
   */
  void setIndex(int index);

  /**
   * Returns the label of this column, this label is used for the registry configuration.
   * 
   * @return the label of this column
   */
  String getLabel();

  /**
   * Returns the sort label of this column, this label is used for the sorting behaviour in the registry configuration.
   * 
   * @return the label of this column
   */
  String getSortLabel();

  /**
   * Returns the name of this column, this name is the displayed title for this column.
   * 
   * @return the name of this column
   */
  String getName();

  /**
   * Sets the name of this column, this name is the displayed title for this column.
   * 
   * @param name
   *          the name of this column
   */
  void setName(String name);

  /**
   * Returns the unique id for this column.
   * 
   * @return the unique id for this column
   */
  String getId();

  /**
   * Sets the editable status for this column.
   * 
   * @param editable
   *          the editable status
   */
  void setEditable(boolean editable);

  /**
   * Returns the editable status for this column.
   * 
   * @return the editable status for this column
   */
  boolean isEditable();

}
