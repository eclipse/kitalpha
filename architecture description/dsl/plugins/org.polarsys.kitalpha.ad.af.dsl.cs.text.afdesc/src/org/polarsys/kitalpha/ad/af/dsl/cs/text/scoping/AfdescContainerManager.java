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

import java.util.Collections;
import java.util.List;

import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.containers.IAllContainersState;
import org.eclipse.xtext.resource.containers.IContainerState;
import org.eclipse.xtext.resource.containers.StateBasedContainerManager;

import com.google.common.collect.Lists;

/**
 * 
 * @author Amine Lajmi
 *
 */
public class AfdescContainerManager extends StateBasedContainerManager {

	private IResourceDescription description;
	
	public AfdescContainerManager() {
	}
	
	@Override
	public List<IContainer> getVisibleContainers(IResourceDescription desc, IResourceDescriptions resourceDescriptions) {
		description = desc;
		return super.getVisibleContainers(desc, resourceDescriptions);
	}
	
	protected List<IContainer> getVisibleContainers(List<String> handles, IResourceDescriptions resourceDescriptions) {
		if (handles.isEmpty())
		{
			return Collections.emptyList();
		}
		List<IContainer> result = Lists.newArrayListWithExpectedSize(handles.size() + 1);	
		for(String handle: handles) {
			IContainer container = createContainer(handle, resourceDescriptions);
			if (!container.isEmpty() || result.isEmpty())
			{
				result.add(container);
			}
		}	
		String rootHandle = internalGetContainerHandle(description, resourceDescriptions);
		IContainer container = createAedslContainer(rootHandle, resourceDescriptions);
		result.add(container);
		return result;
	}
	
	protected IContainer createAedslContainer(String handle, IResourceDescriptions resourceDescriptions) {
		IAllContainersState state = getState(resourceDescriptions);
		IContainerState containerState = new AfdescContainerState(handle, state);
		AfdescContainer result = new AfdescContainer(resourceDescriptions, containerState);
		return result;
	}
}
