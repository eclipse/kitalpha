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
package org.polarsys.kitalpha.richtext.widget.tools.manager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.polarsys.kitalpha.richtext.common.intf.MDERichTextWidget;
import org.polarsys.kitalpha.richtext.common.util.MDERichTextHelper;
import org.polarsys.kitalpha.richtext.widget.tools.internal.LinkHandlerExtension;
import org.polarsys.kitalpha.richtext.widget.tools.intf.LinkHandler;
import org.polarsys.kitalpha.richtext.widget.tools.utils.Constants;
import org.polarsys.kitalpha.richtext.widget.tools.utils.Tuple;

/**
 * 
 * @author Faycal Abka
 *
 */
public class LinkManagerImpl implements LinkManager {
	
	private MDERichTextWidget widget;
	
	protected final Map<String, String> label2type = new HashMap<String, String>();
	
	public LinkManagerImpl(MDERichTextWidget richText) {
		
		this.widget = richText;
		
		label2type.put(Constants.URL_LABEL, Constants.URL);
		label2type.put(Constants.FILE_LABEL, Constants.FILE);
		label2type.put(Constants.FILE_LOCAL_LABEL, Constants.LOCAL);
		label2type.put(Constants.MODEL_ELEMENT_LABEL, Constants.MODEL_ELEMENT);
		label2type.put(Constants.DIAGRAM_ELEMENT_LABEL, Constants.DIAGRAM_ELEMENT);
	}
	
	@Override
	public List<String> getAllLinkLabels() {
		//TODO make it more extensibles
		List<String> result = new ArrayList<String>();
		
		result.add(Constants.URL_LABEL);
		result.add(Constants.FILE_LABEL);
		result.add(Constants.FILE_LOCAL_LABEL);
		result.add(Constants.MODEL_ELEMENT_LABEL);
		result.add(Constants.DIAGRAM_ELEMENT_LABEL);
		
		return result;
	}

	@Override
	public void openLink(String link) {
		Collection<LinkHandler> handlers = LinkHandlerExtension.getHandlers();
		for (LinkHandler linkHandler : handlers) {
			if (linkHandler.canHandleLink(link)) {
				linkHandler.openLink(widget.getElement(), linkHandler.decode(link, MDERichTextHelper.getProjectPath(widget.getElement())));
				break;
			}
		}
	}

	@Override
	public Tuple<String, String> getURI(String linkType, String basePath, Object object) {
		LinkHandler handlerFor = LinkHandlerExtension.getHandlerFor(label2type.get(linkType));
		if (handlerFor != null) {
			return handlerFor.getLink(label2type.get(linkType), basePath, object);
		}
		return null;
	}

	@Override
	public String encode(String linkType, String url, String urlDisplayName) {
		LinkHandler handlerFor = LinkHandlerExtension.getHandlerFor(label2type.get(linkType));
		if (handlerFor != null) {
			return handlerFor.encode(url, urlDisplayName);
		}
		return null;
	}
	
}
