/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/


package org.polarsys.kitalpha.transposer.analyzer.api;

import java.util.Collection;

import org.eclipse.core.runtime.IProgressMonitor;

import org.polarsys.kitalpha.transposer.analyzer.exceptions.AnalysisException;
import org.polarsys.kitalpha.transposer.analyzer.graph.Graph;

/**
 * IAnalyser objects allow to build dependency Graph from their computed
 * premises.
 * 
 * @author Guillaume Gebhart
 */
public interface IAnalyzer {

	/**
	 * Build graph model from analysis sources.
	 * 
	 * @param analysisSources_p
	 *            analysis sources
	 * @param selection
	 *            current selection
	 * @param monitor_p
	 *            progress monitor
	 * @return Graph model
	 * @throws AnalysisException
	 */
	public Graph analyze(Collection<?> analysisSources_p,
			Collection<?> selection, IProgressMonitor monitor_p)
			throws AnalysisException;

	/**
	 * Disposes analyzer object.
	 */
	public void dispose();

}
