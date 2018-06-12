/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.templates.ContextTypeRegistry;
import org.eclipse.jface.text.templates.persistence.TemplatePersistenceData;
import org.eclipse.jface.text.templates.persistence.TemplateReaderWriter;
import org.eclipse.jface.text.templates.persistence.TemplateStore;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.Constants;
import org.osgi.framework.Bundle;

import com.google.inject.Inject;
import com.google.inject.name.Named;

/**
 * 
 * @author Amine Lajmi
 * 		   Faycal ABKA
 *
 */
public class CommonTemplateStore extends TemplateStore {
	
	private static final String TEMPLATEPROVIDER_EXTENSIONPOINT = "org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.common.ui.templateprovider"; //$NON-NLS-1$
	
	private static final String TEMPLATEPROVIDER_CONFIGELEMENT = "TemplateProvider"; //$NON-NLS-1$

	private final URL resourceTemplate;
	
	protected final Plugin plugin;
	
	protected static final Logger log = Logger.getLogger(CommonTemplateStore.class);

	@Inject
	public CommonTemplateStore(ContextTypeRegistry registry, IPreferenceStore store, @Named(Constants.LANGUAGE_NAME) String key,	AbstractUIPlugin plugin) {
		super(registry, store, key + ".templates"); //$NON-NLS-1$
		this.plugin = plugin;			
		resourceTemplate = getTemplateFileURL();
		try {
			load();
		} catch (IOException e) {
			log.error(e.getMessage(), e);
		}
	}
	
	public Plugin getPlugin() {
		return plugin;
	}
	
	protected URL getTemplateFileURL() {		
		Map<Bundle, String> templateStores = lookupTemplateStores();
		if (templateStores.size() >1){
			log.info("Multiple template stores are declared, loading default templates instead");
			return plugin.getBundle().getEntry("templates/templates.xml");
		}
		for (Bundle provider: templateStores.keySet()){
			return provider.getEntry(templateStores.get(provider));
		}
		return null;
	}

	@Override
	protected void loadContributedTemplates() throws IOException {
		if (resourceTemplate==null){
			return;
		}
		TemplateReaderWriter reader = new TemplateReaderWriter();
		InputStream openStream = null;
		try {
			openStream = resourceTemplate.openStream();
			try {
				TemplatePersistenceData[] read = reader.read(openStream, null);
				for (TemplatePersistenceData templatePersistenceData : read) {
					internalAdd(templatePersistenceData);
				}
			} finally {
				openStream.close();
			}
		} catch (IOException e) {
			log.error(e);
		}
	}
	
	public Map<Bundle, String> lookupTemplateStores() {
		Map<Bundle, String>  templateStores = new HashMap<>();
		IConfigurationElement[] config = Platform.getExtensionRegistry().getConfigurationElementsFor(TEMPLATEPROVIDER_EXTENSIONPOINT);
		if (config.length != 0) {
			for (IConfigurationElement iConfigElement : config){
				if (iConfigElement.getName().equalsIgnoreCase(TEMPLATEPROVIDER_CONFIGELEMENT)) {
					//Get the contributing bundle
					Bundle bundle = Platform.getBundle(iConfigElement.getContributor().getName());
					//Map the contributing bundle to template file path
					templateStores.put(bundle, iConfigElement.getAttribute("file")); //$NON-NLS-1$
				}
			}
		}
		return templateStores;
	}
	
	@Override
	protected void handleException(IOException x) {
		log.error(x.getMessage(), x);
	}
}
