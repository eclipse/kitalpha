/*******************************************************************************
 * Copyright (c) 2017 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.richtext.mde.tools.links.protocole.handlers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.polarsys.kitalpha.richtext.mde.tools.managers.LinkChooserStrategy;
import org.polarsys.kitalpha.richtext.mde.tools.managers.Tuple;
import org.polarsys.kitalpha.richtext.mde.tools.utils.MDERichTextToolsHelper;

public abstract class AbstractChooseLinkElement implements LinkChooserStrategy {
	
	protected Tuple<String, String> customizeLink(String link, Object object) {
		String result = null;
		String label = null;
		if (object instanceof EObject) {
			EObject eObject = (EObject)object;
			label = MDERichTextToolsHelper.getName(eObject);
			Resource eResource = eObject.eResource();
			if (eResource instanceof XMLResource){
				result = ((XMLResource) eResource).getID(eObject);
			}
			if (result == null){
				result = EcoreUtil.getURI(eObject).fragment();
				if (result != null){
					return new Tuple<String, String>(result, label);
				}
			}
		}
		if (result == null){
			result = link;
		}
		return new Tuple<String, String>(result, label);
	}
	
}
