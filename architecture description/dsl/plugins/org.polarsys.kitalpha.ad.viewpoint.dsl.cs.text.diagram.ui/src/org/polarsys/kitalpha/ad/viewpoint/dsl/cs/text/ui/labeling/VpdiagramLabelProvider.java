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

package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.labeling;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.sirius.diagram.description.ContainerMapping;
import org.eclipse.sirius.diagram.description.DiagramDescription;
import org.eclipse.sirius.diagram.description.EdgeMapping;
import org.eclipse.sirius.diagram.description.NodeMapping;
import org.eclipse.sirius.viewpoint.description.Group;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider; 
 
import com.google.common.base.Strings;
import com.google.inject.Inject;

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#labelProvider
 */
/**
 * 
 * @author Amine Lajmi
 *         Faycal Abka
 *
 */
public class VpdiagramLabelProvider extends DefaultEObjectLabelProvider {

	
	private final String PREFIX = " From the resource: ";
	
	@Inject
	public VpdiagramLabelProvider(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}
	
	String text(DiagramDescription ele) {
		String resoureURI = ele.eResource().getURI().toString();
		if (Strings.isNullOrEmpty(resoureURI))
			return ele.getName();
	  return PREFIX + resoureURI;
	}
	
	String text(EdgeMapping ele) {
		String resoureURI = ele.eResource().getURI().toString();
		if (Strings.isNullOrEmpty(resoureURI))
			return ele.getName();
	  return PREFIX + resoureURI;
	}
	
	String text(NodeMapping ele) {
		String resoureURI = ele.eResource().getURI().toString();
		if (Strings.isNullOrEmpty(resoureURI))
			return ele.getName();
	  return PREFIX + resoureURI;
	}
	
	String text(ContainerMapping ele) {
		String resoureURI = ele.eResource().getURI().toString();
		if (Strings.isNullOrEmpty(resoureURI))
			return ele.getName();
	  return PREFIX + resoureURI;
	}
	
	String text(Group ele) {
		String resoureURI = ele.eResource().getURI().toString();
		if (Strings.isNullOrEmpty(resoureURI))
			return ele.getName();
	  return PREFIX + resoureURI;
	}
	 
//    String image(DiagramDescription ele) {
//      return "icons/vpdsl_file_16.png";
//    }

}
