/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.template;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.output.TreeAppendable;

/**
 *
 * This interface aims to have diffrents diagram generation
 *
 * @author Faycal Abka
 *
 */
public interface IGenerationStrategy {

	String SEPARATOR = ".";
	String LINE_SEPARATOR = "\n";
	String INDENTATION = "	";

	/**
	 * Algorithm of generation
	 * @param vpClass
	 * @param TreeAppendable
	 */
	TreeAppendable generateDiagram(Class vpClass);
}
