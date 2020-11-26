/*******************************************************************************
 * Copyright (c) 2014, 2020 Thales Global Services S.A.S.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S - initial API and implementation
 *******************************************************************************/

package org.polarsys.kitalpha.composer.examples.advanced.ecore.gen.refinery;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.polarsys.kitalpha.composer.api.Parameter;
import org.polarsys.kitalpha.composer.api.ParameterError;
import org.polarsys.kitalpha.composer.extension.points.IRefinery;
import org.polarsys.kitalpha.composer.metamodel.allocation.base.File;
import org.polarsys.kitalpha.composer.metamodel.allocation.base.Root;
import org.polarsys.kitalpha.composer.metamodel.allocation.base.Type;

import ecoreadvancedalloc.EcoreFile;
import ecoreadvancedalloc.EcoreRoot;

public class EcoreAdvancedRefinery implements IRefinery {

	public EcoreAdvancedRefinery() {
		// TODO Auto-generated constructor stub
	}

	public Map<String, Parameter> getParameters() {
		// TODO Auto-generated method stub
		return null;
	}

	public EcoreRoot refineModelElements(Root allocRoot_p,
			Map<String, Parameter> refineryParams_p) {
		
		EcoreRoot allocRoot = (EcoreRoot) allocRoot_p;

	    Map<EClass, EcoreFile> mapping = constructMapping(allocRoot);
	        
	    GeneratedElementVisitor v = new GeneratedElementVisitor(mapping);
			
		Iterator<EObject> it = getAllContents(allocRoot).iterator();
		while(it.hasNext()) {
			v.doSwitch(it.next());
		}
			
	    return allocRoot;
		
	}
	
	/**
     * Create a copy of the model
     * @param allocRoot the root of the model
     * @return a list with all the model objects
     */
    private List<EObject> getAllContents(EcoreRoot allocRoot) {
		Iterator<EObject> iter = allocRoot.eAllContents();
		List<EObject> result = new ArrayList<EObject>();
		while (iter.hasNext()) {
			EObject object = (EObject) iter.next();
			result.add(object);
		}
		return result;
	}
    
    /**
     * Create a map where the key are EClass and the value are the files that contains the declarations that refers to these EClass 
     * Example : 
     * If a File f contains Declaration d that refers to EClass c
     * Then the map is : {{c, f}}
     * @param allocRoot
     * @return
     */
	Map<EClass, EcoreFile> constructMapping(Root allocRoot) {
    	Map<EClass, EcoreFile> mapping = new HashMap<EClass, EcoreFile>();
    	List<File> files = allocRoot.getOwnedFiles();
    	
    	for(File file : files) {
    		for(Type t : file.getOwnedTypes()) {
    			mapping.put((EClass)t.getReferencedElement(), (EcoreFile)file);
    		}
		}
    	
    	return mapping;
    }

	public Map<String, ParameterError> validateParameters(
			Map<String, Parameter> valuedParameters_p) {
		// TODO Auto-generated method stub
		return null;
	}

}
