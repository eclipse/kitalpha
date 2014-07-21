/*******************************************************************************
 * Copyright (c) 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.services.detachment.core.services;

import java.io.IOException;
import java.util.Collection;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.polarsys.kitalpha.ad.services.detachment.core.registeries.interfaces.AbstractDetachmentWizard;
import org.polarsys.kitalpha.ad.services.detachment.core.services.feedback.IFeedback;
import org.polarsys.kitalpha.ad.services.detachment.core.utils.tree.ViewpointTreeContainer;


/**
 * The contract of detachment. 
 * 
 * @author Faycal Abka
 *
 */

public interface IDetachmentService {
	
	
	/**
	 * Returns the undefined references in the resource
	 */
	//TODO: returned type.
	public IFeedback getUndefinedReferences();
	
	/**
	 * Return all viewpoints used in the resource
	 */
	//TODO: returned type
	public ViewpointTreeContainer getUsedViewpoints();
	
	/**
	 * Perform the detachment
	 * @throws CoreException 
	 * @throws IOException 
	 */
	public void performDetachment(boolean removeUnknownReferences, 
			IProgressMonitor monitor) throws IOException, CoreException;
	
	
	public Collection<AbstractDetachmentWizard> getWizardPages();
}
