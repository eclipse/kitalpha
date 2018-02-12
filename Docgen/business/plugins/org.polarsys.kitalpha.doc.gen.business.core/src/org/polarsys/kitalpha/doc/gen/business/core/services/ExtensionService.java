/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.doc.gen.business.core.services;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.polarsys.kitalpha.doc.gen.business.core.Activator;
import org.polarsys.kitalpha.doc.gen.business.core.helper.IConceptsHelper;


public class ExtensionService {

	public static final ExtensionService INSTANCE = new ExtensionService();

	private IConceptsHelper conceptsHelper;
	
	private ArrayList<IConceptsHelper> conceptsHelpersList;
	
	private static final String CONCEPT_HELPER_EXT_POINT_ID = "org.polarsys.kitalpha.doc.gen.business.core.conceptshelper";
	
	private static final String CONCEPT_HELPER_CONF_ELEMENT_NAME = "conceptsHelper";
	
	private static final String CONCEPT_HELPER_ATTRIBUTE_NAME = "helper";
	
	private ExtensionService() {
		// singleton
	}
	
	public IConceptsHelper getConceptsHelpersForObject(Object object) {
		IConfigurationElement[] config = Platform.getExtensionRegistry().getConfigurationElementsFor(CONCEPT_HELPER_EXT_POINT_ID);
		for (IConfigurationElement configurationElement : config) 
		{
			if (configurationElement.getName().equals(CONCEPT_HELPER_CONF_ELEMENT_NAME)) 
			{
				Object providerObject;
				try {
					providerObject = configurationElement.createExecutableExtension(CONCEPT_HELPER_ATTRIBUTE_NAME);
					if (providerObject instanceof IConceptsHelper) 
					{
						IConceptsHelper iConceptsHelper = (IConceptsHelper) providerObject;
						if (iConceptsHelper.accept(object))
							return iConceptsHelper;
					}
				} catch (CoreException e) {
					Activator.logWarning(e.getMessage());
				}
			}
		}
		return null;
	}
	
	public List<IConceptsHelper> getConceptsHelpersList() {
		if (conceptsHelpersList == null) 
		{
			conceptsHelpersList = new ArrayList<IConceptsHelper>();
			IConfigurationElement[] config = Platform.getExtensionRegistry().getConfigurationElementsFor(CONCEPT_HELPER_EXT_POINT_ID);
			for (IConfigurationElement configurationElement : config) 
			{
				if (configurationElement.getName().equals(CONCEPT_HELPER_CONF_ELEMENT_NAME)) 
				{
					Object providerObject;
					try {
						providerObject = configurationElement.createExecutableExtension(CONCEPT_HELPER_ATTRIBUTE_NAME);
						if (providerObject instanceof IConceptsHelper) 
						{
							conceptsHelpersList.add((IConceptsHelper) providerObject);
							//conceptsHelper = (IConceptsHelper) providerObject;
							//break;
						}
					} catch (CoreException e) {
						e.printStackTrace();
					}

				}
			}
		}
		
		return conceptsHelpersList;
	}

	@Deprecated
	public IConceptsHelper getConceptsHelper() {
		if (conceptsHelper == null) {
			IConfigurationElement[] config = Platform.getExtensionRegistry().getConfigurationElementsFor(CONCEPT_HELPER_EXT_POINT_ID);
			for (IConfigurationElement configurationElement : config) 
			{
				if (configurationElement.getName().equals(CONCEPT_HELPER_CONF_ELEMENT_NAME)) 
				{					
					Object providerObject;
					try {
						providerObject = configurationElement.createExecutableExtension(CONCEPT_HELPER_ATTRIBUTE_NAME);
						if (providerObject instanceof IConceptsHelper) 
						{
							conceptsHelper = (IConceptsHelper) providerObject;
							break;
						}
					} catch (CoreException e) {
						e.printStackTrace();
					}
				}
			}
		}
		return conceptsHelper;
	}
}
