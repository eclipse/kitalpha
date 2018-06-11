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
import java.util.HashSet;

/**
 * @author Faycal Abka
 */
public class ViewpointTreeDescription implements IViewpointTreeDescription {
	
	private String 		viewpointName;
	private String		viewpointId;
	private String		eRootPathFragment;
	
	
	private boolean		isToKeep;
	private Collection<IViewpointTreeDescription> children;
	private Collection<IViewpointTreeDescription> parents;
	private Collection<IViewpointTreeDescription> dependencies;
	private Collection<IViewpointTreeDescription> usedViewpoints;
	private Collection<String>					  nsUris;
	
	
	
	
	public ViewpointTreeDescription(
			String viewpointName,
			String viewpointId,
			String eRootPathFragment){
		
		super();
		
		this.viewpointName 		= viewpointName;
		this.viewpointId 		= viewpointId;
		this.eRootPathFragment 	= eRootPathFragment;
		this.isToKeep			= true;
		this.children  			= new HashSet<IViewpointTreeDescription>();
		this.parents 			= new HashSet<IViewpointTreeDescription>();
		this.dependencies 		= new HashSet<IViewpointTreeDescription>();
		this.usedViewpoints 	= new HashSet<IViewpointTreeDescription>();
		this.nsUris				= new HashSet<String>();
	}

	@Override
	public String getViewpointName() {
		return this.viewpointName;
	}

	@Override
	public String getViewpointId() {
		return this.viewpointId;
	}

	@Override
	public Collection<IViewpointTreeDescription> getChildren() {
		return this.children;
	}

	@Override
	public Collection<IViewpointTreeDescription> getDependencies() {
		return this.dependencies;
	}

	@Override
	public String getRootEObject() {
		return this.eRootPathFragment;
	}

	@Override
	public void addChild(IViewpointTreeDescription child) {
		if (this != child){
			getChildren().add(child);
		}
	}

	@Override
	public void addDependency(IViewpointTreeDescription dependency) {
		getDependencies().add(dependency);
	}

	@Override
	public boolean hasChildren() {
		return !getChildren().isEmpty();
	}

	@Override
	public boolean hasDependencies() {
		return !getDependencies().isEmpty();
	}

	@Override
	public Collection<IViewpointTreeDescription> getParents() {
		return this.parents;
	}

	//TODO checks if the current object is not in the parent/children list
	@Override
	public void addParent(IViewpointTreeDescription parent) {
		if (this != parent){
			getParents().add(parent);
		}
	}

	@Override
	public boolean hasParents() {
		return !getParents().isEmpty();
	}

	

	@Override
	public boolean isCandidateToKeep() {
		return this.isToKeep;
	}

	@Override
	public void setAsCandidateToKeep(boolean toKeep) {
		this.isToKeep = toKeep;
	}

	@Override
	public Collection<String> getViewpointNsUri() {
		return this.nsUris;
	}

	@Override
	public void addViewpointNsUri(String nsuri) {
		if (!getViewpointNsUri().contains(nsuri)){
			getViewpointNsUri().add(nsuri);
		}
	}

	@Override
	public void addAllViewpointNsUri(Collection<String> nsuri) {
		for (String uri : nsuri) {
			addViewpointNsUri(uri);
		}
	}

	@Override
	public Collection<IViewpointTreeDescription> getUsedViewpoints() {
		return this.usedViewpoints;
	}

	@Override
	public void addUsedViewpoint(IViewpointTreeDescription usedVpd) {
		if (!getUsedViewpoints().contains(usedVpd)){
			getUsedViewpoints().add(usedVpd);
		}
	}
	
	
	public Collection<IViewpointTreeDescription> getAllParent(){
		Collection<IViewpointTreeDescription> allParents = new HashSet<IViewpointTreeDescription>();
		
		for (IViewpointTreeDescription vpd : getParents()) {
			allParents.add(vpd);
			collectAllParent(vpd, allParents, this);
		}
		
		return allParents;
	}

	private void collectAllParent(IViewpointTreeDescription vpd,
			Collection<IViewpointTreeDescription> allParents, ViewpointTreeDescription checkedVpd) {
		
		if (vpd == null || allParents == null) {
			return;
		}
		
		for (IViewpointTreeDescription vpd_parent : vpd.getParents()) {
			if (vpd_parent == checkedVpd) {
				continue;
			}
			allParents.add(vpd_parent);
			collectAllParent(vpd_parent, allParents, checkedVpd);
		}
		
	}
	
	public Collection<IViewpointTreeDescription> getAllChildren(){
		Collection<IViewpointTreeDescription> allChildren = new HashSet<IViewpointTreeDescription>();
		
		for (IViewpointTreeDescription vpd : getChildren()) {
			allChildren.add(vpd);
			collectAllChildren(vpd, allChildren, this);
		}
		
		return allChildren;
	}

	private void collectAllChildren(IViewpointTreeDescription vpd,
			Collection<IViewpointTreeDescription> allChildren, ViewpointTreeDescription checkedVpd) {
		
		if (vpd == null || allChildren == null) {
			return;
		}
		
		for (IViewpointTreeDescription vpd_child : vpd.getChildren()) {
			if (vpd_child == checkedVpd) {
				continue;
			}
			allChildren.add(vpd_child);
			collectAllChildren(vpd_child, allChildren, checkedVpd);
		}
		
	}
	
	@Override
	public void updateCandidates(boolean toKeep){
		
		Collection<IViewpointTreeDescription> allChildren = getAllChildren();
		
		for (IViewpointTreeDescription child : allChildren) {
			child.setAsCandidateToKeep(toKeep);
		}
		
		Collection<IViewpointTreeDescription> allParents = getAllParent();
		if (toKeep && !allParents.isEmpty()){
			for (IViewpointTreeDescription parent : allParents) {
				parent.setAsCandidateToKeep(toKeep);
			}
		}
	}
}
