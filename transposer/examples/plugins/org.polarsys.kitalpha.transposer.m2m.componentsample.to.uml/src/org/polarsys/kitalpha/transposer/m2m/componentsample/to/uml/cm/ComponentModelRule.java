/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.transposer.m2m.componentsample.to.uml.cm;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.UMLFactory;
import org.polarsys.kitalpha.transposer.m2m.componentsample.to.uml.constants.IConstants;
import org.polarsys.kitalpha.transposer.m2m.componentsample.to.uml.generic.AbstractGenericRule;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IPremise;
import org.polarsys.kitalpha.vp.componentsample.ComponentSample.ComponentModel;


/**
 * Transform component model to an UML model
 * @author Guillaume Gebhart
 *
 */
public class ComponentModelRule extends AbstractGenericRule<ComponentModel> {
	
	public ComponentModelRule() {
	}

	@Override
	public void apply(ComponentModel cm, IContext context)
			throws Exception {
		//Create a new UML Model
		Model model = UMLFactory.eINSTANCE.createModel();

		//Set the name
		model.setName(cm.getName());

		//Set the UML Model uri
		if (cm.eResource().getURI().isPlatformResource()){
			String umlModelUri = computeUMLModelUri(cm.eResource().getURI());
			model.setURI(umlModelUri);
		}

		//put the model in Transposer context
		context.put(cm, model);

		//Allows to retrieve the UML model with String key
		Resource resource = (Resource)context.get(IConstants.UML_RESOURCE);
		//we add root element into the resource
		resource.getContents().add(model);

	}



	private String computeUMLModelUri(URI uri) {
		String str_uri = uri.toString();
		int lastDotIndex = str_uri.lastIndexOf(".");

		str_uri = str_uri.substring(0, lastDotIndex + 1) + "uml";
		return str_uri;
	}

	@Override
	public List<IPremise> getPremises(ComponentModel cm){		
		return Collections.emptyList();
	}

	@Override
	public boolean isApplicableOn(ComponentModel cm) {
		return cm instanceof ComponentModel;
	}
}
