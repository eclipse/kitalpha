/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.ad.af.dsl.services.cs.text.generators;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.validation.IConcreteSyntaxValidator;
import org.polarsys.kitalpha.ad.af.dsl.as.model.afdesc.ArchitectureFramework;
import org.polarsys.kitalpha.ad.af.dsl.services.cs.text.generators.messages.Messages;
import org.polarsys.kitalpha.ad.af.dsl.services.cs.text.generators.util.AfdslGeneratorsUtil;

/**
 * 
 * @author Amine Lajmi
 *
 */
public class BackwardSynchronizer {

	private static final String AFTEXT_EXTENSION = "aftext";
	
	private Resource afdescResource;
	
	private XtextResource aftextResource;
	
	public BackwardSynchronizer() {}
	
	public void backwardSynchronize(IFile file) {
		IPath emfResourcePath = file.getFullPath();
		URI emfUri = AfdslGeneratorsUtil.URIFix.createPlatformResourceURI(emfResourcePath.toString(), true);	
		ResourceSet resourceSet = new ResourceSetImpl();
		afdescResource = resourceSet.getResource(emfUri, true);
		ArchitectureFramework modelRoot = (ArchitectureFramework) afdescResource.getContents().get(0);
		if (modelRoot !=null) {
			EcoreUtil.resolveAll(modelRoot);
			IPath xtextResourcePath = file.getFullPath().removeFileExtension().addFileExtension(AFTEXT_EXTENSION);
			URI xtextUri = AfdslGeneratorsUtil.URIFix.createPlatformResourceURI(xtextResourcePath.toString(), true);
			aftextResource = (XtextResource) resourceSet.createResource(xtextUri);	
			initializeAftextResource(modelRoot);
		}
		resourceSet.eSetDeliver(false);
		resourceSet.getResources().clear();
		resourceSet.eAdapters().clear();
	}
	
	private void initializeAftextResource(EObject rootObject) {
		EcoreUtil.resolveAll(rootObject);
		EObject clone = EcoreUtil.copy(rootObject);
		if (validateObject(clone)) {
			aftextResource.getContents().add(clone);
			String serializationContent = aftextResource.getSerializer().serialize(clone);
			String newContent = getHeaderComment(rootObject) + serializationContent;
			try {
				final Map<Object, Object> saveOptions = new HashMap<Object, Object>();
				saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED, Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);
				aftextResource.reparse(newContent);
				aftextResource.save(saveOptions);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			MessageDialog.openInformation(null, "Aftext Backward Synchronizer", Messages.AFDSLActions_BackwardSynchronizer_SerializationException);
		}
	}

	private boolean validateObject(EObject object) {
		List<Diagnostic> diagnostics = new ArrayList<Diagnostic>();
		IConcreteSyntaxValidator concreteSyntaxValidator = aftextResource.getConcreteSyntaxValidator();
		concreteSyntaxValidator.validateRecursive(object, new IConcreteSyntaxValidator.DiagnosticListAcceptor(diagnostics), new HashMap<Object, Object>());
		if (!diagnostics.isEmpty()) {
			return false;
		}
		return true;
	}
	
	public static String getCurrentYear(){
		return String.valueOf(Calendar.getInstance().get(Calendar.YEAR));
	}
	
	private static String getHeaderComment(EObject root) {
		String fileHeader = null;
		if (root instanceof ArchitectureFramework) {
			ArchitectureFramework afRoot = (ArchitectureFramework) root;
			fileHeader = 
				"/**\n" + 
				" * Copyright (c) " + AfdslGeneratorsUtil.COPYRIGHT_KITALPHA + ", " + getCurrentYear() + ". All rights reserved. \n" +
				" *\n" +
				" *	Architecture Framework " + afRoot.getShortName() + "\n" +
				" *	@author: " + AfdslGeneratorsUtil.getCurrentUserName() + "\n" +
				" *	@date: " + AfdslGeneratorsUtil.getCurrentDate()+"\n" +
				" *\n" +
				" */\n";
		} 
		return fileHeader;
	}
}
