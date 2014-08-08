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

package org.polarsys.kitalpha.ecore.diagram.documentation;

import java.util.Collection;
import java.util.Collections;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.EcoreFactoryImpl;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.common.tools.api.editing.EditingDomainFactoryService;

public class DocumentationService {

	public static final String DOCUMENTATION_SOURCE = "http://www.polarsys.org/kitalpha/ecore/documentation";
	public static final String DESCRIPTION = "description";
	public static final String USAGE_GUIDELINE = "usage guideline";
	public static final String USED_IN_LEVELS = "used in levels";
	public static final String USAGE_EXAMPLES = "usage examples";
	public static final String CONSTRAINTS = "constraints";
	
	protected static final TransactionalEditingDomain editingDomain = 
			EditingDomainFactoryService.INSTANCE.getEditingDomainFactory().createEditingDomain();

	public void createDocumentation(EModelElement receiver) {
		if (accept(receiver)) 
		{
			final Collection<Object> documentation = getDocumentation(receiver);
			if (documentation.isEmpty())
			{
				EAnnotation eAnnotation = receiver.getEAnnotation(DOCUMENTATION_SOURCE);
				if (eAnnotation == null) 
					eAnnotation = creatDocumentationEAnnotation(receiver);

				createEntry(eAnnotation, DESCRIPTION);
				createEntry(eAnnotation, USAGE_GUIDELINE);
				createEntry(eAnnotation, USED_IN_LEVELS);
				createEntry(eAnnotation, USAGE_EXAMPLES);
				createEntry(eAnnotation, CONSTRAINTS);
			}
		} 
	}
	
	public Collection<Object> getDocumentation(EModelElement receiver) {
		if (accept(receiver)) 
		{
			Collection<Object> result = new UniqueEList<Object>();
			EAnnotation eAnnotation = receiver.getEAnnotation(DOCUMENTATION_SOURCE);
//			if (eAnnotation == null) 
//				eAnnotation = creatDocumentationEAnnotation(receiver);
			if (eAnnotation != null )
			{
				Object descriptionEntry = getEntry(eAnnotation, DESCRIPTION);
				if (descriptionEntry != null)
					result.add(descriptionEntry);

				Object usageGuidEntry = getEntry(eAnnotation, USAGE_GUIDELINE);
				if (usageGuidEntry != null)
					result.add(usageGuidEntry);

				Object usageLevelEntry = getEntry(eAnnotation, USED_IN_LEVELS);
				if (usageLevelEntry != null)
					result.add(usageLevelEntry);

				Object usageExampleEntry = getEntry(eAnnotation, USAGE_EXAMPLES);
				if (usageExampleEntry != null)
					result.add(usageExampleEntry);

				Object contraintsEntry = getEntry(eAnnotation, CONSTRAINTS);
				if (contraintsEntry != null)
					result.add(contraintsEntry);
			}
			return result;
		} 
		else 
		{
			return Collections.emptyList();
		}
	}

	private static boolean accept(EModelElement receiver) {
		if (receiver instanceof EClassifier
				|| receiver instanceof EPackage
				|| receiver instanceof ETypedElement) 
			return true;
		else
			return false;
	}

	private EAnnotation creatDocumentationEAnnotation(final EModelElement receiver) {
		final EAnnotation eAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
		eAnnotation.setSource(DOCUMENTATION_SOURCE);
		editingDomain.getCommandStack().execute(new RecordingCommand(editingDomain) {
			@Override
			protected void doExecute() {
				receiver.getEAnnotations().add(eAnnotation);
			}
		});

		return eAnnotation;

	}
	
	public void createEntry(final EAnnotation eAnnotation, String key) {
		final Object existingEntry = getEntry(eAnnotation, key);
		
		if (existingEntry == null)
		{
			final EStringToStringMapEntryImpl entry = 
					(EStringToStringMapEntryImpl) ((EcoreFactoryImpl) EcoreFactory.eINSTANCE).createEStringToStringMapEntry();
			entry.setKey(key);

			editingDomain.getCommandStack().execute(new RecordingCommand(editingDomain) {
				@Override
				protected void doExecute() {
					eAnnotation.getDetails().add(entry);
				}
			});
		}
	}

	private Object getEntry(final EAnnotation eAnnotation, String key) {
		for (Entry<String, String> entry : eAnnotation.getDetails()) 
		{
			if (key.equals(entry.getKey())) 
				return entry;
		}

//		final EStringToStringMapEntryImpl entry = 
//				(EStringToStringMapEntryImpl) ((EcoreFactoryImpl) EcoreFactory.eINSTANCE).createEStringToStringMapEntry();
//		entry.setKey(key);
//
//		editingDomain.getCommandStack().execute(new RecordingCommand(editingDomain) {
//			@Override
//			protected void doExecute() {
//				eAnnotation.getDetails().add(entry);
//			}
//		});
//		return entry;
		return null;
	}
}
