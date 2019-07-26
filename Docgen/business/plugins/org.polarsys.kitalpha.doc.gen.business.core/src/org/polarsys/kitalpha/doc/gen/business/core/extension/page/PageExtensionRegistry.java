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
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.Platform;
import org.eclipse.egf.model.pattern.BundleAccessor;
import org.eclipse.egf.model.pattern.Pattern;
import org.eclipse.egf.model.pattern.PatternContext;
import org.eclipse.egf.model.pattern.PatternException;
import org.eclipse.egf.model.pattern.PatternParameter;
import org.eclipse.egf.pattern.engine.PatternEngine;
import org.eclipse.egf.pattern.execution.ExecutionContext;
import org.eclipse.egf.pattern.extension.ExtensionHelper;
import org.eclipse.egf.pattern.extension.ExtensionHelper.MissingExtensionException;
import org.eclipse.egf.pattern.extension.PatternExtension;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.osgi.framework.Bundle;
import org.polarsys.kitalpha.doc.gen.business.core.Activator;
import org.polarsys.kitalpha.doc.gen.business.core.extension.page.PageExtensionElement.PageExtensionActivationStatus;
import org.polarsys.kitalpha.doc.gen.business.core.util.IDiagramHelper;
import org.polarsys.kitalpha.doc.gen.business.core.util.IFileNameService;

public class PageExtensionRegistry {
	private ResourceSet egfResourceSet = new ResourceSetImpl();
	/** List of all extensions available in the platform.  **/
	private Collection<PageExtensionElement> extensions;
	
	/** Singleton. **/
	private static PageExtensionRegistry instance; 
	
	/** <p>Hidden constructor. </p> **/
	private PageExtensionRegistry() {
		PageExtensionManager pageExtesionManager = new PageExtensionManager();
		extensions = pageExtesionManager.loadExtensions();
	}
	
	/**
	 * @return the singleton instance of {@link PageExtensionRegistry}
	 */
	public static PageExtensionRegistry getInstance() {
		if (instance == null) {
			instance = new PageExtensionRegistry();
		}
		return instance;
	}
	
	/**
	 * Register a new extension
	 * @param ext The {@link PageExtensionElement} to register
	 */
	public void addExtension(PageExtensionElement ext){
		extensions.add(ext);
	}
	
	/**
	 * @return list of domains. It is computed by inspecting the available pageExtensions
	 */
	public Collection<String> getDomains(){
		List<String> result = new ArrayList<String>();
		for (PageExtensionElement ext : extensions) {
			String domain = ext.getDomain();
			if (! result.contains(domain)) {
				result.add(domain);
			}
		}
		return result;
	}
	
	/**
	 * @param domain A {@link String} value containing the name of the domain
	 * @param status The status of the extensions to collect. See {@link PageExtensionActivationStatus}. 
	 * For more information on activation status.
	 * If the status is <code>null</code> it is ignored
	 * @return All available extensions of that domain given their activation status
	 */
	public Collection<PageExtensionElement> getExtensions(String domain, PageExtensionActivationStatus status) {
		Collection<PageExtensionElement> result = new ArrayList<PageExtensionElement>();
		for (PageExtensionElement ext : extensions) {
			if (ext.getDomain().equalsIgnoreCase(domain) && (status == null ||ext.getCurrentActivactionStatus().equals(status))) {
				result.add(ext);
			}
		}
		return result;
	}

	/**
	 * @param domain a {@link String} value containing the name of the domain
	 * @return all Active extensions of that domain
	 */
	public Collection<PageExtensionElement>  getActiveExtensions(String domain) {
		return getExtensions(domain, PageExtensionActivationStatus.Active);
	}
	
	/**
	 * @param domain a {@link String} value containing the name of the domain
	 * @return all available extensions of that domain
	 */
	public Collection<PageExtensionElement>  getExtensions(String domain) {
		return getExtensions(domain, null);
	}
	
	/**
	 * @param domain a {@link String} value containing the name of the domain
	 * @return all available extensions of that domain
	 */
	public Collection<PageExtensionElement>  getCategoryExtensions(String domain, String category) {
		Collection<PageExtensionElement> result = new ArrayList<PageExtensionElement>();
		Collection<PageExtensionElement> catExtensions = getExtensions(domain, null);
		for (PageExtensionElement pee : catExtensions) {
			if (pee.getCategory().equalsIgnoreCase(category)) {
				result.add(pee);
			}
		}
		return result;
	}
	
	/**
	 * @param domain a {@link String} value containing the name of the domain
	 * @return All available {@link IDiagramHelper} for this domain extension
	 */
	public Collection<IDiagramHelper> getDiagramHelpersExtensions(String domain) {
		return getActiveExtensions(domain).stream().map(PageExtensionElement::getDiagramHelper).filter(diagramHelper -> diagramHelper != null).collect(Collectors.toSet());
	}
	
	/**
	 * @param domain a {@link String} value containing the name of the domain
	 * @return All available {@link IFileNameService} for this domain extension
	 */
	public Collection<IFileNameService> getFileNameServicesExtensions(String domain) {
		return getActiveExtensions(domain).stream().map(PageExtensionElement::getFileNameService).filter(fileNS -> fileNS != null).collect(Collectors.toSet());
	}

	/**
	 * @param domain a {@link String} value containing the name of the domain 
	 * @return list of categories of a given domains. It is computed by inspecting the available pageExtensions.
	 */
	public Collection<String> getCategories(String domain){
		return getCategories(domain, null);
	}
	
	/**
	 * @param domain a {@link String} value containing the name of the domain
	 * @param status The status of the extensions to collect. See {@link PageExtensionActivationStatus}. 
	 * For more information on activation status.
	 * If the status is <code>null</code> it is ignored
	 * @return all categories defined in the available extensions of that domain
	 */
	public Collection<String> getCategories(String domain, PageExtensionActivationStatus status){
		List<String> result = new ArrayList<String>();
		Collection<PageExtensionElement> etxs = getExtensions(domain, status);
		for (PageExtensionElement ext : etxs) {
			String category = ext.getCategory();
			if (! result.contains(category)) {
				result.add(category);
			}
		}
		return result;
	}
	
	/**
	 * @param domain a {@link String} value containing the name of the domain
	 * @param category a {@link String} value containing the name of the category
	 * @param status The new status of all extensions of the category. See {@link PageExtensionActivationStatus}. 
	 * For more information on activation status.
	 * If the status is <code>null</code> it is ignored
	 */
	public void setCategoryActivationStatus(String domain, String category, PageExtensionActivationStatus status){
		Collection<PageExtensionElement> etxs = getCategoryExtensions(domain, category);
		for (PageExtensionElement ext : etxs) {
			ext.setCurrentActivactionStatus(status);
		}
	}
	
	/**
	 * @param domain a {@link String} value containing the name of the domain
	 * @param category a {@link String} value containing the name of the category
	 * @return The {@link PageExtensionActivationStatus} of the category depending on the status of its extensions 
	 * <p>
	 * The status of the category is
	 * <ul>
	 * <li> {@link PageExtensionActivationStatus#Active}: if all extensions status is {@link PageExtensionActivationStatus#Active}</li>
	 * <li> {@link PageExtensionActivationStatus#Inactive}: if all extensions status is {@link PageExtensionActivationStatus#Inactive}</li>
	 * <li> {@link PageExtensionActivationStatus#Unknown}: if there are at least two extensions with different status or if the status of at least one 
	 * 														extension is {@link PageExtensionActivationStatus#Unknown} </li>
	 * </ul>
	 * </p>
	 */
	public PageExtensionActivationStatus getCategoryActivationStatus(String domain, String category){
		Collection<PageExtensionElement> exts = getCategoryExtensions(domain, category);
		boolean isActive = false;
		boolean isInactive = false;
		for (PageExtensionElement ext : exts) {
			switch (ext.getCurrentActivactionStatus()) {
			case Active:
				if (isInactive) {
					return PageExtensionActivationStatus.Unknown;
				}
				isActive = true;
				break;
			case Inactive:
				if (isActive) {
					return PageExtensionActivationStatus.Unknown;
				}
				isInactive = true;
				break;
			case Unknown:
				return PageExtensionActivationStatus.Unknown;
			}
		}
		
		// If we are here, this means that there are no extensions with different status and there are no extension with Unknown status.
		// So we return the status of the first extension because all extensions status are equals.
		return exts.isEmpty() ? PageExtensionActivationStatus.Unknown : ((List<PageExtensionElement>)exts).get(0).getCurrentActivactionStatus();
	}
	
	/**
	 * Used to check if there is at least one pattern provided by the pageExtension extension point that 
	 * can be run on the model element
	 * @param model a model element
	 * @param domain a String that contain the name of the domain
	 * @return True if at least one pattern is found
	 */
	public boolean isPageCandidate(EObject model, String domain){
		Collection<PageExtensionElement> etxs = this.getActiveExtensions(domain);
		for (PageExtensionElement ext : etxs) {
			List<URI> patternURI = ext.getPageURI();
			for (URI uri : patternURI) {
				EObject eObject = egfResourceSet.getEObject(uri, true);
				if (eObject != null && eObject instanceof Pattern) {
					Pattern pattern = (Pattern) eObject;
					EList<PatternParameter> parameters = pattern.getParameters();
					if (parameters != null && ! parameters.isEmpty()){
						PatternParameter firstParameter = parameters.get(0);
						/** The URI of the EClass of the parameter. */
						try {
							if ( checkPatternParameter(model, firstParameter) && checkPatternPrecondition(model, pattern)) {
								return true;
							}
						} catch (MissingExtensionException | PatternException e) {
							Activator.logError(e.getMessage(), e);
						}
					}
				}
			}
		}
		return false;
	}

	/**
	 * Checking if the model element is compliant with the pattern parameter type
	 * @param model the model element
	 * @param parameter the {@link PatternParameter}
	 */
	private boolean checkPatternParameter(EObject model, PatternParameter parameter) {
		String parameterType = parameter.getType();
		String modelURI = EcoreUtil.getURI(((EObject) model).eClass()).toString();
		if (parameterType.equalsIgnoreCase(modelURI)) {
			return true;
		} else {
			EList<EClass> superTypes = model.eClass().getEAllSuperTypes();
			for (EClass eClass : superTypes) {
				String eclassURI = EcoreUtil.getURI(eClass).toString();
				if (parameterType.equalsIgnoreCase(eclassURI)) {
					return true;
				}
			}
		}
		return false;
	}
	
	/**
	 * Checking the pattern precondition
	 * @param model a model element the pattern will be executed on or not
	 * @param pattern the {@link Pattern} we need to check the precondition
	 * @return True if the pattern can be executed on the model element, False otherwise
	 * @throws MissingExtensionException
	 * @throws PatternException
	 */
	private boolean checkPatternPrecondition(EObject model, Pattern pattern) throws MissingExtensionException, PatternException{
		Map<PatternParameter, Object> parameters = new HashMap<PatternParameter, Object>();
		parameters.put(pattern.getAllParameters().get(0), model);
		PatternExtension extension = ExtensionHelper.getExtension(pattern.getNature());
		PatternEngine engine = extension.createEngine(pattern);
		return engine.checkCondition(createPatternContext(pattern), parameters);
	}
	
	/**
	 * Create a pattern context in order to check the precondition of a pattern. 
	 * This check need only the bundle containing the pattern.
	 * @param pattern the {@link Pattern} we need to check the precondition
	 * @return a {@link PatternContext} created for the pattern
	 */
	protected PatternContext createPatternContext(Pattern pattern) {
		return new ExecutionContext(new BundleAccessor() {
			public Bundle getBundle(String id) throws PatternException {
				URI uri = EcoreUtil.getURI(pattern);
				String pluginID = uri.segment(1);
				return Platform.getBundle(pluginID);
			}
		});
	}
}
