/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.desc.helper;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

/**
 * @author Boubekeur Zendagui
 */

public class EMDEElementProvider {
	
	public static final String EMDE_EXTENSION_RESOURCE = "platform:/plugin/org.polarsys.kitalpha.emde/model/eMDE.ecore";
	
	public static EMDEElementProvider INSTANCE = new EMDEElementProvider();
	
	private EClass elementExtension;
	
	private EClass extensibleElement;
	
	private EMDEElementProvider() {
		super();
		ResourceSet rSet = new ResourceSetImpl();
		URI eMDEUri = URI.createURI(EMDE_EXTENSION_RESOURCE);
		Resource eMDEResource =  rSet.getResource(eMDEUri, true);
		EPackage pgk = (EPackage)eMDEResource.getContents().get(0);
		elementExtension = (EClass)pgk.getEClassifier("ElementExtension");
		extensibleElement = (EClass)pgk.getEClassifier("ExtensibleElement");
	}
	
	public EClass getElementExtension(){
		return elementExtension;
	}
	
	public EClass getExtensibleElement(){
		return extensibleElement;
	}

}
