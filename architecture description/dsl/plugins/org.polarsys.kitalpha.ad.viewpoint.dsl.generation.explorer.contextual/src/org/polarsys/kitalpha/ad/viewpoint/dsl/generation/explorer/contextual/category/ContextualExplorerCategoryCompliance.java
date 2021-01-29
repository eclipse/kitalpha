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
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.generation.explorer.contextual.category;

import org.eclipse.emf.common.util.EList;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractAssociation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractSuperClass;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Association_Types;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.ExternalClassAssociation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.LocalClassAssociation;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Data;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.LocalSuperClass;

/**
 * @author Boubekeur Zendagui
 */
public class ContextualExplorerCategoryCompliance{
	
	/**
	 * 
	 * @param vpClass
	 * @return
	 */
	public static boolean contentProviderCategoryCompliance(Class vpClass){
		return ! vpClass.isAbstract();
	}
	
	/**
	 * 
	 * @param vpClass
	 * @return
	 */
	public static boolean parentCategoryCompliance(Class vpClass){
		return ! vpClass.isAbstract();
	}
	
	/**
	 * 
	 * @param vpClass
	 * @return
	 */
	public static boolean ownedViewpointCategoryCompliance(Class vpClass){
		if (vpClass.isAbstract())
			return false;
		
		for (AbstractAssociation abstractAssociation : vpClass.getVP_Classes_Associations()) {
			if (abstractAssociation instanceof LocalClassAssociation &&
					abstractAssociation.getType() == Association_Types.CONTAINMENT)
				return true;
		}
		return false;
	}
	
	/**
	 * 
	 * @param vpClass
	 * @return
	 */
	public static boolean ownedExternalCategoryCompliance(Class vpClass){
		if (vpClass.isAbstract())
			return false;
		
		for (AbstractAssociation abstractAssociation : vpClass.getVP_Classes_Associations()) {
			if (abstractAssociation instanceof ExternalClassAssociation &&
					abstractAssociation.getType() == Association_Types.CONTAINMENT)
				return true;
		}
		return false;
	}
	
	/**
	 * 
	 * @param vpClass
	 * @return
	 */
	public static boolean referencedViewpointCategoryCompliance(Class vpClass){
		if (vpClass.isAbstract())
			return false;
		
		for (AbstractAssociation abstractAssociation : vpClass.getVP_Classes_Associations()) {
			if (abstractAssociation instanceof LocalClassAssociation &&
					abstractAssociation.getType() == Association_Types.REFERENCE)
				return true;
		}
		return false;
	}
	
	/**
	 * 
	 * @param vpClass
	 * @return
	 */
	public static boolean referencedExternalCategoryCompliance(Class vpClass){
		if (vpClass.isAbstract())
			return false;
		
		for (AbstractAssociation abstractAssociation : vpClass.getVP_Classes_Associations()) {
			if (abstractAssociation instanceof ExternalClassAssociation &&
					abstractAssociation.getType() == Association_Types.REFERENCE)
				return true;
		}
		return false;
	}
	
	/**
	 * 
	 * @param vpClass
	 * @return
	 */
	public static boolean referencingViewpointCategoryCompliance(Class vpClass){
		if (vpClass.isAbstract())
			return false;
		
		Data data = (Data) vpClass.eContainer();
		for (Class clazz : data.getVP_Classes()) 
		{
			for (AbstractAssociation abstractAssociation : clazz.getVP_Classes_Associations()) 
			{
				if (abstractAssociation instanceof LocalClassAssociation
						&& abstractAssociation.getType() == Association_Types.REFERENCE) 
				{
					LocalClassAssociation localClassAssociation = (LocalClassAssociation) abstractAssociation;
					if (localClassAssociation.getLocalTarget() != null && localClassAssociation.getLocalTarget().equals(vpClass)) 
					{
						return true;
					}
					else
					{
						org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class localTarget = localClassAssociation.getLocalTarget();
						return isDerivedClass(vpClass, localTarget);
					}
				}
			}
		}
		return false;
	}
	
	public static boolean isDerivedClass(Class vpClass, Class candidateSuperClass){
		EList<AbstractSuperClass> superClasses = vpClass.getInheritences();
		for (AbstractSuperClass abstractSuperClass : superClasses) 
		{
			if (abstractSuperClass instanceof LocalSuperClass)
			{
				LocalSuperClass localSuperClass = (LocalSuperClass) abstractSuperClass;
				org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class superClass = localSuperClass.getSuperClass();
				if (superClass != null && superClass.equals(candidateSuperClass)) 
					return true;
				else
				{
					boolean found = isDerivedClass(superClass, candidateSuperClass);
					if (found)
						return true;
				}
			}
		}
		
		return false;
	}
}
