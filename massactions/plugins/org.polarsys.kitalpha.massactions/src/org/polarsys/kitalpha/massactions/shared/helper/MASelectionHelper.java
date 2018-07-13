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
package org.polarsys.kitalpha.massactions.shared.helper;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;

/**
 * A selection helper, providing some utility methods.
 * 
 * @author Sandu Postaru
 *
 */
public class MASelectionHelper {

  private MASelectionHelper() {
    // Exists only to defeat instantiation.
  }

  /**
   * Extracts all of the valid {@link EObject} elements from the current selection.
   * 
   * @param selection
   *          the current selection.
   * @return a list of valid {@link EObject} elements.
   */
  public static List<EObject> getElementsFromSelection(ISelection selection) {

    if (selection.isEmpty() || !(selection instanceof IStructuredSelection)) {
      return Collections.emptyList();
    }

    List<?> selectedElements = ((IStructuredSelection) selection).toList();

    return selectedElements.stream().filter(e -> e instanceof EObject).map(e -> (EObject) e)
        .collect(Collectors.toList());

  }

  public static boolean isEditingDomainEqual(Collection<EObject> elements,
      TransactionalEditingDomain existingEditingDomain) {

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
  public static TransactionalEditingDomain getEditingDomainForFirstElement(List<EObject> elements) {

    if (elements.isEmpty()) {
      return null;
    }

    return TransactionUtil.getEditingDomain(elements.get(0));
  }

  public static boolean selectionSharesSameEditingDomain(List<EObject> elements) {
    TransactionalEditingDomain defaultEditingDomain = null;

    for (EObject element : elements) {

      if (defaultEditingDomain == null) {
        defaultEditingDomain = TransactionUtil.getEditingDomain(element);
      }

      TransactionalEditingDomain currentEditingDomain = TransactionUtil.getEditingDomain(element);

      if (!defaultEditingDomain.equals(currentEditingDomain)) {
        return false;
      }
    }

    return true;
  }

}
