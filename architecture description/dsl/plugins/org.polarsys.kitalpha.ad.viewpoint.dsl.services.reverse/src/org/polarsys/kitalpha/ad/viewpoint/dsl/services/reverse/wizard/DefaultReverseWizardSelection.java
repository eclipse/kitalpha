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

package org.polarsys.kitalpha.ad.viewpoint.dsl.services.reverse.wizard;

import org.polarsys.kitalpha.ad.viewpoint.dsl.services.reverse.extension.ConcreteSyntaxResourceInitializeManager;

/**
 * @author Boubekeur Zendagui
 */

public class DefaultReverseWizardSelection {
	public static final int RepresentationDefaultSelection 		= 1; //$NON-NLS-N$
	
	public static boolean isDefault(String data, int source){
		switch (source) {
			case RepresentationDefaultSelection :
				return checkRepresentation(data);
		}
		
		return false;
	}
	
	protected static boolean checkRepresentation(String creatorID) {
		return ConcreteSyntaxResourceInitializeManager.isDefault(creatorID);
	}

}
