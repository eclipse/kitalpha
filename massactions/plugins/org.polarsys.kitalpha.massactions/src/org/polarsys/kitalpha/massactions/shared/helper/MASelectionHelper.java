/*******************************************************************************
 * Copyright (c) 2018, 2019 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.massactions.shared.helper;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.ui.ISelectionService;

/**
 * A selection helper, providing some utility methods.
 * 
 * @author Sandu Postaru
 *
 */
public class MASelectionHelper {

  /**
   * Extracts all of the valid {@link EObject} elements from the current selection.
   * 
   * @param selection
   *          the current selection.
   * @return a list of valid {@link EObject} elements.
   */
  public Collection<EObject> getElementsFromSelection(ISelection selection) {

    if (selection.isEmpty() || !(selection instanceof IStructuredSelection)) {
      return Collections.emptyList();
    }

    List<?> selectedElements = ((IStructuredSelection) selection).toList();

    return selectedElements.stream().filter(e -> e instanceof EObject).map(e -> (EObject) e)
        .collect(Collectors.toList());

  }

  public boolean isEditingDomainEqual(Collection<EObject> elements, TransactionalEditingDomain existingEditingDomain) {

    for (EObject element : elements) {
      TransactionalEditingDomain currentEditingDomain = TransactionUtil.getEditingDomain(element);

      if (!existingEditingDomain.equals(currentEditingDomain)) {
        return false;
      }
    }

    return true;
  }

  /**
   * Returns the editing domain if it is shared by all the elements and null otherwise.
   * 
   * @param elements
   *          analyzed elements.
   * @return the editing domain if it is shared by all the elements and null otherwise.
   */
  public TransactionalEditingDomain getEditingDomainForFirstElement(Collection<EObject> elements) {

    if (elements.isEmpty()) {
      return null;
    }

    return TransactionUtil.getEditingDomain(elements.iterator().next());
  }

  public boolean selectionSharesSameEditingDomain(Collection<EObject> elements) {
    if (elements.isEmpty()) {
      return false;
    }

    Iterator<EObject> iterator = elements.iterator();
    EObject firstElement = iterator.next();
    TransactionalEditingDomain sharedEditingDomain = TransactionUtil.getEditingDomain(firstElement);

    if (sharedEditingDomain == null) {
      return false;
    }

    while (iterator.hasNext()) {
      EObject element = iterator.next();
      TransactionalEditingDomain currentEditingDomain = TransactionUtil.getEditingDomain(element);
      if (currentEditingDomain == null || !sharedEditingDomain.equals(currentEditingDomain)) {
        return false;
      }
    }

    return true;
  }

  /**
   * Returns the EditingDomain for the elements in the current selection service, or null if the elements have different
   * EditingDomain.
   * 
   * @param selectionService
   *          the {@link SelectionAdapter} service
   * @return the EditingDomain for the elements in the current selection service, or null if they elements have
   *         different EditingDomain.
   */
  public TransactionalEditingDomain getEditingDomainFromSelectionService(ISelectionService selectionService) {
    TransactionalEditingDomain editingDomain = null;

    if (selectionService != null) {
      ISelection siteSelection = selectionService.getSelection();
      Collection<EObject> elementsFromSelection = getElementsFromSelection(siteSelection);

      if (selectionSharesSameEditingDomain(elementsFromSelection)) {
        editingDomain = getEditingDomainForFirstElement(elementsFromSelection);
      }
    }

    return editingDomain;
  }
}
