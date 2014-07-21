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


package org.polarsys.kitalpha.ad.af.dsl.cs.text.scoping;

import java.util.Collection;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.resource.containers.IAllContainersState;
import org.eclipse.xtext.resource.containers.IContainerState;

/**
 * 
 * @author Amine Lajmi
 *
 */
public class AfdescContainerState implements IContainerState {

	private final String root;
	
	private final IAllContainersState globalState;

	protected AfdescContainerState(String root, IAllContainersState globalState) {
		this.root = root;
		this.globalState = globalState;
	}

	public Collection<URI> getContents() {
		return globalState.getContainedURIs(root);
	}

	public boolean contains(URI uri) {
		return getContents().contains(uri);
	}
	
	public boolean isEmpty() {
		return globalState.isEmpty(root);
	}
}
