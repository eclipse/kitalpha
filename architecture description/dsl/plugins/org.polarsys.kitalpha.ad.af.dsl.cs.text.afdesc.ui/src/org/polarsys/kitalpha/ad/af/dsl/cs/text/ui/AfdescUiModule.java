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

package org.polarsys.kitalpha.ad.af.dsl.cs.text.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.polarsys.kitalpha.ad.af.dsl.cs.text.ui.callback.AfdescEditorCallback;


/**
 * 
 * @author Amine Lajmi
 *
 */
public class AfdescUiModule extends org.polarsys.kitalpha.ad.af.dsl.cs.text.ui.AbstractAfdescUiModule {
	public AfdescUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	@Override
	public Class<? extends org.eclipse.xtext.ui.editor.IXtextEditorCallback> bindIXtextEditorCallback() {
		return AfdescEditorCallback.class;
	}
}
