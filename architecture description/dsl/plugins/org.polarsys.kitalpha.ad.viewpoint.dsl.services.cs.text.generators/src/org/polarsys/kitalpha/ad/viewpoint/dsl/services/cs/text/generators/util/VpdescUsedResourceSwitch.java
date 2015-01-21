
/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.generators.util;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractResource;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.EMFResource;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.FileSystemResource;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.util.VpdescSwitch;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint;

/**
 * 
 * @author Faycal Abka
 *
 */

public class VpdescUsedResourceSwitch extends VpdescSwitch<AbstractResource> {
	
	private final static String DIAGRAM_EXTENSION = "odesign";
	
	
	private Viewpoint target;
	
	public VpdescUsedResourceSwitch(Viewpoint target){
		this.target = target;
	}
	
	public AbstractResource caseEMFResource(EMFResource er){
		
		String uri = er.getUri();
		String decoratedURI = decorateStringWithQuotation(uri);

		if (checkExtensionService(uri, DIAGRAM_EXTENSION)){
			if (!target.getUseDiagramResource().contains(decoratedURI))
				target.getUseDiagramResource().add(decoratedURI);
		} else {
			if (!target.getUseAnyEMFResource().contains(decoratedURI))
				target.getUseAnyEMFResource().add(decoratedURI);
		}

		return er;
	}
	
	public AbstractResource caseFilesystemResource(FileSystemResource fsr){
		target.getUseAnyEMFResource().add(decorateStringWithQuotation(fsr.getPath()));
		return fsr;
	}
	
	private boolean checkExtensionService(String s, String extension){
		extension = "." + extension;
		
		if (s.endsWith(extension))
			return true;
		
		return false;
	}
	
	private String decorateStringWithQuotation(String s){
		return "\"" + s + "\"";
	}
}
