/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
/**
 * Copyright (c) THALES, 2012. All rights reserved.
 */
package org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.wizards.impl.diagram;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.polarsys.kitalpha.ad.viewpoint.dsl.cs.text.resources.FileExtension;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.wizards.AbstractFileCreationPage;


/**
 * 
 * @author Amine Lajmi
 *
 */
public class VpdiagramFileCreationPage extends AbstractFileCreationPage {
		 	 
	public VpdiagramFileCreationPage(IStructuredSelection selection) {
		 super(selection);
		 setTitle(Messages.VpdiagramFileCreationPage_Title);
		 setDescription(Messages.VpdiagramFileCreationPage_Description); 
		 setFileExtension(FileExtension.DIAGRAM_EXTENSION);
	 }

	@Override
	public void initializeProperties() {
		setFileName(((VpdiagramWizard)getWizard()).getVpShortName() + "." + FileExtension.DIAGRAM_EXTENSION);
	}
}
