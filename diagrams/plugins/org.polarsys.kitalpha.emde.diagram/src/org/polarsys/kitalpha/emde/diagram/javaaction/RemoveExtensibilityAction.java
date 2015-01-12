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
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.polarsys.kitalpha.emde.diagram.services.ExtensibilityService;
import org.polarsys.kitalpha.emde.model.EmdePackage;

// Remove all extension of an EClass
public class RemoveExtensibilityAction extends AbstractEmdeExternalJavaAction {

	private static final String ELEMENT = "element";
	private static final String VIEW = "view";

	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		EClass element = (EClass) parameters.get(ELEMENT);

		EClass superType = null;
		if (ExtensibilityService.isInstanceOf(element, EmdePackage.Literals.ELEMENT_EXTENSION)) 
		{
			superType = ExtensibilityService.convert(EmdePackage.Literals.ELEMENT_EXTENSION);
		}


		if (superType != null) 
		{
			EList<EClass> superTypes = element.getESuperTypes();
			for (EClass eClass : superTypes) 
			{
				if (EcoreUtil.equals(eClass, superType))
				{
					superType = eClass;
					break;
				}
			}
			
			element.getESuperTypes().remove(superType);
			
			EAnnotation annotation1 = ExtensibilityService.getAnnotation(element, ExtensibilityService.SOURCE2);
			EAnnotation annotation2 = ExtensibilityService.getAnnotation(element, ExtensibilityService.SOURCE3);

			Collection<EObject> objects = new UniqueEList<EObject>();
			for (Entry<String, String> entry : annotation2.getDetails()) 
			{
				if (entry instanceof EStringToStringMapEntryImpl) 
				{
					objects.addAll(ExtensibilityService.getExtendedModel((EStringToStringMapEntryImpl) entry));
				}
			}

			if (annotation1 != null) 
			{
				element.getEAnnotations().remove(annotation1);
			}

			if (annotation2 != null) 
			{
				element.getEAnnotations().remove(annotation2);
			}

			DDiagramElement view = (DDiagramElement) parameters.get(VIEW);
			ExtensibilityService.clean(view, objects);
		}

	}
}
