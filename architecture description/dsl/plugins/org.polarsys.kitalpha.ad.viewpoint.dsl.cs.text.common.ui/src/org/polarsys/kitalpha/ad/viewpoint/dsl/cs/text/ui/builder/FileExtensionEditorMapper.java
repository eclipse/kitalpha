/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.builder;

import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.emf.common.util.URI;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.xtext.builder.IXtextBuilderParticipant;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescription.Delta;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionDelta;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.identifiers.EditorIDs;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.identifiers.NatureID;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.ResourceHelper;


/**
 * 
 * @author Amine Lajmi
 *
 */
public class FileExtensionEditorMapper implements IXtextBuilderParticipant {
		
	public static final QualifiedName EDITOR_KEY = new QualifiedName("org.eclipse.ui.internal.registry.ResourceEditorRegistry", "EditorProperty");
	
	public FileExtensionEditorMapper() {}

	/**
	 * map viewpoint dsl files to the appropriate editors
	 */
	@Override
	public void build(IBuildContext context, IProgressMonitor monitor) throws CoreException {
		final IProject project = context.getBuiltProject();

		if (project.hasNature(NatureID.VPDSL_PROJECT_NATURE)){
			List<Delta> deltas = context.getDeltas();
			final int numberOfDeltas = deltas.size();
			for (int i = 0; i < numberOfDeltas; i++) {
				DefaultResourceDescriptionDelta dd = (DefaultResourceDescriptionDelta) deltas.get(i);
				if (ResourceHelper.hasPeriodicFileExtension(dd.getUri())){
					if (dd.getOld() == null && dd.getNew() != null) {
						handleFileExtensionEditorMapping(dd);
					}
				}
			}
		}
	}

	private void handleFileExtensionEditorMapping(IResourceDescription.Delta  delta) {
		URI uri = delta.getUri();
		mapDefaultEditorToFile(uri);
	}

	private void mapDefaultEditorToFile(URI uri) {
		if (uri != null && uri.isPlatformResource()) {
			Path path = new Path(uri.toPlatformString(true));
			IFile file = getWorkspaceRoot().getFile(path);
			try {
				String editorID = file.getPersistentProperty(EDITOR_KEY);
				if (editorID == null) {
					String editorId = EditorIDs.getEditorID(ResourceHelper.getFileExtension(file));
					PlatformUI.getWorkbench().getEditorRegistry().setDefaultEditor(ResourceHelper.getFileExtension(file), editorId);
					IDE.setDefaultEditor(file,editorId);
				}
			} catch (CoreException e) {
				e.printStackTrace();
			}	
		}
	}
	

	private IWorkspaceRoot getWorkspaceRoot() {
		return ResourcesPlugin.getWorkspace().getRoot();
	}
}
