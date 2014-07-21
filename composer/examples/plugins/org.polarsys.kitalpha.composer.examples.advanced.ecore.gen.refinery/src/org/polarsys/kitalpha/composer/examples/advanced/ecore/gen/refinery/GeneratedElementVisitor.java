/*******************************************************************************
 * Copyright (c) 2013 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    THALES GLOBAL SERVICES - Initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.composer.examples.advanced.ecore.gen.refinery;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

import org.polarsys.kitalpha.composer.metamodel.allocation.base.Type;

import ecoreadvancedalloc.Declaration;
import ecoreadvancedalloc.EcoreFile;
import ecoreadvancedalloc.EcoreadvancedallocFactory;
import ecoreadvancedalloc.ForwardDeclaration;
import ecoreadvancedalloc.Reference;
import ecoreadvancedalloc.util.EcoreadvancedallocSwitch;

public class GeneratedElementVisitor extends EcoreadvancedallocSwitch<Boolean> {

	private Map<EClass, EcoreFile> mapping = new HashMap<EClass, EcoreFile>();
	private List<EClass> treatedClasses = new ArrayList<EClass>();

	public GeneratedElementVisitor(Map<EClass, EcoreFile> mapping) {
		super();
		this.mapping = mapping;
	}

	@Override
	public Boolean caseDeclaration(Declaration decl) {
		
		if (decl.getReferencedElement() instanceof EClass) {
			EClass c = (EClass)decl.getReferencedElement();
			
			for (EReference r : c.getEAllReferences()) {
				EClass tempClass = (EClass)r.getEReferenceType();
				
				Reference ref = EcoreadvancedallocFactory.eINSTANCE.createReference();
				ref.setName(r.getName());
				ref.setHyperlinkRef(getHref(tempClass));
				
				decl.getReferences().add(ref);
				
				if(!treatedClasses.contains(tempClass) && isInSameFile((EcoreFile)decl.eContainer(), tempClass)) {
					ForwardDeclaration fd = createForwarDeclaration(tempClass);
					EcoreFile f = (EcoreFile)decl.eContainer();
					f.getOwnedTypes().add(f.getOwnedTypes().indexOf(decl), fd);
				}
				
				treatedClasses.add(tempClass);
			}
			
			treatedClasses.add((EClass)decl.getReferencedElement());
		}
		
		return super.caseDeclaration(decl);
	}
	
	/**
	 * Construct the hyperlink for an eclass
	 * @param eclass the eclass
	 * @return the hyperlink
	 */
	private String getHref(EClass eclass) {
		String res = "empty";
		
		if(mapping.containsKey(eclass))
			res = mapping.get(eclass).getName() + "#" + eclass.getName();
		
		return res;
	}	
	
	/**
	 * Create a forward declaration that declares the eclass
	 * @param eclass the class to declare
	 * @return a forward declaration
	 */
	private ForwardDeclaration createForwarDeclaration(EClass eclass) {
    	ForwardDeclaration result = EcoreadvancedallocFactory.eINSTANCE.createForwardDeclaration();
    	
    	result.setReferencedElement(eclass);
    	
    	return result;
    }
	
	/**
	 * Check if an eclass is referenced by a type contained in the file efile
	 * @param efile
	 * @param eclass
	 * @return TRUE if the class is referenced in the file
	 */
	private boolean isInSameFile(EcoreFile efile, EClass eclass) {
		boolean res = false;
		
		for(Type t : efile.getOwnedTypes()) {
			if((t.getReferencedElement().equals(eclass) && !res))
				res = true;
		}
		
		return res;
	}
	
}
