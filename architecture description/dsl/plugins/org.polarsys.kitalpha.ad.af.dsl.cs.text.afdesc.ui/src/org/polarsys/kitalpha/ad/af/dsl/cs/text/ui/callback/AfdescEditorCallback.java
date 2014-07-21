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

package org.polarsys.kitalpha.ad.af.dsl.cs.text.ui.callback;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
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
import org.eclipse.xtext.ui.editor.DirtyStateEditorSupport;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import org.eclipse.xtext.validation.IConcreteSyntaxValidator;
import org.polarsys.kitalpha.ad.af.dsl.services.cs.text.generators.Synchronizer;

import com.google.inject.Inject;
import com.google.inject.Injector;

/**
 * 
 * @author Amine Lajmi
 *
 */
@SuppressWarnings("restriction")
public class AfdescEditorCallback extends NatureAddingEditorCallback {
	
	protected XtextEditor currentEditor;
	
	@Inject
	private ToggleXtextNatureAction toggleNature;
	
	@Inject
	private DirtyStateEditorSupport editorSupport;
	
	@Inject
	private Injector injector;
	
	private boolean synchronizing;
	
	@Inject
	private IResourceSetProvider resourceSetProvider;
	
	public AfdescEditorCallback() {
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
			throw new IllegalStateException(Messages.AfdescEditorCallback_MultipleInstancesError);
		editorSupport.initializeDirtyStateSupport(this);	
		IResource resource = editor.getResource();
		if (resource!=null && !toggleNature.hasNature(resource.getProject()) && resource.getProject().isAccessible() && !resource.getProject().isHidden()) {
			toggleNature.toggleNature(resource.getProject());
		}
	}
	
	@Override
	public void beforeDispose(XtextEditor editor) {
		if (this.currentEditor != editor)
			throw new IllegalStateException(Messages.AfdescEditorCallback_MultipleInstancesError);
		editorSupport.removeDirtyStateSupport(this);
		this.currentEditor = null;
	}

	@Override
	public boolean onValidateEditorInputState(XtextEditor editor) {
		if (this.currentEditor != editor)
			throw new IllegalStateException(Messages.AfdescEditorCallback_MultipleInstancesError);
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
				throw new IllegalStateException(Messages.AfdescEditorCallback_MultipleInstancesError);
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

	@Override
	public void removeVerifyListener(VerifyListener listener) {
		ISourceViewer sourceViewer = currentEditor.getInternalSourceViewer();
		StyledText widget = sourceViewer.getTextWidget();
		if (widget != null)
			widget.removeVerifyListener(listener);
	}

	
	@Override
	public void afterSave(XtextEditor editor) {
		if (this.currentEditor != editor)
			throw new IllegalStateException(Messages.AfdescEditorCallback_MultipleInstancesError);
		if (!synchronizing) {
			final XtextEditor current = editor;
			Runnable runnable = new Runnable() {		
				public void run() {			
					if (!synchronizing) {
						doSynchronize((IFile) current.getEditorInput().getAdapter(IFile.class));
						synchronizing = true;
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
		Synchronizer synchronizer = new Synchronizer();
		return synchronizer.doSynchronize(file);
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
}
