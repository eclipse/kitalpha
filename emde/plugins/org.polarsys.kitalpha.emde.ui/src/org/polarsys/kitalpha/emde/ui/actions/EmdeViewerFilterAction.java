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
package org.polarsys.kitalpha.emde.ui.actions;

import java.util.Collection;

import org.eclipse.emf.common.ui.action.ViewerFilterAction;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EStructuralFeatureImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.provider.IWrapperItemProvider;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Event;
import org.polarsys.kitalpha.emde.extension.ExtendedModel;
import org.polarsys.kitalpha.emde.extension.ExtensibleModel;
import org.polarsys.kitalpha.emde.extension.ModelExtensionHelper;
import org.polarsys.kitalpha.emde.ui.Activator;
import org.polarsys.kitalpha.emde.ui.EmdeImages;

/**
 * @author Thomas Guiu
 * 
 */
public class EmdeViewerFilterAction extends ViewerFilterAction {

	private final ExtendedModel extendedModel;

	private final ExtensibleModel extensibleModel;

	private final Resource resource;

	public EmdeViewerFilterAction(Resource resource, ExtensibleModel extensibleModel, ExtendedModel extendedModel) {
		super(extendedModel.getEPackage().getNsURI(), IAction.AS_CHECK_BOX);
		setImageDescriptor(Activator.getDefault().getImageDescriptor(EmdeImages.EPACKAGE));
		this.resource = resource;
		this.extensibleModel = extensibleModel;
		this.extendedModel = extendedModel;
	}

	public void setViewers(Collection<Viewer> viewers) {
		for (Viewer viewer : viewers) {
			addViewer(viewer);
		}
	}

	public ExtendedModel getExtendedModel() {
		return extendedModel;
	}

	public ExtensibleModel getExtensibleModel() {
		return extensibleModel;
	}

	public Resource getResource() {
		return resource;
	}

	private boolean isFromExtension(Object object) {
		EObject eObject = null;
		if (object instanceof EObject) {
			eObject = (EObject) object;
		}
		if (object instanceof IWrapperItemProvider) {
			IWrapperItemProvider provider = (IWrapperItemProvider) object;
			if (provider.getValue() instanceof EStructuralFeatureImpl.ContainmentUpdatingFeatureMapEntry) {
				eObject = (EObject) ((EStructuralFeatureImpl.ContainmentUpdatingFeatureMapEntry) provider.getValue()).getValue();
			}

		}
		if (eObject == null) {
			return false;
		}
		return eObject.eResource().equals(getResource()) && getExtendedModel().getEPackage().getNsURI().equals(eObject.eClass().getEPackage().getNsURI());
	}

	@Override
	public boolean select(Viewer viewer, Object parentElement, Object element) {
		return !isFromExtension(element) || isChecked();
	}

	@Override
	public void runWithEvent(Event event) {
		ModelExtensionHelper.getInstance(resource).setExtensionModelDisabled(getExtensibleModel(), getExtendedModel(), !isChecked());
		refreshViewers();
		super.runWithEvent(event);
	}
}
