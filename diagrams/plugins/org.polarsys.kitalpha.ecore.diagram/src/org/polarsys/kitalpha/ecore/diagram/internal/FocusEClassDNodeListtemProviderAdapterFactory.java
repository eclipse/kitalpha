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

package org.polarsys.kitalpha.ecore.diagram.internal;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.sirius.diagram.provider.DNodeListItemProvider;
import org.eclipse.sirius.diagram.provider.DiagramItemProviderAdapterFactory;

public class FocusEClassDNodeListtemProviderAdapterFactory extends DiagramItemProviderAdapterFactory {

	@Override
	public Adapter createDNodeListAdapter() {
		// TODO Auto-generated method stub
		return new FocusDNodeListItemProvider(this);
	}
	
	private static class FocusDNodeListItemProvider extends DNodeListItemProvider {

		public FocusDNodeListItemProvider(AdapterFactory adapterFactory) {
			super(adapterFactory);
		}
		
		@Override
		public String getText(Object object) {
			return super.getText(object);
		}
	}
}
