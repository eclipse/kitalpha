/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.common.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.codegen.merge.java.JControlModel;
import org.eclipse.emf.codegen.merge.java.JMerger;
import org.eclipse.emf.codegen.merge.java.facade.FacadeHelper;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.osgi.framework.Bundle;

/**
 * @author Boubekeur Zendagui
 */

public class JavaMerger {
	
	private static final String AST_FACADE_HELPER_CLASS = "org.eclipse.emf.codegen.merge.java.facade.ast.ASTFacadeHelper";
	
	private static final String EMF_PLUGIN_ID ="org.eclipse.emf.codegen.ecore";
	private static final String SCHEMAT_PATH ="templates/emf-merge.xml";
	/**
	 * This create a JControl Model
	 * @return a control model @see JControlModel
	 */
	private static JControlModel getControlModel(){
		final Bundle bundle = Platform.getBundle(EMF_PLUGIN_ID);
		final URL url = FileLocator.find(bundle, new Path(SCHEMAT_PATH), Collections.EMPTY_MAP);
		JControlModel jControlModel = new JControlModel();
		FacadeHelper facadeHelper = CodeGenUtil.instantiateFacadeHelper(AST_FACADE_HELPER_CLASS); 
		jControlModel.initialize(facadeHelper, url.toString());
		return jControlModel;
	}
	
	/**
	 * This fire Java code merge. The new code is provided by the generated 
	 * parameter, it will be merged with the content of the target IFile 
	 * parameter.
	 * @param target the IFile containing the old Java code. 
	 * @param generated the new generated Java code
	 * @return Merged Java code
	 * @throws FileNotFoundException
	 */
	public static String doMerge(IFile target, String generated) 
	throws FileNotFoundException{
		JControlModel controlModel = getControlModel();
		JMerger merger = new JMerger(controlModel);
		merger.setSourceCompilationUnit(merger.createCompilationUnitForContents(generated));
		FileInputStream targetFileInputStream = new FileInputStream(target.getLocation().toFile());
		merger.setTargetCompilationUnit(merger.createCompilationUnitForInputStream(targetFileInputStream));
		merger.merge();
		return merger.getTargetCompilationUnitContents();
	}
}
