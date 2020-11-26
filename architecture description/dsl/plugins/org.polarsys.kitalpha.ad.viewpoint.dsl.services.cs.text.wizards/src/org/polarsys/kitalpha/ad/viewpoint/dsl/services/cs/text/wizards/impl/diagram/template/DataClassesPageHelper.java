/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
 *  This program and the accompanying materials are made available under the
 *  terms of the Eclipse Public License 2.0 which is available at
 *  http://www.eclipse.org/legal/epl-2.0
 *  
 *  SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.ad.viewpoint.dsl.services.cs.text.wizards.impl.diagram.template;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.StructuredSelection;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.AbstractSuperClass;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.Class;
import org.polarsys.kitalpha.ad.viewpoint.dsl.as.model.vpdesc.LocalSuperClass;

/**
 * @author Boubekeur Zendagui
 */
public final class DataClassesPageHelper {

	/**
	 * Filter classes and return only the ones thats extend other classes
	 * @param classes initial {@link Class}es list
	 * @return {@link Class}es extending other classes
	 */
	public static Collection<Class> getEmdeExtensionClasses(Collection<Class> classes){
		Collection<Class> resulClasses = new ArrayList<Class>();
		for (Class iClass : classes) 
		{
			final EList<EClass> classesToExtend = iClass.getExtends();
			if (classesToExtend != null) 
			{
				if (! classesToExtend.isEmpty())
				{// Check if the Class is itself an Emde Extension
					resulClasses.add(iClass);
				}
				else
				{// Check if there is at least one super Class that is an Emde Extension
					boolean isClassExtensionByInheritance = isClassInheritsFromEmdeExtension(iClass);
					if (isClassExtensionByInheritance)
						resulClasses.add(iClass);
				}
			}
				
		}
		return resulClasses;
	}
	
	/**
	 * Check if a {@link Class} is an Emde extension by inheritance. This mean that it inherits from a 
	 * {@link Class} that {@link Class#getExtends()} is not empty
	 * @param clazz the {@link Class} to check
	 * @return True if the {@link Class} inherits from an Emde Extension
	 */
	private static boolean isClassInheritsFromEmdeExtension(Class clazz){
		final EList<AbstractSuperClass> inheritences = clazz.getInheritences();
		for (AbstractSuperClass aSuperClass : inheritences) 
		{
			if (aSuperClass instanceof LocalSuperClass)
			{
				final Class localSuperClass = ((LocalSuperClass) aSuperClass).getSuperClass();
				if (localSuperClass != null)
				{
					final EList<EClass> extendedClasses = localSuperClass.getExtends();
					if (extendedClasses != null )
					{
						if (! extendedClasses.isEmpty())
						{
							return true;
						}
						else
						{
							final boolean isSuperClassEmdeExtension = isClassInheritsFromEmdeExtension(localSuperClass);
							if (isSuperClassEmdeExtension)
								return true;
						}
					}
				}
			}
		}
		
		return false;
	}
	
	/**
	 * Update the content of a {@link ListViewer}
	 * @param listViewer {@link ListViewer} to update
	 * @param classList List of {@link Class}es to display in the {@link ListViewer}
	 */
	public static void updateListViewerContent(ListViewer listViewer, Collection<Class> classList){
		ISelection oldSelection = null;
		if (listViewer.getList().getItems().length > 0)
			oldSelection = listViewer.getSelection();
		
		listViewer.setInput(classList);
		listViewer.refresh();
		if (listViewer.getList().getItems().length > 0)
		{   // Select the element selected before, if it is always displayed
			int selectionNewIndex = getSelectionNewIndex(listViewer, (StructuredSelection)oldSelection);
			listViewer.setSelection(new StructuredSelection(listViewer.getElementAt(selectionNewIndex)), true);
		}
		
	}
	
	/**
	 * @param listViewer {@link ListViewer} to update it content
	 * @param oldSelection the {@link ListViewer} selected element before update 
	 * @return New index of the old selection, 0 otherwise.
	 */
	public static int getSelectionNewIndex(ListViewer listViewer, StructuredSelection oldSelection) {
		if (oldSelection != null)
		{
			Class clazz = (Class) oldSelection.getFirstElement();
			final int size = listViewer.getList().getItems().length;
			for (int i = 0; i < size; i++) 
			{
				Class iClass = (Class) listViewer.getElementAt(i);
				if (iClass.equals(clazz))
				{
					return i;
				}
			}
		}
		return 0;
	}
}
