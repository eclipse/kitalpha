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

import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.wizards.impl.diagram.template.observer.IObserver;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.wizards.impl.diagram.template.observer.ISelectionNotification;

/**
 * 
 * @author Faycal Abka
 *
 */
public class TemplateWizardAction {
	
	private static WizardDialog dialog;
	
	public static Wizard createWizardDialog(){
		Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		TemplateDataClasses dataClassesWizard = new TemplateDataClasses();
		
		WizardDialog dialog = new WizardDialog(shell, dataClassesWizard);
		dialog.setTitle("Diagram Creation");
		
		TemplateWizardAction.dialog = dialog;
		
		return dataClassesWizard;
	}
	
	public static void openAndInitWizard(Wizard wizard, Collection<Class> classes){
		
		if (TemplateWizardAction.dialog == null){
			throw new RuntimeException("Dialog wizard was not created!");
		}
		
		//Register pages here
		wizard.addPage(new DataClassesPage("List Data Class", classes));
		
		dialog.open();
	}
	
	/**
	 * Register observer wizard
	 * @param wizard
	 * @param observer
	 */
	public static void registerObserver(IWizard wizard, IObserver observer){
		
		if (wizard == null || observer == null){
			//TODO log warning or error
			return;
		}

		if (wizard instanceof ISelectionNotification){
			ISelectionNotification notifier = (ISelectionNotification)wizard;
			registerObserver(notifier, observer);
		}
	}
	
	private static void registerObserver(ISelectionNotification observator, IObserver observer){
		observator.registerObserver(observer);
	}
}
