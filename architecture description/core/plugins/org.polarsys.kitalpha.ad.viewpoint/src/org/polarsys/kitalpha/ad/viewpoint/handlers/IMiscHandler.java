/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.handlers;

import java.util.List;

import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Viewpoint;

/**
 * @author Thomas Guiu
 * 
 */
public interface IMiscHandler extends IElementHandler {
	void removeParents(List<Viewpoint> vps);

	void addParents(List<Viewpoint> vps);

	boolean isAbstract();

	void setAbstract(boolean value);

	String getDescription();

	void setDescription(String txt);

	String getName();

	void setName(String txt);

}
