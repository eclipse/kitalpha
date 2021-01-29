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

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.polarsys.kitalpha.emde.diagram.services.ExtensibilityService;

// Action to set EAnnotation value
public class AnnotationSetValueAction extends AbstractEmdeExternalJavaAction {
	private static final String TRUE = "true";
	private static final String FALSE = "false";
	private final static String OBJECT = "object";
	private final static String INPUT = "input";

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return true;
	}

	@Override
	public void execute(Collection<? extends EObject> selections,
			Map<String, Object> parameters) {
		Object object = parameters.get(OBJECT);
		Object in = parameters.get(INPUT);
		if (object instanceof EStringToStringMapEntryImpl && in != null) {
			final EStringToStringMapEntryImpl entry = (EStringToStringMapEntryImpl) object;
			final String input = in.toString();

			CompoundCommand command = new CompoundCommand();
			SetEntryCommand command1 = new SetEntryCommand(editingDomain,
					entry, input);
			command.append(command1);
			if (entry.getKey().equals(ExtensibilityService.USE_UUIDS)) {
				EAnnotation annotation = (EAnnotation) entry.eContainer();
				EStringToStringMapEntryImpl entry2 = findEntry(annotation);
				SetEntryCommand command2 = new SetEntryCommand(editingDomain,
						entry2, input);
				command.append(command2);
			}
			editingDomain.getCommandStack().execute(command);
		}

	}

	private EStringToStringMapEntryImpl findEntry(EAnnotation annotation) {
		for (Map.Entry<String, String> entry : annotation.getDetails()) {
			if (entry instanceof EStringToStringMapEntryImpl) {
				EStringToStringMapEntryImpl result = (EStringToStringMapEntryImpl) entry;
				if (result.getKey().equals(ExtensibilityService.USE_ID_ATTRIBUTES)) {
					return result;
				}
			}
		}
		return null;
	}

	private static class SetEntryCommand extends RecordingCommand {
		private EStringToStringMapEntryImpl entry;
		private String input;

		public SetEntryCommand(TransactionalEditingDomain domain,
				EStringToStringMapEntryImpl entry, String input) {
			super(domain);
			this.entry = entry;
			this.input = input;
		}

		@Override
		protected void doExecute() {
			if (input.toString().equalsIgnoreCase(TRUE)) {
				entry.setValue(TRUE);
			}
			if (input.toString().equalsIgnoreCase(FALSE)) {
				entry.setValue(FALSE);
			}
		}

	}

}
