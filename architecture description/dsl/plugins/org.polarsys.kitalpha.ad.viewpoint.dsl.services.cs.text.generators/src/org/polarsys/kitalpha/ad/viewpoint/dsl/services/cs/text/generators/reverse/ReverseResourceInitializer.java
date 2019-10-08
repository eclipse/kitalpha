/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.generators.reverse;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.generators.Messages;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.generators.internal.Activator;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.generators.util.GeneratorsUtil;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.reverse.extension.IConcreteSyntaxResourceInitialize;

/**
 * 
 * @author Amine Lajmi
 *
 */
public class ReverseResourceInitializer implements IConcreteSyntaxResourceInitialize {
	
	private final ReverseSynchronizer delegate;
	
	public ReverseResourceInitializer() {
		delegate = new ReverseSynchronizer();
	}

	public boolean initializeConcreteSyntaxResource(URI vpDescResourceURI, String vpDslProjectName) {
		GeneratorsUtil.toggleXtextNature(vpDslProjectName);
		return doBackwardSynchronize(vpDescResourceURI);
	}

	private boolean doBackwardSynchronize(final URI uri) {
		final Status[] status = new Status[1];
		final Runnable runnable = new Runnable() {
			public void run() {
				if (!delegate.doBackwardSynchronize(uri))
					status[0] = new Status(IStatus.ERROR, Activator.PLUGIN_ID, Messages.ViewpointDSLActions_BackwardSynchronizer_SerializationException);
				else
					status[0] = new Status(IStatus.OK, Activator.PLUGIN_ID, Messages.ViewpointDSLActions_BackwardSynchronizer_Success);	
			}
		};
		runnable.run();
		if (status[0].isOK())
			return true;
		return false;
	}

	@Deprecated
	@Override
	public StringBuffer createPluginXmlContribution(URI vpDescResourceURI, String vpDslProjectName) {
		return null;
	}
}
