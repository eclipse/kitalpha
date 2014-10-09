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
	 * @param selection_p
	 *            the current selection
	 * @param monitor_p
	 *            ProgressMonitor
	 */
	public void transpose(Collection<Object> selection_p, Comparator<Vertex<?>> comparator_p,
			IProgressMonitor monitor_p);

	/**
	 * Allows to launch Transposer with a particular TransposerConfiguration
	 * object.
	 * 
	 * @param selection_p
	 *            the current selection
	 * @param configuration_p
	 *            the current TransposerConfiguration
	 * @param monitor_p
	 *            ProgressMonitor
	 */
	public void transpose(Collection<Object> selection_p,
			TransposerConfiguration configuration_p, Comparator<Vertex<?>> comparator_p,IProgressMonitor monitor_p);

	/**
	 * Returns the analyzer object used.
	 * 
	 * @return IAnalyser
	 */
	public IAnalyzer getAnalyzer();

	/**
	 * Returns the rule handler object used.
	 * 
	 * @return IRuleHandler
	 */
	public IRulesHandler getRulesHandler();

	/**
	 * Returns the scheduler object used.
	 * 
	 * @return IScheduler
	 */
	public IScheduler getScheduler();

	/**
	 * Dispose the Transposer object.
	 */
	public void dispose();
}
