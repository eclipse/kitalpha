/*******************************************************************************
 * Copyright (c) 2017 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.richtext.widget.toolbar.handlers.links;

import java.util.Iterator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.window.Window;
import org.eclipse.sirius.business.api.query.DViewQuery;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.business.api.session.danalysis.DAnalysisSession;
import org.eclipse.sirius.business.api.session.resource.AirdResource;
import org.eclipse.sirius.viewpoint.DAnalysis;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;
import org.eclipse.sirius.viewpoint.DView;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.polarsys.kitalpha.richtext.widget.messages.Messages;
import org.polarsys.kitalpha.richtext.widget.toolbar.handlers.dialogs.FilteredElementTreeSelectionDialog;
import org.polarsys.kitalpha.richtext.widget.toolbar.handlers.utils.MDERichTextHelper;
import org.polarsys.kitalpha.richtext.widget.toolbar.handlers.utils.Tuple;

/**
 * Handler to select diagram 
 */
public class ModelDiagramLinkHandler extends ModelElementHandler {

	@Override
	public Tuple<String, String> getPath(Object object) {
		Tuple<String, String> path = null;
		if (object instanceof EObject){
			EObject eObject = (EObject)object;
			AdapterFactoryEditingDomain editingDomain = MDERichTextHelper.getAdapterFactory(eObject);

			if (editingDomain != null){
				AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(editingDomain.getAdapterFactory()){

					@Override
					public Image getImage(Object object) {
						if (object instanceof DView) {
							Viewpoint vp = ((DView) object).getViewpoint();
							if (vp != null) {
								return super.getImage(vp);
							}
						}
						return super.getImage(object);
					}

					@Override
					public String getText(Object object) {
						if (object instanceof DView) {
							Viewpoint vp = ((DView) object).getViewpoint();
							if (vp != null) {
								return super.getText(vp);
							}
						}
						return super.getText(object);
					}

				};
				AdapterFactoryContentProvider contentProvider = MDERichTextHelper.getContentProvider(eObject);

				FilteredElementTreeSelectionDialog dialog = new FilteredElementTreeSelectionDialog(Display.getCurrent().getActiveShell(), labelProvider, contentProvider);

				dialog.setTitle(Messages.RichTextWidget_Dialog_Title_Diagram_Element_Selection);
				dialog.setMessage(Messages.RichTextWidget_Dialog_Title_Selection_Diagram_Element);

				dialog.addFilter(new ViewerFilter() {

					@Override
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return ((element instanceof Resource) && containsDRepresentation((Resource) element)) || select(element);
					}

					private boolean select(Object element) {
						return (element instanceof DAnalysis) ||
								((element instanceof DView) && !(new DViewQuery((DView) element).getLoadedRepresentations().isEmpty())) ||
								(element instanceof DRepresentationDescriptor);
					}
					private boolean containsDRepresentation(Resource resource) {
						for (Iterator<EObject> it = resource.getAllContents(); it.hasNext(); ) {
							EObject obj = it.next();
							if (select(obj)) {
								return true;
							}
						}
						return false;
					}
				});

				Resource diagramResource = null;
				Resource res = eObject.eResource();
				if (res instanceof AirdResource) {
					diagramResource = res;
				} else if (res != null) {
					Session session = SessionManager.INSTANCE.getSession(res);
					if (session != null) {
						Iterator<Resource> analysisResources = ((DAnalysisSession) session).getAllSessionResources().iterator();
						if (analysisResources.hasNext()) {
							diagramResource = analysisResources.next();
						}
					}
				}
				if (diagramResource != null) {
					dialog.setInput(diagramResource.getResourceSet());
					if (Window.OK == dialog.open()) {
						Object result = dialog.getFirstResult();
						if (result instanceof DRepresentationDescriptor) {
							DRepresentation representation = ((DRepresentationDescriptor) result).getRepresentation();
							URI uri = EcoreUtil.getURI(representation);
							path = customizeLink(uri.toString(), representation);
						}
					}
				}
			}
		}
		return path;
	}
}
