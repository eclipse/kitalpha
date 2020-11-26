/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ecore.diagram.javaaction.abstracts;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

public abstract class AbstractFocusExternalJavaAction implements IExternalJavaAction {
	protected static final String ELEMENT = "element";
	protected static final String VIEW_ELEMENT = "viewElement";
	protected EditingDomain editingDomain;
	
	protected abstract void run(Collection<? extends EObject> context, Map<String, Object> parameters);
	
	protected abstract RecordingCommand getCommand(TransactionalEditingDomain editingDomain, Set<EObject> targetSet);
	
	@Override
	public void execute(Collection<? extends EObject> context, Map<String, Object> parameters){
		EObject diagramElement = null;
		final Object object = parameters.get(VIEW_ELEMENT);
		if (object instanceof Collection<?>)
		{
			@SuppressWarnings("unchecked")
			Collection<EObject> focusedObjects = (Collection<EObject>) object;
			if ( !focusedObjects.isEmpty())
			{
				diagramElement = focusedObjects.iterator().next();
			}
		}
		else
		{
			diagramElement = (EObject) object;
		}
		
		if (diagramElement != null)
		{
			initEditingDomain(diagramElement);
		}
		else
		{
			throw new IllegalStateException("Can't initialize Editing domain");
		}
		
		run(context, parameters);
	}
	
	protected void initEditingDomain(EObject diagramElement){
		editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(diagramElement);
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return true;
	}

}
