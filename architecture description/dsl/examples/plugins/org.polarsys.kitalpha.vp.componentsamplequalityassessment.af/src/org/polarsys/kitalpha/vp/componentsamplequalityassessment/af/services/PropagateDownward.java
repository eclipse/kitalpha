/*******************************************************************************
 * Copyright (c) 2014, 2016 Thales Global Services S.A.S.
 *   This program and the accompanying materials are made available under the
 *   terms of the Eclipse Public License 2.0 which is available at
 *   http://www.eclipse.org/legal/epl-2.0
 *   
 *   SPDX-License-Identifier: EPL-2.0
 *  
 *  Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.vp.componentsamplequalityassessment.af.services;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.polarsys.kitalpha.emde.model.ExtensibleElement;
import org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.QualityAssessment;

/**
 * @author Thomas Guiu
 *
 */
public class PropagateDownward extends PropagationService {


	protected List<EObject> perform(final Object[] selection) {
		List<EObject> additions = new ArrayList<EObject>();
		for (Object o : selection) {
			QualityAssessment qa = getQA(o);
			if (qa != null) {
				EObject eobj = (EObject) o;
				for (EObject child : eobj.eContents()) {
					if (child instanceof ExtensibleElement && !child.equals(qa)) {
						QualityAssessment copy = EcoreUtil.copy(qa);
						((ExtensibleElement) child).getOwnedExtensions().add(copy);
						additions.add(copy);
					}
				}
			}
		}
		return additions;
	}

	protected String getServiceLabel() {
		return "Propagate QA downward";
	}


}
