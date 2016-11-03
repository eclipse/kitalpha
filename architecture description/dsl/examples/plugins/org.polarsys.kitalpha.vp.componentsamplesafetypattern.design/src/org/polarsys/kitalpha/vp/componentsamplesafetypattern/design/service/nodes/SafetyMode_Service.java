/*******************************************************************************
 * Copyright (c) 2014, 2016 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
// Generated on 26.10.2016 at 04:19:07 CEST by Viewpoint DSL Generator V 0.1

package org.polarsys.kitalpha.vp.componentsamplesafetypattern.design.service.nodes;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.HardwareComponent;
import org.polarsys.kitalpha.vp.componentsamplesafety.ComponentSampleSafety.Safety;
import org.polarsys.kitalpha.vp.componentsamplesafetypattern.ComponentSampleSafetyPattern.SafetyMode;

/**
 * 
 * @author Faycal ABKA
 * 
 * <!-- begin-user-doc -->
 * This class is an implementation of the Sirius JavaExtension '<em><b>[org.polarsys.kitalpha.vp.componentsamplesafetypattern.design.service.nodes.SafetyMode_Service]</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */

public class SafetyMode_Service {
	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @param eObject : the current semantic object
	* @param diagram : the current DSemanticdiagram
	* @param view : the current View for witch the label is calculated
	* @generated NOT
	*/
	public String getSafetyModeName(EObject eObject, DDiagram diagram, DDiagramElement view) {
		StringBuilder sb = new StringBuilder("Unknown Name"); //$NON-NLS-1$
		if (eObject instanceof SafetyMode) {
			sb.setLength(0);
			SafetyMode sm = (SafetyMode) eObject;
			sb.append(sm.getPattern().toString().trim());
			EList<Safety> involvedComponents = sm.getInvolvedComponents();
			if (!involvedComponents.isEmpty()) {
				sb.append(" { ");
				for (Safety c : involvedComponents) {
					HardwareComponent eContainer = (HardwareComponent) c.eContainer();
					String name = eContainer.getName();
					if (name != null && !name.isEmpty()){
						sb.append(name);
					} else {
						sb.append("Empty Name"); //$NON-NLS-1$
					}
					sb.append("[").append(c.getState().toString().trim()).append("]"); //$NON-NLS-1$ //$NON-NLS-2$
					sb.append(", "); //$NON-NLS-1$
				}
				sb.append(" }"); //$NON-NLS-1$
			}
		}
		return sb.toString().trim();
	}

	/**
	 * 
	 * @param object
	 * @return
	 * 
	 * @generated NOT
	 */
	private String getName(EObject object) {
		if (null == object) {
			return null;
		}
		AdapterFactoryEditingDomain editingDomain = (AdapterFactoryEditingDomain) AdapterFactoryEditingDomain
				.getEditingDomainFor(object);
		if (null == editingDomain) {
			return null;
		}
		IItemLabelProvider p = (IItemLabelProvider) editingDomain.getAdapterFactory().adapt(object,
				IItemLabelProvider.class);
		if (p != null) {
			return p.getText(object);
		}
		return "{" + object.toString() + "}";
	}
}