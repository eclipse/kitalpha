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

	public Collection<Object> getDocumentation(EModelElement receiver) {
		if (accept(receiver)) 
		{
			EAnnotation eAnnotation = receiver.getEAnnotation(DOCUMENTATION_SOURCE);
			if (eAnnotation == null) 
				eAnnotation = creatDocumentationEAnnotation(receiver);
			
			Collection<Object> result = new UniqueEList<Object>();
			result.add(getEntry(eAnnotation, DESCRIPTION));
			result.add(getEntry(eAnnotation, USAGE_GUIDELINE));
			result.add(getEntry(eAnnotation, USED_IN_LEVELS));
			result.add(getEntry(eAnnotation, USAGE_EXAMPLES));
			result.add(getEntry(eAnnotation, CONSTRAINTS));
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

	private Object getEntry(final EAnnotation eAnnotation, String key) {
		for (Entry<String, String> entry : eAnnotation.getDetails()) 
		{
			if (key.equals(entry.getKey())) 
				return entry;
		}

		final EStringToStringMapEntryImpl entry = 
				(EStringToStringMapEntryImpl) ((EcoreFactoryImpl) EcoreFactory.eINSTANCE).createEStringToStringMapEntry();
		entry.setKey(key);

		editingDomain.getCommandStack().execute(new RecordingCommand(editingDomain) {
			@Override
			protected void doExecute() {
				eAnnotation.getDetails().add(entry);
			}
		});

		return entry;
	}
}
