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
 *******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.ui.dialogs;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IEditorRegistry;
import org.eclipse.ui.IURIEditorInput;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.osgi.framework.Bundle;
import org.polarsys.kitalpha.ad.common.AD_Log;

public class EditorHelper {
	
	private static final URI ROOT_URI = URI.createURI("//#"); //$NON-NLS-1$

	public static void setSelectionToViewer(IEditorPart part, List<EObject> eObjects) {
		// Do we have something to process
		if (eObjects == null || eObjects.isEmpty()) {
			return;
		}
		// Select
		invokeSetSelectionToViewer(part, new Object[] { eObjects }); //$NON-NLS-1$ //$NON-NLS-2$
	}

	public static void setSelectionToViewer(IEditorPart part, URI uri) {
		// Do we have something to process
		if (uri == null || !uri.hasFragment()) {
			return;
		}
		// Whether or not could we have an EditingDomain
		if (!(part instanceof IEditingDomainProvider)) {
			return;
		}
		EditingDomain editingDomain = ((IEditingDomainProvider) part).getEditingDomain();
		// Process URI
		EObject eObject = editingDomain.getResourceSet().getEObject(uri, true);
		if (eObject == null) {
			return;
		}
		// Select
		invokeSetSelectionToViewer(part, new Object[] { Collections.singletonList(eObject) }); //$NON-NLS-1$ //$NON-NLS-2$
	}
	
	private static void invokeSetSelectionToViewer(IEditorPart part, Object[] params) {
		invokeMethod(part, "java.util.Collection", "setSelectionToViewer", params); //$NON-NLS-1$ //$NON-NLS-2$
	}
	
	private static void invokeMethod(IEditorPart part, String className, String methodName, Object[] params) {
		try {
			Class<?>[] types = new Class[] { Class.forName(className) }; //$NON-NLS-1$              
			Method method = part.getClass().getMethod(methodName, types); //$NON-NLS-1$
			if (method != null) {
				method.invoke(part, params);
			}
		} catch (IllegalAccessException 	| 
				IllegalArgumentException 	| 
				InvocationTargetException	|
				ClassNotFoundException		|
				NoSuchMethodException t) {
			AD_Log.getDefault().logError(t);
		}
	}

	public static void openEditorsAndSelect(Map<Resource, List<EObject>> resources) {
		// is there something to select
		if (resources.isEmpty()) {
			return;
		}
		for (Iterator<Map.Entry<Resource, List<EObject>>> it = resources.entrySet().iterator(); it.hasNext();) {
			try {
				Map.Entry<Resource, List<EObject>> entry = it.next();
				// Try to use a URIConverter to normalize such URI
				// if we have a platform:/plugin/ we need a platform:/resource/
				// if any
				// to have a chance to use a FileEditorInput rather than an
				// URIEditorInput
				Resource resource = entry.getKey();
				URI uri = resource.getURI();
				if (uri != null && resource.getResourceSet() != null) {
					URIConverter converter = resource.getResourceSet().getURIConverter();
					if (converter != null) {
						uri = converter.normalize(uri);
					}
				}
				IEditorPart editorPart = openEditor(uri);
				if (editorPart != null) {
					setSelectionToViewer(editorPart, entry.getValue());
				}
			} catch (PartInitException t) {
				AD_Log.getDefault().logError(t);
			}
		}
	}

	public static String computeEditorId(String fileName) {
		IWorkbench workbench = PlatformUI.getWorkbench();
		IEditorRegistry editorRegistry = workbench.getEditorRegistry();
		IEditorDescriptor descriptor = editorRegistry.getDefaultEditor(fileName);
		if (descriptor != null) {
			return descriptor.getId();
		}
		return "org.eclipse.ui.DefaultTextEditor";
	}

	public static IEditorInput getEditorInput(URI uri) {
		if (uri == null || uri.isEmpty() || ROOT_URI.equals(uri)) { 
			return null;
		}
		if (uri.isPlatformResource()) {
			String path = uri.toPlatformString(true);
			IResource resource = ResourcesPlugin.getWorkspace().getRoot().findMember(new Path(path));
			if (resource instanceof IFile) {
				return EclipseUtil.createFileEditorInput((IFile) resource);
			}
		}
		return new URIEditorInput(uri.trimFragment());
	}

	/**
	 * Opens the default editor for the resource that contains the specified
	 * EObject.
	 */
	public static IEditorPart openEditor(URI uri) throws PartInitException {
		if (uri == null) {
			return null;
		}
		IEditorPart part = restoreAlreadyOpenedEditor(uri, null, true);
		if (part != null) {
			return part;
		}
		IEditorInput editorInput = null;
		if (uri.isPlatformResource()) {
			String path = uri.toPlatformString(true);
			IResource resource = ResourcesPlugin.getWorkspace().getRoot().findMember(new Path(path));
			if (resource instanceof IFile) {
				editorInput = EclipseUtil.createFileEditorInput((IFile) resource);
				return openEditor(editorInput, URI.createPlatformPluginURI(resource.getFullPath().toString(), false));
			}
		}
		return openEditor(new URIEditorInput(uri.trimFragment()), uri);
	}

	/**
	 * Opens the default editor for the resource that contains the specified
	 * EObject.
	 */
	public static IEditorPart openEditor(URI uri, String editorId) throws PartInitException {
		if (uri == null) {
			return null;
		}
		IEditorPart part = restoreAlreadyOpenedEditor(uri, editorId, true);
		if (part != null) {
			return part;
		}
		IEditorInput editorInput = null;
		if (uri.isPlatformResource()) {
			String path = uri.toPlatformString(true);
			IResource resource = ResourcesPlugin.getWorkspace().getRoot().findMember(new Path(path));
			if (resource instanceof IFile) {
				editorInput = EclipseUtil.createFileEditorInput((IFile) resource);
				return openEditor(editorInput, URI.createPlatformPluginURI(resource.getFullPath().toString(), false), editorId);
			}
		}
		return openEditor(new URIEditorInput(uri.trimFragment()), uri, editorId);
	}

	public static IEditorPart openEditor(IEditorInput input, URI uri) throws PartInitException {
		return openEditor(input, uri, null);
	}

	public static IEditorPart openEditor(IEditorInput input, URI uri, String editorId) throws PartInitException {
		if (input == null || uri == null) {
			return null;
		}
		IEditorPart part = restoreAlreadyOpenedEditor(uri, editorId, true);
		if (part != null) {
			return part;
		}
		IWorkbench workbench = PlatformUI.getWorkbench();
		IWorkbenchPage page = workbench.getActiveWorkbenchWindow().getActivePage();
		return page.openEditor(input, editorId != null ? editorId : computeEditorId(uri.trimFragment().lastSegment()), true, IWorkbenchPage.MATCH_NONE);
	}

	public static boolean isAlreadyOpenedEditor(URI uri) {
		if (uri == null) {
			return false;
		}
		return restoreAlreadyOpenedEditor(uri, null, false) != null ? true : false;
	}

	private static IEditorPart restoreAlreadyOpenedEditor(URI uri, String editorId, boolean activate) {
		if (uri == null) {
			return null;
		}
		URI uriToCheck = uri.trimFragment();
		IWorkbench workbench = PlatformUI.getWorkbench();
		if (workbench == null) {
			return null;
		}
		for (IWorkbenchWindow window : workbench.getWorkbenchWindows()) {
			for (IWorkbenchPage innerPage : window.getPages()) {
				for (IEditorReference reference : innerPage.getEditorReferences()) {
					try {
						IEditorInput editorInput = reference.getEditorInput();
						if (editorInput != null) {
							URI editorInputURI = EditorHelper.getURI(editorInput);
							if (editorInputURI != null && editorInputURI.equals(uriToCheck)) {
								IEditorPart part = reference.getEditor(true);
								if (editorId != null && !editorId.equals(part.getEditorSite().getId()) ) {
									continue;
								}
								if (activate) {
									window.setActivePage(innerPage);
									innerPage.activate(part);
									part.setFocus();
								}
								return part;
							}
						}
					} catch (PartInitException pie) {
						// Just Ignore
					}
				}
			}
		}
		return null;
	}

	public static URI getURI(IEditorInput editorInput) {
		URI result = null;
		if (EMFPlugin.IS_ECLIPSE_RUNNING) {
			result = EclipseUtil.getURI(editorInput);
		}
		if (result == null) {
			if (editorInput instanceof URIEditorInput) {
				result = ((URIEditorInput) editorInput).getURI().trimFragment();
			} else {
				result = URI.createURI(editorInput.getName());
			}
		}
		return result;
	}

	private EditorHelper() {
		super();
	}

	public static class EclipseUtil {

		static final Class<?> FILE_CLASS;

		static {
			Class<?> fileClass = null;
			try {
				fileClass = IFile.class;
			} catch (Throwable exception) {
				// Ignore any exceptions and assume the class isn't available.
			}
			FILE_CLASS = fileClass;
		}

		static final Class<?> FILE_REVISION_CLASS;

		static final Method FILE_REVISION_GET_URI_METHOD;
		static {
			Class<?> fileRevisionClass = null;
			Method fileRevisionGetURIMethod = null;
			Bundle bundle = Platform.getBundle("org.eclipse.team.core"); //$NON-NLS-1$
			if (bundle != null && (bundle.getState() & (Bundle.ACTIVE | Bundle.STARTING | Bundle.RESOLVED)) != 0) {
				try {
					fileRevisionClass = bundle.loadClass("org.eclipse.team.core.history.IFileRevision"); //$NON-NLS-1$
					fileRevisionGetURIMethod = fileRevisionClass.getMethod("getURI"); //$NON-NLS-1$
				} catch (Throwable exeption) {
					// Ignore any exceptions and assume the class isn't
					// available.
				}
			}
			FILE_REVISION_CLASS = fileRevisionClass;
			FILE_REVISION_GET_URI_METHOD = fileRevisionGetURIMethod;
		}

		static final Class<?> URI_EDITOR_INPUT_CLASS;
		static {
			Class<?> uriEditorInputClass = null;
			try {
				uriEditorInputClass = IURIEditorInput.class;
			} catch (Throwable exception) {
				// The class is not available.
			}
			URI_EDITOR_INPUT_CLASS = uriEditorInputClass;
		}

		public static URI getURI(IEditorInput editorInput) {
			if (FILE_CLASS != null) {
				IFile file = getIFile(editorInput);
				if (file != null) {
					return URI.createPlatformPluginURI(file.getFullPath().toString(), false);
				}
			}
			if (FILE_REVISION_CLASS != null) {
				Object fileRevision = editorInput.getAdapter(FILE_REVISION_CLASS);
				if (fileRevision != null) {
					try {
						return URI.createURI(((java.net.URI) FILE_REVISION_GET_URI_METHOD.invoke(fileRevision)).toString());
					} catch (Throwable t) {
						AD_Log.getDefault().logError(t);
					}
				}
			}
			if (URI_EDITOR_INPUT_CLASS != null && editorInput instanceof IURIEditorInput) {
				return URI.createURI(((IURIEditorInput) editorInput).getURI().toString()).trimFragment();
				
			}
			return null;
		}

		public static IFile getIFile(IEditorInput editorInput) {
			if (FILE_CLASS != null) {
				return (IFile) editorInput.getAdapter(FILE_CLASS);
			}
			return null;
		}

		public static IURIEditorInput createFileEditorInput(IFile file) {
			return new FileEditorInput(file);
		}

		private EclipseUtil() {
			super();
		}

	}

}
