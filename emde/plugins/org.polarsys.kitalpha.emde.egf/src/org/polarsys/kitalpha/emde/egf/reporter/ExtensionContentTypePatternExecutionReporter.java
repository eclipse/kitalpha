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
package org.polarsys.kitalpha.emde.egf.reporter;

import org.eclipse.egf.emf.pattern.base.ContentTypePatternExecutionReporter;
import org.eclipse.egf.model.pattern.PatternContext;
import org.eclipse.emf.common.util.URI;

/**
 * @author Xavier Maysonnave
 * 
 */
public class ExtensionContentTypePatternExecutionReporter extends ContentTypePatternExecutionReporter {

	@Override
	protected void generateJava(String output, PatternContext context) {
		String targetPath = (String) context.getValue("targetPath"); //$NON-NLS-1$
		String packageName = (String) context.getValue("packageName"); //$NON-NLS-1$
		String className = (String) context.getValue("className"); //$NON-NLS-1$    
		if (targetPath == null) {
			throw new IllegalStateException("Variable targetPath must be set."); //$NON-NLS-1$
		}
		if (packageName == null) {
			throw new IllegalStateException("Variable packageName must be set."); //$NON-NLS-1$
		}
		if (className == null) {
			throw new IllegalStateException("Variable className must be set."); //$NON-NLS-1$
		}
		ExtensionCodegenGeneratorAdapter generator = new ExtensionCodegenGeneratorAdapter(genModel);
		generator.setMergeRulesURI(normalizeAndCheckURI((URI) context.getValue("mergeRulesURI"))); //$NON-NLS-1$
		generator.generateJava(targetPath, packageName, className, output);
	}

}
