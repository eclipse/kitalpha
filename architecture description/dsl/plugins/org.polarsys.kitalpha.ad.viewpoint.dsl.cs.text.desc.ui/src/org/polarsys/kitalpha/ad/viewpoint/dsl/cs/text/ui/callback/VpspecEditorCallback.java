/*******************************************************************************
 * Copyright (c) 2014-2016 Thales Global Services S.A.S.
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
import java.util.EventListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.text.contentassist.ContentAssistEvent;
import org.eclipse.jface.text.contentassist.ICompletionListener;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Widget;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.wizards.IWizardDescriptor;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.XtextSourceViewer;
import org.eclipse.xtext.ui.editor.contentassist.ITemplateProposalProvider;
import org.eclipse.xtext.ui.editor.templates.XtextTemplateContextType;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.generator.IViewpointSynchronizer;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.identifiers.WizardIDs;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.ResourceHelper;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.contentassist.VpspecTemplateContextType;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.generators.util.ReferenceUtil;
//decomment the import when the migration has finished
//import org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.generators.util.ReferenceUtil;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.wizards.AbstractWizard;

import com.google.inject.Inject;

/**
 * 
 * @author Amine Lajmi
 * 		   Faycal ABKA
 *
 */
public class VpspecEditorCallback extends CommonEditorCallback {

	private ICompletionListener autoCompletionListener = null;
	
	private Listener autoCompletionSelectionListener = null;
	
	private String selectedProposal = null;
	
	private boolean contentAssistOn = false;
	
	@Inject
	ITemplateProposalProvider templateProvider;
	
	@Inject
	XtextTemplateContextType contextType;
	
	@Override
	public void afterCreatePartControl(XtextEditor editor) {
		super.afterCreatePartControl(editor);
		installCompletionListener();
		if (contextType instanceof VpspecTemplateContextType)
			addListener((VpspecTemplateContextType)contextType);
	}
	
	private void installCompletionListener() {
		if (getCurrentEditor() != null) {
			XtextSourceViewer viewer = (XtextSourceViewer) getCurrentEditor().getInternalSourceViewer();
			autoCompletionListener = new ICompletionListener() {
				public void selectionChanged(ICompletionProposal proposal, boolean smartToggle) {
					selectedProposal = proposal.getDisplayString();
				}
				public void assistSessionStarted(ContentAssistEvent event) {
					contentAssistOn = true;
				}
				public void assistSessionEnded(ContentAssistEvent event) {
					if (selectedProposal!=null) {
						applySelectedProposal();
						selectedProposal = null;
					}
					contentAssistOn = false;
				}
			};			
			viewer.getContentAssistantFacade().addCompletionListener(autoCompletionListener);				
			/*
			 * ICompletionProposal.selectionChanged(...) is not called when a proposal is selected using the mouse 
			 * @see https://bugs.eclipse.org/bugs/show_bug.cgi?id=316745 (non-Javadoc)
			 * @see org.eclipse.jface.text.contentassist.ICompletionListener#selectionChanged(org.eclipse.jface.text.contentassist.ICompletionProposal, boolean)
			 */
			autoCompletionSelectionListener = new Listener() {
				@Override
				public void handleEvent(Event event) {
					if (contentAssistOn) {
						Widget item = event.item;
						if (item instanceof TableItem) {
							selectedProposal = ((TableItem)item).getText();
						}
					}
				}
			};		
			viewer.getControl().getDisplay().addFilter(SWT.Selection, autoCompletionSelectionListener);
		}
	}
	
	private void applySelectedProposal() {
		String wizardId = getWizardFromProposal();
		if (wizardId!=null) {
			String fileName = openWizard(wizardId);
			notifyResolvers(fileName);
		}
	}
	
	private final List<AspectAddedListener> listeners = new ArrayList<AspectAddedListener>();
	
	public void addListener(AspectAddedListener list) {
		listeners.add(list);
	}

	public void removeListener(EventListener list) {
		listeners.remove(list);
	}

	public interface AspectAddedListener extends EventListener {
		void notifyResolver(String proposal);
	}
	
	protected void notifyResolvers(String fileName) {		
		for (AspectAddedListener list : listeners){
			list.notifyResolver(fileName);
		}
	}

	public String openWizard(String id) {
		IWizardDescriptor descriptor = PlatformUI.getWorkbench().getNewWizardRegistry().findWizard(id);
		try {
			if (descriptor != null) {
				IWizard wizard = descriptor.createWizard();
				if (wizard instanceof AbstractWizard) {
					AbstractWizard wiz = (AbstractWizard) wizard;
					Object[] segments = new Object[1];
					segments[0] = (IFile) getCurrentEditor().getEditorInput().getAdapter(IFile.class);
					TreeSelection selection = new TreeSelection(new TreePath(segments));				
					wiz.init(PlatformUI.getWorkbench(), selection);
					final Display display = PlatformUI.getWorkbench().getDisplay();
					WizardDialog wizardDialog = new WizardDialog(display.getActiveShell(), wiz);
					wizardDialog.setTitle(wiz.getWindowTitle());
					wizardDialog.open();
					int returnCode = wizardDialog.getReturnCode();
					return (returnCode==0 ? wiz.getFileName() : null);
				}
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void beforeDispose(XtextEditor editor) {
		super.beforeDispose(editor);
		uninstallCompletionListener();
		removeListener((VpspecTemplateContextType)contextType);
	}

	@Override
	protected boolean doSynchronize(IFile file) {
		boolean result = false;
		XtextResourceSet resourceSet = getInjector().getInstance(XtextResourceSet.class);
		IViewpointSynchronizer generator = getInjector().getInstance(IViewpointSynchronizer.class);
		String projectName = getProject(file).getName();
		EObject targetObject = ResourceHelper.loadStandaloneResource(resourceSet, projectName);
		if (targetObject!=null) {
			Viewpoint targetVp = (Viewpoint) targetObject;		
			List<EObject> resourceEObjects = ResourceHelper.validateAndloadResource(file, resourceSet);
			if (!resourceEObjects.isEmpty()){
				EObject primaryResourceRoot = resourceEObjects.get(0);
				if (primaryResourceRoot instanceof org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint) {
					org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint sourceVp = (org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint)primaryResourceRoot;
					initTargetViewpoint(sourceVp, targetVp);
					ReferenceUtil.setTargetReferences(sourceVp, targetVp, resourceSet);
				}

				List<EObject> inputObjects = loadInputModels(file, resourceSet);

				if (validate(inputObjects)){
					EObject synchronizedObject = generator.synchronize(inputObjects, targetVp);

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
				}
			}
		} else {
			System.err.println("Error Loading standalone resource");
		}
		resourceSet.eSetDeliver(false);
		resourceSet.getResources().clear();
		resourceSet.eAdapters().clear();
		return result;
	}
	
	private void initTargetViewpoint(org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.vpspec.Viewpoint source, Viewpoint target){
		if (source != null && target != null){
			target.setName(source.getName());
			target.setShortName(source.getShortName());
		}
	}
	
	private void uninstallCompletionListener() {
		if (getCurrentEditor()!=null) {
			XtextSourceViewer viewer = (XtextSourceViewer) getCurrentEditor().getInternalSourceViewer();
			viewer.getContentAssistantFacade().removeCompletionListener((ICompletionListener) autoCompletionListener);	
			viewer.getControl().getDisplay().removeFilter(SWT.Selection, autoCompletionSelectionListener);
		}
	}
	
	private String getWizardFromProposal() {
		if (selectedProposal.equals(VpspecMessages.VpspecEditorCallback_NewBuild)) {
			return WizardIDs.NEW_BUILD_WIZARD;
		}
		if (selectedProposal.equals(VpspecMessages.VpspecEditorCallback_NewConfiguration)) {
			return WizardIDs.NEW_CONF_WIZARD;
		}
		if (selectedProposal.equals(VpspecMessages.VpspecEditorCallback_NewData)) {
			return WizardIDs.NEW_DATA_WIZARD;
		}
		if (selectedProposal.equals(VpspecMessages.VpspecEditorCallback_NewDiagrams)) {
			return WizardIDs.NEW_DIAGRAM_WIZARD;
		}
		if (selectedProposal.equals(VpspecMessages.VpspecEditorCallback_NewServices)) {
			return WizardIDs.NEW_SERVICES_WIZARD;
		}
		if (selectedProposal.equals(VpspecMessages.VpspecEditorCallback_NewUserInterface)) {
			return WizardIDs.NEW_UI_WIZARD;
		}
		if (selectedProposal.equals(VpspecMessages.VpspecEditorCallback_newActivityExplorer))
			return WizardIDs.NEW_ACTIVITY_EXPLORER_WIZARD;
		return null;
	}
}
