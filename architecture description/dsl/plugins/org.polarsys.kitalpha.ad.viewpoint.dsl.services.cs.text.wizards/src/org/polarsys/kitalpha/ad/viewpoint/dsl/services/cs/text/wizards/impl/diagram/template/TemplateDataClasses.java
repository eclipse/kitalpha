/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.wizards.impl.diagram.template;

import java.util.Collection;
import java.util.HashSet;

import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.wizards.impl.diagram.template.observer.IObserver;
import org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.wizards.impl.diagram.template.observer.ISelectionNotification;

/**
 * @author Faycal Abka
 */

public class TemplateDataClasses extends Wizard implements ISelectionNotification {
	
	private static final Collection<IObserver> observers = new HashSet<IObserver>();
	

	public TemplateDataClasses() {
		setWindowTitle("Accelerator of diagram creation");
	}
	
	@Override
	public boolean performFinish() {
		
		DataClassesPage page = getDataClassesPage();
		if (page != null){
			Collection<Class> selectedClasses = page.getSelectedClass();
			
			for (Class class1 : selectedClasses) {
				notifyObservators(class1);
			}
			page.dispose();
		}
		
		return true;
	}
	

	
	private DataClassesPage getDataClassesPage(){
		for (IWizardPage page : getPages()) {
			if (page instanceof DataClassesPage){
				return (DataClassesPage) page;
			}
		}
		return null;
	}

	@Override
	public void registerObserver(IObserver observer) {
		observers.add(observer);
	}

	@Override
	public void unregisterObserver(IObserver observer) {
		if (observers.contains(observer))
			observers.remove(observer);
	}

	@Override
	public void notifyObservators(Class vpClass) 
	{
		boolean isExtension = false;
		DataClassesPage page = getDataClassesPage();
		
		if (page != null)
		{
			isExtension = page.isDiagramExtension();
		}
		
		for (IObserver observer : observers) 
		{
			observer.update(vpClass, isExtension);
		}
	}
}
