/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
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
	Graph analyze(Collection<?> analysisSources,
			Collection<?> selection, IProgressMonitor monitor)
			throws AnalysisException;

	/**
	 * Disposes analyzer object.
	 */
	void dispose();

}
