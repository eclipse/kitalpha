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

package org.polarsys.kitalpha.ad.services.detachment.core.utils.tree;

import java.util.Collection;

/**
 * Definition of hierarchical (inheritance) of viewpoint
 * 
 * @author Faycal Abka
 */
public interface IViewpointTreeDescription {
	
	/**
	 * Returns the name of the viewpoint (id)
	 */
	public String getViewpointName();
	
	/**
	 * Returns true if the viewpoint should be detached from the model.
	 * Otherwise, it returns false;
	 * 
	 */
	@Deprecated
	public boolean isCandidateToRemove();
	
	/**
	 * Returns true if the viewpoint will be kept in the model.
	 * Otherwise, it returns false;
	 * @return
	 */
	public boolean isCandidateToKeep();
	
	/**
	 * @param toRemove
	 */
	@Deprecated
	public void setAsCandidateToRemove(boolean toRemove);
	
	/**
	 * 
	 * @param toKeep true if the viewpoint will be kept, or false otherwise
	 */
	public void setAsCandidateToKeep(boolean toKeep);
	
	/**
	 * Returns VPID of the viewpoint
	 */
	public String getViewpointId();
	
	/**
	 * Returns the list of its children
	 */
	
	public Collection<IViewpointTreeDescription> getChildren();
	
	/**
	 * @return the NSURI of the current Viewpoint description
	 */
	public Collection<String> getViewpointNsUri();
	
	/**
	 * add an NSURI to current viewpoint description
	 * @param nsuri
	 */
	public void addViewpointNsUri(String nsuri);
	
	/**
	 * Add collection of NSURI
	 * @param nsuri
	 */
	public void addAllViewpointNsUri(Collection<String> nsuri);
	
	
	/**
	 * Returns the list of its parents
	 */
	public Collection<IViewpointTreeDescription> getParents();
	
	/**
	 * Returns the list of its dependencies
	 */
	public Collection<IViewpointTreeDescription> getDependencies();
	
	
	/**
	 * @return viewpoints description with imports
	 */
	public Collection<IViewpointTreeDescription> getUsedViewpoints();
	
	/**
	 * Add a new used viewpoint description
	 * @param usedVpd
	 */
	public void addUsedViewpoint(IViewpointTreeDescription usedVpd);
	
	/**
	 * Returns the path to the EMF root EObject of the viewpoint
	 * with the fragment of the viewpoint
	 */
	public String getRootEObject();
	
	/**
	 * Add a child to the list of children
	 */
	public void addChild(IViewpointTreeDescription child);
	
	/**
	 * Add a parent to the list of parents
	 */
	public void addParent(IViewpointTreeDescription parent);
	
	/**
	 * Add a dependecy to list of dependecies
	 */
	public void addDependency(IViewpointTreeDescription dependency);
	
	/**
	 * checks if the viewpoint has children
	 */
	public boolean hasChildren();
	
	/**
	 * Checks if the viewpoint has dependencies 
	 */
	public boolean hasDependencies();
	
	/**
	 * Checks if the viewpoint has parents
	 */
	public boolean hasParents();
	
	
	public void updateCandidates(boolean toKeep);
}
