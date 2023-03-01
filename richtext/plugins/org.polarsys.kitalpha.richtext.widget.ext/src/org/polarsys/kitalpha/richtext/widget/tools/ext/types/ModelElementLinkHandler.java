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

import org.apache.commons.lang.StringEscapeUtils;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.polarsys.kitalpha.richtext.widget.tools.ext.util.RichTextUtils;
import org.polarsys.kitalpha.richtext.widget.tools.intf.LinkHandler;
import org.polarsys.kitalpha.richtext.widget.tools.utils.MDERichTextToolsHelper;
import org.polarsys.kitalpha.richtext.widget.tools.utils.Tuple;

/**
 * 
 * @author Faycal Abka
 *
 */
public class ModelElementLinkHandler extends AbstractModelOpenLink implements LinkHandler {

	public ModelElementLinkHandler() {
	}

	@Override
	public Tuple<String, String> getLink(String linkType, String basePath, Object object) {
    Tuple<String, String> path = null;
    if (object instanceof EObject) {
      Object result = RichTextUtils.eInstance.selectModelElementFromDialog((EObject) object);
      if (result instanceof EObject) {
        String link = EcoreUtil.getURI((EObject) result).toString();
        path = getTuple(link, result);
      }
    }
    return path;
	}

	protected Tuple<String, String> getTuple(String link, Object object) {
		String result = null;
		String label = null;
		if (object instanceof EObject) {
			EObject eObject = (EObject) object;
			label = MDERichTextToolsHelper.getName(eObject);
			Resource eResource = eObject.eResource();
			if (eResource instanceof XMLResource) {
				result = ((XMLResource) eResource).getID(eObject);
			}
			if (result == null) {
				result = EcoreUtil.getURI(eObject).fragment();
				if (result != null) {
					return new Tuple<String, String>(result, label);
				}
			}
		}
		if (result == null) {
			result = link;
		}
		return new Tuple<String, String>(result, label);
	}

	@Override
	public String encode(String url, String urlDisplayName) {
		return "<a href=\"hlink://" + url + "\">" + StringEscapeUtils.escapeHtml(urlDisplayName) + "</a>"; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
	}

	@Override
	public String decode(String url, String basePath) {
		url = url.replaceFirst("hlink://", ""); //$NON-NLS-1$ //$NON-NLS-2$
		url = url.replaceAll("/", ""); //$NON-NLS-1$ //$NON-NLS-2$
		return url;
	}

}
