/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.doc.gen.business.core.task;

import java.util.Collection;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.egf.ftask.producer.invocation.ITaskProduction;
import org.eclipse.egf.model.pattern.Pattern;
import org.eclipse.egf.model.pattern.PatternFactory;
import org.eclipse.egf.model.pattern.TypePatternList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.polarsys.kitalpha.doc.gen.business.core.extension.page.PageExtensionElement;
import org.polarsys.kitalpha.doc.gen.business.core.extension.page.PageExtensionRegistry;

/**
 * @author Boubekeur Zendagui
 */
public class PaternPageExtensionsTask implements ITaskProduction {

	private ResourceSet egfResourceSet = new ResourceSetImpl();
	private static final String CONTRACT_PATTERN_PAGE_EXTENSIONS = "pattern.page.extensions";
	private static final String CONTRACT_PATTERN_SIDEBAR_EXTENSIONS = "pattern.sidebar.extensions";
	private static final String CONTRACT_PATTERN_DOMAIN = "domain";

	@Override
	public void doExecute(ITaskProductionContext productionContext, IProgressMonitor monitor) throws InvocationException {
		String domain = productionContext.getInputValue(CONTRACT_PATTERN_DOMAIN, String.class);
		TypePatternList pagePatterns = PatternFactory.eINSTANCE.createTypePatternList();
		TypePatternList sidebarPatterns = PatternFactory.eINSTANCE.createTypePatternList();
		if (domain != null && !domain.isEmpty()) {
			Collection<PageExtensionElement> activeExtensions = PageExtensionRegistry.getInstance().getActiveExtensions(domain);
			if (! activeExtensions.isEmpty()) {
				for (PageExtensionElement ext : activeExtensions) {
					// Manage page patterns
					for (URI uri : ext.getPageURI()) {
						EObject eObject = egfResourceSet.getEObject(uri, true);
						if (eObject != null && eObject instanceof Pattern) {
							pagePatterns.getElements().add((Pattern)eObject);
						}
					}
					
					for (URI uri : ext.getSidebarURI()) {
						EObject eObject = egfResourceSet.getEObject(uri, true);
						if (eObject != null && eObject instanceof Pattern) {
							sidebarPatterns.getElements().add((Pattern)eObject);
						}
					}
					
				}
			}
		}
		productionContext.setOutputValue(CONTRACT_PATTERN_PAGE_EXTENSIONS, pagePatterns);
		productionContext.setOutputValue(CONTRACT_PATTERN_SIDEBAR_EXTENSIONS, sidebarPatterns);
	}
	
	
	@Override
	public void preExecute(ITaskProductionContext productionContext, IProgressMonitor monitor) throws InvocationException {
		// No need for this method
	}

	@Override
	public void postExecute(ITaskProductionContext productionContext, IProgressMonitor monitor) throws InvocationException {
		// No need for this method
	}

}
