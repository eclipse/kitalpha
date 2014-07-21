/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.handlers;

import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Metamodel;

/**
 * @author Thomas Guiu
 * 
 */
public interface IMetamodelHandler extends IElementHandler {
	void removeMetamodels(List<EPackage> packages);

	void addMetamodels(List<EPackage> packages);

	Metamodel getMetamodel();

}
