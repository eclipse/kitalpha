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
package org.polarsys.kitalpha.massactions.core.notification;

import java.util.Collection;
import java.util.EventListener;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.ecore.extender.business.api.permission.IAuthorityListener;
import org.eclipse.sirius.ecore.extender.business.api.permission.IPermissionAuthority;
import org.eclipse.sirius.ecore.extender.business.api.permission.PermissionAuthorityRegistry;
import org.polarsys.kitalpha.massactions.core.glazedlists.MAObservableElementList;

import ca.odell.glazedlists.ObservableElementList;

/**
 * The default implementation of an Connector for the Observable list.
 *
 * It installs two listeners on each of the present elements in order to detect changes for their state.
 * 
 * The first listener notifies the list of any internal changes for the elements.
 * 
 * The second listener notifies the list of any permission changes for the elements (typically a lock change status used
 * in collaborative environments).
 * 
 * @author Sandu Postaru
 * 
 */
public class MAConnector implements ObservableElementList.Connector<EObject> {

  /**
   * The list which contains the elements being observed via this {@link ObservableElementList.Connector}.
   */
  protected MAObservableElementList list;

  /** The EObjectChangedListener to install on each list element. */
  protected MAEObjectChangedListener eObjectChangedListener = this.createEObjectChangedListener();

  /** The LockStatusChangedListener to install on each list element. **/
  protected LockStatusChangedListener lockStatusChangedListener = this.createLockStatusChangedListener();

  @Override
  public EventListener installListener(EObject element) {
    
    List<Adapter> adapters = element.eAdapters();

    // add the object listener if it does not already exists
    if (!adapters.contains(eObjectChangedListener)) {
      adapters.add(eObjectChangedListener);
    }

    IPermissionAuthority permissionAuthority = PermissionAuthorityRegistry.getDefault().getPermissionAuthority(element);

    // add the lock status changed listener
    permissionAuthority.addAuthorityListener(lockStatusChangedListener);

    return eObjectChangedListener;
  }

  @Override
  public void uninstallListener(EObject element, EventListener listener) {

    if (listener instanceof MAEObjectChangedListener) {
      element.eAdapters().remove((MAEObjectChangedListener) listener);
    }
  }

  @Override
  public void setObservableElementList(ObservableElementList<? extends EObject> list) {
    this.list = (MAObservableElementList) list;
  }

  /**
   * A local factory method to produce the EOBjectChangedListener which will be installed on list elements.
   */
  protected MAEObjectChangedListener createEObjectChangedListener() {
    return new MAEObjectChangedListener();
  }

  /**
   * A local factory method to produce the lockStatusChnagedListener which will be installed on list elements.
   */
  protected LockStatusChangedListener createLockStatusChangedListener() {
    return new LockStatusChangedListener();
  }

  /**
   * The EObjectChangedListener which notifies the {@link ObservableElementList} within this Connector of internal
   * changes regarding one of its elements.
   * 
   */
  public class MAEObjectChangedListener extends AdapterImpl implements EventListener {

    private void objectChangedAction(Object notifier) {
      list.elementChanged(notifier);
    }

    @Override
    public void notifyChanged(Notification notification) {

      switch (notification.getEventType()) {

      case Notification.SET:
      case Notification.UNSET:
      case Notification.ADD:
      case Notification.REMOVE:
      case Notification.ADD_MANY:
      case Notification.REMOVE_MANY:
      case Notification.MOVE:
        objectChangedAction(notification.getNotifier());
        break;

      default:
        break;
      }
    }
  }

  /**
   * The LockStatusChangedListener which notifies the {@link ObservableElementList} within this Connector of a lock
   * status changes regarding a subset of its elements.
   *
   */
  public class LockStatusChangedListener implements IAuthorityListener {

    @Override
    public void notifyIsLocked(EObject instance) {
      list.elementChanged(instance);
    }

    @Override
    public void notifyIsReleased(EObject instance) {
      list.elementChanged(instance);
    }

    @Override
    public void notifyIsLocked(Collection<EObject> instances) {
      list.multipleElementsChanged(instances);
    }

    @Override
    public void notifyIsReleased(Collection<EObject> instances) {
      list.multipleElementsChanged(instances);
    }
  }

}
