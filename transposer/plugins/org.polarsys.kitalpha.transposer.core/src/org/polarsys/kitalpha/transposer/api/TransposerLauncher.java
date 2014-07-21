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

package org.polarsys.kitalpha.transposer.api;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

import org.eclipse.core.runtime.IProgressMonitor;

import org.polarsys.kitalpha.transposer.analyzer.graph.Vertex;
import org.polarsys.kitalpha.transposer.generic.GenericTransposer;

/**
 * This class allows to launch a complete transposer's process.
 * 
 * @author Guillaume Gebhart
 * 
 */
public final class TransposerLauncher {

/**
 * Allows to launch Transposer.
 * @param selection_p the current selection
 * @param purpose_p the selected purpose
 * @param mappingId_p the selected mapping id
 * @param configuration_p the transposer configuration
 * @param comparator_p a comparator for sort independant elements
 * @param monitor_p ProgressMonitor
 */
  public static void launch(final Collection<Object> selection_p, final String purpose_p, final String mappingId_p,
      final TransposerConfiguration configuration_p, final Comparator<Vertex<?>> comparator_p,final IProgressMonitor monitor_p) {

    ITransposer transposer = new GenericTransposer(purpose_p, mappingId_p);

    transposer.transpose(selection_p, configuration_p, comparator_p, monitor_p);

    transposer.dispose();
  }

/**
 * Allows to launch Transposer.
 * @param selection_p: the current selection
 * @param purpose_p: the selected purpose
 * @param mappingId_p: the selected mapping id
 * @param configuration_p: the transposer configuration
 * @param comparator_p a comparator for sort independant elements
 * @param monitor_p: ProgressMonitor
 */
  public static void launch(final Object selection_p, final String purpose_p, final String mappingId_p, final TransposerConfiguration configuration_p, final Comparator<Vertex<?>> comparator_p,IProgressMonitor monitor_p) {
    Collection<Object> selection = new ArrayList<Object>(1);
    selection.add(selection_p);

    launch(selection, purpose_p, mappingId_p, configuration_p, comparator_p,monitor_p);
  }
  
  
  /**
   * Allows to launch Transposer.
   * @param selection_p the current selection
   * @param purpose_p the selected purpose
   * @param mappingId_p the selected mapping id
   * @param configuration_p the transposer configuration
   * @param monitor_p ProgressMonitor
   */
    public static void launch(final Collection<Object> selection_p, final String purpose_p, final String mappingId_p,
        final TransposerConfiguration configuration_p,final IProgressMonitor monitor_p) {

      ITransposer transposer = new GenericTransposer(purpose_p, mappingId_p);

      transposer.transpose(selection_p, configuration_p, null, monitor_p);

      transposer.dispose();
    }

  /**
   * Allows to launch Transposer.
   * @param selection_p: the current selection
   * @param purpose_p: the selected purpose
   * @param mappingId_p: the selected mapping id
   * @param configuration_p: the transposer configuration
   * @param monitor_p: ProgressMonitor
   */
    public static void launch(final Object selection_p, final String purpose_p, final String mappingId_p, final TransposerConfiguration configuration_p,IProgressMonitor monitor_p) {
      Collection<Object> selection = new ArrayList<Object>(1);
      selection.add(selection_p);

      launch(selection, purpose_p, mappingId_p, configuration_p, null,monitor_p);
    }
}
