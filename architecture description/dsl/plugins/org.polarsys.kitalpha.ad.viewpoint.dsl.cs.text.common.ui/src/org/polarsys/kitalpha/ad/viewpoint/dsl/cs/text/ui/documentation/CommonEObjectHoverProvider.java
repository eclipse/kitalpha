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

package org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.ui.documentation;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.internal.text.html.HTMLPrinter;
import org.eclipse.jface.text.IInformationControlCreator;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider;
import org.eclipse.xtext.ui.editor.hover.html.XtextBrowserInformationControlInput;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.identifiers.MetamodelIDs;

import com.google.inject.Inject;

/**
 * 
 * @author Amine Lajmi
 *
 */
@SuppressWarnings("restriction")
public class CommonEObjectHoverProvider extends DefaultEObjectHoverProvider {
	
	@Inject
	private ILabelProvider labelProvider;
	
	public CommonEObjectHoverProvider() {
		super();
	}
	
	@Override
	public IInformationControlCreatorProvider getHoverInfo(final EObject object,
			ITextViewer viewer, final IRegion region) {
		return new IInformationControlCreatorProvider() {

			@Override
			public IInformationControlCreator getHoverControlCreator() {
				return CommonEObjectHoverProvider.this.getHoverControlCreator();
			}

			@Override
			public Object getInfo() {
				return getExtendedHoverInfo(object, region, null);
			}
			
			private Object getExtendedHoverInfo(EObject object, IRegion region, Object region2) {
				String html = getAnnotatedDocumentationAsHtml(object);
				if (html != null) {
					StringBuffer buffer = new StringBuffer(html);
					HTMLPrinter.insertPageProlog(buffer, 0, getStyleSheet());
					HTMLPrinter.addPageEpilog(buffer);
					html = buffer.toString();
					return new XtextBrowserInformationControlInput(null, object, html, labelProvider);
				}
				return null;
			}};
		
		};
		
	protected String getAnnotatedDocumentationAsHtml(EObject o) {
		if (!hasHover(o)) {
			return null;
		}
		StringBuffer buffer = new StringBuffer();
		buffer.append (getFirstLine(o));
		String documentation = getAnnotatedDocumentation(o);
		if (documentation!=null && documentation.length()>0) {
			buffer.append("<p>");
			buffer.append(documentation);
			buffer.append("</p>");
		}
		return buffer.toString();
	}
	
	/**
	 * Return object description from stored annotation
	 * 
	 * @param object
	 * @return
	 */
	public String getAnnotatedDocumentation(EObject object) {
		//Reference to EClass
		if (object instanceof EClass) {
			EClass clazz = (EClass) object;
			final EAnnotation eAnnotation = clazz.getEAnnotation(MetamodelIDs.DOCUMENTATION_NAMESPACE);
			if (eAnnotation !=null) {
				final EMap<String, String> details = eAnnotation.getDetails();
				if (details.containsKey("description")) {
					return details.get("description");
				}
			}
		}
		//Reference to EDataType
		if (object instanceof EDataType) {
			EDataType clazz = (EDataType) object;
			final EAnnotation eAnnotation = clazz.getEAnnotation(MetamodelIDs.DOCUMENTATION_NAMESPACE);
			if (eAnnotation !=null) {
				final EMap<String, String> details = eAnnotation.getDetails();
				if (details.containsKey("description")) {
					return details.get("description");
				}
			}
		}		
		//A viewpoint dsl element
		EClass eClass = object.eClass();	
		EAnnotation currentAnnotation = eClass.getEAnnotation(MetamodelIDs.DOCUMENTATION_NAMESPACE);
		if (currentAnnotation !=null) {
			final EMap<String, String> details = currentAnnotation.getDetails();
			if (details.containsKey("description")) {
				return details.get("description");
			}
		}
		return null;
	}	
}
