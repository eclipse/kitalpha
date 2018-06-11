/*******************************************************************************
 * Copyright (c) 2006, 2018 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.doc.gen.business.core.task;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.egf.core.producer.InvocationException;
import org.eclipse.egf.ftask.producer.context.ITaskProductionContext;
import org.eclipse.egf.ftask.producer.invocation.ITaskProduction;
import org.polarsys.kitalpha.doc.gen.business.core.branding.DocumentationBrandingData;


/**
 * @author Boubekeur Zendagui
 */
public class InitializeDocGenBrandingData implements ITaskProduction {
	
	private static final String COPYRIGHT_CONTRACT = "copyright";
	private static final String LOGO_PATH_CONTRACT = "logo.path";
	private static final String LOGO_ALT_CONTRACT = "logo.alt";
	
	private static final String COPYRIGHT_KEY = "copyright";
	private static final String LOGO_PATH_KEY  = "logoPath";
	private static final String LOGO_ALT_KEY  = "logoAlt";
	
	@Override
	public void doExecute(ITaskProductionContext productionContext, IProgressMonitor monitor) throws InvocationException {
		String copyright = getCopyright(productionContext);
		String logoPath = getLogoPath(productionContext);
		String logoAlt = getLogoAlt(productionContext);
		DocumentationBrandingData documentationBrandingData = DocumentationBrandingData.getInstance();
		// Remove branding data initialized by previous generation 
		documentationBrandingData.removeAllData();
		
		// Initialize Branding data for the current generation
		if (copyright != null) {
			documentationBrandingData.addData(COPYRIGHT_KEY, copyright);
		}
		
		if (logoPath != null && ! logoPath.isEmpty()) {
			documentationBrandingData.addData(LOGO_PATH_KEY, logoPath);
		}
		
		if (logoAlt != null && ! logoAlt.isEmpty()) {
			documentationBrandingData.addData(LOGO_ALT_KEY, logoAlt);
		}
	}

	protected String getLogoAlt(ITaskProductionContext productionContext) throws InvocationException {
		return productionContext.getInputValue(LOGO_ALT_CONTRACT, String.class);
	}

	protected String getLogoPath(ITaskProductionContext productionContext) throws InvocationException {
		return productionContext.getInputValue(LOGO_PATH_CONTRACT, String.class);
	}

	protected String getCopyright(ITaskProductionContext productionContext) throws InvocationException {
		return productionContext.getInputValue(COPYRIGHT_CONTRACT, String.class);
	}

	@Override
	public void preExecute(ITaskProductionContext productionContext, IProgressMonitor monitor) throws InvocationException {
		// No need fot this step
	}
	
	@Override
	public void postExecute(ITaskProductionContext productionContext, IProgressMonitor monitor) throws InvocationException {
		// No need fot this step
	}

}
