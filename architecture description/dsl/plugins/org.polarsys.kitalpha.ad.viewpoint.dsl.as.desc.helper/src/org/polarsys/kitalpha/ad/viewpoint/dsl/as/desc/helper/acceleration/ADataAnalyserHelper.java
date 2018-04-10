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

package org.polarsys.kitalpha.ad.viewpoint.dsl.as.desc.helper.acceleration;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractAssociation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractSuperClass;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Attribute;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Data;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ExternalSuperClass;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.LocalSuperClass;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.NamedElement;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Viewpoint;

/**
 * This helper contains methods used by {@link ADataAnalyser}
 * 
 * @author Boubekeur Zendagui
 */

public class ADataAnalyserHelper {
	
	/**
	 * Name of the attribute that value is used a name of {@link ANode} class instance
	 */
	protected static String nameAttributeName = "name";
	
	
	/**
	 * Return the FQN of the current element
	 * @param element A {@link NamedElement}
	 * @return FQN of element
	 */
	public static String getFQN(NamedElement element){
		String fqn = "";
		
		Viewpoint viewpoint = null;
		
		String name = element.getName();
		if (element instanceof Class)
		{
			EObject eContainer = element.eContainer().eContainer();
			viewpoint = (Viewpoint) eContainer;
			fqn = viewpoint.getShortName() + ".data." + name;
		}
		
		if (element instanceof AbstractAssociation)
		{
			EObject eContainer = element.eContainer().eContainer().eContainer();
			viewpoint = (Viewpoint) eContainer;
			
			EObject eContainer2 = element.eContainer();
			Class clazz = (Class)eContainer2;
			
			fqn = viewpoint.getShortName() + ".data." + clazz.getName() +"."+ name;
		}
		
		return fqn;
	}
	
	/**
	 * Check if the {@link Class} contains or inherits an Attribute wich name is <I> name </I> (value of {@link #nameAttributeName})
	 * @param clazz
	 * @return
	 */
	public static boolean hasNameAttribute(Class clazz){
		EList<Attribute> localAttributes = clazz.getVP_Class_Attributes();
		if (localAttributes != null && ! localAttributes.isEmpty())
		{
			for (Attribute attribute : localAttributes) 
			{
				if (attribute.getName().equals(nameAttributeName)) {
					return true;
				}
			}
		}
		
		EList<AbstractSuperClass> superClasses = clazz.getInheritences();
		if (superClasses != null && ! superClasses.isEmpty())
		{
			for (AbstractSuperClass abstractSuperClass : superClasses) 
			{
				if (abstractSuperClass instanceof LocalSuperClass)
				{
					Class superClass = ((LocalSuperClass) abstractSuperClass).getSuperClass();
					if (superClass != null)
					{
						boolean hasNameAttribute = hasNameAttribute(superClass);
						if (hasNameAttribute) {
							return true;
						}
					}
				}
				if (abstractSuperClass instanceof ExternalSuperClass)
				{
					EClass superClass = ((ExternalSuperClass) abstractSuperClass).getSuperClass();
					EStructuralFeature nameAttribute = superClass.eClass().getEStructuralFeature(nameAttributeName);
					if (nameAttribute != null) {
						return true;
					}
				}
			}
		}
		
		return false;
	}
	
	/**
	 * Return all Class Local association and the inherited ones from super local classes
	 * @param clazz the {@link Class}
	 * @return a {@link List} of {@link AbstractAssociation}
	 */
	public static EList<AbstractAssociation> getAllLocalAssociations(Class clazz){
		EList<AbstractAssociation> result = new UniqueEList<AbstractAssociation>();
		EList<AbstractAssociation> classAssociations = clazz.getVP_Classes_Associations();
		result.addAll(classAssociations);
		
		EList<AbstractSuperClass> inheritences = clazz.getInheritences();
		if (inheritences != null && ! inheritences.isEmpty())
		{
			for (AbstractSuperClass superClass : inheritences) 
			{
				if (superClass instanceof LocalSuperClass)
				{
					Class localSuperClass = ((LocalSuperClass) superClass).getSuperClass();
					List<AbstractAssociation> allLocalAssociations = getAllLocalAssociations(localSuperClass);
					result.addAll(allLocalAssociations);
				}
			}
		}
		
		return result;
	}

	/**
	 * Look for all classes that inherits from a given {@link Class}
	 * @param type the super {@link Class} 
	 * @return a {@link List}of local {@link Class}es that inherits from the {@link Class} <I>type</I>
	 */
	public static EList<Class> getLocalDescendantClasses(Class type){
		EList<Class> result = new UniqueEList<Class>();
		
		EObject eContainer = type.eContainer();
		if (eContainer != null)
		{
			Data data = (Data) eContainer; 
			EList<Class> vp_Classes = data.getVP_Classes();
			for (Class iClass : vp_Classes) 
			{
				boolean superType = isSuperType(type, iClass);
				if (superType) {
					result.add(iClass);
				}
			}
		}
		
		return result;
	}
	
	
	/**
	 * Check if a {@link Class} inherits directly or indirectly from another {@link Class}
	 * @param type the super {@link Class}
	 * @param clazz the {@link Class} to check inheritance
	 * @return True if <I> clazz </I> inherits from <I> type </I>
	 */
	public static boolean isSuperType(Class type, Class clazz){
		EList<AbstractSuperClass> inheritences = clazz.getInheritences();
		if (inheritences.isEmpty()) {
			return false;
		}
		for (AbstractSuperClass abstractSuperClass : inheritences) 
		{
			if (abstractSuperClass instanceof LocalSuperClass)
			{
				Class superClass = ((LocalSuperClass) abstractSuperClass).getSuperClass();
				if (superClass.getName().equals(type.getName())) {
					return true;
				}
				return isSuperType(type, superClass);
			}
		}
		return false;
	}
	
}
