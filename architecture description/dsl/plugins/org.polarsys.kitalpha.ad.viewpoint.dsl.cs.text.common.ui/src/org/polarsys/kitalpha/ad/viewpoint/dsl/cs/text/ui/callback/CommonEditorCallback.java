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

package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.callback;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.VerifyListener;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.builder.nature.NatureAddingEditorCallback;
import org.eclipse.xtext.builder.nature.ToggleXtextNatureAction;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.editor.DirtyStateEditorSupport;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import org.eclipse.xtext.validation.IConcreteSyntaxValidator;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.generator.IViewpointSynchronizer;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.ResourceHelper;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.google.inject.Injector;

/**
 * 
 * @author Amine Lajmi
 *
 */


@SuppressWarnings("restriction")
public class CommonEditorCallback extends NatureAddingEditorCallback {
	
	protected Logger logger = Logger.getLogger(CommonEditorCallback.class);
	
	protected XtextEditor currentEditor;
	
	@Inject
	private ToggleXtextNatureAction toggleNature;
	
	@Inject
	private DirtyStateEditorSupport editorSupport;
	
	@Inject
	private Injector injector;
	
	private boolean synchronizing;
	
	private boolean isResourceClean = true;
	
	private Map<String, String> messages = null;
	
	private StringBuffer logMessages = null;
	
	
	@Inject
	private IResourceSetProvider resourceSetProvider;
	
	
	public CommonEditorCallback() {
		synchronizing = false;
	}
	
	public Injector getInjector() {
		return injector;
	}
	
	public IResourceSetProvider getResourceSetProvider() {
		return resourceSetProvider;
	}
	
	@Override
	public void afterCreatePartControl(XtextEditor editor) {
		if (this.currentEditor != editor)
			throw new IllegalStateException(Messages.CommonEditorCallback_MultipleInstancesError);
		editorSupport.initializeDirtyStateSupport(this);	
		IResource resource = editor.getResource();
		if (resource!=null && !toggleNature.hasNature(resource.getProject()) && resource.getProject().isAccessible() && !resource.getProject().isHidden()) {
			toggleNature.toggleNature(resource.getProject());
		}
	}
	
	@Override
	public void beforeDispose(XtextEditor editor) {
		if (this.currentEditor != editor)
			throw new IllegalStateException(Messages.CommonEditorCallback_MultipleInstancesError);
		editorSupport.removeDirtyStateSupport(this);
		this.currentEditor = null;
	}

	@Override
	public boolean onValidateEditorInputState(XtextEditor editor) {
		if (this.currentEditor != editor)
			throw new IllegalStateException(Messages.CommonEditorCallback_MultipleInstancesError);
		return editorSupport.isEditingPossible(this);
	}

	@Override
	public void beforeSetInput(XtextEditor editor) {
		if (this.currentEditor != null) {
			editorSupport.removeDirtyStateSupport(this);
		}
	}

	@Override
	public void afterSetInput(XtextEditor editor) {
		if (this.currentEditor != null) {
			if (this.currentEditor != editor)
				throw new IllegalStateException(Messages.CommonEditorCallback_MultipleInstancesError);
			editorSupport.initializeDirtyStateSupport(this);
		} else {
			this.currentEditor = editor;
		}
	}

	@Override
	public boolean isDirty() {
		return currentEditor.isDirty();
	}

	@Override
	public IXtextDocument getDocument() {
		return currentEditor.getDocument();
	}

	@Override
	public void addVerifyListener(VerifyListener listener) {
		ISourceViewer sourceViewer = currentEditor.getInternalSourceViewer();
		StyledText widget = sourceViewer.getTextWidget();
		widget.addVerifyListener(listener);
	}

	@Override
	public Shell getShell() {
		return currentEditor.getEditorSite().getShell();
	}

	public void removeVerifyListener(VerifyListener listener) {
		ISourceViewer sourceViewer = currentEditor.getInternalSourceViewer();
		StyledText widget = sourceViewer.getTextWidget();
		if (widget != null)
			widget.removeVerifyListener(listener);
	}
	

	
	@Override
	public void afterSave(XtextEditor editor) {
		if (this.currentEditor != editor)
			throw new IllegalStateException(Messages.CommonEditorCallback_MultipleInstancesError);

		if (!synchronizing) {
			final XtextEditor current = editor;
			Runnable runnable = new Runnable() {		
				public void run() {			
					if (!synchronizing) {
						IFile file = (IFile) current.getEditorInput().getAdapter(IFile.class);						

						synchronizing = doSynchronize(file);

						/**
						 * FIXME: Show label only on the vpdesc resournce (see the associated decorator)
						 */
//						IResource standaloneIResource = ResourceHelper.getStandaloneIResource(projectName);
//						if (standaloneIResource != null){

							VpdslModelResourcesManager.addResource(file);


							if (synchronizing){
								VpdslModelResourcesManager.addPersistentProperty(file, "");
							} else {
								VpdslModelResourcesManager.addPersistentProperty(file, "Unsynchronized");
							}
//						}
					}	
				}
			};
			if (runnable != null)
				update(runnable);
		} else {
			synchronizing = false;
		}
		editorSupport.markEditorClean(this);
	}
	
	protected boolean doSynchronize(IFile file) {
		boolean result = false;
		XtextResourceSet resourceSet = getInjector().getInstance(XtextResourceSet.class);
		IViewpointSynchronizer generator = getInjector().getInstance(IViewpointSynchronizer.class);
		String projectName = getProject(file).getName();
		EObject targetObject = ResourceHelper.loadStandaloneResource(resourceSet, projectName);
		if (targetObject!=null) {

			List<EObject> inputObjects = loadInputModels(file, resourceSet);
			
			isResourceClean = true; //reset
			if (validate(inputObjects) && canSynchronize(file, projectName)){

				EObject synchronizedObject = generator.synchronize(inputObjects, targetObject);

				if (synchronizedObject!=null) {
					try {
						final Map<Object, Object> saveOptions = new HashMap<Object, Object>();
						saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED, Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);
						synchronizedObject.eResource().save(saveOptions);
						result = true;
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			} else {
				logger.error(flattenMessages(messages));
				logger.error(logMessages);
			}
		}

		resourceSet.eSetDeliver(false);
		resourceSet.getResources().clear();
		resourceSet.eAdapters().clear();
		
		return result;
	}
	
	
	protected boolean validate(List<EObject> inputObjects) {
		for (EObject current: inputObjects) {
			if (!validate(current))
				return false;
		}
		return true;
	}

	protected boolean validate(EObject object) {
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
	
	protected List<URI> getReferencedAspects(IFile file) {
		//load primary resource in a separate resourceSet
		ResourceSet fakeResourceSet = new ResourceSetImpl();
		List<URI> uris = new ArrayList<URI>();
		EObject viewpoint = ResourceHelper.loadPrimaryResource(file, fakeResourceSet).get(0);
		List<EObject> eCrossReferences = viewpoint.eCrossReferences();
		for (EObject object:eCrossReferences) {
			URI uri = EcoreUtil.getURI(object);
			if (uri.hasFragment())
				uris.add(uri.trimFragment());
		}
		return uris;
	}
	
	public final IProject getProject(IFile file) {
		return file.getProject();
	}
	
	protected void update(Runnable runnable) {
		IWorkbench workbench= PlatformUI.getWorkbench();
		IWorkbenchWindow[] windows= workbench.getWorkbenchWindows();
		if (windows != null && windows.length > 0) {
			Display display= windows[0].getShell().getDisplay();
			display.asyncExec(runnable);
		} else {
			runnable.run();
		}
	}
	
	
	protected boolean canSynchronize(IFile file, String projectName){
		XtextResourceSet resourceSet = getInjector().getInstance(XtextResourceSet.class);
		loadInputModels(file, resourceSet);
		ResourceHelper.loadPrimaryResource(file, resourceSet);
		
		createOrReinitializeMessagesBuffer();
		
		ArrayList<Resource> resources = Lists.newArrayList(resourceSet.getResources());
		for (Resource resource : resources) {
			if (resource.getURI().isPlatformResource() && holdInPoject(resource.getURI(), projectName)){			
				EcoreUtil.resolveAll(resource);
				isResourceClean &= handleXtextResourceErrors(resource);
				isResourceClean &= handleEMFValidationErrors(resource);
			}
		}
		
		resourceSet.eSetDeliver(false);
		resourceSet.getResources().clear();
		resourceSet.eAdapters().clear();
		return isResourceClean;
	}
	
	
	private boolean holdInPoject(URI uri, String projectName) {
		String resourceProjectName = uri.segment(1);
		return (resourceProjectName != null && resourceProjectName.equals(projectName));
	}

	private void createOrReinitializeMessagesBuffer(){
		if (messages == null)
			messages = new HashMap<String, String>();
		else
			messages.clear();
		
		if (logMessages == null)
			logMessages = new StringBuffer();
		else
			logMessages.setLength(0);
	}
	
	private boolean handleEMFValidationErrors(Resource resource) {
		
		EList<EObject> content = resource.getContents();

		org.eclipse.emf.common.util.Diagnostic result = 
				Diagnostician.INSTANCE.validate(EcoreUtil.getRootContainer(content.get(0)));


		if (result.getSeverity() == IStatus.ERROR){
			String wsResourceName = resource.getURI().lastSegment();
			assembleValidationMessages(result, wsResourceName);
			return false;
		}


		return true;
	}

	private void assembleValidationMessages(
			org.eclipse.emf.common.util.Diagnostic result, String resourceName) {
		List<org.eclipse.emf.common.util.Diagnostic> children = result.getChildren();

		if (result != null && !result.getChildren().isEmpty()){
			for (org.eclipse.emf.common.util.Diagnostic diagnostic : children) {
				if (diagnostic.getSeverity() == IStatus.ERROR){
					if (!messages.containsKey(resourceName)){
						messages.put("[" + resourceName + "] ", 
								"contains error after the modifications. See the log error message for more details\n");
					}
					
					logMessages.append("\n[").append(resourceName).append("] ");
					logMessages.append(diagnostic.getMessage());
					logMessages.append("\n");
					assembleValidationMessages(diagnostic, resourceName);
				}
			}
		}
	}

	/**
	 * This method is responsible to check if there are errors in the
	 * resources and collect the messages of the errors.
	 * @param resource to check
	 * @return true if the editor can be saved, otherwise false
	 */
	private boolean handleXtextResourceErrors(Resource resource) {
		EList<org.eclipse.emf.ecore.resource.Resource.Diagnostic> diagnostics = resource.getErrors();

		if (diagnostics != null && !diagnostics.isEmpty()){
			String wsResourceName = resource.getURI().lastSegment();
			assembleMessages(diagnostics, wsResourceName);
			return false;
		}
		return true;
	}

	private void assembleMessages(EList<org.eclipse.emf.ecore.resource.Resource.Diagnostic> errors, String resourceName) {

		for (org.eclipse.emf.ecore.resource.Resource.Diagnostic diagnostic : errors) {
			
			if (!messages.containsKey(resourceName)){
				messages.put("[" + resourceName + "] ", 
						"contains error after the modifications. See the log error for more details\n");
			}
			
			logMessages.append("[").append(resourceName).append("] ");
			logMessages.append(diagnostic.getMessage());
			logMessages.append("\n");
		}
	}
	
	private String flattenMessages(Map<String, String> messages) {
		StringBuffer tmp = new StringBuffer();
		
		for (String key : messages.keySet()) {
			tmp.append(key).append(messages.get(key));
		}
		return tmp.toString();
	}
}
