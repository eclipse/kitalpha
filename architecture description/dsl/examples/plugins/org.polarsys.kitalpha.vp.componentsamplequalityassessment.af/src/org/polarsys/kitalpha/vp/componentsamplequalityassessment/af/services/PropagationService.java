/*******************************************************************************
 * Copyright (c) 2014, 2016 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.vp.componentsamplequalityassessment.af.services;

import java.util.List;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.polarsys.kitalpha.ad.viewpoint.coredomain.viewpoint.model.Service;
import org.polarsys.kitalpha.ad.viewpoint.integration.services.ServiceImplementation;
import org.polarsys.kitalpha.ad.viewpoint.utils.ModelAccessor;
import org.polarsys.kitalpha.emde.model.ElementExtension;
import org.polarsys.kitalpha.emde.model.ExtensibleElement;
import org.polarsys.kitalpha.vp.componentsamplequalityassessment.ComponentSampleQualityAssessment.QualityAssessment;

/**
 * @author Thomas Guiu
 *
 */
public abstract class PropagationService implements ServiceImplementation  {

	@Override
	public boolean canRun(Service service, ModelAccessor properties, Object[] selection) {
		return selection != null && selection.length != 0 && getQA(selection) != null;
	}

	protected QualityAssessment getQA(Object[] selection) {
		for (Object o : selection) {
			QualityAssessment qa = getQA(o);
			if (qa != null)
				return qa;
		}
		return null;
	}

	protected QualityAssessment getQA(Object o) {
		if (o instanceof ExtensibleElement) {
			ExtensibleElement ee = (ExtensibleElement) o;
	
			for (ElementExtension ext : ee.getOwnedExtensions()) {
				if (ext instanceof QualityAssessment) {
					return (QualityAssessment) ext;
				}
			}
		}
		return null;
	}

	@Override
	public void run(Service service, ModelAccessor properties, final Object[] selection) {
		EditingDomain domain = getEditingDomain(selection);
		Command cmd = new AbstractCommand() {
			List<EObject> additions;
			{
				setLabel(getServiceLabel());
			}
			@Override
			public void execute() {
				additions = perform(selection);
			}

			@Override
			public void undo() {
				for (EObject eobj : additions)
					EcoreUtil.delete(eobj);
			}

			@Override
			protected boolean prepare(){
				return true;
			}
			
			@Override
			public void redo() {
				execute();
			}
		};

		domain.getCommandStack().execute(cmd);
	}

	protected abstract String getServiceLabel() ;

	protected abstract List<EObject> perform(Object[] selection) ;

	protected EditingDomain getEditingDomain(Object[] selection) {
		for (Object o : selection) {
			TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(o);
			if (editingDomain != null)
				return editingDomain;
		}
		ResourceSet resourceSet = ((EObject)selection[0]).eResource().getResourceSet();
		if (resourceSet  instanceof IEditingDomainProvider)
			return (EditingDomain) ((IEditingDomainProvider)resourceSet).getEditingDomain();
		return null;
	}

}
