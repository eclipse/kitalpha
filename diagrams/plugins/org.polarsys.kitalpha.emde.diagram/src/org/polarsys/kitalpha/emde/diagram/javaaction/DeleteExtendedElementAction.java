/*******************************************************************************
 * Copyright (c) Thales Corporate Services S.A.S, 2009.
 *******************************************************************************/
package org.polarsys.kitalpha.emde.diagram.javaaction;

import java.util.Collection;
import java.util.Map;
import java.util.StringTokenizer;

import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.DEdge;
import org.polarsys.kitalpha.emde.diagram.services.ExtensibilityService;

// Action to remove an extension from a given EClass
public class DeleteExtendedElementAction extends AbstractEmdeExternalJavaAction {
	private static final String ENTRY = "entry";
	private static final String LINK = "link";
	private static final String VIEW = "view";

	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		final EStringToStringMapEntryImpl entry = (EStringToStringMapEntryImpl) parameters.get(ENTRY);
		DEdge link = (DEdge) parameters.get(LINK);

		EClass targetClass = (EClass) ((DDiagramElement) link.getTargetNode()).getTarget();
		if (targetClass != null) 
		{
			String fragment = targetClass.eResource().getURIFragment(targetClass);
			EObject container = entry.eContainer().eContainer();
			if (container instanceof EClass) 
			{
				EAnnotation annotation = ExtensibilityService.getAnnotation((EClass) container, ExtensibilityService.SOURCE2);
				EStringToStringMapEntryImpl mappingEntry = ExtensibilityService.getEntry(annotation, ExtensibilityService.EXTENDED_ELEMENT);
				remove(entry, fragment);
				remove(mappingEntry, fragment);
			}

			Collection<EObject> objects = new UniqueEList<EObject>();
			objects.add(targetClass);
			EObject view = (EObject) parameters.get(VIEW);
			ExtensibilityService.clean(view, objects);
		}
	}

	public void remove(EStringToStringMapEntryImpl entry, String fragment) {
		StringTokenizer stringTokenizer = new StringTokenizer(entry.getValue());
		StringBuilder builder = new StringBuilder();
		while (stringTokenizer.hasMoreTokens()) 
		{
			String s = stringTokenizer.nextToken();
			if (s.contains(fragment) == false) 
			{
				builder.append(s);
				builder.append(NewExtendedElementAction.SPACE);
			}
		}
		
		final String newValue = builder.toString();
		if (newValue.replaceAll(NewExtendedElementAction.SPACE, "").length() > 0) 
		{
			entry.setValue(newValue);
		} 
		else 
		{
			final EAnnotation annotation = (EAnnotation) entry.eContainer();
			final EClass eClass = (EClass) annotation.eContainer();
			eClass.getEAnnotations().remove(annotation);
		}
	}
}
