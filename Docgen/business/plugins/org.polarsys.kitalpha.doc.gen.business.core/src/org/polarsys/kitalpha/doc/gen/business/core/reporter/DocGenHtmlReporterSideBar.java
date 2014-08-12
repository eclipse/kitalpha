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

	public void loopFinished(String output, String outputWithCallBack,
			PatternContext context, Map<String, Object> parameterValues) {
		MonitorServices.addTotalCount(1);
		MonitorServices.workSubMonitor("Generating side bar elements");
	}

}
