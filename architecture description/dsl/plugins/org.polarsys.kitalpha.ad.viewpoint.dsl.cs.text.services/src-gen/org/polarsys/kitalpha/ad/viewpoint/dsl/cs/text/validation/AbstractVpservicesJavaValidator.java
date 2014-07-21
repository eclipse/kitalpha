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
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.validation.CommonJavaValidator;

public class AbstractVpservicesJavaValidator extends CommonJavaValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.services.ServicesPackage.eINSTANCE);
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.polarsys.org/kitalpha/ad/viewpoint/dsl/as/vpdesc/1.0.0"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.polarsys.org/kitalpha/ad/viewpoint/dsl/as/vpservices/1.0.0"));
		return result;
	}

}
