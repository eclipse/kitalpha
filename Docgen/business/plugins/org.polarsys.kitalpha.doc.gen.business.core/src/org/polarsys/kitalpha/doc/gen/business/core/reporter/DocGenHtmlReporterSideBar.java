/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.doc.gen.business.core.reporter;

import java.util.Map;

import org.eclipse.egf.model.pattern.PatternContext;
import org.eclipse.egf.model.pattern.PatternExecutionReporter;
import org.polarsys.kitalpha.doc.gen.business.core.util.DocGenHtmlConstants;
import org.polarsys.kitalpha.doc.gen.business.core.util.DocGenHtmlUtil;
import org.polarsys.kitalpha.doc.gen.business.core.util.MonitorServices;


/**
 * @author Benoit Langlois
 * 
 */

public class DocGenHtmlReporterSideBar implements PatternExecutionReporter {

	@Override
	public void executionFinished(String output, PatternContext context) {

		String projectName = (String) context
				.getValue(DocGenHtmlConstants.PROJECT_NAME_CONTRACT);
		String outputFolder = (String) context
				.getValue(DocGenHtmlConstants.OUTPUT_FOLDER_CONTRACT);

		DocGenHtmlUtil.writeFilePatternContent(
				DocGenHtmlConstants.SIDEBAR_FILENAME, projectName,
				outputFolder, output);
		MonitorServices.resetCurrentCount();
	}

	@Override
	public void loopFinished(String output, String outputWithCallBack,
			PatternContext context, Map<String, Object> parameterValues) {
		MonitorServices.addTotalCount(1);
		MonitorServices.workSubMonitor("Generating side bar elements");
	}

}
