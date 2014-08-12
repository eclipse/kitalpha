/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.doc.gen.business.core.util;

import org.eclipse.core.runtime.Status;
import org.eclipse.egf.domain.Activator;

public class EchoManager {
	private static final String Generation_msg = "The generation of "; //$NON-NLS-N$
	private static final String Start_msg = " is started"; //$NON-NLS-N$
	private static final String SuccesMessage_msg = " successfully finished"; //$NON-NLS-N$
	private static final String WarningMessage_msg = " is finished with warning"; //$NON-NLS-N$
	
	private static final String Cote_msg = "\""; //$NON-NLS-N$
	
	protected boolean active = false;
	
	public static EchoManager INSTANCE = new EchoManager();
	
	public void setActive(boolean state){
		this.active = state;
	}
	
	public boolean isActive(){
		return this.active;
	}
	
	public void echoBengin(String generationName){
		String message = Generation_msg + Cote_msg + generationName + Cote_msg + Start_msg;
		echo(message, true);
	}
	
	public void echoEnd(String generationName, boolean success){
		String message = Generation_msg + Cote_msg + generationName + Cote_msg + (success ? SuccesMessage_msg : WarningMessage_msg);
		echo(message, success);
	}

	private void echo(String msg, boolean success){
		if (active)
			Activator.getDefault().log(new Status((success ? Status.INFO : Status.WARNING), 
													Activator.getDefault().getPluginID(), 
													msg));
	}
}
