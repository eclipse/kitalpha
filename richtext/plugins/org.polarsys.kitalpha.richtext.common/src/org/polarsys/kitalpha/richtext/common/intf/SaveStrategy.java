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
package org.polarsys.kitalpha.richtext.common.intf;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * Strategy used for a custom strategy of setting elements in the feature
 * 
 * @author Faycal Abka
 *
 */
public interface SaveStrategy {
	
	/**
	 * Strategy to define how the editor text is setted to model feature
	 * @param editorText the current text in the editor. May be null
	 * @param owner the model owner object
	 * @param feature where editorText value to be stored
	 */
	void save(String editorText, EObject owner, EStructuralFeature feature);

}
