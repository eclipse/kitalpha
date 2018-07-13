/*******************************************************************************
 * Copyright (c) 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.massactions.core.activator;

import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * 
 * @author Sandu Postaru
 *
 */
public class MACoreActivator extends AbstractUIPlugin {

  // The plug-in ID
  public static final String PLUGIN_ID = "org.polarsys.kitalpha.massactions.core"; //$NON-NLS-1$

  // image registry keys
  public static final String IMAGE_ERROR_OBJECT = "DEFAULT_ROW_HEADER_ICON";
  public static final String IMAGE_SWITCH_PERSPECTIVE = "IMAGE_SWITCH_PERSPECTIVE";
  public static final String IMAGE_EDIT = "IMAGE_EDIT";
  public static final String IMAGE_REMOVE = "IMAGE_REMOVE";

  // extensions ID
  public static final String EP_COLUMN_PROVIDER_ID = "org.polarsys.kitalpha.massactions.core.columnprovider";
  public static final String EP_COLUMN_FILTER_ID = "org.polarsys.kitalpha.massactions.core.columnfilter";

  // extension point attributes
  public static final String EP_COLUMN_FILTER_DISPLAY_NAME_ID = "displayName";
  public static final String EP_COLUMN_PROVDER_KIND_ID = "kind";

  // extension point attributes values
  public static final String EP_COLUMN_PROVIDER_KIND_EDITING_VALUE = "editing";
  public static final String EP_COLUMN_PROVIDER_KIND_VISUALIZATION_VALUE = "visualization";

  // The shared instance
  private static MACoreActivator plugin;

  @Override
  public void start(BundleContext context) throws Exception {
    super.start(context);
    plugin = this;
  }

  @Override
  public void stop(BundleContext context) throws Exception {
    plugin = null;
    super.stop(context);
  }

  /**
   * Returns the shared instance
   *
   * @return the shared instance
   */
  public static MACoreActivator getDefault() {
    return plugin;
  }

  @Override
  protected void initializeImageRegistry(ImageRegistry reg) {
    super.initializeImageRegistry(reg);

    reg.put(IMAGE_ERROR_OBJECT, imageDescriptorFromPlugin(PLUGIN_ID, "icons/error_obj.png"));
    reg.put(IMAGE_SWITCH_PERSPECTIVE, imageDescriptorFromPlugin(PLUGIN_ID, "icons/switch_perspective.png"));
    reg.put(IMAGE_EDIT, imageDescriptorFromPlugin(PLUGIN_ID, "icons/edit.gif"));
    reg.put(IMAGE_REMOVE, imageDescriptorFromPlugin(PLUGIN_ID, "icons/remove.png"));
  }

}
