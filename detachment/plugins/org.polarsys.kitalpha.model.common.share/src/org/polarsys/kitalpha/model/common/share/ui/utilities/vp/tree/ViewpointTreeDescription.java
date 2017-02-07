/*******************************************************************************
 * Copyright (c) 2014, 2016 Thales Global Services S.A.S.
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

	public String getViewpointName() {
		return this.viewpointName;
	}

	public String getViewpointId() {
		return this.viewpointId;
	}

	public Collection<IViewpointTreeDescription> getChildren() {
		return this.children;
	}

	public Collection<IViewpointTreeDescription> getDependencies() {
		return this.dependencies;
	}

	public String getRootEObject() {
		return this.eRootPathFragment;
	}

	public void addChild(IViewpointTreeDescription child) {
		if (this != child){
			getChildren().add(child);
		}
	}

	public void addDependency(IViewpointTreeDescription dependency) {
		getDependencies().add(dependency);
	}

	public boolean hasChildren() {
		return !getChildren().isEmpty();
	}

	public boolean hasDependencies() {
		return !getDependencies().isEmpty();
	}

	public Collection<IViewpointTreeDescription> getParents() {
		return this.parents;
	}

	//TODO checks if the current object is not in the parent/children list
	public void addParent(IViewpointTreeDescription parent) {
		if (this != parent){
			getParents().add(parent);
		}
	}

	public boolean hasParents() {
		return !getParents().isEmpty();
	}

	

	public boolean isCandidateToKeep() {
		return this.isToKeep;
	}

	public void setAsCandidateToKeep(boolean toKeep) {
		this.isToKeep = toKeep;
	}

	public Collection<String> getViewpointNsUri() {
		return this.nsUris;
	}

	public void addViewpointNsUri(String nsuri) {
		if (!getViewpointNsUri().contains(nsuri)){
			getViewpointNsUri().add(nsuri);
		}
	}

	public void addAllViewpointNsUri(Collection<String> nsuri) {
		for (String uri : nsuri) {
			addViewpointNsUri(uri);
		}
	}

	public Collection<IViewpointTreeDescription> getUsedViewpoints() {
		return this.usedViewpoints;
	}

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
		
		if (vpd == null || allParents == null) return;
		
		for (IViewpointTreeDescription vpd_parent : vpd.getParents()) {
			if (vpd_parent == checkedVpd) continue;
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
		
		if (vpd == null || allChildren == null) return;
		
		for (IViewpointTreeDescription vpd_child : vpd.getChildren()) {
			if (vpd_child == checkedVpd) continue;
			allChildren.add(vpd_child);
			collectAllChildren(vpd_child, allChildren, checkedVpd);
		}
		
	}
	
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
