/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *   Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/
package org.polarsys.kitalpha.emde.diagram.javaaction;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.PlatformUI;
import org.polarsys.kitalpha.emde.diagram.Activator;
import org.polarsys.kitalpha.emde.diagram.services.ExtensibilityService;
import org.polarsys.kitalpha.emde.model.EmdePackage;


// Action to add new extension to an EClass
public class NewExtendedElementAction extends AbstractEmdeExternalJavaAction {

	public static final String SPACE = " ";

	private static final String OWNER = "owner";

	private static final String SELECTION_LIST = "selectionList";

	@SuppressWarnings("unchecked")
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		Object owner = parameters.get(OWNER);
		
		Collection<EObject> selectionList = new HashSet<EObject>();
		
		if (parameters.get(SELECTION_LIST) instanceof Collection<?>)
		{
			selectionList = (Collection<EObject>) parameters.get(SELECTION_LIST);
		}
		else
		{
			selectionList.add((EClass) parameters.get(SELECTION_LIST));
		}
		
		if (owner instanceof EClass) 
		{
			doWork((EClass) owner, selectionList);
		} 
		else 
		{
			if (owner instanceof Collection<?>) 
			{
				Collection<?> list = (Collection<?>) owner;
				for (Object o : list) 
				{
					if (o instanceof EClass) 
						doWork((EClass) o, selectionList);
				}
			}
		}

	}

	private static class Helper {
		public static boolean isExtensible(EClass eclass) {
			EClass extensibleElement = EmdePackage.eINSTANCE.getExtensibleElement();
			for (EClass clazz : eclass.getEAllSuperTypes())
				if (clazz.getName().equals(extensibleElement.getName()))
					return true;
			return false;
		}
	}

	private void doWork(EClass owner, Collection<EObject> selectionList) {
		if (owner != null && selectionList != null && selectionList.size() > 0) {
			// Check the EClass are extensibles
			for (EObject obj : selectionList) {
				if (!(obj instanceof EClass && Helper.isExtensible((EClass) obj))) {
					String message = "The object '" + ((EClass) obj).getName() + "' is not extensible.";
					MessageDialog.openError(PlatformUI.getWorkbench().getDisplay().getActiveShell(), "Error", message);
					Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, message));
					return;
				}
			}

			EAnnotation annotation = ExtensibilityService.getAnnotation(owner, ExtensibilityService.SOURCE2);
			EStringToStringMapEntryImpl constraintEntry = ExtensibilityService.getEntry(annotation, ExtensibilityService.EXTENDED_ELEMENT);

			EAnnotation annotation2 = ExtensibilityService.getAnnotation(owner, ExtensibilityService.SOURCE3);
			EStringToStringMapEntryImpl mappingEntry = ExtensibilityService.getEntry(annotation2, ExtensibilityService.MAPPING);

			setValue(constraintEntry, mappingEntry, selectionList);
		}
	}

	private void setValue(EStringToStringMapEntryImpl constraintEntry, EStringToStringMapEntryImpl mappingEntry, Collection<EObject> selectionList) {
		StringBuilder stringBuilder1 = new StringBuilder();
		StringBuilder stringBuilder2 = new StringBuilder();

		String value = constraintEntry.getValue();
		if (value != null) {
			stringBuilder1.append(value);
			stringBuilder1.append(SPACE);
		}

		String value2 = mappingEntry.getValue();
		if (value2 != null) {
			stringBuilder2.append(value2);
			stringBuilder2.append(SPACE);
		}

		for (EObject eObject : selectionList) {

			URI oldURI = EcoreUtil.getURI(eObject);
			String fragment = oldURI.fragment();
			EPackage ePackage = getEPackage(eObject);
			String nsURI = ePackage.getNsURI();
			String uri = nsURI + "#" + fragment;

			if (value == null || value.contains(uri) == false) {
				stringBuilder1.append(uri);
				stringBuilder1.append(SPACE);
			}

			String oldURIString = oldURI.toString();
			if (value2 == null || value2.contains(oldURIString) == false) {
				stringBuilder2.append(oldURIString);
				stringBuilder2.append(SPACE);
			}

		}
		constraintEntry.setValue(stringBuilder1.toString());
		mappingEntry.setValue(stringBuilder2.toString());

	}

	private EPackage getEPackage(EObject object) {
		if (object == null) {
			return null;
		}
		if (object instanceof EPackage) {
			return (EPackage) object;
		}
		return getEPackage(object.eContainer());

	}

}
