/*******************************************************************************
 * Copyright (c) 2018, 2019  Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 *  Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.massactions.core.config;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

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
  protected String csvDelimiter;
  protected Charset charSet;

  public MAExportConfiguration() {
    this(",");
  }

  public MAExportConfiguration(String csvDelimiter) {
    super();
    this.csvDelimiter = csvDelimiter;
    this.charSet = StandardCharsets.UTF_8;
  }

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

    csvExporter.setDelimiter(String.valueOf(csvDelimiter));
    csvExporter.setCharset(charSet.name());

    configRegistry.registerConfigAttribute(ExportConfigAttributes.EXPORTER, csvExporter);
  }

  public void setCsvDelimiter(String csvDelimiter) {
    this.csvDelimiter = csvDelimiter;
  }

  public void setCharSet(Charset charSet) {
    this.charSet = charSet;
  }
}
