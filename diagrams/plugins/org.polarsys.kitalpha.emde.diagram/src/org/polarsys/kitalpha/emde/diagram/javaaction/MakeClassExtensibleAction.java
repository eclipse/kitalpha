/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.emde.diagram.javaaction;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.polarsys.kitalpha.emde.diagram.services.ExtensibilityService;
import org.polarsys.kitalpha.emde.model.EmdePackage;

// Action to make a EClass extensible
public class MakeClassExtensibleAction extends AbstractEmdeExternalJavaAction {
	private static final Shell SHELL = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
	private static final String MESSAGE = "This property cannot be changed because this class does not directly inherit from Model Element.";
	private static final String TITLE = "Error diaglog";
	private static final EClass MODEL_ELEMENT = ExtensibilityService.convert(EmdePackage.Literals.EXTENSIBLE_ELEMENT);
	private static final String TRUE = "true";
	private static final String FALSE = "false";
	private final static String OBJECT = "object";
	private final static String INPUT = "input";

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return true;
	}

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		Object object = parameters.get(OBJECT);
		Object in = parameters.get(INPUT);
		if (object instanceof EClass && in != null) 
		{
			final EClass eClass = (EClass) object;
			Command command = null;
			if (TRUE.equalsIgnoreCase(in.toString())) 
			{
				command = new RecordingCommand(editingDomain){
					@Override
					protected void doExecute() {
						for (EClass sp : eClass.getESuperTypes()) 
						{
							if (EcoreUtil.equals(sp, MODEL_ELEMENT)) 
							{
								return;
							}
						}
						eClass.getESuperTypes().add(MODEL_ELEMENT);
					}

				};

			}
			if (FALSE.equalsIgnoreCase(in.toString())) 
			{
				command = new RecordingCommand(editingDomain) {
					@Override
					protected void doExecute() {
						EClass toBeRemoved = null;
						for (EClass sp : eClass.getESuperTypes()) 
						{
							if (EcoreUtil.equals(sp, MODEL_ELEMENT)) 
							{
								toBeRemoved = sp;
							}
						}
						if (toBeRemoved != null	&& !eClass.getESuperTypes().remove(toBeRemoved)) 
						{
							MessageDialog.openError(SHELL, TITLE, MESSAGE);
						}
					}
				};
			}
			if (command != null) {
				editingDomain.getCommandStack().execute(command);
			}
		}
	}
}
