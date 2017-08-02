/*******************************************************************************
 * Copyright (c) 2017 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.richtext.mde.tools.managers;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.polarsys.kitalpha.richtext.common.intf.MDERichTextWidget;
import org.polarsys.kitalpha.richtext.common.util.MDERichTextHelper;
import org.polarsys.kitalpha.richtext.mde.tools.internal.extension.ExtensionManager;
import org.polarsys.kitalpha.richtext.mde.tools.links.protocole.handlers.FileLinkHandler;
import org.polarsys.kitalpha.richtext.mde.tools.links.protocole.handlers.HttpLinkHandler;
import org.polarsys.kitalpha.richtext.mde.tools.links.protocole.handlers.LocalLinkHandler;
import org.polarsys.kitalpha.richtext.mde.tools.links.protocole.handlers.ModelElementHandler;
import org.polarsys.kitalpha.richtext.mde.tools.utils.Constants;
import org.polarsys.kitalpha.richtext.mde.tools.utils.MDERichTextToolsHelper;

/**
 * 
 * @author Faycal Abka
 *
 */
public class LinksManagerImpl implements LinkManager {
	
	private final Map<String, String> linkType2LinkLabel;
	private final Map<String, LinkTypeHandler> linkType2Linkhandler;
	
	private MDERichTextWidget widget;
	
	public LinksManagerImpl(MDERichTextWidget widget) {
		this.linkType2LinkLabel = new LinkedHashMap<>();
		this.linkType2Linkhandler = new LinkedHashMap<>();
		initializeDefaultLinks();
		this.widget = widget;
	}
	
	protected void initializeDefaultLinks(){
		addLinkType(Constants.URL, Constants.URL_LABEL, new HttpLinkHandler());
		addLinkType(Constants.FILE, Constants.FILE_LABEL, new FileLinkHandler());
		addLinkType(Constants.LOCAL, Constants.FILE_LOCAL_LABEL, new LocalLinkHandler());
		
		ModelElementHandler modelElementHandler = new ModelElementHandler();
		addLinkType(Constants.MODEL_ELEMENT, Constants.MODEL_ELEMENT_LABEL, modelElementHandler);
		addLinkType(Constants.DIAGRAM_ELEMENT, Constants.DIAGRAM_ELEMENT_LABEL, modelElementHandler);
	}

	@Override
	public List<String> getAllLinkTypes() {
		List<String> result = new ArrayList<>();
		result.addAll(this.linkType2LinkLabel.keySet());
		return result;
	}

	@Override
	public List<String> getAllLinkLabels() {
		List<String> result = new ArrayList<>();
		result.addAll(this.linkType2LinkLabel.values());
		return result;
	}

	@Override
	public void addLinkType(String type, String label, LinkTypeHandler handler) {
		this.linkType2LinkLabel.put(type, label);
		this.linkType2Linkhandler.put(type, handler);
	}

	@Override
	public String encode(String type, String url, String displayText) {
		LinkTypeHandler handler = getHandler(type);
		if (handler != null){
			return handler.encode(url, displayText);
		}
		return null;
	}

	protected LinkTypeHandler getHandler(String type) {
		String realType = resolveType(type);
		LinkTypeHandler handler = this.linkType2Linkhandler.get(realType);
		return handler;
	}

	@Override
	public String decode(String type, String link, String basePath) {
		LinkTypeHandler handler = getHandler(type);
		if (handler != null){
			return handler.decode(link, basePath);
		}
		return null;
	}

	@Override
	public void openLink(String link) {
		for(Entry<String, LinkTypeHandler> e: this.linkType2Linkhandler.entrySet()){
			String linkType = e.getKey();
			LinkTypeHandler handler = e.getValue();
			String resolvedType = handler.resolveType(link);
			if (resolvedType != null && resolvedType.equalsIgnoreCase(linkType)){
				if (widget != null){
					String basePath = MDERichTextHelper.getProjectPath(widget.getElement());
					if (handler instanceof ModelElementHandler){
						((ModelElementHandler)handler).openLink(widget.getElement(), link, basePath);
					} else {
						handler.openLink(link, basePath);
					}
					break;
				}
			}
		}
	}
	
	@Override
	public Tuple<String, String> getPath(String type, Object object) {
		return getURI(object, resolveType(type));
	}
	
	private Tuple<String, String> getURI(Object object, String type){
		LinkChooserStrategy chooseStrategy = ExtensionManager.getLinkChooserStrategy(type);
		if (chooseStrategy != null){
			return chooseStrategy.getURI(object);
		}
		return null;
	}
	
	private String resolveType(String label){
		
		if (this.linkType2Linkhandler.containsKey(label)){
			return label;
		}
		
		for (Entry<String, String> e : this.linkType2LinkLabel.entrySet()) {
			if (e.getValue().equalsIgnoreCase(label)){
				return e.getKey();
			}
		}
		return null;
	}

}
