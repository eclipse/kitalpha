/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.generators.actions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.actions.BaseSelectionListenerAction;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.validation.IConcreteSyntaxValidator;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.generator.IViewpointSynchronizer;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.FileExtension;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.ResourceHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.generators.Messages;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.generators.setup.BackwardSynchronizerSetup;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.generators.util.ReferenceUtil;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.google.inject.Injector;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.VpdescFactory;

/**
 * 
 * @author Amine Lajmi
 *
 */
public class SynchronizerAction extends BaseSelectionListenerAction implements IObjectActionDelegate {

	private ISelection selection;
	
	@Inject
	private Injector injector;
	
	private Injector getInjector() {
		if (injector==null) {
			injector = new BackwardSynchronizerSetup().createInjectorAndDoEMFRegistration();
		}
		return injector;
	}
	
	public SynchronizerAction() {
		super(Messages.ViewpointDSLActions_BackwardSynchronizer_GeneratorMessage);
	}
	
	protected SynchronizerAction(String text) {
		super(text);
	}

	public void run(IAction action) {
		IStructuredSelection structuredSelection = (IStructuredSelection)selection;
		Object obj = structuredSelection.getFirstElement();
		IFile file = (IFile) Platform.getAdapterManager().getAdapter(obj, IFile.class);	
		doSynchronize(file);
	}
	
	protected boolean doSynchronize(IFile file) {
		boolean result = false;
		XtextResourceSet resourceSet = getInjector().getInstance(XtextResourceSet.class);
		EObject textRoot = ResourceHelper.loadResource(file, new ResourceSetImpl()).get(0);
		if (textRoot!=null) {
			XtextResource resource = (XtextResource)textRoot.eResource();
			IResourceServiceProvider resourceServiceProvider = resource.getResourceServiceProvider();
			IViewpointSynchronizer generator = resourceServiceProvider.get(IViewpointSynchronizer.class);
			String projectName = file.getProject().getName();
			Resource targetResource = loadTargetModel(resourceSet, projectName);
			Viewpoint viewpoint = (Viewpoint) targetResource.getContents().get(0);
			List<EObject> inputObjects = loadInputModels(file, resourceSet);
			if (validate(inputObjects)) {
				EObject synchronizedObject = generator.synchronize(inputObjects, viewpoint);
				if (synchronizedObject !=null) {
					try {
						final Map<Object, Object> saveOptions = new HashMap<Object, Object>();
						saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED, Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);
						synchronizedObject.eResource().save(saveOptions);
						result = true;
					} catch (IOException e) {
						e.printStackTrace();
					}		
				}
			}
		}
		resourceSet.eSetDeliver(false);
		resourceSet.getResources().clear();
		resourceSet.eAdapters().clear();
		return result;
	}

	protected Resource loadTargetModel(ResourceSet resourceSet, String projectName) {
		URI uri = ResourceHelper.getStandaloneResourceURI(projectName);
		boolean exists = resourceSet.getURIConverter().exists(uri, null);
		if (!exists || uri==null) {
			org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint viewpoint = (org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint) ResourceHelper.loadPrimaryResource(projectName, resourceSet).get(0);
			String shortName = viewpoint.getShortName().replaceAll("\"", "");
			if (shortName ==null)
				return null;
			uri = ResourceHelper.computeURI(projectName, shortName, FileExtension.VPDESC_EXTENSION);
			Resource resource = resourceSet.createResource(uri);
			Viewpoint target = VpdescFactory.eINSTANCE.createViewpoint();
			//set minimum set of attributes
			target.setShortName(shortName);
			target.setName(shortName);
			//update inter-viewpoint references
			ReferenceUtil.setTargetReferences(viewpoint, target, resourceSet);		
			resource.getContents().add(target);
			//PluginUtil.updatePluginXml(projectName, shortName, resource.getURI());
			return resource;
		} 
		return resourceSet.getResource(uri, true);
	}

	private boolean validate(List<EObject> inputObjects) {
		for (EObject current: inputObjects) {
			if (!validate(current))
				return false;
		}
		return true;
	}
	
	private boolean validate(EObject object) {
		List<Diagnostic> diagnostics = new ArrayList<Diagnostic>();
		IConcreteSyntaxValidator concreteSyntaxValidator = ((XtextResource)object.eResource()).getConcreteSyntaxValidator();
		concreteSyntaxValidator.validateRecursive(object, new IConcreteSyntaxValidator.DiagnosticListAcceptor(diagnostics), new HashMap<Object, Object>());
		if (!diagnostics.isEmpty()) {
			return false;
		}
		return true;
	}
	
	protected List<EObject> loadInputModels(IFile file, ResourceSet resourceSet) {
		Iterable<EObject> inputModels = Collections.emptyList();
		inputModels = Iterables.concat(inputModels, ResourceHelper.loadDataResource(file, resourceSet));
		inputModels = Iterables.concat(inputModels, ResourceHelper.loadConfigurationResource(file, resourceSet));
		inputModels = Iterables.concat(inputModels, ResourceHelper.loadUIResource(file, resourceSet));
		inputModels = Iterables.concat(inputModels, ResourceHelper.loadDiagramResource(file, resourceSet));
		inputModels = Iterables.concat(inputModels, ResourceHelper.loadBuildResource(file, resourceSet));
		inputModels = Iterables.concat(inputModels, ResourceHelper.loadServicesResource(file, resourceSet));
		return Lists.newArrayList( inputModels );
	}
	
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
	}

	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		selection = targetPart.getSite().getWorkbenchWindow().getSelectionService().getSelection();		
	}
}
