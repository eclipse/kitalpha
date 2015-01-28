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
package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.output;

import org.eclipse.emf.ecore.EObject;

/**
 * 
 * @author Amine Lajmi
 *
 */
public interface ITreeAppendable extends IAppendable {
	
	ITreeAppendable trace(EObject object);
	
	ITreeAppendable append(CharSequence string);
	
	ITreeAppendable increaseIndentation();
	
	ITreeAppendable decreaseIndentation();
	
	ITreeAppendable newLine();

}
