/*******************************************************************************
 * Copyright (c) 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation
 *******************************************************************************/
package org.polarsys.kitalpha.ad.services.detachment.core.registeries;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.polarsys.kitalpha.ad.services.detachment.core.Messages;
import org.polarsys.kitalpha.ad.services.detachment.core.log.LoggerService;
import org.polarsys.kitalpha.ad.services.detachment.core.registeries.interfaces.AbstractDetachmentWizard;
import org.polarsys.kitalpha.ad.services.detachment.core.registeries.interfaces.IDetachmentInterpreter;


/**
 * @author Faycal Abka
 */
public class DetachmentExtensionRegistry {
	
	private Map<String, AbstractDetachmentWizard> detachmentWizardsExtension;
	private Map<String, IDetachmentInterpreter> detachmentInterpreters;
	
	
	public DetachmentExtensionRegistry() {
		this.detachmentWizardsExtension = new HashMap<String, AbstractDetachmentWizard>();
		this.detachmentInterpreters = new HashMap<String, IDetachmentInterpreter>();
	}
	
	private static final DetachmentExtensionRegistry INSTANCE = new DetachmentExtensionRegistry();
	
	public static DetachmentExtensionRegistry getInstance(){
		return INSTANCE;
	}
	
	
	public void initRegistry(){
		
		dispose();
		
		IExtension extensions[] = RegistryHelper.getAllExtensionsFor(DetachmentRegistriesConst.DETACHMENT_EXTENSION_POINT);
		
		try {
			for (IExtension iExtension : extensions) {

				for(IConfigurationElement config: iExtension.getConfigurationElements()){

					if (config.getName().equals(DetachmentRegistriesConst.DETACHMENT_EXTENSION_CONTRIBUTION))
					{
						try {

							final String id = config.getAttribute(DetachmentRegistriesConst.DETACHMENT_EXTENSION_CONTRIBUTION_ID);
							final Object wizard = config.createExecutableExtension(DetachmentRegistriesConst.DETACHMENT_EXTENSION_WIZARD);
							final Object interpreter = config.createExecutableExtension(DetachmentRegistriesConst.DETACHMENT_EXTENSION_INTERPRETER);
							final String pageNumber = config.getAttribute(DetachmentRegistriesConst.DETACHMENT_EXTENSION_WIZARDPAGENUMBER);

							if (!getDetachmentWizardsExtension().containsKey(id)){
								if (wizard instanceof AbstractDetachmentWizard &&
										interpreter instanceof IDetachmentInterpreter){
									AbstractDetachmentWizard theWizard = (AbstractDetachmentWizard) wizard;

									theWizard.setWizardPageNumber(new Integer(pageNumber));
									getDetachmentWizardsExtension().put(id, theWizard);
									getDetachmentInterpreters().put(id, (IDetachmentInterpreter) interpreter);
								}
							} else {
								LoggerService.warning(Messages.bind(Messages.SEVERAL_ID_EXTENSION, id), null);
							}

						} catch (CoreException e) {
							LoggerService.error(e.getMessage(), e);
							e.printStackTrace();
						}
					}
				}
			}
		} catch (NullPointerException e){
			//TODO log the error
		}
		
	}
	
	
	
	
	public Map<String, AbstractDetachmentWizard> getDetachmentWizardsExtension() {
		return detachmentWizardsExtension;
	}


	public Map<String, IDetachmentInterpreter> getDetachmentInterpreters() {
		return detachmentInterpreters;
	}


	public void dispose(){
		getDetachmentWizardsExtension().clear();
		getDetachmentInterpreters().clear();
	}
	

}
