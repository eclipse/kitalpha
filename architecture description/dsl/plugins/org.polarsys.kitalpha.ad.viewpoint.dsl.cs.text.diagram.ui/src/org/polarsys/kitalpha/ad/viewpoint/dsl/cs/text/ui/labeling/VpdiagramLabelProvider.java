/*******************************************************************************
 * Copyright (c) 2014, 2016 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
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
	public VpdiagramLabelProvider(final AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	String text(final DiagramDescription ele) {
		final String resoureURI = ele.eResource().getURI().toString();
		if (Strings.isNullOrEmpty(resoureURI)) {
			return ele.getName();
		}
		return PREFIX + resoureURI;
	}

	String text(final EdgeMapping ele) {
		final String resoureURI = ele.eResource().getURI().toString();
		if (Strings.isNullOrEmpty(resoureURI)) {
			return ele.getName();
		}
		return PREFIX + resoureURI;
	}

	String text(final NodeMapping ele) {
		final String resoureURI = ele.eResource().getURI().toString();
		if (Strings.isNullOrEmpty(resoureURI)) {
			return ele.getName();
		}
		return PREFIX + resoureURI;
	}

	String text(final ContainerMapping ele) {
		final String resoureURI = ele.eResource().getURI().toString();
		if (Strings.isNullOrEmpty(resoureURI)) {
			return ele.getName();
		}
		return PREFIX + resoureURI;
	}

	String text(final Group ele) {
		final String resoureURI = ele.eResource().getURI().toString();
		if (Strings.isNullOrEmpty(resoureURI)) {
			return ele.getName();
		}
		return PREFIX + resoureURI;
	}

}
