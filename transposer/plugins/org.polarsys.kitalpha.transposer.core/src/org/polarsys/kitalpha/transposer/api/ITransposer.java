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


package org.polarsys.kitalpha.transposer.api;

import java.util.Collection;
import java.util.Comparator;

import org.eclipse.core.runtime.IProgressMonitor;

import org.polarsys.kitalpha.transposer.analyzer.api.IAnalyzer;
import org.polarsys.kitalpha.transposer.analyzer.graph.Vertex;
import org.polarsys.kitalpha.transposer.rules.handler.api.IRulesHandler;
import org.polarsys.kitalpha.transposer.scheduler.api.IScheduler;

/**
 * ITransposer objects can be use the Transposer architecture. 
 * @author Guillaume Gebhart
 */
public interface ITransposer {
	/**
	 * Allows to launch Transposer.
	 * 
	 * @param selection
	 *            the current selection
	 * @param monitor
	 *            ProgressMonitor
	 */
	void transpose(Collection<Object> selection, Comparator<Vertex<?>> comparator,
			IProgressMonitor monitor);

	/**
	 * Allows to launch Transposer with a particular TransposerConfiguration
	 * object.
	 * 
	 * @param selection
	 *            the current selection
	 * @param configuration
	 *            the current TransposerConfiguration
	 * @param monitor
	 *            ProgressMonitor
	 */
	void transpose(Collection<Object> selection,
			TransposerConfiguration configuration, Comparator<Vertex<?>> comparator,IProgressMonitor monitor);

	/**
	 * Returns the analyzer object used.
	 * 
	 * @return IAnalyser
	 */
	IAnalyzer getAnalyzer();

	/**
	 * Returns the rule handler object used.
	 * 
	 * @return IRuleHandler
	 */
	IRulesHandler getRulesHandler();

	/**
	 * Returns the scheduler object used.
	 * 
	 * @return IScheduler
	 */
	IScheduler getScheduler();

	/**
	 * Dispose the Transposer object.
	 */
	void dispose();
}
