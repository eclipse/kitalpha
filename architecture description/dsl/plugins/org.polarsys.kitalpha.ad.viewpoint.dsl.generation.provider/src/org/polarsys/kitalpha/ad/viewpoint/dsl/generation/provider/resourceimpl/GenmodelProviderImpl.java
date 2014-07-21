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

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.provider.resourceimpl;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.provider.exception.ViewpointResourceException;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.provider.resource.AbstractCoreResourceProvider;

/**
 * @author Boubekeur Zendagui
 */

public class GenmodelProviderImpl extends AbstractCoreResourceProvider{
	
	/**
	 * @return the generated GenModel
	 * @throws ViewpointResourceException
	 */
	public GenModel getGenModel() throws ViewpointResourceException{
		GenModel genModel = null;
		
		EObject rootElement = getRootElement();
		if (rootElement != null)
			genModel = (GenModel) rootElement;
		
		return genModel;
	}
	
	public GenPackage getGenPackage() throws ViewpointResourceException{
		GenPackage genPackage = null;
		
		GenModel genModel = getGenModel();
		if (genModel != null)
			genPackage = genModel.getGenPackages().get(0);
		
		return genPackage;
	}
	
	public String getEditPluginName() throws ViewpointResourceException{
		GenModel genModel = getGenModel();
		String result = null ;
		if (genModel != null )
			result = genModel.getEditPluginID();
		return result;
	}
	
	
	@Override
	protected void loadResourceFromFile() {
		super.loadResourceFromFile();
		reloadGenModel();
	}
	
	
	@Override
	public void refresh() {
		reloadGenModel();
		super.refresh();
	}
	
	private void reloadGenModel(){
		try {
			GenModel genModel = getGenModel();
			genModel.reconcile();
            genModel.setCanGenerate(true);
            genModel.setValidateModel(true);
            genModel.diagnose();
            genModel.validate();
		} catch (ViewpointResourceException e) {
			e.printStackTrace();
		}
	}

}
