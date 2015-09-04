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

import java.util.Collection;
import java.util.Queue;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.builder.resourceloader.AbstractResourceLoader;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.identifiers.NatureID;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.ResourceHelper;

import com.google.common.collect.Lists;

/**
 * 
 * @author Amine Lajmi
 *
 */
@SuppressWarnings("restriction")
public class SerialPeriodicResourceLoader extends AbstractResourceLoader {

	public SerialPeriodicResourceLoader(IResourceSetProvider resourceSetProvider, Sorter sorter) {
		super(resourceSetProvider, sorter);
	}

	public LoadOperation create(final ResourceSet parent, IProject project) {
		
		final Queue<URI> queue = Lists.newLinkedList();
		
		try {
			if (project != null && 
					project.exists() &&
					project.hasNature(NatureID.VPDSL_PROJECT_NATURE))
			{

				return new CheckedLoadOperation(new LoadOperation() {

					public LoadResult next() {
						URI uri = queue.poll();
						try {
							Resource resource = null;
							if (ResourceHelper.hasPeriodicFileExtension(uri)) {
								resource = ResourceHelper.loadResource(uri, parent);
							} else {
								resource = parent.getResource(uri, true);
							}			
							return new LoadResult(resource, uri);
						} catch(WrappedException e) {
							throw new LoadOperationException(uri, e);
						}
					}

					public boolean hasNext() {
						return !queue.isEmpty();
					}

					public Collection<URI> cancel() {
						return queue;
					}

					public void load(Collection<URI> uris) {
						queue.addAll(getSorter().sort(uris));
					}
				});
			}
		} catch (CoreException e) {
			//die
		}
		
		return new CheckedLoadOperation(new LoadOperation() {

			public LoadResult next() {
				URI uri = queue.poll();
				try {
					Resource resource = parent.getResource(uri, true);
					return new LoadResult(resource, uri);
				} catch(WrappedException e) {
					/**
					 * FIXME This commented due to migration to mars. Ensure that the
					 * modification work finely at the end of migration on LoadOperationException(uri, e.getCause()) 
					 * for it second arg
					 */
//					throw new LoadOperationException(uri, e.getCause());
					throw new LoadOperationException(uri, e);
				}
			}

			public boolean hasNext() {
				return !queue.isEmpty();
			}

			public Collection<URI> cancel() {
				return queue;
			}

			public void load(Collection<URI> uris) {
				queue.addAll(getSorter().sort(uris));
			}
		});
	}

	@Override
	protected Resource loadResource(URI uri, ResourceSet localResourceSet, ResourceSet parentResourceSet) {
		if (ResourceHelper.hasPeriodicFileExtension(uri)) {
			return ResourceHelper.loadResource(uri, localResourceSet);
		} else {
			return localResourceSet.getResource(uri, true);
		}
	}
}
