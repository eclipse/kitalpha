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
package org.polarsys.kitalpha.model.common.commands.contrib.resourcesChecker.command;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.polarsys.kitalpha.model.common.commands.action.ModelCommand;
import org.polarsys.kitalpha.model.common.commands.contrib.resourcesChecker.Messages;
import org.polarsys.kitalpha.model.common.commands.exception.ModelCommandException;
import org.polarsys.kitalpha.model.common.scrutiny.registry.ModelScrutinyRegistry;

/**
 * @author Faycal Abka
 */
public class WorkspaceResourceChecker extends ModelCommand {

	@Override
	public void exec(ModelScrutinyRegistry analysis, Resource resource, IProgressMonitor monitor)
			throws ModelCommandException {
		
		SubMonitor subMonitor = SubMonitor.convert(monitor);
		
		subMonitor.beginTask(Messages.CHECK_ATTRIBUTE_FILES, 1);
		
		ResourceSet resourceSet = resource.getResourceSet();
		
		if (resourceSet != null){
			EList<Resource> resources = resourceSet.getResources();

			for (Resource resource2 : resources) {
				checkAttributes(resource2, subMonitor.newChild(1));
			}
		}
	}

	private void checkAttributes(Resource resource2, IProgressMonitor monitor) 
			throws ModelCommandException {
		
		SubMonitor subMonitor = SubMonitor.convert(monitor);
		
		subMonitor.beginTask(Messages.bind(Messages.CHECK_FILE, resource2.getURI()), 1);
		
		URI uri =  resource2.getURI();
		
		if (uri.isPlatformResource()) {
			
			String platformString = uri.toPlatformString(true);
			IResource iResource = ResourcesPlugin.getWorkspace().getRoot().findMember(platformString);

			if (iResource != null && !iResource.isAccessible()){
				throw new ModelCommandException(Messages.bind(Messages.RESOURCE_INACCESSIBLE, iResource.getName()));
			}
		}
	}

}
