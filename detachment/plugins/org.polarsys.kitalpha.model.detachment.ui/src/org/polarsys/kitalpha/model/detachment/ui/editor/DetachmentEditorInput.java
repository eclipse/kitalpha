/*******************************************************************************
 * Copyright (c) 2014, 2017 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.model.detachment.ui.editor;

import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;
import org.osgi.framework.Bundle;
import org.polarsys.kitalpha.model.common.scrutiny.registry.ModelScrutinyRegistry;
import org.polarsys.kitalpha.model.detachment.ui.Activator;
import org.polarsys.kitalpha.model.detachment.ui.constants.Constants;

/**
 * @author Faycal Abka
 */
public class DetachmentEditorInput implements IEditorInput {

	private final ModelScrutinyRegistry analysis;

	public DetachmentEditorInput(ModelScrutinyRegistry analysis) {
		this.analysis = analysis;
	}

	public ModelScrutinyRegistry getAnalysis() {
		return analysis;
	}

	@Override
	public Object getAdapter(Class adapter) {
		return null;
	}
	
	@Override
	public String getToolTipText() {
		return Constants.DETACHMENT;
	}
	
	@Override
	public IPersistableElement getPersistable() {
		return null;
	}
	
	@Override
	public String getName() {
		return Constants.DETACHMENT;
	}
	
	@Override
	public ImageDescriptor getImageDescriptor() {
		
		String IMG_PATH = "icons/run_detach.png";	//$NON-NLS-1$
		Bundle currentBundle = Activator.getDefault().getBundle();
		URL url = FileLocator.find(currentBundle, new Path(IMG_PATH), null);
		
		return ImageDescriptor.createFromURL(url);
	}
	
	@Override
	public boolean exists() {
		return false;
	}
}
