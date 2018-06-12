/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.wizards.impl.diagram.template.observer;

import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class;

/**
 * The observer. It is resposible to update the template
 * @author Faycal Abka
 *
 */
public interface IObserver {
	void update(Class vpClass, boolean isDiagramExtension);
}
