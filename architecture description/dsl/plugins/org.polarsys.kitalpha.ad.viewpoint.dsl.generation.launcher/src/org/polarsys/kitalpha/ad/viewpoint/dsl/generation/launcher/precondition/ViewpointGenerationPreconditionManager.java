/*******************************************************************************
 * Copyright (c) 2016, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.launcher.precondition;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.generation.launcher.Activator;

/**
 * @author Boubekeur Zendagui
 */
public class ViewpointGenerationPreconditionManager {

	public static final String PRECONDITION_EXTENSION_POINT_ID = 
			"org.polarsys.kitalpha.ad.viewpoint.dsl.generation.launcher.precondition"; //$NON-NLS-1$
	
	public static final String PRECONDITION_CONDITION_NAME = "condition"; //$NON-NLS-1$
	public static final String PRECONDITION_CONDITION_ATTR_NAME = "name"; //$NON-NLS-1$
	public static final String PRECONDITION_CONDITION_ATTR_CLASS = "class"; //$NON-NLS-1$
	public static final String PRECONDITION_CONDITION_ATTR_MESSAGE = "message"; //$NON-NLS-1$
	
	/**
	 * Check all available available preconditions
	 * @return True if all preconditions are validated, False otherwise
	 * @throws CoreException 
	 */
	public static List<IStatus> checkPreconditions(Viewpoint viewpoint) throws CoreException{
		IExtension[] preconditions = getPreconditions();
		if (preconditions.length > 0)
		{
			final List<IStatus> failedPreconditionStatuses = new ArrayList<IStatus>();
			for (IExtension iExtension : preconditions) 
			{
				IConfigurationElement[] configurationElements = iExtension.getConfigurationElements();
				for (IConfigurationElement iConfigurationElement : configurationElements) 
				{
					if (iConfigurationElement.getName().equals(PRECONDITION_CONDITION_NAME))
					{
						IStatus result = checkCondition(viewpoint, iConfigurationElement);
						if (! result.equals(Status.OK_STATUS))
						{
							failedPreconditionStatuses.add(result);
						}
					}
				}
			}
			return failedPreconditionStatuses;
		}
		// Being here means that there is no preconditions. So return true.
		return Collections.emptyList();
	}
	
	protected static IStatus checkCondition(Viewpoint viewpoint, IConfigurationElement conditionCE) throws CoreException{
		IViewpointGenerationPrecondition condition = 
				(IViewpointGenerationPrecondition) conditionCE.createExecutableExtension(PRECONDITION_CONDITION_ATTR_CLASS);
		
		if (! condition.canGenerate(viewpoint))
		{
			String cName = conditionCE.getAttribute(PRECONDITION_CONDITION_ATTR_NAME);
			String messageNok = Messages.bind(Messages.Precondition_Message_NOK, cName);
			String cMessage = conditionCE.getAttribute(PRECONDITION_CONDITION_ATTR_MESSAGE);
			String messageDetails = Messages.bind(Messages.Precondition_Message_Details, cMessage);
		
			StringBuffer buffer = new StringBuffer();
			buffer.append(messageNok);
			buffer.append(System.lineSeparator());
			buffer.append(messageDetails);

			return new Status(IStatus.ERROR, Activator.PLUGIN_ID, buffer.toString());
		}
	
		return Status.OK_STATUS;
	}
	
	protected static IExtension[] getPreconditions(){
		IExtensionPoint extensionPoint = Platform.getExtensionRegistry().getExtensionPoint(PRECONDITION_EXTENSION_POINT_ID);
		if (extensionPoint != null)
		{
			return extensionPoint.getExtensions();
		}
		return new IExtension[0];
	}
}
