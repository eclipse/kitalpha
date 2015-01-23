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
package org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.wizards.impl.diagram.template;

import java.util.Collection;

import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.wizards.impl.diagram.template.observer.IObserver;

/**
 * 
 * @author Faycal Abka
 *
 */
public class TemplateWizardAction {
	
	public static TemplateDataClasses showTemplateWizardWizard(Collection<Class> classes, Collection<IObserver> observers){
		
		Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		TemplateDataClasses dataClassesWizard = new TemplateDataClasses();

		for (IObserver observer : observers) {
			dataClassesWizard.registerObserver(observer);
		}
		
		dataClassesWizard.addPage(new DataClassesPage("List Data Class", classes));
		
		WizardDialog dialog = new WizardDialog(shell, dataClassesWizard);
				
		dialog.open();
		
		return dataClassesWizard;
	}
	
}
