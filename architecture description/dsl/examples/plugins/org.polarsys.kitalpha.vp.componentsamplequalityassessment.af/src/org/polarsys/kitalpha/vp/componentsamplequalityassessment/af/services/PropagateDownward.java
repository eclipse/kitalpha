/*******************************************************************************
 * Copyright (c) 2014, 2016 Thales Global Services S.A.S.
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
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
