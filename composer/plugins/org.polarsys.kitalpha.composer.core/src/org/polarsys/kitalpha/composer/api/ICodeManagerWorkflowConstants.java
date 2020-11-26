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


package org.polarsys.kitalpha.composer.api;

/**
 * Constants for Composer Worflow Extensions.
 * 
 
 */
public interface ICodeManagerWorkflowConstants {

	String COMPOSER_WORKFLOW_ID = "org.polarsys.kitalpha.composer.core.workflow";
	String COMPOSER_WORKFLOW_BEFORE_STRATEGY_ID = "org.polarsys.kitalpha.composer.core.workflow.beforestrategy";
	String COMPOSER_WORKFLOW_BEFORE_REFINERY_ID = "org.polarsys.kitalpha.composer.core.workflow.beforerefinery";
	String COMPOSER_WORKFLOW_BEFORE_GENERATION_ID = "org.polarsys.kitalpha.composer.core.workflow.beforegeneration";
	String COMPOSER_WORKFLOW_AFTER_GENERATION_ID = "org.polarsys.kitalpha.composer.core.workflow.aftergeneration";

}
