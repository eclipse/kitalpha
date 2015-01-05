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

package org.polarsys.kitalpha.ad.viewpoint.dsl.services.reverse.utils;

import java.util.Comparator;

import org.eclipse.emf.ecore.EClassifier;

/**
 * @author Boubekeur Zendagui
 */

public class EClassifierNameComparator implements Comparator<EClassifier> {

	@Override
	public int compare(EClassifier eClassifier1, EClassifier eClassifier2) {
		final String name1 = eClassifier1.getName().toUpperCase();
		final String name2 = eClassifier2.getName().toUpperCase();
		return name1.compareTo(name2);
	}

}
