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
package org.polarsys.kitalpha.richtext.widget.tools.ext.types;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.resource.ResourceDescriptor;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;
import org.polarsys.kitalpha.richtext.widget.tools.ext.util.RichTextUtils;
import org.polarsys.kitalpha.richtext.widget.tools.intf.LinkHandler;
import org.polarsys.kitalpha.richtext.widget.tools.utils.MDERichTextToolsHelper;
import org.polarsys.kitalpha.richtext.widget.tools.utils.Tuple;

/**
 * 
 * @author Faycal Abka
 * @author Minh Tu Ton That
 *
 */
public class DiagramElementLinkHandler extends ModelElementLinkHandler implements LinkHandler {

	public DiagramElementLinkHandler() {
	}

	@Override
	public Tuple<String, String> getLink(String linkType, String basePath, Object object) {
		Tuple<String, String> path = null;
		if (object instanceof EObject) {
      Object result = RichTextUtils.eInstance.selectDiagramElementFromDialog((EObject) object);
      path = getTuple(result.toString(), result);
		}
		return path;
	}

	@Override
	protected Tuple<String, String> getTuple(String link, Object object) {
		// To create links to DRepresentations, use their UID
		if (object instanceof DRepresentationDescriptor) {
			String label = MDERichTextToolsHelper.getName((EObject) object);
			String uri = "";
			ResourceDescriptor path = ((DRepresentationDescriptor) object).getRepPath();
			if (path != null) {
				URI urif = path.getResourceURI();
				if (urif != null) {
					uri = urif.fragment();
				}
			}
			return new Tuple<>(uri, label);
		}
		return super.getTuple(link, object);
	}
}
