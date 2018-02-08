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
	private static final String GENERATION_MSG = "The generation of "; //$NON-NLS-N$
	private static final String START_MSG = " is started"; //$NON-NLS-N$
	private static final String SUCCES_MESSAGE_MSG = " successfully finished"; //$NON-NLS-N$
	private static final String WARNING_MESSAGE_MSG = " is finished with warning"; //$NON-NLS-N$
	
	private static final String COTE_MSG = "\""; //$NON-NLS-N$
	
	protected boolean active = false;
	
	public static final EchoManager INSTANCE = new EchoManager();
	
	public void setActive(boolean state){
		this.active = state;
	}
	
	public boolean isActive(){
		return this.active;
	}
	
	public void echoBengin(String generationName){
		String message = GENERATION_MSG + COTE_MSG + generationName + COTE_MSG + START_MSG;
		echo(message, true);
	}
	
	public void echoEnd(String generationName, boolean success){
		String message = GENERATION_MSG + COTE_MSG + generationName + COTE_MSG + (success ? SUCCES_MESSAGE_MSG : WARNING_MESSAGE_MSG);
		echo(message, success);
	}

	private void echo(String msg, boolean success){
		if (active)
			Activator.getDefault().log(new Status((success ? Status.INFO : Status.WARNING), 
													Activator.getDefault().getPluginID(), 
													msg));
	}
}
