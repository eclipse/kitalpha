/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.scoping;

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
public class DataContainerManager extends StateBasedContainerManager {

	private IResourceDescription description;
	
	@Override
	public List<IContainer> getVisibleContainers(IResourceDescription desc, IResourceDescriptions resourceDescriptions) {
		description = desc;
		return super.getVisibleContainers(desc, resourceDescriptions);
	}
	
	@Override
	protected List<IContainer> getVisibleContainers(List<String> handles, IResourceDescriptions resourceDescriptions) {
		//Default containers
		if (handles.isEmpty()) {
			return Collections.emptyList();
		}
		List<IContainer> result = Lists.newArrayListWithExpectedSize(handles.size() + 1);	
		for(String handle: handles) {
			IContainer container = createContainer(handle, resourceDescriptions);
			if (!container.isEmpty() || result.isEmpty()) {
				result.add(container);
			}
		}
		//Data container
		String handle = internalGetContainerHandle(description, resourceDescriptions);
		IContainer container = createDataContainer(handle, resourceDescriptions);
		result.add(container);
		return result;
	}
	
	protected IContainer createDataContainer(String handle, IResourceDescriptions resourceDescriptions) {
		IAllContainersState state = getState(resourceDescriptions);
		IContainerState containerState = new DataContainerState(handle, state);
		DataContainer result = new DataContainer(resourceDescriptions, containerState);
		return result;
	}
}
