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

package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.builder;

import org.eclipse.xtext.builder.resourceloader.IResourceLoader;
import org.eclipse.xtext.builder.resourceloader.IResourceLoader.Sorter;
import org.eclipse.xtext.builder.resourceloader.ResourceLoaderProviders.AbstractResourceLoaderProvider;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;

import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * 
 * @author Amine Lajmi
 *
 */
@SuppressWarnings("restriction")
public class PeriodicResourceLoaderProvider implements Provider<IResourceLoader> {

	public static Provider<IResourceLoader> getSerialLoader() {
		return new AbstractResourceLoaderProvider() {
			public IResourceLoader get() {
				return new SerialPeriodicResourceLoader(getResourceSetProvider(), getResourceSorter());
			}
		};
	}
	
	public IResourceLoader get() {
		return new SerialPeriodicResourceLoader(getResourceSetProvider(), getResourceSorter());
	}

	@Inject
	private IResourceSetProvider resourceSetProvider;

	@Inject
	private Sorter resourceSorter;

	public IResourceSetProvider getResourceSetProvider() {
		return resourceSetProvider;
	}

	public Sorter getResourceSorter() {
		return resourceSorter;
	}
}
