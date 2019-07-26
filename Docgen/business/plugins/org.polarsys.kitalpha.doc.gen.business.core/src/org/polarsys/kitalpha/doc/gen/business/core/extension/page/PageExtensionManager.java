/*******************************************************************************
 * Copyright (c) 2014, 2019 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.doc.gen.business.core.extension.page;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.polarsys.kitalpha.doc.gen.business.core.extension.page.PageExtensionElement.PageExtensionActivationStatus;
import org.polarsys.kitalpha.doc.gen.business.core.extension.page.helpers.NamingOptionalityPreferencesHelper;
import org.polarsys.kitalpha.doc.gen.business.core.util.IDiagramHelper;
import org.polarsys.kitalpha.doc.gen.business.core.util.IFileNameService;

/**
 * @author Boubekeur Zendagui
 */
public class PageExtensionManager {
	
	private static final String DOCGEN_CONTENT_EXTENSION = "org.polarsys.kitalpha.doc.gen.business.core.contentExtension";
	private static final String DOCGEN_PAGE_EXTENSION_ELEMENT = "pageExtension";
	private static final String DOCGEN_PAGE_EXTENSION_ELEMENT__NAME = "name";
	private static final String DOCGEN_PAGE_EXTENSION_ELEMENT__DESCRIPTION = "description";
	private static final String DOCGEN_PAGE_EXTENSION_ELEMENT__DOMAIN = "domain";
	private static final String DOCGEN_PAGE_EXTENSION_ELEMENT__CATEGORY = "category";
	private static final String DOCGEN_PAGE_EXTENSION_ELEMENT__DIAGRAMHELPER = "diagramHelper";
	private static final String DOCGEN_PAGE_EXTENSION_ELEMENT__FILENAMESERVICE = "fileNameService";
	private static final String DOCGEN_PAGE_EXTENSION_ELEMENT__DEFAULT_STATUS = "defaultStatus";
	
	private static final String DOCGEN_PAGE_EXTENSION_PATTERN_URI = "URI";
	private static final String DOCGEN_PAGE_EXTENSION_PATTERN_PAGE = "pagePattern";
	private static final String DOCGEN_PAGE_EXTENSION_PATTERN_SIDEBAR = "sidebarPattern";
	
	/**
	 * Load available contributions
	 * @return a collection of {@link PageExtensionElement}. 
	 */
	public Collection<PageExtensionElement> loadExtensions(){
		Collection<PageExtensionElement> result = new LinkedHashSet<PageExtensionElement>();
		IConfigurationElement[] config = Platform.getExtensionRegistry().getConfigurationElementsFor(DOCGEN_CONTENT_EXTENSION);
		if (config.length > 0){
			for (IConfigurationElement elt : config) {
				if (elt.getName().equalsIgnoreCase(DOCGEN_PAGE_EXTENSION_ELEMENT)){
					PageExtensionElement pageExtensionElement = createPageExtensionElement(elt);
					updateActivationStatusFromUserPreferences(pageExtensionElement);
					// Manage page patterns URIs
					pageExtensionElement.getPageURI().addAll(collectPatterns(elt, DOCGEN_PAGE_EXTENSION_PATTERN_PAGE));
					// Manage side bar patterns URIs
					pageExtensionElement.getSidebarURI().addAll(collectPatterns(elt, DOCGEN_PAGE_EXTENSION_PATTERN_SIDEBAR));
					result.add(pageExtensionElement);
				}
			}
		}
		return result;
	}
	
	/**
	 * Update activation status of the extesion according to user preference
	 * @param pageExtensionElement
	 */
	private void updateActivationStatusFromUserPreferences(PageExtensionElement pageExtensionElement) {
		
		String name = NamingOptionalityPreferencesHelper.getKeyOfPageExtensionElement(pageExtensionElement);
		String customizedBooleanValue = NamingOptionalityPreferencesHelper.getCustomizedStringValue(name);
		
		if (!customizedBooleanValue.isEmpty()) {
			pageExtensionElement.setCurrentActivactionStatus(PageExtensionActivationStatus.getStatus(customizedBooleanValue));			
		}
	}

	/**
	 * Collect pattern URI from configuration element
	 * @param element a {@link IConfigurationElement}
	 * @param pageExtensionElement a {@link String} containing the name of the child configuration Element
	 */
	private List<URI> collectPatterns(IConfigurationElement element, String childName) {
		List<URI> patternURIs = new ArrayList<URI>();
		for (IConfigurationElement child : element.getChildren(childName)) {
			String fcorePath = child.getAttribute(DOCGEN_PAGE_EXTENSION_PATTERN_URI);
			URI uri = URI.createURI(fcorePath);
			patternURIs.add(uri);
		}
		return patternURIs;
	}
	
	/**
	 * Initialize a {@link PageExtensionElement} from the extension point
	 * @param element {@link IConfigurationElement}
	 * @return a {@link PageExtensionElement} without pattern URIs
	 */
	public PageExtensionElement createPageExtensionElement(IConfigurationElement element){
		PageExtensionElement peElement = new PageExtensionElement();
		peElement.setName(element.getAttribute(DOCGEN_PAGE_EXTENSION_ELEMENT__NAME));
		peElement.setDescription(element.getAttribute(DOCGEN_PAGE_EXTENSION_ELEMENT__DESCRIPTION));
		peElement.setDomain(element.getAttribute(DOCGEN_PAGE_EXTENSION_ELEMENT__DOMAIN));
		peElement.setCategory(element.getAttribute(DOCGEN_PAGE_EXTENSION_ELEMENT__CATEGORY));
		peElement.setDescription(element.getAttribute(DOCGEN_PAGE_EXTENSION_ELEMENT__DESCRIPTION));
		String deaultActivationStatus = element.getAttribute(DOCGEN_PAGE_EXTENSION_ELEMENT__DEFAULT_STATUS);
		peElement.setDefaultActivationStatus(PageExtensionActivationStatus.getStatus(deaultActivationStatus));
		try {
			Object helper = element.createExecutableExtension(DOCGEN_PAGE_EXTENSION_ELEMENT__DIAGRAMHELPER);
			if (helper instanceof IDiagramHelper) {
				peElement.setDiagramHelper((IDiagramHelper) helper);
			}
		} catch (CoreException e) {
			peElement.setDiagramHelper(null);
		}
		try {
			Object fileNS = element.createExecutableExtension(DOCGEN_PAGE_EXTENSION_ELEMENT__FILENAMESERVICE);
			if (fileNS instanceof IFileNameService) {
				peElement.setFileNameService((IFileNameService) fileNS);
			}
		} catch (CoreException e) {
			peElement.setFileNameService(null);
		}
		return peElement;
	}
}
