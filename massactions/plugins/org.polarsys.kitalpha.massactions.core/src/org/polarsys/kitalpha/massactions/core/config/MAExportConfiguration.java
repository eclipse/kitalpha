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
package org.polarsys.kitalpha.massactions.core.config;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.commons.lang.StringEscapeUtils;
import org.eclipse.nebula.widgets.nattable.config.AbstractRegistryConfiguration;
import org.eclipse.nebula.widgets.nattable.config.IConfigRegistry;
import org.eclipse.nebula.widgets.nattable.export.ExportConfigAttributes;
import org.eclipse.nebula.widgets.nattable.export.csv.CsvExporter;
import org.eclipse.nebula.widgets.nattable.layer.cell.ILayerCell;

/**
 * This class configures the default exporter to a CSV exporter.
 * 
 * @author Sandu Postaru
 *
 */
public class MAExportConfiguration extends AbstractRegistryConfiguration {

  @Override
  public void configureRegistry(IConfigRegistry configRegistry) {

    CsvExporter csvExporter = new CsvExporter() {

      @Override
      public void exportCell(OutputStream outputStream, Object exportDisplayValue, ILayerCell cell,
          IConfigRegistry configRegistry) throws IOException {

        // export everything except the row headers, since they contain images
        if (cell.getColumnIndex() != 0) {

          // escape String values
          if (exportDisplayValue instanceof String) {
            String escapedExportDisplayValue = StringEscapeUtils.escapeCsv((String) exportDisplayValue);
            super.exportCell(outputStream, escapedExportDisplayValue, cell, configRegistry);
          } else {
            super.exportCell(outputStream, exportDisplayValue, cell, configRegistry);
          }
        }
      }
    };

    csvExporter.setDelimiter(",");
    configRegistry.registerConfigAttribute(ExportConfigAttributes.EXPORTER, csvExporter);
  }

}
