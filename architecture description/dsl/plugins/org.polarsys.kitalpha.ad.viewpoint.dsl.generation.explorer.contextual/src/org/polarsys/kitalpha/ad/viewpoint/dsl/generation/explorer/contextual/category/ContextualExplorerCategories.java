/*******************************************************************************
 * Copyright (c) 2014 Thales Global Services S.A.S.
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

/**
 * @author Boubekeur Zendagui
 */
public enum ContextualExplorerCategories {
	Parent(10),
	OwnedViewpointElement(20),
	OwnedExternalElement(30),
	ReferencedViewpointElement(40),
	ReferencedExternalElement(50),
	ReferencingViewpointElement(60);
	
	private int categoryId;
	
	/**
	 * Default constructor
	 * @param id
	 */
	private ContextualExplorerCategories(int id){
		categoryId = id;
	}
	
	/**
	 * 
	 * @return
	 * @throws ContextualExplorerCategoriesException
	 */
	public String getTargetExplorerID() throws ContextualExplorerCategoriesException{
		switch (categoryId) 
		{
			case 10:
			case 20:
			case 30:
				return "CurrentElementExplorer";
		
			case 40:
			case 50:
				return "ReferencedElementExplorer";
		
			case 60:
				return "ReferencingElementExplorer";
		}
		
		throw new ContextualExplorerCategoriesException();
	}
	
	/**
	 * 
	 * @return
	 * @throws ContextualExplorerCategoriesException
	 */
	public String getCategoryIdentifier() throws ContextualExplorerCategoriesException{
		switch (categoryId) 
		{
			case 10:
				return "Parent";
			case 20:
				return "OwnedViewpointElements";
			case 30:
				return "OwnedMelodyAdvanceElements";
			case 40:
				return "ReferencedViewpointElements";
			case 50:
				return "ReferencedMelodyAdvanceElements";
			case 60:
				return "ReferencingViewpointElements";
		}
		
		throw new ContextualExplorerCategoriesException();
	}
	
	/**
	 * 
	 * @return
	 * @throws ContextualExplorerCategoriesException
	 */
	public String getCategoryName() throws ContextualExplorerCategoriesException{
		switch (categoryId) 
		{
			case 10:
				return "Parent";
			case 20:
				return "Owned Viewpoint elements";
			case 30:
				return "Owned Melody Advance elements";
			case 40:
				return "Referenced viewpoint elements";
			case 50:
				return "Referenced Melody Advance elements";
			case 60:
				return "Referencing Viewpoint Element";
		}
		
		throw new ContextualExplorerCategoriesException();
	}
}
