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
package org.polarsys.kitalpha.richtext.widget.toolbar.handlers.links;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.polarsys.kitalpha.richtext.widget.toolbar.handlers.utils.Tuple;

/**
 * 
 * @author Faycal Abka
 *
 */
public class LinksManagerImpl implements LinkManager {
	
	private final Map<String, String> linkType2LinkLabel;
	private final Map<String, LinkTypeHandler> linkType2Linkhandler;
	
	public LinksManagerImpl() {
		this.linkType2LinkLabel = new LinkedHashMap<>();
		this.linkType2Linkhandler = new LinkedHashMap<>();
		initializeDefaultLinks();
	}
	
	protected void initializeDefaultLinks(){
		addLinkType(URL, URL_LABEL, new HttpLinkHandler());
		addLinkType(FILE, FILE_LABEL, new FileLinkHandler());
		addLinkType(LOCAL, LOCAL_LABEL, new LocalLinkHandler());
		addLinkType(MODEL_ELEMENT, MODEL_ELEMENT_LABEL, new ModelElementHandler());
		addLinkType(DIAGRAM_ELEMENT, DIAGRAM_ELEMENT_LABEL, new ModelDiagramLinkHandler());
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

	private LinkTypeHandler getHandler(String type) {
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
				handler.openLink(link);
				break;
			}
		}
	}
	
	@Override
	public Tuple<String, String> getPath(String type, Object object) {
		LinkTypeHandler handler = getHandler(type);
		if (handler != null){
			return handler.getPath(object);
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
