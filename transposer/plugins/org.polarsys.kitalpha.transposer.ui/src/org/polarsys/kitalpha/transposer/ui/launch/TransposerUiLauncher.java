/*******************************************************************************
 * Copyright (c) 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.transposer.ui.launch;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.progress.IProgressConstants;

import org.polarsys.kitalpha.transposer.api.TransposerConfiguration;
import org.polarsys.kitalpha.transposer.api.TransposerLauncher;
import org.polarsys.kitalpha.transposer.ui.TransposerUiPlugin;

/**
 * This class allows to launch a complete code generation.
 * 
 * @author Guillaume Gebhart
 * 
 */
public final class TransposerUiLauncher {

  private static String IMG_KEY = "transposer.image"; //$NON-NLS-1$

  /**
   * 
   * @param selection_p
   * @param purpose_p
   * @param mappingId_p
   * @param configuration_p
   */
  public static void launchInJob(final Collection<Object> selection_p, final String purpose_p, final String mappingId_p,
      final TransposerConfiguration configuration_p) {

    String jobName = "Transposer (purpose : " + purpose_p + ", mapping : " + mappingId_p + ")";//$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    Job job = new Job(jobName) {

      @Override
      protected IStatus run(IProgressMonitor monitor_p) {
        setProperty(IProgressConstants.ICON_PROPERTY, getImage());
        TransposerLauncher.launch(selection_p, purpose_p, mappingId_p, configuration_p, monitor_p);
        return Status.OK_STATUS;
      }
    };
    job.setUser(true);
    job.schedule();
  }

  protected static Object getImage() {
    ImageDescriptor desc = TransposerUiPlugin.getDefault().getImageRegistry().getDescriptor(IMG_KEY);
    if (desc == null) {
      try {
        URL url = new URL(TransposerUiPlugin.getDefault().getBundle().getEntry("/") + "icons/transposer.gif"); //$NON-NLS-1$ //$NON-NLS-2$
        desc = ImageDescriptor.createFromURL(url);
        TransposerUiPlugin.getDefault().getImageRegistry().put(IMG_KEY, desc);
      } catch (MalformedURLException e) {
        // do nothing, cannot find image
      }
    }

    return desc;
  }

  /**
   * 
   * @param selection_p
   * @param purpose_p
   * @param mappingId_p
   * @param configuration_p
   */
  public static void launchInJob(final Object selection_p, final String purpose_p, final String mappingId_p, final TransposerConfiguration configuration_p) {
    Collection<Object> selection = new ArrayList<Object>(1);
    selection.add(selection_p);

    launchInJob(selection, purpose_p, mappingId_p, configuration_p);
  }

}
