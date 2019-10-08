/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.common.log;

import org.eclipse.core.runtime.Status;
import org.eclipse.egf.domain.Activator;

/**
 * @author Boubekeur Zendagui
 */

public class ViewpointDslLogger {
	
	protected static boolean Activated = true;
	
	public static boolean isActivated(){
		return Activated;
	}

	public static void setActivated(boolean bool){
		Activated = bool;
	}

	public static void doLogInfo(String message){
		doLog(Status.INFO, message);
	}

	public static void doLogWarning(String message){
		doLog(Status.WARNING, message);
	}

	public static void doLogError(String message){
		doLog(Status.ERROR, message);
	}

	public static void doLog(int severity, String message){
		if (Activated) {
			Activator.getDefault().log(new Status(severity, Activator.getDefault().getPluginID(), message));
		}
	}
}
