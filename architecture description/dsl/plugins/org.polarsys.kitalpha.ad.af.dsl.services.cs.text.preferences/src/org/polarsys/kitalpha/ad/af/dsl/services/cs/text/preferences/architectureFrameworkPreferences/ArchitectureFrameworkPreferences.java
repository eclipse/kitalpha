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
package org.polarsys.kitalpha.ad.af.dsl.services.cs.text.preferences.architectureFrameworkPreferences;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.preferences.kitalphaPreferences.AbstractNodePreferences;

/**
 * 
 * @author Faycal ABKA
 *
 */
public class ArchitectureFrameworkPreferences extends AbstractNodePreferences {
	
	@Override
	public Control createContents(Composite parent){
		return createContentsWithTitle(parent, Messages.ArchitectureFrameworkPreferencesPages_GlobalPrefTitle);
	}
}
