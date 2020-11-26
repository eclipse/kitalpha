/*******************************************************************************
 * Copyright (c) 2017, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.richtext.widget.tools.ext.strategies.openmodel;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.table.metamodel.table.DTable;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.viewpoint.DRefreshable;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.ui.PlatformUI;
import org.polarsys.kitalpha.richtext.widget.tools.ext.intf.OpenLinkStrategy;
import org.polarsys.kitalpha.richtext.widget.tools.utils.MDERichTextToolsHelper;

/**
 * 
 * @author Faycal Abka
 *
 */
public class OpenModelLinkStrategy implements OpenLinkStrategy {

	public OpenModelLinkStrategy() {
	}

	@Override
	public void openLink(Object object, String link) {
		EObject obj = MDERichTextToolsHelper.getEObject(MDERichTextToolsHelper.getAdapterFactory((EObject)object), link);
        if (obj != null) {
            if (isSemanticElement(obj)) {
            	(new SelectionRunnable(obj)).run();
            } else if (obj instanceof DSemanticDiagram) {
                Session session = SessionManager.INSTANCE.getSession(((DSemanticDiagram) obj).getTarget());
                DialectUIManager.INSTANCE.openEditor(session, (DRepresentation) obj, new NullProgressMonitor());
            } else if (obj instanceof DTable) {
                Session session = SessionManager.INSTANCE.getSession(((DTable) obj).getTarget());
                DialectUIManager.INSTANCE.openEditor(session, (DRepresentation) obj, new NullProgressMonitor());
            }
        } else {
            MessageBox msgBox = new MessageBox(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell());
            msgBox.setText("Error"); //$NON-NLS-1$
            msgBox.setMessage("'" + link + "' is not a valid model resource."); //$NON-NLS-1$ //$NON-NLS-2$
            msgBox.open();
        }
    }

	public static boolean isSemanticElement(Object object) {
		return (object instanceof EObject) && !isSiriusElement(object);
	}

	/**
	 * Returns whether an object is a Sirius element.
	 */
	private static boolean isSiriusElement(Object object) {
		return (object instanceof DRefreshable) || (object instanceof DRepresentationDescriptor);
	}

}
