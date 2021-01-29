/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ecore.diagram.internal;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.DEdge;
import org.eclipse.sirius.diagram.provider.DEdgeItemProvider;
import org.eclipse.sirius.diagram.provider.DiagramItemProviderAdapterFactory;

public class FocusEdgeItemProviderAdapterFactory extends DiagramItemProviderAdapterFactory {

	@Override
	public Adapter createDEdgeAdapter() {
		return new FocusDEdgeItemProvider(this);
	}

	private static class FocusDEdgeItemProvider extends DEdgeItemProvider {

		public FocusDEdgeItemProvider(AdapterFactory adapterFactory) {
			super(adapterFactory);
		}

		@Override
		public String getText(Object object) {
			if (object instanceof DEdge) 
			{
				DEdge dEdge = (DEdge) object;
				StringBuilder s = new StringBuilder();
				EClass source = (EClass) ((DDiagramElement) dEdge.getSourceNode()).getTarget();
				EClass target = (EClass) ((DDiagramElement) dEdge.getTargetNode()).getTarget();
				EObject model = dEdge.getTarget();

				if (model instanceof EReference) 
				{
					s.append(((EReference) model).getName());
				}
				else 
				{
					if (model instanceof EClass) {
						s.append("Inheritance");
					}
				}
				s.append(" : ");
				s.append(source.getName());
				s.append(" --> ");
				s.append(target.getName());
				return s.toString();
			} 
			else 
			{
				return super.getText(object);
			}

		}
	}

}