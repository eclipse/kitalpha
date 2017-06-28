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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.polarsys.kitalpha.richtext.widget.messages.Messages;
import org.polarsys.kitalpha.richtext.widget.toolbar.handlers.dialogs.FilteredElementTreeSelectionDialog;
import org.polarsys.kitalpha.richtext.widget.toolbar.handlers.utils.MDERichTextHelper;
import org.polarsys.kitalpha.richtext.widget.toolbar.handlers.utils.Tuple;

/**
 * 
 * Handler to select model element and transform selection to html link tag
 *
 */
public class ModelElementHandler extends AbstractLinkTypeHandler {

	@Override
	public String resolveType(String link) {
		return link != null && link.contains("hlink:")? LinkManager.MODEL_ELEMENT:LinkManager.UNKNOWN;
	}

	@Override
	public String encode(String url, String displayText) {
		return "<a href=\"hlink://" + url + "\">" + escapeDisplayedText(displayText) + "</a>"; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
	}

	@Override
	public String decode(String link, String basePath) {
		link = link.replaceFirst("hlink://", ""); //$NON-NLS-1$ //$NON-NLS-2$
		link = link.replaceAll("/", ""); //$NON-NLS-1$ //$NON-NLS-2$
		return link;
	}

	@Override
	public void openLink(String link) {
		//Do nothing
	}


	@Override
	public Tuple<String, String> getPath(Object object) {
		Tuple<String, String> path = null;
		if (object instanceof EObject){
			EObject modelElement = (EObject)object;
			AdapterFactoryLabelProvider labelProvider = MDERichTextHelper.getLabelProvider(modelElement);
			AdapterFactoryContentProvider contentProvider = MDERichTextHelper.getContentProvider(modelElement);
			if (labelProvider != null && contentProvider != null){ 
				FilteredElementTreeSelectionDialog dialog = new FilteredElementTreeSelectionDialog(
						Display.getCurrent().getActiveShell(), labelProvider, contentProvider);
				dialog.setTitle(Messages.RichTextWidget_Dialog_Title_Model_Element_Selection);
				dialog.setMessage(Messages.RichTextWidget_Dialog_Title_Selection_Model_Element);

				EObject root = EcoreUtil.getRootContainer(modelElement);
				dialog.setInput(root.eResource());
				if (Window.OK == dialog.open()) {
					Object result = dialog.getFirstResult();
					if (result instanceof EObject) {
						String link = EcoreUtil.getURI((EObject)object).toString();
						path = customizeLink(link, result);
					}
				}
			}
		}
		return path;
	}
	
	/**
	 * Customization of EMF URI
	 * The algorithm:
	 * <ul>
	 * 	<li>If object is an EObject and contained in XML Resource then try to retrieve the ID of the object</li>
	 * 	<li>If the XML ID of the object is null, then try to get the fragment</li>
	 * 	<li>If the fragment of element is null, return the link passed as argument (the link in EMF context, is String representing the URI with fragment)</li>
	 *</ul>
	 */
	@Override
	protected Tuple<String, String> customizeLink(String link, Object object) {
		String result = null;
		String label = null;
		if (object instanceof EObject) {
			EObject eObject = (EObject)object;
			label = MDERichTextHelper.getName(eObject);
			Resource eResource = eObject.eResource();
			if (eResource instanceof XMLResource){
				result = ((XMLResource) eResource).getID(eObject);
			}
			if (result == null){
				result = EcoreUtil.getURI(eObject).fragment();
				if (result != null){
					return new Tuple<String, String>(result, label);
				}
			}
		}
		if (result == null){
			result = link;
		}
		return new Tuple<String, String>(result, label);
	}
}
