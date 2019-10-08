/*******************************************************************************
 * Copyright (c) 2018, 2019  Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.massactions.core.data.provider;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.nebula.widgets.nattable.data.IDataProvider;
import org.eclipse.nebula.widgets.nattable.data.IRowDataProvider;
import org.eclipse.swt.graphics.Image;
import org.polarsys.kitalpha.massactions.core.activator.MACoreActivator;
import org.polarsys.kitalpha.massactions.core.helper.EObjectImageProvider;

/***
 * A custom row header data provider, that replaces the default behavior (displaying the index of the row) with
 * displaying the image associated with the row object. A custom theme configuration is required to properly display the
 * image.
 * 
 * @author Sandu Postaru
 * 
 */
public class MAImageRowHeaderDataProvider implements IDataProvider {

  /***
   * The body data provider used as source for extracting the row object.
   */
  protected IRowDataProvider<EObject> bodyDataProvider;

  /**
   * The default image, in case no image is available for the selected {@link EObject}
   */
  protected Image defaultImage;

  public MAImageRowHeaderDataProvider(IRowDataProvider<EObject> bodyDataProvider) {
    this.bodyDataProvider = bodyDataProvider;
    this.defaultImage = MACoreActivator.getDefault().getImageRegistry()
        .getDescriptor(MACoreActivator.IMAGE_ERROR_OBJECT).createImage();
  }

  @Override
  public Object getDataValue(int columnIndex, int rowIndex) {

    // a filter has been applied and no rows match the current filter
    // therefore no image should be returned
    if (rowIndex == -1) {
      return null;
    }

    try {
      EObject rowObject = bodyDataProvider.getRowObject(rowIndex);
      Image image = extractImage(rowObject);

      return image != null ? image : defaultImage;
    } catch (ClassCastException e) {
      // Even if our body data provider is of EObject type, when using the
      // group by option the data provider also contains GroupByObjects.
      // For those objects we display no image.
      return null;
    }

  }

  protected Image extractImage(EObject object) {
    return EObjectImageProvider.getInstance().getImage(object);
  }

  @Override
  public void setDataValue(int columnIndex, int rowIndex, Object newValue) {
    throw new UnsupportedOperationException();
  }

  @Override
  public int getColumnCount() {
    return 1;
  }

  @Override
  public int getRowCount() {
    return bodyDataProvider.getRowCount();
  }
}
