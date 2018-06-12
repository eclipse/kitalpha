/*******************************************************************************
 * Copyright (c) 2014, 2018 Thales Global Services S.A.S.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *  Thales Global Services S.A.S - initial API and implementation
 ******************************************************************************/

package org.polarsys.kitalpha.model.common.share.ui.utilities.vp.tree;

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
	String getViewpointName();
	
	/**
	 * Returns true if the viewpoint will be kept in the model.
	 * Otherwise, it returns false;
	 * @return
	 */
	boolean isCandidateToKeep();
	
	
	/**
	 * 
	 * @param toKeep true if the viewpoint will be kept, or false otherwise
	 */
	void setAsCandidateToKeep(boolean toKeep);
	
	/**
	 * Returns VPID of the viewpoint
	 */
	String getViewpointId();
	
	/**
	 * Returns the list of its children
	 */
	
	Collection<IViewpointTreeDescription> getChildren();
	
	/**
	 * @return the NSURI of the current Viewpoint description
	 */
	Collection<String> getViewpointNsUri();
	
	/**
	 * add an NSURI to current viewpoint description
	 * @param nsuri
	 */
	void addViewpointNsUri(String nsuri);
	
	/**
	 * Add collection of NSURI
	 * @param nsuri
	 */
	void addAllViewpointNsUri(Collection<String> nsuri);
	
	
	/**
	 * Returns the list of its parents
	 */
	Collection<IViewpointTreeDescription> getParents();
	
	/**
	 * Returns the list of its dependencies
	 */
	Collection<IViewpointTreeDescription> getDependencies();
	
	
	/**
	 * @return viewpoints description with imports
	 */
	Collection<IViewpointTreeDescription> getUsedViewpoints();
	
	/**
	 * Add a new used viewpoint description
	 * @param usedVpd
	 */
	void addUsedViewpoint(IViewpointTreeDescription usedVpd);
	
	/**
	 * Returns the path to the EMF root EObject of the viewpoint
	 * with the fragment of the viewpoint
	 */
	String getRootEObject();
	
	/**
	 * Add a child to the list of children
	 */
	void addChild(IViewpointTreeDescription child);
	
	/**
	 * Add a parent to the list of parents
	 */
	void addParent(IViewpointTreeDescription parent);
	
	/**
	 * Add a dependecy to list of dependecies
	 */
	void addDependency(IViewpointTreeDescription dependency);
	
	/**
	 * checks if the viewpoint has children
	 */
	boolean hasChildren();
	
	/**
	 * Checks if the viewpoint has dependencies 
	 */
	boolean hasDependencies();
	
	/**
	 * Checks if the viewpoint has parents
	 */
	boolean hasParents();
	
	
	void updateCandidates(boolean toKeep);
}
