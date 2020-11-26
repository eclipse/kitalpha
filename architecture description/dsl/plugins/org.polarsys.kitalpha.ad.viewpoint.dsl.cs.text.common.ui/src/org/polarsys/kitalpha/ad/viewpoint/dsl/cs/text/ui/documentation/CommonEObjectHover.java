/*******************************************************************************
 * Copyright (c) 2014-2020 Thales Global Services S.A.S.
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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.IInformationControlCreator;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.xtext.resource.IGlobalServiceProvider;
import org.eclipse.xtext.ui.editor.hover.DispatchingEObjectTextHover;
import org.eclipse.xtext.ui.editor.hover.IEObjectHoverProvider;
import org.eclipse.xtext.ui.editor.hover.IEObjectHoverProvider.IInformationControlCreatorProvider;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.ExternalDataHelper;

import com.google.inject.Inject;


/**
 * 
 * @author Amine Lajmi
 * 		   Faycal ABKA
 *
 */
public class CommonEObjectHover extends DispatchingEObjectTextHover {

	@Inject 
	private IGlobalServiceProvider serviceProvider;
	
	@Inject
	private CommonEObjectHoverProvider vpdslHoverProvider;
	
	private IInformationControlCreatorProvider lastCreatorProvider;
	
	@Override
	public Object getHoverInfo(EObject first, ITextViewer textViewer, IRegion hoverRegion) {
			if (ExternalDataHelper.isPackageInScopeURIs(first.eClass().getEPackage())){			
				if (vpdslHoverProvider==null) {
					vpdslHoverProvider= new CommonEObjectHoverProvider();
				}
				IInformationControlCreatorProvider creatorProvider = vpdslHoverProvider.getHoverInfo(first, textViewer, hoverRegion);
				if (creatorProvider != null){
					this.lastCreatorProvider = creatorProvider;
					return lastCreatorProvider.getInfo();
				}
			}
			return null;	
	}
	
	@Override
	public IInformationControlCreator getHoverControlCreator() {
		return this.lastCreatorProvider==null?vpdslHoverProvider.getHoverControlCreator():lastCreatorProvider.getHoverControlCreator();
	}
	
	public Object getDispatchedHoverInfo(EObject first, ITextViewer textViewer, IRegion hoverRegion) {
		IEObjectHoverProvider hoverProvider = serviceProvider.findService(first, IEObjectHoverProvider.class);
		if (hoverProvider == null) {
			if (ExternalDataHelper.isPackageInScopeURIs(first.eClass().getEPackage())){			
				if (vpdslHoverProvider==null) {
					vpdslHoverProvider= new CommonEObjectHoverProvider();
				}
				IInformationControlCreatorProvider creatorProvider = vpdslHoverProvider.getHoverInfo(first, textViewer, hoverRegion);
				if (creatorProvider != null){
					this.lastCreatorProvider = creatorProvider;
					return lastCreatorProvider.getInfo();
				}
			}
			return null;
		}
		IInformationControlCreatorProvider creatorProvider = hoverProvider.getHoverInfo(first, textViewer, hoverRegion);
		if (creatorProvider != null){
			this.lastCreatorProvider = creatorProvider;
			return lastCreatorProvider.getInfo();
		}
		return null;
	}
}
