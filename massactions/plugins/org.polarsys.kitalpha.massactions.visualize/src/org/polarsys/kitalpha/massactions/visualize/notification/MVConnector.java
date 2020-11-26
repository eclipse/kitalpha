/*******************************************************************************
 * Copyright (c) 2018  Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 *  Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.massactions.visualize.notification;

import java.util.Collection;
import java.util.EventListener;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.massactions.core.notification.MAConnector;
import org.polarsys.kitalpha.massactions.visualize.helpers.container.UnfoldedRowObject;
import org.polarsys.kitalpha.massactions.visualize.unfold.MVPerspectiveManager;

import ca.odell.glazedlists.ObservableElementList;

/**
 * An extension of the default {@link MAConnector} that adds status changed support for unfolded objects.
 * 
 * @author Sandu Postaru
 * 
 */
public class MVConnector extends MAConnector {

  protected MVPerspectiveManager perspectiveManager;

  public MVConnector(MVPerspectiveManager perspectiveManager) {
    super();
    this.perspectiveManager = perspectiveManager;
  }

  @Override
  public EventListener installListener(EObject element) {

    if (element instanceof UnfoldedRowObject) {
      // unfolded objects can not change
      // do not add a listener
      return null;
    }

    return super.installListener(element);
  }

  @Override
  protected LockStatusChangedListener createLockStatusChangedListener() {
    return new MVLockStatusChangedListener();
  }

  /**
   * The MVLockStatusChangedListener which notifies the {@link ObservableElementList} within this Connector of a lock
   * status changes regarding a subset of its elements.
   *
   * This listener adds support for status changed events regarding unfolded elements.
   * 
   */
  public class MVLockStatusChangedListener extends LockStatusChangedListener {

    @Override
    public void notifyIsLocked(EObject instance) {
      if (perspectiveManager.isFolded()) {
        super.notifyIsLocked(instance);
      } else {
        Collection<EObject> unfoldedData = perspectiveManager.getUnfoldedObjectsForRoot(instance);
        list.multipleElementsChanged(unfoldedData);
      }
    }

    @Override
    public void notifyIsReleased(EObject instance) {
      if (perspectiveManager.isFolded()) {
        super.notifyIsReleased(instance);
      } else {
        Collection<EObject> unfoldedData = perspectiveManager.getUnfoldedObjectsForRoot(instance);
        list.multipleElementsChanged(unfoldedData);
      }
    }

    @Override
    public void notifyIsLocked(Collection<EObject> instances) {
      if (perspectiveManager.isFolded()) {
        super.notifyIsLocked(instances);
      } else {
        Set<EObject> unfoldedData = instances.stream()
            .flatMap(o -> perspectiveManager.getUnfoldedObjectsForRoot(o).stream()).collect(Collectors.toSet());

        list.multipleElementsChanged(unfoldedData);
      }
    }

    @Override
    public void notifyIsReleased(Collection<EObject> instances) {
      if (perspectiveManager.isFolded()) {
        super.notifyIsReleased(instances);
      } else {
        Set<EObject> unfoldedData = instances.stream()
            .flatMap(o -> perspectiveManager.getUnfoldedObjectsForRoot(o).stream()).collect(Collectors.toSet());

        list.multipleElementsChanged(unfoldedData);
      }
    }
  }

}
