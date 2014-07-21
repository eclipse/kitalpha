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

package org.polarsys.kitalpha.ad.services.detachment.core.log;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.polarsys.kitalpha.ad.services.detachment.core.Activator;

/**
 * @author Faycal Abka
 */
public class LoggerService {
	

	
	public static void error(String message, Throwable e){
		IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, message, e);
		Activator.getLog().log(status);
	}
	
	public static void warning(String message, Throwable e){
		IStatus status = new Status(IStatus.WARNING, Activator.PLUGIN_ID, message, e);
		Activator.getLog().log(status);
	}

}
