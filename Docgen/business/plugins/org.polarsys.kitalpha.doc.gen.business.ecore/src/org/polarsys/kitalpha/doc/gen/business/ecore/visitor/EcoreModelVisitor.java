/*******************************************************************************
 * Copyright (c) 2020 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.doc.gen.business.ecore.visitor;

import org.polarsys.kitalpha.doc.gen.business.core.visitor.DocgenCommonSubClassEmfModelVisitor;
import org.polarsys.kitalpha.doc.gen.business.ecore.helpers.EcoreFileNameService;

public class EcoreModelVisitor extends DocgenCommonSubClassEmfModelVisitor {

	public EcoreModelVisitor() {
		fileNameService = EcoreFileNameService.INSTANCE;
	}
	
}
