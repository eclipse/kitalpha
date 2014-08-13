/*******************************************************************************
 * Copyright (c) Thales Corporate Services S.A.S, 2009.
 *******************************************************************************/
package org.polarsys.kitalpha.emde.diagram.javaaction;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.PlatformUI;
import org.polarsys.kitalpha.emde.diagram.services.ExtensibilityService;


// Abstract action to add an extensible super class to a given EClass
public abstract class AbstractNewExtensibleElement extends AbstractEmdeExternalJavaAction {
	private static final String MESSAGE = "Can't find the org.polarsys.kitalpha.emde plugin";
	private static final String TITLE = "Error";
	private static final String OWNER = "owner";
	private static final URI EMDE_URI = URI.createURI("platform:/plugin/org.polarsys.kitalpha.emde/model/eMDE.ecore");
	private static final Resource EMDE_ECORE = editingDomain.getResourceSet().getResource(EMDE_URI, true);

	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {

		final EClass owner = (EClass) parameters.get(OWNER);
		if (EMDE_ECORE != null) 
		{
			final EClass sp = ExtensibilityService.convert(getSuperType());
			if (sp != null) 
			{
				owner.getESuperTypes().add(sp);
			}
		} 
		else 
		{
			MessageDialog.openError(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), TITLE, MESSAGE);
		}

	}

	public abstract EClass getSuperType();

}
