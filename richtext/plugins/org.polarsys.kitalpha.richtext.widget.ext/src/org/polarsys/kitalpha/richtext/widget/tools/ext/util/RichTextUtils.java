/*******************************************************************************
 * Copyright (c) 2023 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.richtext.widget.tools.ext.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.ui.tools.internal.dialogs.SingleRepresentationTreeSelectionDialog;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.swt.widgets.Display;
import org.polarsys.kitalpha.richtext.widget.tools.dialogs.FilteredElementTreeSelectionDialog;
import org.polarsys.kitalpha.richtext.widget.tools.messages.Messages;
import org.polarsys.kitalpha.richtext.widget.tools.utils.MDERichTextToolsHelper;

/**
 * 
 * Provides util methods to select model and diagram elements from a dialog
 *
 */
public class RichTextUtils {

  public static RichTextUtils eInstance = new RichTextUtils();

  private RichTextUtils() {

  }

  /**
   * Given a source element, opens a dialog to browser for a model element in the same resource
   * 
   * @param source
   * @return
   */
  public Object selectModelElementFromDialog(EObject source) {

    AdapterFactoryLabelProvider labelProvider = MDERichTextToolsHelper.getLabelProvider(source);
    AdapterFactoryContentProvider contentProvider = MDERichTextToolsHelper.getContentProvider(source);
    if (labelProvider != null && contentProvider != null) {
      FilteredElementTreeSelectionDialog dialog = new FilteredElementTreeSelectionDialog(
          Display.getCurrent().getActiveShell(), labelProvider, contentProvider);
      dialog.setTitle(Messages.RichTextWidget_Dialog_Title_Model_Element_Selection);
      dialog.setMessage(Messages.RichTextWidget_Dialog_Title_Selection_Model_Element);

      EObject root;

      // To find the root container, if the selected element is a
      // diagram, use its target instead
      // otherwise the dialog box will browse the AirdResource.
      if (source instanceof DRepresentationDescriptor) {
        DRepresentationDescriptor diagram = (DRepresentationDescriptor) source;
        root = EcoreUtil.getRootContainer(diagram.getTarget());

      } else if (source instanceof DRepresentation && source instanceof DSemanticDecorator) {
        DSemanticDecorator diagram = (DSemanticDecorator) source;
        root = EcoreUtil.getRootContainer(diagram.getTarget());

      } else {
        root = EcoreUtil.getRootContainer(source);
      }

      dialog.setInput(root.eResource());
      if (Window.OK == dialog.open()) {
        Object result = dialog.getFirstResult();
        return result;
      }
    }
    return null;
  }

  /**
   * Given a source diagram element, opens a dialog to select one of its diagram elements
   * 
   * @param source
   * @return
   */
  public Object selectDiagramElementFromDialog(EObject source) {
    if (source instanceof DSemanticDecorator) {
      source = ((DSemanticDecorator) source).getTarget();

    } else if (source instanceof DRepresentationDescriptor) {
      source = ((DRepresentationDescriptor) source).getTarget();
    }

    Session session = SessionManager.INSTANCE.getSession(source);
    SingleRepresentationTreeSelectionDialog dialog = new SingleRepresentationTreeSelectionDialog(
        Display.getCurrent().getActiveShell(), session);

    if (Window.OK == dialog.open()) {
      return dialog.getResult();
    }
    return null;
  }
}
