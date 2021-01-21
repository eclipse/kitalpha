/*******************************************************************************
 * Copyright (c) 2015, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.diagram.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.business.api.helper.SiriusUtil;
import org.eclipse.sirius.viewpoint.description.DescriptionPackage;
import org.eclipse.sirius.viewpoint.description.SystemColor;

/**
 * @author Boubekeur Zendagui
 */
public final class SiriusSystemColorHelper {
 
	 public static SystemColor getSystemColorDescription(final String name) {
	        final String uri = SiriusUtil.VIEWPOINT_ENVIRONMENT_RESOURCE_URI + "#//@systemColors/@entries[name='" + name + "']";
	        final EObject color = EcoreUtil.create(DescriptionPackage.eINSTANCE.getSystemColor());
	        final URI colorURI = URI.createURI(uri);
	        ((InternalEObject) color).eSetProxyURI(colorURI);
	        return (SystemColor) color;
	    }
}
