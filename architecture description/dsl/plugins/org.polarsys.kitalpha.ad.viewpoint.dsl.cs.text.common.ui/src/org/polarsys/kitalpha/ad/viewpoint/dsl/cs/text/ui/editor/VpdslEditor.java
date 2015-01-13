package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.editor;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
//import org.eclipse.ui.texteditor.EditorMessages;
import org.eclipse.ui.texteditor.IDocumentProvider;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.IExternalContentSupport;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.resource.IExternalContentSupport.IExternalContentProvider;
import org.eclipse.xtext.ui.editor.CompoundXtextEditorCallback;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import org.eclipse.xtext.util.IResourceScopeCache;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.callback.Messages;
import com.google.inject.Inject;
import com.google.inject.Injector;

/**
 * 
 * @author Faycal Abka
 *
 */
public abstract class VpdslEditor extends XtextEditor {
	
	private static Logger logger = Logger.getLogger(VpdslEditor.class);	
	
	private boolean isResourceClean = true;
	private Map<String, String> messages = null;
	private StringBuffer logMessages = null;
	
	@Inject
	private CompoundXtextEditorCallback callback;
	
	@Inject
	IExternalContentProvider s;
	
	public VpdslEditor() {
	}
	
	
	public boolean canSave(){
		String project = getResource().getProject().getFullPath().toString();
		
		ResourceSet resourceSet = new ResourceSetImpl();
		Collection<XtextResource> openedEditorResources = new HashSet<XtextResource>();
		
		EditorHelper.getAllResourcesOfOpenedEditors(project, openedEditorResources);
		EditorHelper.copyResourceContentsInResourceSet(openedEditorResources, resourceSet);
		EditorHelper.getResourcesOfClosedEditors(project, resourceSet);
		EcoreUtil2.resolveAll(resourceSet);
		
		createOrReinitializeMessagesBuffer();
		
		for (Resource resource : resourceSet.getResources()) {
			if (!resource.isLoaded()){
				try {
					resource.load(Collections.emptyMap());
				} catch (IOException e) {
					return false;
				}
			}
			
			isResourceClean &= handleXtextResourceErrors(resource);
			isResourceClean &= handleEMFValidationErrors(resource);
		}
		
		resourceSet.eSetDeliver(false);
		resourceSet.getResources().clear();
		resourceSet.eAdapters().clear();
		
		return isResourceClean;
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
		EList<Diagnostic> diagnostics = resource.getErrors();

		if (diagnostics != null && !diagnostics.isEmpty()){
			String wsResourceName = resource.getURI().lastSegment();
			assembleMessages(diagnostics, wsResourceName);
			return false;
		}
		return true;
	}

	private void assembleMessages(EList<Diagnostic> errors, String resourceName) {

		for (Diagnostic diagnostic : errors) {
			
			if (!messages.containsKey(resourceName)){
				messages.put("[" + resourceName + "] ", 
						"contains error after the modifications. See the log error for more details\n");
			}
			
			logMessages.append("[").append(resourceName).append("] ");
			logMessages.append(diagnostic.getMessage());
			logMessages.append("\n");
		}
	}
	
	private void logAndShowErrors(){
		Display.getDefault().syncExec(new Runnable() {
			@Override
			public void run() {
				String userMsg = flattenMessages(messages);
				IStatus status = new Status(IStatus.ERROR, getPluginId(), userMsg);
				ErrorDialog.openError(getEditorSite().getShell(), getDialogTitleWithAspectName(), Messages.commonEditor_SaveError, status); //$NON-NLS-1$
			}

			private String flattenMessages(Map<String, String> messages) {
				StringBuffer tmp = new StringBuffer();
				
				for (String key : messages.keySet()) {
					tmp.append(key).append(messages.get(key));
				}
				return tmp.toString();
			}
		});
		
		logger.error(logMessages.toString());
	}
	
	@Override
	public void doSaveAs(){
		performSaveAs(getProgressMonitor());
		if (canSave())
			callback.afterSave(this);
		
//		if (canSave()){
//			super.doSaveAs();
//		} else {
//			//FIXME show once if save all.
//			logAndShowErrors();
//		}
	}

	@Override
	public void doSave(IProgressMonitor progressMonitor){
		
		IDocumentProvider p= getDocumentProvider();
		if (p == null)
			return;

		if (p.isDeleted(getEditorInput())) {

			if (isSaveAsAllowed()) {

				performSaveAs(progressMonitor);

			} else {

				Shell shell= getSite().getShell();
				String title= "EditorMessages.Editor_error_save_deleted_title";
				String msg= "EditorMessages.Editor_error_save_deleted_message";
				MessageDialog.openError(shell, title, msg);
			}

		} else {
			updateState(getEditorInput());
			validateState(getEditorInput());
			performSave(false, progressMonitor);
		}
		
		if (canSave())
			callback.afterSave(this);
//		
//		isResourceClean = true;
//		if (canSave()){
//			super.doSave(progressMonitor);
//		} else {
//			//FIXME show once if save all.
//			logAndShowErrors();
//		}
	}
	
	
	public abstract String getDialogTitleWithAspectName();
	
	/**
	 * @return the plugin id which implements the aspect
	 */
	public abstract String getPluginId();
	
}
